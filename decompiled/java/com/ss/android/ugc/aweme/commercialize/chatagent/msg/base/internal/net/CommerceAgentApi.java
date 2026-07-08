package com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net;

import X.C1515820pY4;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC2174608fY;

/* JADX INFO: loaded from: classes5.dex */
public interface CommerceAgentApi {
    @InterfaceC1501160pAQ("/api/ad/v1/conversation/message/list/")
    Object commerceLoadMoreMsgByConversation(@InterfaceC1501070pAH("conversation_id") String str, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("sort") int i2, InterfaceC1364105Vn<? super LoadMoreMsgByConversationResponse> interfaceC1364105Vn);

    @InterfaceC2174608fY
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/api/ad/v1/conversation/op/stream")
    Object commerceOpChunk(@InterfaceC1501050pAF("op_type") int i, @InterfaceC1501050pAF("uuid") String str, @InterfaceC1501050pAF("msg_id") String str2, @InterfaceC1501050pAF("msg_type") int i2, @InterfaceC1501050pAF("msg_content") String str3, @InterfaceC1501050pAF("send_type") int i3, @InterfaceC1501050pAF("op_retry_type") Integer num, @InterfaceC1501050pAF("extra") String str4, InterfaceC1364105Vn<? super C1515820pY4<MessageChunkResult>> interfaceC1364105Vn);

    @InterfaceC2174608fY
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/api/ad/v1/search/card/query")
    Object commerceSearchCardQuery(@InterfaceC1501050pAF("extra") String str, @InterfaceC1501050pAF("query_params") String str2, @InterfaceC1501050pAF("version") Integer num, InterfaceC1364105Vn<? super C1515820pY4<MessageChunkResult>> interfaceC1364105Vn);
}
