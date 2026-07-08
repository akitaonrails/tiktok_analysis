package com.ss.android.ugc.aweme.live;

import X.AbstractActivityC484150Iyj;
import X.AbstractC813200VvC;
import X.C01GW;
import X.C0JTA;
import X.C0JTI;
import X.C123100dR;
import X.C128Y;
import X.C1308910kAL;
import X.C13LP;
import X.C1697810uHb;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.EnumC335920DEw;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveContainerActivity extends AbstractActivityC484150Iyj {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiHELIOSklPyp9BCw6LAw8JjEtICE2OgQvPSYlITE1";
    public final List<String> LL = C1697810uHb.LJIIJJI("privilege_page", "pgc_privilege_page", "smb_optin_fragment_type");
    public final User LLILLJJLI = UserService.getInstance().user().LJIJJLI();
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(140));
    public String LLILZ = "";
    public String LLILZIL = "";
    public String LLILZLL = "";
    public String LLIZ = "";
    public Integer LLIZLLLIL = 0;
    public Integer LLJ = 0;
    public final C0JTA LLJI = new AbstractC813200VvC() { // from class: X.0JTA
        @Override // X.AbstractC813200VvC
        public final void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
            super.onFragmentStopped(fragmentManager, fragment);
            if (Intrinsics.LJFF(this.LL.LLILZ, "subscribe_info_list")) {
                this.LL.finish();
            }
        }
    };

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveContainerActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveContainerActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveContainerActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveContainerActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveContainerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final String LLLLZLL() {
        String str;
        if (C123100dR.LIZ(this.LLILZIL)) {
            str = this.LLILZIL;
            if (str == null) {
                return "";
            }
        } else {
            str = this.LLILZLL;
            if (str == null) {
                return "";
            }
        }
        return str;
    }

    @Override // X.AbstractActivityC484150Iyj, X.InterfaceC20573715ex
    public final boolean wy() {
        return C13LP.LJJJJ(this.LLILZ, this.LL);
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity
    public final boolean isDarkModeSupported() {
        String strLLLLZIL = LLLLZIL(getIntent(), "fragment_type");
        if (strLLLLZIL == null) {
            strLLLLZIL = "";
        }
        this.LLILZ = strLLLLZIL;
        return C13LP.LJJJJ(strLLLLZIL, this.LL);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        C0JTI c0jti;
        for (C128Y c128y : C13LP.LJLJJLL(getSupportFragmentManager().LJJLIIIJL())) {
            if ((c128y instanceof C0JTI) && (c0jti = (C0JTI) c128y) != null && c0jti.onBackPressed()) {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        getSupportFragmentManager().LLIILZL(this.LLJI);
        super.onDestroy();
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

    public static Bundle LLLLZI(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x073a, code lost:
    
        if (r6 == null) goto L321;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.LiveContainerActivity.onCreate(android.os.Bundle):void");
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

    public static String LLLLZIL(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
