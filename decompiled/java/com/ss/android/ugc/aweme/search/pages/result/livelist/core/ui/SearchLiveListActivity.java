package com.ss.android.ugc.aweme.search.pages.result.livelist.core.ui;

import X.C01GW;
import X.C0OM1;
import X.C0P9D;
import X.C0P9E;
import X.C0QER;
import X.C1237450iJ5;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C19EH;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C640270P9l;
import X.C654500Plo;
import X.EnumC335920DEw;
import X.InterfaceC639130P5b;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.livelist.core.viewmodel.SearchLiveListEnterParamViewModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLiveListActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2s+LDwmHELIOSJDFiJSYlLSklOjt9Kyo+LGEmIWsfLC4hKy0AIDk2BCw/PQ4wPCw6IDsq";
    public TuxNavBar LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 555));

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.result.livelist.core.ui.SearchLiveListActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.result.livelist.core.ui.SearchLiveListActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.result.livelist.core.ui.SearchLiveListActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.result.livelist.core.ui.SearchLiveListActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.result.livelist.core.ui.SearchLiveListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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
        Serializable serializableExtra;
        Serializable serializableExtra2;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.result.livelist.core.ui.SearchLiveListActivity", "onCreate", true);
        activityConfiguration(AFwS241S0000000_10.get$arr$(267));
        super.onCreate(bundle);
        setContentView(R.layout.esd);
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xzl);
            this.LL = (TuxNavBar) callbackFindViewById;
        }
        C0OM1 c0om1 = new C0OM1();
        C1237450iJ5.LIZ(c0om1, getString(2131822103), this);
        ((TuxNavBar) callbackFindViewById).setNavActions(c0om1);
        Intent intent = getIntent();
        if (intent != null && (serializableExtra = intent.getSerializableExtra("param_live_enter")) != null && (serializableExtra instanceof C654500Plo)) {
            C0P9D c0p9d = (C0P9D) this.LLILLJJLI.getValue();
            C654500Plo c654500Plo = (C654500Plo) serializableExtra;
            String searchKeyword = c654500Plo.getSearchKeyword();
            String str = "";
            if (searchKeyword == null) {
                searchKeyword = "";
            }
            c0p9d.LIZ(new C0P9E(searchKeyword, 2));
            SearchLiveListEnterParamViewModel searchLiveListEnterParamViewModel = (SearchLiveListEnterParamViewModel) ViewModelProviders.of(this).get(SearchLiveListEnterParamViewModel.class);
            searchLiveListEnterParamViewModel.getClass();
            searchLiveListEnterParamViewModel.LL = c654500Plo;
            Intent intent2 = getIntent();
            if (intent2 != null && (serializableExtra2 = intent2.getSerializableExtra("param_search_enter")) != null) {
                if (serializableExtra2 instanceof C0QER) {
                    C640270P9l.LIZ(null, this).yQ2(this, (C0QER) serializableExtra2, null);
                }
                SearchLiveFragment searchLiveFragment = new SearchLiveFragment();
                SearchResultParam searchResultParam = new SearchResultParam();
                searchResultParam.setKeyword(((InterfaceC639130P5b) this.LLILLJJLI.getValue()).getKeyword().LIZ);
                searchResultParam.setEnterMethod(c654500Plo.getEnterMethod());
                String fromSearchSubtag = c654500Plo.getFromSearchSubtag();
                if (fromSearchSubtag == null) {
                    fromSearchSubtag = "";
                }
                searchResultParam.setFromSearchSubtag(fromSearchSubtag);
                String preSearchId = c654500Plo.getPreSearchId();
                if (preSearchId != null) {
                    str = preSearchId;
                }
                searchResultParam.setPreSearchId(str);
                searchLiveFragment.LLJI = searchResultParam;
                C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
                c19ehLJIIJ.LJIJ(R.id.iiv, searchLiveFragment, "container");
                c19ehLJIIJ.LJIIJ();
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.result.livelist.core.ui.SearchLiveListActivity", "onCreate", false);
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
