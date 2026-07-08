package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.EditPhotoModel;

/* JADX INFO: loaded from: classes23.dex */
public final class EditPhotoModel implements Parcelable {
    public static final Parcelable.Creator<EditPhotoModel> CREATOR = new Parcelable.Creator<EditPhotoModel>() { // from class: X.0nWq
        @Override // android.os.Parcelable.Creator
        public final EditPhotoModel createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new EditPhotoModel(z);
        }

        @Override // android.os.Parcelable.Creator
        public final EditPhotoModel[] newArray(int i) {
            return new EditPhotoModel[i];
        }
    };

    @C09CT("is_from_edit_photo")
    public boolean isFromEditPhoto;

    public EditPhotoModel() {
        this(false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EditPhotoModel) && this.isFromEditPhoto == ((EditPhotoModel) obj).isFromEditPhoto;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.isFromEditPhoto);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditPhotoModel(isFromEditPhoto=");
        sbLIZ.append(this.isFromEditPhoto);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isFromEditPhoto ? 1 : 0);
    }

    public EditPhotoModel(boolean z) {
        this.isFromEditPhoto = z;
    }
}
