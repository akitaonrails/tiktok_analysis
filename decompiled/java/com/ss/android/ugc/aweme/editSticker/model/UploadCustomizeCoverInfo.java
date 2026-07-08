package com.ss.android.ugc.aweme.editSticker.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.model.UploadCustomizeCoverInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class UploadCustomizeCoverInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<UploadCustomizeCoverInfo> CREATOR = new Parcelable.Creator<UploadCustomizeCoverInfo>() { // from class: X.0nK1
        @Override // android.os.Parcelable.Creator
        public final UploadCustomizeCoverInfo createFromParcel(Parcel parcel) {
            return new UploadCustomizeCoverInfo(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readDouble(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final UploadCustomizeCoverInfo[] newArray(int i) {
            return new UploadCustomizeCoverInfo[i];
        }
    };

    @C09CT("cover_height")
    public int coverHeight;

    @C09CT("cover_tsp")
    public double coverTsp;

    @C09CT("cover_type")
    public int coverType;

    @C09CT("cover_uri")
    public String coverUri;

    @C09CT("cover_width")
    public int coverWidth;

    @C09CT("crop_type")
    public int cropType;

    public final UploadCustomizeCoverInfo copy(int i, String str, int i2, int i3, double d, int i4) {
        return new UploadCustomizeCoverInfo(i, str, i2, i3, d, i4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadCustomizeCoverInfo)) {
            return false;
        }
        UploadCustomizeCoverInfo uploadCustomizeCoverInfo = (UploadCustomizeCoverInfo) obj;
        return this.coverType == uploadCustomizeCoverInfo.coverType && Intrinsics.LJFF(this.coverUri, uploadCustomizeCoverInfo.coverUri) && this.coverHeight == uploadCustomizeCoverInfo.coverHeight && this.coverWidth == uploadCustomizeCoverInfo.coverWidth && Double.compare(this.coverTsp, uploadCustomizeCoverInfo.coverTsp) == 0 && this.cropType == uploadCustomizeCoverInfo.cropType;
    }

    public int hashCode() {
        return (((((((((this.coverType * 31) + this.coverUri.hashCode()) * 31) + this.coverHeight) * 31) + this.coverWidth) * 31) + C786410Ut5.X2(this.coverTsp)) * 31) + this.cropType;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadCustomizeCoverInfo(coverType=");
        sbLIZ.append(this.coverType);
        sbLIZ.append(", coverUri=");
        sbLIZ.append(this.coverUri);
        sbLIZ.append(", coverHeight=");
        sbLIZ.append(this.coverHeight);
        sbLIZ.append(", coverWidth=");
        sbLIZ.append(this.coverWidth);
        sbLIZ.append(", coverTsp=");
        sbLIZ.append(this.coverTsp);
        sbLIZ.append(", cropType=");
        sbLIZ.append(this.cropType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.coverType);
        parcel.writeString(this.coverUri);
        parcel.writeInt(this.coverHeight);
        parcel.writeInt(this.coverWidth);
        parcel.writeDouble(this.coverTsp);
        parcel.writeInt(this.cropType);
    }

    public UploadCustomizeCoverInfo() {
        this(0, "", 0, 0, 0.0d, 0);
    }

    public final int getCoverHeight() {
        return this.coverHeight;
    }

    public final double getCoverTsp() {
        return this.coverTsp;
    }

    public final int getCoverType() {
        return this.coverType;
    }

    public final String getCoverUri() {
        return this.coverUri;
    }

    public final int getCoverWidth() {
        return this.coverWidth;
    }

    public final int getCropType() {
        return this.cropType;
    }

    public final void setCoverHeight(int i) {
        this.coverHeight = i;
    }

    public final void setCoverTsp(double d) {
        this.coverTsp = d;
    }

    public final void setCoverType(int i) {
        this.coverType = i;
    }

    public final void setCoverUri(String str) {
        this.coverUri = str;
    }

    public final void setCoverWidth(int i) {
        this.coverWidth = i;
    }

    public final void setCropType(int i) {
        this.cropType = i;
    }

    public UploadCustomizeCoverInfo(int i, String str, int i2, int i3, double d, int i4) {
        this.coverType = i;
        this.coverUri = str;
        this.coverHeight = i2;
        this.coverWidth = i3;
        this.coverTsp = d;
        this.cropType = i4;
    }
}
