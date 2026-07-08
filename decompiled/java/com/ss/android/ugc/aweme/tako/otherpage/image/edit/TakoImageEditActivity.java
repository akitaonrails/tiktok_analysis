package com.ss.android.ugc.aweme.tako.otherpage.image.edit;

import X.C01GW;
import X.C1254880ilC;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C1854260yLw;
import X.C19EH;
import X.C20189513zB;
import X.C299020Bno;
import X.C335910DEv;
import X.C426750GoL;
import X.C786410Ut5;
import X.EnumC335920DEw;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoImageEditActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9JzEkLD0jHELIOSKSIpZyY+KSIpZyo3ITFiHS44JwwhKCg2DSElPQ4wPCw6IDsq";
    public final C01GW LL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS269S0000000_27.get$arr$(279), "tako_bottom_up", Boolean.class);
    public final C01GW LLILLJJLI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS269S0000000_27.get$arr$(280), "tako_image_edit_default_input", String.class);

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.image.edit.TakoImageEditActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.image.edit.TakoImageEditActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.image.edit.TakoImageEditActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.image.edit.TakoImageEditActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.image.edit.TakoImageEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        if (Intrinsics.LJFF(this.LL.getValue(), Boolean.TRUE)) {
            C1254880ilC.LIZ.getClass();
            C1254880ilC.LIZ(this, false, 10);
        }
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
        int i;
        boolean zBooleanValue = true;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.image.edit.TakoImageEditActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.fjf);
        C1254880ilC c1254880ilC = C1254880ilC.LIZ;
        if (Intrinsics.LJFF(this.LL.getValue(), Boolean.TRUE)) {
            i = 7;
        } else {
            i = 0;
        }
        c1254880ilC.getClass();
        C1254880ilC.LIZ(this, true, i);
        C1854260yLw c1854260yLw = C1854260yLw.LIZ;
        Boolean bool = (Boolean) this.LL.getValue();
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        String str = (String) this.LLILLJJLI.getValue();
        c1854260yLw.getClass();
        TakoImageEditFragment takoImageEditFragment = new TakoImageEditFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("tako_bottom_up", zBooleanValue);
        C786410Ut5.LJJJI("tako_image_edit_default_input", str, bundle2);
        takoImageEditFragment.setArguments(bundle2);
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJJ(((Number) C1854260yLw.LIZ(zBooleanValue, C426750GoL.LIZLLL(this)).getFirst()).intValue(), ((Number) C1854260yLw.LIZ(zBooleanValue, C426750GoL.LIZLLL(this)).getSecond()).intValue());
        c19ehLJIIJ.LIZIZ(R.id.x3p, takoImageEditFragment);
        c19ehLJIIJ.LJII(null);
        c19ehLJIIJ.LJIIJ();
        C1854260yLw.LJIIJJI = null;
        C1854260yLw.LJIIJ = null;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.image.edit.TakoImageEditActivity", "onCreate", false);
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C20189513zB.LIZ.LJII(i, i2, this, intent);
    }
}
