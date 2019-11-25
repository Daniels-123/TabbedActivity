package com.dybcatering.tabbedactivity;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionsPageAdapter extends FragmentPagerAdapter {

	private final List<Fragment> mfragmentList = new ArrayList<>();
	private final List<String> mfragmentTitleList = new ArrayList<>();


	public void addFragment(Fragment fragment, String title	){
		mfragmentList.add(fragment);
		mfragmentTitleList.add(title);
	}

	public SectionsPageAdapter(FragmentManager fm) {
		super(fm);
	}


	@Nullable
	@Override
	public CharSequence getPageTitle(int position) {
		return mfragmentTitleList.get(position);
	}

	@Override
	public Fragment getItem(int position) {
		return mfragmentList.get(position);
	}

	@Override
	public int getCount() {
		return mfragmentList.size() ;
	}
}
