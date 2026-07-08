package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BnplUpgradeData;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BnplUpgradeData implements Parcelable {

    @C09CT("action_type")
    public String actionType;

    @C09CT("action_url")
    public String actionUrl;

    @C09CT("bnpl_upgrade_entrance_schema")
    public String bnplUpgradeEntranceSchema;

    @C09CT("bnpl_upgrade_rich_text")
    public ECRichText bnplUpgradeRichText;
    public static final Parcelable.Creator<BnplUpgradeData> CREATOR = new Parcelable.Creator<BnplUpgradeData>() { // from class: X.02pd
        @Override // android.os.Parcelable.Creator
        public final BnplUpgradeData createFromParcel(Parcel parcel) {
            return new BnplUpgradeData(parcel.readString(), (ECRichText) parcel.readParcelable(BnplUpgradeData.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BnplUpgradeData[] newArray(int i) {
            return new BnplUpgradeData[i];
        }
    };
    public static final int $stable = 8;

    public BnplUpgradeData() {
        this(null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BnplUpgradeData)) {
            return false;
        }
        BnplUpgradeData bnplUpgradeData = (BnplUpgradeData) obj;
        return Intrinsics.LJFF(this.bnplUpgradeEntranceSchema, bnplUpgradeData.bnplUpgradeEntranceSchema) && Intrinsics.LJFF(this.bnplUpgradeRichText, bnplUpgradeData.bnplUpgradeRichText) && Intrinsics.LJFF(this.actionType, bnplUpgradeData.actionType) && Intrinsics.LJFF(this.actionUrl, bnplUpgradeData.actionUrl);
    }

    public final int hashCode() {
        String str = this.bnplUpgradeEntranceSchema;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ECRichText eCRichText = this.bnplUpgradeRichText;
        int iHashCode2 = (iHashCode + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        String str2 = this.actionType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.actionUrl;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BnplUpgradeData(bnplUpgradeEntranceSchema=");
        sbLIZ.append(this.bnplUpgradeEntranceSchema);
        sbLIZ.append(", bnplUpgradeRichText=");
        sbLIZ.append(this.bnplUpgradeRichText);
        sbLIZ.append(", actionType=");
        sbLIZ.append(this.actionType);
        sbLIZ.append(", actionUrl=");
        sbLIZ.append(this.actionUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.bnplUpgradeEntranceSchema);
        parcel.writeParcelable(this.bnplUpgradeRichText, i);
        parcel.writeString(this.actionType);
        parcel.writeString(this.actionUrl);
    }

    public BnplUpgradeData(String str, ECRichText eCRichText, String str2, String str3) {
        this.bnplUpgradeEntranceSchema = str;
        this.bnplUpgradeRichText = eCRichText;
        this.actionType = str2;
        this.actionUrl = str3;
    }
}
