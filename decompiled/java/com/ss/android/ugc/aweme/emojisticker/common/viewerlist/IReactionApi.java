package com.ss.android.ugc.aweme.emojisticker.common.viewerlist;

import X.C0X9S;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.emojisticker.api.model.EmojiSliderReactionResponse;
import com.ss.android.ugc.aweme.emojisticker.api.model.InteractiveEmojiReactionResponse;
import com.ss.android.ugc.aweme.emojisticker.api.model.SocialAvatarReactionResponse;

/* JADX INFO: loaded from: classes29.dex */
public interface IReactionApi {
    @InterfaceC1501160pAQ("/tiktok/v1/sticker/interaction/details")
    C0X9S<EmojiSliderReactionResponse> fetchEmojiSliderReactionListDetail(@InterfaceC1501070pAH("item_id") String str, @InterfaceC1501070pAH("sticker_type") int i, @InterfaceC1501070pAH("count") long j, @InterfaceC1501070pAH("cursor") long j2, @InterfaceC1501070pAH("interaction_details_insertion") String str2);

    @InterfaceC1501160pAQ("/tiktok/v1/sticker/interaction/details")
    C0X9S<InteractiveEmojiReactionResponse> fetchReactionListDetail(@InterfaceC1501070pAH("item_id") String str, @InterfaceC1501070pAH("sticker_type") int i, @InterfaceC1501070pAH("count") long j, @InterfaceC1501070pAH("cursor") long j2, @InterfaceC1501070pAH("interaction_details_insertion") String str2);

    @InterfaceC1501160pAQ("/tiktok/v1/sticker/interaction/details")
    Object fetchSocialAvatarReactionListDetail(@InterfaceC1501070pAH("item_id") String str, @InterfaceC1501070pAH("sticker_type") int i, @InterfaceC1501070pAH("count") long j, @InterfaceC1501070pAH("cursor") long j2, @InterfaceC1501070pAH("interaction_details_insertion") String str2, InterfaceC1364105Vn<? super SocialAvatarReactionResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/sticker/interaction")
    C0X9S<BaseResponse> reportEmojiSliderStickerVote(@InterfaceC1501050pAF("item_id") String str, @InterfaceC1501050pAF("emoji_slider_sticker") String str2, @InterfaceC1501050pAF("sticker_type") int i);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/sticker/interaction")
    C0X9S<BaseResponse> reportInteractiveEmojiStickerClick(@InterfaceC1501050pAF("item_id") String str, @InterfaceC1501050pAF("interactive_emoji_sticker") String str2, @InterfaceC1501050pAF("sticker_type") int i);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/sticker/interaction")
    Object reportSocialAvatarStickerClick(@InterfaceC1501050pAF("item_id") String str, @InterfaceC1501050pAF("social_avatar_sticker") String str2, @InterfaceC1501050pAF("sticker_type") int i, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
