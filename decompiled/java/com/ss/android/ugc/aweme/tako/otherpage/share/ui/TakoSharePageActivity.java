package com.ss.android.ugc.aweme.tako.otherpage.share.ui;

import X.C01GW;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C1862800yZi;
import X.C1863200yaM;
import X.C19EH;
import X.C2095008Iq;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.EnumC335920DEw;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS274S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoSharePageActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9JzEkLD0jHELIOSKSIpZzw7KTcpZzo6ZhEtIiAAICQ+LB8yLyANKjs6Piw4MA==";
    public final C01GW LL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(178), "enter_from", String.class);
    public final C01GW LLILLJJLI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(183), "share_id", String.class);
    public final C01GW LLILLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(180), "user_name", String.class);
    public final C01GW LLILZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(182), "process_id", String.class);
    public final C01GW LLILZIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(185), "tako_session_id", String.class);
    public final C01GW LLILZLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(184), "tako_chat_id", String.class);
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(179), "enter_method", String.class);
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(176), "bot_id", String.class);
    public final C01GW LLJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(177), "chat_bot_source", String.class);

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.share.ui.TakoSharePageActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.share.ui.TakoSharePageActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.share.ui.TakoSharePageActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.share.ui.TakoSharePageActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.share.ui.TakoSharePageActivity", "onWindowFocusChanged", true);
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
        Long lLJIILIIL;
        Integer numLJIIJJI;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.share.ui.TakoSharePageActivity", "onCreate", true);
        super.onCreate(bundle);
        activityConfiguration(AFwS274S0000000_30.get$arr$(181));
        setContentView(R.layout.fjc);
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        C1863200yaM c1863200yaM = TakoSharePageFragment.LLJJIJI;
        String str = (String) this.LL.getValue();
        String str2 = (String) this.LLIZ.getValue();
        String str3 = (String) this.LLILZ.getValue();
        String str4 = (String) this.LLILZIL.getValue();
        String str5 = (String) this.LLILZLL.getValue();
        String str6 = (String) this.LLILLL.getValue();
        String str7 = (String) this.LLILLJJLI.getValue();
        String str8 = (String) this.LLIZLLLIL.getValue();
        if (str8 != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(str8);
        } else {
            lLJIILIIL = null;
        }
        String str9 = (String) this.LLJ.getValue();
        if (str9 != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(str9);
        } else {
            numLJIIJJI = null;
        }
        C1862800yZi c1862800yZi = new C1862800yZi(str, str2, str3, str4, str5, str7, str6, lLJIILIIL, numLJIIJJI);
        c1863200yaM.getClass();
        TakoSharePageFragment takoSharePageFragment = new TakoSharePageFragment();
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJIZ(bundle2, "tako_share_enter_param", c1862800yZi);
        takoSharePageFragment.setArguments(bundle2);
        c19ehLJIIJ.LJIJ(R.id.iiv, takoSharePageFragment, null);
        c19ehLJIIJ.LJIIJ();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.share.ui.TakoSharePageActivity", "onCreate", false);
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
