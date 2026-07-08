package com.ss.android.ugc.aweme.music.model;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public class MusicRecallInfo {

    @C09CT("music_id")
    public long id;

    @C09CT("recall_reason")
    public String recallReason;

    public long getId() {
        return this.id;
    }

    public String getRecallReason() {
        return this.recallReason;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setRecallReason(String str) {
        this.recallReason = str;
    }
}
