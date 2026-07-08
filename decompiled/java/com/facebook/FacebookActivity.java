package com.facebook;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C19EG;
import X.C19EH;
import X.C1BI3;
import X.C1BIE;
import X.C1BIN;
import X.C1BJO;
import X.C2409809cO;
import X.C807660VmG;
import X.C844470XAv;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.login.LoginFragment;
import com.zhiliaoapp.musically.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes35.dex */
public class FacebookActivity extends C19EG {
    public static final String _pnsPageId = "KyohZykyKyAuJiA4ZgMtHELIOSKioxJyonCCwnITMlPTY=";
    public Fragment LL;

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

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.LL;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        C1BJO c1bjo;
        Activity activity;
        if (!FacebookSdk.LJII()) {
            C844470XAv.LIZ.getClass();
            FacebookSdk.LJIIJ(C844470XAv.LIZ());
        }
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!FacebookSdk.LJII()) {
            Context applicationContext = getApplicationContext();
            if (C2409809cO.LIZIZ && applicationContext == null) {
                applicationContext = C2409809cO.LIZ;
            }
            FacebookSdk.LJIIJ(applicationContext);
        }
        setContentView(R.layout.agk);
        if (Intrinsics.LJFF("PassThrough", intent.getAction())) {
            Bundle bundleLJIIIIZZ = C1BIE.LJIIIIZZ(getIntent());
            if (!C807660VmG.LIZ(C1BIE.class) && bundleLJIIIIZZ != null) {
                try {
                    String string = bundleLJIIIIZZ.getString("error_type");
                    if (string == null) {
                        string = bundleLJIIIIZZ.getString("com.facebook.platform.status.ERROR_TYPE");
                    }
                    String string2 = bundleLJIIIIZZ.getString("error_description");
                    if (string2 == null) {
                        string2 = bundleLJIIIIZZ.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
                    }
                    if (string != null && u.LJIJI(string, "UserCanceled", true)) {
                        c1bjo = new C1BIN(string2);
                    } else {
                        c1bjo = new C1BJO(string2);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1bjo = null;
                }
            } else {
                c1bjo = null;
            }
            C1BIE c1bie = C1BIE.LIZ;
            Intent intentLJ = C1BIE.LJ(getIntent(), null, c1bjo);
            C0WZX c0wzx = new C0WZX("dzBzEgQ7XM/eWlgqCzSFZSuxKYtIY5HgGMRCARQ=", new String[]{"019e5"});
            C0WST c0wst = new C0WST();
            int iIntValue = 0;
            Object[] objArr = {0, intentLJ};
            C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
            C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/facebook/FacebookActivity", "setResult", this, objArr, "void", c0wzw);
            if (c0wsuLIZIZ.LIZ) {
                c0wst.LIZ(11071, "com/facebook/FacebookActivity", "setResult", null, objArr, this, c0wzw, false);
            } else {
                Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                if (objArr2 != null) {
                    Object obj = objArr2[0];
                    if (obj != null) {
                        activity = (Activity) obj;
                    } else {
                        activity = this;
                    }
                    Object obj2 = objArr2[1];
                    if (obj2 != null) {
                        iIntValue = ((Integer) obj2).intValue();
                    }
                    Object obj3 = c0wsuLIZIZ.LIZJ[2];
                    if (obj3 != null) {
                        intentLJ = (Intent) obj3;
                    }
                } else {
                    activity = this;
                }
                activity.setResult(iIntValue, intentLJ);
                c0wst.LIZ(11071, "com/facebook/FacebookActivity", "setResult", null, objArr, activity, c0wzw, true);
            }
            finish();
            return;
        }
        Intent intent2 = getIntent();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment fragmentLJJJJZI = supportFragmentManager.LJJJJZI("SingleFragment");
        Fragment fragment = fragmentLJJJJZI;
        if (fragmentLJJJJZI == null) {
            if (Intrinsics.LJFF("FacebookDialogFragment", intent2.getAction())) {
                FacebookDialogFragment facebookDialogFragment = new FacebookDialogFragment();
                facebookDialogFragment.setRetainInstance(true);
                facebookDialogFragment.show(supportFragmentManager, "SingleFragment");
                fragment = facebookDialogFragment;
            } else {
                LoginFragment loginFragment = new LoginFragment();
                loginFragment.setRetainInstance(true);
                C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
                c19ehLJIIJ.LIZJ(R.id.e90, loginFragment, "SingleFragment");
                c19ehLJIIJ.LJIIIZ();
                fragment = loginFragment;
            }
        }
        this.LL = fragment;
    }

    @Override // X.C19EG, android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            C1BI3.LIZ.getClass();
            if (Intrinsics.LJFF(null, Boolean.TRUE)) {
                return;
            }
            super.dump(str, fileDescriptor, printWriter, strArr);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
