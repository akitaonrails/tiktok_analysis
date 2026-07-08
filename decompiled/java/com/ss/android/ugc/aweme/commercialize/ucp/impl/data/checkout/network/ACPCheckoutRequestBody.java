package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ACPCheckoutRequestBody {

    @C09CT("ac_ad_type")
    public final Integer acAdType;

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

    public ACPCheckoutRequestBody() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ACPCheckoutRequestBody)) {
            return false;
        }
        ACPCheckoutRequestBody aCPCheckoutRequestBody = (ACPCheckoutRequestBody) obj;
        return Intrinsics.LJFF(this.acAdType, aCPCheckoutRequestBody.acAdType) && Intrinsics.LJFF(this.adExtra, aCPCheckoutRequestBody.adExtra) && Intrinsics.LJFF(this.tiktokShopId, aCPCheckoutRequestBody.tiktokShopId) && Intrinsics.LJFF(this.externalShopId, aCPCheckoutRequestBody.externalShopId) && Intrinsics.LJFF(this.externalShopName, aCPCheckoutRequestBody.externalShopName) && Intrinsics.LJFF(this.extra, aCPCheckoutRequestBody.extra) && Intrinsics.LJFF(this.orderDetails, aCPCheckoutRequestBody.orderDetails) && Intrinsics.LJFF(this.tenant, aCPCheckoutRequestBody.tenant) && Intrinsics.LJFF(this.tiktokDeviceId, aCPCheckoutRequestBody.tiktokDeviceId) && Intrinsics.LJFF(this.tiktokShopName, aCPCheckoutRequestBody.tiktokShopName) && Intrinsics.LJFF(this.tiktokUserId, aCPCheckoutRequestBody.tiktokUserId);
    }

    public final int hashCode() {
        Integer num = this.acAdType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.adExtra;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tiktokShopId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.externalShopId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.externalShopName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.extra;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.orderDetails;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.tenant;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l = this.tiktokDeviceId;
        int iHashCode9 = (iHashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        String str8 = this.tiktokShopName;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l2 = this.tiktokUserId;
        return iHashCode10 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "ACPCheckoutRequestBody(acAdType=" + this.acAdType + ", adExtra=" + this.adExtra + ", tiktokShopId=" + this.tiktokShopId + ", externalShopId=" + this.externalShopId + ", externalShopName=" + this.externalShopName + ", extra=" + this.extra + ", orderDetails=" + this.orderDetails + ", tenant=" + this.tenant + ", tiktokDeviceId=" + this.tiktokDeviceId + ", tiktokShopName=" + this.tiktokShopName + ", tiktokUserId=" + this.tiktokUserId + ')';
    }

    public ACPCheckoutRequestBody(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, String str8, Long l2) {
        this.acAdType = num;
        this.adExtra = str;
        this.tiktokShopId = str2;
        this.externalShopId = str3;
        this.externalShopName = str4;
        this.extra = str5;
        this.orderDetails = str6;
        this.tenant = str7;
        this.tiktokDeviceId = l;
        this.tiktokShopName = str8;
        this.tiktokUserId = l2;
    }
}
