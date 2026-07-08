package com.ss.android.ugc.aweme.shortvideo.music;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.music.EPRecommendThumbConfig;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class EPRecommendThumbConfig implements Parcelable, Serializable {
    public static final Parcelable.Creator<EPRecommendThumbConfig> CREATOR = new Parcelable.Creator<EPRecommendThumbConfig>() { // from class: X.0NLC
        @Override // android.os.Parcelable.Creator
        public final EPRecommendThumbConfig createFromParcel(Parcel parcel) {
            return new EPRecommendThumbConfig(parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final EPRecommendThumbConfig[] newArray(int i) {
            return new EPRecommendThumbConfig[i];
        }
    };

    @C09CT("max_thumb_count")
    public final int maxThumbCount;

    @C09CT("thumb_pts_tolerance_in_ms")
    public final long thumbPtsToleranceInMs;

    public EPRecommendThumbConfig() {
        this(5, 115L);
    }

    public final EPRecommendThumbConfig copy(int i, long j) {
        return new EPRecommendThumbConfig(i, j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EPRecommendThumbConfig)) {
            return false;
        }
        EPRecommendThumbConfig ePRecommendThumbConfig = (EPRecommendThumbConfig) obj;
        return this.maxThumbCount == ePRecommendThumbConfig.maxThumbCount && this.thumbPtsToleranceInMs == ePRecommendThumbConfig.thumbPtsToleranceInMs;
    }

    public int hashCode() {
        return (this.maxThumbCount * 31) + C786410Ut5.Y2(this.thumbPtsToleranceInMs);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EPRecommendThumbConfig(maxThumbCount=");
        sbLIZ.append(this.maxThumbCount);
        sbLIZ.append(", thumbPtsToleranceInMs=");
        sbLIZ.append(this.thumbPtsToleranceInMs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.maxThumbCount);
        parcel.writeLong(this.thumbPtsToleranceInMs);
    }

    public final int getMaxThumbCount() {
        return this.maxThumbCount;
    }

    public final long getThumbPtsToleranceInMs() {
        return this.thumbPtsToleranceInMs;
    }

    public EPRecommendThumbConfig(int i, long j) {
        this.maxThumbCount = i;
        this.thumbPtsToleranceInMs = j;
    }
}
