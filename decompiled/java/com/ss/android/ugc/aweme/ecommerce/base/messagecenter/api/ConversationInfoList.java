package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class ConversationInfoList {
    public final int LIZ;

    @C09CT("conversationCoreInfos")
    public final List<ConversationInfo> conversationCoreInfos;

    @C09CT("hasMore")
    public final Boolean hasMore;

    @C09CT("nextCursor")
    public final Integer nextCursor;

    @C09CT("totalUnReadCount")
    public final Integer totalUnReadCount;

    public static ConversationInfoList LIZ(ConversationInfoList conversationInfoList, int i) {
        return new ConversationInfoList(conversationInfoList.conversationCoreInfos, conversationInfoList.hasMore, conversationInfoList.nextCursor, conversationInfoList.totalUnReadCount, i);
    }

    public ConversationInfoList(List<ConversationInfo> list, Boolean bool, Integer num, Integer num2, int i) {
        this.conversationCoreInfos = list;
        this.hasMore = bool;
        this.nextCursor = num;
        this.totalUnReadCount = num2;
        this.LIZ = i;
    }
}
