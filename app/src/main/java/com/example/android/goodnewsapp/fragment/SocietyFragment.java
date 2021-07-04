

package com.example.android.goodnewsapp.fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.loader.content.Loader;
import android.util.Log;

import com.example.android.goodnewsapp.News;
import com.example.android.goodnewsapp.NewsLoader;
import com.example.android.goodnewsapp.NewsPreferences;
import com.example.android.goodnewsapp.R;

import java.util.List;

public class SocietyFragment extends BaseArticlesFragment {

    private static final String LOG_TAG = SocietyFragment.class.getName();

    @NonNull
    @Override
    public Loader<List<News>> onCreateLoader(int i, Bundle bundle) {
        String societyUrl = NewsPreferences.getPreferredUrl(getContext(), getString(R.string.society));
        Log.e(LOG_TAG, societyUrl);

        return new NewsLoader(getActivity(), societyUrl);
    }
}
