package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.EditPageRestoreActivityModel;

/* JADX INFO: loaded from: classes23.dex */
public final class EditPageRestoreActivityModel implements Parcelable {
    public static final Parcelable.Creator<EditPageRestoreActivityModel> CREATOR = new Parcelable.Creator<EditPageRestoreActivityModel>() { // from class: X.0mc9
        @Override // android.os.Parcelable.Creator
        public final EditPageRestoreActivityModel createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new EditPageRestoreActivityModel(z);
        }

        @Override // android.os.Parcelable.Creator
        public final EditPageRestoreActivityModel[] newArray(int i) {
            return new EditPageRestoreActivityModel[i];
        }
    };

    @C09CT("is_activity_restored")
    public boolean isActivityRestored;

    @C040H
    public boolean isRestoreFromSaveInstance;

    public EditPageRestoreActivityModel() {
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
        return (obj instanceof EditPageRestoreActivityModel) && this.isActivityRestored == ((EditPageRestoreActivityModel) obj).isActivityRestored;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.isActivityRestored);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditPageRestoreActivityModel(isActivityRestored=");
        sbLIZ.append(this.isActivityRestored);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isActivityRestored ? 1 : 0);
    }

    public EditPageRestoreActivityModel(boolean z) {
        this.isActivityRestored = z;
    }
}
