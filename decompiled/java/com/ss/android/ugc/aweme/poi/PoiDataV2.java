package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDataV2 {

    @C09CT("address")
    public final String address;

    @C09CT("alliance_detail")
    public final PoiAllianceDetail allianceDetail;

    @C09CT("city")
    public final String city;

    @C09CT("country")
    public final String country;

    @C09CT("details")
    public final PoiDetails details;

    @C09CT("display_category")
    public final String displayCategory;

    @C09CT("distance")
    public final String distance;

    @C09CT("district")
    public final String district;

    @C09CT("formatted_address")
    public final String formattedAddress;

    @C09CT("hight_positions")
    public final List<Position> hightPositions;

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

    @C09CT("poi_claim_status")
    public final Integer poiClaimStatus;

    @C09CT("service_id")
    public final String poiId;

    @C09CT("poi_title_img")
    public final String poiTitleImg;

    @C09CT("province")
    public final String province;

    @C09CT("tel")
    public final String telephone;

    public PoiDataV2() {
        this(null, null, 0.0d, 0.0d, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final Integer isRTL() {
        return this.isRTL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PoiDataV2(String str, String str2, double d, double d2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, PoiDetails poiDetails, PoiAllianceDetail poiAllianceDetail, PoiMobParam poiMobParam, String str13, Integer num, List<? extends Position> list, String str14, Integer num2, String str15) {
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
        this.details = poiDetails;
        this.allianceDetail = poiAllianceDetail;
        this.mobParam = poiMobParam;
        this.logId = str13;
        this.isRTL = num;
        this.hightPositions = list;
        this.displayCategory = str14;
        this.poiClaimStatus = num2;
        this.poiTitleImg = str15;
    }
}
