package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class RealTimeReqForStrategyV2 {

    @C09CT("is_in_mg")
    public long isInMg;

    @C09CT("is_in_msc_buff")
    public long isInMscBuff;

    @C09CT("msc_buff_remain_seconds")
    public long mscBuffRemainSeconds;

    @C09CT("msc_buff_total_seconds")
    public long mscBuffTotalSeconds;

    @C09CT("pro_coin_gift_number")
    public long proCoinGiftNumber;

    @C09CT("mg_guest_uids")
    public List<Long> mgGuestUids = new ArrayList();

    @C09CT("gift_enter_from")
    public String giftEnterFrom = "";

    @C09CT("current_show_positions")
    public List<Long> currentShowPositions = new ArrayList();

    @C09CT("request_panel_id")
    public String requestPanelId = "";
}
