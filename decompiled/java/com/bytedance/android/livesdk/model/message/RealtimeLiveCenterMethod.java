package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import webcast.data.ColdStartStatData;
import webcast.data.PromoteCoupon;
import webcast.data.RealtimeLiveCenterBaseData;
import webcast.data.RealtimeLiveCenterLopInfo;
import webcast.data.RealtimeLiveCenterShopData;
import webcast.data.RealtimeLiveCenterTips;
import webcast.data.RealtimeReminderWordInfoMsg;
import webcast.data.WhiteBoxData;

/* JADX INFO: loaded from: classes.dex */
public final class RealtimeLiveCenterMethod extends AbstractC1136060ffY {

    @C09CT("base_info")
    public RealtimeLiveCenterBaseData baseInfo;

    @C09CT("cold_start_stat_data")
    public ColdStartStatData coldStartStatData;

    @C09CT("lop_info")
    public RealtimeLiveCenterLopInfo lopInfo;

    @C09CT("promote_coupon")
    public PromoteCoupon promoteCoupon;

    @C09CT("reminder_word_info")
    public RealtimeReminderWordInfoMsg reminderWordInfo;

    @C09CT("room_id")
    public String roomId;

    @C09CT("shop_info")
    public RealtimeLiveCenterShopData shopInfo;

    @C09CT("tips_info")
    public RealtimeLiveCenterTips tipsInfo;

    @C09CT("white_box_data")
    public WhiteBoxData whiteBoxData;

    public RealtimeLiveCenterMethod() {
        this.type = C001A.REALTIME_LIVE_CENTER_METHOD;
        this.roomId = "";
    }
}
