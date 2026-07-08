package com.ss.android.ugc.aweme.shortvideo.edit.model;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class VideoCutInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<VideoCutInfo> CREATOR = new Parcelable.Creator<VideoCutInfo>() { // from class: X.0MYx
        @Override // android.os.Parcelable.Creator
        public final VideoCutInfo createFromParcel(Parcel parcel) {
            return new VideoCutInfo(parcel.readLong(), parcel.readLong(), parcel.readFloat(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoCutInfo[] newArray(int i) {
            return new VideoCutInfo[i];
        }
    };
    public long end;
    public int rotate;
    public float speed;
    public long start;

    public final VideoCutInfo copy(long j, long j2, float f, int i) {
        return new VideoCutInfo(j, j2, f, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoCutInfo)) {
            return false;
        }
        VideoCutInfo videoCutInfo = (VideoCutInfo) obj;
        return this.start == videoCutInfo.start && this.end == videoCutInfo.end && Float.compare(this.speed, videoCutInfo.speed) == 0 && this.rotate == videoCutInfo.rotate;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoCutInfo(start=");
        sbLIZ.append(this.start);
        sbLIZ.append(", end=");
        sbLIZ.append(this.end);
        sbLIZ.append(", speed=");
        sbLIZ.append(this.speed);
        sbLIZ.append(", rotate=");
        sbLIZ.append(this.rotate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.start);
        parcel.writeLong(this.end);
        parcel.writeFloat(this.speed);
        parcel.writeInt(this.rotate);
    }

    public int hashCode() {
        return (((((C786410Ut5.Y2(this.start) * 31) + C786410Ut5.Y2(this.end)) * 31) + Float.floatToIntBits(this.speed)) * 31) + this.rotate;
    }

    public final long getEnd() {
        return this.end;
    }

    public final int getRotate() {
        return this.rotate;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final long getStart() {
        return this.start;
    }

    public final void setEnd(long j) {
        this.end = j;
    }

    public final void setRotate(int i) {
        this.rotate = i;
    }

    public final void setSpeed(float f) {
        this.speed = f;
    }

    public final void setStart(long j) {
        this.start = j;
    }

    public VideoCutInfo(long j, long j2, float f, int i) {
        this.start = j;
        this.end = j2;
        this.speed = f;
        this.rotate = i;
    }
}
