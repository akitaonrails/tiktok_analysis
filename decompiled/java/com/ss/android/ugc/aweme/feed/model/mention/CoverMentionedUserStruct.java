package com.ss.android.ugc.aweme.feed.model.mention;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class CoverMentionedUserStruct implements Serializable {

    @C09CT("avatar")
    public final UrlStruct avatar;

    @C09CT("user_id")
    public final String userId;

    public CoverMentionedUserStruct() {
        this(null, null);
    }

    public static final class UrlStruct implements Serializable {

        @C09CT("uri")
        public final String uri;

        @C09CT("url_list")
        public final List<String> urlList;

        public UrlStruct() {
            this(null, null);
        }

        public UrlStruct(String str, List<String> list) {
            this.uri = str;
            this.urlList = list;
        }
    }

    public CoverMentionedUserStruct(String str, UrlStruct urlStruct) {
        this.userId = str;
        this.avatar = urlStruct;
    }
}
