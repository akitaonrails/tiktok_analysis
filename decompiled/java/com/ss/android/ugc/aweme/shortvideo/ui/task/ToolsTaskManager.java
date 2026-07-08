package com.ss.android.ugc.aweme.shortvideo.ui.task;

import X.C01GW;
import X.C452501pT;
import X.EnumC194317110p;
import X.InterfaceC1408530ml1;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class ToolsTaskManager {
    public boolean LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(188));
    public final Map<EnumC194317110p, ConcurrentLinkedQueue<InterfaceC1408530ml1>> LIZJ = new LinkedHashMap();
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 290));

    public final WorkerHandler LIZ() {
        return (WorkerHandler) this.LIZLLL.getValue();
    }

    public final class WorkerHandler extends BPEAHandler {
        /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[PHI: r0
          0x0044: PHI (r0v9 X.0ml1) = (r0v8 X.0ml1), (r0v13 X.0ml1) binds: [B:11:0x003e, B:7:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void handleMessage(android.os.Message r7) {
            /*
                r6 = this;
                java.lang.String r5 = "ToolsTaskManager$WorkerHandler@86f5.handleMessage"
                X.C1C7U.LIZ(r5)
                super.handleMessage(r7)
                int r1 = r7.what
                X.0MyH r4 = X.EnumC585790MyH.TASK_EXEC
                int r0 = r4.ordinal()
                if (r1 != r0) goto L40
                com.ss.android.ugc.aweme.shortvideo.ui.task.ToolsTaskManager r2 = com.ss.android.ugc.aweme.shortvideo.ui.task.ToolsTaskManager.this
                java.util.Map<X.110p, java.util.concurrent.ConcurrentLinkedQueue<X.0ml1>> r1 = r2.LIZJ
                X.110p r0 = X.EnumC194317110p.P1
                java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
                java.lang.Object r0 = r1.get(r0)
                java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
                if (r0 == 0) goto L2a
                java.lang.Object r0 = r0.poll()
                X.0ml1 r0 = (X.InterfaceC1408530ml1) r0
                if (r0 != 0) goto L44
            L2a:
                java.util.Map<X.110p, java.util.concurrent.ConcurrentLinkedQueue<X.0ml1>> r1 = r2.LIZJ
                X.110p r0 = X.EnumC194317110p.P2
                java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
                java.lang.Object r0 = r1.get(r0)
                java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
                if (r0 == 0) goto L40
                java.lang.Object r0 = r0.poll()
                X.0ml1 r0 = (X.InterfaceC1408530ml1) r0
                if (r0 != 0) goto L44
            L40:
                X.C1C7U.LIZIZ(r5)
                return
            L44:
                X.C1408220mkW.LIZ(r0)
                com.ss.android.ugc.aweme.shortvideo.ui.task.ToolsTaskManager$WorkerHandler r3 = r2.LIZ()
                android.os.Message r2 = android.os.Message.obtain()
                int r0 = r4.ordinal()
                r2.what = r0
                r0 = 200(0xc8, double:9.9E-322)
                r3.sendMessageDelayed(r2, r0)
                goto L40
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.task.ToolsTaskManager.WorkerHandler.handleMessage(android.os.Message):void");
        }

        public WorkerHandler(Looper looper) {
            super(looper);
        }
    }
}
