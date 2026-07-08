package com.ss.android.ugc.aweme.share.gif;

import X.C1402020maW;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes22.dex */
public class VideoShare2GifEditContext implements Parcelable {
    public static final Parcelable.Creator<VideoShare2GifEditContext> CREATOR = new C1402020maW(6);
    public String authorId;
    public String awemeId;
    public int duration;
    public String enterFrom;
    public String gifImageDir;
    public String gifImagePath;
    public long inPoint;
    public boolean isAddWatermark;
    public String logPb;
    public int originHeight;
    public int originWidth;
    public long outPoint;
    public int rotateAngle;
    public int targetHeight;
    public int targetWidth;
    public float topX;
    public float topY;
    public String videoPath;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public VideoShare2GifEditContext() {
    }

    public VideoShare2GifEditContext(Parcel parcel) {
        boolean z;
        this.videoPath = parcel.readString();
        this.awemeId = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isAddWatermark = z;
        this.gifImagePath = parcel.readString();
        this.originWidth = parcel.readInt();
        this.originHeight = parcel.readInt();
        this.targetWidth = parcel.readInt();
        this.targetHeight = parcel.readInt();
        this.topX = parcel.readFloat();
        this.topY = parcel.readFloat();
        this.authorId = parcel.readString();
        this.enterFrom = parcel.readString();
        this.logPb = parcel.readString();
        this.inPoint = parcel.readLong();
        this.outPoint = parcel.readLong();
        this.rotateAngle = parcel.readInt();
        this.duration = parcel.readInt();
        this.gifImageDir = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoPath);
        parcel.writeString(this.awemeId);
        parcel.writeByte(this.isAddWatermark ? (byte) 1 : (byte) 0);
        parcel.writeString(this.gifImagePath);
        parcel.writeInt(this.originWidth);
        parcel.writeInt(this.originHeight);
        parcel.writeInt(this.targetWidth);
        parcel.writeInt(this.targetHeight);
        parcel.writeFloat(this.topX);
        parcel.writeFloat(this.topY);
        parcel.writeString(this.authorId);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.logPb);
        parcel.writeLong(this.inPoint);
        parcel.writeLong(this.outPoint);
        parcel.writeInt(this.rotateAngle);
        parcel.writeInt(this.duration);
        parcel.writeString(this.gifImageDir);
    }
}
