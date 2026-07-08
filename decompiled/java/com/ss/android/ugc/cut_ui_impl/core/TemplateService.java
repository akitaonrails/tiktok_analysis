package com.ss.android.ugc.cut_ui_impl.core;

import X.BinderC2410009cQ;
import X.BinderC2410309cT;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C786410Ut5;
import X.C788530UwV;
import X.C817700W5w;
import Y.AObjectS379S0100000_3;
import Y.ARunnableS103S0100000_3;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class TemplateService extends Service {
    public BinderC2410009cQ LL;

    @Override // android.app.Service
    public final void onDestroy() {
        BinderC2410009cQ binderC2410009cQ = this.LL;
        if (binderC2410009cQ != null) {
            Iterator it2 = ((LinkedHashMap) binderC2410009cQ.LL).entrySet().iterator();
            while (it2.hasNext()) {
                BinderC2410309cT binderC2410309cT = (BinderC2410309cT) ((Map.Entry) it2.next()).getValue();
                binderC2410309cT.getClass();
                AObjectS379S0100000_3 aObjectS379S0100000_3 = new AObjectS379S0100000_3(binderC2410309cT, 6);
                if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                    aObjectS379S0100000_3.invoke();
                } else {
                    C786410Ut5.LJJZZIII(null, new ARunnableS103S0100000_3((Object) aObjectS379S0100000_3, 87));
                }
            }
            ((LinkedHashMap) binderC2410009cQ.LL).clear();
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/ss/android/ugc/cut_ui_impl/core/TemplateService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3ssaFgmb9Whbo/CkjEfhxd3mGy05HJGXF66fyG/hem4", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
        }
        BinderC2410009cQ binderC2410009cQ = this.LL;
        if (binderC2410009cQ == null) {
            BinderC2410009cQ binderC2410009cQ2 = new BinderC2410009cQ();
            this.LL = binderC2410009cQ2;
            return binderC2410009cQ2;
        }
        return binderC2410009cQ;
    }
}
