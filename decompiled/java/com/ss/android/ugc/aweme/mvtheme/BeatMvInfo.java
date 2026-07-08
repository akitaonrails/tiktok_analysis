package com.ss.android.ugc.aweme.mvtheme;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class BeatMvInfo implements Serializable {

    @C09CT("beat_mv_dst_in")
    public final int dstIn;

    @C09CT("beat_mv_dst_out")
    public final int dstOut;

    @C09CT("beat_mv_music_key")
    public String musicKey;

    @C09CT("beat_mv_music_path")
    public final String musicName;

    @C09CT("beat_mv_bit_time")
    public float[] times;

    @C09CT("beat_mv_trim_in")
    public final int trimIn;

    @C09CT("beat_mv_trim_out")
    public final int trimOut;

    @C09CT("beat_mv_bit_value")
    public int[] values;

    public final void setMusicKey(String str) {
        this.musicKey = str;
    }

    public final void setTimes(float[] fArr) {
        this.times = fArr;
    }

    public final void setValues(int[] iArr) {
        this.values = iArr;
    }

    public BeatMvInfo(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, String str, String str2) {
        this.values = iArr;
        this.times = fArr;
        this.trimIn = i;
        this.trimOut = i2;
        this.dstIn = i3;
        this.dstOut = i4;
        this.musicName = str;
        this.musicKey = str2;
    }
}
