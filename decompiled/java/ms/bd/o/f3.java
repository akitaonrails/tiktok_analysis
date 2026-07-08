package ms.bd.o;

import X.C2179971ATj;
import android.app.Activity;
import android.view.Window;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public class f3 implements Runnable {
    public final /* synthetic */ g3 LL;

    public f3(g3 g3Var) {
        this.LL = g3Var;
    }

    public final void LIZ() throws Throwable {
        Activity activityLIZLLL = s2.LIZLLL();
        if (activityLIZLLL != null) {
            Window.Callback callback = activityLIZLLL.getWindow().getCallback();
            synchronized (this.LL.LLILLL) {
                if (callback != null) {
                    try {
                        if (!this.LL.LLILLL.containsKey(activityLIZLLL)) {
                            activityLIZLLL.getWindow().setCallback(new h3(callback, activityLIZLLL.getClass().getName(), this.LL.LLILLJJLI));
                            this.LL.LLILLL.put(activityLIZLLL, 1);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
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
