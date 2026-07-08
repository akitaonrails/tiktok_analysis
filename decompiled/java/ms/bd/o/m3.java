package ms.bd.o;

import X.C2179971ATj;
import X.C786410Ut5;
import X.C838410Wul;
import android.app.Activity;
import android.app.Application;
import android.content.IntentFilter;
import android.os.Build;
import android.view.Window;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.sysoptimizer.ReceiverRegisterLancet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ms.bd.o.l3;

/* JADX INFO: loaded from: classes14.dex */
public class m3 implements Runnable {
    public final /* synthetic */ Application LL;
    public final /* synthetic */ l3 LLILLJJLI;

    public m3(l3 l3Var, Application application) {
        this.LLILLJJLI = l3Var;
        this.LL = application;
    }

    public final void LIZ() throws Exception {
        Window.Callback callback;
        Activity activityLIZLLL = s2.LIZLLL();
        if (activityLIZLLL != null && (callback = activityLIZLLL.getWindow().getCallback()) != null && !this.LLILLJJLI.LLIZLLLIL.containsKey(activityLIZLLL)) {
            activityLIZLLL.getWindow().setCallback(new h3(callback, activityLIZLLL.getClass().getName(), this.LLILLJJLI));
            this.LLILLJJLI.LLIZLLLIL.put(activityLIZLLL, 1);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction((String) k.a(16777217, 0, 0L, "ea7e7e", new byte[]{87, 76, 105, 95, 56, 92, 85, 14, 67, 27, 64, 70, 118, 46, 60, 90, 79, 114, 66, 10, 87, 76, 106, 37, 41, 91, 72, 101, 84}));
        intentFilter.addAction((String) k.a(16777217, 0, 0L, "e71e54", new byte[]{87, 26, 111, 95, 58, 13, 85, 88, 76, 16, 85, 3, 103, 46, 62, 11, 79, 36, 68, 10, 87, 26, 108, 37, 43, 10, 72, 51, 82}));
        if (Build.VERSION.SDK_INT < 34) {
            C786410Ut5.LJIJI(this.LL, this.LLILLJJLI.LLILLL, intentFilter);
            return;
        }
        Application application = this.LL;
        l3.c cVar = this.LLILLJJLI.LLILLL;
        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
            ReceiverRegisterCrashOptimizer.doHWReceiverFix();
        }
        try {
            if (!ReceiverRegisterCrashOptimizer.doRegisterHandler()) {
                application.registerReceiver(cVar, intentFilter, 2);
            } else {
                ReceiverRegisterLancet.initHandler();
                C838410Wul.LJI(application, cVar, intentFilter, null, ReceiverRegisterLancet.sReceiverHandler, 2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (!ReceiverRegisterCrashOptimizer.fixedOpen()) {
                throw e;
            }
            ReceiverRegisterCrashOptimizer.registerReceiver(cVar, intentFilter, 2);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }
}
