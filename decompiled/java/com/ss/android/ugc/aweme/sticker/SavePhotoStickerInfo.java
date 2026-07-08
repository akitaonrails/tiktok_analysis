package com.ss.android.ugc.aweme.sticker;

import X.C09CT;
import X.C0MY0;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class SavePhotoStickerInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<SavePhotoStickerInfo> CREATOR = new Parcelable.Creator<SavePhotoStickerInfo>() { // from class: X.0MZU
        @Override // android.os.Parcelable.Creator
        public final SavePhotoStickerInfo createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string = parcel.readString();
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
            return new SavePhotoStickerInfo(arrayListCreateStringArrayList, string, string2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final SavePhotoStickerInfo[] newArray(int i) {
            return new SavePhotoStickerInfo[i];
        }
    };

    @C09CT(alternate = {"c"}, value = "capturedPhotoDir")
    public String capturedPhotoDir;

    @C09CT(alternate = {"a"}, value = "capturedPhotoPaths")
    @C0MY0
    public List<String> capturedPhotoPaths;

    @C09CT(alternate = {"d"}, value = "shouldRemoveLabel")
    public Boolean shouldRemoveLabel;

    @C09CT(alternate = {"b"}, value = "stickerToast")
    public final String stickerToast;

    public final SavePhotoStickerInfo copy(List<String> list, String str, String str2, Boolean bool) {
        return new SavePhotoStickerInfo(list, str, str2, bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavePhotoStickerInfo)) {
            return false;
        }
        SavePhotoStickerInfo savePhotoStickerInfo = (SavePhotoStickerInfo) obj;
        return Intrinsics.LJFF(this.capturedPhotoPaths, savePhotoStickerInfo.capturedPhotoPaths) && Intrinsics.LJFF(this.stickerToast, savePhotoStickerInfo.stickerToast) && Intrinsics.LJFF(this.capturedPhotoDir, savePhotoStickerInfo.capturedPhotoDir) && Intrinsics.LJFF(this.shouldRemoveLabel, savePhotoStickerInfo.shouldRemoveLabel);
    }

    public int hashCode() {
        List<String> list = this.capturedPhotoPaths;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.stickerToast;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.capturedPhotoDir;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.shouldRemoveLabel;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SavePhotoStickerInfo(capturedPhotoPaths=");
        sbLIZ.append(this.capturedPhotoPaths);
        sbLIZ.append(", stickerToast=");
        sbLIZ.append(this.stickerToast);
        sbLIZ.append(", capturedPhotoDir=");
        sbLIZ.append(this.capturedPhotoDir);
        sbLIZ.append(", shouldRemoveLabel=");
        sbLIZ.append(this.shouldRemoveLabel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeStringList(this.capturedPhotoPaths);
        parcel.writeString(this.stickerToast);
        parcel.writeString(this.capturedPhotoDir);
        Boolean bool = this.shouldRemoveLabel;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public final String getCapturedPhotoDir() {
        return this.capturedPhotoDir;
    }

    public final List<String> getCapturedPhotoPaths() {
        return this.capturedPhotoPaths;
    }

    public final Boolean getShouldRemoveLabel() {
        return this.shouldRemoveLabel;
    }

    public final String getStickerToast() {
        return this.stickerToast;
    }

    public final void setCapturedPhotoDir(String str) {
        this.capturedPhotoDir = str;
    }

    public final void setCapturedPhotoPaths(List<String> list) {
        this.capturedPhotoPaths = list;
    }

    public final void setShouldRemoveLabel(Boolean bool) {
        this.shouldRemoveLabel = bool;
    }

    public SavePhotoStickerInfo(List<String> list, String str, String str2, Boolean bool) {
        this.capturedPhotoPaths = list;
        this.stickerToast = str;
        this.capturedPhotoDir = str2;
        this.shouldRemoveLabel = bool;
    }
}
