package com.ss.android.ugc.aweme.shortvideo.model;

import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class SuggestMusicList {
    public int cursor;
    public Boolean fromRecommend = Boolean.FALSE;
    public boolean hasMore;
    public LogPbBean logPb;
    public List<MusicModel> musicList;
    public Integer musicType;

    public Boolean getFromRecommend() {
        return this.fromRecommend;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public List<MusicModel> getMusicList() {
        return this.musicList;
    }

    public Integer getMusicType() {
        return this.musicType;
    }

    public void setFromRecommend(Boolean bool) {
        this.fromRecommend = bool;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setMusicList(List<MusicModel> list) {
        this.musicList = list;
    }

    public void setMusicType(Integer num) {
        this.musicType = num;
    }
}
