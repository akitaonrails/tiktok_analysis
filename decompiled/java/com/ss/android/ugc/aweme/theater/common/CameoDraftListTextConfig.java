package com.ss.android.ugc.aweme.theater.common;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.theater.common.CameoDraftListTextConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class CameoDraftListTextConfig implements Parcelable {
    public static final Parcelable.Creator<CameoDraftListTextConfig> CREATOR = new Parcelable.Creator<CameoDraftListTextConfig>() { // from class: X.0iHO
        @Override // android.os.Parcelable.Creator
        public final CameoDraftListTextConfig createFromParcel(Parcel parcel) {
            return new CameoDraftListTextConfig(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CameoDraftListTextConfig[] newArray(int i) {
            return new CameoDraftListTextConfig[i];
        }
    };

    @C09CT("card_text")
    public final String cardText;

    @C09CT("header_description")
    public final String headerDescription;

    @C09CT("header_title")
    public final String headerTitle;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameoDraftListTextConfig)) {
            return false;
        }
        CameoDraftListTextConfig cameoDraftListTextConfig = (CameoDraftListTextConfig) obj;
        return Intrinsics.LJFF(this.cardText, cameoDraftListTextConfig.cardText) && Intrinsics.LJFF(this.headerTitle, cameoDraftListTextConfig.headerTitle) && Intrinsics.LJFF(this.headerDescription, cameoDraftListTextConfig.headerDescription);
    }

    public final int hashCode() {
        String str = this.cardText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.headerTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.headerDescription;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameoDraftListTextConfig(cardText=");
        sbLIZ.append(this.cardText);
        sbLIZ.append(", headerTitle=");
        sbLIZ.append(this.headerTitle);
        sbLIZ.append(", headerDescription=");
        sbLIZ.append(this.headerDescription);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cardText);
        parcel.writeString(this.headerTitle);
        parcel.writeString(this.headerDescription);
    }

    public CameoDraftListTextConfig(String str, String str2, String str3) {
        this.cardText = str;
        this.headerTitle = str2;
        this.headerDescription = str3;
    }
}
