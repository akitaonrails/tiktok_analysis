package com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto;

import X.C09CT;
import X.C1735310vG5;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ApplyAuthData;
import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.AuthPopup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ApplyAuthData implements Parcelable {

    @C09CT("auth_popup")
    public final AuthPopup authPopup;

    @C09CT("auth_status")
    public final Integer authStatus;
    public static final C1735310vG5 Companion = new Object() { // from class: X.0vG5
    };
    public static final Parcelable.Creator<ApplyAuthData> CREATOR = new Parcelable.Creator<ApplyAuthData>() { // from class: X.0vG4
        @Override // android.os.Parcelable.Creator
        public final ApplyAuthData createFromParcel(Parcel parcel) {
            Integer numValueOf;
            AuthPopup authPopupCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                authPopupCreateFromParcel = AuthPopup.CREATOR.createFromParcel(parcel);
            }
            return new ApplyAuthData(numValueOf, authPopupCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ApplyAuthData[] newArray(int i) {
            return new ApplyAuthData[i];
        }
    };

    public ApplyAuthData() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplyAuthData)) {
            return false;
        }
        ApplyAuthData applyAuthData = (ApplyAuthData) obj;
        return Intrinsics.LJFF(this.authStatus, applyAuthData.authStatus) && Intrinsics.LJFF(this.authPopup, applyAuthData.authPopup);
    }

    public final int hashCode() {
        Integer num = this.authStatus;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        AuthPopup authPopup = this.authPopup;
        return iHashCode + (authPopup != null ? authPopup.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApplyAuthData(authStatus=");
        sbLIZ.append(this.authStatus);
        sbLIZ.append(", authPopup=");
        sbLIZ.append(this.authPopup);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.authStatus;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        AuthPopup authPopup = this.authPopup;
        if (authPopup == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authPopup.writeToParcel(parcel, i);
        }
    }

    public ApplyAuthData(Integer num, AuthPopup authPopup) {
        this.authStatus = num;
        this.authPopup = authPopup;
    }
}
