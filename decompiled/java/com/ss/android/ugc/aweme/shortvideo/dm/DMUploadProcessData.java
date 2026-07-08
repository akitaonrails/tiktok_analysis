package com.ss.android.ugc.aweme.shortvideo.dm;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.dm.DMUploadProcessData;

/* JADX INFO: loaded from: classes23.dex */
public final class DMUploadProcessData implements Parcelable {
    public static final Parcelable.Creator<DMUploadProcessData> CREATOR = new Parcelable.Creator<DMUploadProcessData>() { // from class: X.0mf6
        @Override // android.os.Parcelable.Creator
        public final DMUploadProcessData createFromParcel(Parcel parcel) {
            return new DMUploadProcessData(parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final DMUploadProcessData[] newArray(int i) {
            return new DMUploadProcessData[i];
        }
    };
    public final int smartSliceSize;
    public final long toUploadSizeWhenSyntheticEnd;
    public final long uploadFileSizeB;
    public final long uploadOffsetSizeWhenSyntheticEnd;
    public final long uploadWaitClickPublishTimeMs;
    public final long uploadWaitSyntheticTimeMs;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DMUploadProcessData)) {
            return false;
        }
        DMUploadProcessData dMUploadProcessData = (DMUploadProcessData) obj;
        return this.uploadWaitClickPublishTimeMs == dMUploadProcessData.uploadWaitClickPublishTimeMs && this.uploadWaitSyntheticTimeMs == dMUploadProcessData.uploadWaitSyntheticTimeMs && this.uploadOffsetSizeWhenSyntheticEnd == dMUploadProcessData.uploadOffsetSizeWhenSyntheticEnd && this.toUploadSizeWhenSyntheticEnd == dMUploadProcessData.toUploadSizeWhenSyntheticEnd && this.uploadFileSizeB == dMUploadProcessData.uploadFileSizeB && this.smartSliceSize == dMUploadProcessData.smartSliceSize;
    }

    public final int hashCode() {
        return (((((((((C786410Ut5.Y2(this.uploadWaitClickPublishTimeMs) * 31) + C786410Ut5.Y2(this.uploadWaitSyntheticTimeMs)) * 31) + C786410Ut5.Y2(this.uploadOffsetSizeWhenSyntheticEnd)) * 31) + C786410Ut5.Y2(this.toUploadSizeWhenSyntheticEnd)) * 31) + C786410Ut5.Y2(this.uploadFileSizeB)) * 31) + this.smartSliceSize;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DMUploadProcessData(uploadWaitClickPublishTimeMs=");
        sbLIZ.append(this.uploadWaitClickPublishTimeMs);
        sbLIZ.append(", uploadWaitSyntheticTimeMs=");
        sbLIZ.append(this.uploadWaitSyntheticTimeMs);
        sbLIZ.append(", uploadOffsetSizeWhenSyntheticEnd=");
        sbLIZ.append(this.uploadOffsetSizeWhenSyntheticEnd);
        sbLIZ.append(", toUploadSizeWhenSyntheticEnd=");
        sbLIZ.append(this.toUploadSizeWhenSyntheticEnd);
        sbLIZ.append(", uploadFileSizeB=");
        sbLIZ.append(this.uploadFileSizeB);
        sbLIZ.append(", smartSliceSize=");
        sbLIZ.append(this.smartSliceSize);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.uploadWaitClickPublishTimeMs);
        parcel.writeLong(this.uploadWaitSyntheticTimeMs);
        parcel.writeLong(this.uploadOffsetSizeWhenSyntheticEnd);
        parcel.writeLong(this.toUploadSizeWhenSyntheticEnd);
        parcel.writeLong(this.uploadFileSizeB);
        parcel.writeInt(this.smartSliceSize);
    }

    public DMUploadProcessData() {
        this(0, -1L, -1L, -1L, -1L, -1L);
    }

    public DMUploadProcessData(int i, long j, long j2, long j3, long j4, long j5) {
        this.uploadWaitClickPublishTimeMs = j;
        this.uploadWaitSyntheticTimeMs = j2;
        this.uploadOffsetSizeWhenSyntheticEnd = j3;
        this.toUploadSizeWhenSyntheticEnd = j4;
        this.uploadFileSizeB = j5;
        this.smartSliceSize = i;
    }
}
