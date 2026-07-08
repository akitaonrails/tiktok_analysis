package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry;

import X.C011Z;
import X.C1119850fFP;
import X.C1389600mGU;
import X.C19EH;
import X.C19GS;
import X.C497350Jev;
import X.C497360Jew;
import X.C497370Jex;
import X.C497740JfY;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.View;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsIndustrySelectActivity extends C19GS {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE1JzHELIOSAiLS4nISoiZzw2OjMlKiojJDA/ZyY9LDA/PT0qZhUvOgY9LDA/PT0qGyAgLCwnCSY4IDk6PDw=";

    static {
        new C497350Jev();
    }

    @Override // android.app.Activity
    public final void finish() {
        int i;
        int i2;
        super.finish();
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (C1389600mGU.LIZIZ(this)) {
            i = 0;
            i2 = 0;
        } else {
            i = R.anim.lp;
            i2 = R.anim.lx;
        }
        overridePendingTransition(i, i2);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (getSupportFragmentManager().LJJLIIIIJ() > 1) {
            getSupportFragmentManager().LJLLILLLL();
        } else {
            finish();
        }
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
        int i;
        int i2;
        int i3;
        String stringExtra;
        super.onCreate(bundle);
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (C1389600mGU.LIZIZ(this)) {
            i = 0;
            i2 = 0;
        } else {
            i = R.anim.lu;
            i2 = R.anim.lw;
        }
        overridePendingTransition(i, i2);
        C1119850fFP c1119850fFP = C011Z.LIZ;
        if (!getIntent().getBooleanExtra("is_from_opt_in", false) && c1119850fFP.LJIJ(this)) {
            c1119850fFP.getClass();
            i3 = R.style.uy;
        } else {
            c1119850fFP.getClass();
            i3 = R.style.v0;
        }
        getTheme().applyStyle(i3, true);
        setContentView(R.layout.fxh);
        boolean zLJJ = C497740JfY.LJJ();
        getWindow().getDecorView().setLayoutDirection(zLJJ ? 1 : 0);
        View viewFindViewById = findViewById(R.id.nwh);
        if (viewFindViewById != null) {
            viewFindViewById.setLayoutDirection(zLJJ ? 1 : 0);
        }
        if (bundle == null) {
            try {
                stringExtra = getIntent().getStringExtra("enter_from");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
            C497370Jex c497370Jex = PcsIndustrySelectFragment.LLJILJILJ;
            int intExtra = getIntent().getIntExtra("verification_status", 0);
            boolean booleanExtra = getIntent().getBooleanExtra("can_reselect", true);
            boolean booleanExtra2 = getIntent().getBooleanExtra("is_from_opt_in", false);
            boolean booleanExtra3 = getIntent().getBooleanExtra("guide_industry_verify", false);
            boolean booleanExtra4 = getIntent().getBooleanExtra("guide_industry_status_check", false);
            boolean booleanExtra5 = getIntent().getBooleanExtra("is_from_smb_management_redirect", false);
            C497360Jew c497360Jew = new C497360Jew(this);
            c497370Jex.getClass();
            PcsIndustrySelectFragment pcsIndustrySelectFragment = new PcsIndustrySelectFragment();
            pcsIndustrySelectFragment.LLJ = c497360Jew;
            Bundle bundle2 = new Bundle();
            C786410Ut5.LJJJI("enter_from", stringExtra, bundle2);
            bundle2.putInt("verification_status", intExtra);
            bundle2.putBoolean("can_reselect", booleanExtra);
            bundle2.putBoolean("is_from_opt_in", booleanExtra2);
            bundle2.putBoolean("guide_industry_verify", booleanExtra3);
            bundle2.putBoolean("guide_industry_status_check", booleanExtra4);
            bundle2.putBoolean("is_from_smb_management_redirect", booleanExtra5);
            pcsIndustrySelectFragment.setArguments(bundle2);
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.nwh, pcsIndustrySelectFragment, null);
            c19ehLJIIJ.LJIIIZ();
        }
    }
}
