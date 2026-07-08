package com.ss.android.ugc.aweme.socialavatar.api;

import X.C09CT;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarAssets {

    @C09CT("animation_failure")
    public final Integer animationFailure;

    @C09CT("animation_success")
    public final Integer animationSuccess;

    @C09CT("animation_unfinished")
    public final Integer animationUnfinished;

    @C09CT("asset_total")
    public final Integer assetTotal;

    @C09CT("avatar_failure")
    public final Integer avatarFailure;

    @C09CT("avatar_success")
    public final Integer avatarSuccess;

    @C09CT("avatar_unfinished")
    public final Integer avatarUnfinished;

    @C09CT("sticker_failure")
    public final Integer stickerFailureCount;

    @C09CT("sticker_success")
    public final Integer stickerSuccessCount;

    @C09CT("sticker_unfinished")
    public final Integer stickerUnfinishedCount;

    public SocialAvatarAssets() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public SocialAvatarAssets(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10) {
        this.animationFailure = num;
        this.animationSuccess = num2;
        this.animationUnfinished = num3;
        this.avatarFailure = num4;
        this.avatarSuccess = num5;
        this.avatarUnfinished = num6;
        this.assetTotal = num7;
        this.stickerUnfinishedCount = num8;
        this.stickerSuccessCount = num9;
        this.stickerFailureCount = num10;
    }
}
