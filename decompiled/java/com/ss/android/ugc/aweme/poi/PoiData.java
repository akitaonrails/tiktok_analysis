package com.ss.android.ugc.aweme.poi;

import X.C09C2;
import X.C09CT;
import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiData implements Serializable {

    @C09CT("address")
    public final String address;

    @C09CT("alliance_detail")
    public final String allianceDetail;

    @C09CT("city")
    public final String city;

    @C09CT("country")
    public final String country;

    @C09CT("details")
    public final String details;

    @C09CT("display_category")
    public final String displayCategory;

    @C09CT("distance")
    public final String distance;

    @C09CT("district")
    public final String district;

    @C09CT("formatted_address")
    public final String formattedAddress;

    @C09CT("from_encouraging_posting")
    public final Integer fromEncouragingPosting;

    @C09CT("hight_positions")
    public final String hightPositions;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("is_rtl")
    public final Integer isRTL;

    @C09CT("latitude")
    public final double latitude;

    @C09CT("location")
    public final String location;

    @C09CT("log_id")
    public final String logId;

    @C09CT("longitude")
    public final double longitude;

    @C09CT("mob_param")
    public final PoiMobParam mobParam;

    @C09CT("name")
    public final String name;

    @C09CT("poi_alliance_detail")
    public PoiAllianceDetail poiAllianceDetail;

    @C09CT("poi_claim_status")
    public final Integer poiClaimStatus;

    @C09CT("poi_details")
    public PoiDetails poiDetails;

    @C09CT("poi_extra_data")
    public final HashMap<String, String> poiExtraData;

    @C09CT("service_id")
    public final String poiId;

    @C09CT("poi_title_img")
    public final String poiTitleImg;

    @C09CT("province")
    public final String province;

    @C09CT("telephone")
    public final String telephone;

    @C09CT("ugc_poi_create_detail")
    public final String ugcPoiCreateDetail;

    public PoiData() {
        this(null, null, 0.0d, 0.0d, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final PoiData copy(String str, String str2, double d, double d2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, PoiMobParam poiMobParam, String str15, Integer num, String str16, String str17, Integer num2, Integer num3, HashMap<String, String> map, String str18, String str19) {
        return new PoiData(str, str2, d, d2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, poiMobParam, str15, num, str16, str17, num2, num3, map, str18, str19);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiData)) {
            return false;
        }
        PoiData poiData = (PoiData) obj;
        return Intrinsics.LJFF(this.id, poiData.id) && Intrinsics.LJFF(this.name, poiData.name) && Double.compare(this.latitude, poiData.latitude) == 0 && Double.compare(this.longitude, poiData.longitude) == 0 && Intrinsics.LJFF(this.location, poiData.location) && Intrinsics.LJFF(this.address, poiData.address) && Intrinsics.LJFF(this.district, poiData.district) && Intrinsics.LJFF(this.city, poiData.city) && Intrinsics.LJFF(this.province, poiData.province) && Intrinsics.LJFF(this.country, poiData.country) && Intrinsics.LJFF(this.formattedAddress, poiData.formattedAddress) && Intrinsics.LJFF(this.telephone, poiData.telephone) && Intrinsics.LJFF(this.distance, poiData.distance) && Intrinsics.LJFF(this.poiId, poiData.poiId) && Intrinsics.LJFF(this.details, poiData.details) && Intrinsics.LJFF(this.allianceDetail, poiData.allianceDetail) && Intrinsics.LJFF(this.mobParam, poiData.mobParam) && Intrinsics.LJFF(this.logId, poiData.logId) && Intrinsics.LJFF(this.isRTL, poiData.isRTL) && Intrinsics.LJFF(this.hightPositions, poiData.hightPositions) && Intrinsics.LJFF(this.displayCategory, poiData.displayCategory) && Intrinsics.LJFF(this.poiClaimStatus, poiData.poiClaimStatus) && Intrinsics.LJFF(this.fromEncouragingPosting, poiData.fromEncouragingPosting) && Intrinsics.LJFF(this.poiExtraData, poiData.poiExtraData) && Intrinsics.LJFF(this.poiTitleImg, poiData.poiTitleImg) && Intrinsics.LJFF(this.ugcPoiCreateDetail, poiData.ugcPoiCreateDetail);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.X2(this.latitude)) * 31) + C786410Ut5.X2(this.longitude)) * 31;
        String str3 = this.location;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.address;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.district;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.city;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.province;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.country;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.formattedAddress;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.telephone;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.distance;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.poiId;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.details;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.allianceDetail;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        PoiMobParam poiMobParam = this.mobParam;
        int iHashCode15 = (iHashCode14 + (poiMobParam == null ? 0 : poiMobParam.hashCode())) * 31;
        String str15 = this.logId;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num = this.isRTL;
        int iHashCode17 = (iHashCode16 + (num == null ? 0 : num.hashCode())) * 31;
        String str16 = this.hightPositions;
        int iHashCode18 = (iHashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.displayCategory;
        int iHashCode19 = (iHashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Integer num2 = this.poiClaimStatus;
        int iHashCode20 = (iHashCode19 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.fromEncouragingPosting;
        int iHashCode21 = (iHashCode20 + (num3 == null ? 0 : num3.hashCode())) * 31;
        HashMap<String, String> map = this.poiExtraData;
        int iHashCode22 = (iHashCode21 + (map == null ? 0 : map.hashCode())) * 31;
        String str18 = this.poiTitleImg;
        int iHashCode23 = (iHashCode22 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.ugcPoiCreateDetail;
        return iHashCode23 + (str19 != null ? str19.hashCode() : 0);
    }

    public String toString() {
        return "PoiData(id=" + this.id + ", name=" + this.name + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", location=" + this.location + ", address=" + this.address + ", district=" + this.district + ", city=" + this.city + ", province=" + this.province + ", country=" + this.country + ", formattedAddress=" + this.formattedAddress + ", telephone=" + this.telephone + ", distance=" + this.distance + ", poiId=" + this.poiId + ", details=" + this.details + ", allianceDetail=" + this.allianceDetail + ", mobParam=" + this.mobParam + ", logId=" + this.logId + ", isRTL=" + this.isRTL + ", hightPositions=" + this.hightPositions + ", displayCategory=" + this.displayCategory + ", poiClaimStatus=" + this.poiClaimStatus + ", fromEncouragingPosting=" + this.fromEncouragingPosting + ", poiExtraData=" + this.poiExtraData + ", poiTitleImg=" + this.poiTitleImg + ", ugcPoiCreateDetail=" + this.ugcPoiCreateDetail + ')';
    }

    public final PoiAllianceDetail getPoiAllianceDetail() {
        PoiAllianceDetail poiAllianceDetail = this.poiAllianceDetail;
        if (poiAllianceDetail != null) {
            return poiAllianceDetail;
        }
        try {
            String str = this.allianceDetail;
            if (str == null) {
                return null;
            }
            PoiAllianceDetail poiAllianceDetail2 = (PoiAllianceDetail) C09C2.LIZ().LJII(str, PoiAllianceDetail.class);
            this.poiAllianceDetail = poiAllianceDetail2;
            String.valueOf(poiAllianceDetail2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (e.getMessage() == null) {
                e.toString();
            }
        }
        return this.poiAllianceDetail;
    }

    public final PoiDetails getPoiDetails() {
        PoiDetails poiDetails = this.poiDetails;
        if (poiDetails != null) {
            return poiDetails;
        }
        try {
            String str = this.details;
            if (str == null) {
                return null;
            }
            PoiDetails poiDetails2 = (PoiDetails) C09C2.LIZ().LJII(str, PoiDetails.class);
            this.poiDetails = poiDetails2;
            String.valueOf(poiDetails2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (e.getMessage() == null) {
                e.toString();
            }
        }
        return this.poiDetails;
    }

    public final boolean isUgcPoi() {
        Integer num = this.poiClaimStatus;
        int value = PoiClaimStatusEnum.UNDER_REVIEW.getValue();
        if (num != null && num.intValue() == value) {
            return true;
        }
        Integer num2 = this.poiClaimStatus;
        return num2 != null && num2.intValue() == PoiClaimStatusEnum.REJECTED.getValue();
    }

    public final Integer isRTL() {
        return this.isRTL;
    }

    public PoiData(String str, String str2, double d, double d2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, PoiMobParam poiMobParam, String str15, Integer num, String str16, String str17, Integer num2, Integer num3, HashMap<String, String> map, String str18, String str19) {
        this.id = str;
        this.name = str2;
        this.latitude = d;
        this.longitude = d2;
        this.location = str3;
        this.address = str4;
        this.district = str5;
        this.city = str6;
        this.province = str7;
        this.country = str8;
        this.formattedAddress = str9;
        this.telephone = str10;
        this.distance = str11;
        this.poiId = str12;
        this.details = str13;
        this.allianceDetail = str14;
        this.mobParam = poiMobParam;
        this.logId = str15;
        this.isRTL = num;
        this.hightPositions = str16;
        this.displayCategory = str17;
        this.poiClaimStatus = num2;
        this.fromEncouragingPosting = num3;
        this.poiExtraData = map;
        this.poiTitleImg = str18;
        this.ugcPoiCreateDetail = str19;
    }
}
