package net.openid.appauth;

import X.C0WWL;
import X.C2188811AlT;
import X.C2193461Asy;
import X.C786410Ut5;
import X.C817700W5w;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class AuthorizationManagementActivity extends Activity {
    public static final String _pnsPageId = "JiA4ZyAjLSslLWEyODUtPDs7ZgQ5PSc8OiHELIOSw2KDs6JysBKCEyLyAhLCEnCSY4IDk6PDw=";
    public boolean LL;
    public Intent LLILLJJLI;
    public C2193461Asy LLILLL;
    public PendingIntent LLILZ;
    public PendingIntent LLILZIL;

    /* JADX WARN: Removed duplicated region for block: B:48:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.openid.appauth.AuthorizationManagementActivity.LIZIZ():void");
    }

    @Override // android.app.Activity
    public final void onResume() {
        try {
            LIZIZ();
        } catch (ActivityNotFoundException | NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                finish();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
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

    public final void LIZ(Bundle bundle) {
        if (bundle == null) {
            C0WWL.LIZLLL("No stored state - unable to handle response", new Object[0]);
            finish();
            return;
        }
        this.LLILLJJLI = (Intent) bundle.getParcelable("authIntent");
        this.LL = bundle.getBoolean("authStarted", false);
        try {
            C2193461Asy c2193461AsyLIZ = null;
            String string = bundle.getString("authRequest", null);
            if (string != null) {
                c2193461AsyLIZ = C2193461Asy.LIZ(new JSONObject(string));
            }
            this.LLILLL = c2193461AsyLIZ;
            this.LLILZ = (PendingIntent) bundle.getParcelable("completeIntent");
            this.LLILZIL = (PendingIntent) bundle.getParcelable("cancelIntent");
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalStateException("Unable to deserialize authorization request", e);
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
        Bundle extras;
        super.onCreate(bundle);
        if (bundle == null) {
            try {
                extras = getIntent().getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
            LIZ(extras);
            return;
        }
        LIZ(bundle);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("authStarted", this.LL);
        C786410Ut5.LJJIJL(bundle, "authIntent", this.LLILLJJLI);
        C786410Ut5.LJJJI("authRequest", C786410Ut5.J3(this.LLILLL.LIZIZ()), bundle);
        C786410Ut5.LJJIJL(bundle, "completeIntent", this.LLILZ);
        C786410Ut5.LJJIJL(bundle, "cancelIntent", this.LLILZIL);
    }
}
