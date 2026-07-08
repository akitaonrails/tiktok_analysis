package com.bytedance.android.livesdk.gift.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GiftCollectionDetailRequestParams {

    @C09CT("anchor_id")
    public Long anchorId;

    @C09CT("gift_id")
    public Long giftId;

    @C09CT("room_id")
    public Long roomId;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.giftId != null) {
            sb.append(", gift_id=");
            sb.append(this.giftId);
        }
        if (this.anchorId != null) {
            sb.append(", anchor_id=");
            sb.append(this.anchorId);
        }
        if (this.roomId != null) {
            sb.append(", room_id=");
            sb.append(this.roomId);
        }
        sb.replace(0, 2, "GiftCollectionDetailRequestParams{");
        sb.append('}');
        return sb.toString();
    }
}
