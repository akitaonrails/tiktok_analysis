package com.ss.android.ugc.tools.utils;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.tools.utils.FileIdentifierModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class FileIdentifierModel implements Parcelable {
    public static final Parcelable.Creator<FileIdentifierModel> CREATOR = new Parcelable.Creator<FileIdentifierModel>() { // from class: X.0EMl
        @Override // android.os.Parcelable.Creator
        public final FileIdentifierModel createFromParcel(Parcel parcel) {
            return new FileIdentifierModel(parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final FileIdentifierModel[] newArray(int i) {
            return new FileIdentifierModel[i];
        }
    };

    @C09CT("file_header")
    public final String fileHeader;

    @C09CT("file_size")
    public final long fileSize;

    public final FileIdentifierModel copy(String str, long j) {
        return new FileIdentifierModel(str, j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileIdentifierModel)) {
            return false;
        }
        FileIdentifierModel fileIdentifierModel = (FileIdentifierModel) obj;
        return Intrinsics.LJFF(this.fileHeader, fileIdentifierModel.fileHeader) && this.fileSize == fileIdentifierModel.fileSize;
    }

    public int hashCode() {
        return (this.fileHeader.hashCode() * 31) + C786410Ut5.Y2(this.fileSize);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FileIdentifierModel(fileHeader=");
        sbLIZ.append(this.fileHeader);
        sbLIZ.append(", fileSize=");
        sbLIZ.append(this.fileSize);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.fileHeader);
        parcel.writeLong(this.fileSize);
    }

    public FileIdentifierModel() {
        this("", 0L);
    }

    public final String getFileHeader() {
        return this.fileHeader;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public FileIdentifierModel(String str, long j) {
        this.fileHeader = str;
        this.fileSize = j;
    }
}
