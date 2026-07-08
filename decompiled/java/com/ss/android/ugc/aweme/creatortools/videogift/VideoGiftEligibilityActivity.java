package com.ss.android.ugc.aweme.creatortools.videogift;

import X.AbstractC2126608Uu;
import X.C0CQT;
import X.C0OM1;
import X.C11IR;
import X.C11NJ;
import X.C11NZ;
import X.C11S5;
import X.C1235900iGa;
import X.C1237450iJ5;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C197039127h;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC1075900e6W;
import Y.ACListenerS151S0100000_16;
import Y.AfS132S0000000_7;
import Y.AfS185S0100000_16;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.IPrivacyDisclaimerUtil;
import com.ss.android.ugc.aweme.PrivacyDisclaimerUtilService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class VideoGiftEligibilityActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiY+LC4nJzc4JiA/O2s6HELIOSICs2JyIlLzt9HiwoLCAUISM4DCM6LywuICM6PDwNKjs6Piw4MA==";
    public TuxNavBar LL;
    public TuxTextView LLILLJJLI;
    public C197039127h LLILLL;
    public C1235900iGa LLILZ;
    public LinearLayout LLILZIL;
    public LinearLayout LLILZLL;
    public SmartImageView LLIZ;
    public boolean LLIZLLLIL;
    public final C11NJ LLJ = new C11NJ();
    public String LLJI = "";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final LinearLayout LLLLLZL() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.nwi);
            this.LLILZLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        this.LLJ.dispose();
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean booleanExtra;
        String stringExtra;
        C11NZ<VideoGiftEligibilityResponse> c11nzLIZ;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity", "onCreate", true);
        activityConfiguration(AFwS252S0000000_16.get$arr$(134));
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            booleanExtra = intent.getBooleanExtra("bundle_video_gift_enter_from_notification", false);
        } else {
            booleanExtra = false;
        }
        this.LLIZLLLIL = booleanExtra;
        Intent intent2 = getIntent();
        if (intent2 != null) {
            try {
                stringExtra = intent2.getStringExtra("bundle_video_gift_previous_page");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
        } else {
            stringExtra = "";
        }
        this.LLJI = stringExtra;
        supportRequestWindowFeature(10);
        setContentView(R.layout.f65);
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y1z);
            this.LL = (TuxNavBar) callbackFindViewById;
        }
        C0OM1 c0om1 = new C0OM1();
        C1237450iJ5.LIZIZ(c0om1, getString(2131858212), new AwS560S0100000_16(this, 1034));
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_question_mark_circle_ltr;
        c1251150ifB.LIZJ(new AwS551S0100000_7(this, 827));
        c0om1.LIZIZ(c1251150ifB);
        ((TuxNavBar) callbackFindViewById).setNavActions(c0om1);
        IPrivacyDisclaimerUtil iPrivacyDisclaimerUtilLJFF = PrivacyDisclaimerUtilService.LJFF();
        KeyEvent.Callback callbackFindViewById2 = this.LLILLJJLI;
        if (callbackFindViewById2 == null) {
            callbackFindViewById2 = findViewById(R.id.rut);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById2;
        }
        iPrivacyDisclaimerUtilLJFF.LJ(this, (TuxTextView) callbackFindViewById2, new ACListenerS151S0100000_16(iPrivacyDisclaimerUtilLJFF, this, 181), new ACListenerS151S0100000_16(iPrivacyDisclaimerUtilLJFF, this, 182), new ACListenerS151S0100000_16(iPrivacyDisclaimerUtilLJFF, this, 183));
        KeyEvent.Callback callbackFindViewById3 = this.LLILLL;
        if (callbackFindViewById3 == null) {
            callbackFindViewById3 = findViewById(R.id.yzg);
            this.LLILLL = (C197039127h) callbackFindViewById3;
        }
        C786410Ut5.U8((C197039127h) callbackFindViewById3, new ACListenerS151S0100000_16(this, 184));
        KeyEvent.Callback callbackFindViewById4 = this.LLILZ;
        if (callbackFindViewById4 == null) {
            callbackFindViewById4 = findViewById(R.id.ix0);
            this.LLILZ = (C1235900iGa) callbackFindViewById4;
        }
        C786410Ut5.LLLLIIL((C1235900iGa) callbackFindViewById4, 0);
        KeyEvent.Callback callbackFindViewById5 = this.LLILZIL;
        if (callbackFindViewById5 == null) {
            callbackFindViewById5 = findViewById(R.id.gy0);
            this.LLILZIL = (LinearLayout) callbackFindViewById5;
        }
        C786410Ut5.LJZL(8, (LinearLayout) callbackFindViewById5);
        this.LLJ.LJ();
        try {
            if (VideoGiftApi.LIZIZ == null) {
                VideoGiftApi.LIZIZ = (InterfaceC1075900e6W) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(InterfaceC1075900e6W.class);
            }
            c11nzLIZ = VideoGiftApi.LIZIZ.LIZ();
        } catch (ExecutionException e2) {
            TryCatchGuardChecker.doCheck(e2);
            AbstractC2126608Uu.getCompatibleException(e2);
            c11nzLIZ = C11IR.LL;
        }
        this.LLJ.LIZ(c11nzLIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS185S0100000_16(this, 55), new AfS132S0000000_7(this, 51)));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity", "onCreate", false);
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
