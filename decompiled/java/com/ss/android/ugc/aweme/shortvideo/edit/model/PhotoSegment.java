package com.ss.android.ugc.aweme.shortvideo.edit.model;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.model.PhotoSegment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PhotoSegment implements Parcelable {
    public static final Parcelable.Creator<PhotoSegment> CREATOR = new Parcelable.Creator<PhotoSegment>() { // from class: X.02wt
        @Override // android.os.Parcelable.Creator
        public final PhotoSegment createFromParcel(Parcel parcel) {
            return new PhotoSegment(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoSegment[] newArray(int i) {
            return new PhotoSegment[i];
        }
    };
    public final int height;
    public final String path;
    public final int width;

    public final PhotoSegment copy(String str, int i, int i2) {
        return new PhotoSegment(str, i, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoSegment)) {
            return false;
        }
        PhotoSegment photoSegment = (PhotoSegment) obj;
        return Intrinsics.LJFF(this.path, photoSegment.path) && this.width == photoSegment.width && this.height == photoSegment.height;
    }

    public int hashCode() {
        return (((this.path.hashCode() * 31) + this.width) * 31) + this.height;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoSegment(path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.path);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getPath() {
        return this.path;
    }

    public final int getWidth() {
        return this.width;
    }

    public PhotoSegment(String str, int i, int i2) {
        this.path = str;
        this.width = i;
        this.height = i2;
    }
}
