package com.ss.android.ugc.aweme.poi.detail.container.bottom.dynamicscroll;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBottomButtonGroup;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiShopBookingInfo;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiScrollBottomBarModule extends BaseComponentData implements Serializable {

    @C09CT("collect_info")
    public final String collectInfo;

    @C09CT("is_collected")
    public final Boolean isCollect;

    @C09CT("poi_bottom_button_group")
    public final PoiBottomButtonGroup poiBottomButtonGroup;

    @C09CT("location")
    public final PoiLocation poiLocation;

    @C09CT("review_extra_info")
    public final String reviewExtraInfo;

    @C09CT("service_button")
    public final PoiShopBookingInfo serviceButton;

    @C09CT("share_info")
    public final ShareInfo shareInfo;

    @C09CT("type_level")
    public final String typeLevel;

    @C09CT("write_review_enable")
    public final boolean writeReviewEnable;

    public PoiScrollBottomBarModule() {
        this(null, null, null, null, null, null, false, null, null);
    }

    public final PoiScrollBottomBarModule copy(PoiShopBookingInfo poiShopBookingInfo, String str, Boolean bool, String str2, ShareInfo shareInfo, PoiLocation poiLocation, boolean z, String str3, PoiBottomButtonGroup poiBottomButtonGroup) {
        return new PoiScrollBottomBarModule(poiShopBookingInfo, str, bool, str2, shareInfo, poiLocation, z, str3, poiBottomButtonGroup);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiScrollBottomBarModule)) {
            return false;
        }
        PoiScrollBottomBarModule poiScrollBottomBarModule = (PoiScrollBottomBarModule) obj;
        return Intrinsics.LJFF(this.serviceButton, poiScrollBottomBarModule.serviceButton) && Intrinsics.LJFF(this.typeLevel, poiScrollBottomBarModule.typeLevel) && Intrinsics.LJFF(this.isCollect, poiScrollBottomBarModule.isCollect) && Intrinsics.LJFF(this.collectInfo, poiScrollBottomBarModule.collectInfo) && Intrinsics.LJFF(this.shareInfo, poiScrollBottomBarModule.shareInfo) && Intrinsics.LJFF(this.poiLocation, poiScrollBottomBarModule.poiLocation) && this.writeReviewEnable == poiScrollBottomBarModule.writeReviewEnable && Intrinsics.LJFF(this.reviewExtraInfo, poiScrollBottomBarModule.reviewExtraInfo) && Intrinsics.LJFF(this.poiBottomButtonGroup, poiScrollBottomBarModule.poiBottomButtonGroup);
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
        Boolean bool = this.isCollect;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.collectInfo;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ShareInfo shareInfo = this.shareInfo;
        int iHashCode5 = (iHashCode4 + (shareInfo == null ? 0 : shareInfo.hashCode())) * 31;
        PoiLocation poiLocation = this.poiLocation;
        int iHashCode6 = (((iHashCode5 + (poiLocation == null ? 0 : poiLocation.hashCode())) * 31) + C786410Ut5.Z2(this.writeReviewEnable)) * 31;
        String str3 = this.reviewExtraInfo;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PoiBottomButtonGroup poiBottomButtonGroup = this.poiBottomButtonGroup;
        return iHashCode7 + (poiBottomButtonGroup != null ? poiBottomButtonGroup.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiScrollBottomBarModule(serviceButton=");
        sbLIZ.append(this.serviceButton);
        sbLIZ.append(", typeLevel=");
        sbLIZ.append(this.typeLevel);
        sbLIZ.append(", isCollect=");
        sbLIZ.append(this.isCollect);
        sbLIZ.append(", collectInfo=");
        sbLIZ.append(this.collectInfo);
        sbLIZ.append(", shareInfo=");
        sbLIZ.append(this.shareInfo);
        sbLIZ.append(", poiLocation=");
        sbLIZ.append(this.poiLocation);
        sbLIZ.append(", writeReviewEnable=");
        sbLIZ.append(this.writeReviewEnable);
        sbLIZ.append(", reviewExtraInfo=");
        sbLIZ.append(this.reviewExtraInfo);
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

    public final PoiLocation getPoiLocation() {
        return this.poiLocation;
    }

    public final String getReviewExtraInfo() {
        return this.reviewExtraInfo;
    }

    public final PoiShopBookingInfo getServiceButton() {
        return this.serviceButton;
    }

    public final ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public final String getTypeLevel() {
        return this.typeLevel;
    }

    public final boolean getWriteReviewEnable() {
        return this.writeReviewEnable;
    }

    public final Boolean isCollect() {
        return this.isCollect;
    }

    public PoiScrollBottomBarModule(PoiShopBookingInfo poiShopBookingInfo, String str, Boolean bool, String str2, ShareInfo shareInfo, PoiLocation poiLocation, boolean z, String str3, PoiBottomButtonGroup poiBottomButtonGroup) {
        this.serviceButton = poiShopBookingInfo;
        this.typeLevel = str;
        this.isCollect = bool;
        this.collectInfo = str2;
        this.shareInfo = shareInfo;
        this.poiLocation = poiLocation;
        this.writeReviewEnable = z;
        this.reviewExtraInfo = str3;
        this.poiBottomButtonGroup = poiBottomButtonGroup;
    }
}
