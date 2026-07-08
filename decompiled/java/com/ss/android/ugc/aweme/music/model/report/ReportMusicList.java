package com.ss.android.ugc.aweme.music.model.report;

import X.C09CT;
import com.ss.android.ugc.aweme.music.model.MusicBaseResponse;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ReportMusicList extends MusicBaseResponse implements Serializable {

    @C09CT("cursor")
    public int cursor;

    @C09CT("group_offset")
    public int groupOffset;

    @C09CT("has_more")
    public HasMore hasMore = HasMore.FALSE;

    @C09CT("music_list")
    public List<ReportMusic> musicList;

    public final int getCursor() {
        return this.cursor;
    }

    public final int getGroupOffset() {
        return this.groupOffset;
    }

    public final HasMore getHasMore() {
        return this.hasMore;
    }

    public final List<ReportMusic> getMusicList() {
        return this.musicList;
    }

    public final void setCursor(int i) {
        this.cursor = i;
    }

    public final void setGroupOffset(int i) {
        this.groupOffset = i;
    }

    public final void setHasMore(HasMore hasMore) {
        this.hasMore = hasMore;
    }

    public final void setMusicList(List<ReportMusic> list) {
        this.musicList = list;
    }
}
