package com.bytedance.android.livesdk.gift.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GiftCollectionHistoryRequestParams {

    @C09CT("anchor_id")
    public Long anchorId;

    @C09CT("gift_id")
    public Long giftId;

    @C09CT("offset")
    public Long offset;

    @C09CT("room_id")
    public Long roomId;

    @C09CT("size")
    public Long size;

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
        if (this.offset != null) {
            sb.append(", offset=");
            sb.append(this.offset);
        }
        if (this.size != null) {
            sb.append(", size=");
            sb.append(this.size);
        }
        sb.replace(0, 2, "GiftCollectionHistoryRequestParams{");
        sb.append('}');
        return sb.toString();
    }
}
