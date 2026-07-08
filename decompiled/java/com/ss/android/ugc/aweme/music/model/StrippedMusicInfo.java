package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class StrippedMusicInfo implements Serializable {

    @C09CT("author_name")
    public String authorName;

    @C09CT("end_time_in_ms")
    public Integer endTimeInMs;

    @C09CT("music_id")
    public String musicId;

    @C09CT("music_name")
    public String musicName;

    @C09CT("start_time_in_ms")
    public Integer startTimeInMs;

    public final String getAuthorName() {
        return this.authorName;
    }

    public final Integer getEndTimeInMs() {
        return this.endTimeInMs;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getMusicName() {
        return this.musicName;
    }

    public final Integer getStartTimeInMs() {
        return this.startTimeInMs;
    }

    public final void setAuthorName(String str) {
        this.authorName = str;
    }

    public final void setEndTimeInMs(Integer num) {
        this.endTimeInMs = num;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setMusicName(String str) {
        this.musicName = str;
    }

    public final void setStartTimeInMs(Integer num) {
        this.startTimeInMs = num;
    }
}
