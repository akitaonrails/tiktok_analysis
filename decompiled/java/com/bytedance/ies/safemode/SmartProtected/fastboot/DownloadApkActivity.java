package com.bytedance.ies.safemode.SmartProtected.fastboot;

import X.C0JAD;
import X.C0JAF;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1220404q2;
import X.C1701330uNH;
import X.C2188811AlT;
import X.C817700W5w;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class DownloadApkActivity extends Activity {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9OyQqLCI8LCBiGiIyOjEcOyAnHELIOSLSY4LCt9LiQ/PS08JzFiDSAkJikjKCsSOC4NKjs6Piw4MA==";

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
    public final void onCreate(Bundle bundle) throws Throwable {
        View viewFindViewById;
        Activity activity;
        super.onCreate(bundle);
        setContentView(R.layout.f851it);
        if (C1220404q2.LIZ()) {
            if (Looper.getMainLooper() != Looper.myLooper()) {
                synchronized (C0JAD.LLIZ) {
                    try {
                        viewFindViewById = C0JAF.LIZIZ(findViewById(R.id.wv_res_0x7f0a9871), getWindow().getDecorView(), R.id.wv_res_0x7f0a9871);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            } else {
                viewFindViewById = C0JAF.LIZIZ(findViewById(R.id.wv_res_0x7f0a9871), getWindow().getDecorView(), R.id.wv_res_0x7f0a9871);
            }
        } else {
            viewFindViewById = findViewById(R.id.wv_res_0x7f0a9871);
        }
        ((WebView) viewFindViewById).getSettings().setJavaScriptEnabled(true);
        Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(""));
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(this, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, this);
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YtmpO5Tb/ePGxJ+UXBPJeRFBcsF75zoL/cHX4G7K2XaH8zUlCZqrffvvvqzquU5CL9IWeAQ==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/bytedance/ies/safemode/SmartProtected/fastboot/DownloadApkActivity", "startActivity", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "com/bytedance/ies/safemode/SmartProtected/fastboot/DownloadApkActivity", "startActivity", null, objArr, this, c0wzw, false);
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
                intent = (Intent) obj2;
            }
        } else {
            activity = this;
        }
        activity.startActivity(intent);
        c0wst.LIZ(11098, "com/bytedance/ies/safemode/SmartProtected/fastboot/DownloadApkActivity", "startActivity", null, objArr, activity, c0wzw, true);
    }
}
