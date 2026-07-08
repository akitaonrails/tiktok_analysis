package com.bytedance.memrelief.mock;

import X.C13LP;
import X.C2188811AlT;
import com.bytedance.memrelief.utils.EnsureLoad;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes17.dex */
public final class MemoryMock {
    public static final MemoryMock LIZ = new MemoryMock();
    public static byte[] javaByteArray;
    public static ArrayList<byte[]> javaByteArrayList;

    public static final native int crash();

    public static final native void freeMalloc(long j);

    public static final native long startMalloc(int i, boolean z);

    public static final native void startMmap(int i, boolean z, long[] jArr);

    public static final native void startMunmap(long j, long j2);

    static {
        EnsureLoad.init();
    }

    public static long[] LIZIZ(int i) {
        long jStartMalloc;
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 100);
            try {
                jStartMalloc = startMalloc(iMin * 1024 * 1024, true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                jStartMalloc = 0;
            }
            arrayList.add(Long.valueOf(jStartMalloc));
            i -= iMin;
        }
        return C13LP.LLIIIILZ(arrayList);
    }

    public static final long[] LIZJ(int i) {
        long[] jArr = new long[2];
        try {
            startMmap(i * 1024 * 1024, true, jArr);
            return jArr;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return jArr;
        }
    }

    public static final void LIZ(int i, boolean z) {
        Integer numValueOf = null;
        if (z) {
            LIZ.getClass();
            long j = ((long) i) * 1024 * 1024;
            ArrayList<byte[]> arrayList = new ArrayList<>(((int) (j / ((long) 4000))) + 1);
            long j2 = 0;
            while (j2 < j) {
                int i2 = (int) (j - j2);
                if (i2 < 1) {
                    i2 = 1;
                }
                int iMin = Math.min(4000, i2);
                byte[] bArr = new byte[iMin];
                Arrays.fill(bArr, 0, iMin, (byte) 1);
                arrayList.add(bArr);
                j2 += (long) iMin;
            }
            javaByteArrayList = arrayList;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("javaAllocate(small) ");
            sbLIZ.append(i);
            sbLIZ.append("MB ok totalBytes:");
            sbLIZ.append(j2);
            sbLIZ.append(" chunks:");
            sbLIZ.append(arrayList.size());
            sbLIZ.append(" chunkSize:4000 firstByte:");
            sbLIZ.append((int) ((byte[]) ListProtector.get(arrayList, 0))[0]);
            sbLIZ.append(" holderChunks:");
            ArrayList<byte[]> arrayList2 = javaByteArrayList;
            if (arrayList2 != null) {
                numValueOf = Integer.valueOf(arrayList2.size());
            }
            sbLIZ.append(numValueOf);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        LIZ.getClass();
        int i3 = i * 1024 * 1024;
        byte[] bArr2 = new byte[i3];
        Arrays.fill(bArr2, 0, i3, (byte) 1);
        javaByteArray = bArr2;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("javaAllocate(large) ");
        sbLIZ2.append(i);
        sbLIZ2.append("MB ok size:");
        sbLIZ2.append(i3);
        sbLIZ2.append(" firstByte:");
        sbLIZ2.append((int) bArr2[0]);
        sbLIZ2.append(" holderSize:");
        byte[] bArr3 = javaByteArray;
        if (bArr3 != null) {
            numValueOf = Integer.valueOf(bArr3.length);
        }
        sbLIZ2.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ2);
    }
}
