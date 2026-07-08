package com.ss.android.ugc.aweme.poi.mapmode.model;

import X.InterfaceC1294060jmO;
import X.InterfaceC2753014t;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapModeMobParams implements Serializable, InterfaceC2753014t {
    public final String adClickId;
    public final String enterFrom;
    public final MapModeEnterMethod enterMethod;
    public final String fromGroupId;
    public final String fromPoiId;
    public final String initialPoiEnterFrom;
    public final String initialPoiEnterMethod;
    public final String initialPoiFromGroupId;
    public final String initialPoiId;
    public final MapModeType mapModeType;
    public final String pageCollectInfo;
    public final String poiDetailEnterFrom;
    public final String poiDetailEnterMethod;
    public final String sourceBtmToken;
    public final Integer userCityStatus;

    public PoiMapModeMobParams() {
        this(null, null, null, null, null, null, null, null, null, null, MapModeType.OTHERS, null, null, null, null);
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getSourceId$annotations() {
    }

    public final PoiMapModeMobParams copy(String str, String str2, MapModeEnterMethod mapModeEnterMethod, String str3, String str4, String str5, String str6, String str7, String str8, String str9, MapModeType mapModeType, String str10, String str11, String str12, Integer num) {
        return new PoiMapModeMobParams(str, str2, mapModeEnterMethod, str3, str4, str5, str6, str7, str8, str9, mapModeType, str10, str11, str12, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiMapModeMobParams)) {
            return false;
        }
        PoiMapModeMobParams poiMapModeMobParams = (PoiMapModeMobParams) obj;
        return Intrinsics.LJFF(this.fromGroupId, poiMapModeMobParams.fromGroupId) && Intrinsics.LJFF(this.fromPoiId, poiMapModeMobParams.fromPoiId) && this.enterMethod == poiMapModeMobParams.enterMethod && Intrinsics.LJFF(this.poiDetailEnterFrom, poiMapModeMobParams.poiDetailEnterFrom) && Intrinsics.LJFF(this.poiDetailEnterMethod, poiMapModeMobParams.poiDetailEnterMethod) && Intrinsics.LJFF(this.initialPoiEnterFrom, poiMapModeMobParams.initialPoiEnterFrom) && Intrinsics.LJFF(this.initialPoiEnterMethod, poiMapModeMobParams.initialPoiEnterMethod) && Intrinsics.LJFF(this.initialPoiFromGroupId, poiMapModeMobParams.initialPoiFromGroupId) && Intrinsics.LJFF(this.initialPoiId, poiMapModeMobParams.initialPoiId) && Intrinsics.LJFF(this.adClickId, poiMapModeMobParams.adClickId) && this.mapModeType == poiMapModeMobParams.mapModeType && Intrinsics.LJFF(this.pageCollectInfo, poiMapModeMobParams.pageCollectInfo) && Intrinsics.LJFF(this.sourceBtmToken, poiMapModeMobParams.sourceBtmToken) && Intrinsics.LJFF(this.enterFrom, poiMapModeMobParams.enterFrom) && Intrinsics.LJFF(this.userCityStatus, poiMapModeMobParams.userCityStatus);
    }

    public String getSourceId() {
        return "PoiMapModeMobParams";
    }

    public int hashCode() {
        String str = this.fromGroupId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fromPoiId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        MapModeEnterMethod mapModeEnterMethod = this.enterMethod;
        int iHashCode3 = (iHashCode2 + (mapModeEnterMethod == null ? 0 : mapModeEnterMethod.hashCode())) * 31;
        String str3 = this.poiDetailEnterFrom;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.poiDetailEnterMethod;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.initialPoiEnterFrom;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.initialPoiEnterMethod;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.initialPoiFromGroupId;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.initialPoiId;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.adClickId;
        int iHashCode10 = (((iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31) + this.mapModeType.hashCode()) * 31;
        String str10 = this.pageCollectInfo;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.sourceBtmToken;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.enterFrom;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num = this.userCityStatus;
        return iHashCode13 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "PoiMapModeMobParams(fromGroupId=" + this.fromGroupId + ", fromPoiId=" + this.fromPoiId + ", enterMethod=" + this.enterMethod + ", poiDetailEnterFrom=" + this.poiDetailEnterFrom + ", poiDetailEnterMethod=" + this.poiDetailEnterMethod + ", initialPoiEnterFrom=" + this.initialPoiEnterFrom + ", initialPoiEnterMethod=" + this.initialPoiEnterMethod + ", initialPoiFromGroupId=" + this.initialPoiFromGroupId + ", initialPoiId=" + this.initialPoiId + ", adClickId=" + this.adClickId + ", mapModeType=" + this.mapModeType + ", pageCollectInfo=" + this.pageCollectInfo + ", sourceBtmToken=" + this.sourceBtmToken + ", enterFrom=" + this.enterFrom + ", userCityStatus=" + this.userCityStatus + ')';
    }

    public final String getAdClickId() {
        return this.adClickId;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final MapModeEnterMethod getEnterMethod() {
        return this.enterMethod;
    }

    public final String getFromGroupId() {
        return this.fromGroupId;
    }

    public final String getFromPoiId() {
        return this.fromPoiId;
    }

    public final String getInitialPoiEnterFrom() {
        return this.initialPoiEnterFrom;
    }

    public final String getInitialPoiEnterMethod() {
        return this.initialPoiEnterMethod;
    }

    public final String getInitialPoiFromGroupId() {
        return this.initialPoiFromGroupId;
    }

    public final String getInitialPoiId() {
        return this.initialPoiId;
    }

    public final MapModeType getMapModeType() {
        return this.mapModeType;
    }

    public final String getPageCollectInfo() {
        return this.pageCollectInfo;
    }

    public final String getPoiDetailEnterFrom() {
        return this.poiDetailEnterFrom;
    }

    public final String getPoiDetailEnterMethod() {
        return this.poiDetailEnterMethod;
    }

    public final String getSourceBtmToken() {
        return this.sourceBtmToken;
    }

    public final Integer getUserCityStatus() {
        return this.userCityStatus;
    }

    public PoiMapModeMobParams(String str, String str2, MapModeEnterMethod mapModeEnterMethod, String str3, String str4, String str5, String str6, String str7, String str8, String str9, MapModeType mapModeType, String str10, String str11, String str12, Integer num) {
        this.fromGroupId = str;
        this.fromPoiId = str2;
        this.enterMethod = mapModeEnterMethod;
        this.poiDetailEnterFrom = str3;
        this.poiDetailEnterMethod = str4;
        this.initialPoiEnterFrom = str5;
        this.initialPoiEnterMethod = str6;
        this.initialPoiFromGroupId = str7;
        this.initialPoiId = str8;
        this.adClickId = str9;
        this.mapModeType = mapModeType;
        this.pageCollectInfo = str10;
        this.sourceBtmToken = str11;
        this.enterFrom = str12;
        this.userCityStatus = num;
    }
}
