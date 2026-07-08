package com.ss.android.ugc.aweme.aigc.network;

import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;

/* JADX INFO: loaded from: classes28.dex */
public interface IMKitApi {
    @InterfaceC1501170pAR("/api/cameo/invite/card/build")
    Object buildInvitationCard(@InterfaceC1485405rg BuildInviteCardBody buildInviteCardBody, InterfaceC1364105Vn<? super BuildInviteCardResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/cameo/dm/get_dm_cameo_action_bar")
    Object getPeerLibra(@InterfaceC1501070pAH("opposite_user_id") long j, @InterfaceC1501070pAH("libra_key") String str, InterfaceC1364105Vn<? super GetPeerLibraResponse> interfaceC1364105Vn);
}
