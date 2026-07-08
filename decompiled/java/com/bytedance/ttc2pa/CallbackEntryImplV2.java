package com.bytedance.ttc2pa;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes35.dex */
public final class CallbackEntryImplV2 {
    public static final Companion Companion = new Companion();

    public static final class Companion {
    }

    public static final ByteBuffer invoke(long j, long j2, long j3, ByteBuffer byteBuffer) {
        MoltenFFICallback moltenFFICallback;
        Companion.getClass();
        CallbackInstance callbackInstance = CallbackInstance.LIZ;
        synchronized (callbackInstance) {
            try {
                moltenFFICallback = (MoltenFFICallback) ((LinkedHashMap) CallbackInstance.LIZJ).get(Long.valueOf(j2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (moltenFFICallback != null) {
            if (j3 == 0) {
                callbackInstance.LIZ(j2);
            }
            return moltenFFICallback.LIZIZ(j3, byteBuffer).LIZ;
        }
        return null;
    }
}
