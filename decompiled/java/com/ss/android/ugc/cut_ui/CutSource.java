package com.ss.android.ugc.cut_ui;

import X.C0LEF;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.cut_ui.CutSourceType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class CutSource implements Parcelable {
    public final CutSourceType type;
    public final String value;
    public static final C0LEF Companion = new Object() { // from class: X.0LEF
    };
    public static final Parcelable.Creator<CutSource> CREATOR = new Parcelable.Creator<CutSource>() { // from class: X.0LEE
        @Override // android.os.Parcelable.Creator
        public final CutSource createFromParcel(Parcel parcel) {
            return new CutSource(parcel.readString(), CutSourceType.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CutSource[] newArray(int i) {
            return new CutSource[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutSource)) {
            return false;
        }
        CutSource cutSource = (CutSource) obj;
        return Intrinsics.LJFF(this.value, cutSource.value) && this.type == cutSource.type;
    }

    public final int hashCode() {
        return (this.value.hashCode() * 31) + this.type.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutSource(value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.value);
        this.type.writeToParcel(parcel, i);
    }

    public CutSource(String str, CutSourceType cutSourceType) {
        this.value = str;
        this.type = cutSourceType;
    }
}
