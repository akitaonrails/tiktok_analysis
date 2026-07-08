package com.ss.android.ugc.aweme.donation.webpage;

import X.C1037750d6z;
import X.C1041660dDI;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C2202241BHa;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class DonationWebPageDialogActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiEjJy4nISoiZzg2HELIOSKjUtLip9DCoiKDs6JysbLC0DKSIpDSYyJCorCCwnITMlPTY=";
    public C1041660dDI LL;
    public C2202241BHa LLILLJJLI;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        C2202241BHa c2202241BHa = this.LLILLJJLI;
        if (c2202241BHa == null || !c2202241BHa.LIZIZ()) {
            super.onBackPressed();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.ao);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity", "onCreate", true);
        activityConfiguration(AFwS252S0000000_16.get$arr$(135));
        super.onCreate(bundle);
        setContentView(R.layout.bnh);
        overridePendingTransition(R.anim.an, 0);
        C1041660dDI c1041660dDILIZIZ = C1037750d6z.LIZIZ(getIntent());
        this.LL = c1041660dDILIZIZ;
        String str = c1041660dDILIZIZ.LIZ.LIZIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1041660dDI c1041660dDI = this.LL;
        C1041660dDI c1041660dDI2 = null;
        if (c1041660dDI == null) {
            c1041660dDI = null;
        }
        String str3 = c1041660dDI.LIZ.LJ;
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("enterFrom", str3);
        C1041660dDI c1041660dDI3 = this.LL;
        if (c1041660dDI3 != null) {
            c1041660dDI2 = c1041660dDI3;
        }
        String str4 = c1041660dDI2.LIZJ.LJ;
        if (str4 != null) {
            str2 = str4;
        }
        linkedHashMap.put("title", str2);
        C2202241BHa c2202241BHa = new C2202241BHa(this, str, linkedHashMap);
        this.LLILLJJLI = c2202241BHa;
        c2202241BHa.LIZJ();
        C2202241BHa c2202241BHa2 = this.LLILLJJLI;
        if (c2202241BHa2 != null) {
            c2202241BHa2.LLIZLLLIL = new AwS560S0100000_16(this, 726);
        }
        SystemClock.elapsedRealtime();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity", "onCreate", false);
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
