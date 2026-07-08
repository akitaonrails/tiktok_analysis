package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticsExpressionAreaExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticsDescription;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LogisticsExpressionAreaExtraInfo implements Parcelable {

    @C09CT("da_info")
    public String daInfo;

    @C09CT("hide_sku_images")
    public Integer hideSkuImages;

    @C09CT("logistics_service_id")
    public String logisticsServiceId;

    @C09CT("logistics_service_invalid")
    public Integer logisticsServiceInvalid;

    @C09CT("pop_up_info")
    public LogisticsDescription popUpInfo;
    public static final Parcelable.Creator<LogisticsExpressionAreaExtraInfo> CREATOR = new Parcelable.Creator<LogisticsExpressionAreaExtraInfo>() { // from class: X.02hU
        @Override // android.os.Parcelable.Creator
        public final LogisticsExpressionAreaExtraInfo createFromParcel(Parcel parcel) {
            LogisticsDescription logisticsDescriptionCreateFromParcel;
            Integer numValueOf;
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                logisticsDescriptionCreateFromParcel = null;
            } else {
                logisticsDescriptionCreateFromParcel = LogisticsDescription.CREATOR.createFromParcel(parcel);
            }
            LogisticsDescription logisticsDescription = logisticsDescriptionCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new LogisticsExpressionAreaExtraInfo(logisticsDescription, string, string2, numValueOf, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final LogisticsExpressionAreaExtraInfo[] newArray(int i) {
            return new LogisticsExpressionAreaExtraInfo[i];
        }
    };
    public static final int $stable = 8;

    public LogisticsExpressionAreaExtraInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogisticsExpressionAreaExtraInfo)) {
            return false;
        }
        LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo = (LogisticsExpressionAreaExtraInfo) obj;
        return Intrinsics.LJFF(this.popUpInfo, logisticsExpressionAreaExtraInfo.popUpInfo) && Intrinsics.LJFF(this.daInfo, logisticsExpressionAreaExtraInfo.daInfo) && Intrinsics.LJFF(this.logisticsServiceId, logisticsExpressionAreaExtraInfo.logisticsServiceId) && Intrinsics.LJFF(this.logisticsServiceInvalid, logisticsExpressionAreaExtraInfo.logisticsServiceInvalid) && Intrinsics.LJFF(this.hideSkuImages, logisticsExpressionAreaExtraInfo.hideSkuImages);
    }

    public final int hashCode() {
        LogisticsDescription logisticsDescription = this.popUpInfo;
        int iHashCode = (logisticsDescription == null ? 0 : logisticsDescription.hashCode()) * 31;
        String str = this.daInfo;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.logisticsServiceId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.logisticsServiceInvalid;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.hideSkuImages;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LogisticsExpressionAreaExtraInfo(popUpInfo=");
        sbLIZ.append(this.popUpInfo);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(", logisticsServiceId=");
        sbLIZ.append(this.logisticsServiceId);
        sbLIZ.append(", logisticsServiceInvalid=");
        sbLIZ.append(this.logisticsServiceInvalid);
        sbLIZ.append(", hideSkuImages=");
        sbLIZ.append(this.hideSkuImages);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LogisticsDescription logisticsDescription = this.popUpInfo;
        if (logisticsDescription == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logisticsDescription.writeToParcel(parcel, i);
        }
        parcel.writeString(this.daInfo);
        parcel.writeString(this.logisticsServiceId);
        Integer num = this.logisticsServiceInvalid;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.hideSkuImages;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public LogisticsExpressionAreaExtraInfo(LogisticsDescription logisticsDescription, String str, String str2, Integer num, Integer num2) {
        this.popUpInfo = logisticsDescription;
        this.daInfo = str;
        this.logisticsServiceId = str2;
        this.logisticsServiceInvalid = num;
        this.hideSkuImages = num2;
    }
}
