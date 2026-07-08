package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class BehindTheSongMetaData implements Serializable {

    @C09CT("behind_the_song_type")
    public final int behindTheSongType;

    @C09CT("cover")
    public final UrlModel cover;

    @C09CT("desc")
    public final String desc;

    @C09CT("title")
    public final String title;

    public BehindTheSongMetaData() {
        this(null, null, null, 0);
    }

    public BehindTheSongMetaData(String str, String str2, UrlModel urlModel, int i) {
        this.title = str;
        this.desc = str2;
        this.cover = urlModel;
        this.behindTheSongType = i;
    }
}
