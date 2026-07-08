package dmt.av.video;

import X.C040H;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import dmt.av.video.SingleImageCoverBitmapData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class SingleImageCoverBitmapData implements Parcelable, Serializable {
    public static final Parcelable.Creator<SingleImageCoverBitmapData> CREATOR = new Parcelable.Creator<SingleImageCoverBitmapData>() { // from class: X.0L1A
        @Override // android.os.Parcelable.Creator
        public final SingleImageCoverBitmapData createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            int i = parcel.readInt();
            long j = parcel.readLong();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new SingleImageCoverBitmapData(string, i, j, i2, i3, i4, string2, z);
        }

        @Override // android.os.Parcelable.Creator
        public final SingleImageCoverBitmapData[] newArray(int i) {
            return new SingleImageCoverBitmapData[i];
        }
    };
    public final long date;

    @C040H
    public final boolean isReuseTexture;
    public final int itemCoverWidth;
    public final int mediaType;
    public final String previewBitmap;
    public final String sourcePath;
    public final int srcHeight;
    public final int srcWidth;

    public final SingleImageCoverBitmapData copy(String str, int i, long j, int i2, int i3, int i4, String str2, boolean z) {
        return new SingleImageCoverBitmapData(str, i, j, i2, i3, i4, str2, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleImageCoverBitmapData)) {
            return false;
        }
        SingleImageCoverBitmapData singleImageCoverBitmapData = (SingleImageCoverBitmapData) obj;
        return Intrinsics.LJFF(this.sourcePath, singleImageCoverBitmapData.sourcePath) && this.itemCoverWidth == singleImageCoverBitmapData.itemCoverWidth && this.date == singleImageCoverBitmapData.date && this.mediaType == singleImageCoverBitmapData.mediaType && this.srcWidth == singleImageCoverBitmapData.srcWidth && this.srcHeight == singleImageCoverBitmapData.srcHeight && Intrinsics.LJFF(this.previewBitmap, singleImageCoverBitmapData.previewBitmap) && this.isReuseTexture == singleImageCoverBitmapData.isReuseTexture;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.sourcePath.hashCode() * 31) + this.itemCoverWidth) * 31) + C786410Ut5.Y2(this.date)) * 31) + this.mediaType) * 31) + this.srcWidth) * 31) + this.srcHeight) * 31;
        String str = this.previewBitmap;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.isReuseTexture);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SingleImageCoverBitmapData(sourcePath=");
        sbLIZ.append(this.sourcePath);
        sbLIZ.append(", itemCoverWidth=");
        sbLIZ.append(this.itemCoverWidth);
        sbLIZ.append(", date=");
        sbLIZ.append(this.date);
        sbLIZ.append(", mediaType=");
        sbLIZ.append(this.mediaType);
        sbLIZ.append(", srcWidth=");
        sbLIZ.append(this.srcWidth);
        sbLIZ.append(", srcHeight=");
        sbLIZ.append(this.srcHeight);
        sbLIZ.append(", previewBitmap=");
        sbLIZ.append(this.previewBitmap);
        sbLIZ.append(", isReuseTexture=");
        sbLIZ.append(this.isReuseTexture);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sourcePath);
        parcel.writeInt(this.itemCoverWidth);
        parcel.writeLong(this.date);
        parcel.writeInt(this.mediaType);
        parcel.writeInt(this.srcWidth);
        parcel.writeInt(this.srcHeight);
        parcel.writeString(this.previewBitmap);
        parcel.writeInt(this.isReuseTexture ? 1 : 0);
    }

    public final long getDate() {
        return this.date;
    }

    public final int getItemCoverWidth() {
        return this.itemCoverWidth;
    }

    public final int getMediaType() {
        return this.mediaType;
    }

    public final String getPreviewBitmap() {
        return this.previewBitmap;
    }

    public final String getSourcePath() {
        return this.sourcePath;
    }

    public final int getSrcHeight() {
        return this.srcHeight;
    }

    public final int getSrcWidth() {
        return this.srcWidth;
    }

    public final boolean isReuseTexture() {
        return this.isReuseTexture;
    }

    public SingleImageCoverBitmapData(String str, int i, long j, int i2, int i3, int i4, String str2, boolean z) {
        this.sourcePath = str;
        this.itemCoverWidth = i;
        this.date = j;
        this.mediaType = i2;
        this.srcWidth = i3;
        this.srcHeight = i4;
        this.previewBitmap = str2;
        this.isReuseTexture = z;
    }
}
