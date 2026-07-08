package com.ss.android.ugc.aweme.creative.model.edit.multiedit;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.EditAdjustClipsState;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class EditAdjustClipsState implements Parcelable, Serializable {
    public static final Parcelable.Creator<EditAdjustClipsState> CREATOR = new Parcelable.Creator<EditAdjustClipsState>() { // from class: X.0oBH
        @Override // android.os.Parcelable.Creator
        public final EditAdjustClipsState createFromParcel(Parcel parcel) {
            return new EditAdjustClipsState((Pair) parcel.readSerializable(), (Pair) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final EditAdjustClipsState[] newArray(int i) {
            return new EditAdjustClipsState[i];
        }
    };

    @C09CT(alternate = {"a"}, value = "lastEditBoundary")
    public final Pair<Long, Long> lastEditBoundary;

    @C09CT(alternate = {"b"}, value = "viewBoundary")
    public final Pair<Long, Long> viewBoundary;

    public EditAdjustClipsState() {
        this(null, null);
    }

    public final EditAdjustClipsState copy(Pair<Long, Long> pair, Pair<Long, Long> pair2) {
        return new EditAdjustClipsState(pair, pair2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditAdjustClipsState)) {
            return false;
        }
        EditAdjustClipsState editAdjustClipsState = (EditAdjustClipsState) obj;
        return Intrinsics.LJFF(this.lastEditBoundary, editAdjustClipsState.lastEditBoundary) && Intrinsics.LJFF(this.viewBoundary, editAdjustClipsState.viewBoundary);
    }

    public int hashCode() {
        Pair<Long, Long> pair = this.lastEditBoundary;
        int iHashCode = (pair == null ? 0 : pair.hashCode()) * 31;
        Pair<Long, Long> pair2 = this.viewBoundary;
        return iHashCode + (pair2 != null ? pair2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditAdjustClipsState(lastEditBoundary=");
        sbLIZ.append(this.lastEditBoundary);
        sbLIZ.append(", viewBoundary=");
        sbLIZ.append(this.viewBoundary);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.lastEditBoundary);
        parcel.writeSerializable(this.viewBoundary);
    }

    public final Pair<Long, Long> getLastEditBoundary() {
        return this.lastEditBoundary;
    }

    public final Pair<Long, Long> getViewBoundary() {
        return this.viewBoundary;
    }

    public EditAdjustClipsState(Pair<Long, Long> pair, Pair<Long, Long> pair2) {
        this.lastEditBoundary = pair;
        this.viewBoundary = pair2;
    }
}
