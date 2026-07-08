package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicChartRankStruct implements Serializable {

    @C09CT("link_style")
    public MusicChartLinkStyle musicChartLinkStyle;

    @C09CT("rank")
    public int rank;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("desc")
    public String desc = "";

    @C09CT("detail_url")
    public String detailUrl = "";

    @C09CT("chart_music_info")
    public String chartMusicInfo = "";

    public final String getChartMusicInfo() {
        return this.chartMusicInfo;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getDetailUrl() {
        return this.detailUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final MusicChartLinkStyle getMusicChartLinkStyle() {
        return this.musicChartLinkStyle;
    }

    public final int getRank() {
        return this.rank;
    }

    public final void setChartMusicInfo(String str) {
        this.chartMusicInfo = str;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setDetailUrl(String str) {
        this.detailUrl = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setMusicChartLinkStyle(MusicChartLinkStyle musicChartLinkStyle) {
        this.musicChartLinkStyle = musicChartLinkStyle;
    }

    public final void setRank(int i) {
        this.rank = i;
    }
}
