package com.ss.android.ugc.aweme.creative.model.conflicts;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.conflicts.RecordConflictsModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class RecordConflictsModel implements Parcelable {
    public static final Parcelable.Creator<RecordConflictsModel> CREATOR = new Parcelable.Creator<RecordConflictsModel>() { // from class: X.0nWo
        @Override // android.os.Parcelable.Creator
        public final RecordConflictsModel createFromParcel(Parcel parcel) {
            return new RecordConflictsModel(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecordConflictsModel[] newArray(int i) {
            return new RecordConflictsModel[i];
        }
    };
    public String enterMethodByConflicts;

    public RecordConflictsModel() {
        this((String) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecordConflictsModel) && Intrinsics.LJFF(this.enterMethodByConflicts, ((RecordConflictsModel) obj).enterMethodByConflicts);
    }

    public final int hashCode() {
        String str = this.enterMethodByConflicts;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordConflictsModel(enterMethodByConflicts=");
        sbLIZ.append(this.enterMethodByConflicts);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.enterMethodByConflicts);
    }

    public RecordConflictsModel(String str) {
        this.enterMethodByConflicts = str;
    }

    public /* synthetic */ RecordConflictsModel(int i) {
        this((String) null);
    }
}
