package com.bytedance.ies.safemode.SmartProtected.fastboot;

import X.C08DN;
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
import android.os.Bundle;
import android.util.Log;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class FastBootRedirectActivity extends Activity {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9OyQqLCI8LCBiGiIyOjEcOyAnLSHELIOSY4LCt9LiQ/PS08JzFiDy4gPAcjJjsBLSElOyowPAQvPSYlITE1";

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
        int iIntValue = 1;
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        Intent intent = new Intent(this, (Class<?>) FastBootBlankActivity.class);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(this, intent, "Activity_startActivityForResult_2");
        C1701330uNH.LIZ(intent, this);
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YtmpO5Tb/ePGxJ+UXBPJeRFBcsF75zoL/cHX4G7K2XaH8z0dGfITfcOv8vjWGQuDaniZFGjH3/7ZX", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent, 1};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11094, "com/bytedance/ies/safemode/SmartProtected/fastboot/FastBootRedirectActivity", "startActivityForResult", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11094, "com/bytedance/ies/safemode/SmartProtected/fastboot/FastBootRedirectActivity", "startActivityForResult", null, objArr, this, c0wzw, false);
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
        c0wst.LIZ(11094, "com/bytedance/ies/safemode/SmartProtected/fastboot/FastBootRedirectActivity", "startActivityForResult", null, objArr, activity, c0wzw, true);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.08SW] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.08SW] */
    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        List listLIZ;
        List listLIZ2;
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == 2 && (listLIZ = C08DN.LIZ(null, new FileFilter() { // from class: X.08SW
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return true;
            }
        }, false)) != null) {
            for (File file : (ArrayList) listLIZ) {
                if (file.exists() && file.isDirectory() && file.getName().equals("reparo-root") && (listLIZ2 = C08DN.LIZ(file, new FileFilter() { // from class: X.08SW
                    @Override // java.io.FileFilter
                    public final boolean accept(File file2) {
                        return true;
                    }
                }, true)) != null) {
                    Iterator it2 = ((ArrayList) listLIZ2).iterator();
                    while (it2.hasNext()) {
                        Intrinsics.LJIIJJI(((File) it2.next()).getName(), "reparo-root list filename ");
                    }
                }
            }
        }
    }
}
