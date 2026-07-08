package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SimilarMusicAwemeList implements Serializable {

    @C09CT("aweme_list")
    public List<? extends Aweme> awemeList;

    @C09CT("music_id")
    public String musicId;

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final void setAwemeList(List<? extends Aweme> list) {
        this.awemeList = list;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }
}
