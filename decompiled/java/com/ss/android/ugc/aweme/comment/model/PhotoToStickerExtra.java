package com.ss.android.ugc.aweme.comment.model;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes22.dex */
public final class PhotoToStickerExtra {
    public final Aweme aweme;
    public final String enterFrom;
    public final Boolean fromGraphicDetail;
    public final Boolean fromPhotoInner;
    public final Integer inputHash;
    public final Integer isInternalPhoto;

    public PhotoToStickerExtra() {
        this(Boolean.FALSE, Boolean.FALSE, null, null, null, 0);
    }

    public final Integer isInternalPhoto() {
        return this.isInternalPhoto;
    }

    public PhotoToStickerExtra(Boolean bool, Boolean bool2, Aweme aweme, Integer num, String str, Integer num2) {
        this.fromPhotoInner = bool;
        this.fromGraphicDetail = bool2;
        this.aweme = aweme;
        this.inputHash = num;
        this.enterFrom = str;
        this.isInternalPhoto = num2;
    }
}
