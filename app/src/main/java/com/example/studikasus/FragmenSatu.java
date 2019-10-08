package com.example.studikasus;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmenSatu extends Fragment {
   /* view adalah tipe data
   * maka harus di buat dulu objek view yaitu thio
   * */
    View thio;
    EditText edt;
    Button btn;
    TextView tv;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        thio = inflater.inflate(R.layout.activity_fragmen_satu,container,false);
        edt = thio.findViewById(R.id.editText1);
        btn = thio.findViewById(R.id.btn1);
        tv = thio.findViewById(R.id.textView1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = edt.getText().toString(); /*inputan sudah di ambil di variabel input*/
                input = input.toLowerCase(); /*supaya huruf kecil semua (normalisasi)*/
                String[] arrayInput = input.split(" "); /*split berdasarkan huruf apa*/
                String hasil = "";
                for (int i = arrayInput.length-1; i > 0 ; i--) /*variabel index = o , dia akan berulang selama dia kurang dari array input*/
                {
                    System.out.println(arrayInput[i]);
                    if(arrayInput[i].equals("bohong")){
                        arrayInput[i-1] = malek(arrayInput[i]);
                    }
                    hasil = arrayInput[0];
                }
                tv.setText(hasil);
            }
        });
       /* cara untuk memanggil tampilan fragmen*/
        return thio;

    }

    public String malek (String inputan)
    {
        String result = " ";
        if (inputan.equals("bohong") ) /*KHUSUS STRING ITU EQUALS BUKAN ==*/
        {
            result = "jujur";
        }else
        {
            result = "bohong";
        }
    return result;
    }
}
