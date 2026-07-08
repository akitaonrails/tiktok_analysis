package com.ss.ttlivestreamer.core.utils;

import X.C2188811AlT;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class VideoFrameStatics {
    public static boolean enableCalculatorOpt;
    public static volatile boolean sEnableFrameStaticsOpt;
    public final int mEstRateStatisticsType;
    public final List<Long> mList;
    public long mNativeStatics;
    public int mOptHead;
    public final int mOptMaxSamples;
    public int mOptSize;
    public long[] mOptTimestampsMs;
    public final boolean mUseFrameStaticsOpt;
    public final int mWinMs;

    private void clearOpt() {
        this.mOptHead = 0;
        this.mOptSize = 0;
    }

    private native long nativeCreate();

    private native double nativeGetFrameRate(long j);

    private native void nativeRelease(long j);

    private native void nativeUpdate(long j, int i);

    public synchronized void release() {
        long j = this.mNativeStatics;
        if (j != 0) {
            nativeRelease(j);
            this.mNativeStatics = 0L;
        }
    }

    private void ensureOptCapacity() {
        int i = this.mOptSize;
        long[] jArr = this.mOptTimestampsMs;
        if (i >= jArr.length) {
            int length = jArr.length;
            int i2 = this.mOptMaxSamples;
            if (length < i2) {
                long[] jArr2 = new long[Math.min(jArr.length * 2, i2)];
                for (int i3 = 0; i3 < this.mOptSize; i3++) {
                    long[] jArr3 = this.mOptTimestampsMs;
                    jArr2[i3] = jArr3[(this.mOptHead + i3) % jArr3.length];
                }
                this.mOptTimestampsMs = jArr2;
                this.mOptHead = 0;
            }
        }
    }

    private String getImplementationName() {
        return this.mEstRateStatisticsType == 2 ? "NativeEstimateModule" : this.mUseFrameStaticsOpt ? "JavaRingBufferOpt" : enableCalculatorOpt ? "JavaArrayListCalculatorOpt" : "JavaArrayListLegacy";
    }

    public void add() {
        if (this.mEstRateStatisticsType == 2) {
            long j = this.mNativeStatics;
            if (j != 0) {
                nativeUpdate(j, 1);
                return;
            }
        }
        if (this.mUseFrameStaticsOpt) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this.mList) {
                try {
                    addOpt(jCurrentTimeMillis);
                } finally {
                }
            }
            return;
        }
        synchronized (this.mList) {
            try {
                update(false);
                this.mList.add(Long.valueOf(System.currentTimeMillis()));
            } finally {
            }
        }
    }

    public float getRealRatePerSecond() {
        int i;
        if (this.mEstRateStatisticsType == 2) {
            long j = this.mNativeStatics;
            if (j != 0) {
                return (float) nativeGetFrameRate(j);
            }
        }
        if (!this.mUseFrameStaticsOpt) {
            synchronized (this.mList) {
                try {
                    update(true);
                    if (this.mList.isEmpty()) {
                        return 0.0f;
                    }
                    if (this.mEstRateStatisticsType == 1) {
                        return (this.mList.size() * 1000.0f) / this.mWinMs;
                    }
                    Long l = this.mList.get(0);
                    List<Long> list = this.mList;
                    if (Long.valueOf(list.get(list.size() - 1).longValue() - l.longValue()).longValue() == 0) {
                        return 0.0f;
                    }
                    return (this.mList.size() * 1000.0f) / r4.longValue();
                } finally {
                }
            }
        }
        synchronized (this.mList) {
            try {
                pruneOpt(System.currentTimeMillis());
                int i2 = this.mOptSize;
                if (i2 <= 0 || (i = this.mWinMs) <= 0) {
                    return 0.0f;
                }
                if (this.mEstRateStatisticsType == 1) {
                    return (i2 * 1000.0f) / i;
                }
                long[] jArr = this.mOptTimestampsMs;
                int i3 = this.mOptHead;
                long j2 = jArr[((i3 + i2) - 1) % jArr.length] - jArr[i3];
                if (j2 <= 0) {
                    return 0.0f;
                }
                return (i2 * 1000.0f) / j2;
            } finally {
            }
        }
    }

    public void finalize() {
        release();
    }

    public VideoFrameStatics(int i) {
        this(i, 1);
    }

    private void addOpt(long j) {
        if (this.mWinMs <= 0) {
            clearOpt();
            return;
        }
        pruneOpt(j);
        ensureOptCapacity();
        int i = this.mOptSize;
        long[] jArr = this.mOptTimestampsMs;
        if (i == jArr.length) {
            this.mOptHead = (this.mOptHead + 1) % jArr.length;
            this.mOptSize = i - 1;
        }
        int i2 = this.mOptHead;
        int i3 = this.mOptSize;
        jArr[(i2 + i3) % jArr.length] = j;
        this.mOptSize = i3 + 1;
    }

    private int calculateOptMaxSamples(int i) {
        return (int) Math.max(16L, Math.min(Math.max(1L, (Math.max(i, 1L) + 999) / 1000) * 240, 4096L));
    }

    private void pruneOpt(long j) {
        int i = this.mWinMs;
        if (i <= 0) {
            clearOpt();
            return;
        }
        long j2 = j - ((long) i);
        while (true) {
            int i2 = this.mOptSize;
            if (i2 > 0) {
                long[] jArr = this.mOptTimestampsMs;
                int i3 = this.mOptHead;
                if (jArr[i3] < j2) {
                    this.mOptHead = (i3 + 1) % jArr.length;
                    this.mOptSize = i2 - 1;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public static void setEnableFrameStaticsOpt(boolean z) {
        sEnableFrameStaticsOpt = z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setEnableFrameStaticsOpt:");
        sbLIZ.append(z);
        AVLog.ioe("VideoFrameStatics", C2188811AlT.LIZIZ(sbLIZ));
    }

    private void update(boolean z) {
        if ((z || !enableCalculatorOpt) && !this.mList.isEmpty()) {
            Long lValueOf = Long.valueOf(System.currentTimeMillis() - ((long) this.mWinMs));
            while (!this.mList.isEmpty()) {
                Long l = (Long) ListProtector.get(this.mList, 0);
                if (l.longValue() < lValueOf.longValue()) {
                    if (enableCalculatorOpt) {
                        ListProtector.remove(this.mList, 0);
                    } else {
                        this.mList.remove(l);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public VideoFrameStatics(int i, int i2) {
        boolean z;
        this.mList = new ArrayList();
        this.mWinMs = i;
        this.mEstRateStatisticsType = i2;
        if ((sEnableFrameStaticsOpt || enableCalculatorOpt) && i2 != 2) {
            z = true;
        } else {
            z = false;
        }
        this.mUseFrameStaticsOpt = z;
        int iCalculateOptMaxSamples = calculateOptMaxSamples(i);
        this.mOptMaxSamples = iCalculateOptMaxSamples;
        if (z) {
            this.mOptTimestampsMs = new long[Math.min(16, iCalculateOptMaxSamples)];
        }
        if (i2 == 2) {
            this.mNativeStatics = nativeCreate();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("created implementation:");
        sbLIZ.append(getImplementationName());
        sbLIZ.append(", estRateStatisticsType:");
        sbLIZ.append(i2);
        sbLIZ.append(", winMs:");
        sbLIZ.append(i);
        sbLIZ.append(", enableFrameStaticsOpt:");
        sbLIZ.append(sEnableFrameStaticsOpt);
        sbLIZ.append(", enableCalculatorOpt:");
        sbLIZ.append(enableCalculatorOpt);
        AVLog.ioe("VideoFrameStatics", C2188811AlT.LIZIZ(sbLIZ));
    }
}
