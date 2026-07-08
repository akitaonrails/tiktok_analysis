package com.ss.android.ugc.aweme.dsp.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class CopyrightRestrictions {

    @C09CT("min_duration_mark_played")
    public final int minDuration = 30;

    @C09CT("max_musics_per_day")
    public final int maxMusics = 10;

    public final int getMaxMusics() {
        return this.maxMusics;
    }

    public final int getMinDuration() {
        return this.minDuration;
    }
}
