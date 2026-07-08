package com.bytedance.otis.memory;

import X.C09DL;
import X.C311940CKq;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.internal.w;
import com.google.gson.k;
import com.google.gson.n;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class OtisGson {
    public static native long create(boolean z, int i);

    public static native ByteBuffer readBuffer(long j);

    public static native char[] readCharArray(long j);

    public static native String readString(long j);

    public static native void release(long j);

    public static native void writeCharArray(long j, char[] cArr, int i, int i2);

    public static native void writeInt(long j, int i);

    public static native void writeString(long j, String str, int i, int i2);

    static {
        EnsureLoad.init();
    }

    public final synchronized long LIZ(int i, n nVar, boolean z) {
        long jCreate = create(z, i);
        if (jCreate == 0) {
            return 0L;
        }
        try {
            C09DL c09dl = new C09DL(new C311940CKq(jCreate));
            c09dl.LLILZLL = true;
            w.LIZIZ(nVar, c09dl);
            return jCreate;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            release(jCreate);
            return 0L;
        }
    }

    public final synchronized String LIZIZ(k kVar, boolean z, int i) {
        long jCreate = create(z, i);
        if (jCreate != 0) {
            try {
                C09DL c09dl = new C09DL(new C311940CKq(jCreate));
                c09dl.LLILZLL = true;
                w.LIZIZ(kVar, c09dl);
                String string = readString(jCreate);
                if (string != null) {
                    release(jCreate);
                    return string;
                }
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            release(jCreate);
        }
        return kVar.toString();
    }
}
