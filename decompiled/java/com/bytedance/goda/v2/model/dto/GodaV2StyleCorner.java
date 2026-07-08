package com.bytedance.goda.v2.model.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.goda.v2.model.dto.GodaV2StyleCorner;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class GodaV2StyleCorner implements Parcelable {
    public static final Parcelable.Creator<GodaV2StyleCorner> CREATOR = new Parcelable.Creator<GodaV2StyleCorner>() { // from class: X.0jZ4
        @Override // android.os.Parcelable.Creator
        public final GodaV2StyleCorner createFromParcel(Parcel parcel) {
            Float fValueOf;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
            }
            return new GodaV2StyleCorner(fValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GodaV2StyleCorner[] newArray(int i) {
            return new GodaV2StyleCorner[i];
        }
    };

    @C09CT("position")
    public final ArrayList<Integer> position;

    @C09CT("radius")
    public final Float radius;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GodaV2StyleCorner)) {
            return false;
        }
        GodaV2StyleCorner godaV2StyleCorner = (GodaV2StyleCorner) obj;
        return Intrinsics.LJFF(this.radius, godaV2StyleCorner.radius) && Intrinsics.LJFF(this.position, godaV2StyleCorner.position);
    }

    public final int hashCode() {
        Float f = this.radius;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        ArrayList<Integer> arrayList = this.position;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GodaV2StyleCorner(radius=");
        sbLIZ.append(this.radius);
        sbLIZ.append(", position=");
        sbLIZ.append(this.position);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Float f = this.radius;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        ArrayList<Integer> arrayList = this.position;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator<Integer> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(it2.next().intValue());
        }
    }

    public GodaV2StyleCorner(Float f, ArrayList<Integer> arrayList) {
        this.radius = f;
        this.position = arrayList;
    }
}
