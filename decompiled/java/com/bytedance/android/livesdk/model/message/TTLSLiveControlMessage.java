package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class TTLSLiveControlMessage extends AbstractC1136060ffY {

    @C09CT("action_type")
    public int actionType;

    @C09CT("extra")
    public String extra;

    @C09CT("product_id")
    public String productId;

    @C09CT("product_pin_time")
    public long productPinTime;

    @C09CT("product_unpin_time")
    public long productUnpinTime;

    @C09CT("room_id")
    public String roomId;

    public TTLSLiveControlMessage() {
        this.type = C001A.T_T_L_S_LIVE_CONTROL_MESSAGE;
        this.productId = "";
        this.roomId = "";
        this.extra = "";
    }
}
