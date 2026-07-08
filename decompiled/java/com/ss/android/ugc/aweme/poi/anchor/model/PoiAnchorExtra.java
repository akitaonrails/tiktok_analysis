package com.ss.android.ugc.aweme.poi.anchor.model;

import X.C09CT;
import com.ss.android.ugc.aweme.poi.detail.container.model.OwnerInfoModel;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBookingInfo;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAnchorExtra implements Serializable {

    @C09CT("formatted_address")
    public final String address;

    @C09CT("booking_info")
    public final PoiBookingInfo bookingInfo;

    @C09CT("collect_info")
    public final String collectInfo;

    @C09CT("ctr_pred")
    public final String ctrPred;

    @C09CT("fallback_address")
    public final String fallbackAddress;

    @C09CT("fav_cnt")
    public final Long favCnt;

    @C09CT("is_collected")
    public final boolean isServerCollected;

    @C09CT("is_tt_key_category")
    public final Integer isTtKeyCategory;

    @C09CT("owner_info")
    public final OwnerInfoModel ownerInfo;

    @C09CT("city_code")
    public final String poiCityCode;

    @C09CT("city_name")
    public final String poiCityName;

    @C09CT("poi_id")
    public final String poiId;

    @C09CT("poi_info_source")
    public final String poiInfoSource;

    @C09CT("location")
    public final PoiLocation poiLocation;

    @C09CT("region_code")
    public final String poiRegionCode;

    @C09CT("Name")
    public final String poiServerName;

    @C09CT("type_level")
    public final String typeLevel;

    @C09CT("video_count")
    public final Long videoCount;

    public PoiAnchorExtra() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiAnchorExtra)) {
            return false;
        }
        PoiAnchorExtra poiAnchorExtra = (PoiAnchorExtra) obj;
        return Intrinsics.LJFF(this.poiId, poiAnchorExtra.poiId) && Intrinsics.LJFF(this.videoCount, poiAnchorExtra.videoCount) && Intrinsics.LJFF(this.poiCityName, poiAnchorExtra.poiCityName) && Intrinsics.LJFF(this.poiCityCode, poiAnchorExtra.poiCityCode) && Intrinsics.LJFF(this.poiRegionCode, poiAnchorExtra.poiRegionCode) && Intrinsics.LJFF(this.collectInfo, poiAnchorExtra.collectInfo) && Intrinsics.LJFF(this.typeLevel, poiAnchorExtra.typeLevel) && Intrinsics.LJFF(this.fallbackAddress, poiAnchorExtra.fallbackAddress) && Intrinsics.LJFF(this.poiInfoSource, poiAnchorExtra.poiInfoSource) && Intrinsics.LJFF(this.poiServerName, poiAnchorExtra.poiServerName) && Intrinsics.LJFF(this.poiLocation, poiAnchorExtra.poiLocation) && Intrinsics.LJFF(this.address, poiAnchorExtra.address) && Intrinsics.LJFF(this.ownerInfo, poiAnchorExtra.ownerInfo) && Intrinsics.LJFF(this.bookingInfo, poiAnchorExtra.bookingInfo) && this.isServerCollected == poiAnchorExtra.isServerCollected && Intrinsics.LJFF(this.favCnt, poiAnchorExtra.favCnt) && Intrinsics.LJFF(this.isTtKeyCategory, poiAnchorExtra.isTtKeyCategory) && Intrinsics.LJFF(this.ctrPred, poiAnchorExtra.ctrPred);
    }

    public String toString() {
        return "PoiAnchorExtra(poiId=" + this.poiId + ", videoCount=" + this.videoCount + ", poiCityName=" + this.poiCityName + ", poiCityCode=" + this.poiCityCode + ", poiRegionCode=" + this.poiRegionCode + ", collectInfo=" + this.collectInfo + ", typeLevel=" + this.typeLevel + ", fallbackAddress=" + this.fallbackAddress + ", poiInfoSource=" + this.poiInfoSource + ", poiServerName=" + this.poiServerName + ", poiLocation=" + this.poiLocation + ", address=" + this.address + ", ownerInfo=" + this.ownerInfo + ", bookingInfo=" + this.bookingInfo + ", isServerCollected=" + this.isServerCollected + ", favCnt=" + this.favCnt + ", isTtKeyCategory=" + this.isTtKeyCategory + ", ctrPred=" + this.ctrPred + ')';
    }

    public final boolean isServerCollected() {
        return this.isServerCollected;
    }

    public final Integer isTtKeyCategory() {
        return this.isTtKeyCategory;
    }

    public PoiAnchorExtra(String str, Long l, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, PoiLocation poiLocation, String str10, OwnerInfoModel ownerInfoModel, PoiBookingInfo poiBookingInfo, boolean z, Long l2, Integer num, String str11) {
        this.poiId = str;
        this.videoCount = l;
        this.poiCityName = str2;
        this.poiCityCode = str3;
        this.poiRegionCode = str4;
        this.collectInfo = str5;
        this.typeLevel = str6;
        this.fallbackAddress = str7;
        this.poiInfoSource = str8;
        this.poiServerName = str9;
        this.poiLocation = poiLocation;
        this.address = str10;
        this.ownerInfo = ownerInfoModel;
        this.bookingInfo = poiBookingInfo;
        this.isServerCollected = z;
        this.favCnt = l2;
        this.isTtKeyCategory = num;
        this.ctrPred = str11;
    }
}
