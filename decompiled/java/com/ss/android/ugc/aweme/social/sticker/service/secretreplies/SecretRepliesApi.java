package com.ss.android.ugc.aweme.social.sticker.service.secretreplies;

import X.C0X9S;
import X.C2188811AlT;
import X.C844470XAv;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.social.sticker.model.SecretReplyResp;

/* JADX INFO: loaded from: classes32.dex */
public final class SecretRepliesApi implements ISecretRepliesApi {
    public static final SecretRepliesApi LIZIZ = new SecretRepliesApi();
    public final /* synthetic */ ISecretRepliesApi LIZ;

    @Override // com.ss.android.ugc.aweme.social.sticker.service.secretreplies.ISecretRepliesApi
    @InterfaceC1501160pAQ("/tiktok/v1/sticker/interaction/summary")
    public C0X9S<SecretReplyResp> fetchSecretReplyResponses(@InterfaceC1501070pAH("item_id") String str, @InterfaceC1501070pAH("sticker_interaction_summary_param") String str2) {
        return this.LIZ.fetchSecretReplyResponses(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.social.sticker.service.secretreplies.ISecretRepliesApi
    @InterfaceC1501160pAQ("/tiktok/v1/sticker/interaction/details")
    public C0X9S<SecretReplyResp> fetchStickerInteractionDetails(@InterfaceC1501070pAH("item_id") String str, @InterfaceC1501070pAH("sticker_type") int i, @InterfaceC1501070pAH("count") int i2, @InterfaceC1501070pAH("cursor") int i3) {
        return this.LIZ.fetchStickerInteractionDetails(str, i, i2, i3);
    }

    @Override // com.ss.android.ugc.aweme.social.sticker.service.secretreplies.ISecretRepliesApi
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/sticker/interaction/secret_reply/status")
    public C0X9S<BaseResponse> postRemoveOrReportSecretReply(@InterfaceC1501050pAF("reply_id") String str, @InterfaceC1501050pAF(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS) int i) {
        return this.LIZ.postRemoveOrReportSecretReply(str, i);
    }

    @Override // com.ss.android.ugc.aweme.social.sticker.service.secretreplies.ISecretRepliesApi
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/sticker/interaction")
    public C0X9S<BaseResponse> postSecretRepliesReply(@InterfaceC1501050pAF("item_id") String str, @InterfaceC1501050pAF("sticker_type") int i, @InterfaceC1501050pAF("secret_reply_sticker") String str2) {
        return this.LIZ.postSecretRepliesReply(str, i, str2);
    }

    public SecretRepliesApi() {
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
        this.LIZ = (ISecretRepliesApi) iRetrofitFactory.LIZ(C2188811AlT.LIZIZ(sbLIZ)).create(ISecretRepliesApi.class);
    }
}
