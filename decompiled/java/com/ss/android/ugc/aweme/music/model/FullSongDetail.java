package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class FullSongDetail implements Serializable {

    @C09CT("full_song_duration")
    public Long fullSongDuration;

    @C09CT("full_song_duration_precision")
    public Double fullSongDurationPrecision;

    @C09CT("full_song_id")
    public String fullSongId;

    @C09CT("full_song_shoot_duration")
    public Integer fullSongShootDuration;

    @C09CT("full_song_shoot_duration_precision")
    public Float fullSongShootDurationPrecision;

    @C09CT("full_song_strong_beat_url")
    public FullSongUrlStruct fullSongStrongBeatUrl;

    @C09CT("full_song_play_url")
    public FullSongUrlStruct fullSongUrl;

    public final Long getFullSongDuration() {
        return this.fullSongDuration;
    }

    public final Double getFullSongDurationPrecision() {
        return this.fullSongDurationPrecision;
    }

    public final String getFullSongId() {
        return this.fullSongId;
    }

    public final Integer getFullSongShootDuration() {
        return this.fullSongShootDuration;
    }

    public final Float getFullSongShootDurationPrecision() {
        return this.fullSongShootDurationPrecision;
    }

    public final FullSongUrlStruct getFullSongStrongBeatUrl() {
        return this.fullSongStrongBeatUrl;
    }

    public final FullSongUrlStruct getFullSongUrl() {
        return this.fullSongUrl;
    }

    public final void setFullSongDuration(Long l) {
        this.fullSongDuration = l;
    }

    public final void setFullSongDurationPrecision(Double d) {
        this.fullSongDurationPrecision = d;
    }

    public final void setFullSongId(String str) {
        this.fullSongId = str;
    }

    public final void setFullSongShootDuration(Integer num) {
        this.fullSongShootDuration = num;
    }

    public final void setFullSongShootDurationPrecision(Float f) {
        this.fullSongShootDurationPrecision = f;
    }

    public final void setFullSongStrongBeatUrl(FullSongUrlStruct fullSongUrlStruct) {
        this.fullSongStrongBeatUrl = fullSongUrlStruct;
    }

    public final void setFullSongUrl(FullSongUrlStruct fullSongUrlStruct) {
        this.fullSongUrl = fullSongUrlStruct;
    }
}
