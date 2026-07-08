package com.ss.android.ugc.aweme.shortvideo;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.ExtraSession;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ExtraSession implements Parcelable {
    public static final Parcelable.Creator<ExtraSession> CREATOR = new Parcelable.Creator<ExtraSession>() { // from class: X.0nfs
        @Override // android.os.Parcelable.Creator
        public final ExtraSession createFromParcel(Parcel parcel) {
            return new ExtraSession(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExtraSession[] newArray(int i) {
            return new ExtraSession[i];
        }
    };
    public String commerceData;
    public String globalData;
    public String mainBusinessData;
    public String socialData;
    public String techData;
    public String ugData;

    public ExtraSession() {
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
        if (!(obj instanceof ExtraSession)) {
            return false;
        }
        ExtraSession extraSession = (ExtraSession) obj;
        return Intrinsics.LJFF(this.mainBusinessData, extraSession.mainBusinessData) && Intrinsics.LJFF(this.socialData, extraSession.socialData) && Intrinsics.LJFF(this.commerceData, extraSession.commerceData) && Intrinsics.LJFF(this.ugData, extraSession.ugData) && Intrinsics.LJFF(this.techData, extraSession.techData) && Intrinsics.LJFF(this.globalData, extraSession.globalData);
    }

    public final int hashCode() {
        String str = this.mainBusinessData;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.socialData;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.commerceData;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ugData;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.techData;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.globalData;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExtraSession(mainBusinessData=");
        sbLIZ.append(this.mainBusinessData);
        sbLIZ.append(", socialData=");
        sbLIZ.append(this.socialData);
        sbLIZ.append(", commerceData=");
        sbLIZ.append(this.commerceData);
        sbLIZ.append(", ugData=");
        sbLIZ.append(this.ugData);
        sbLIZ.append(", techData=");
        sbLIZ.append(this.techData);
        sbLIZ.append(", globalData=");
        sbLIZ.append(this.globalData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mainBusinessData);
        parcel.writeString(this.socialData);
        parcel.writeString(this.commerceData);
        parcel.writeString(this.ugData);
        parcel.writeString(this.techData);
        parcel.writeString(this.globalData);
    }

    public ExtraSession(String str, String str2, String str3, String str4, String str5, String str6) {
        this.mainBusinessData = str;
        this.socialData = str2;
        this.commerceData = str3;
        this.ugData = str4;
        this.techData = str5;
        this.globalData = str6;
    }
}
