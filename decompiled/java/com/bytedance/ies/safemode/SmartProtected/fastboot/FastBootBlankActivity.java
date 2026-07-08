package com.bytedance.ies.safemode.SmartProtected.fastboot;

import X.C01GW;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0XR7;
import X.C1701330uNH;
import X.C2188811AlT;
import X.C452501pT;
import X.C785410UrT;
import X.C805560Vis;
import X.C816490W1f;
import X.C817700W5w;
import X.DialogInterfaceOnCancelListenerC854590Xfl;
import Y.ACListenerS148S0100000_13;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class FastBootBlankActivity extends Activity {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9OyQqLCI8LCBiGiIyOjEcOyAnHELIOSLSY4LCt9LiQ/PS08JzFiDy4gPAcjJjsRJCQiIg4wPCw6IDsq";
    public C0XR7 LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(28));

    public final C805560Vis LIZ() {
        return (C805560Vis) this.LLILLJJLI.getValue();
    }

    public final void LIZIZ() throws Throwable {
        Activity activity;
        Intent intent = new Intent(this, (Class<?>) DownloadApkActivity.class);
        intent.addFlags(32768);
        intent.addFlags(268435456);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(this, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, this);
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YtmpO5Tb/ePGxJ+UXBPJeRFBcsF75zoL/cHX4G7K2XaH8z0dGfITfcOvstzCBW/aBqebqSIWn", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/bytedance/ies/safemode/SmartProtected/fastboot/FastBootBlankActivity", "startActivity", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "com/bytedance/ies/safemode/SmartProtected/fastboot/FastBootBlankActivity", "startActivity", null, objArr, this, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            activity = obj != null ? (Activity) obj : this;
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent = (Intent) obj2;
            }
        } else {
            activity = this;
        }
        activity.startActivity(intent);
        c0wst.LIZ(11098, "com/bytedance/ies/safemode/SmartProtected/fastboot/FastBootBlankActivity", "startActivity", null, objArr, activity, c0wzw, true);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C0XR7 c0xr7 = this.LL;
        if (c0xr7 != null) {
            c0xr7.dismiss();
            C785410UrT.LIZ(c0xr7);
        }
        this.LL = null;
    }

    @Override // android.app.Activity
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

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextActivity: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, true);
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ix);
        String string = getString(2131826359);
        String string2 = getString(2131826360);
        C0XR7 c0xr7 = new C0XR7(this);
        c0xr7.LLILZIL = string2;
        String string3 = getString(2131826357);
        ACListenerS148S0100000_13 aCListenerS148S0100000_13 = new ACListenerS148S0100000_13(this, 4);
        c0xr7.LLIZ = string3;
        c0xr7.LLJ = aCListenerS148S0100000_13;
        String string4 = getString(2131826356);
        ACListenerS148S0100000_13 aCListenerS148S0100000_132 = new ACListenerS148S0100000_13(this, 5);
        c0xr7.LLILZLL = string4;
        c0xr7.LLJI = aCListenerS148S0100000_132;
        c0xr7.LLIZLLLIL = string;
        this.LL = c0xr7;
        c0xr7.setOnCancelListener(new DialogInterfaceOnCancelListenerC854590Xfl(this, 0));
        C0XR7 c0xr72 = this.LL;
        if (c0xr72 != null) {
            c0xr72.show();
            C785410UrT.LIZIZ(c0xr72);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJ(c0xr72);
            C816490W1f.LIZ(c0xr72);
        }
    }
}
