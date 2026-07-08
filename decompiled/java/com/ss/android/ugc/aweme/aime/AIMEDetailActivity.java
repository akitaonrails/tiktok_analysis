package com.ss.android.ugc.aweme.aime;

import X.C01GW;
import X.C1308910kAL;
import X.C1578630rBN;
import X.C1619690sFb;
import X.C1697810uHb;
import X.C19EH;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C627330Oj5;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC1399350mWD;
import X.InterfaceC1581830rGX;
import X.InterfaceC655270Pn3;
import X.InterfaceC744180THc;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import bsj.a5;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aime.model.FragmentInitParam;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class AIMEDetailActivity extends BaseActivity implements InterfaceC655270Pn3, InterfaceC1581830rGX, InterfaceC744180THc {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2HELIOSZiQlJCp9CQwBDAs2PCQlJQ4wPCw6IDsq";
    public final List<InterfaceC1399350mWD> LL = new ArrayList();
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(84));

    @Override // X.InterfaceC1581830rGX
    public final String getPageName() {
        return "aime_detial";
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aime.AIMEDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aime.AIMEDetailActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aime.AIMEDetailActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aime.AIMEDetailActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aime.AIMEDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC744180THc
    public final Analysis getAnalysis() {
        Analysis analysis = new Analysis();
        analysis.setLabelName("aime_detail_fragment_tag");
        analysis.setExt_value(0L);
        analysis.setValue(0L);
        return analysis;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        C1619690sFb.LIZ(this, null);
    }

    public final void init() {
        View viewFindViewById = findViewById(R.id.w0u);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
        String stringExtra = null;
        try {
            stringExtra = getIntent().getStringExtra("ids");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        try {
            String stringExtra2 = getIntent().getStringExtra("enter_from");
            if (stringExtra2 != null) {
                str = stringExtra2;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (!Intrinsics.LJFF(str, "aime_hub")) {
            ((MobModule) this.LLILLJJLI.getValue()).LIZJ("anchor");
        }
        Fragment fragmentLJJJJZI = supportFragmentManager.LJJJJZI("aime_detail_fragment_tag");
        if (fragmentLJJJJZI == null) {
            C627330Oj5 c627330Oj5 = AIMEDetailFragment.LLJIJIL;
            FragmentInitParam fragmentInitParam = new FragmentInitParam(stringExtra, str);
            c627330Oj5.getClass();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIZ(bundle, AIMEDetailFragment.LLJILJILJ, fragmentInitParam);
            fragmentLJJJJZI = new AIMEDetailFragment();
            fragmentLJJJJZI.setArguments(bundle);
        }
        RootPanelComponent rootPanelComponentLIZJ = C1578630rBN.LIZJ(fragmentLJJJJZI);
        if (rootPanelComponentLIZJ != null) {
            rootPanelComponentLIZJ.setUserVisibleHint(true);
        }
        c19ehLJIIJ.LJIJ(R.id.eqx, fragmentLJJJJZI, "aime_detail_fragment_tag");
        c19ehLJIIJ.LJIIIZ();
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aime.AIMEDetailActivity", "onCreate", true);
        activityConfiguration(AFwS259S0000000_21.get$arr$(51));
        super.onCreate(bundle);
        if (a5.LIZ()) {
            getWindow().addFlags(128);
        }
        setContentView(R.layout.om);
        init();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aime.AIMEDetailActivity", "onCreate", false);
    }

    @Override // X.InterfaceC655270Pn3
    public final void registerActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
        if (!((ArrayList) this.LL).contains(interfaceC1399350mWD)) {
            ((ArrayList) this.LL).add(interfaceC1399350mWD);
        }
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

    @Override // X.InterfaceC655270Pn3
    public final void unRegisterActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
        ((ArrayList) this.LL).remove(interfaceC1399350mWD);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19GS, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isDestroyed()) {
            return false;
        }
        Iterator it2 = ((ArrayList) this.LL).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC1399350mWD) it2.next()).onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }
}
