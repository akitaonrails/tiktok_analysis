package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class OriginalMusicList extends MusicBaseResponse implements Serializable {

    @C09CT("cursor")
    public int cursor;

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("honor_label")
    public Integer honorLabel;

    @C09CT("groups")
    public List<MusicGroup> musicGroups;

    @C09CT("new_release_clip_ids")
    public List<Long> newReleaseClipIds;

    public final int getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final Integer getHonorLabel() {
        return this.honorLabel;
    }

    public final List<MusicGroup> getMusicGroups() {
        return this.musicGroups;
    }

    public final List<Long> getNewReleaseClipIds() {
        return this.newReleaseClipIds;
    }

    public final void setCursor(int i) {
        this.cursor = i;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setHonorLabel(Integer num) {
        this.honorLabel = num;
    }

    public final void setMusicGroups(List<MusicGroup> list) {
        this.musicGroups = list;
    }

    public final void setNewReleaseClipIds(List<Long> list) {
        this.newReleaseClipIds = list;
    }
}
