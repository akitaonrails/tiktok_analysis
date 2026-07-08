package com.ss.android.ugc.aweme.ecommerce.base.osp.assem.module.address.identity;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.assem.module.address.identity.CpfEnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoPanel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CpfEnterParams implements Parcelable {
    public final String fillType;
    public final String formatInvalidHint;
    public final Boolean hasAddress;
    public final IdentityInfoPanel identityInfoPanel;
    public final String networkErrHint;
    public final String trackParamsJson;
    public final String triggerEvent;
    public final String vendorCheckFailHint;
    public static final Parcelable.Creator<CpfEnterParams> CREATOR = new Parcelable.Creator<CpfEnterParams>() { // from class: X.03I5
        @Override // android.os.Parcelable.Creator
        public final CpfEnterParams createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            IdentityInfoPanel identityInfoPanelCreateFromParcel = IdentityInfoPanel.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new CpfEnterParams(identityInfoPanelCreateFromParcel, string, string2, string3, string4, string5, boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CpfEnterParams[] newArray(int i) {
            return new CpfEnterParams[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CpfEnterParams)) {
            return false;
        }
        CpfEnterParams cpfEnterParams = (CpfEnterParams) obj;
        return Intrinsics.LJFF(this.identityInfoPanel, cpfEnterParams.identityInfoPanel) && Intrinsics.LJFF(this.fillType, cpfEnterParams.fillType) && Intrinsics.LJFF(this.formatInvalidHint, cpfEnterParams.formatInvalidHint) && Intrinsics.LJFF(this.vendorCheckFailHint, cpfEnterParams.vendorCheckFailHint) && Intrinsics.LJFF(this.networkErrHint, cpfEnterParams.networkErrHint) && Intrinsics.LJFF(this.triggerEvent, cpfEnterParams.triggerEvent) && Intrinsics.LJFF(this.hasAddress, cpfEnterParams.hasAddress) && Intrinsics.LJFF(this.trackParamsJson, cpfEnterParams.trackParamsJson);
    }

    public final int hashCode() {
        int iHashCode = this.identityInfoPanel.hashCode() * 31;
        String str = this.fillType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.formatInvalidHint;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.vendorCheckFailHint;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.networkErrHint;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.triggerEvent;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.hasAddress;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.trackParamsJson;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CpfEnterParams(identityInfoPanel=");
        sbLIZ.append(this.identityInfoPanel);
        sbLIZ.append(", fillType=");
        sbLIZ.append(this.fillType);
        sbLIZ.append(", formatInvalidHint=");
        sbLIZ.append(this.formatInvalidHint);
        sbLIZ.append(", vendorCheckFailHint=");
        sbLIZ.append(this.vendorCheckFailHint);
        sbLIZ.append(", networkErrHint=");
        sbLIZ.append(this.networkErrHint);
        sbLIZ.append(", triggerEvent=");
        sbLIZ.append(this.triggerEvent);
        sbLIZ.append(", hasAddress=");
        sbLIZ.append(this.hasAddress);
        sbLIZ.append(", trackParamsJson=");
        sbLIZ.append(this.trackParamsJson);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        this.identityInfoPanel.writeToParcel(parcel, i);
        parcel.writeString(this.fillType);
        parcel.writeString(this.formatInvalidHint);
        parcel.writeString(this.vendorCheckFailHint);
        parcel.writeString(this.networkErrHint);
        parcel.writeString(this.triggerEvent);
        Boolean bool = this.hasAddress;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.trackParamsJson);
    }

    public CpfEnterParams(IdentityInfoPanel identityInfoPanel, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6) {
        this.identityInfoPanel = identityInfoPanel;
        this.fillType = str;
        this.formatInvalidHint = str2;
        this.vendorCheckFailHint = str3;
        this.networkErrHint = str4;
        this.triggerEvent = str5;
        this.hasAddress = bool;
        this.trackParamsJson = str6;
    }
}
