package com.bytedance.ies.ugc.aweme.commercialize.splash.show;

import X.C1030990cw5;
import X.C1031070cwD;
import X.C1031100cwG;
import X.C1035180d2q;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C1AF0;
import X.C2214471Bll;
import X.C299020Bno;
import X.C335910DEv;
import X.C497270Jen;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC1035220d2u;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class NormalSplashAdActivity extends BaseActivity implements InterfaceC1035220d2u {
    public static final C1031070cwD LLILLJJLI = new C1031070cwD();
    public static int LLILLL = 0;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9PSIvZy4kLSgpZyw8JSgpOyw6KSklHELIOSMyp9OzUgKDw7ZjYkJjh9Bio+JC4/GzUgKDw7CSENKjs6Piw4MA==";
    public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        C1035180d2q.LJ = false;
        if (C1035180d2q.LJFF) {
            C1035180d2q.LJFF = false;
            synchronized (C1035180d2q.LJI) {
                try {
                    C1035180d2q.LJI.notifyAll();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        super.finish();
        if (LLILLL == 4) {
            C786410Ut5.ee(this, R.anim.g9);
        } else {
            C786410Ut5.ee(this, 0);
        }
        C1035180d2q.LIZLLL = false;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        BPEAHandler bPEAHandler = this.LL;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
        C1035180d2q.LIZLLL = false;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        super.onResume();
        C1031100cwG.LIZ().LJIIL();
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C1031070cwD c1031070cwD = LLILLJJLI;
        super.onCreate(bundle);
        C1031100cwG.LIZ().LJJI();
        try {
            setContentView(R.layout.jo);
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                getWindow().setAttributes(attributes);
            }
            View view = c1031070cwD.LIZ;
            C1030990cw5 c1030990cw5 = c1031070cwD.LIZIZ;
            if (c1030990cw5 != null) {
                c1030990cw5.LIZ = this;
            }
            c1031070cwD.LIZ = null;
            c1031070cwD.LIZIZ = null;
            if (view != null) {
                C497270Jen.LJFF(this);
                view.setBackgroundResource(R.drawable.d9l);
                ((ViewGroup) findViewById(R.id.vuw)).addView(view);
            } else {
                if (getIntent() != null) {
                    try {
                        getIntent().getStringExtra("from");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                finish();
                C786410Ut5.ee(this, 0);
            }
            C1035180d2q.LJ = true;
        } catch (RuntimeException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1AF0.LJ(e2);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("exception", e2.toString());
                C2214471Bll.LIZJ().monitorCommonLog("splash_set_content_view", jSONObject);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            c1031070cwD.LIZ = null;
            c1031070cwD.LIZIZ = null;
            finish();
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
}
