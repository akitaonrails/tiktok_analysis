package com.ss.android.ugc.aweme.shortvideo.edit.model;

import X.C0MZH;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class VideoFileInfo implements Parcelable, Serializable {
    public final int bitrate;
    public final int codecType;
    public final long duration;
    public final int fps;
    public final float fpsFloat;
    public final int gop;
    public final int height;
    public final int keyFrameCount;
    public final int width;
    public static final C0MZH Companion = new Object() { // from class: X.0MZH
    };
    public static final Parcelable.Creator<VideoFileInfo> CREATOR = new Parcelable.Creator<VideoFileInfo>() { // from class: X.0MZC
        @Override // android.os.Parcelable.Creator
        public final VideoFileInfo createFromParcel(Parcel parcel) {
            return new VideoFileInfo(parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoFileInfo[] newArray(int i) {
            return new VideoFileInfo[i];
        }
    };

    /* JADX WARN: Illegal instructions before constructor call */
    public VideoFileInfo(int i, int i2, long j) {
        int i3 = 0;
        this(i, i2, j, i3, i3, i3, i3, i3, 0.0f, 504, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public VideoFileInfo(int i, int i2, long j, int i3) {
        int i4 = 0;
        this(i, i2, j, i3, i4, i4, i4, i4, 0.0f, 496, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public VideoFileInfo(int i, int i2, long j, int i3, int i4) {
        int i5 = 0;
        this(i, i2, j, i3, i4, i5, i5, i5, 0.0f, 480, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public VideoFileInfo(int i, int i2, long j, int i3, int i4, int i5) {
        int i6 = 0;
        this(i, i2, j, i3, i4, i5, i6, i6, 0.0f, 448, null);
    }

    public VideoFileInfo(int i, int i2, long j, int i3, int i4, int i5, int i6) {
        this(i, i2, j, i3, i4, i5, i6, 0, 0.0f, 384, null);
    }

    public VideoFileInfo(int i, int i2, long j, int i3, int i4, int i5, int i6, int i7) {
        this(i, i2, j, i3, i4, i5, i6, i7, 0.0f, 256, null);
    }

    public final VideoFileInfo copy(int i, int i2, long j, int i3, int i4, int i5, int i6, int i7, float f) {
        return new VideoFileInfo(i, i2, j, i3, i4, i5, i6, i7, f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoFileInfo)) {
            return false;
        }
        VideoFileInfo videoFileInfo = (VideoFileInfo) obj;
        return this.width == videoFileInfo.width && this.height == videoFileInfo.height && this.duration == videoFileInfo.duration && this.fps == videoFileInfo.fps && this.bitrate == videoFileInfo.bitrate && this.codecType == videoFileInfo.codecType && this.keyFrameCount == videoFileInfo.keyFrameCount && this.gop == videoFileInfo.gop && Float.compare(this.fpsFloat, videoFileInfo.fpsFloat) == 0;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoFileInfo(width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", fps=");
        sbLIZ.append(this.fps);
        sbLIZ.append(", bitrate=");
        sbLIZ.append(this.bitrate);
        sbLIZ.append(", codecType=");
        sbLIZ.append(this.codecType);
        sbLIZ.append(", keyFrameCount=");
        sbLIZ.append(this.keyFrameCount);
        sbLIZ.append(", gop=");
        sbLIZ.append(this.gop);
        sbLIZ.append(", fpsFloat=");
        sbLIZ.append(this.fpsFloat);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.duration);
        parcel.writeInt(this.fps);
        parcel.writeInt(this.bitrate);
        parcel.writeInt(this.codecType);
        parcel.writeInt(this.keyFrameCount);
        parcel.writeInt(this.gop);
        parcel.writeFloat(this.fpsFloat);
    }

    public int hashCode() {
        return (((((((((((((((this.width * 31) + this.height) * 31) + C786410Ut5.Y2(this.duration)) * 31) + this.fps) * 31) + this.bitrate) * 31) + this.codecType) * 31) + this.keyFrameCount) * 31) + this.gop) * 31) + Float.floatToIntBits(this.fpsFloat);
    }

    public final String getResolution() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.width);
        sbLIZ.append('*');
        sbLIZ.append(this.height);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final int getCodecType() {
        return this.codecType;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getFps() {
        return this.fps;
    }

    public final float getFpsFloat() {
        return this.fpsFloat;
    }

    public final int getGop() {
        return this.gop;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getKeyFrameCount() {
        return this.keyFrameCount;
    }

    public final int getWidth() {
        return this.width;
    }

    public VideoFileInfo(int i, int i2, long j, int i3, int i4, int i5, int i6, int i7, float f) {
        this.width = i;
        this.height = i2;
        this.duration = j;
        this.fps = i3;
        this.bitrate = i4;
        this.codecType = i5;
        this.keyFrameCount = i6;
        this.gop = i7;
        this.fpsFloat = f;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ VideoFileInfo(int i, int i2, long j, int i3, int i4, int i5, int i6, int i7, float f, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        i3 = (i8 & 8) != 0 ? -100 : i3;
        this(i, i2, j, i3, (i8 & 16) != 0 ? 0 : i4, (i8 & 32) != 0 ? -1 : i5, (i8 & 64) != 0 ? -1 : i6, (i8 & 128) != 0 ? -1 : i7, (i8 & 256) != 0 ? i3 : f);
    }
}
