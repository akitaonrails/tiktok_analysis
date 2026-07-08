package com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowShopItem implements Serializable {

    @C09CT("creator_id")
    public final String creatorId;

    @C09CT("is_living")
    public final Boolean isLiving;

    @C09CT("room_id")
    public final String roomId;

    @C09CT("shop_info")
    public final ShopInfo shopInfo;

    public FollowShopItem() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowShopItem)) {
            return false;
        }
        FollowShopItem followShopItem = (FollowShopItem) obj;
        return Intrinsics.LJFF(this.shopInfo, followShopItem.shopInfo) && Intrinsics.LJFF(this.isLiving, followShopItem.isLiving) && Intrinsics.LJFF(this.roomId, followShopItem.roomId) && Intrinsics.LJFF(this.creatorId, followShopItem.creatorId);
    }

    public int hashCode() {
        ShopInfo shopInfo = this.shopInfo;
        int iHashCode = (shopInfo == null ? 0 : shopInfo.hashCode()) * 31;
        Boolean bool = this.isLiving;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.roomId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.creatorId;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowShopItem(shopInfo=");
        sbLIZ.append(this.shopInfo);
        sbLIZ.append(", isLiving=");
        sbLIZ.append(this.isLiving);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.roomId);
        sbLIZ.append(", creatorId=");
        sbLIZ.append(this.creatorId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean isLiving() {
        return this.isLiving;
    }

    public FollowShopItem(ShopInfo shopInfo, Boolean bool, String str, String str2) {
        this.shopInfo = shopInfo;
        this.isLiving = bool;
        this.roomId = str;
        this.creatorId = str2;
    }
}
