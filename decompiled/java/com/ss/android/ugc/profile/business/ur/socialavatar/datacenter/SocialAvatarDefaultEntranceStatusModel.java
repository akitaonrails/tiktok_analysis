package com.ss.android.ugc.profile.business.ur.socialavatar.datacenter;

import X.C09CT;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarDefaultEntranceStatusModel {

    @C09CT("301")
    public final boolean aiMojiCompatibility;

    @C09CT("201")
    public final boolean dmCardMessage;

    @C09CT("101")
    public final boolean dmFavTabActionSheet;

    @C09CT("202")
    public final boolean dmFavTabBanner;

    @C09CT("102")
    public final boolean dmInlineMsg;

    @C09CT("104")
    public final boolean dmReaction;

    @C09CT("103")
    public final boolean dmStickerDetail;

    @C09CT("105")
    public final boolean editProfileActionSheet;

    @C09CT("203")
    public final boolean editProfileBanner;

    @C09CT("404")
    public final boolean editProfileFailureBanner;

    @C09CT("401")
    public final boolean editProfileTwoHeaderSheetRegenerate;

    @C09CT("106")
    public final boolean enlargeAvatarOthers;

    @C09CT("107")
    public final boolean enlargeAvatarSelf;

    @C09CT("403")
    public final boolean failurePushRetry;

    @C09CT("204")
    public final boolean iconFlip;

    @C09CT("109")
    public final boolean othersProfileFloatingNotice;

    @C09CT("205")
    public final boolean profileFloatingNotice;

    @C09CT("402")
    public final boolean reviewPageRegenerate;

    @C09CT("108")
    public final boolean storyReaction;

    public SocialAvatarDefaultEntranceStatusModel() {
        this(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, true);
    }

    public SocialAvatarDefaultEntranceStatusModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.dmFavTabActionSheet = z;
        this.dmInlineMsg = z2;
        this.dmStickerDetail = z3;
        this.dmReaction = z4;
        this.editProfileActionSheet = z5;
        this.enlargeAvatarOthers = z6;
        this.enlargeAvatarSelf = z7;
        this.storyReaction = z8;
        this.othersProfileFloatingNotice = z9;
        this.dmCardMessage = z10;
        this.dmFavTabBanner = z11;
        this.editProfileBanner = z12;
        this.iconFlip = z13;
        this.profileFloatingNotice = z14;
        this.aiMojiCompatibility = z15;
        this.editProfileTwoHeaderSheetRegenerate = z16;
        this.reviewPageRegenerate = z17;
        this.failurePushRetry = z18;
        this.editProfileFailureBanner = z19;
    }
}
