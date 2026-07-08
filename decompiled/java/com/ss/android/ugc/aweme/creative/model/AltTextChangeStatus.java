package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AltTextChangeStatus;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class AltTextChangeStatus implements Parcelable, Serializable {
    public static final Parcelable.Creator<AltTextChangeStatus> CREATOR = new Parcelable.Creator<AltTextChangeStatus>() { // from class: X.0nf4
        @Override // android.os.Parcelable.Creator
        public final AltTextChangeStatus createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new AltTextChangeStatus(z, parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AltTextChangeStatus[] newArray(int i) {
            return new AltTextChangeStatus[i];
        }
    };

    @C09CT("alt_text_added")
    public int altTextAdded;

    @C09CT("alt_text_deleted")
    public int altTextDeleted;

    @C09CT("alt_text_edited")
    public int altTextEdited;

    @C09CT("is_alt_text_changed")
    public boolean isAltTextChanged;

    public AltTextChangeStatus() {
        this(false, 0, 0, 0);
    }

    public final AltTextChangeStatus copy(boolean z, int i, int i2, int i3) {
        return new AltTextChangeStatus(z, i, i2, i3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AltTextChangeStatus)) {
            return false;
        }
        AltTextChangeStatus altTextChangeStatus = (AltTextChangeStatus) obj;
        return this.isAltTextChanged == altTextChangeStatus.isAltTextChanged && this.altTextAdded == altTextChangeStatus.altTextAdded && this.altTextEdited == altTextChangeStatus.altTextEdited && this.altTextDeleted == altTextChangeStatus.altTextDeleted;
    }

    public int hashCode() {
        return (((((C786410Ut5.Z2(this.isAltTextChanged) * 31) + this.altTextAdded) * 31) + this.altTextEdited) * 31) + this.altTextDeleted;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AltTextChangeStatus(isAltTextChanged=");
        sbLIZ.append(this.isAltTextChanged);
        sbLIZ.append(", altTextAdded=");
        sbLIZ.append(this.altTextAdded);
        sbLIZ.append(", altTextEdited=");
        sbLIZ.append(this.altTextEdited);
        sbLIZ.append(", altTextDeleted=");
        sbLIZ.append(this.altTextDeleted);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isAltTextChanged ? 1 : 0);
        parcel.writeInt(this.altTextAdded);
        parcel.writeInt(this.altTextEdited);
        parcel.writeInt(this.altTextDeleted);
    }

    public final int getAltTextAdded() {
        return this.altTextAdded;
    }

    public final int getAltTextDeleted() {
        return this.altTextDeleted;
    }

    public final int getAltTextEdited() {
        return this.altTextEdited;
    }

    public final boolean isAltTextChanged() {
        return this.isAltTextChanged;
    }

    public final void setAltTextAdded(int i) {
        this.altTextAdded = i;
    }

    public final void setAltTextChanged(boolean z) {
        this.isAltTextChanged = z;
    }

    public final void setAltTextDeleted(int i) {
        this.altTextDeleted = i;
    }

    public final void setAltTextEdited(int i) {
        this.altTextEdited = i;
    }

    public AltTextChangeStatus(boolean z, int i, int i2, int i3) {
        this.isAltTextChanged = z;
        this.altTextAdded = i;
        this.altTextEdited = i2;
        this.altTextDeleted = i3;
    }
}
