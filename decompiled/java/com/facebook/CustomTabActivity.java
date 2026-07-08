package com.facebook;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1701330uNH;
import X.C2188811AlT;
import X.C2499609qs;
import X.C817700W5w;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class CustomTabActivity extends Activity {
    public static final String LLILLJJLI = Intrinsics.LJIIJJI(".action_customTabRedirect", "CustomTabActivity");
    public static final String LLILLL = Intrinsics.LJIIJJI(".action_destroy", "CustomTabActivity");
    public static final String _pnsPageId = "KyohZykyKyAuJiA4ZgY5HELIOSOjs8JREtKw4wPCw6IDsq";
    public C2499609qs LL;

    @Override // android.app.Activity
    public final void onDestroy() {
        C2499609qs c2499609qs = this.LL;
        if (c2499609qs != null) {
            LocalBroadcastManager.LIZ(this).LIZLLL(c2499609qs);
        }
        super.onDestroy();
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
    public final void onCreate(Bundle bundle) throws Throwable {
        Activity activity;
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) CustomTabMainActivity.class);
        intent.setAction(LLILLJJLI);
        intent.putExtra(CustomTabMainActivity.LLILZLL, getIntent().getDataString());
        intent.addFlags(603979776);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(this, intent, "Activity_startActivityForResult_2");
        C1701330uNH.LIZ(intent, this);
        C0WZX c0wzx = new C0WZX("dzBzEgQ7XM/eWlgqCzGRdYUQ8nFIuLT1gbByuiAI", new String[]{"019e5"});
        C0WST c0wst = new C0WST();
        int iIntValue = 2;
        Object[] objArr = {intent, 2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11094, "com/facebook/CustomTabActivity", "startActivityForResult", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11094, "com/facebook/CustomTabActivity", "startActivityForResult", null, objArr, this, c0wzw, false);
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
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            activity = this;
        }
        activity.startActivityForResult(intent, iIntValue);
        c0wst.LIZ(11094, "com/facebook/CustomTabActivity", "startActivityForResult", null, objArr, activity, c0wzw, true);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent(LLILLJJLI);
            intent2.putExtra(CustomTabMainActivity.LLILZLL, getIntent().getDataString());
            LocalBroadcastManager.LIZ(this).LIZJ(intent2);
            C2499609qs c2499609qs = new C2499609qs(this, 0);
            LocalBroadcastManager.LIZ(this).LIZIZ(c2499609qs, new IntentFilter(LLILLL));
            this.LL = c2499609qs;
        }
    }
}
