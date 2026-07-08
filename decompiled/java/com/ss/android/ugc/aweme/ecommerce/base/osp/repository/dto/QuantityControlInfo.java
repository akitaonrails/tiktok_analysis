package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class QuantityControlInfo {

    @C09CT("hit_max_da_info")
    public String hitMaxDaInfo;

    @C09CT("hit_max_toast")
    public String hitMaxToast;

    @C09CT("hit_min_da_info")
    public String hitMinDaInfo;

    @C09CT("hit_min_toast")
    public String hitMinToast;

    @C09CT("max")
    public Integer max;

    @C09CT("max_quantity_type")
    public String maxQuantityType;

    @C09CT("min")
    public Integer min;

    @C09CT("min_quantity_type")
    public String minQuantityType;

    @C09CT("notice")
    public String notice;

    @C09CT("notice_color")
    public Integer noticeColor;

    @C09CT("purchase_limit_data_info")
    public String noticeDaInfo;

    @C09CT("quantity_available")
    public Boolean quantityAvailable;

    @C09CT("quantity_editable")
    public Boolean quantityEditable;

    public QuantityControlInfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuantityControlInfo)) {
            return false;
        }
        QuantityControlInfo quantityControlInfo = (QuantityControlInfo) obj;
        return Intrinsics.LJFF(this.min, quantityControlInfo.min) && Intrinsics.LJFF(this.max, quantityControlInfo.max) && Intrinsics.LJFF(this.hitMinToast, quantityControlInfo.hitMinToast) && Intrinsics.LJFF(this.hitMaxToast, quantityControlInfo.hitMaxToast) && Intrinsics.LJFF(this.notice, quantityControlInfo.notice) && Intrinsics.LJFF(this.quantityEditable, quantityControlInfo.quantityEditable) && Intrinsics.LJFF(this.minQuantityType, quantityControlInfo.minQuantityType) && Intrinsics.LJFF(this.maxQuantityType, quantityControlInfo.maxQuantityType) && Intrinsics.LJFF(this.quantityAvailable, quantityControlInfo.quantityAvailable) && Intrinsics.LJFF(this.hitMinDaInfo, quantityControlInfo.hitMinDaInfo) && Intrinsics.LJFF(this.hitMaxDaInfo, quantityControlInfo.hitMaxDaInfo) && Intrinsics.LJFF(this.noticeDaInfo, quantityControlInfo.noticeDaInfo) && Intrinsics.LJFF(this.noticeColor, quantityControlInfo.noticeColor);
    }

    public final int hashCode() {
        Integer num = this.min;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.max;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.hitMinToast;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.hitMaxToast;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.notice;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.quantityEditable;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.minQuantityType;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.maxQuantityType;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.quantityAvailable;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str6 = this.hitMinDaInfo;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.hitMaxDaInfo;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.noticeDaInfo;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num3 = this.noticeColor;
        return iHashCode12 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "QuantityControlInfo(min=" + this.min + ", max=" + this.max + ", hitMinToast=" + this.hitMinToast + ", hitMaxToast=" + this.hitMaxToast + ", notice=" + this.notice + ", quantityEditable=" + this.quantityEditable + ", minQuantityType=" + this.minQuantityType + ", maxQuantityType=" + this.maxQuantityType + ", quantityAvailable=" + this.quantityAvailable + ", hitMinDaInfo=" + this.hitMinDaInfo + ", hitMaxDaInfo=" + this.hitMaxDaInfo + ", noticeDaInfo=" + this.noticeDaInfo + ", noticeColor=" + this.noticeColor + ')';
    }

    public QuantityControlInfo(Integer num, Integer num2, String str, String str2, String str3, Boolean bool, String str4, String str5, Boolean bool2, String str6, String str7, String str8, Integer num3) {
        this.min = num;
        this.max = num2;
        this.hitMinToast = str;
        this.hitMaxToast = str2;
        this.notice = str3;
        this.quantityEditable = bool;
        this.minQuantityType = str4;
        this.maxQuantityType = str5;
        this.quantityAvailable = bool2;
        this.hitMinDaInfo = str6;
        this.hitMaxDaInfo = str7;
        this.noticeDaInfo = str8;
        this.noticeColor = num3;
    }
}
