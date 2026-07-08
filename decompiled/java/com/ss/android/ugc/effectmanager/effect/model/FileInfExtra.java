package com.ss.android.ugc.effectmanager.effect.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class FileInfExtra implements Serializable, Parcelable {
    public static final Parcelable.Creator<FileInfExtra> CREATOR = new Creator();

    @C09CT("file_ext")
    public final String file_ext;

    @C09CT("skip_verify_md5")
    public final Boolean skip_verify_md5;

    public static final class Creator implements Parcelable.Creator<FileInfExtra> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FileInfExtra createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FileInfExtra(string, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FileInfExtra[] newArray(int i) {
            return new FileInfExtra[i];
        }
    }

    public FileInfExtra() {
        this(null, null);
    }

    public final FileInfExtra copy(String str, Boolean bool) {
        return new FileInfExtra(str, bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileInfExtra)) {
            return false;
        }
        FileInfExtra fileInfExtra = (FileInfExtra) obj;
        return Intrinsics.LJFF(this.file_ext, fileInfExtra.file_ext) && Intrinsics.LJFF(this.skip_verify_md5, fileInfExtra.skip_verify_md5);
    }

    public int hashCode() {
        String str = this.file_ext;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.skip_verify_md5;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FileInfExtra(file_ext=");
        sbLIZ.append(this.file_ext);
        sbLIZ.append(", skip_verify_md5=");
        sbLIZ.append(this.skip_verify_md5);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeString(this.file_ext);
        Boolean bool = this.skip_verify_md5;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public final String getFile_ext() {
        return this.file_ext;
    }

    public final Boolean getSkip_verify_md5() {
        return this.skip_verify_md5;
    }

    public FileInfExtra(String str, Boolean bool) {
        this.file_ext = str;
        this.skip_verify_md5 = bool;
    }
}
