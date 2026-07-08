package com.ss.android.ugc.aweme.tools.mvtemplate.mvpreview;

import X.AbstractActivityC19422710yn;
import X.C0TVI;
import X.C1308910kAL;
import X.C1424270nAP;
import X.C14K9;
import X.C1697810uHb;
import X.C214873197f;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import X.InterfaceC214877197j;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.scene.Scene;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public class TemplateFeedActivity extends AbstractActivityC19422710yn {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEjJiMgZig6PSo+HELIOSOCktPSp9JTM8OyolISA7Zxs2JTUgKDs2DiApLQ4wPCw6IDsq";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.mvtemplate.mvpreview.TemplateFeedActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.mvtemplate.mvpreview.TemplateFeedActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.mvtemplate.mvpreview.TemplateFeedActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.mvtemplate.mvpreview.TemplateFeedActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.mvtemplate.mvpreview.TemplateFeedActivity", "onWindowFocusChanged", true);
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

    @Override // X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.mvtemplate.mvpreview.TemplateFeedActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.ke);
        if (Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(findViewById(R.id.i9u), new C0TVI() { // from class: X.0DKt
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), c20246014Ju.LIZ(2).LIZLLL);
                    return c20246014Ju;
                }
            });
        }
        final C1424270nAP c1424270nAP = new C1424270nAP();
        try {
            bundle2 = getIntent().getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        c1424270nAP.mArguments = bundle2;
        final Class<C1424270nAP> cls = C1424270nAP.class;
        C214873197f c214873197f = new C214873197f(this, C1424270nAP.class);
        c214873197f.LJFF = R.id.i9u;
        c214873197f.LJIIIIZZ = "TemplateFeedActivity";
        c214873197f.LJI = false;
        c214873197f.LJII = new InterfaceC214877197j() { // from class: X.0HfZ
            @Override // X.InterfaceC214877197j
            public final Scene LIZ(ClassLoader classLoader, String str, Bundle bundle3) {
                if (TextUtils.equals(cls.getName(), str)) {
                    return c1424270nAP;
                }
                return null;
            }
        };
        c214873197f.LIZ();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.mvtemplate.mvpreview.TemplateFeedActivity", "onCreate", false);
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
