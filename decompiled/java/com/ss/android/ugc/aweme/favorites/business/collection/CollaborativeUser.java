package com.ss.android.ugc.aweme.favorites.business.collection;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class CollaborativeUser {

    @C09CT("avatar_medium")
    public final UrlModel avatarMedium;

    @C09CT("avatar_thumb")
    public final UrlModel avatarThumb;

    @C09CT("nickname")
    public final String name;

    @C09CT("uid")
    public final String uid;

    public CollaborativeUser() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollaborativeUser)) {
            return false;
        }
        CollaborativeUser collaborativeUser = (CollaborativeUser) obj;
        return Intrinsics.LJFF(this.uid, collaborativeUser.uid) && Intrinsics.LJFF(this.name, collaborativeUser.name) && Intrinsics.LJFF(this.avatarThumb, collaborativeUser.avatarThumb) && Intrinsics.LJFF(this.avatarMedium, collaborativeUser.avatarMedium);
    }

    public CollaborativeUser(String str, String str2, UrlModel urlModel, UrlModel urlModel2) {
        this.uid = str;
        this.name = str2;
        this.avatarThumb = urlModel;
        this.avatarMedium = urlModel2;
    }
}
