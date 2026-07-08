package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CMPreviewInfo;

/* JADX INFO: loaded from: classes23.dex */
public final class CMPreviewInfo implements Parcelable {
    public static final Parcelable.Creator<CMPreviewInfo> CREATOR = new Parcelable.Creator<CMPreviewInfo>() { // from class: X.0nXq
        @Override // android.os.Parcelable.Creator
        public final CMPreviewInfo createFromParcel(Parcel parcel) {
            boolean z;
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new CMPreviewInfo(j, j2, z);
        }

        @Override // android.os.Parcelable.Creator
        public final CMPreviewInfo[] newArray(int i) {
            return new CMPreviewInfo[i];
        }
    };

    @C09CT("is_preview_enabled")
    public boolean isPreviewEnabled;

    @C09CT("preview_duration_in_ms")
    public long previewDurationTimeInMs;

    @C09CT("preview_start_time_in_ms")
    public long previewStartTimeInMs;

    public CMPreviewInfo() {
        this(0L, 0L, true);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CMPreviewInfo)) {
            return false;
        }
        CMPreviewInfo cMPreviewInfo = (CMPreviewInfo) obj;
        return this.previewStartTimeInMs == cMPreviewInfo.previewStartTimeInMs && this.previewDurationTimeInMs == cMPreviewInfo.previewDurationTimeInMs && this.isPreviewEnabled == cMPreviewInfo.isPreviewEnabled;
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.previewStartTimeInMs) * 31) + C786410Ut5.Y2(this.previewDurationTimeInMs)) * 31) + C786410Ut5.Z2(this.isPreviewEnabled);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CMPreviewInfo(previewStartTimeInMs=");
        sbLIZ.append(this.previewStartTimeInMs);
        sbLIZ.append(", previewDurationTimeInMs=");
        sbLIZ.append(this.previewDurationTimeInMs);
        sbLIZ.append(", isPreviewEnabled=");
        sbLIZ.append(this.isPreviewEnabled);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.previewStartTimeInMs);
        parcel.writeLong(this.previewDurationTimeInMs);
        parcel.writeInt(this.isPreviewEnabled ? 1 : 0);
    }

    public CMPreviewInfo(long j, long j2, boolean z) {
        this.previewStartTimeInMs = j;
        this.previewDurationTimeInMs = j2;
        this.isPreviewEnabled = z;
    }
}
