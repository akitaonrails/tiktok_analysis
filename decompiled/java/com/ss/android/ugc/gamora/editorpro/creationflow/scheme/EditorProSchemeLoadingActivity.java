package com.ss.android.ugc.gamora.editorpro.creationflow.scheme;

import X.C1308910kAL;
import X.C1697810uHb;
import X.C23250099c;
import X.C2486609om;
import X.C259800zU;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class EditorProSchemeLoadingActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWspLSYnJzc8OyB9KzcpKDs6JyHELIOSsqJSAkZjYvISo+LWsJLSYnJzccOyAAKy0pJCofJyQoICE0CSY4IDk6PDw=";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.gamora.editorpro.creationflow.scheme.EditorProSchemeLoadingActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.gamora.editorpro.creationflow.scheme.EditorProSchemeLoadingActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.gamora.editorpro.creationflow.scheme.EditorProSchemeLoadingActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.gamora.editorpro.creationflow.scheme.EditorProSchemeLoadingActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.gamora.editorpro.creationflow.scheme.EditorProSchemeLoadingActivity", "onWindowFocusChanged", true);
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
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        ActivityAgent.onTrace("com.ss.android.ugc.gamora.editorpro.creationflow.scheme.EditorProSchemeLoadingActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.c1a);
        try {
            stringExtra = getIntent().getStringExtra("type");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (Intrinsics.LJFF(stringExtra, "ep_ai_link")) {
            try {
                stringExtra2 = getIntent().getStringExtra("ep_ai_scene");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            try {
                stringExtra3 = getIntent().getStringExtra("ep_ai_enter_source");
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            CreativeInfo creativeInfo = new CreativeInfo(null, 0, null, 7, null);
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = "";
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2486609om(creativeInfo, this, stringExtra3, stringExtra2, null, c259800zU), 3);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.gamora.editorpro.creationflow.scheme.EditorProSchemeLoadingActivity", "onCreate", false);
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
