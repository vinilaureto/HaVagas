package com.vinilaureto.havagas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText nameEt;
    private EditText emailEt;
    private CheckBox emailListCb;
    private EditText phoneEt;
    private Button addSmartphoneBt;
    private LinearLayout smartphoneLl;
    private EditText smartphoneEt;
    private RadioButton mascRd;
    private RadioButton femRd;
    private Button removeSmartphoneBt;
    private CheckBox basicCb;
    private CheckBox mediumCb;
    private CheckBox graduationCb;
    private CheckBox specializationCb;
    private CheckBox masterCb;
    private CheckBox phdCb;
    private EditText jobsEt;

    private LinearLayout basicLl;
    private EditText basicYearEt;

    private LinearLayout mediumLl;
    private EditText mediumYearEt;

    private LinearLayout graduationLl;
    private EditText gradutionYearEt;
    private EditText gradutionInstitutionEt;

    private LinearLayout specializationLl;
    private EditText specializationYearEt;
    private EditText specializationInstitutionEt;

    private LinearLayout masterLl;
    private EditText masterYearEt;
    private EditText masterInstitutionEt;
    private EditText masterTesesEt;
    private EditText masterOrientationEt;

    private LinearLayout phdLl;
    private EditText phdYearEt;
    private EditText phdInstitutionEt;
    private EditText phdTesesEt;
    private EditText phdOrientationEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();


    }

    public void addSmartphoneClick(View view) {
        smartphoneLl.setVisibility(View.VISIBLE);
        addSmartphoneBt.setVisibility(View.GONE);
    }

    public void removeSmartphoneClick(View view) {
        smartphoneEt.setText("");
        smartphoneLl.setVisibility(View.GONE);
        addSmartphoneBt.setVisibility(View.VISIBLE);
    }

    public void basicCbClick(View view) {
        if (basicCb.isChecked()) {
            basicLl.setVisibility(View.VISIBLE);
        } else {
            basicLl.setVisibility(View.GONE);
            basicYearEt.setText("");
        }
    }

    public void mediumCbClick(View view) {
        if (mediumCb.isChecked()) {
            mediumLl.setVisibility(View.VISIBLE);
        } else {
            mediumLl.setVisibility(View.GONE);
            mediumYearEt.setText("");
        }
    }

    public void graduationCbClick(View view) {
        if (graduationCb.isChecked()) {
            graduationLl.setVisibility(View.VISIBLE);
        } else {
            graduationLl.setVisibility(View.GONE);
            gradutionYearEt.setText("");
            gradutionInstitutionEt.setText("");
        }
    }

    public void specializationCbClick(View view) {
        if (specializationCb.isChecked()) {
            specializationLl.setVisibility(View.VISIBLE);
        } else {
            specializationLl.setVisibility(View.GONE);
            specializationYearEt.setText("");
            specializationInstitutionEt.setText("");
        }
    }

    public void masterCbClick(View view) {
        if (masterCb.isChecked()) {
            masterLl.setVisibility(View.VISIBLE);
        } else {
            masterLl.setVisibility(View.GONE);
            masterYearEt.setText("");
            masterInstitutionEt.setText("");
            masterTesesEt.setText("");
            masterOrientationEt.setText("");
        }
    }

    public void phdCbClick(View view) {
        if (phdCb.isChecked()) {
            phdLl.setVisibility(View.VISIBLE);
        } else {
            phdLl.setVisibility(View.GONE);
            phdYearEt.setText("");
            phdInstitutionEt.setText("");
            phdTesesEt.setText("");
            phdOrientationEt.setText("");
        }
    }

    public void SaveData(View view) {
        User user = new User(nameEt.getText().toString(), emailEt.getText().toString(), emailListCb.isChecked(), phoneEt.getText().toString(), mascRd.isChecked(), jobsEt.getText().toString());

        if (smartphoneEt.getText().toString() != "") {
            user.setSmartphone(smartphoneEt.getText().toString());
        }

        if (basicCb.isChecked()) {
            Basic basic = new Basic(basicYearEt.getText().toString());
            user.addFormation(basic);
        }
        if (mediumCb.isChecked()) {
            Medium medium = new Medium(mediumYearEt.getText().toString());
            user.addFormation(medium);
        }
        if (graduationCb.isChecked()) {
            Graduation graduation = new Graduation(gradutionYearEt.getText().toString(), gradutionInstitutionEt.getText().toString());
            user.addFormation(graduation);
        }
        if (specializationCb.isChecked()) {
            Specialization specialization = new Specialization(specializationYearEt.getText().toString(), specializationInstitutionEt.getText().toString());
            user.addFormation(specialization);
        }
        if (masterCb.isChecked()) {
            Master master = new Master(masterYearEt.getText().toString(), masterInstitutionEt.getText().toString(), masterTesesEt.getText().toString(), masterOrientationEt.getText().toString());
            user.addFormation(master);
        }
        if (phdCb.isChecked()) {
            Phd phd = new Phd(phdYearEt.getText().toString(), phdInstitutionEt.getText().toString(), phdTesesEt.getText().toString(), phdOrientationEt.getText().toString());
            user.addFormation(phd);
        }
        Toast.makeText(this, user.toString(), Toast.LENGTH_LONG).show();

    }

    public void clearData(View view) {
        nameEt.setText("");
        emailEt.setText("");
        emailListCb.setChecked(false);
        phoneEt.setText("");
        removeSmartphoneClick(removeSmartphoneBt);
        mascRd.setChecked(true);
        femRd.setChecked(false);
        basicCb.setChecked(false);
        mediumCb.setChecked(false);
        graduationCb.setChecked(false);
        specializationCb.setChecked(false);
        masterCb.setChecked(false);
        phdCb.setChecked(false);
        basicCbClick(basicCb);
        mediumCbClick(mediumCb);
        graduationCbClick(graduationCb);
        specializationCbClick(specializationCb);
        masterCbClick(masterCb);
        phdCbClick(phdCb);
        jobsEt.setText("");
    }

    private void bindViews() {
        nameEt = findViewById(R.id.nameEt);
        emailEt = findViewById(R.id.emailEt);
        emailListCb = findViewById(R.id.emailListCb);
        phoneEt = findViewById(R.id.phoneEt);
        addSmartphoneBt = findViewById(R.id.addSmartphoneBt);
        smartphoneLl = findViewById(R.id.smatphoneLl);
        smartphoneEt = findViewById(R.id.smartphoneEt);
        removeSmartphoneBt = findViewById(R.id.removeSmartphoneBt);
        mascRd = findViewById(R.id.mascRd);
        femRd = findViewById(R.id.femRd);
        basicCb = findViewById(R.id.basicCb);
        mediumCb = findViewById(R.id.mediumCb);
        graduationCb = findViewById(R.id.graduationCb);
        specializationCb = findViewById(R.id.specializationCb);
        masterCb = findViewById(R.id.masterCb);
        phdCb = findViewById(R.id.phdCb);
        jobsEt = findViewById(R.id.jobsEt);

        basicLl = findViewById(R.id.basicLl);
        basicYearEt = findViewById(R.id.basicYearEt);

        mediumLl = findViewById(R.id.mediumLl);
        mediumYearEt = findViewById(R.id.mediumYearEt);

        graduationLl = findViewById(R.id.graduationLl);
        gradutionYearEt = findViewById(R.id.gradutionYearEt);
        gradutionInstitutionEt = findViewById(R.id.gradutionInstitutionEt);

        specializationLl = findViewById(R.id.specializationLl);
        specializationYearEt = findViewById(R.id.specializationYearEt);
        specializationInstitutionEt = findViewById(R.id.specializationInstitutionEt);

        masterLl = findViewById(R.id.masterLl);
        masterYearEt = findViewById(R.id.masterYearEt);
        masterInstitutionEt = findViewById(R.id.masterInstitutionEt);
        masterTesesEt = findViewById(R.id.masterTesesEt);
        masterOrientationEt = findViewById(R.id.masterOrientationEt);

        phdLl = findViewById(R.id.phdLl);
        phdYearEt = findViewById(R.id.phdYearEt);
        phdInstitutionEt = findViewById(R.id.phdInstitutionEt);
        phdTesesEt = findViewById(R.id.phdTesesEt);
        phdOrientationEt = findViewById(R.id.phdOrientationEt);
    }
}