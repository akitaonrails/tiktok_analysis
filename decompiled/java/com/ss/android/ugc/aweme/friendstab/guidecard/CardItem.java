package com.ss.android.ugc.aweme.friendstab.guidecard;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class CardItem implements Serializable {

    @C09CT("author_id")
    public final String authorId;

    @C09CT("avatar_url")
    public final UrlModel avatarUrl;

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("cover_url")
    public final UrlModel coverUrl;

    public CardItem() {
        this("", null, null, "");
    }

    public CardItem(String str, UrlModel urlModel, UrlModel urlModel2, String str2) {
        this.authorId = str;
        this.avatarUrl = urlModel;
        this.coverUrl = urlModel2;
        this.awemeId = str2;
    }
}
