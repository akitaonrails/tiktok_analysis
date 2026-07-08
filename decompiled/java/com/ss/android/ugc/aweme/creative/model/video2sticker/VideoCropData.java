package com.ss.android.ugc.aweme.creative.model.video2sticker;

import X.C09CT;
import X.C1438760nXm;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.video2sticker.VideoCropData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class VideoCropData implements Parcelable {

    @C09CT("clip_ratio")
    public int cropRatioMode;

    @C09CT("scale")
    public Float scaleAfterCrop;

    @C09CT("transform_x")
    public float transformX;

    @C09CT("transform_y")
    public float transformY;
    public static final C1438760nXm Companion = new Object() { // from class: X.0nXm
    };
    public static final Parcelable.Creator<VideoCropData> CREATOR = new Parcelable.Creator<VideoCropData>() { // from class: X.0nXY
        @Override // android.os.Parcelable.Creator
        public final VideoCropData createFromParcel(Parcel parcel) {
            Float fValueOf;
            if (parcel.readInt() == 0) {
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            return new VideoCropData(fValueOf, parcel.readFloat(), parcel.readFloat(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoCropData[] newArray(int i) {
            return new VideoCropData[i];
        }
    };

    public VideoCropData() {
        this(null, 0.0f, 0.0f, 1);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoCropData)) {
            return false;
        }
        VideoCropData videoCropData = (VideoCropData) obj;
        return Intrinsics.LJFF(this.scaleAfterCrop, videoCropData.scaleAfterCrop) && Float.compare(this.transformX, videoCropData.transformX) == 0 && Float.compare(this.transformY, videoCropData.transformY) == 0 && this.cropRatioMode == videoCropData.cropRatioMode;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoCropData(scaleAfterCrop=");
        sbLIZ.append(this.scaleAfterCrop);
        sbLIZ.append(", transformX=");
        sbLIZ.append(this.transformX);
        sbLIZ.append(", transformY=");
        sbLIZ.append(this.transformY);
        sbLIZ.append(", cropRatioMode=");
        sbLIZ.append(this.cropRatioMode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Float f = this.scaleAfterCrop;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeFloat(this.transformX);
        parcel.writeFloat(this.transformY);
        parcel.writeInt(this.cropRatioMode);
    }

    public final int hashCode() {
        Float f = this.scaleAfterCrop;
        return ((((((f == null ? 0 : f.hashCode()) * 31) + Float.floatToIntBits(this.transformX)) * 31) + Float.floatToIntBits(this.transformY)) * 31) + this.cropRatioMode;
    }

    public VideoCropData(Float f, float f2, float f3, int i) {
        this.scaleAfterCrop = f;
        this.transformX = f2;
        this.transformY = f3;
        this.cropRatioMode = i;
    }
}
