package com.bytedance.android.livesdk.gift.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GetWishlistResponse {

    @C09CT("data")
    public WishListResponse data;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        sb.replace(0, 2, "GetWishlistResponse{");
        sb.append('}');
        return sb.toString();
    }
}
