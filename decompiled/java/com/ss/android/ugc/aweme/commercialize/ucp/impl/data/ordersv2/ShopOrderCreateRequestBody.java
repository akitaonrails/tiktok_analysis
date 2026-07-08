package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ShopOrderCreateRequestBody {

    @C09CT("ac_ad_type")
    public final Integer _acAdType;

    @C09CT("ad_extra")
    public final String adExtra;

    @C09CT("external_shop_id")
    public final String externalShopId;

    @C09CT("external_shop_name")
    public final String externalShopName;

    @C09CT("extra")
    public final String extra;

    @C09CT("order_details")
    public final String orderDetails;

    @C09CT("tenant")
    public final String tenant;

    @C09CT("tiktok_device_id")
    public final Long tiktokDeviceId;

    @C09CT("tiktok_shop_id")
    public final String tiktokShopId;

    @C09CT("tiktok_shop_name")
    public final String tiktokShopName;

    @C09CT("tiktok_user_id")
    public final Long tiktokUserId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopOrderCreateRequestBody)) {
            return false;
        }
        ShopOrderCreateRequestBody shopOrderCreateRequestBody = (ShopOrderCreateRequestBody) obj;
        return Intrinsics.LJFF(this.tenant, shopOrderCreateRequestBody.tenant) && Intrinsics.LJFF(this.adExtra, shopOrderCreateRequestBody.adExtra) && Intrinsics.LJFF(this.tiktokShopId, shopOrderCreateRequestBody.tiktokShopId) && Intrinsics.LJFF(this.tiktokShopName, shopOrderCreateRequestBody.tiktokShopName) && Intrinsics.LJFF(this.externalShopId, shopOrderCreateRequestBody.externalShopId) && Intrinsics.LJFF(this.externalShopName, shopOrderCreateRequestBody.externalShopName) && Intrinsics.LJFF(this.tiktokUserId, shopOrderCreateRequestBody.tiktokUserId) && Intrinsics.LJFF(this.tiktokDeviceId, shopOrderCreateRequestBody.tiktokDeviceId) && Intrinsics.LJFF(this.orderDetails, shopOrderCreateRequestBody.orderDetails) && Intrinsics.LJFF(this._acAdType, shopOrderCreateRequestBody._acAdType) && Intrinsics.LJFF(this.extra, shopOrderCreateRequestBody.extra);
    }

    public final int hashCode() {
        String str = this.tenant;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.adExtra;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tiktokShopId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tiktokShopName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.externalShopId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.externalShopName;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l = this.tiktokUserId;
        int iHashCode7 = (iHashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.tiktokDeviceId;
        int iHashCode8 = (iHashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str7 = this.orderDetails;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this._acAdType;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str8 = this.extra;
        return iHashCode10 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        return "ShopOrderCreateRequestBody(tenant=" + this.tenant + ", adExtra=" + this.adExtra + ", tiktokShopId=" + this.tiktokShopId + ", tiktokShopName=" + this.tiktokShopName + ", externalShopId=" + this.externalShopId + ", externalShopName=" + this.externalShopName + ", tiktokUserId=" + this.tiktokUserId + ", tiktokDeviceId=" + this.tiktokDeviceId + ", orderDetails=" + this.orderDetails + ", _acAdType=" + this._acAdType + ", extra=" + this.extra + ')';
    }

    public ShopOrderCreateRequestBody(String str, String str2, String str3, String str4, String str5, String str6, Long l, Long l2, String str7, Integer num, String str8) {
        this.tenant = str;
        this.adExtra = str2;
        this.tiktokShopId = str3;
        this.tiktokShopName = str4;
        this.externalShopId = str5;
        this.externalShopName = str6;
        this.tiktokUserId = l;
        this.tiktokDeviceId = l2;
        this.orderDetails = str7;
        this._acAdType = num;
        this.extra = str8;
    }
}
