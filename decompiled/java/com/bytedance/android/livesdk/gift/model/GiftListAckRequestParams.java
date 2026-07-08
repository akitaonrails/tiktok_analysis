package com.bytedance.android.livesdk.gift.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GiftListAckRequestParams {

    @C09CT("room_id")
    public long roomId;

    @C09CT("gifts_ack_info_list")
    public String giftsAckInfoList = "";

    @C09CT("sec_anchor_id")
    public String secAnchorId = "";

    @C09CT("request_panel_id")
    public String requestPanelId = "";

    @C09CT("client_trigger_feature")
    public String clientTriggerFeature = "";

    @C09CT("ack_req_for_strategy")
    public String ackReqForStrategy = "";
}
