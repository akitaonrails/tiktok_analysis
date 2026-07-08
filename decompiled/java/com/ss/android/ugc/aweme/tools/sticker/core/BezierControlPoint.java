package com.ss.android.ugc.aweme.tools.sticker.core;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.BezierControlPoint;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class BezierControlPoint implements Cloneable, Parcelable, Serializable {

    @C09CT("values")
    public final List<Double> controlValues;

    @C09CT("offset")
    public final Long timeOffset;
    public static final Parcelable.Creator<BezierControlPoint> CREATOR = new Parcelable.Creator<BezierControlPoint>() { // from class: X.0EKB
        @Override // android.os.Parcelable.Creator
        public final BezierControlPoint createFromParcel(Parcel parcel) {
            Long lValueOf;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Double.valueOf(parcel.readDouble()));
                }
            }
            return new BezierControlPoint(lValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BezierControlPoint[] newArray(int i) {
            return new BezierControlPoint[i];
        }
    };
    public static final int $stable = 8;

    public BezierControlPoint() {
        this(null, null);
    }

    public final BezierControlPoint copy(Long l, List<Double> list) {
        return new BezierControlPoint(l, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BezierControlPoint)) {
            return false;
        }
        BezierControlPoint bezierControlPoint = (BezierControlPoint) obj;
        return Intrinsics.LJFF(this.timeOffset, bezierControlPoint.timeOffset) && Intrinsics.LJFF(this.controlValues, bezierControlPoint.controlValues);
    }

    public int hashCode() {
        Long l = this.timeOffset;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        List<Double> list = this.controlValues;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BezierControlPoint(timeOffset=");
        sbLIZ.append(this.timeOffset);
        sbLIZ.append(", controlValues=");
        sbLIZ.append(this.controlValues);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.timeOffset;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        List<Double> list = this.controlValues;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<Double> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeDouble(it2.next().doubleValue());
        }
    }

    public Object clone() {
        return super.clone();
    }

    public final List<Double> getControlValues() {
        return this.controlValues;
    }

    public final Long getTimeOffset() {
        return this.timeOffset;
    }

    public BezierControlPoint(Long l, List<Double> list) {
        this.timeOffset = l;
        this.controlValues = list;
    }
}
