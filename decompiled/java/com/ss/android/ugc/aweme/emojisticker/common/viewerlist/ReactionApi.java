package com.ss.android.ugc.aweme.emojisticker.common.viewerlist;

import X.C0CQT;
import X.C0X9S;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.emojisticker.api.model.EmojiSliderReactionResponse;
import com.ss.android.ugc.aweme.emojisticker.api.model.InteractiveEmojiReactionResponse;
import com.ss.android.ugc.aweme.emojisticker.api.model.SocialAvatarReactionResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes29.dex */
public final class ReactionApi implements IReactionApi {
    public static final ReactionApi LIZIZ = new ReactionApi();
    public final /* synthetic */ IReactionApi LIZ = (IReactionApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(IReactionApi.class);

    @Override // com.ss.android.ugc.aweme.emojisticker.common.viewerlist.IReactionApi
    @InterfaceC1501160pAQ("/tiktok/v1/sticker/interaction/details")
    public C0X9S<EmojiSliderReactionResponse> fetchEmojiSliderReactionListDetail(@InterfaceC1501070pAH("item_id") String str, @InterfaceC1501070pAH("sticker_type") int i, @InterfaceC1501070pAH("count") long j, @InterfaceC1501070pAH("cursor") long j2, @InterfaceC1501070pAH("interaction_details_insertion") String str2) {
        return this.LIZ.fetchEmojiSliderReactionListDetail(str, i, j, j2, str2);
    }

    @Override // com.ss.android.ugc.aweme.emojisticker.common.viewerlist.IReactionApi
    @InterfaceC1501160pAQ("/tiktok/v1/sticker/interaction/details")
    public C0X9S<InteractiveEmojiReactionResponse> fetchReactionListDetail(@InterfaceC1501070pAH("item_id") String str, @InterfaceC1501070pAH("sticker_type") int i, @InterfaceC1501070pAH("count") long j, @InterfaceC1501070pAH("cursor") long j2, @InterfaceC1501070pAH("interaction_details_insertion") String str2) {
        return this.LIZ.fetchReactionListDetail(str, i, j, j2, str2);
    }

    @Override // com.ss.android.ugc.aweme.emojisticker.common.viewerlist.IReactionApi
    @InterfaceC1501160pAQ("/tiktok/v1/sticker/interaction/details")
    public Object fetchSocialAvatarReactionListDetail(@InterfaceC1501070pAH("item_id") String str, @InterfaceC1501070pAH("sticker_type") int i, @InterfaceC1501070pAH("count") long j, @InterfaceC1501070pAH("cursor") long j2, @InterfaceC1501070pAH("interaction_details_insertion") String str2, InterfaceC1364105Vn<? super SocialAvatarReactionResponse> interfaceC1364105Vn) {
        return this.LIZ.fetchSocialAvatarReactionListDetail(str, i, j, j2, str2, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.emojisticker.common.viewerlist.IReactionApi
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/sticker/interaction")
    public C0X9S<BaseResponse> reportEmojiSliderStickerVote(@InterfaceC1501050pAF("item_id") String str, @InterfaceC1501050pAF("emoji_slider_sticker") String str2, @InterfaceC1501050pAF("sticker_type") int i) {
        return this.LIZ.reportEmojiSliderStickerVote(str, str2, i);
    }

    @Override // com.ss.android.ugc.aweme.emojisticker.common.viewerlist.IReactionApi
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/sticker/interaction")
    public C0X9S<BaseResponse> reportInteractiveEmojiStickerClick(@InterfaceC1501050pAF("item_id") String str, @InterfaceC1501050pAF("interactive_emoji_sticker") String str2, @InterfaceC1501050pAF("sticker_type") int i) {
        return this.LIZ.reportInteractiveEmojiStickerClick(str, str2, i);
    }

    @Override // com.ss.android.ugc.aweme.emojisticker.common.viewerlist.IReactionApi
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/sticker/interaction")
    public Object reportSocialAvatarStickerClick(@InterfaceC1501050pAF("item_id") String str, @InterfaceC1501050pAF("social_avatar_sticker") String str2, @InterfaceC1501050pAF("sticker_type") int i, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn) {
        return this.LIZ.reportSocialAvatarStickerClick(str, str2, i, interfaceC1364105Vn);
    }
}
