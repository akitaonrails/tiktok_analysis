package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class ExposedCommentInfo implements Serializable {

    @C09CT("avatar_medium_url")
    public final UrlModel avatarMediumUrl;

    @C09CT("avatar_thumb_url")
    public final UrlModel avatarThumbUrl;

    @C09CT("comment_id")
    public final String commentId;

    @C09CT("user_id")
    public final String commentUserId;

    @C09CT("text")
    public final String content;

    @C09CT("relation_status")
    public final int followStatusRelation;

    @C09CT("has_audio")
    public final boolean hasAudio;

    @C09CT("has_photo")
    public final boolean hasPhoto;

    @C09CT("has_sticker")
    public final boolean hasSticker;

    @C09CT("nick_name")
    public final String nickName;

    public ExposedCommentInfo(String str, String str2, UrlModel urlModel, UrlModel urlModel2, boolean z, boolean z2, boolean z3, String str3, String str4, int i) {
        this.commentId = str;
        this.nickName = str2;
        this.avatarThumbUrl = urlModel;
        this.avatarMediumUrl = urlModel2;
        this.hasPhoto = z;
        this.hasSticker = z2;
        this.hasAudio = z3;
        this.content = str3;
        this.commentUserId = str4;
        this.followStatusRelation = i;
    }
}
