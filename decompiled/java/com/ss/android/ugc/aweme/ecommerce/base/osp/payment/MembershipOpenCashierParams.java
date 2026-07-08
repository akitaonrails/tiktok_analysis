package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.C09CT;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MembershipOpenCashierParams {
    public final HashMap<String, Object> LIZ;

    @C09CT("address_id")
    public final String addressId;

    @C09CT("amount")
    public final String amount;

    @C09CT("currency")
    public final String currency;

    @C09CT("entrance")
    public final String entrance;

    @C09CT("membership_mode")
    public final String membershipMode;

    @C09CT("oec_user_id")
    public final String merchantUserId;

    @C09CT("order_type")
    public final String orderType;

    @C09CT("payment_method_code")
    public final String paymentMethodCode;

    @C09CT("payment_method_token")
    public final String paymentMethodToken;

    @C09CT("region")
    public final String region;

    @C09CT("seller_id")
    public final String sellerId;

    @C09CT("source")
    public final String source;

    public MembershipOpenCashierParams() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MembershipOpenCashierParams)) {
            return false;
        }
        MembershipOpenCashierParams membershipOpenCashierParams = (MembershipOpenCashierParams) obj;
        return Intrinsics.LJFF(this.merchantUserId, membershipOpenCashierParams.merchantUserId) && Intrinsics.LJFF(this.region, membershipOpenCashierParams.region) && Intrinsics.LJFF(this.currency, membershipOpenCashierParams.currency) && Intrinsics.LJFF(this.amount, membershipOpenCashierParams.amount) && Intrinsics.LJFF(this.sellerId, membershipOpenCashierParams.sellerId) && Intrinsics.LJFF(this.entrance, membershipOpenCashierParams.entrance) && Intrinsics.LJFF(this.addressId, membershipOpenCashierParams.addressId) && Intrinsics.LJFF(this.orderType, membershipOpenCashierParams.orderType) && Intrinsics.LJFF(this.membershipMode, membershipOpenCashierParams.membershipMode) && Intrinsics.LJFF(this.paymentMethodToken, membershipOpenCashierParams.paymentMethodToken) && Intrinsics.LJFF(this.paymentMethodCode, membershipOpenCashierParams.paymentMethodCode) && Intrinsics.LJFF(this.source, membershipOpenCashierParams.source) && Intrinsics.LJFF(this.LIZ, membershipOpenCashierParams.LIZ);
    }

    public final int hashCode() {
        String str = this.merchantUserId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.region;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.amount;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sellerId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.entrance;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.addressId;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.orderType;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.membershipMode;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.paymentMethodToken;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.paymentMethodCode;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.source;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        HashMap<String, Object> map = this.LIZ;
        return iHashCode12 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "MembershipOpenCashierParams(merchantUserId=" + this.merchantUserId + ", region=" + this.region + ", currency=" + this.currency + ", amount=" + this.amount + ", sellerId=" + this.sellerId + ", entrance=" + this.entrance + ", addressId=" + this.addressId + ", orderType=" + this.orderType + ", membershipMode=" + this.membershipMode + ", paymentMethodToken=" + this.paymentMethodToken + ", paymentMethodCode=" + this.paymentMethodCode + ", source=" + this.source + ", trackParams=" + this.LIZ + ')';
    }

    public MembershipOpenCashierParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, HashMap<String, Object> map) {
        this.merchantUserId = str;
        this.region = str2;
        this.currency = str3;
        this.amount = str4;
        this.sellerId = str5;
        this.entrance = str6;
        this.addressId = str7;
        this.orderType = str8;
        this.membershipMode = str9;
        this.paymentMethodToken = str10;
        this.paymentMethodCode = str11;
        this.source = str12;
        this.LIZ = map;
    }
}
