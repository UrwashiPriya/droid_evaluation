package com.neuman.brutus.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.neuman.brutus.Home;
import com.neuman.brutus.R;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Response;

public class AssetFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view_ = inflater.inflate(R.layout.fragment_assets, container, false);
        return view_;
    }
}
