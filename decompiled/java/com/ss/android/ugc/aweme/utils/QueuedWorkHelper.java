package com.ss.android.ugc.aweme.utils;

import X.C08DS;
import X.C1C7U;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public final class QueuedWorkHelper {
    public static Handler LIZ = null;
    public static LinkedList<Runnable> LIZIZ = null;
    public static C08DS LIZJ = null;
    public static Field LIZLLL = null;
    public static Object LJ = null;
    public static boolean LJFF = false;
    public static int LJI = -1;

    public static class ProxyHandler extends BPEAHandler {
        public static boolean LLILLJJLI;
        public static boolean LLILLL;
        public LinkedList<Runnable> LL;

        public ProxyHandler(Looper looper) {
            super(looper);
            this.LL = new LinkedList<>();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            LinkedList<Runnable> linkedList;
            C1C7U.LIZ("QueuedWorkHelper$ProxyHandler@35bb.handleMessage");
            if (this.LL.size() == 0) {
                C1C7U.LIZIZ("QueuedWorkHelper$ProxyHandler@35bb.handleMessage");
                return;
            }
            synchronized (QueuedWorkHelper.LJ) {
                try {
                    linkedList = this.LL;
                    this.LL = new LinkedList<>();
                } finally {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            LLILLJJLI = true;
            int i = QueuedWorkHelper.LJI;
            if (i != -1) {
                try {
                    Thread.sleep(i);
                } catch (InterruptedException e) {
                }
            }
            Iterator<Runnable> it2 = linkedList.iterator();
            while (it2.hasNext()) {
                it2.next().run();
            }
            if (this.LL.size() > 0) {
                sendMessageAtFrontOfQueue(Message.obtain(this, 2));
            } else {
                LLILLJJLI = false;
            }
            C1C7U.LIZIZ("QueuedWorkHelper$ProxyHandler@35bb.handleMessage");
        }

        @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
        public final boolean sendMessageAtTime(Message message, long j) {
            try {
                if (!LLILLL) {
                    QueuedWorkHelper.LIZIZ = (LinkedList) QueuedWorkHelper.LIZLLL.get(null);
                    QueuedWorkHelper.LIZ.removeMessages(1);
                    QueuedWorkHelper.LIZJ.clear();
                    LLILLL = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (QueuedWorkHelper.LIZIZ.size() == 1) {
                this.LL.addLast(QueuedWorkHelper.LIZIZ.poll());
            } else if (QueuedWorkHelper.LIZIZ.size() > 1) {
                this.LL = QueuedWorkHelper.LIZIZ;
                try {
                    LinkedList<Runnable> linkedList = new LinkedList<>();
                    QueuedWorkHelper.LIZIZ = linkedList;
                    QueuedWorkHelper.LIZLLL.set(null, linkedList);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (LLILLJJLI) {
                return true;
            }
            message.what = 2;
            return HandlerHook.sendMessageAtFrontOfQueue(this, message);
        }
    }
}
