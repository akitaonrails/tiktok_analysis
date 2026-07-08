package com.ss.android.ugc.tools.data;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.tools.data.ConfirmModal;

/* JADX INFO: loaded from: classes33.dex */
public final class ConfirmModal implements Parcelable {
    public static final Parcelable.Creator<ConfirmModal> CREATOR = new Parcelable.Creator<ConfirmModal>() { // from class: X.18WS
        @Override // android.os.Parcelable.Creator
        public final ConfirmModal createFromParcel(Parcel parcel) {
            return new ConfirmModal(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ConfirmModal[] newArray(int i) {
            return new ConfirmModal[i];
        }
    };
    public final int confirmBtnResId;
    public final int detailResId;
    public final int titleResId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmModal)) {
            return false;
        }
        ConfirmModal confirmModal = (ConfirmModal) obj;
        return this.titleResId == confirmModal.titleResId && this.detailResId == confirmModal.detailResId && this.confirmBtnResId == confirmModal.confirmBtnResId;
    }

    public final int hashCode() {
        return (((this.titleResId * 31) + this.detailResId) * 31) + this.confirmBtnResId;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConfirmModal(titleResId=");
        sbLIZ.append(this.titleResId);
        sbLIZ.append(", detailResId=");
        sbLIZ.append(this.detailResId);
        sbLIZ.append(", confirmBtnResId=");
        sbLIZ.append(this.confirmBtnResId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.titleResId);
        parcel.writeInt(this.detailResId);
        parcel.writeInt(this.confirmBtnResId);
    }

    public ConfirmModal(int i, int i2, int i3) {
        this.titleResId = i;
        this.detailResId = i2;
        this.confirmBtnResId = i3;
    }
}
