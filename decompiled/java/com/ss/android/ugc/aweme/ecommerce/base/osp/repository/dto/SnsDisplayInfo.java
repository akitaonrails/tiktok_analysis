package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsDisplayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsOptionModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodModule;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SnsDisplayInfo implements Parcelable {

    @C09CT("da_info")
    public String daInfo;

    @C09CT("display_info")
    public ECRichText displayInfo;

    @C09CT("sns_option_module")
    public SnsOptionModule snsOptionModule;

    @C09CT("sns_period_link")
    public String snsPeriodLink;

    @C09CT("sns_period_module")
    public SnsPeriodModule snsPeriodModule;

    @C09CT("sub_display_info")
    public ECRichText subDisplayInfo;
    public static final Parcelable.Creator<SnsDisplayInfo> CREATOR = new Parcelable.Creator<SnsDisplayInfo>() { // from class: X.02i1
        @Override // android.os.Parcelable.Creator
        public final SnsDisplayInfo createFromParcel(Parcel parcel) {
            SnsOptionModule snsOptionModuleCreateFromParcel;
            String string = parcel.readString();
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(SnsDisplayInfo.class.getClassLoader());
            ECRichText eCRichText2 = (ECRichText) parcel.readParcelable(SnsDisplayInfo.class.getClassLoader());
            SnsPeriodModule snsPeriodModuleCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                snsOptionModuleCreateFromParcel = null;
            } else {
                snsOptionModuleCreateFromParcel = SnsOptionModule.CREATOR.createFromParcel(parcel);
            }
            SnsOptionModule snsOptionModule = snsOptionModuleCreateFromParcel;
            if (parcel.readInt() != 0) {
                snsPeriodModuleCreateFromParcel = SnsPeriodModule.CREATOR.createFromParcel(parcel);
            }
            return new SnsDisplayInfo(string, eCRichText, eCRichText2, snsOptionModule, snsPeriodModuleCreateFromParcel, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SnsDisplayInfo[] newArray(int i) {
            return new SnsDisplayInfo[i];
        }
    };
    public static final int $stable = 8;

    public SnsDisplayInfo() {
        this(null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnsDisplayInfo)) {
            return false;
        }
        SnsDisplayInfo snsDisplayInfo = (SnsDisplayInfo) obj;
        return Intrinsics.LJFF(this.snsPeriodLink, snsDisplayInfo.snsPeriodLink) && Intrinsics.LJFF(this.displayInfo, snsDisplayInfo.displayInfo) && Intrinsics.LJFF(this.subDisplayInfo, snsDisplayInfo.subDisplayInfo) && Intrinsics.LJFF(this.snsOptionModule, snsDisplayInfo.snsOptionModule) && Intrinsics.LJFF(this.snsPeriodModule, snsDisplayInfo.snsPeriodModule) && Intrinsics.LJFF(this.daInfo, snsDisplayInfo.daInfo);
    }

    public final int hashCode() {
        String str = this.snsPeriodLink;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ECRichText eCRichText = this.displayInfo;
        int iHashCode2 = (iHashCode + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        ECRichText eCRichText2 = this.subDisplayInfo;
        int iHashCode3 = (iHashCode2 + (eCRichText2 == null ? 0 : eCRichText2.hashCode())) * 31;
        SnsOptionModule snsOptionModule = this.snsOptionModule;
        int iHashCode4 = (iHashCode3 + (snsOptionModule == null ? 0 : snsOptionModule.hashCode())) * 31;
        SnsPeriodModule snsPeriodModule = this.snsPeriodModule;
        int iHashCode5 = (iHashCode4 + (snsPeriodModule == null ? 0 : snsPeriodModule.hashCode())) * 31;
        String str2 = this.daInfo;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SnsDisplayInfo(snsPeriodLink=");
        sbLIZ.append(this.snsPeriodLink);
        sbLIZ.append(", displayInfo=");
        sbLIZ.append(this.displayInfo);
        sbLIZ.append(", subDisplayInfo=");
        sbLIZ.append(this.subDisplayInfo);
        sbLIZ.append(", snsOptionModule=");
        sbLIZ.append(this.snsOptionModule);
        sbLIZ.append(", snsPeriodModule=");
        sbLIZ.append(this.snsPeriodModule);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.snsPeriodLink);
        parcel.writeParcelable(this.displayInfo, i);
        parcel.writeParcelable(this.subDisplayInfo, i);
        SnsOptionModule snsOptionModule = this.snsOptionModule;
        if (snsOptionModule == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            snsOptionModule.writeToParcel(parcel, i);
        }
        SnsPeriodModule snsPeriodModule = this.snsPeriodModule;
        if (snsPeriodModule == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            snsPeriodModule.writeToParcel(parcel, i);
        }
        parcel.writeString(this.daInfo);
    }

    public SnsDisplayInfo(String str, ECRichText eCRichText, ECRichText eCRichText2, SnsOptionModule snsOptionModule, SnsPeriodModule snsPeriodModule, String str2) {
        this.snsPeriodLink = str;
        this.displayInfo = eCRichText;
        this.subDisplayInfo = eCRichText2;
        this.snsOptionModule = snsOptionModule;
        this.snsPeriodModule = snsPeriodModule;
        this.daInfo = str2;
    }
}
