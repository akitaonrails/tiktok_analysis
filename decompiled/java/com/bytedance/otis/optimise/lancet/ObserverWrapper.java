package com.bytedance.otis.optimise.lancet;

import X.C082Q;
import X.C082R;
import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import android.os.Message;
import android.util.Printer;
import com.android.internal.os.LooperStats;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class ObserverWrapper extends LooperStats {
    public static boolean needInvode = true;
    public C082R originObserver;

    @Override // com.android.internal.os.LooperStats
    public Object messageDispatchStarting() {
        Object objMessageDispatchStarting;
        Printer printer;
        if (needInvode) {
            try {
                objMessageDispatchStarting = super.messageDispatchStarting();
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                needInvode = false;
                objMessageDispatchStarting = null;
            }
        } else {
            objMessageDispatchStarting = null;
        }
        if (C786410Ut5.u3() != C082Q.LIZJ.getThread()) {
            return objMessageDispatchStarting;
        }
        C082R c082r = this.originObserver;
        if (c082r != null) {
            try {
                C2204961BRm.a0(c082r.LIZ, c082r.LIZJ, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyLcpvO97ZblugMViyjFpW2PETZNxRZ+mrK+pOb3eoQq+8IPJQ=", null));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        ArrayList<Printer> arrayList = C082Q.LIZIZ;
        if (arrayList.size() > 0 && (printer = (Printer) ListProtector.get(arrayList, 0)) != null) {
            printer.println(">>>>> Dispatching to");
        }
        return objMessageDispatchStarting;
    }

    public void setOriginObserver(C082R c082r) {
        this.originObserver = c082r;
    }

    @Override // com.android.internal.os.LooperStats
    public void messageDispatched(Object obj, Message message) {
        Printer printer;
        if (needInvode) {
            try {
                super.messageDispatched(obj, message);
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                needInvode = false;
            }
        }
        if (C786410Ut5.u3() != C082Q.LIZJ.getThread()) {
            return;
        }
        C082R c082r = this.originObserver;
        if (c082r != null) {
            try {
                C2204961BRm.a0(c082r.LIZIZ, c082r.LIZJ, new Object[]{obj, message}, new C0WZX("dzBzEgAjS8/YVFkiQFyLcpvO97ZblugMViyjFpW2PETZNxRZ+mrK+pOb3eoQq+8IPJQ=", null));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        ArrayList<Printer> arrayList = C082Q.LIZIZ;
        int size = arrayList.size();
        if (C082Q.LJFF) {
            if (size > 0) {
                printer = (Printer) ListProtector.remove(arrayList, 0);
                C082Q.LJFF = false;
            } else {
                return;
            }
        } else if (size > 1) {
            printer = (Printer) ListProtector.remove(arrayList, 0);
        } else if (size != 1) {
            return;
        } else {
            printer = (Printer) ListProtector.get(arrayList, 0);
        }
        if (printer != null) {
            printer.println("<<<<< Finished to");
        }
    }
}
