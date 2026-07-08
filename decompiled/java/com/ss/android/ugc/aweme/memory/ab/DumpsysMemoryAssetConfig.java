package com.ss.android.ugc.aweme.memory.ab;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes.dex */
public final class DumpsysMemoryAssetConfig {
    public static final int $stable = 0;

    @C09CT("interval")
    public final long interval;

    @C09CT("minCount")
    public final int minCount;

    @C09CT("sample")
    public final float sample;

    public DumpsysMemoryAssetConfig() {
        this(0.0f, 600000L, 50);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DumpsysMemoryAssetConfig)) {
            return false;
        }
        DumpsysMemoryAssetConfig dumpsysMemoryAssetConfig = (DumpsysMemoryAssetConfig) obj;
        return Float.compare(this.sample, dumpsysMemoryAssetConfig.sample) == 0 && this.interval == dumpsysMemoryAssetConfig.interval && this.minCount == dumpsysMemoryAssetConfig.minCount;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DumpsysMemoryAssetConfig(sample=");
        sbLIZ.append(this.sample);
        sbLIZ.append(", interval=");
        sbLIZ.append(this.interval);
        sbLIZ.append(", minCount=");
        sbLIZ.append(this.minCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.sample) * 31) + C786410Ut5.Y2(this.interval)) * 31) + this.minCount;
    }

    public DumpsysMemoryAssetConfig(float f, long j, int i) {
        this.sample = f;
        this.interval = j;
        this.minCount = i;
    }
}
