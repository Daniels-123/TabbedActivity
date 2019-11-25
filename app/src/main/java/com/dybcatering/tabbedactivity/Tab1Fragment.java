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

	import com.pierfrancescosoffritti.youtubeplayer.player.AbstractYouTubePlayerListener;
	import com.pierfrancescosoffritti.youtubeplayer.player.YouTubePlayer;
	import com.pierfrancescosoffritti.youtubeplayer.player.YouTubePlayerInitListener;
	import com.pierfrancescosoffritti.youtubeplayer.player.YouTubePlayerView;

public class Tab1Fragment extends Fragment {
		public static final String TAG = "Tab1Fragment";

		private Button btnTest;

		@Nullable
		@Override
		public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
			final View view = inflater.inflate(R.layout.tab1_fragment, container, false);


			btnTest = view.findViewById(R.id.btn_test1);

			btnTest.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {

					Toast.makeText(getActivity(), "Prueba de testing", Toast.LENGTH_SHORT).show();
				}
			});
			return view;
		}



	}
