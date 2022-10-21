package com.fieb.browseimoveis01;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class BrowseLogin extends AppCompatActivity {

    Button botaoLogin;
    Button botaoCadastro;
    FirebaseAuth mAuth;
    EditText caixaEmail;
    EditText caixaSenha;
    String email;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_login);

        getSupportActionBar().hide();

        IniciarComponents();

        botaoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email = caixaEmail.getText().toString();
                password = caixaSenha.getText().toString();

                if (email.isEmpty() || email == null) {
                    Snackbar.make(caixaEmail, "DIGITE UM EMAIL CADASTRADO!",
                            Snackbar.LENGTH_LONG).show();

                } else if (password.isEmpty() || password == null) {
                    Snackbar.make(caixaEmail, "DIGITE UMA SENHA VÁLIDA!",
                            Snackbar.LENGTH_LONG).show();
                } else {
                    // fazer o login firebase
                    mAuth.signInWithEmailAndPassword(email, password)
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        // Sign in success, update UI with the signed-in user's information
                                        Log.d(TAG, "signInWithEmail:success");
                                        FirebaseUser user = mAuth.getCurrentUser();
                                        trocaJanela(user);
                                    } else {
                                        // If sign in fails, display a message to the user.
                                        Log.w(TAG, "signInWithEmail:failure", task.getException());
                                        Toast.makeText(getApplicationContext(), "Authentication failed.",
                                                Toast.LENGTH_SHORT).show();
                                        trocaJanela(null);
                                    }
                                }
                            });


                }

            }
        });

        botaoCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(BrowseLogin.this, CadastroActivity.class);
                startActivity(it);
            }
        });

    }

    private void trocaJanela(Object o) {
        if (o != null) {
            Intent it = new Intent(BrowseLogin.this, MainSegundaTelaActivity.class);
            it.putExtra("email", email);
            startActivity(it);
        } else {
            Snackbar.make(caixaEmail, "USUÁRIO OU SENHA NÃO EXISTEM OU INVÁLIDOS!",
                    Snackbar.LENGTH_LONG).show();
        }
    }

    private void IniciarComponents() {
        botaoLogin = findViewById(R.id.bt_entrar);

        botaoCadastro = findViewById(R.id.bt_cadastro);

        caixaEmail = findViewById(R.id.edit_email);

        caixaSenha = findViewById(R.id.edit_eye);

        mAuth = FirebaseAuth.getInstance();


    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null) {
            currentUser.reload();
        }
    }

}