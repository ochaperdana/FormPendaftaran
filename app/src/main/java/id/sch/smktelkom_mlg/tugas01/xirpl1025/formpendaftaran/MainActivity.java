package id.sch.smktelkom_mlg.tugas01.xirpl1025.formpendaftaran;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
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
        etNama = (EditText) findViewById(R.id.editTextNama);
        etTanggal = (EditText) findViewById(R.id.editTextTgl);
        etTempat = (EditText) findViewById(R.id.editTextTempat);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        rgJK = (RadioGroup) findViewById(R.id.RadioGroupJK);
        cbTOEFL = (CheckBox) findViewById(R.id.checkBoxTOEFL);
        cbTOEIC = (CheckBox) findViewById(R.id.checkBoxTOEIC);
        cbIntr = (CheckBox) findViewById(R.id.checkBoxIntr);
        cbReg = (CheckBox) findViewById(R.id.checkBoxReg);
        spKelas = (Spinner) findViewById(R.id.spinnerKelas);
        buttonRegister = (Button) findViewById(R.id.buttonRegister);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View view) {
                                                  String nama = etNama.getText().toString();
                                                  String tempat = etTempat.getText().toString();
                                                  String tanggal = etTanggal.getText().toString();
                                                  String hasil = null;
                                                  if (rgJK.getCheckedRadioButtonId() != -1) {
                                                      RadioButton rb = (RadioButton) findViewById(rgJK.getCheckedRadioButtonId());
                                                      hasil = rb.getText().toString();
                                                  }
                                                  String output = "\nPilihan Kelas       : ";
                                                  int startlen = output.length();
                                                  if (cbTOEFL.isChecked())
                                                      output += cbTOEFL.getText();
                                                  if (cbTOEIC.isChecked())
                                                      output += cbTOEIC.getText();
                                                  if (cbIntr.isChecked())
                                                      output += cbIntr.getText();
                                                  if (cbReg.isChecked()) output += cbReg.getText();
                                                  tvHasil.setText("Nama                    : " + nama +
                                                          "\nTempat Lahir       : " + tempat +
                                                          "\nTanggal Lahir      : " + tanggal +
                                                          "\nJenis Kelamin     : " + hasil +
                                                          output +
                                                          "\nPilihan Waktu      : " + spKelas.getSelectedItem().toString());
                                              }
                                          }
        );
    }
}
