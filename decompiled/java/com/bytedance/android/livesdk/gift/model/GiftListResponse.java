package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.livesdk.service.model.GiftListExtra;

/* JADX INFO: loaded from: classes.dex */
public final class GiftListResponse {

    @C09CT("data")
    public GiftListResult data;

    @C09CT("extra")
    public GiftListExtra extra;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        sb.replace(0, 2, "GiftListResponse{");
        sb.append('}');
        return sb.toString();
    }
}
