package com.ss.android.ugc.aweme.repostfeed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostNewContentUser {

    @C09CT("avatar_168x168")
    public final UrlModel avatar168;

    @C09CT("avatar_thumb")
    public final UrlModel avatarThumb;

    @C09CT("item_id")
    public final String itemId;

    @C09CT("nickname")
    public final String nickName;

    @C09CT("unique_id")
    public final String uniqueId;

    @C09CT("user_id")
    public final String userId;

    public RepostNewContentUser() {
        this("", "", "", "", null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepostNewContentUser)) {
            return false;
        }
        RepostNewContentUser repostNewContentUser = (RepostNewContentUser) obj;
        return Intrinsics.LJFF(this.itemId, repostNewContentUser.itemId) && Intrinsics.LJFF(this.userId, repostNewContentUser.userId) && Intrinsics.LJFF(this.uniqueId, repostNewContentUser.uniqueId) && Intrinsics.LJFF(this.nickName, repostNewContentUser.nickName) && Intrinsics.LJFF(this.avatar168, repostNewContentUser.avatar168) && Intrinsics.LJFF(this.avatarThumb, repostNewContentUser.avatarThumb);
    }

    public RepostNewContentUser(String str, String str2, String str3, String str4, UrlModel urlModel, UrlModel urlModel2) {
        this.itemId = str;
        this.userId = str2;
        this.uniqueId = str3;
        this.nickName = str4;
        this.avatar168 = urlModel;
        this.avatarThumb = urlModel2;
    }
}
