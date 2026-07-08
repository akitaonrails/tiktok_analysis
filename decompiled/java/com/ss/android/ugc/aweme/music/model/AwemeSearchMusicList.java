package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Extra;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class AwemeSearchMusicList {

    @C09CT("query_correct_info")
    public MusicSearchCorrectInfo correctInfo;

    @C09CT("cursor")
    public int cursor;

    @C09CT("extra")
    public Extra extra;

    @C09CT("global_doodle_config")
    public com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig globalDoodleConfig;

    @C09CT("has_more")
    public int hasMore;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("music_info_list")
    public List<SearchMusic> searchMusicList;

    public boolean isHasMore() {
        return this.hasMore == 1;
    }

    public int getCursor() {
        return this.cursor;
    }

    public Extra getExtra() {
        return this.extra;
    }

    public com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig getGlobalDoodleConfig() {
        return this.globalDoodleConfig;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public List<SearchMusic> getMusicList() {
        return this.searchMusicList;
    }

    public void setGlobalDoodleConfig(com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig globalDoodleConfig) {
        this.globalDoodleConfig = globalDoodleConfig;
    }
}
