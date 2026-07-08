package com.ss.android.ugc.aweme.aime.model;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.aime.model.PictureUploadedExtra;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class PictureUploadedExtra implements Parcelable {
    public final String imagePath;
    public final Integer imageType;
    public static final Parcelable.Creator<PictureUploadedExtra> CREATOR = new Parcelable.Creator<PictureUploadedExtra>() { // from class: X.0MIJ
        @Override // android.os.Parcelable.Creator
        public final PictureUploadedExtra createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new PictureUploadedExtra(string, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final PictureUploadedExtra[] newArray(int i) {
            return new PictureUploadedExtra[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PictureUploadedExtra)) {
            return false;
        }
        PictureUploadedExtra pictureUploadedExtra = (PictureUploadedExtra) obj;
        return Intrinsics.LJFF(this.imagePath, pictureUploadedExtra.imagePath) && Intrinsics.LJFF(this.imageType, pictureUploadedExtra.imageType);
    }

    public final int hashCode() {
        int iHashCode = this.imagePath.hashCode() * 31;
        Integer num = this.imageType;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PictureUploadedExtra(imagePath=");
        sbLIZ.append(this.imagePath);
        sbLIZ.append(", imageType=");
        sbLIZ.append(this.imageType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.imagePath);
        Integer num = this.imageType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public PictureUploadedExtra(String str, Integer num) {
        this.imagePath = str;
        this.imageType = num;
    }
}
