package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import X.C123100dR;
import X.C13LP;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiShopBookingInfo implements Serializable {

    @C09CT("content_list")
    public final List<PoiBookingContent> contentList;

    @C09CT("cta")
    public final String ctaTitle;

    @C09CT("pop_up_title")
    public final String dialogTitle;

    @C09CT("provider_type")
    public final Integer provider;

    @C09CT("service_button_type")
    public final Integer serviceButtonType;

    @C09CT("track_info")
    public final String trackInfo;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiShopBookingInfo)) {
            return false;
        }
        PoiShopBookingInfo poiShopBookingInfo = (PoiShopBookingInfo) obj;
        return Intrinsics.LJFF(this.provider, poiShopBookingInfo.provider) && Intrinsics.LJFF(this.ctaTitle, poiShopBookingInfo.ctaTitle) && Intrinsics.LJFF(this.dialogTitle, poiShopBookingInfo.dialogTitle) && Intrinsics.LJFF(this.contentList, poiShopBookingInfo.contentList) && Intrinsics.LJFF(this.trackInfo, poiShopBookingInfo.trackInfo) && Intrinsics.LJFF(this.serviceButtonType, poiShopBookingInfo.serviceButtonType);
    }

    public int hashCode() {
        Integer num = this.provider;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.ctaTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dialogTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PoiBookingContent> list = this.contentList;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.trackInfo;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.serviceButtonType;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiShopBookingInfo(provider=");
        sbLIZ.append(this.provider);
        sbLIZ.append(", ctaTitle=");
        sbLIZ.append(this.ctaTitle);
        sbLIZ.append(", dialogTitle=");
        sbLIZ.append(this.dialogTitle);
        sbLIZ.append(", contentList=");
        sbLIZ.append(this.contentList);
        sbLIZ.append(", trackInfo=");
        sbLIZ.append(this.trackInfo);
        sbLIZ.append(", serviceButtonType=");
        sbLIZ.append(this.serviceButtonType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String iconType$poi_release() {
        Integer num = this.serviceButtonType;
        return num != null ? num.intValue() == 1 ? "reserve" : num.intValue() == 3 ? "book" : num.intValue() == 2 ? "order" : "" : "";
    }

    public final boolean isValid() {
        List<PoiBookingContent> list;
        List<PoiBookingContent> list2;
        PoiBookingContent poiBookingContent;
        return C123100dR.LIZ(this.ctaTitle) && (list = this.contentList) != null && (list.isEmpty() ^ true) && (list2 = this.contentList) != null && (poiBookingContent = (PoiBookingContent) C13LP.LJJJLL(list2)) != null && poiBookingContent.isValid();
    }

    public PoiShopBookingInfo(Integer num, String str, String str2, List<PoiBookingContent> list, String str3, Integer num2) {
        this.provider = num;
        this.ctaTitle = str;
        this.dialogTitle = str2;
        this.contentList = list;
        this.trackInfo = str3;
        this.serviceButtonType = num2;
    }
}
