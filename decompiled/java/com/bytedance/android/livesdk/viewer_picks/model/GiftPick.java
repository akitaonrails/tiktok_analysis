package com.bytedance.android.livesdk.viewer_picks.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class GiftPick {

    @C09CT("desc_source")
    public int descSource;

    @C09CT("extra")
    public GiftPickExtra extra;

    @C09CT("gift_icon")
    public ImageModel giftIcon;

    @C09CT("gift_id")
    public long giftId;

    @C09CT("gift_pick_id")
    public long giftPickId;

    @C09CT("gift_price")
    public long giftPrice;

    @C09CT("is_priority_request")
    public boolean isPriorityRequest;

    @C09CT("customized_desc")
    public String customizedDesc = "";

    @C09CT("gift_pick_id_str")
    public String giftPickIdStr = "";
}
