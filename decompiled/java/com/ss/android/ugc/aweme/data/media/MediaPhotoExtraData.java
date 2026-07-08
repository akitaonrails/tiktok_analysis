package com.ss.android.ugc.aweme.data.media;

import X.C2188811AlT;
import X.EnumC12951054z;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.data.media.MediaPhotoExtraData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class MediaPhotoExtraData implements Parcelable {
    public static final Parcelable.Creator<MediaPhotoExtraData> CREATOR = new Parcelable.Creator<MediaPhotoExtraData>() { // from class: X.0vIs
        @Override // android.os.Parcelable.Creator
        public final MediaPhotoExtraData createFromParcel(Parcel parcel) {
            return new MediaPhotoExtraData(parcel.readString(), EnumC12951054z.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final MediaPhotoExtraData[] newArray(int i) {
            return new MediaPhotoExtraData[i];
        }
    };
    public final String originalFile;
    public final EnumC12951054z type;

    public MediaPhotoExtraData() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaPhotoExtraData)) {
            return false;
        }
        MediaPhotoExtraData mediaPhotoExtraData = (MediaPhotoExtraData) obj;
        return Intrinsics.LJFF(this.originalFile, mediaPhotoExtraData.originalFile) && this.type == mediaPhotoExtraData.type;
    }

    public final int hashCode() {
        return (this.originalFile.hashCode() * 31) + this.type.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaPhotoExtraData(originalFile=");
        sbLIZ.append(this.originalFile);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.originalFile);
        parcel.writeString(this.type.name());
    }

    public /* synthetic */ MediaPhotoExtraData(int i) {
        this("", EnumC12951054z.NOT_SET);
    }

    public MediaPhotoExtraData(String str, EnumC12951054z enumC12951054z) {
        this.originalFile = str;
        this.type = enumC12951054z;
    }
}
