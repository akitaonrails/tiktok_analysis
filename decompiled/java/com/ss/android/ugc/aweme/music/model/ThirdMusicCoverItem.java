package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public class ThirdMusicCoverItem {

    @C09CT("text")
    public String musicCoverDisplayText;

    @C09CT("info")
    public List<MusicCoverInfo> musicCoverInfoList;

    public String getMusicCoverDisplayText() {
        return this.musicCoverDisplayText;
    }

    public List<MusicCoverInfo> getMusicCoverInfoList() {
        return this.musicCoverInfoList;
    }

    public void setMusicCoverDisplayText(String str) {
        this.musicCoverDisplayText = str;
    }

    public void setMusicCoverInfoList(List<MusicCoverInfo> list) {
        this.musicCoverInfoList = list;
    }
}
