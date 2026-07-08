package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class MusicAvatar implements Serializable {

    @C09CT("hd")
    public UrlModel hd;

    @C09CT("large")
    public UrlModel large;

    @C09CT("medium")
    public UrlModel medium;

    @C09CT("thumb")
    public UrlModel thumb;

    @C09CT("thumbnail")
    public UrlModel thumbnail;

    public final UrlModel getHd() {
        return this.hd;
    }

    public final UrlModel getLarge() {
        return this.large;
    }

    public final UrlModel getMedium() {
        return this.medium;
    }

    public final UrlModel getThumb() {
        return this.thumb;
    }

    public final UrlModel getThumbnail() {
        return this.thumbnail;
    }
}
