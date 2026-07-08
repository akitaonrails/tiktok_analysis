package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class Volume implements Serializable {

    @C09CT("loudness")
    public final Double loudness;

    @C09CT("loudness_range")
    public final Double loudnessRange;

    @C09CT("loudness_range_end")
    public final Double loudnessRangeEnd;

    @C09CT("loudness_range_start")
    public final Double loudnessRangeStart;

    @C09CT("maximum_momentary_loudness")
    public final Double maximumMomentaryLoudness;

    @C09CT("maximum_short_term_loudness")
    public final Double maximumShortTermLoudness;

    @C09CT("peak")
    public final Double peak;

    @C09CT("version")
    public final Integer version;

    @C09CT("volume_info_json")
    public final String volumeInfoJson;

    public Volume() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Volume)) {
            return false;
        }
        Volume volume = (Volume) obj;
        return Intrinsics.LJFF(this.loudness, volume.loudness) && Intrinsics.LJFF(this.peak, volume.peak) && Intrinsics.LJFF(this.maximumMomentaryLoudness, volume.maximumMomentaryLoudness) && Intrinsics.LJFF(this.maximumShortTermLoudness, volume.maximumShortTermLoudness) && Intrinsics.LJFF(this.loudnessRangeStart, volume.loudnessRangeStart) && Intrinsics.LJFF(this.loudnessRangeEnd, volume.loudnessRangeEnd) && Intrinsics.LJFF(this.loudnessRange, volume.loudnessRange) && Intrinsics.LJFF(this.version, volume.version) && Intrinsics.LJFF(this.volumeInfoJson, volume.volumeInfoJson);
    }

    public int hashCode() {
        Double d = this.loudness;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.peak;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.maximumMomentaryLoudness;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.maximumShortTermLoudness;
        int iHashCode4 = (iHashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.loudnessRangeStart;
        int iHashCode5 = (iHashCode4 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.loudnessRangeEnd;
        int iHashCode6 = (iHashCode5 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.loudnessRange;
        int iHashCode7 = (iHashCode6 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Integer num = this.version;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.volumeInfoJson;
        return iHashCode8 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Volume(loudness=");
        sbLIZ.append(this.loudness);
        sbLIZ.append(", peak=");
        sbLIZ.append(this.peak);
        sbLIZ.append(", maximumMomentaryLoudness=");
        sbLIZ.append(this.maximumMomentaryLoudness);
        sbLIZ.append(", maximumShortTermLoudness=");
        sbLIZ.append(this.maximumShortTermLoudness);
        sbLIZ.append(", loudnessRangeStart=");
        sbLIZ.append(this.loudnessRangeStart);
        sbLIZ.append(", loudnessRangeEnd=");
        sbLIZ.append(this.loudnessRangeEnd);
        sbLIZ.append(", loudnessRange=");
        sbLIZ.append(this.loudnessRange);
        sbLIZ.append(", version=");
        sbLIZ.append(this.version);
        sbLIZ.append(", volumeInfoJson=");
        sbLIZ.append(this.volumeInfoJson);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Volume(Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, Integer num, String str) {
        this.loudness = d;
        this.peak = d2;
        this.maximumMomentaryLoudness = d3;
        this.maximumShortTermLoudness = d4;
        this.loudnessRangeStart = d5;
        this.loudnessRangeEnd = d6;
        this.loudnessRange = d7;
        this.version = num;
        this.volumeInfoJson = str;
    }
}
