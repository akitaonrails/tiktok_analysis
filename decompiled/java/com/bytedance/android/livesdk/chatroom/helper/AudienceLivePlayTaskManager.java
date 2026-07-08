package com.bytedance.android.livesdk.chatroom.helper;

import X.AbstractC464380IIy;
import X.C1C7U;
import X.C464370IIx;
import X.C786410Ut5;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class AudienceLivePlayTaskManager {
    public static volatile AudienceLivePlayTaskManager LJI;
    public long LIZLLL;
    public final List<AbstractC464380IIy> LIZ = new CopyOnWriteArrayList();
    public boolean LIZIZ = false;
    public long LIZJ = -1;
    public final Map<String, Object> LJ = new HashMap();
    public final Handler LJFF = new BPEAHandler(Looper.getMainLooper()) { // from class: com.bytedance.android.livesdk.chatroom.helper.AudienceLivePlayTaskManager.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("AudienceLivePlayTaskManager@e2d5.<field>$1");
            super.handleMessage(message);
            if (!(HandlerHook.getMessageObj(message.obj) instanceof C464370IIx)) {
                C1C7U.LIZIZ("AudienceLivePlayTaskManager@e2d5.<field>$1");
                return;
            }
            C464370IIx c464370IIx = (C464370IIx) HandlerHook.getMessageObj(message.obj);
            if (c464370IIx.LIZJ == 100) {
                ((CopyOnWriteArrayList) AudienceLivePlayTaskManager.this.LIZ).remove(c464370IIx.LIZ);
            }
            AbstractC464380IIy abstractC464380IIy = c464370IIx.LIZ;
            if (abstractC464380IIy != null) {
                abstractC464380IIy.LIZ(c464370IIx.LIZIZ);
            }
            C1C7U.LIZIZ("AudienceLivePlayTaskManager@e2d5.<field>$1");
        }
    };

    public static AudienceLivePlayTaskManager LIZIZ() {
        if (LJI == null) {
            synchronized (AudienceLivePlayTaskManager.class) {
                try {
                    if (LJI == null) {
                        LJI = new AudienceLivePlayTaskManager();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJI;
    }

    public final long LIZ() {
        return this.LIZLLL + (this.LIZJ > 0 ? SystemClock.elapsedRealtime() - this.LIZJ : 0L);
    }

    public final void LIZJ() {
        this.LJFF.removeMessages(100);
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            LIZLLL((AbstractC464380IIy) it2.next());
        }
    }

    public final void LIZLLL(AbstractC464380IIy abstractC464380IIy) {
        if (abstractC464380IIy == null) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        messageObtain.obj = new C464370IIx(abstractC464380IIy, this.LJ);
        C786410Ut5.LJLJLJ(this.LJFF, messageObtain, abstractC464380IIy.LIZ - LIZ());
    }
}
