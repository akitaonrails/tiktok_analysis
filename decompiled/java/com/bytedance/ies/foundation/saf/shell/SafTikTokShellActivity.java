package com.bytedance.ies.foundation.saf.shell;

import X.AbstractC1563340qmi;
import X.C098200Yq;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C189200o6;
import X.C199Y;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import X.EnumC682280QpW;
import X.InterfaceC214902198i;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;

/* JADX INFO: loaded from: classes11.dex */
public final class SafTikTokShellActivity extends C199Y {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9Lio5JysyPCwjJ2EgKSHELIOSNiOic2JCliGi41HCwnHSA4Gy0pJSMSKzElPyYnMQ==";
    public Class<? extends InterfaceC214902198i> LLILLJJLI;
    public boolean LL = true;
    public boolean LLILLL = true;
    public final boolean LLILZ = true;
    public final boolean LLILZIL = true;
    public final int LLILZLL = 4080;

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
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

    @Override // X.C199Y
    public final int getConfigChangesAllowList() {
        return this.LLILZLL;
    }

    @Override // X.C199Y
    public final boolean getDispatchOnNewIntentByScene() {
        return this.LLILZIL;
    }

    @Override // X.C199Y
    public final boolean getEnableNavigation() {
        return this.LLILLL;
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public final boolean getEnableSAF() {
        return this.LL;
    }

    @Override // X.C199Y
    public final boolean getEnableUseNavigationSceneWindowFocusChangedDispatch() {
        return this.LLILZ;
    }

    @Override // X.C199Y
    public final Class<? extends InterfaceC214902198i> getRootFragmentClz() {
        return this.LLILLJJLI;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19FO, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) getLifecycle();
        EnumC682280QpW.Companion.getClass();
        abstractC1563340qmi.LIZLLL(EnumC682280QpW.enableAll);
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws JSONException {
        Object c098200Yq;
        Object obj = null;
        try {
            String stringExtra = getIntent().getStringExtra("rootFragmentClassName");
            if (stringExtra != null) {
                try {
                    c098200Yq = Class.forName(stringExtra);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj = c098200Yq;
                }
                Class<? extends InterfaceC214902198i> cls = (Class) obj;
                if (cls != null) {
                    this.LLILLJJLI = cls;
                    super.onCreate(bundle);
                    return;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        finish();
        this.LL = false;
        this.LLILLL = false;
        super.onCreate(bundle);
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
