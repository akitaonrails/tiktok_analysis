package com.ss.android.ugc.aweme.creative.model.video2sticker;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.video2sticker.VideoTimeTrimData;

/* JADX INFO: loaded from: classes23.dex */
public final class VideoTimeTrimData implements Parcelable {
    public static final Parcelable.Creator<VideoTimeTrimData> CREATOR = new Parcelable.Creator<VideoTimeTrimData>() { // from class: X.0meA
        @Override // android.os.Parcelable.Creator
        public final VideoTimeTrimData createFromParcel(Parcel parcel) {
            boolean z;
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new VideoTimeTrimData(j, j2, z);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoTimeTrimData[] newArray(int i) {
            return new VideoTimeTrimData[i];
        }
    };

    @C09CT("end_time")
    public long endTime;

    @C09CT("is_single_frame")
    public boolean isSingleFrame;

    @C09CT("start_time")
    public long startTime;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoTimeTrimData)) {
            return false;
        }
        VideoTimeTrimData videoTimeTrimData = (VideoTimeTrimData) obj;
        return this.startTime == videoTimeTrimData.startTime && this.endTime == videoTimeTrimData.endTime && this.isSingleFrame == videoTimeTrimData.isSingleFrame;
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.startTime) * 31) + C786410Ut5.Y2(this.endTime)) * 31) + C786410Ut5.Z2(this.isSingleFrame);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoTimeTrimData(startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.endTime);
        sbLIZ.append(", isSingleFrame=");
        sbLIZ.append(this.isSingleFrame);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeInt(this.isSingleFrame ? 1 : 0);
    }

    public VideoTimeTrimData() {
        this(0L, 2500L, false);
    }

    public VideoTimeTrimData(long j, long j2, boolean z) {
        this.startTime = j;
        this.endTime = j2;
        this.isSingleFrame = z;
    }
}
