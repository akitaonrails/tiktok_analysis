package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class ConversationResponse {

    @C09CT("shop_buyer_data")
    public final ConversationInfoList buyerData;

    @C09CT("code")
    public final Integer code;

    @C09CT("shop_creator_data")
    public final ConversationInfoList creatorData;

    @C09CT("message")
    public final String message;

    @C09CT("shop_platform_data")
    public final ConversationInfoList shopPlatformData;

    public ConversationResponse(Integer num, String str, ConversationInfoList conversationInfoList, ConversationInfoList conversationInfoList2, ConversationInfoList conversationInfoList3) {
        this.code = num;
        this.message = str;
        this.creatorData = conversationInfoList;
        this.buyerData = conversationInfoList2;
        this.shopPlatformData = conversationInfoList3;
    }
}
