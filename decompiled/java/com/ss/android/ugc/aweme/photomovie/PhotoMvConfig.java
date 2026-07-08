package com.ss.android.ugc.aweme.photomovie;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.photomovie.PhotoMvConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class PhotoMvConfig implements Parcelable {
    public static final Parcelable.Creator<PhotoMvConfig> CREATOR = new Parcelable.Creator<PhotoMvConfig>() { // from class: X.0Kgx
        @Override // android.os.Parcelable.Creator
        public final PhotoMvConfig createFromParcel(Parcel parcel) {
            return new PhotoMvConfig(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoMvConfig[] newArray(int i) {
            return new PhotoMvConfig[i];
        }
    };
    public final String anchorMvId;
    public final String anchorMvPanel;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoMvConfig)) {
            return false;
        }
        PhotoMvConfig photoMvConfig = (PhotoMvConfig) obj;
        return Intrinsics.LJFF(this.anchorMvId, photoMvConfig.anchorMvId) && Intrinsics.LJFF(this.anchorMvPanel, photoMvConfig.anchorMvPanel);
    }

    public final int hashCode() {
        String str = this.anchorMvId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.anchorMvPanel;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoMvConfig(anchorMvId=");
        sbLIZ.append(this.anchorMvId);
        sbLIZ.append(", anchorMvPanel=");
        sbLIZ.append(this.anchorMvPanel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.anchorMvId);
        parcel.writeString(this.anchorMvPanel);
    }

    public PhotoMvConfig(String str, String str2) {
        this.anchorMvId = str;
        this.anchorMvPanel = str2;
    }
}
