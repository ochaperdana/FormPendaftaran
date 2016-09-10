package id.sch.smktelkom_mlg.tugas01.xirpl1025.formpendaftaran;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNama, etTempat, etTanggal;
    TextView tvHasil;
    Button buttonRegister;
    RadioGroup rgJK;
    CheckBox cbTOEFL, cbTOEIC, cbReg, cbIntr;
    Spinner spKelas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
