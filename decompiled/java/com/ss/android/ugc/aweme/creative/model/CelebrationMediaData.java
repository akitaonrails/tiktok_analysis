package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C0MY0;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CelebrationMediaData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class CelebrationMediaData implements Parcelable, Serializable {
    public static final Parcelable.Creator<CelebrationMediaData> CREATOR = new Parcelable.Creator<CelebrationMediaData>() { // from class: X.0MLG
        @Override // android.os.Parcelable.Creator
        public final CelebrationMediaData createFromParcel(Parcel parcel) {
            return new CelebrationMediaData(parcel.readString(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final CelebrationMediaData[] newArray(int i) {
            return new CelebrationMediaData[i];
        }
    };

    @C09CT("create_time")
    public long createTime;

    @C09CT("material_type")
    public int mediaType;

    @C09CT("material_path")
    @C0MY0
    public String videoPath;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoPath);
        parcel.writeInt(this.mediaType);
        parcel.writeLong(this.createTime);
    }

    public CelebrationMediaData() {
        this("", 0, 0L);
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getMediaType() {
        return this.mediaType;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setMediaType(int i) {
        this.mediaType = i;
    }

    public final void setVideoPath(String str) {
        this.videoPath = str;
    }

    public CelebrationMediaData(String str, int i, long j) {
        this.videoPath = str;
        this.mediaType = i;
        this.createTime = j;
    }
}
