package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class Dsp implements Serializable {

    @C09CT("collect_status")
    public int collectStatus = -1;

    @C09CT("default_performer_avatar")
    public MusicAvatar defaultPerformerAvatar;

    @C09CT("full_clip_author")
    public String fullClipAuthor;

    @C09CT("full_clip_id")
    public String fullClipId;

    @C09CT("full_clip_title")
    public String fullClipTitle;

    @C09CT("is_show_entrance")
    public boolean isShowEntrance;

    @C09CT("mv_id")
    public long mvId;

    public final boolean isCollected() {
        return this.collectStatus == 1;
    }

    public final int getCollectStatus() {
        return this.collectStatus;
    }

    public final MusicAvatar getDefaultPerformerAvatar() {
        return this.defaultPerformerAvatar;
    }

    public final String getFullClipAuthor() {
        return this.fullClipAuthor;
    }

    public final String getFullClipId() {
        return this.fullClipId;
    }

    public final String getFullClipTitle() {
        return this.fullClipTitle;
    }

    public final long getMvId() {
        return this.mvId;
    }

    public final boolean isShowEntrance() {
        return this.isShowEntrance;
    }

    public final boolean shouldShowAnchor() {
        return this.isShowEntrance;
    }

    public final void setCollectStatus(int i) {
        this.collectStatus = i;
    }
}
