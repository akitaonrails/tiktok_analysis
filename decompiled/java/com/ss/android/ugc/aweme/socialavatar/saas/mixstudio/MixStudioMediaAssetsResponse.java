package com.ss.android.ugc.aweme.socialavatar.saas.mixstudio;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioMediaAssetsResponse implements Serializable {

    @C09CT("generation_background_lottie")
    public final String generationBackgroundLottie;

    @C09CT("dm_input_icon_flip_add_card")
    public final String iconFlipAddCard;

    @C09CT("dm_input_icon_flip_placeholder")
    public final String iconFlipNoSACardUri;

    @C09CT("id_generation_border_lottie")
    public final String idGenerationBorderLottie;

    @C09CT("modal_placeholder_dark")
    public final String modalPlaceholderDark;

    @C09CT("modal_placeholder_light")
    public final String modalPlaceholderLight;

    @C09CT("sa_panel_sticker_generating_lottie")
    public final String saPanelStickerGeneratingLottie;

    @C09CT("social_avatar_placeholder")
    public final String socialAvatarIdPlaceholder;

    @C09CT("use_friends_id_create_yours_placeholder_dark")
    public final String useFriendsIdCreateYoursPlaceholderDark;

    @C09CT("use_friends_id_create_yours_placeholder_light")
    public final String useFriendsIdCreateYoursPlaceholderLight;

    @C09CT("use_friends_id_empty_preview_placeholder_dark")
    public final String useFriendsIdEmptyPreviewPlaceholderDark;

    @C09CT("use_friends_id_empty_preview_placeholder_light")
    public final String useFriendsIdEmptyPreviewPlaceholderLight;

    public MixStudioMediaAssetsResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public MixStudioMediaAssetsResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.generationBackgroundLottie = str;
        this.modalPlaceholderDark = str2;
        this.modalPlaceholderLight = str3;
        this.socialAvatarIdPlaceholder = str4;
        this.idGenerationBorderLottie = str5;
        this.iconFlipNoSACardUri = str6;
        this.iconFlipAddCard = str7;
        this.saPanelStickerGeneratingLottie = str8;
        this.useFriendsIdCreateYoursPlaceholderDark = str9;
        this.useFriendsIdCreateYoursPlaceholderLight = str10;
        this.useFriendsIdEmptyPreviewPlaceholderDark = str11;
        this.useFriendsIdEmptyPreviewPlaceholderLight = str12;
    }
}
