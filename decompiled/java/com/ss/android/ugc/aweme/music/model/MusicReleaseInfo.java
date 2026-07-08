package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class MusicReleaseInfo implements Serializable {

    @C09CT("group_release_date")
    public long groupReleaseDate;

    @C09CT("is_new_release_song")
    public boolean isNewReleaseSong;

    public MusicReleaseInfo() {
    }

    public final boolean isNewReleaseSong() {
        return this.isNewReleaseSong;
    }

    public MusicReleaseInfo(boolean z, long j) {
        this.isNewReleaseSong = z;
        this.groupReleaseDate = j;
    }
}
