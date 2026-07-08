package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.commonhost;

import X.C1389600mGU;
import X.C19GS;
import X.C20441214yg;
import X.C786410Ut5;
import X.InterfaceC1294060jmO;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes5.dex */
public final class CommonMixPageActivity extends C19GS {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZygyJSBiOS4hPCspOzw7ITViHELIOSJCYrJCQ1JjonZic5OiY9LTY/Zyc8OzFiKiA+JSoiISAgPGsPJiI+JysBIDcDKSIpCCwnITMlPTY=";

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @InterfaceC1294060jmO
    public final void onBackPressed() {
        finish();
        try {
            C1389600mGU.LIZIZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        overridePendingTransition(0, 0);
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

    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        String stringExtra = null;
        getWindow().setEnterTransition(null);
        getWindow().setExitTransition(null);
        super.onCreate(bundle);
        setContentView(R.layout.fxa);
        try {
            stringExtra = getIntent().getStringExtra("schema");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        try {
            String stringExtra2 = getIntent().getStringExtra("extra");
            if (stringExtra2 != null) {
                str = stringExtra2;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (stringExtra.length() == 0) {
            C20441214yg.LJ("CommonMixPageActivity", "schema is empty");
            finish();
        }
        CommonMixPageFragment commonMixPageFragment = new CommonMixPageFragment();
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJJI("schema", stringExtra, bundle2);
        C786410Ut5.LJJJI("extra", str, bundle2);
        commonMixPageFragment.setArguments(bundle2);
        commonMixPageFragment.show(getSupportFragmentManager(), "common_mix_page");
    }
}
