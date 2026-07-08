package com.bytedance.applog.compress;

import X.C2209791BeD;
import X.C2210391BfB;
import X.C844080X9i;
import X.InterfaceC2209561Bdq;
import X.InterfaceC2211301Bge;
import android.content.Context;
import com.bytedance.compression.zstd.ZstdCompress;
import com.bytedance.compression.zstd.ZstdDictCompress;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;

/* JADX INFO: loaded from: classes35.dex */
public class CompressManager {
    public static byte[] mDictionary = null;
    public static int sZstdLevel = 15;
    public final Context mContext;
    public final InterfaceC2209561Bdq mLogger;

    public static void setReportStatsEnabled(boolean z) {
    }

    private int getEncodeType(int i) {
        if (i == 2 && mDictionary == null) {
            return 1;
        }
        return i;
    }

    public static void setZstdDict(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            mDictionary = Arrays.copyOf(bArr, bArr.length);
        }
    }

    public static void setZstdLevel(int i) {
        sZstdLevel = i;
    }

    public CompressManager(Context context, InterfaceC2209561Bdq interfaceC2209561Bdq) {
        this.mContext = context;
        this.mLogger = interfaceC2209561Bdq == null ? C2209791BeD.LJIJJ() : interfaceC2209561Bdq;
    }

    public byte[] compressUsingGzip(byte[] bArr, C2210391BfB c2210391BfB) {
        int length;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        c2210391BfB.LIZ = length;
        c2210391BfB.LIZJ = 0;
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArrLIZ = C844080X9i.LIZ(bArr);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        c2210391BfB.LJ = 0;
        c2210391BfB.LIZLLL = jCurrentTimeMillis2 - jCurrentTimeMillis;
        c2210391BfB.LIZIZ = bArrLIZ.length;
        return bArrLIZ;
    }

    public byte[] compress(byte[] bArr, int i, C2210391BfB c2210391BfB) {
        int encodeType = getEncodeType(i);
        if (encodeType != 0) {
            if (encodeType == 1 || encodeType == 2) {
                bArr = compressUsingZstd(bArr, c2210391BfB, i);
            }
        } else {
            bArr = compressUsingGzip(bArr, c2210391BfB);
        }
        if (bArr == null || bArr.length == 0) {
            return compressUsingGzip(bArr, c2210391BfB);
        }
        return bArr;
    }

    public byte[] compressUsingZstd(byte[] bArr, C2210391BfB c2210391BfB, int i) {
        c2210391BfB.LIZ = bArr.length;
        c2210391BfB.LIZJ = i;
        byte[] bArrCompress = null;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (i == 2 && mDictionary != null) {
                bArrCompress = ZstdCompress.compress(bArr, new ZstdDictCompress(mDictionary, sZstdLevel));
            } else {
                bArrCompress = ZstdCompress.compress(bArr, sZstdLevel);
            }
            c2210391BfB.LIZLLL = System.currentTimeMillis() - jCurrentTimeMillis;
            c2210391BfB.LIZIZ = bArrCompress.length;
            c2210391BfB.LJ = 0;
            return bArrCompress;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mLogger.LJIILIIL(14, "compress with zstd failed", th, new Object[0]);
            c2210391BfB.LJ = 1;
            return bArrCompress;
        }
    }

    public CompressManager(Context context, String str, InterfaceC2211301Bge interfaceC2211301Bge, InterfaceC2209561Bdq interfaceC2209561Bdq) {
        this(context, interfaceC2209561Bdq);
    }
}
