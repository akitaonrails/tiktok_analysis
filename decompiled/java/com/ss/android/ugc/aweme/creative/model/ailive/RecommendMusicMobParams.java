package com.ss.android.ugc.aweme.creative.model.ailive;

import X.C040H;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ailive.RecommendMusicMobParams;

/* JADX INFO: loaded from: classes9.dex */
public final class RecommendMusicMobParams implements Parcelable {
    public static final Parcelable.Creator<RecommendMusicMobParams> CREATOR = new Parcelable.Creator<RecommendMusicMobParams>() { // from class: X.0MBy
        @Override // android.os.Parcelable.Creator
        public final RecommendMusicMobParams createFromParcel(Parcel parcel) {
            return new RecommendMusicMobParams(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final RecommendMusicMobParams[] newArray(int i) {
            return new RecommendMusicMobParams[i];
        }
    };

    @C040H
    public final long startTime;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecommendMusicMobParams) && this.startTime == ((RecommendMusicMobParams) obj).startTime;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.startTime);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendMusicMobParams(startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.startTime);
    }

    public RecommendMusicMobParams(long j) {
        this.startTime = j;
    }
}
