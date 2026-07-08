package com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android;

import X.C972890bQN;
import X.C972910bQP;
import X.InterfaceC972900bQO;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes16.dex */
public final class CallbackEntryImplV2 {
    public static final C972910bQP Companion = new Object() { // from class: X.0bQP
    };

    public static final ByteBuffer invoke(long j, long j2, long j3, ByteBuffer byteBuffer) {
        InterfaceC972900bQO interfaceC972900bQO;
        Companion.getClass();
        C972890bQN c972890bQN = C972890bQN.LIZ;
        synchronized (c972890bQN) {
            try {
                interfaceC972900bQO = (InterfaceC972900bQO) ((LinkedHashMap) C972890bQN.LIZJ).get(Long.valueOf(j2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (interfaceC972900bQO != null) {
            if (j3 == 0) {
                c972890bQN.LIZIZ(j2);
            }
            return interfaceC972900bQO.LIZIZ(j3, byteBuffer).LIZ;
        }
        return null;
    }
}
