package com.facebook;

import X.C0W7Q;
import X.C0WZX;
import X.C1BIE;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C521490Kcl;
import X.C786410Ut5;
import X.C817700W5w;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class CustomTabMainActivity extends Activity {
    public static final String LLILLL = Intrinsics.LJIIJJI(".extra_action", "CustomTabMainActivity");
    public static final String LLILZ = Intrinsics.LJIIJJI(".extra_params", "CustomTabMainActivity");
    public static final String LLILZIL = Intrinsics.LJIIJJI(".extra_chromePackage", "CustomTabMainActivity");
    public static final String LLILZLL = Intrinsics.LJIIJJI(".extra_url", "CustomTabMainActivity");
    public static final String LLIZ = Intrinsics.LJIIJJI(".extra_targetApp", "CustomTabMainActivity");
    public static final String LLIZLLLIL = Intrinsics.LJIIJJI(".action_refresh", "CustomTabMainActivity");
    public static final String LLJ = Intrinsics.LJIIJJI(".no_activity_exception", "CustomTabMainActivity");
    public static final String _pnsPageId = "KyohZykyKyAuJiA4ZgY5Ojs8HELIOSJREtKwIyISsNKjs6Piw4MA==";
    public boolean LL = true;
    public C521490Kcl LLILLJJLI;

    @Override // android.app.Activity
    public final void onResume() throws Throwable {
        super.onResume();
        if (this.LL) {
            LIZ(0, null);
        }
        this.LL = true;
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

    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0156  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.CustomTabMainActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) throws Throwable {
        super.onNewIntent(intent);
        if (Intrinsics.LJFF(LLIZLLLIL, intent.getAction())) {
            LocalBroadcastManager.LIZ(this).LIZJ(new Intent(CustomTabActivity.LLILLL));
            LIZ(-1, intent);
        } else {
            if (!Intrinsics.LJFF(CustomTabActivity.LLILLJJLI, intent.getAction())) {
                return;
            }
            LIZ(-1, intent);
        }
    }

    public final void LIZ(int i, Intent intent) throws Throwable {
        Bundle bundle;
        String stringExtra;
        C521490Kcl c521490Kcl = this.LLILLJJLI;
        if (c521490Kcl != null) {
            LocalBroadcastManager.LIZ(this).LIZLLL(c521490Kcl);
        }
        if (intent != null) {
            try {
                stringExtra = intent.getStringExtra(LLILZLL);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (stringExtra == null) {
                bundle = new Bundle();
            } else {
                Uri uri = Uri.parse(stringExtra);
                bundle = C0W7Q.LJIJ(uri.getQuery());
                C786410Ut5.LJJIIJZLJL(bundle, C0W7Q.LJIJ(uri.getFragment()));
            }
            C1BIE c1bie = C1BIE.LIZ;
            Intent intentLJ = C1BIE.LJ(getIntent(), bundle, null);
            if (intentLJ != null) {
                intent = intentLJ;
            }
            C2204961BRm.LLLLL(this, i, intent, new C0WZX("dzBzEgQ7XM/eWlgqCzGRdYUQ8nFIuLj3nLdFsCAYNNOYgQ==", new String[]{"019e5"}));
        } else {
            C1BIE c1bie2 = C1BIE.LIZ;
            C2204961BRm.LLLLL(this, i, C1BIE.LJ(getIntent(), null, null), new C0WZX("dzBzEgQ7XM/eWlgqCzGRdYUQ8nFIuLj3nLdFsCAYNNOYgQ==", new String[]{"019e5"}));
        }
        finish();
    }
}
