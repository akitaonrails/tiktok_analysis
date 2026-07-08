package com.ss.android.ugc.aweme.duet.ui;

import X.C1308910kAL;
import X.C1697810uHb;
import X.C19EH;
import X.C20684815ws;
import X.C2344009Gk;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.EnumC335920DEw;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS237S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class DuetDetailActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiHELIOSE5LDt9PSxiDTo2PAEpPS46JAQvPSYlITE1";
    public HashMap<String, String> LLIZ;
    public String LL = "";
    public String LLILLJJLI = "";
    public String LLILLL = "";
    public String LLILZ = "";
    public String LLILZIL = "";
    public String LLILZLL = "";
    public final long LLIZLLLIL = System.currentTimeMillis();

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.duet.ui.DuetDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.duet.ui.DuetDetailActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.duet.ui.DuetDetailActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.duet.ui.DuetDetailActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.duet.ui.DuetDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void init() throws Throwable {
        String strLLLLLZL = LLLLLZL(getIntent(), "enter_method");
        if (strLLLLLZL == null) {
            strLLLLLZL = "";
        }
        this.LLILLJJLI = strLLLLLZL;
        String strLLLLLZL2 = LLLLLZL(getIntent(), "enter_from");
        if (strLLLLLZL2 == null) {
            strLLLLLZL2 = "";
        }
        this.LL = strLLLLLZL2;
        String strLLLLLZL3 = LLLLLZL(getIntent(), FollowStatusChangeMethod.PARAM_UID);
        if (strLLLLLZL3 == null) {
            strLLLLLZL3 = "";
        }
        this.LLILLL = strLLLLLZL3;
        String strLLLLLZL4 = LLLLLZL(getIntent(), "origin_item_id");
        if (strLLLLLZL4 == null) {
            strLLLLLZL4 = "";
        }
        this.LLILZ = strLLLLLZL4;
        String strLLLLLZL5 = LLLLLZL(getIntent(), "author_id");
        if (strLLLLLZL5 == null) {
            strLLLLLZL5 = "";
        }
        this.LLILZIL = strLLLLLZL5;
        String strLLLLLZL6 = LLLLLZL(getIntent(), "group_id");
        this.LLILZLL = strLLLLLZL6 != null ? strLLLLLZL6 : "";
        if (getIntent().getSerializableExtra("anchor_event_map") instanceof HashMap) {
            this.LLIZ = (HashMap) getIntent().getSerializableExtra("anchor_event_map");
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
        Fragment fragmentLJJJJZI = supportFragmentManager.LJJJJZI("duet_detail_fragment_tag");
        if (fragmentLJJJJZI == null) {
            String str = DuetDetailFragment._pnsPageId;
            String str2 = this.LLILLL;
            String str3 = this.LLILZ;
            String str4 = this.LL;
            String str5 = this.LLILLJJLI;
            String str6 = this.LLILZIL;
            String str7 = this.LLILZLL;
            fragmentLJJJJZI = new DuetDetailFragment();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("origin_item_id", str3, bundle);
            C786410Ut5.LJJJI("enter_from", str4, bundle);
            C786410Ut5.LJJJI("enter_method", str5, bundle);
            C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, str2, bundle);
            C786410Ut5.LJJJI("author_id", str6, bundle);
            C786410Ut5.LJJJI("from_group_id", str7, bundle);
            C786410Ut5.LJJJI("detail_aweme_from", str4, bundle);
            fragmentLJJJJZI.setArguments(bundle);
        }
        fragmentLJJJJZI.setUserVisibleHint(true);
        c19ehLJIIJ.LJIJ(R.id.eqx, fragmentLJJJJZI, "duet_detail_fragment_tag");
        c19ehLJIIJ.LJIIIZ();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(System.currentTimeMillis() - this.LLIZLLLIL, "duration");
        c2344009Gk.LJI(this.LLIZ);
        C20684815ws.LJIILLIIL("anchor_stay_time", c2344009Gk.LIZ);
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
    public final void onCreate(Bundle bundle) throws Throwable {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.duet.ui.DuetDetailActivity", "onCreate", true);
        activityConfiguration(AFwS237S0000000_7.get$arr$(64));
        super.onCreate(bundle);
        setContentView(R.layout.ftk);
        init();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.duet.ui.DuetDetailActivity", "onCreate", false);
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

    public static String LLLLLZL(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
