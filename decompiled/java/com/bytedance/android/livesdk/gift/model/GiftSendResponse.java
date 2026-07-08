package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.Extra;
import webcast.data.RechargeCustomError;

/* JADX INFO: loaded from: classes.dex */
public final class GiftSendResponse {

    @C09CT("data")
    public SendGiftResult data;

    @C09CT("extra")
    public GiftExtra extra;

    public static final class GiftExtra extends Extra {

        @C09CT("custom_error")
        public RechargeCustomError customError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        sb.replace(0, 2, "GiftSendResponse{");
        sb.append('}');
        return sb.toString();
    }
}
