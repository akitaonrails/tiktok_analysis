package com.ss.android.ugc.aweme.shortvideo.model;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class ReturnEcommerceCommentModel implements Parcelable {
    public static final Parcelable.Creator<ReturnEcommerceCommentModel> CREATOR = new Creator();
    public final String compressFilePath;
    public final long fileSize;
    public final String forBase64FilePath;
    public final int index;
    public final String mediaType;
    public final String mimeType;
    public final String originFilePath;
    public final Long originFileSize;

    public static final class Creator implements Parcelable.Creator<ReturnEcommerceCommentModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReturnEcommerceCommentModel createFromParcel(Parcel parcel) {
            return new ReturnEcommerceCommentModel(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReturnEcommerceCommentModel[] newArray(int i) {
            return new ReturnEcommerceCommentModel[i];
        }
    }

    public final ReturnEcommerceCommentModel copy(int i, String str, String str2, Long l, long j, String str3, String str4, String str5) {
        return new ReturnEcommerceCommentModel(i, str, str2, l, j, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReturnEcommerceCommentModel)) {
            return false;
        }
        ReturnEcommerceCommentModel returnEcommerceCommentModel = (ReturnEcommerceCommentModel) obj;
        return this.index == returnEcommerceCommentModel.index && Intrinsics.LJFF(this.originFilePath, returnEcommerceCommentModel.originFilePath) && Intrinsics.LJFF(this.compressFilePath, returnEcommerceCommentModel.compressFilePath) && Intrinsics.LJFF(this.originFileSize, returnEcommerceCommentModel.originFileSize) && this.fileSize == returnEcommerceCommentModel.fileSize && Intrinsics.LJFF(this.mediaType, returnEcommerceCommentModel.mediaType) && Intrinsics.LJFF(this.forBase64FilePath, returnEcommerceCommentModel.forBase64FilePath) && Intrinsics.LJFF(this.mimeType, returnEcommerceCommentModel.mimeType);
    }

    public int hashCode() {
        int iHashCode = ((((this.index * 31) + this.originFilePath.hashCode()) * 31) + this.compressFilePath.hashCode()) * 31;
        Long l = this.originFileSize;
        return ((((((((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + C786410Ut5.Y2(this.fileSize)) * 31) + this.mediaType.hashCode()) * 31) + this.forBase64FilePath.hashCode()) * 31) + this.mimeType.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReturnEcommerceCommentModel(index=");
        sbLIZ.append(this.index);
        sbLIZ.append(", originFilePath=");
        sbLIZ.append(this.originFilePath);
        sbLIZ.append(", compressFilePath=");
        sbLIZ.append(this.compressFilePath);
        sbLIZ.append(", originFileSize=");
        sbLIZ.append(this.originFileSize);
        sbLIZ.append(", fileSize=");
        sbLIZ.append(this.fileSize);
        sbLIZ.append(", mediaType=");
        sbLIZ.append(this.mediaType);
        sbLIZ.append(", forBase64FilePath=");
        sbLIZ.append(this.forBase64FilePath);
        sbLIZ.append(", mimeType=");
        sbLIZ.append(this.mimeType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
        parcel.writeString(this.originFilePath);
        parcel.writeString(this.compressFilePath);
        Long l = this.originFileSize;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeLong(this.fileSize);
        parcel.writeString(this.mediaType);
        parcel.writeString(this.forBase64FilePath);
        parcel.writeString(this.mimeType);
    }

    public final String getCompressFilePath() {
        return this.compressFilePath;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final String getForBase64FilePath() {
        return this.forBase64FilePath;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getMediaType() {
        return this.mediaType;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getOriginFilePath() {
        return this.originFilePath;
    }

    public final Long getOriginFileSize() {
        return this.originFileSize;
    }

    public ReturnEcommerceCommentModel(int i, String str, String str2, Long l, long j, String str3, String str4, String str5) {
        this.index = i;
        this.originFilePath = str;
        this.compressFilePath = str2;
        this.originFileSize = l;
        this.fileSize = j;
        this.mediaType = str3;
        this.forBase64FilePath = str4;
        this.mimeType = str5;
    }
}
