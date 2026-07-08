package com.bytedance.pipo.kyc.singpass;

import X.C0PEM;
import X.C0WST;
import X.C0WSU;
import X.C0WWF;
import X.C0WWG;
import X.C0WZW;
import X.C0WZX;
import X.C1607950rwf;
import X.C1701330uNH;
import X.C1739500vMq;
import X.C1739550vMv;
import X.C1739570vMx;
import X.C19EG;
import X.C2193461Asy;
import X.C2193521At4;
import X.C2193571At9;
import X.C2193641AtG;
import X.C23250099c;
import X.InterfaceC1739510vMr;
import android.R;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoMiddleActivity extends C19EG {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs8ID88Zi41KmEgISHELIOSsrOS4gO2scID88BSwoLSM2CSY4IDk6PDw=";

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
    }

    @Override // X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C1739550vMv.LIZ = null;
        C1739550vMv.LIZIZ = null;
        C1739550vMv.LJ = null;
        C1739550vMv.LJI = null;
        C1739550vMv.LJFF = null;
        C1739550vMv.LIZJ = null;
    }

    @Override // X.C19EG, android.app.Activity
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

    public final void LLLLLZL(C1739500vMq c1739500vMq) {
        InterfaceC1739510vMr interfaceC1739510vMr = C1739550vMv.LIZ;
        if (interfaceC1739510vMr != null) {
            interfaceC1739510vMr.LIZ(null, c1739500vMq);
        }
        finish();
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        ComponentActivity componentActivity;
        super.onCreate(bundle);
        if (bundle == null) {
            C2193641AtG c2193641AtG = new C2193641AtG(getApplication());
            C2193461Asy c2193461Asy = C1739550vMv.LIZIZ;
            if (c2193461Asy != null) {
                C0WWF c0wwf = C1739550vMv.LIZJ;
                try {
                    C0WWG c0wwgLIZ = c2193641AtG.LIZJ.LIZ(c2193461Asy.LIZJ());
                    c0wwgLIZ.LIZJ = C1607950rwf.LIZIZ(R.anim.slide_in_left, R.anim.fade_out, getApplication()).LJFF();
                    c0wwgLIZ.LIZ.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", C1607950rwf.LIZIZ(R.anim.fade_in, R.anim.slide_out_right, getApplication()).LJFF());
                    C0WWF c0wwfLIZ = c0wwgLIZ.LIZ();
                    if (c0wwf == null) {
                        c0wwf = c0wwfLIZ;
                    }
                    Intent intentLIZIZ = c2193641AtG.LIZIZ(c2193461Asy, c0wwf);
                    if (intentLIZIZ != null) {
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(this, intentLIZIZ, "Activity_startActivityForResult_2");
                        C1701330uNH.LIZ(intentLIZIZ, this);
                        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyUb/aLhxwDT2MyJBhQ3B71Vb7zAN1ZCK/iiCQH9axheaT8BAE=", null);
                        C0WST c0wst = new C0WST();
                        int iIntValue = 1101;
                        Object[] objArr = {intentLIZIZ, 1101};
                        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
                        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11094, "com/bytedance/pipo/kyc/singpass/PipoMiddleActivity", "startActivityForResult", this, objArr, "void", c0wzw);
                        if (c0wsuLIZIZ.LIZ) {
                            c0wst.LIZ(11094, "com/bytedance/pipo/kyc/singpass/PipoMiddleActivity", "startActivityForResult", null, objArr, this, c0wzw, false);
                            return;
                        }
                        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                        if (objArr2 != null) {
                            Object obj = objArr2[0];
                            if (obj != null) {
                                componentActivity = (ComponentActivity) obj;
                            } else {
                                componentActivity = this;
                            }
                            Object obj2 = objArr2[1];
                            if (obj2 != null) {
                                intentLIZIZ = (Intent) obj2;
                            }
                            Object obj3 = objArr2[2];
                            if (obj3 != null) {
                                iIntValue = ((Integer) obj3).intValue();
                            }
                        } else {
                            componentActivity = this;
                        }
                        componentActivity.startActivityForResult(intentLIZIZ, iIntValue);
                        c0wst.LIZ(11094, "com/bytedance/pipo/kyc/singpass/PipoMiddleActivity", "startActivityForResult", null, objArr, componentActivity, c0wzw, true);
                        return;
                    }
                } catch (ActivityNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    LLLLLZL(new C1739500vMq(104, "fail to get auth code"));
                }
            }
            LLLLLZL(new C1739500vMq(108, "auth request data is missing"));
        }
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        String str2;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (intent != null) {
                C2193521At4 c2193521At4LIZIZ = C2193521At4.LIZIZ(intent);
                if (C2193571At9.fromIntent(intent) != null) {
                    LLLLLZL(new C1739500vMq(104, "fail to get auth code"));
                }
                if (c2193521At4LIZIZ == null || (str2 = c2193521At4LIZIZ.LIZLLL) == null || str2.length() == 0) {
                    LLLLLZL(new C1739500vMq(105, "auth code is empty"));
                }
                if (c2193521At4LIZIZ != null && (str = c2193521At4LIZIZ.LIZLLL) != null) {
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1739570vMx(this, str, null), 2);
                    return;
                }
                return;
            }
            LLLLLZL(new C1739500vMq(104, "fail to get auth code"));
            return;
        }
        LLLLLZL(new C1739500vMq(107, "user cancel"));
    }
}
