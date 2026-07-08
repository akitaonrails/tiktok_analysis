package com.bytedance.observer;

import X.C20664087q;
import X.C20665087r;
import X.C786410Ut5;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public class ObserverWrapper extends C20665087r implements Looper.Observer {
    public Looper.Observer mOriginObserver;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            throw new IllegalStateException("load class error");
        }
    }

    public Object messageDispatchStarting() {
        Object objInvoke;
        if (C20664087q.LIZJ != null) {
            Looper.Observer observer = this.mOriginObserver;
            if (observer != null) {
                objInvoke = observer.messageDispatchStarting();
            } else {
                try {
                    objInvoke = C20664087q.LIZLLL.invoke(C20664087q.LIZJ, new Object[0]);
                } catch (IllegalAccessException e) {
                    TryCatchGuardChecker.doCheck(e);
                    objInvoke = null;
                } catch (InvocationTargetException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    objInvoke = null;
                }
            }
        } else {
            objInvoke = null;
        }
        if (C20664087q.LJI == C786410Ut5.u3()) {
            messageDispatchStarting(">>>>> Dispatching to Handler (com.bytedance.apm.block.LooperObserverMonitor) {57c1969} com.bytedance.apm.block.LooperObserverMonitor@5caffee: 0");
        }
        return objInvoke;
    }

    @Override // X.C20665087r
    public void setup(Object obj) {
        if (obj != null && (obj instanceof Looper.Observer)) {
            this.mOriginObserver = (Looper.Observer) obj;
        }
    }

    public void messageDispatched(Object obj, Message message) {
        if (C20664087q.LIZJ != null) {
            Looper.Observer observer = this.mOriginObserver;
            if (observer != null) {
                observer.messageDispatched(obj, message);
            } else {
                try {
                    C20664087q.LJ.invoke(C20664087q.LIZJ, obj, message);
                } catch (IllegalAccessException e) {
                    TryCatchGuardChecker.doCheck(e);
                } catch (InvocationTargetException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        if (C20664087q.LJI == C786410Ut5.u3()) {
            messageDispatched("<<<<< Finished to Handler (com.bytedance.apm.block.LooperObserverMonitor) {57c1969} com.bytedance.apm.block.LooperObserverMonitor@5caffee", message);
        }
    }

    public void dispatchingThrewException(Object obj, Message message, Exception exc) {
        if (C20664087q.LIZJ != null) {
            Looper.Observer observer = this.mOriginObserver;
            if (observer != null) {
                observer.dispatchingThrewException(obj, message, exc);
                return;
            }
            try {
                C20664087q.LJFF.invoke(C20664087q.LIZJ, obj, message, exc);
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (InvocationTargetException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }
}
