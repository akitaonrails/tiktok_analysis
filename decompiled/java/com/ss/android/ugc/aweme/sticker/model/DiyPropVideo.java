package com.ss.android.ugc.aweme.sticker.model;

import X.C09CT;
import X.C0MY0;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.model.DiyPropVideo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class DiyPropVideo implements Serializable, Parcelable {
    public static final Parcelable.Creator<DiyPropVideo> CREATOR = new Parcelable.Creator<DiyPropVideo>() { // from class: X.0npf
        @Override // android.os.Parcelable.Creator
        public final DiyPropVideo createFromParcel(Parcel parcel) {
            return new DiyPropVideo(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DiyPropVideo[] newArray(int i) {
            return new DiyPropVideo[i];
        }
    };

    @C09CT("endTime")
    public long endTime;

    @C09CT("maxDuration")
    public final long maxDuration;

    @C09CT("uid")
    public final String uid;

    @C09CT("videoPath")
    @C0MY0
    public final String videoPath;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoPath);
        parcel.writeLong(this.maxDuration);
        parcel.writeLong(this.endTime);
        parcel.writeString(this.uid);
    }

    public int hashCode() {
        return this.videoPath.hashCode();
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getMaxDuration() {
        return this.maxDuration;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public boolean equals(Object obj) {
        if (obj instanceof BackgroundVideo) {
            return Intrinsics.LJFF(this.videoPath, ((BackgroundVideo) obj).getVideoPath());
        }
        return false;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public DiyPropVideo(String str, long j, long j2, String str2) {
        this.videoPath = str;
        this.maxDuration = j;
        this.endTime = j2;
        this.uid = str2;
    }
}
