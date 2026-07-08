package com.ss.android.ugc.aweme.tools.sticker.core;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.BezierControlPoint;
import com.ss.android.ugc.aweme.tools.sticker.core.Keyframe;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class Keyframe implements Cloneable, Parcelable, Serializable {

    @C09CT("graph_type")
    public final Integer graphType;

    @C09CT("left")
    public final BezierControlPoint left;

    @C09CT("right")
    public final BezierControlPoint right;

    @C09CT("time")
    public final Long time;

    @C09CT("value")
    public final List<Double> value;
    public static final Parcelable.Creator<Keyframe> CREATOR = new Parcelable.Creator<Keyframe>() { // from class: X.0EKA
        @Override // android.os.Parcelable.Creator
        public final Keyframe createFromParcel(Parcel parcel) {
            Long lValueOf;
            ArrayList arrayList;
            Integer numValueOf;
            BezierControlPoint bezierControlPointCreateFromParcel;
            BezierControlPoint bezierControlPointCreateFromParcel2 = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Double.valueOf(parcel.readDouble()));
                }
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                bezierControlPointCreateFromParcel = null;
            } else {
                bezierControlPointCreateFromParcel = BezierControlPoint.CREATOR.createFromParcel(parcel);
            }
            BezierControlPoint bezierControlPoint = bezierControlPointCreateFromParcel;
            if (parcel.readInt() != 0) {
                bezierControlPointCreateFromParcel2 = BezierControlPoint.CREATOR.createFromParcel(parcel);
            }
            return new Keyframe(lValueOf, arrayList, numValueOf, bezierControlPoint, bezierControlPointCreateFromParcel2);
        }

        @Override // android.os.Parcelable.Creator
        public final Keyframe[] newArray(int i) {
            return new Keyframe[i];
        }
    };
    public static final int $stable = 8;

    public final Keyframe copy(Long l, List<Double> list, Integer num, BezierControlPoint bezierControlPoint, BezierControlPoint bezierControlPoint2) {
        return new Keyframe(l, list, num, bezierControlPoint, bezierControlPoint2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Keyframe)) {
            return false;
        }
        Keyframe keyframe = (Keyframe) obj;
        return Intrinsics.LJFF(this.time, keyframe.time) && Intrinsics.LJFF(this.value, keyframe.value) && Intrinsics.LJFF(this.graphType, keyframe.graphType) && Intrinsics.LJFF(this.left, keyframe.left) && Intrinsics.LJFF(this.right, keyframe.right);
    }

    public int hashCode() {
        Long l = this.time;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        List<Double> list = this.value;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.graphType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        BezierControlPoint bezierControlPoint = this.left;
        int iHashCode4 = (iHashCode3 + (bezierControlPoint == null ? 0 : bezierControlPoint.hashCode())) * 31;
        BezierControlPoint bezierControlPoint2 = this.right;
        return iHashCode4 + (bezierControlPoint2 != null ? bezierControlPoint2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Keyframe(time=");
        sbLIZ.append(this.time);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", graphType=");
        sbLIZ.append(this.graphType);
        sbLIZ.append(", left=");
        sbLIZ.append(this.left);
        sbLIZ.append(", right=");
        sbLIZ.append(this.right);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.time;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        List<Double> list = this.value;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Double> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeDouble(it2.next().doubleValue());
            }
        }
        Integer num = this.graphType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        BezierControlPoint bezierControlPoint = this.left;
        if (bezierControlPoint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bezierControlPoint.writeToParcel(parcel, i);
        }
        BezierControlPoint bezierControlPoint2 = this.right;
        if (bezierControlPoint2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bezierControlPoint2.writeToParcel(parcel, i);
        }
    }

    public Object clone() {
        return super.clone();
    }

    public final Integer getGraphType() {
        return this.graphType;
    }

    public final BezierControlPoint getLeft() {
        return this.left;
    }

    public final BezierControlPoint getRight() {
        return this.right;
    }

    public final Long getTime() {
        return this.time;
    }

    public final List<Double> getValue() {
        return this.value;
    }

    public Keyframe(Long l, List<Double> list, Integer num, BezierControlPoint bezierControlPoint, BezierControlPoint bezierControlPoint2) {
        this.time = l;
        this.value = list;
        this.graphType = num;
        this.left = bezierControlPoint;
        this.right = bezierControlPoint2;
    }
}
