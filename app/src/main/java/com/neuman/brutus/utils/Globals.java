package com.neuman.brutus.utils;

import android.app.ProgressDialog;
import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.github.ybq.android.spinkit.sprite.Sprite;
import com.github.ybq.android.spinkit.style.DoubleBounce;
import com.google.gson.JsonArray;
import com.neuman.brutus.R;
import com.neuman.brutus.fragments.AssetFragment;
import com.neuman.brutus.fragments.HomeFragment;
import com.neuman.brutus.fragments.MoreFragment;
import com.neuman.brutus.fragments.OrgFragment;
import com.neuman.brutus.fragments.SupplyFragment;
import com.neuman.brutus.fragments.TicketFragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Globals {

    public HashMap<String, Fragment> fragments = new HashMap<>();

    final public Fragment fr_home = new HomeFragment();
    final public Fragment fr_assets = new AssetFragment();
    final public Fragment fr_tickets = new TicketFragment();
    final public Fragment fr_org = new OrgFragment();
    final public Fragment fr_spares = new SupplyFragment();
    final public Fragment fr_more = new MoreFragment();

    public String cur = "";

    public Globals() {
        fragments.put("HOME", fr_home);
        fragments.put("ASSETS", fr_assets);
        fragments.put("TICKETS", fr_tickets);
        fragments.put("ORGANISATION", fr_org);
        fragments.put("SPARES", fr_spares);
        fragments.put("MORE", fr_more);
    }

    public void addFragments(FragmentManager fragmentManager) {
        for (Map.Entry<String, Fragment> el : fragments.entrySet()) { fragmentManager.beginTransaction().add(R.id.frag_container, el.getValue(), el.getKey()).hide(el.getValue()).commit(); }
    }

    public ProgressDialog progressDialog(Context context, Boolean cancelable) {
        Sprite doubleBounce = new DoubleBounce();
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setIndeterminateDrawable(doubleBounce);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(cancelable);
        return progressDialog;
    }

}

