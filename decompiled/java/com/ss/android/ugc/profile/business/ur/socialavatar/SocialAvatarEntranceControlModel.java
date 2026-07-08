package com.ss.android.ugc.profile.business.ur.socialavatar;

import X.C09CT;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarEntranceControlModel {

    @C09CT("dm_ai_moji_compatibility")
    public final Double aiMojiCompatibility;

    @C09CT("promo_dm_card_messages")
    public final Double dmCardMessage;

    @C09CT("stable_dm_favorite_tab_action_sheet")
    public final Double dmFavTabActionSheet;

    @C09CT("promo_dm_favorite_tab_banner")
    public final Double dmFavTabBanner;

    @C09CT("stable_dm_inline_message")
    public final Double dmInlineMsg;

    @C09CT("stable_dm_sticker_reaction_bar")
    public final Double dmReaction;

    @C09CT("stable_dm_sticker_detail_panel")
    public final Double dmStickerDetail;

    @C09CT("stable_edit_profile_action_sheet")
    public final Double editProfileActionSheet;

    @C09CT("promo_edit_profile_banner")
    public final Double editProfileBanner;

    @C09CT("stable_enlarge_avatar_others")
    public final Double enlargeAvatarOthers;

    @C09CT("stable_enlarge_avatar_self")
    public final Double enlargeAvatarSelf;

    @C09CT("promo_icon_flip")
    public final Double iconFlip;

    @C09CT("promo_profile_floating_notice")
    public final Double profileFloatingNotice;

    @C09CT("stable_story_reaction_tab")
    public final Double storyReaction;

    /* JADX WARN: Illegal instructions before constructor call */
    public SocialAvatarEntranceControlModel() {
        Double dValueOf = Double.valueOf(1.0d);
        this(dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf);
    }

    public SocialAvatarEntranceControlModel(Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, Double d8, Double d9, Double d10, Double d11, Double d12, Double d13, Double d14) {
        this.aiMojiCompatibility = d;
        this.dmCardMessage = d2;
        this.dmFavTabBanner = d3;
        this.editProfileBanner = d4;
        this.iconFlip = d5;
        this.profileFloatingNotice = d6;
        this.dmFavTabActionSheet = d7;
        this.dmInlineMsg = d8;
        this.dmStickerDetail = d9;
        this.dmReaction = d10;
        this.editProfileActionSheet = d11;
        this.enlargeAvatarOthers = d12;
        this.enlargeAvatarSelf = d13;
        this.storyReaction = d14;
    }
}
