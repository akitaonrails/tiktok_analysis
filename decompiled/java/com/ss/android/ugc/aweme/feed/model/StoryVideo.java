package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class StoryVideo implements Serializable {

    @C09CT("aweme_type")
    public int awemeType = 77;

    @C09CT("story_videos")
    public List<Video> subVideoList;

    public int getAwemeType() {
        return this.awemeType;
    }

    public List<Video> getSubVideoList() {
        return this.subVideoList;
    }

    public void setAwemeType(int i) {
        this.awemeType = i;
    }

    public void setSubVideoList(List<Video> list) {
        this.subVideoList = list;
    }
}
