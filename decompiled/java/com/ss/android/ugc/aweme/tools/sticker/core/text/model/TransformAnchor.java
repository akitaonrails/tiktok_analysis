package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TransformAnchor;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class TransformAnchor implements Parcelable, Serializable {

    @C09CT("x")
    public final Float x;

    @C09CT("y")
    public final Float y;
    public static final Parcelable.Creator<TransformAnchor> CREATOR = new Parcelable.Creator<TransformAnchor>() { // from class: X.0EKK
        @Override // android.os.Parcelable.Creator
        public final TransformAnchor createFromParcel(Parcel parcel) {
            Float fValueOf;
            Float fValueOf2 = null;
            if (parcel.readInt() == 0) {
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() != 0) {
                fValueOf2 = Float.valueOf(parcel.readFloat());
            }
            return new TransformAnchor(fValueOf, fValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final TransformAnchor[] newArray(int i) {
            return new TransformAnchor[i];
        }
    };
    public static final int $stable = 8;

    public final TransformAnchor copy(Float f, Float f2) {
        return new TransformAnchor(f, f2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformAnchor)) {
            return false;
        }
        TransformAnchor transformAnchor = (TransformAnchor) obj;
        return Intrinsics.LJFF(this.x, transformAnchor.x) && Intrinsics.LJFF(this.y, transformAnchor.y);
    }

    public int hashCode() {
        Float f = this.x;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.y;
        return iHashCode + (f2 != null ? f2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TransformAnchor(x=");
        sbLIZ.append(this.x);
        sbLIZ.append(", y=");
        sbLIZ.append(this.y);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Float f = this.x;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.y;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
    }

    public final Float getX() {
        return this.x;
    }

    public final Float getY() {
        return this.y;
    }

    public TransformAnchor(Float f, Float f2) {
        this.x = f;
        this.y = f2;
    }
}
