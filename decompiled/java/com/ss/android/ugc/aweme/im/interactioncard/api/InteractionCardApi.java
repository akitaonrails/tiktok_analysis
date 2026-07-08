package com.ss.android.ugc.aweme.im.interactioncard.api;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes3.dex */
public interface InteractionCardApi {
    @InterfaceC1501240pAY("im/message/interaction_card/update/")
    @InterfaceC1501300pAe
    Object updateInteractionCard(@InterfaceC1501100pAK("conversation_short_id") long j, @InterfaceC1501100pAK("server_message_id") long j2, @InterfaceC1501100pAK("encoded_content_pb") String str, @InterfaceC1501100pAK("conversation_id") String str2, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
