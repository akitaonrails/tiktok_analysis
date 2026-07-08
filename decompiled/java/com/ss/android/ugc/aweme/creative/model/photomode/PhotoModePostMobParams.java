package com.ss.android.ugc.aweme.creative.model.photomode;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModePostMobParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class PhotoModePostMobParams implements Parcelable {
    public static final Parcelable.Creator<PhotoModePostMobParams> CREATOR = new Parcelable.Creator<PhotoModePostMobParams>() { // from class: X.0Kh1
        @Override // android.os.Parcelable.Creator
        public final PhotoModePostMobParams createFromParcel(Parcel parcel) {
            return new PhotoModePostMobParams(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoModePostMobParams[] newArray(int i) {
            return new PhotoModePostMobParams[i];
        }
    };

    @C09CT("h5_entrance")
    public String h5Entrance;

    @C09CT("photo_mode_campaign_trend_id")
    public final String trendId;

    public PhotoModePostMobParams() {
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
        if (!(obj instanceof PhotoModePostMobParams)) {
            return false;
        }
        PhotoModePostMobParams photoModePostMobParams = (PhotoModePostMobParams) obj;
        return Intrinsics.LJFF(this.h5Entrance, photoModePostMobParams.h5Entrance) && Intrinsics.LJFF(this.trendId, photoModePostMobParams.trendId);
    }

    public final int hashCode() {
        String str = this.h5Entrance;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.trendId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoModePostMobParams(h5Entrance=");
        sbLIZ.append(this.h5Entrance);
        sbLIZ.append(", trendId=");
        sbLIZ.append(this.trendId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.h5Entrance);
        parcel.writeString(this.trendId);
    }

    public PhotoModePostMobParams(String str, String str2) {
        this.h5Entrance = str;
        this.trendId = str2;
    }
}
