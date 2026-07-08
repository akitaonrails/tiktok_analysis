package com.bytedance.effectcreatormobile.ckeapi.api.album;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.effectcreatormobile.ckeapi.api.album.EditMedia;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class EditMedia implements Parcelable, Serializable {
    public static final Parcelable.Creator<EditMedia> CREATOR = new Parcelable.Creator<EditMedia>() { // from class: X.0LvU
        @Override // android.os.Parcelable.Creator
        public final EditMedia createFromParcel(Parcel parcel) {
            boolean z;
            Integer numValueOf;
            boolean z2;
            boolean z3;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            String string2 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new EditMedia(string, z, numValueOf, numValueOf2, string2, i, i2, z2, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final EditMedia[] newArray(int i) {
            return new EditMedia[i];
        }
    };
    public final boolean isCutout;
    public final boolean isRemoveBackground;
    public final boolean isVideo;
    public final String path;
    public final Integer videoEndTime;
    public final int videoHeight;
    public final String videoOriginPath;
    public final Integer videoStartTime;
    public final int videoWidth;

    public final EditMedia copy(String str, boolean z, Integer num, Integer num2, String str2, int i, int i2, boolean z2, boolean z3) {
        return new EditMedia(str, z, num, num2, str2, i, i2, z2, z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditMedia)) {
            return false;
        }
        EditMedia editMedia = (EditMedia) obj;
        return Intrinsics.LJFF(this.path, editMedia.path) && this.isVideo == editMedia.isVideo && Intrinsics.LJFF(this.videoStartTime, editMedia.videoStartTime) && Intrinsics.LJFF(this.videoEndTime, editMedia.videoEndTime) && Intrinsics.LJFF(this.videoOriginPath, editMedia.videoOriginPath) && this.videoWidth == editMedia.videoWidth && this.videoHeight == editMedia.videoHeight && this.isRemoveBackground == editMedia.isRemoveBackground && this.isCutout == editMedia.isCutout;
    }

    public int hashCode() {
        int iHashCode = ((this.path.hashCode() * 31) + C786410Ut5.Z2(this.isVideo)) * 31;
        Integer num = this.videoStartTime;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.videoEndTime;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.videoOriginPath;
        return ((((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.videoWidth) * 31) + this.videoHeight) * 31) + C786410Ut5.Z2(this.isRemoveBackground)) * 31) + C786410Ut5.Z2(this.isCutout);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditMedia(path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", isVideo=");
        sbLIZ.append(this.isVideo);
        sbLIZ.append(", videoStartTime=");
        sbLIZ.append(this.videoStartTime);
        sbLIZ.append(", videoEndTime=");
        sbLIZ.append(this.videoEndTime);
        sbLIZ.append(", videoOriginPath=");
        sbLIZ.append(this.videoOriginPath);
        sbLIZ.append(", videoWidth=");
        sbLIZ.append(this.videoWidth);
        sbLIZ.append(", videoHeight=");
        sbLIZ.append(this.videoHeight);
        sbLIZ.append(", isRemoveBackground=");
        sbLIZ.append(this.isRemoveBackground);
        sbLIZ.append(", isCutout=");
        sbLIZ.append(this.isCutout);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.path);
        parcel.writeInt(this.isVideo ? 1 : 0);
        Integer num = this.videoStartTime;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.videoEndTime;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.videoOriginPath);
        parcel.writeInt(this.videoWidth);
        parcel.writeInt(this.videoHeight);
        parcel.writeInt(this.isRemoveBackground ? 1 : 0);
        parcel.writeInt(this.isCutout ? 1 : 0);
    }

    public final String getPath() {
        return this.path;
    }

    public final Integer getVideoEndTime() {
        return this.videoEndTime;
    }

    public final int getVideoHeight() {
        return this.videoHeight;
    }

    public final String getVideoOriginPath() {
        return this.videoOriginPath;
    }

    public final Integer getVideoStartTime() {
        return this.videoStartTime;
    }

    public final int getVideoWidth() {
        return this.videoWidth;
    }

    public final boolean isCutout() {
        return this.isCutout;
    }

    public final boolean isRemoveBackground() {
        return this.isRemoveBackground;
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    public EditMedia(String str, boolean z, Integer num, Integer num2, String str2, int i, int i2, boolean z2, boolean z3) {
        this.path = str;
        this.isVideo = z;
        this.videoStartTime = num;
        this.videoEndTime = num2;
        this.videoOriginPath = str2;
        this.videoWidth = i;
        this.videoHeight = i2;
        this.isRemoveBackground = z2;
        this.isCutout = z3;
    }
}
