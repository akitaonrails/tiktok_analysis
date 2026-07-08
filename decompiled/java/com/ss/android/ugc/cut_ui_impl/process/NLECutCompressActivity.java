package com.ss.android.ugc.cut_ui_impl.process;

import X.AnonymousClass1476;
import X.C0L8K;
import X.C0L8N;
import X.C0L8S;
import X.C0L8Y;
import X.C0WZX;
import X.C1389600mGU;
import X.C19W7;
import X.C2107808No;
import X.C2169008ee;
import X.C2204961BRm;
import X.C23118094a;
import X.C23250099c;
import X.C352570Drz;
import X.C377010EqJ;
import X.C536830L3p;
import X.C537920L7u;
import X.C537930L7v;
import X.C539510LDx;
import X.C559870LxZ;
import X.C785410UrT;
import X.C786410Ut5;
import X.InterfaceC497601wk;
import X.InterfaceC559900Lxc;
import X.ProgressDialogC1397780mTg;
import Y.ACListenerS143S0100000_8;
import Y.ARunnableS108S0100000_8;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.cutsame.cut_android.NLETemplateSource;
import com.bytedance.ies.cutsame.effectfetcher.TemplateSourceConfig;
import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes9.dex */
public class NLECutCompressActivity extends AnonymousClass1476 implements InterfaceC497601wk {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiY5PRAmIRolJD8/ZjHELIOSU+Jiw2OzZiBwMWCzA4CiA+ODcpOjwSKzElPyYnMQ==";
    public ProgressDialogC1397780mTg LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public String LLIZ;
    public Intent LLIZLLLIL;
    public NLETemplateSource LLJI;
    public String LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public final CoroutineContext LL = C2107808No.LIZ.plus(C23118094a.LIZ());
    public final double LLILLJJLI = 0.2d;
    public final long LLILLL = 500;
    public boolean LLJ = true;
    public final ARunnableS108S0100000_8 LLJILLL = new ARunnableS108S0100000_8(this, 123);

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        this.LLJ = false;
        super.onPause();
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity", "onStart", false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static {
        C2169008ee.LIZ.LIZ();
        NLE.loadNLELibrary$default(NLE.INSTANCE, false, false, false, 7, null);
        InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
        C559870LxZ.LIZLLL();
    }

    public final void cancel() {
        C0L8N.LIZ.getValue().getClass();
        C539510LDx.LIZ.getClass();
        VEEditor vEEditor = C539510LDx.LIZIZ;
        if (vEEditor != null) {
            vEEditor.LJIILIIL();
        }
        C0L8Y c0l8y = (C0L8Y) C0L8N.LIZIZ.getValue();
        c0l8y.LIZ = true;
        C352570Drz c352570Drz = c0l8y.LIZIZ;
        if (c352570Drz != null) {
            c352570Drz.LIZ();
        }
        ProgressDialogC1397780mTg progressDialogC1397780mTg = this.LLILZ;
        if (progressDialogC1397780mTg == null) {
            progressDialogC1397780mTg = null;
        }
        progressDialogC1397780mTg.dismiss();
        C785410UrT.LIZ(progressDialogC1397780mTg);
        Intent intent = new Intent();
        intent.putExtra("cut_compress_start_time", getIntent().getLongExtra("cut_compress_start_time", 0L));
        intent.putExtra("cut_compress_error", this.LLIZ);
        intent.putExtra("cut_compress_code", -10002);
        C2204961BRm.Q(this, 0, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3ssaFgmb9Whbo/CkiLJOHSBUISPwzAVQHmh5RRRicpvNEKzGPvXPQ/ICg==", null));
        finish();
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        ((Handler) C536830L3p.LIZ.getValue()).removeCallbacks(this.LLJILLL);
        C23118094a.LIZJ(this.LL, null);
        ProgressDialogC1397780mTg progressDialogC1397780mTg = this.LLILZ;
        ProgressDialogC1397780mTg progressDialogC1397780mTg2 = progressDialogC1397780mTg != null ? progressDialogC1397780mTg : null;
        progressDialogC1397780mTg2.dismiss();
        C785410UrT.LIZ(progressDialogC1397780mTg2);
        NLETemplateSource nLETemplateSource = this.LLJI;
        if (nLETemplateSource != null) {
            nLETemplateSource.LIZLLL();
        }
        super.onDestroy();
    }

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() throws Throwable {
        ActivityAgent.onTrace("com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity", "onResume", true);
        super.onResume();
        this.LLJ = true;
        Intent intent = this.LLIZLLLIL;
        if (intent != null) {
            LLLLLZL(intent);
        }
        this.LLIZLLLIL = null;
        ActivityAgent.onTrace("com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity", "onResume", false);
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        try {
            C1389600mGU.LIZIZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        overridePendingTransition(0, 0);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        cancel();
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
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

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LL;
    }

    public final void LLLLLZL(Intent intent) throws Throwable {
        intent.putExtra("cut_compress_start_time", getIntent().getLongExtra("cut_compress_start_time", 0L));
        intent.putExtra("arg_template_nle_model_cached_id", 0L);
        C2204961BRm.Q(this, -1, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3ssaFgmb9Whbo/CkiLJOHSBUISPwzAVQHmh5RRRicpvNEKzGPvXPQ/ICg==", null));
        finish();
    }

    public final void j3(int i) {
        if (this.LLILZIL < i && i <= 100) {
            C23250099c.LIZLLL(this, C2107808No.LIZ, null, new C0L8S(this, i, null), 2);
            this.LLILZIL = i;
            ARunnableS108S0100000_8 aRunnableS108S0100000_8 = this.LLJILLL;
            C377010EqJ c377010EqJ = C536830L3p.LIZ;
            ((Handler) c377010EqJ.getValue()).removeCallbacks(aRunnableS108S0100000_8);
            C786410Ut5.LJLIIL(1000L, (Handler) c377010EqJ.getValue(), this.LLJILLL);
        }
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        ActivityAgent.onTrace("com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity", "onCreate", true);
        super.onCreate(bundle);
        try {
            C1389600mGU.LIZIZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        overridePendingTransition(0, 0);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        C19W7 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.LJFF();
        }
        ProgressDialogC1397780mTg progressDialogC1397780mTgLIZIZ = ProgressDialogC1397780mTg.LIZIZ(this, getString(2131830067));
        this.LLILZ = progressDialogC1397780mTgLIZIZ;
        ACListenerS143S0100000_8 aCListenerS143S0100000_8 = new ACListenerS143S0100000_8(this, 133);
        ImageView imageView = (ImageView) progressDialogC1397780mTgLIZIZ.findViewById(R.id.jz7);
        if (imageView != null) {
            C786410Ut5.Q7(imageView, aCListenerS143S0100000_8);
        }
        ProgressDialogC1397780mTg progressDialogC1397780mTg = this.LLILZ;
        if (progressDialogC1397780mTg == null) {
            progressDialogC1397780mTg = null;
        }
        ImageView imageView2 = (ImageView) progressDialogC1397780mTg.findViewById(R.id.jz7);
        if (imageView2 != null) {
            C786410Ut5.LJZI(0, imageView2);
        }
        ProgressDialogC1397780mTg progressDialogC1397780mTg2 = this.LLILZ;
        if (progressDialogC1397780mTg2 == null) {
            progressDialogC1397780mTg2 = null;
        }
        progressDialogC1397780mTg2.setProgress(0);
        C537930L7v c537930L7vLIZ = C537920L7u.LIZ(getIntent());
        if (c537930L7vLIZ == null) {
            c537930L7vLIZ = null;
        }
        CutSource cutSource = (CutSource) getIntent().getParcelableExtra("arg_cut_source");
        try {
            stringExtra = getIntent().getStringExtra("zip_md5");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        TemplateSourceConfig templateSourceConfig = (TemplateSourceConfig) getIntent().getParcelableExtra("template_config");
        if (c537930L7vLIZ != null) {
            C23250099c.LIZLLL(this, null, null, new C0L8K(cutSource, this, templateSourceConfig, stringExtra, c537930L7vLIZ, null), 3);
        } else {
            finish();
        }
        ARunnableS108S0100000_8 aRunnableS108S0100000_8 = this.LLJILLL;
        C377010EqJ c377010EqJ = C536830L3p.LIZ;
        ((Handler) c377010EqJ.getValue()).removeCallbacks(aRunnableS108S0100000_8);
        C786410Ut5.LJLIIL(1000L, (Handler) c377010EqJ.getValue(), this.LLJILLL);
        ActivityAgent.onTrace("com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity", "onCreate", false);
    }
}
