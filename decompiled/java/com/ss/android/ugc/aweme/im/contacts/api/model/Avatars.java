package com.ss.android.ugc.aweme.im.contacts.api.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class Avatars implements Serializable {

    @C09CT("avatar_medium")
    public final UrlModel avatarMedium;

    @C09CT("avatar_small")
    public final UrlModel avatarThumb;

    public Avatars() {
        this(null, null);
    }

    public Avatars(UrlModel urlModel, UrlModel urlModel2) {
        this.avatarThumb = urlModel;
        this.avatarMedium = urlModel2;
    }
}
