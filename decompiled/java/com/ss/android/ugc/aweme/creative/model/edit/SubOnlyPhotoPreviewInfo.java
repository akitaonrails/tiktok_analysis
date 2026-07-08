package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.SubOnlyPhotoPreviewInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class SubOnlyPhotoPreviewInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<SubOnlyPhotoPreviewInfo> CREATOR = new Parcelable.Creator<SubOnlyPhotoPreviewInfo>() { // from class: X.0nNW
        @Override // android.os.Parcelable.Creator
        public final SubOnlyPhotoPreviewInfo createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new SubOnlyPhotoPreviewInfo(z);
        }

        @Override // android.os.Parcelable.Creator
        public final SubOnlyPhotoPreviewInfo[] newArray(int i) {
            return new SubOnlyPhotoPreviewInfo[i];
        }
    };

    @C09CT("is_preview")
    public final boolean isPreview;

    public SubOnlyPhotoPreviewInfo() {
        this(false);
    }

    public final SubOnlyPhotoPreviewInfo copy(boolean z) {
        return new SubOnlyPhotoPreviewInfo(z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubOnlyPhotoPreviewInfo) && this.isPreview == ((SubOnlyPhotoPreviewInfo) obj).isPreview;
    }

    public int hashCode() {
        return C786410Ut5.Z2(this.isPreview);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubOnlyPhotoPreviewInfo(isPreview=");
        sbLIZ.append(this.isPreview);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isPreview ? 1 : 0);
    }

    public final boolean isPreview() {
        return this.isPreview;
    }

    public SubOnlyPhotoPreviewInfo(boolean z) {
        this.isPreview = z;
    }
}
