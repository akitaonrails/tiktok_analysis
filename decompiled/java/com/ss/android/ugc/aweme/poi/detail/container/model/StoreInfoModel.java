package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class StoreInfoModel implements Serializable {

    @C09CT("opening_time_loss_back_up_info")
    public final String backUpInfo;

    @C09CT("opening_end_time")
    public final String endTime;

    @C09CT("OpeningHoursForPoiDetail")
    public final String openingHoursForPoiDetail;

    @C09CT("opening_status")
    public final boolean openingStatus;

    @C09CT("shutdown_info")
    public final String shutdownInfo;

    @C09CT("opening_start_time")
    public final String startTime;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreInfoModel)) {
            return false;
        }
        StoreInfoModel storeInfoModel = (StoreInfoModel) obj;
        return this.openingStatus == storeInfoModel.openingStatus && Intrinsics.LJFF(this.startTime, storeInfoModel.startTime) && Intrinsics.LJFF(this.endTime, storeInfoModel.endTime) && Intrinsics.LJFF(this.shutdownInfo, storeInfoModel.shutdownInfo) && Intrinsics.LJFF(this.backUpInfo, storeInfoModel.backUpInfo) && Intrinsics.LJFF(this.openingHoursForPoiDetail, storeInfoModel.openingHoursForPoiDetail);
    }

    public int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.openingStatus) * 31;
        String str = this.startTime;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.endTime;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shutdownInfo;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.backUpInfo;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.openingHoursForPoiDetail;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoreInfoModel(openingStatus=");
        sbLIZ.append(this.openingStatus);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.endTime);
        sbLIZ.append(", shutdownInfo=");
        sbLIZ.append(this.shutdownInfo);
        sbLIZ.append(", backUpInfo=");
        sbLIZ.append(this.backUpInfo);
        sbLIZ.append(", openingHoursForPoiDetail=");
        sbLIZ.append(this.openingHoursForPoiDetail);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StoreInfoModel(boolean z, String str, String str2, String str3, String str4, String str5) {
        this.openingStatus = z;
        this.startTime = str;
        this.endTime = str2;
        this.shutdownInfo = str3;
        this.backUpInfo = str4;
        this.openingHoursForPoiDetail = str5;
    }
}
