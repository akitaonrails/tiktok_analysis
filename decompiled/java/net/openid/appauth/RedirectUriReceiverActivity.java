package net.openid.appauth;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1701330uNH;
import X.C2188811AlT;
import X.C817700W5w;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes8.dex */
public class RedirectUriReceiverActivity extends Activity {
    public static final String _pnsPageId = "JiA4ZyAjLSslLWEyODUtPDs7ZhcpLSYhHELIOSLSY4HD06GiAvLCYlLTcNKjs6Piw4MA==";

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
        Activity activity;
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        Intent intent = new Intent(this, (Class<?>) AuthorizationManagementActivity.class);
        intent.setData(data);
        intent.addFlags(603979776);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(this, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, this);
        C0WZX c0wzx = new C0WZX("ejpqEg0qWsTVURkgVQKFcwd7GuViGwn7FPol2xMZzsbzhRnGTfCeWjuvWJDndg==", new String[]{"01b09"});
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "net/openid/appauth/RedirectUriReceiverActivity", "startActivity", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "net/openid/appauth/RedirectUriReceiverActivity", "startActivity", null, objArr, this, c0wzw, false);
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
                    intent = (Intent) obj2;
                }
            } else {
                activity = this;
            }
            activity.startActivity(intent);
            c0wst.LIZ(11098, "net/openid/appauth/RedirectUriReceiverActivity", "startActivity", null, objArr, activity, c0wzw, true);
        }
        finish();
    }
}
