package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C040H;
import X.C0FHM;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.EditViewUIState;

/* JADX INFO: loaded from: classes6.dex */
public final class EditViewUIState implements Parcelable {

    @C040H
    public final C0FHM bottomFuncListUIState;

    @C040H
    public final C0FHM colorListUIState;

    @C040H
    public final C0FHM fontListUIState;
    public static final Parcelable.Creator<EditViewUIState> CREATOR = new Parcelable.Creator<EditViewUIState>() { // from class: X.0F7Z
        @Override // android.os.Parcelable.Creator
        public final EditViewUIState createFromParcel(Parcel parcel) {
            return new EditViewUIState(C0FHM.valueOf(parcel.readString()), C0FHM.valueOf(parcel.readString()), C0FHM.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final EditViewUIState[] newArray(int i) {
            return new EditViewUIState[i];
        }
    };
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    public EditViewUIState() {
        C0FHM c0fhm = null;
        this(c0fhm, c0fhm, 7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditViewUIState)) {
            return false;
        }
        EditViewUIState editViewUIState = (EditViewUIState) obj;
        return this.colorListUIState == editViewUIState.colorListUIState && this.fontListUIState == editViewUIState.fontListUIState && this.bottomFuncListUIState == editViewUIState.bottomFuncListUIState;
    }

    public final int hashCode() {
        return (((this.colorListUIState.hashCode() * 31) + this.fontListUIState.hashCode()) * 31) + this.bottomFuncListUIState.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditViewUIState(colorListUIState=");
        sbLIZ.append(this.colorListUIState);
        sbLIZ.append(", fontListUIState=");
        sbLIZ.append(this.fontListUIState);
        sbLIZ.append(", bottomFuncListUIState=");
        sbLIZ.append(this.bottomFuncListUIState);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.colorListUIState.name());
        parcel.writeString(this.fontListUIState.name());
        parcel.writeString(this.bottomFuncListUIState.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EditViewUIState(C0FHM c0fhm, C0FHM c0fhm2, int i) {
        C0FHM c0fhm3;
        c0fhm = (i & 1) != 0 ? C0FHM.GONE : c0fhm;
        c0fhm2 = (i & 2) != 0 ? C0FHM.VISIBLE : c0fhm2;
        if ((i & 4) != 0) {
            c0fhm3 = C0FHM.VISIBLE;
        } else {
            c0fhm3 = null;
        }
        this(c0fhm, c0fhm2, c0fhm3);
    }

    public EditViewUIState(C0FHM c0fhm, C0FHM c0fhm2, C0FHM c0fhm3) {
        this.colorListUIState = c0fhm;
        this.fontListUIState = c0fhm2;
        this.bottomFuncListUIState = c0fhm3;
    }
}
