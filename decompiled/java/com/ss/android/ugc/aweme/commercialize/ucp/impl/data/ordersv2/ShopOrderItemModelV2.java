package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ShopOrderItemModelV2 implements Serializable {

    @C09CT("external_sku_id")
    public String externalSkuId;

    @C09CT("external_sku_image")
    public String externalSkuImage;

    @C09CT("external_sku_name")
    public String externalSkuName;

    @C09CT("quantity")
    public int quantity;

    @C09CT("tiktok_order_item_id")
    public long tiktokOrderItemId;

    @C09CT("tiktok_spu_id")
    public String tiktokSpuId;

    @C09CT("tiktok_spu_name")
    public String tiktokSpuName;

    public ShopOrderItemModelV2() {
        this(0L, null, null, null, null, null, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopOrderItemModelV2)) {
            return false;
        }
        ShopOrderItemModelV2 shopOrderItemModelV2 = (ShopOrderItemModelV2) obj;
        return this.tiktokOrderItemId == shopOrderItemModelV2.tiktokOrderItemId && Intrinsics.LJFF(this.externalSkuId, shopOrderItemModelV2.externalSkuId) && Intrinsics.LJFF(this.externalSkuName, shopOrderItemModelV2.externalSkuName) && Intrinsics.LJFF(this.externalSkuImage, shopOrderItemModelV2.externalSkuImage) && Intrinsics.LJFF(this.tiktokSpuId, shopOrderItemModelV2.tiktokSpuId) && Intrinsics.LJFF(this.tiktokSpuName, shopOrderItemModelV2.tiktokSpuName) && this.quantity == shopOrderItemModelV2.quantity;
    }

    public int hashCode() {
        int iY2 = C786410Ut5.Y2(this.tiktokOrderItemId) * 31;
        String str = this.externalSkuId;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.externalSkuName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.externalSkuImage;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tiktokSpuId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tiktokSpuName;
        return ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.quantity;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopOrderItemModelV2(tiktokOrderItemId=");
        sbLIZ.append(this.tiktokOrderItemId);
        sbLIZ.append(", externalSkuId=");
        sbLIZ.append(this.externalSkuId);
        sbLIZ.append(", externalSkuName=");
        sbLIZ.append(this.externalSkuName);
        sbLIZ.append(", externalSkuImage=");
        sbLIZ.append(this.externalSkuImage);
        sbLIZ.append(", tiktokSpuId=");
        sbLIZ.append(this.tiktokSpuId);
        sbLIZ.append(", tiktokSpuName=");
        sbLIZ.append(this.tiktokSpuName);
        sbLIZ.append(", quantity=");
        sbLIZ.append(this.quantity);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getSkuId() {
        return this.externalSkuId;
    }

    public final String getSkuImage() {
        return this.externalSkuImage;
    }

    public final String getSkuName() {
        return this.externalSkuName;
    }

    public final void setExternalSkuId(String str) {
        this.externalSkuId = str;
    }

    public final void setExternalSkuImage(String str) {
        this.externalSkuImage = str;
    }

    public final void setExternalSkuName(String str) {
        this.externalSkuName = str;
    }

    public final void setQuantity(int i) {
        this.quantity = i;
    }

    public final void setSkuId(String str) {
        this.externalSkuId = str;
    }

    public final void setSkuImage(String str) {
        this.externalSkuImage = str;
    }

    public final void setSkuName(String str) {
        this.externalSkuName = str;
    }

    public final void setTiktokOrderItemId(long j) {
        this.tiktokOrderItemId = j;
    }

    public final void setTiktokSpuId(String str) {
        this.tiktokSpuId = str;
    }

    public final void setTiktokSpuName(String str) {
        this.tiktokSpuName = str;
    }

    public ShopOrderItemModelV2(long j, String str, String str2, String str3, String str4, String str5, int i) {
        this.tiktokOrderItemId = j;
        this.externalSkuId = str;
        this.externalSkuName = str2;
        this.externalSkuImage = str3;
        this.tiktokSpuId = str4;
        this.tiktokSpuName = str5;
        this.quantity = i;
    }
}
