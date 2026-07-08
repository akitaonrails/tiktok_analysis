package com.ss.android.ugc.aweme.memory.ab;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MemoryDumpsysDbConfig {

    @C09CT("blackDb")
    public final List<String> blackDb;

    @C09CT("detail")
    public final boolean fullDetail;

    @C09CT("interval")
    public final long interval;

    @C09CT("minDb")
    public final long minDB;

    @C09CT("minHitRate")
    public final double minHitRate;

    @C09CT("sample")
    public final float sample;

    public MemoryDumpsysDbConfig() {
        this(0.0f, 300000L, false, 1024L, 0.6d, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemoryDumpsysDbConfig)) {
            return false;
        }
        MemoryDumpsysDbConfig memoryDumpsysDbConfig = (MemoryDumpsysDbConfig) obj;
        return Float.compare(this.sample, memoryDumpsysDbConfig.sample) == 0 && this.interval == memoryDumpsysDbConfig.interval && this.fullDetail == memoryDumpsysDbConfig.fullDetail && this.minDB == memoryDumpsysDbConfig.minDB && Double.compare(this.minHitRate, memoryDumpsysDbConfig.minHitRate) == 0 && Intrinsics.LJFF(this.blackDb, memoryDumpsysDbConfig.blackDb);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MemoryDumpsysDbConfig(sample=");
        sbLIZ.append(this.sample);
        sbLIZ.append(", interval=");
        sbLIZ.append(this.interval);
        sbLIZ.append(", fullDetail=");
        sbLIZ.append(this.fullDetail);
        sbLIZ.append(", minDB=");
        sbLIZ.append(this.minDB);
        sbLIZ.append(", minHitRate=");
        sbLIZ.append(this.minHitRate);
        sbLIZ.append(", blackDb=");
        sbLIZ.append(this.blackDb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iFloatToIntBits = ((((((((Float.floatToIntBits(this.sample) * 31) + C786410Ut5.Y2(this.interval)) * 31) + C786410Ut5.Z2(this.fullDetail)) * 31) + C786410Ut5.Y2(this.minDB)) * 31) + C786410Ut5.X2(this.minHitRate)) * 31;
        List<String> list = this.blackDb;
        return iFloatToIntBits + (list == null ? 0 : list.hashCode());
    }

    public MemoryDumpsysDbConfig(float f, long j, boolean z, long j2, double d, List<String> list) {
        this.sample = f;
        this.interval = j;
        this.fullDetail = z;
        this.minDB = j2;
        this.minHitRate = d;
        this.blackDb = list;
    }
}
