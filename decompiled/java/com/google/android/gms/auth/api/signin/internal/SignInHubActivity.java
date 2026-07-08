package com.google.android.gms.auth.api.signin.internal;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1701330uNH;
import X.C19EG;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C832360Wl0;
import X.C833700WnA;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import androidx.activity.ComponentActivity;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes14.dex */
public class SignInHubActivity extends C19EG {
    public static boolean LLILZLL = false;
    public static final String _pnsPageId = "KyohZyg8JyIgLGEyJiE+JiY3ZiIhOmEyPTEkZy4jIWs/HELIOSICg9IStiICEnLTciKCN9GywrJwY9ADAuCCwnITMlPTY=";
    public boolean LL;
    public SignInConfiguration LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public Intent LLILZIL;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        LLILZLL = false;
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

    public final void LLLLZI(int i) throws Throwable {
        Status status = new Status(i, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        C2204961BRm.LLLLLL(0, intent, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz9a0JDwFVcOPHkJnRLuRy+92M1tOuHW/snvFLYZlBoBt2WKX92a6cBkSY=", new String[]{"016a9"}), this);
        finish();
        LLILZLL = false;
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            LLLLZI(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            intent.getAction();
            finish();
            return;
        }
        Bundle bundleG3 = C786410Ut5.g3(intent, "config");
        bundleG3.getClass();
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleG3.getParcelable("config");
        if (signInConfiguration == null) {
            C2204961BRm.LLLLLLIL(this, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz9a0JDwFVcOPHkJnRLuRy+92M1tOuHW/snvFLYZlBoBt2WKX92a6cBkSY=", new String[]{"016a9"}));
            finish();
            return;
        }
        this.LLILLJJLI = signInConfiguration;
        if (bundle == null) {
            if (LLILZLL) {
                C2204961BRm.LLLLLLIL(this, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz9a0JDwFVcOPHkJnRLuRy+92M1tOuHW/snvFLYZlBoBt2WKX92a6cBkSY=", new String[]{"016a9"}));
                LLLLZI(12502);
                return;
            }
            LLILZLL = true;
            Intent intent2 = new Intent(action);
            if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                intent2.setPackage("com.google.android.gms");
            } else {
                intent2.setPackage(getPackageName());
            }
            intent2.putExtra("config", this.LLILLJJLI);
            try {
                LLLLLZL(this, intent2);
                return;
            } catch (ActivityNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                this.LL = true;
                LLLLZI(17);
                return;
            }
        }
        boolean z = bundle.getBoolean("signingInGoogleApiClients");
        this.LLILLL = z;
        if (z) {
            this.LLILZ = bundle.getInt("signInResultCode");
            Intent intent3 = (Intent) bundle.getParcelable("signInResultData");
            intent3.getClass();
            this.LLILZIL = intent3;
            getSupportLoaderManager().LIZJ(0, null, new C833700WnA(this));
            LLILZLL = false;
        }
    }

    @Override // androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.LLILLL);
        if (this.LLILLL) {
            bundle.putInt("signInResultCode", this.LLILZ);
            C786410Ut5.LJJIJL(bundle, "signInResultData", this.LLILZIL);
        }
    }

    public static void LLLLLZL(SignInHubActivity signInHubActivity, Intent intent) throws Throwable {
        Intent intent2;
        ComponentActivity componentActivity;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(signInHubActivity, intent, "Activity_startActivityForResult_2");
        C1701330uNH.LIZ(intent, signInHubActivity);
        C0WZX c0wzx = new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz9a0JDwFVcOPHkJnRLuRy+92M1tOuHW/snvFLYZlBoBt2WKX92a6cBkSY=", new String[]{"016a9"});
        C0WST c0wst = new C0WST();
        int iIntValue = 40962;
        Object[] objArr = {intent, 40962};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11094, "com/google/android/gms/auth/api/signin/internal/SignInHubActivity", "startActivityForResult", signInHubActivity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11094, "com/google/android/gms/auth/api/signin/internal/SignInHubActivity", "startActivityForResult", null, objArr, signInHubActivity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                componentActivity = (ComponentActivity) obj;
            } else {
                componentActivity = signInHubActivity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            intent2 = intent;
            componentActivity = signInHubActivity;
        }
        componentActivity.startActivityForResult(intent2, iIntValue);
        c0wst.LIZ(11094, "com/google/android/gms/auth/api/signin/internal/SignInHubActivity", "startActivityForResult", null, objArr, componentActivity, c0wzw, true);
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        GoogleSignInAccount googleSignInAccount;
        if (this.LL) {
            return;
        }
        C2204961BRm.LLLLLLIL(this, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz9a0JDwFVcOPHkJnRLuRy+92M1tOuHW/snvFLYZlBoBt2WKX92a6cBkSY=", new String[]{"016a9"}));
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.zbc) != null) {
                C832360Wl0 c832360Wl0LIZ = C832360Wl0.LIZ(this);
                GoogleSignInOptions googleSignInOptions = this.LLILLJJLI.zbb;
                synchronized (c832360Wl0LIZ) {
                    c832360Wl0LIZ.LIZ.LJ(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.LLILLL = true;
                this.LLILZ = i2;
                this.LLILZIL = intent;
                getSupportLoaderManager().LIZJ(0, null, new C833700WnA(this));
                LLILZLL = false;
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                LLLLZI(intExtra);
                return;
            }
        }
        LLLLZI(8);
    }
}
