package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMusicArtistInfo implements Serializable {

    @C09CT("is_verified")
    public final boolean isVerified;

    @C09CT("nick_name")
    public final String nickName;

    public SearchMusicArtistInfo() {
        this("", false);
    }

    public final boolean isVerified() {
        return this.isVerified;
    }

    public SearchMusicArtistInfo(String str, boolean z) {
        this.nickName = str;
        this.isVerified = z;
    }
}
