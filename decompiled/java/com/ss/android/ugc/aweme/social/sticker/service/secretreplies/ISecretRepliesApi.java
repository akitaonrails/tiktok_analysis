package com.ss.android.ugc.aweme.social.sticker.service.secretreplies;

import X.C0X9S;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.social.sticker.model.SecretReplyResp;

/* JADX INFO: loaded from: classes32.dex */
public interface ISecretRepliesApi {
    @InterfaceC1501160pAQ("/tiktok/v1/sticker/interaction/summary")
    C0X9S<SecretReplyResp> fetchSecretReplyResponses(@InterfaceC1501070pAH("item_id") String str, @InterfaceC1501070pAH("sticker_interaction_summary_param") String str2);

    @InterfaceC1501160pAQ("/tiktok/v1/sticker/interaction/details")
    C0X9S<SecretReplyResp> fetchStickerInteractionDetails(@InterfaceC1501070pAH("item_id") String str, @InterfaceC1501070pAH("sticker_type") int i, @InterfaceC1501070pAH("count") int i2, @InterfaceC1501070pAH("cursor") int i3);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/sticker/interaction/secret_reply/status")
    C0X9S<BaseResponse> postRemoveOrReportSecretReply(@InterfaceC1501050pAF("reply_id") String str, @InterfaceC1501050pAF(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS) int i);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/sticker/interaction")
    C0X9S<BaseResponse> postSecretRepliesReply(@InterfaceC1501050pAF("item_id") String str, @InterfaceC1501050pAF("sticker_type") int i, @InterfaceC1501050pAF("secret_reply_sticker") String str2);
}
