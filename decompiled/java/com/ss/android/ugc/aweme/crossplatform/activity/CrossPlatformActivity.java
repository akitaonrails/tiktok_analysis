package com.ss.android.ugc.aweme.crossplatform.activity;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1041660dDI;
import X.C1051900dTo;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C1701330uNH;
import X.C1886700zCG;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import X.InterfaceC342470Dbh;
import X.InterfaceC836750Ws5;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes17.dex */
public class CrossPlatformActivity extends BaseActivity implements InterfaceC836750Ws5 {
    public static long LLIZ = 0;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiY+JjwgOCktPSHELIOSk8OihiKCwnITMlPTZ9CzcjOjwDJCQ4LyAhJQQvPSYlITE1";
    public C1041660dDI LL;
    public InterfaceC342470Dbh LLILLJJLI;
    public boolean LLILLL = true;
    public C1051900dTo LLILZ;
    public long LLILZIL;
    public boolean LLILZLL;

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onResume", true);
        super.onResume();
        C1051900dTo c1051900dTo = this.LLILZ;
        if (c1051900dTo != null) {
            c1051900dTo.LJFF = false;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity
    public final void dismissCustomToast() {
        C1051900dTo c1051900dTo = this.LLILZ;
        if (c1051900dTo != null) {
            c1051900dTo.LIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void finish() {
        /*
            r3 = this;
            boolean r0 = r3.LLILLL
            if (r0 != 0) goto L5
            return
        L5:
            android.app.Activity r0 = X.C1388190mED.LIZ(r3)
            if (r0 == 0) goto Lb4
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto Lb4
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto Lb4
            android.view.View r0 = r0.findFocus()
        L1b:
            X.C1069330dvv.LIZ(r3, r0)
            super.finish()
            boolean r0 = r3.LLILZLL
            if (r0 != 0) goto L36
            X.0dDI r2 = r3.LL
            r1 = 0
            if (r2 == 0) goto L95
            X.0dDD r0 = r2.LIZJ
            boolean r0 = r0.LJIILIIL
            if (r0 == 0) goto L8b
            r0 = 2130837554(0x7f020032, float:1.7280065E38)
            super.overridePendingTransition(r1, r0)
        L36:
            r0 = 0
            X.C1027910cr7.LIZ = r0
            org.greenrobot.eventbus.EventBus r1 = org.greenrobot.eventbus.EventBus.LIZLLL()
            java.lang.Class<X.0dTn> r0 = X.C1051890dTn.class
            r1.LJIJJLI(r0)
            android.view.Window r0 = r3.getWindow()
            if (r0 == 0) goto L8a
            android.view.Window r0 = r3.getWindow()
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L8a
            android.view.Window r0 = r3.getWindow()
            android.view.View r1 = r0.getDecorView()
            r0 = 2131367503(0x7f0a164f, float:1.835493E38)
            java.lang.Object r1 = r1.getTag(r0)
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L8a
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L8a
            X.0dDI r0 = r3.LL
            X.0dDG r0 = r0.LIZ
            java.lang.String r0 = r0.LIZIZ
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            java.lang.String r0 = "__spark_session_id"
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L8a
            X.0dDI r0 = r3.LL
            java.lang.String r0 = r0.LJ
            X.C1051980dTw.LIZJ(r1, r0)
        L8a:
            return
        L8b:
            X.0dDD r0 = r2.LIZJ
            boolean r0 = r0.LIZ
            if (r0 == 0) goto L95
            super.overridePendingTransition(r1, r1)
            goto L36
        L95:
            java.util.Locale r0 = java.util.Locale.getDefault()
            int r1 = android.text.TextUtils.getLayoutDirectionFromLocale(r0)
            r0 = 1
            if (r1 != r0) goto Laa
            r1 = 2130837776(0x7f020110, float:1.7280516E38)
            r0 = 2130837781(0x7f020115, float:1.7280526E38)
            super.overridePendingTransition(r1, r0)
            goto L36
        Laa:
            r1 = 2130837774(0x7f02010e, float:1.7280512E38)
            r0 = 2130837783(0x7f020117, float:1.728053E38)
            super.overridePendingTransition(r1, r0)
            goto L36
        Lb4:
            r0 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.finish():void");
    }

    public final boolean LLLLLZL() {
        if (isDestroyed()) {
            return false;
        }
        if (this.LLILZ != null) {
            return true;
        }
        this.LLILZ = new C1051900dTo(this);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0113 A[PHI: r3
      0x0113: PHI (r3v5 java.lang.String) = (r3v1 java.lang.String), (r3v1 java.lang.String), (r3v3 java.lang.String) binds: [B:20:0x0065, B:47:0x0110, B:29:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroy() {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.onDestroy():void");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        C1051900dTo c1051900dTo = this.LLILZ;
        if (c1051900dTo == null || c1051900dTo.LJ || c1051900dTo.LJFF) {
            return;
        }
        c1051900dTo.LJI.removeCallbacks(c1051900dTo.LJII);
        c1051900dTo.LIZ();
        c1051900dTo.LJFF = true;
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19FO, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0244  */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r20) {
        /*
            Method dump skipped, instruction units count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.InterfaceC836750Ws5
    public final void setActivityResultListener(InterfaceC342470Dbh interfaceC342470Dbh) {
        this.LLILLJJLI = interfaceC342470Dbh;
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity
    public final void showCustomToast(String str) {
        if (!LLLLLZL()) {
            return;
        }
        this.LLILZ.LIZIZ(0, 2000, str);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C12ET
    public final void showCustomLongToast(int i, String str) {
        if (!LLLLLZL()) {
            return;
        }
        this.LLILZ.LIZIZ(i, 3500, str);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity
    public final void showCustomToast(int i, String str) {
        if (!LLLLLZL()) {
            return;
        }
        this.LLILZ.LIZIZ(i, 2000, str);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) throws Throwable {
        Bundle bundle2;
        Intent intent2;
        Activity activity;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(this, intent, "Context_startActivity_2");
        C1701330uNH.LIZ(intent, this);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOm6bIzdzD6hCjxGKRHDngedbmgwrQg8Ue7pCygwzFSN+fwaex8kkhLTt2/P", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent, bundle};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;Landroid/os/Bundle;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/bytedance/ies/foundation/activity/BaseActivity", "startActivity", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "com/bytedance/ies/foundation/activity/BaseActivity", "startActivity", null, objArr, this, c0wzw, false);
            return;
        }
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
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                bundle2 = (Bundle) obj3;
            } else {
                bundle2 = bundle;
            }
        } else {
            bundle2 = bundle;
            intent2 = intent;
            activity = this;
        }
        super.startActivity(intent2, bundle2);
        c0wst.LIZ(11098, "com/bytedance/ies/foundation/activity/BaseActivity", "startActivity", null, objArr, activity, c0wzw, true);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InterfaceC342470Dbh interfaceC342470Dbh = this.LLILLJJLI;
        if (interfaceC342470Dbh != null) {
            interfaceC342470Dbh.onActivityResult(i, i2, intent);
        }
    }

    @Override // X.C19EG, android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) throws Throwable {
        int iIntValue = i;
        int[] iArr2 = iArr;
        String[] strArr2 = strArr;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11051, "com/ss/android/ugc/aweme/crossplatform/activity/CrossPlatformActivity", "onRequestPermissionsResult", this, new Object[]{Integer.valueOf(iIntValue), strArr2, iArr2}, "void", new C0WZW(false, "(I[Ljava/lang/String;[I)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOm6bIzdzD6hCjxGKRHDngedbmgwrQg8Ue7pCygwzFSN+fwaex8kkhLTt2/P", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                iIntValue = ((Integer) obj).intValue();
            }
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                strArr2 = (String[]) obj2;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iArr2 = (int[]) obj3;
            }
        }
        C1886700zCG.LIZ(this, iIntValue, iArr2);
        super.onRequestPermissionsResult(iIntValue, strArr2, iArr2);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity
    public final void showCustomToast(String str, int i, int i2) {
        if (!LLLLLZL()) {
            return;
        }
        this.LLILZ.LIZIZ(0, i, str);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C12ET
    public final void showCustomToast(int i, String str, int i2, int i3) {
        if (!LLLLLZL()) {
            return;
        }
        this.LLILZ.LIZIZ(i, i2, str);
    }
}
