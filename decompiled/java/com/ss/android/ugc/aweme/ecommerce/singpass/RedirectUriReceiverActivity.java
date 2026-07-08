package com.ss.android.ugc.aweme.ecommerce.singpass;

import X.AbstractActivityC1743740vTg;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C1701330uNH;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import net.openid.appauth.AuthorizationManagementActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class RedirectUriReceiverActivity extends AbstractActivityC1743740vTg {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEgHELIOSISsrOS4gO2seLCs6OiAvPRohIRcpKio6PiA+CCwnITMlPTY=";

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.singpass.RedirectUriReceiverActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.singpass.RedirectUriReceiverActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.singpass.RedirectUriReceiverActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.singpass.RedirectUriReceiverActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.singpass.RedirectUriReceiverActivity", "onWindowFocusChanged", true);
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

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String scheme;
        String authority;
        Set<String> setKeySet;
        String string;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.singpass.RedirectUriReceiverActivity", "onCreate", true);
        super.onCreate(bundle);
        try {
            Uri.Builder builder = new Uri.Builder();
            Uri data = getIntent().getData();
            if (data != null) {
                scheme = data.getScheme();
            } else {
                scheme = null;
            }
            Uri.Builder builderScheme = builder.scheme(scheme);
            Uri data2 = getIntent().getData();
            if (data2 != null) {
                authority = data2.getAuthority();
            } else {
                authority = null;
            }
            Uri.Builder builderAuthority = builderScheme.authority(authority);
            try {
                Bundle extras = getIntent().getExtras();
                if (extras != null && (setKeySet = extras.keySet()) != null) {
                    for (String str : setKeySet) {
                        try {
                            Bundle extras2 = getIntent().getExtras();
                            if (extras2 != null && (string = extras2.getString(str)) != null) {
                                builderAuthority.appendQueryParameter(str, string);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            Uri uriBuild = builderAuthority.build();
            Intent intent = new Intent(this, (Class<?>) AuthorizationManagementActivity.class);
            intent.setData(uriBuild);
            intent.addFlags(603979776);
            LLLLZLLIL(this, intent);
        } finally {
            try {
                finish();
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.singpass.RedirectUriReceiverActivity", "onCreate", false);
            } catch (Throwable th) {
            }
        }
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.singpass.RedirectUriReceiverActivity", "onCreate", false);
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

    public static void LLLLZLLIL(RedirectUriReceiverActivity redirectUriReceiverActivity, Intent intent) throws Throwable {
        Intent intent2 = intent;
        Activity activity = redirectUriReceiverActivity;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent2, "Context_startActivity_1");
        C1701330uNH.LIZ(intent2, activity);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3Z+lauqILkL0O2K0r8vZKLkxZCF9GgkLwmRR9oZcv5SSXWdY=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/ss/android/ugc/aweme/ecommerce/singpass/RedirectUriReceiverActivity", "startActivity", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "com/ss/android/ugc/aweme/ecommerce/singpass/RedirectUriReceiverActivity", "startActivity", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        activity.startActivity(intent2);
        c0wst.LIZ(11098, "com/ss/android/ugc/aweme/ecommerce/singpass/RedirectUriReceiverActivity", "startActivity", null, objArr, activity, c0wzw, true);
    }
}
