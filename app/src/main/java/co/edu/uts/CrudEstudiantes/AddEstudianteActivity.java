package co.edu.uts.CrudEstudiantes;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import co.edu.uts.CrudEstudiantes.data.DataInfo;
import co.edu.uts.CrudEstudiantes.model.Estudiante;

public class AddEstudianteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_estudiante);
    }
    public void guardar(View view){
        TextView txtDocument = findViewById(R.id.txt_doc);
        TextView txtNombre = findViewById(R.id.txt_nom);
        TextView txtEmail = findViewById(R.id.txt_email);
        TextView txtCelular = findViewById(R.id.txt_cel);
        TextView txtCiudad = findViewById(R.id.txt_ciu);

        Long doc = Long.parseLong(txtDocument.getText().toString());
        String nom = txtNombre.getText().toString();
        String email = txtEmail.getText().toString();
        Long cel = Long.parseLong(txtCelular.getText().toString());
        String ciu = txtCiudad.getText().toString();
        Estudiante est = new Estudiante(doc, nom, email, cel, ciu);
        DataInfo.estudiantes.add(est);
        finish();
    }
    public void volver(View view){
        finish();
    }
}