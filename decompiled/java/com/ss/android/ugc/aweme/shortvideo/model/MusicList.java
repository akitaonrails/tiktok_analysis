package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class MusicList extends BaseResponse {

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("music_list")
    public List<Music> musicList;

    @C09CT("resp_json")
    public String respJson;

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public List<Music> getMusicList() {
        return this.musicList;
    }

    public String getRespJson() {
        return this.respJson;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setMusicList(List<Music> list) {
        this.musicList = list;
    }

    public void setRespJson(String str) {
        this.respJson = str;
    }
}
