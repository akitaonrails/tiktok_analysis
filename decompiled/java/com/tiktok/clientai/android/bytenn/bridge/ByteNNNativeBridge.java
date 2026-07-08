package com.tiktok.clientai.android.bytenn.bridge;

import X.C13LP;
import X.C15438062q;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes21.dex */
public final class ByteNNNativeBridge {
    public static final AtomicLong LIZJ = new AtomicLong(0);
    public final String LIZ;
    public final long LIZIZ;

    private final native long nativeInitEngine(long j, String str, int i, int i2, String str2);

    private final native boolean nativeIsModelLoaded(long j, String str);

    private final native void nativeReleaseModel(long j, String str);

    private final native ByteNNRet runByteNN(long j, String str, float[] fArr, int[] iArr, int i, int i2, String str2);

    private final native ByteNNRet runByteNNWithPtr(long j, String str, long j2, int i, int i2, int i3, String str2);

    public final boolean LIZLLL() {
        return nativeIsModelLoaded(this.LIZIZ, this.LIZ);
    }

    public final void LJ() {
        nativeReleaseModel(this.LIZIZ, this.LIZ);
    }

    public ByteNNNativeBridge(String str) {
        this.LIZ = str;
        LoadSoLancet.LIZJ("client_ai_impl_jni");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("client_ai_impl_jni");
        LoadSoLancet.LJ(jUptimeMillis, "client_ai_impl_jni");
        LoadSoLancet.LIZLLL(jUptimeMillis, "client_ai_impl_jni");
        LoadSoLancet.LIZIZ("client_ai_impl_jni");
        this.LIZIZ = LIZJ.incrementAndGet();
    }

    public final ByteNNRet LIZ(int i, int i2, String str, List list) {
        Iterator it2 = list.iterator();
        int length = 0;
        while (it2.hasNext()) {
            length += ((float[]) it2.next()).length;
        }
        if (length == 0 && (!list.isEmpty())) {
            return new ByteNNRet(-1, "Input data contains only empty arrays.", null);
        }
        float[] fArr = new float[length];
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList.add(Integer.valueOf(((float[]) it3.next()).length));
        }
        int[] iArrLLII = C13LP.LLII(arrayList);
        Iterator it4 = list.iterator();
        int length2 = 0;
        while (it4.hasNext()) {
            float[] fArr2 = (float[]) it4.next();
            System.arraycopy(fArr2, 0, fArr, length2, fArr2.length);
            length2 += fArr2.length;
        }
        return runByteNN(this.LIZIZ, this.LIZ, fArr, iArrLLII, i, i2, str);
    }

    public final void LIZJ(int i, int i2, String str, String str2) {
        nativeInitEngine(this.LIZIZ, str, i, i2, str2);
    }

    public final ByteNNRet LIZIZ(int i, int i2, int i3, String str, long j) {
        if (j != 0 && i > 0) {
            return runByteNNWithPtr(this.LIZIZ, this.LIZ, j, i, i2, i3, str);
        }
        return new ByteNNRet(-1, "input null", null);
    }
}
