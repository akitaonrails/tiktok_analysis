package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ModelFigure;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ModelFigure implements Parcelable {

    @C09CT("name")
    public final String name;

    @C09CT("value")
    public final String value;
    public static final Parcelable.Creator<ModelFigure> CREATOR = new Parcelable.Creator<ModelFigure>() { // from class: X.03va
        @Override // android.os.Parcelable.Creator
        public final ModelFigure createFromParcel(Parcel parcel) {
            return new ModelFigure(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ModelFigure[] newArray(int i) {
            return new ModelFigure[i];
        }
    };
    public static final int $stable = 8;

    public ModelFigure() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModelFigure)) {
            return false;
        }
        ModelFigure modelFigure = (ModelFigure) obj;
        return Intrinsics.LJFF(this.name, modelFigure.name) && Intrinsics.LJFF(this.value, modelFigure.value);
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ModelFigure(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.value);
    }

    public ModelFigure(String str, String str2) {
        this.name = str;
        this.value = str2;
    }
}
