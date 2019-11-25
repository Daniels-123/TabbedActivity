package com.dybcatering.tabbedactivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Tab3Fragment extends Fragment {
	public static final String TAG = "Tab3Fragment";

	private Button btnTest;

	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.tab3_fragment, container, false);


		btnTest = view.findViewById(R.id.btn_test3);

		btnTest.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(getActivity(), "Prueba de testing tercer boton", Toast.LENGTH_SHORT).show();
			}
		});
		return view;
	}
}
