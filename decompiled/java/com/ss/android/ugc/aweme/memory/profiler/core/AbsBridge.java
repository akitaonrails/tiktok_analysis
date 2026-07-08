package com.ss.android.ugc.aweme.memory.profiler.core;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbsBridge {
    public final AtomicLong msgSeq = new AtomicLong(0);

    public abstract int getType();

    public abstract void onReceive(int i, boolean z, String str, n nVar);

    public final String nextAndroidMsgId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("android_#");
        sbLIZ.append(this.msgSeq.incrementAndGet());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void sendEvent(int i, n nVar) {
        send(i, nextAndroidMsgId(), nVar);
    }

    private final void send(int i, String str, n nVar) {
        try {
            nVar.LJJIII(Long.valueOf(System.currentTimeMillis()), "ts");
            SocketBridge.INSTANCE.sendMessage(new BridgeMessage(getType(), i, null, str, nVar));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void sendAck(int i, String str, n nVar) {
        nVar.LJJII(Boolean.TRUE, "ack");
        send(i, str, nVar);
    }

    public static /* synthetic */ void sendAck$default(AbsBridge absBridge, int i, String str, n nVar, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                nVar = new n();
            }
            absBridge.sendAck(i, str, nVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendAck");
    }
}
