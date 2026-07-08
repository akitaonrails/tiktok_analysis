package com.ss.android.ugc.aweme.memory.profiler.strategy;

import com.bytedance.memrelief.mock.MemoryMock;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes17.dex */
public final class SubMemoryMock {
    public static long[] mmapHandles;
    public static long[] nativeHandles;
    public static final SubMemoryMock INSTANCE = new SubMemoryMock();
    public static final int $stable = 8;

    public final long[] start(int i, int i2) {
        switch (i) {
            case 1:
                MemoryMock.LIZ(i2, true);
                break;
            case 2:
                ArrayList<byte[]> arrayList = MemoryMock.javaByteArrayList;
                if (arrayList != null) {
                    for (byte[] bArr : arrayList) {
                    }
                }
                MemoryMock.javaByteArray = null;
                MemoryMock.javaByteArrayList = null;
                break;
            case 3:
                long[] jArrLIZIZ = MemoryMock.LIZIZ(i2);
                nativeHandles = jArrLIZIZ;
                break;
            case 4:
                long[] jArr = nativeHandles;
                if (jArr != null) {
                    MemoryMock memoryMock = MemoryMock.LIZ;
                    for (long j : jArr) {
                        MemoryMock.freeMalloc(j);
                    }
                }
                nativeHandles = null;
                break;
            case 5:
                long[] jArrLIZJ = MemoryMock.LIZJ(i2);
                mmapHandles = jArrLIZJ;
                break;
            case 6:
                long[] jArr2 = mmapHandles;
                if (jArr2 != null) {
                    MemoryMock.startMunmap(jArr2[0], jArr2[1]);
                }
                mmapHandles = null;
                break;
        }
        return null;
    }
}
