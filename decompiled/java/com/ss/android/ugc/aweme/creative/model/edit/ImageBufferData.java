package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import X.C0MY0;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.ImageBufferData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ImageBufferData implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImageBufferData> CREATOR = new Parcelable.Creator<ImageBufferData>() { // from class: X.0nMw
        @Override // android.os.Parcelable.Creator
        public final ImageBufferData createFromParcel(Parcel parcel) {
            return new ImageBufferData(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ImageBufferData[] newArray(int i) {
            return new ImageBufferData[i];
        }
    };

    @C09CT("height")
    public final int height;

    @C09CT("path")
    @C0MY0
    public final String path;

    @C09CT("width")
    public final int width;

    public final ImageBufferData copy(String str, int i, int i2) {
        return new ImageBufferData(str, i, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageBufferData)) {
            return false;
        }
        ImageBufferData imageBufferData = (ImageBufferData) obj;
        return Intrinsics.LJFF(this.path, imageBufferData.path) && this.width == imageBufferData.width && this.height == imageBufferData.height;
    }

    public int hashCode() {
        return (((this.path.hashCode() * 31) + this.width) * 31) + this.height;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageBufferData(path=");
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

    public ImageBufferData(String str, int i, int i2) {
        this.path = str;
        this.width = i;
        this.height = i2;
    }
}
