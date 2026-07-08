package com.ss.android.ugc.aweme.app;

import X.C1308910kAL;
import X.C1401820maC;
import X.C15OG;
import X.C15OR;
import X.C1697810uHb;
import X.C1766570w4V;
import X.C1896207bk;
import X.C21566519ah;
import X.C21566919al;
import X.C299020Bno;
import X.C335910DEv;
import X.C830060WhI;
import X.DialogInterfaceOnCancelListenerC1401970maR;
import X.DialogInterfaceOnClickListenerC1401980maS;
import X.EnumC335920DEw;
import Y.AObjectS122S0000000_21;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public class PushCameraBlurActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiHELIOSQ8OWEDPTYkCi4+LTctCyMmOgQvPSYlITE1";
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public String LLILZ;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLLLLZL() {
        if (this.LLILLJJLI) {
            RecordConfig.Builder builder = new RecordConfig.Builder();
            builder.showStickerPanel(true);
            builder.shootWay("camera_blur");
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService(this, "camera_blur", new C1401820maC(builder.build(), this, 1));
            return;
        }
        if (!this.LLILLL || C830060WhI.LIZ(this.LLILZ)) {
            return;
        }
        C15OG c15og = new C15OG();
        c15og.LJIIL = new C15OR() { // from class: X.0mWH
            @Override // X.C15OR
            public final void onFailed() {
                this.LIZ.finish();
            }

            @Override // X.C15OR
            public final void onSuccess() {
                this.LIZ.finish();
            }
        };
        c15og.LIZLLL(this.LLILZ, this, "push");
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
        String stringExtra;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onCreate", true);
        activityConfiguration(new AObjectS122S0000000_21(0));
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.LL = intent.getBooleanExtra("show_dialog", false);
        this.LLILLJJLI = intent.getBooleanExtra("show_effect", false);
        this.LLILLL = intent.getBooleanExtra("show_duet", false);
        try {
            stringExtra = intent.getStringExtra("aid");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        this.LLILZ = stringExtra;
        if (stringExtra == null) {
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onCreate", false);
            return;
        }
        if (this.LL) {
            setContentView(R.layout.ka);
            C21566919al c21566919al = new C21566919al(this);
            c21566919al.LJFF(2131838802);
            c21566919al.LIZ(2131838800);
            c21566919al.LJII(2131835160, new DialogInterfaceOnClickListenerC1401980maS(this, 1), false);
            c21566919al.LJIIJ(2131826403, new DialogInterfaceOnClickListenerC1401980maS(this, 0), false);
            c21566919al.LJ = new DialogInterfaceOnCancelListenerC1401970maR(this, 3);
            c21566919al.LJII = true;
            new C21566519ah(c21566919al).LIZLLL();
            C1766570w4V c1766570w4V = C1766570w4V.LIZ;
            C1896207bk c1896207bk = new C1896207bk(this);
            c1766570w4V.getClass();
            C1766570w4V.LIZ(c1896207bk);
        } else {
            LLLLLZL();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onCreate", false);
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
