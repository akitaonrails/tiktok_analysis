package com.ss.android.ugc.aweme.poi.recommendfeature.list.component.bottombar;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBottomButtonGroup;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiShareInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiShopBookingInfo;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendFeatureBottomBarModule extends BaseComponentData implements Serializable {

    @C09CT("collect_info")
    public final String collectInfo;

    @C09CT("is_collected")
    public final Boolean isCollected;

    @C09CT("poi_bottom_button_group")
    public final PoiBottomButtonGroup poiBottomButtonGroup;

    @C09CT("poi_id")
    public final String poiId;

    @C09CT("location")
    public final PoiLocation poiLocation;

    @C09CT("review_extra_info")
    public final String reviewExtraInfo;

    @C09CT("service_button")
    public final PoiShopBookingInfo serviceButton;

    @C09CT("share_info")
    public final PoiShareInfo shareInfo;

    @C09CT("type_level")
    public final String typeLevel;

    public PoiRecommendFeatureBottomBarModule() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public final PoiRecommendFeatureBottomBarModule copy(PoiShopBookingInfo poiShopBookingInfo, String str, String str2, PoiShareInfo poiShareInfo, PoiLocation poiLocation, String str3, Boolean bool, String str4, PoiBottomButtonGroup poiBottomButtonGroup) {
        return new PoiRecommendFeatureBottomBarModule(poiShopBookingInfo, str, str2, poiShareInfo, poiLocation, str3, bool, str4, poiBottomButtonGroup);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiRecommendFeatureBottomBarModule)) {
            return false;
        }
        PoiRecommendFeatureBottomBarModule poiRecommendFeatureBottomBarModule = (PoiRecommendFeatureBottomBarModule) obj;
        return Intrinsics.LJFF(this.serviceButton, poiRecommendFeatureBottomBarModule.serviceButton) && Intrinsics.LJFF(this.typeLevel, poiRecommendFeatureBottomBarModule.typeLevel) && Intrinsics.LJFF(this.collectInfo, poiRecommendFeatureBottomBarModule.collectInfo) && Intrinsics.LJFF(this.shareInfo, poiRecommendFeatureBottomBarModule.shareInfo) && Intrinsics.LJFF(this.poiLocation, poiRecommendFeatureBottomBarModule.poiLocation) && Intrinsics.LJFF(this.reviewExtraInfo, poiRecommendFeatureBottomBarModule.reviewExtraInfo) && Intrinsics.LJFF(this.isCollected, poiRecommendFeatureBottomBarModule.isCollected) && Intrinsics.LJFF(this.poiId, poiRecommendFeatureBottomBarModule.poiId) && Intrinsics.LJFF(this.poiBottomButtonGroup, poiRecommendFeatureBottomBarModule.poiBottomButtonGroup);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        PoiShopBookingInfo poiShopBookingInfo = this.serviceButton;
        int iHashCode = (poiShopBookingInfo == null ? 0 : poiShopBookingInfo.hashCode()) * 31;
        String str = this.typeLevel;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.collectInfo;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PoiShareInfo poiShareInfo = this.shareInfo;
        int iHashCode4 = (iHashCode3 + (poiShareInfo == null ? 0 : poiShareInfo.hashCode())) * 31;
        PoiLocation poiLocation = this.poiLocation;
        int iHashCode5 = (iHashCode4 + (poiLocation == null ? 0 : poiLocation.hashCode())) * 31;
        String str3 = this.reviewExtraInfo;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isCollected;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.poiId;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PoiBottomButtonGroup poiBottomButtonGroup = this.poiBottomButtonGroup;
        return iHashCode8 + (poiBottomButtonGroup != null ? poiBottomButtonGroup.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiRecommendFeatureBottomBarModule(serviceButton=");
        sbLIZ.append(this.serviceButton);
        sbLIZ.append(", typeLevel=");
        sbLIZ.append(this.typeLevel);
        sbLIZ.append(", collectInfo=");
        sbLIZ.append(this.collectInfo);
        sbLIZ.append(", shareInfo=");
        sbLIZ.append(this.shareInfo);
        sbLIZ.append(", poiLocation=");
        sbLIZ.append(this.poiLocation);
        sbLIZ.append(", reviewExtraInfo=");
        sbLIZ.append(this.reviewExtraInfo);
        sbLIZ.append(", isCollected=");
        sbLIZ.append(this.isCollected);
        sbLIZ.append(", poiId=");
        sbLIZ.append(this.poiId);
        sbLIZ.append(", poiBottomButtonGroup=");
        sbLIZ.append(this.poiBottomButtonGroup);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getCollectInfo() {
        return this.collectInfo;
    }

    public final PoiBottomButtonGroup getPoiBottomButtonGroup() {
        return this.poiBottomButtonGroup;
    }

    public final String getPoiId() {
        return this.poiId;
    }

    public final PoiLocation getPoiLocation() {
        return this.poiLocation;
    }

    public final String getReviewExtraInfo() {
        return this.reviewExtraInfo;
    }

    public final PoiShopBookingInfo getServiceButton() {
        return this.serviceButton;
    }

    public final PoiShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public final String getTypeLevel() {
        return this.typeLevel;
    }

    public final Boolean isCollected() {
        return this.isCollected;
    }

    public PoiRecommendFeatureBottomBarModule(PoiShopBookingInfo poiShopBookingInfo, String str, String str2, PoiShareInfo poiShareInfo, PoiLocation poiLocation, String str3, Boolean bool, String str4, PoiBottomButtonGroup poiBottomButtonGroup) {
        this.serviceButton = poiShopBookingInfo;
        this.typeLevel = str;
        this.collectInfo = str2;
        this.shareInfo = poiShareInfo;
        this.poiLocation = poiLocation;
        this.reviewExtraInfo = str3;
        this.isCollected = bool;
        this.poiId = str4;
        this.poiBottomButtonGroup = poiBottomButtonGroup;
    }
}
