package ms.bd.o;

import X.C2179971ATj;
import X.C786410Ut5;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Window;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes14.dex */
public class g3 implements Application.ActivityLifecycleCallbacks {
    public final e3 LLILLJJLI;
    public final int LLILZ;
    public boolean LL = false;
    public final WeakHashMap<Activity, Integer> LLILLL = new WeakHashMap<>();

    public g3(i3 i3Var) {
        this.LLILLJJLI = null;
        this.LLILZ = 5000;
        this.LLILLJJLI = i3Var;
        this.LLILZ = 10000;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Window.Callback callback = activity.getWindow().getCallback();
        String name = activity.getClass().getName();
        if (callback != null) {
            synchronized (this.LLILLL) {
                try {
                    if (!this.LLILLL.containsKey(activity)) {
                        activity.getWindow().setCallback(new h3(callback, name, this.LLILLJJLI));
                        this.LLILLL.put(activity, 1);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.LLILLL) {
            try {
                this.LLILLL.remove(activity);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public class a implements Runnable {
        public final /* synthetic */ Handler LL;
        public final /* synthetic */ Handler LLILLJJLI;

        public a(BPEAHandler bPEAHandler, BPEAHandler bPEAHandler2) {
            this.LL = bPEAHandler;
            this.LLILLJJLI = bPEAHandler2;
        }

        public final void LIZ() throws Throwable {
            synchronized (this) {
                try {
                    if (g3.this.LL) {
                        Activity activityLIZLLL = s2.LIZLLL();
                        synchronized (g3.this.LLILLL) {
                            try {
                                if (g3.this.LLILLL.containsKey(activityLIZLLL)) {
                                    C786410Ut5.LJLIIL(g3.this.LLILZ, this.LL, this);
                                    return;
                                }
                                g3 g3Var = g3.this;
                                Handler handler = this.LLILLJJLI;
                                g3Var.getClass();
                                C786410Ut5.LJJZZIII(handler, new f3(g3Var));
                                C786410Ut5.LJLIIL(g3.this.LLILZ, this.LL, this);
                            } finally {
                            }
                        }
                    }
                } finally {
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

    public final void LIZ(Application application) {
        synchronized (this) {
            try {
                if (!this.LL) {
                    this.LL = true;
                    application.registerActivityLifecycleCallbacks(this);
                    BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
                    C786410Ut5.LJJZZIII(bPEAHandler, new f3(this));
                    HandlerThread handlerThread = new HandlerThread((String) k.a(16777217, 0, 0L, "d40e15", new byte[]{88, 5, 111, 24, 8, 39, 87, 26, 109, 57}));
                    handlerThread.start();
                    BPEAHandler bPEAHandler2 = new BPEAHandler(C786410Ut5.W2(handlerThread));
                    C786410Ut5.LJLIIL(this.LLILZ, bPEAHandler2, new a(bPEAHandler2, bPEAHandler));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
