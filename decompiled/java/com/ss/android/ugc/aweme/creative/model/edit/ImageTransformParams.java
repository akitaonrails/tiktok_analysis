package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.ImageTransformParams;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class ImageTransformParams implements Serializable, Parcelable {
    public static final Parcelable.Creator<ImageTransformParams> CREATOR = new Parcelable.Creator<ImageTransformParams>() { // from class: X.0niJ
        @Override // android.os.Parcelable.Creator
        public final ImageTransformParams createFromParcel(Parcel parcel) {
            boolean z;
            float f = parcel.readFloat();
            float f2 = parcel.readFloat();
            float f3 = parcel.readFloat();
            float f4 = parcel.readFloat();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            return new ImageTransformParams(f, f2, f3, f4, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageTransformParams[] newArray(int i) {
            return new ImageTransformParams[i];
        }
    };

    @C09CT("mirror_x")
    public boolean mirrorX;

    @C09CT("mirror_y")
    public boolean mirrorY;

    @C09CT("rotation")
    public float rotation;

    @C09CT("scale")
    public float scale;

    @C09CT("transform_x")
    public float transformX;

    @C09CT("transform_y")
    public float transformY;

    public static /* synthetic */ ImageTransformParams copy$default(ImageTransformParams imageTransformParams, float f, float f2, float f3, float f4, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = imageTransformParams.scale;
        }
        if ((i & 2) != 0) {
            f2 = imageTransformParams.transformX;
        }
        if ((i & 4) != 0) {
            f3 = imageTransformParams.transformY;
        }
        if ((i & 8) != 0) {
            f4 = imageTransformParams.rotation;
        }
        if ((i & 16) != 0) {
            z = imageTransformParams.mirrorX;
        }
        if ((i & 32) != 0) {
            z2 = imageTransformParams.mirrorY;
        }
        return imageTransformParams.copy(f, f2, f3, f4, z, z2);
    }

    public final ImageTransformParams copy(float f, float f2, float f3, float f4, boolean z, boolean z2) {
        return new ImageTransformParams(f, f2, f3, f4, z, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageTransformParams)) {
            return false;
        }
        ImageTransformParams imageTransformParams = (ImageTransformParams) obj;
        return Float.compare(this.scale, imageTransformParams.scale) == 0 && Float.compare(this.transformX, imageTransformParams.transformX) == 0 && Float.compare(this.transformY, imageTransformParams.transformY) == 0 && Float.compare(this.rotation, imageTransformParams.rotation) == 0 && this.mirrorX == imageTransformParams.mirrorX && this.mirrorY == imageTransformParams.mirrorY;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageTransformParams(scale=");
        sbLIZ.append(this.scale);
        sbLIZ.append(", transformX=");
        sbLIZ.append(this.transformX);
        sbLIZ.append(", transformY=");
        sbLIZ.append(this.transformY);
        sbLIZ.append(", rotation=");
        sbLIZ.append(this.rotation);
        sbLIZ.append(", mirrorX=");
        sbLIZ.append(this.mirrorX);
        sbLIZ.append(", mirrorY=");
        sbLIZ.append(this.mirrorY);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.scale);
        parcel.writeFloat(this.transformX);
        parcel.writeFloat(this.transformY);
        parcel.writeFloat(this.rotation);
        parcel.writeInt(this.mirrorX ? 1 : 0);
        parcel.writeInt(this.mirrorY ? 1 : 0);
    }

    public ImageTransformParams() {
        this(1.0f, 0.0f, 0.0f, 0.0f, false, false);
    }

    public int hashCode() {
        return (((((((((Float.floatToIntBits(this.scale) * 31) + Float.floatToIntBits(this.transformX)) * 31) + Float.floatToIntBits(this.transformY)) * 31) + Float.floatToIntBits(this.rotation)) * 31) + C786410Ut5.Z2(this.mirrorX)) * 31) + C786410Ut5.Z2(this.mirrorY);
    }

    public final boolean getMirrorX() {
        return this.mirrorX;
    }

    public final boolean getMirrorY() {
        return this.mirrorY;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScale() {
        return this.scale;
    }

    public final float getTransformX() {
        return this.transformX;
    }

    public final float getTransformY() {
        return this.transformY;
    }

    public final void setMirrorX(boolean z) {
        this.mirrorX = z;
    }

    public final void setMirrorY(boolean z) {
        this.mirrorY = z;
    }

    public final void setRotation(float f) {
        this.rotation = f;
    }

    public final void setScale(float f) {
        this.scale = f;
    }

    public final void setTransformX(float f) {
        this.transformX = f;
    }

    public final void setTransformY(float f) {
        this.transformY = f;
    }

    public ImageTransformParams(float f, float f2, float f3, float f4, boolean z, boolean z2) {
        this.scale = f;
        this.transformX = f2;
        this.transformY = f3;
        this.rotation = f4;
        this.mirrorX = z;
        this.mirrorY = z2;
    }
}
