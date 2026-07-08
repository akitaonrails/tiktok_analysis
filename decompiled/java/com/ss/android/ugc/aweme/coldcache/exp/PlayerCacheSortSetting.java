package com.ss.android.ugc.aweme.coldcache.exp;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C452501pT;
import X.C786410Ut5;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class PlayerCacheSortSetting {
    public final C01GW LIZ;
    public final C01GW LIZIZ;

    @C09CT("adjust_similar")
    public final boolean adjustSimilar;

    @C09CT("chunk_size")
    public final int chunkSize;

    @C09CT("coeffs")
    public final List<Double> coefficients;

    @C09CT("dimensions")
    public final List<Integer> dims;

    @C09CT("lower_non_video_rank")
    public final boolean lowerNonVideoRank;

    @C09CT("max_loop_count")
    public final int maxLoopCount;

    @C09CT("max_values")
    public final List<Double> maxValues;

    @C09CT("min_values")
    public final List<Double> minValues;

    @C09CT("need_local_swap")
    public final boolean needLocalSwap;

    @C09CT("only_sort_no_score")
    public final boolean onlySortNoScore;

    @C09CT("pic_pt_params")
    public final List<Double> picPlayTimeParams;

    @C09CT("sort_eps")
    public final double sortEPS;

    @C09CT("sort_omega")
    public final double sortOmega;

    @C09CT("source_weights")
    public final List<Double> sourceWeights;

    @C09CT("sort_type")
    public final int type;

    public PlayerCacheSortSetting() {
        this(0, false, false, null, null, null, null, null, 0.0d, 0.0d, 0, null, false, 0, false, 32767, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerCacheSortSetting)) {
            return false;
        }
        PlayerCacheSortSetting playerCacheSortSetting = (PlayerCacheSortSetting) obj;
        return this.type == playerCacheSortSetting.type && this.adjustSimilar == playerCacheSortSetting.adjustSimilar && this.lowerNonVideoRank == playerCacheSortSetting.lowerNonVideoRank && Intrinsics.LJFF(this.sourceWeights, playerCacheSortSetting.sourceWeights) && Intrinsics.LJFF(this.dims, playerCacheSortSetting.dims) && Intrinsics.LJFF(this.coefficients, playerCacheSortSetting.coefficients) && Intrinsics.LJFF(this.minValues, playerCacheSortSetting.minValues) && Intrinsics.LJFF(this.maxValues, playerCacheSortSetting.maxValues) && Double.compare(this.sortOmega, playerCacheSortSetting.sortOmega) == 0 && Double.compare(this.sortEPS, playerCacheSortSetting.sortEPS) == 0 && this.chunkSize == playerCacheSortSetting.chunkSize && Intrinsics.LJFF(this.picPlayTimeParams, playerCacheSortSetting.picPlayTimeParams) && this.onlySortNoScore == playerCacheSortSetting.onlySortNoScore && this.maxLoopCount == playerCacheSortSetting.maxLoopCount && this.needLocalSwap == playerCacheSortSetting.needLocalSwap;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((this.type * 31) + C786410Ut5.Z2(this.adjustSimilar)) * 31) + C786410Ut5.Z2(this.lowerNonVideoRank)) * 31) + this.sourceWeights.hashCode()) * 31) + this.dims.hashCode()) * 31) + this.coefficients.hashCode()) * 31) + this.minValues.hashCode()) * 31) + this.maxValues.hashCode()) * 31) + C786410Ut5.X2(this.sortOmega)) * 31) + C786410Ut5.X2(this.sortEPS)) * 31) + this.chunkSize) * 31) + this.picPlayTimeParams.hashCode()) * 31) + C786410Ut5.Z2(this.onlySortNoScore)) * 31) + this.maxLoopCount) * 31) + C786410Ut5.Z2(this.needLocalSwap);
    }

    public final String toString() {
        return "PlayerCacheSortSetting(type=" + this.type + ", adjustSimilar=" + this.adjustSimilar + ", lowerNonVideoRank=" + this.lowerNonVideoRank + ", sourceWeights=" + this.sourceWeights + ", dims=" + this.dims + ", coefficients=" + this.coefficients + ", minValues=" + this.minValues + ", maxValues=" + this.maxValues + ", sortOmega=" + this.sortOmega + ", sortEPS=" + this.sortEPS + ", chunkSize=" + this.chunkSize + ", picPlayTimeParams=" + this.picPlayTimeParams + ", onlySortNoScore=" + this.onlySortNoScore + ", maxLoopCount=" + this.maxLoopCount + ", needLocalSwap=" + this.needLocalSwap + ')';
    }

    public PlayerCacheSortSetting(int i, boolean z, boolean z2, List<Double> list, List<Integer> list2, List<Double> list3, List<Double> list4, List<Double> list5, double d, double d2, int i2, List<Double> list6, boolean z3, int i3, boolean z4) {
        this.type = i;
        this.adjustSimilar = z;
        this.lowerNonVideoRank = z2;
        this.sourceWeights = list;
        this.dims = list2;
        this.coefficients = list3;
        this.minValues = list4;
        this.maxValues = list5;
        this.sortOmega = d;
        this.sortEPS = d2;
        this.chunkSize = i2;
        this.picPlayTimeParams = list6;
        this.onlySortNoScore = z3;
        this.maxLoopCount = i3;
        this.needLocalSwap = z4;
        this.LIZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 67));
        this.LIZIZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 68));
    }

    public PlayerCacheSortSetting(int i, boolean z, boolean z2, List list, List list2, List list3, List list4, List list5, double d, double d2, int i2, List list6, boolean z3, int i3, boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? true : z, (i4 & 4) != 0 ? false : z2, (i4 & 8) != 0 ? C13BV.INSTANCE : list, (i4 & 16) != 0 ? C13BV.INSTANCE : list2, (i4 & 32) != 0 ? C13BV.INSTANCE : list3, (i4 & 64) != 0 ? C13BV.INSTANCE : list4, (i4 & 128) != 0 ? C13BV.INSTANCE : list5, (i4 & 256) != 0 ? 0.0d : d, (i4 & 512) != 0 ? 0.001d : d2, (i4 & 1024) != 0 ? 500 : i2, (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C13BV.INSTANCE : list6, (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z3, (i4 & 8192) != 0 ? 10 : i3, (i4 & 16384) != 0 ? false : z4);
    }
}
