package com.ss.android.ugc.aweme.creative.model.common;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.common.InputImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class InputImage implements Parcelable {
    public static final Parcelable.Creator<InputImage> CREATOR = new Parcelable.Creator<InputImage>() { // from class: X.0Ldv
        @Override // android.os.Parcelable.Creator
        public final InputImage createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            String string = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            long j = parcel.readLong();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new InputImage(string, i, i2, j, string2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final InputImage[] newArray(int i) {
            return new InputImage[i];
        }
    };

    @C09CT("file_size")
    public final long fileSize;

    @C09CT("has_face")
    public final Boolean hasFace;

    @C09CT("height")
    public final int height;

    @C09CT("media_source")
    public final String mediaSource;

    @C09CT("path")
    public final String path;

    @C09CT("width")
    public final int width;

    public InputImage() {
        this("", -1, -1, -1L, "", null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputImage)) {
            return false;
        }
        InputImage inputImage = (InputImage) obj;
        return Intrinsics.LJFF(this.path, inputImage.path) && this.width == inputImage.width && this.height == inputImage.height && this.fileSize == inputImage.fileSize && Intrinsics.LJFF(this.mediaSource, inputImage.mediaSource) && Intrinsics.LJFF(this.hasFace, inputImage.hasFace);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.path.hashCode() * 31) + this.width) * 31) + this.height) * 31) + C786410Ut5.Y2(this.fileSize)) * 31) + this.mediaSource.hashCode()) * 31;
        Boolean bool = this.hasFace;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InputImage(path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", fileSize=");
        sbLIZ.append(this.fileSize);
        sbLIZ.append(", mediaSource=");
        sbLIZ.append(this.mediaSource);
        sbLIZ.append(", hasFace=");
        sbLIZ.append(this.hasFace);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeString(this.path);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.fileSize);
        parcel.writeString(this.mediaSource);
        Boolean bool = this.hasFace;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public InputImage(String str, int i, int i2, long j, String str2, Boolean bool) {
        this.path = str;
        this.width = i;
        this.height = i2;
        this.fileSize = j;
        this.mediaSource = str2;
        this.hasFace = bool;
    }
}
