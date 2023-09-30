package com.example.calculator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CalculatorFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CalculatorFragment extends Fragment {
    private TextView etFirst , etFinal;
    private Button btnAC,btnPrecent,btnBack,btnPlusMinus,btnDot,btnEqual,btnMinus,btnPlus,btnDivide,btnTimes,btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CalculatorFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CalculatorFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CalculatorFragment newInstance(String param1, String param2) {
        CalculatorFragment fragment = new CalculatorFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calculator, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        btn0 = getView().findViewById(R.id.btn0Calculator);
        btn1 = getView().findViewById(R.id.btn1Calculator);
        btn2 = getView().findViewById(R.id.btn2Calculator);
        btn3 = getView().findViewById(R.id.btn3Calculator);
        btn4 = getView().findViewById(R.id.btn4Calculator);
        btn5 = getView().findViewById(R.id.btn5Calculator);
        btn6 = getView().findViewById(R.id.btn6Calculator);
        btn7 = getView().findViewById(R.id.btn7Calculator);
        btn8 = getView().findViewById(R.id.btn8Calculator);
        btn9 = getView().findViewById(R.id.btn9Calculator);
        btnAC = getView().findViewById(R.id.btnACCalculator);
        btnPlusMinus = getView().findViewById(R.id.btnPlusMinusCalculator);
        btnBack = getView().findViewById(R.id.btnBackCalculator);
        btnTimes = getView().findViewById(R.id.btnTimesCalculator);
        btnDivide = getView().findViewById(R.id.btnDivideCalculator);
        btnPlus = getView().findViewById(R.id.btnPlusCalculator);
        btnMinus = getView().findViewById(R.id.btnMinusCalculator);
        btnEqual = getView().findViewById(R.id.btnEqualCalculator);
        btnDot = getView().findViewById(R.id.btnDotCalculator);
        btnPrecent = getView().findViewById(R.id.btnPrecentCalculator);
        etFirst = getView().findViewById(R.id.etViewCalculator);
        Double num = Double.parseDouble(etFirst.getText().toString());

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

    }
}