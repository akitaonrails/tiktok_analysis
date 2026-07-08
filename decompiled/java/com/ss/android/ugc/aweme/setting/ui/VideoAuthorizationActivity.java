package com.ss.android.ugc.aweme.setting.ui;

import X.C01GW;
import X.C0OM1;
import X.C11NJ;
import X.C11S5;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1390410mHn;
import X.C13LE;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C19286110cl;
import X.C19472111Gd;
import X.C197039127h;
import X.C19EG;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.EnumC335920DEw;
import X.InterfaceC19472011Gc;
import Y.AObserverS208S0100000_4;
import Y.AObserverS231S0100000_29;
import Y.AfS140S0200000_4;
import Y.AfS198S0100000_29;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.setting.ui.vm.VideoAuthorizationViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class VideoAuthorizationActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpPTs6JiHELIOSJiPCZ9HiwoLCASPTEkJj06MiQ4ICA9CSY4IDk6PDw=";
    public TuxNavBar LL;
    public ScrollView LLILLJJLI;
    public LinearLayout LLILLL;
    public TuxIconView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public SmartImageView LLJ;
    public ConstraintLayout LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public C197039127h LLJILLL;
    public C197039127h LLJJ;
    public C1390410mHn LLJJI;
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS573S0100000_29(this, 195));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 196));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 194));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 197));
    public final C19286110cl LLJJJ = new C19286110cl(C13LE.LIZ(VideoAuthorizationViewModel.class), new AwS573S0100000_29((C19EG) this, 199), new AwS573S0100000_29((C19EG) this, 198));

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.VideoAuthorizationActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.VideoAuthorizationActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.VideoAuthorizationActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.VideoAuthorizationActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.VideoAuthorizationActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final int LLLLLZL() {
        return ((Number) this.LLJJIJIIJIL.getValue()).intValue();
    }

    public final C197039127h LLLLZI() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b7h);
            this.LLJILLL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final String LLLLZIL() {
        return (String) this.LLJJIII.getValue();
    }

    public final LinearLayout LLLLZLL() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ccd);
            this.LLILLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final String LLLLZLLIL() {
        return (String) this.LLJJIJI.getValue();
    }

    public final long LLLLZLLLI() {
        return ((Number) this.LLJJIJIL.getValue()).longValue();
    }

    public final TuxTextView LLLZ() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q8s);
            this.LLJILJILJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C197039127h LLLZIL() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.t42);
            this.LLJJ = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final VideoAuthorizationViewModel LLLZLZ() {
        return (VideoAuthorizationViewModel) this.LLJJJ.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((C11NJ) LLLZLZ().LLILZLL.getValue()).LJ();
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

    public static String LLLZZIL(long j) {
        return new BDDateFormat("l").LIZIZ(j * ((long) LSPassThroughRecordSizeConfig.DEFAULT), Locale.getDefault());
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.VideoAuthorizationActivity", "onCreate", true);
        activityConfiguration(AFwS273S0000000_29.get$arr$(101));
        super.onCreate(bundle);
        setContentView(R.layout.km);
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.p15);
            this.LL = (TuxNavBar) callbackFindViewById;
        }
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS573S0100000_29(this, 869));
        c0om1.LJ(c1251150ifB);
        ((TuxNavBar) callbackFindViewById).setNavActions(c0om1);
        LLLZLZ().LL.observe(this, new AObserverS231S0100000_29(this, 140));
        LLLZLZ().LLILLL.observe(this, new AObserverS231S0100000_29(this, 141));
        LLLZLZ().LLILZIL.observe(this, new AObserverS208S0100000_4(this, 8));
        VideoAuthorizationViewModel videoAuthorizationViewModelLLLZLZ = LLLZLZ();
        String strLLLLZIL = LLLLZIL();
        String strLLLLZLLIL = LLLLZLLIL();
        int iLLLLLZL = LLLLLZL();
        long jLLLLZLLLI = LLLLZLLLI();
        videoAuthorizationViewModelLLLZLZ.LL.setValue(Boolean.TRUE);
        InterfaceC19472011Gc.LIZ.getClass();
        ((C11NJ) videoAuthorizationViewModelLLLZLZ.LLILZLL.getValue()).LIZ(C19472111Gd.LIZIZ.getValue().LIZIZ(strLLLLZIL, strLLLLZLLIL, iLLLLLZL, jLLLLZLLLI).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS198S0100000_29(videoAuthorizationViewModelLLLZLZ, 26), new AfS140S0200000_4(this, videoAuthorizationViewModelLLLZLZ, 8)));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.VideoAuthorizationActivity", "onCreate", false);
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
