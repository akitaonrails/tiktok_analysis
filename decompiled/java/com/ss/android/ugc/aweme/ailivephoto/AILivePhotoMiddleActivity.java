package com.ss.android.ugc.aweme.ailivephoto;

import X.C01GW;
import X.C0LEC;
import X.C0LZK;
import X.C0LZM;
import X.C0LZR;
import X.C0PEM;
import X.C1308910kAL;
import X.C168Q;
import X.C1697810uHb;
import X.C19EH;
import X.C19F0;
import X.C21505619Eg;
import X.C2296808zG;
import X.C23250099c;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C560480LyY;
import X.EnumC335920DEw;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ailivephoto.AILivePhotoMiddleActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes9.dex */
public final class AILivePhotoMiddleActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQlJSYlLTHELIOSUkJjs8ZgQFBSYlLRUkJjs8BSwoLSM2CSY4IDk6PDw=";
    public final C01GW LL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(58));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(59));
    public C19F0<Intent> LLILLL;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ailivephoto.AILivePhotoMiddleActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ailivephoto.AILivePhotoMiddleActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ailivephoto.AILivePhotoMiddleActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ailivephoto.AILivePhotoMiddleActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ailivephoto.AILivePhotoMiddleActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        C560480LyY.LIZ(this, new AwS552S0100000_8(this, 34));
    }

    public final void LLLLLZL() {
        Bundle extras;
        if (getSupportFragmentManager().LJJJJZ(R.id.iiv) == null) {
            AILivePhotoMiddleFragment aILivePhotoMiddleFragment = new AILivePhotoMiddleFragment();
            try {
                extras = getIntent().getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
            aILivePhotoMiddleFragment.setArguments(extras);
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZIZ(R.id.iiv, aILivePhotoMiddleFragment);
            c19ehLJIIJ.LJII(null);
            c19ehLJIIJ.LJIIJ();
        }
    }

    public final void init() {
        Bundle extras;
        String strLIZ;
        String strLIZ2;
        try {
            extras = getIntent().getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            extras = null;
        }
        String string = extras != null ? extras.getString("business_type") : null;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("aigc_business_type_prefix_match_killswitch", false) ? !(Intrinsics.LJFF(string, "EFFECT_AIGC_I2V") || Intrinsics.LJFF(string, "EFFECT_AIGC_FL2V") || Intrinsics.LJFF(string, "EFFECT_AIGC_I2I") || Intrinsics.LJFF(string, "EFFECT_AIGC_CLOUD_EDITING") || Intrinsics.LJFF(string, "EFFECT_AIGC_CLOUD_EDITING_M2")) : !(string != null && u.LJJIIJZLJL(string, "EFFECT_AIGC_", false))) {
            LLLLLZL();
            return;
        }
        Intent intent = getIntent();
        String strLIZ3 = C0LEC.LIZ(intent, "business_type");
        if (strLIZ3 == null || (strLIZ = C0LEC.LIZ(intent, "server_task_id")) == null || (strLIZ2 = C0LEC.LIZ(intent, "enter_from")) == null) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0LZM(new C0LZK(strLIZ3, strLIZ, strLIZ2, Intrinsics.LJFF(C0LEC.LIZ(intent, "is_success"), "1"), C0LEC.LIZ(intent, "results")), this, null), 3);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C19F0<Intent> c19f0 = this.LLILLL;
        if (c19f0 != null) {
            c19f0.LIZIZ();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (!C0LZR.LIZ() && !isFinishing() && !isDestroyed()) {
            finish();
        }
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ailivephoto.AILivePhotoMiddleActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.s8);
        this.LLILLL = registerForActivityResult(new C21505619Eg(), new C168Q() { // from class: X.0LZe
            @Override // X.C168Q
            public final void LIZ(Object obj) {
                AILivePhotoMiddleActivity aILivePhotoMiddleActivity = this.LIZ;
                C2419809e0.LIZ(aILivePhotoMiddleActivity, new AwS552S0100000_8(aILivePhotoMiddleActivity, 53));
            }
        });
        init();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ailivephoto.AILivePhotoMiddleActivity", "onCreate", false);
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
