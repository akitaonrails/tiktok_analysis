package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public class CollectedMusicList extends BaseResponse implements Serializable {

    @C09CT("cursor")
    public int cursor;

    @C09CT("has_more")
    public int hasMore;

    @C09CT(alternate = {"music_list"}, value = "mc_list")
    public List<Music> items;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("theme_tags")
    public List<MusicThemeTag> themeTags;

    @C09CT("total_count")
    public int totalCount;

    public boolean isHasMore() {
        return this.hasMore == 1;
    }

    public int getCursor() {
        return this.cursor;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public List<Music> getItems() {
        return this.items;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public List<MusicThemeTag> getThemeTags() {
        return this.themeTags;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public void setCursor(int i) {
        this.cursor = i;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z ? 1 : 0;
    }

    public void setItems(List<Music> list) {
        this.items = list;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setThemeTags(List<MusicThemeTag> list) {
        this.themeTags = list;
    }

    public void setTotalCount(int i) {
        this.totalCount = i;
    }
}
