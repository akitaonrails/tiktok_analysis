package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes24.dex */
public final class MusicVolumeInfo implements Serializable {

    @C09CT("Loudness")
    public final Float loudness;

    @C09CT("LoudnessRange")
    public final Float loudnessRange;

    @C09CT("LoudnessRangeEnd")
    public final Float loudnessRangeEnd;

    @C09CT("MaximumMomentaryLoudness")
    public final Float maximumMomentaryLoudness;

    @C09CT("MaximumShortTermLoudness")
    public final Float maximumShortTermLoudness;

    @C09CT("Peak")
    public final Float peak;

    @C09CT("Version")
    public final Integer version;

    public MusicVolumeInfo() {
        this(null, null, null, null, null, null, null);
    }

    public MusicVolumeInfo(Float f, Float f2, Integer num, Float f3, Float f4, Float f5, Float f6) {
        this.peak = f;
        this.loudness = f2;
        this.version = num;
        this.loudnessRangeEnd = f3;
        this.loudnessRange = f4;
        this.maximumMomentaryLoudness = f5;
        this.maximumShortTermLoudness = f6;
    }
}
