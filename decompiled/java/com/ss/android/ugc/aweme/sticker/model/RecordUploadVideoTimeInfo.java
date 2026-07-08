package com.ss.android.ugc.aweme.sticker.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.model.RecordUploadVideoTimeInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class RecordUploadVideoTimeInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<RecordUploadVideoTimeInfo> CREATOR = new Parcelable.Creator<RecordUploadVideoTimeInfo>() { // from class: X.0nO9
        @Override // android.os.Parcelable.Creator
        public final RecordUploadVideoTimeInfo createFromParcel(Parcel parcel) {
            return new RecordUploadVideoTimeInfo(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final RecordUploadVideoTimeInfo[] newArray(int i) {
            return new RecordUploadVideoTimeInfo[i];
        }
    };

    @C09CT("bgv_end_time")
    public final long endTime;

    @C09CT("bgv_start_time")
    public final long startTime;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
    }

    public RecordUploadVideoTimeInfo() {
        this(0L, 0L);
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public RecordUploadVideoTimeInfo(long j, long j2) {
        this.startTime = j;
        this.endTime = j2;
    }
}
