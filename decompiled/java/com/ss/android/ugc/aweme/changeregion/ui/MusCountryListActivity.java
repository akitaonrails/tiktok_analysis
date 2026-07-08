package com.ss.android.ugc.aweme.changeregion.ui;

import X.C100C;
import X.C11JF;
import X.C11S5;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C1703880uRO;
import X.C1709830uaz;
import X.C1713190ugP;
import X.C1726210v1P;
import X.C1775980wJg;
import X.C21630619l2;
import X.C299020Bno;
import X.C335910DEv;
import X.C426750GoL;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.EnumC335920DEw;
import X.InterfaceC1710120ubS;
import Y.ACListenerS160S0100000_26;
import Y.AObjectS125S0000000_26;
import Y.AObserverS228S0100000_26;
import Y.AfS148S0200000_12;
import Y.AfS160S0200000_26;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.changeregion.api.RegionListAPI;
import com.ss.android.ugc.aweme.changeregion.sdk.model.Country;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes27.dex */
public class MusCountryListActivity extends BaseActivity {
    public static InterfaceC1710120ubS LLJI = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYkKCE0LTHELIOScpLiY8Jms5IGEePTYPJjo9PDc1BSYgPAQvPSYlITE1";
    public RecyclerView LL;
    public C21630619l2 LLILLJJLI;
    public final ArrayList<Country> LLILLL = new ArrayList<>();
    public final ArrayList<Country> LLILZ = new ArrayList<>();
    public EditText LLILZIL;
    public ImageView LLILZLL;
    public RegionListViewModel LLIZ;
    public C1709830uaz LLIZLLLIL;
    public DialogC1389620mGW LLJ;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.changeregion.ui.MusCountryListActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.changeregion.ui.MusCountryListActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.changeregion.ui.MusCountryListActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.changeregion.ui.MusCountryListActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.changeregion.ui.MusCountryListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        InterfaceC1710120ubS interfaceC1710120ubS = LLJI;
        if (interfaceC1710120ubS != null) {
            interfaceC1710120ubS.onExit();
        }
        C786410Ut5.J4(this.LLJ);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.changeregion.ui.MusCountryListActivity", "onCreate", true);
        activityConfiguration(new AObjectS125S0000000_26(1));
        super.onCreate(bundle);
        this.LLJ = new DialogC1389620mGW(this);
        this.LLIZ = (RegionListViewModel) ViewModelProviders.of(this).get(RegionListViewModel.class);
        C786410Ut5.J4(this.LLJ);
        RegionListViewModel regionListViewModel = this.LLIZ;
        regionListViewModel.getClass();
        RegionListAPI.LIZ.getClass();
        regionListViewModel.LLILLL = (C11JF) C1726210v1P.LIZIZ.getRegionList().LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new AfS160S0200000_26(this, regionListViewModel, 9), new AfS148S0200000_12(regionListViewModel, this, 75));
        this.LLIZ.LL.observe(this, new AObserverS228S0100000_26(this, 13));
        this.LLIZ.LLILLJJLI.observe(this, new AObserverS228S0100000_26(this, 14));
        setContentView(R.layout.dxi);
        this.LLILZIL = (EditText) findViewById(R.id.u9t);
        this.LLILZLL = (ImageView) findViewById(R.id.bn2);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.tv5);
        this.LL = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        C1709830uaz c1709830uaz = new C1709830uaz(this.LLILLL);
        this.LLIZLLLIL = c1709830uaz;
        this.LL.setAdapter(c1709830uaz);
        this.LLIZLLLIL.LLILZ = new C1703880uRO(this);
        C21630619l2 c21630619l2 = (C21630619l2) findViewById(R.id.vap);
        this.LLILLJJLI = c21630619l2;
        c21630619l2.setPosition(C426750GoL.LIZLLL(this) ? 1 : 0);
        this.LLILLJJLI.setTextColor(-7829368);
        this.LLILLJJLI.setOnSelectIndexItemListener(new C1713190ugP(this));
        if (this.LLILZIL != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.LLILZIL.getWindowToken(), 0);
        }
        this.LLILZIL.addTextChangedListener(new C1775980wJg(this, 12));
        C786410Ut5.Q7(this.LLILZLL, new ACListenerS160S0100000_26(this, 80));
        getWindow().setSoftInputMode(48);
        HashMap map = new HashMap();
        map.put("enter_from", "signup_login_page");
        C100C.LIZ.LIZJ().LIZ("region_selection_page_show", map);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.changeregion.ui.MusCountryListActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }
}
