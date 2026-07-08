package com.ss.android.ugc.aweme.effect;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.effect.ClipsModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class ClipsModel implements Serializable, Parcelable {
    public static final Parcelable.Creator<ClipsModel> CREATOR = new Parcelable.Creator<ClipsModel>() { // from class: X.0L9d
        @Override // android.os.Parcelable.Creator
        public final ClipsModel createFromParcel(Parcel parcel) {
            double d = parcel.readDouble();
            double d2 = parcel.readDouble();
            float f = parcel.readFloat();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Float.valueOf(parcel.readFloat()));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(Float.valueOf(parcel.readFloat()));
            }
            return new ClipsModel(d, d2, f, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsModel[] newArray(int i) {
            return new ClipsModel[i];
        }
    };

    @C09CT("duration")
    public final float duration;

    @C09CT("i")
    public final double i;

    @C09CT("o")
    public final double o;

    @C09CT("xPoints")
    public final List<Float> xPoints;

    @C09CT("yPoints")
    public final List<Float> yPoints;

    public final ClipsModel copy(double d, double d2, float f, List<Float> list, List<Float> list2) {
        return new ClipsModel(d, d2, f, list, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsModel)) {
            return false;
        }
        ClipsModel clipsModel = (ClipsModel) obj;
        return Double.compare(this.i, clipsModel.i) == 0 && Double.compare(this.o, clipsModel.o) == 0 && Float.compare(this.duration, clipsModel.duration) == 0 && Intrinsics.LJFF(this.xPoints, clipsModel.xPoints) && Intrinsics.LJFF(this.yPoints, clipsModel.yPoints);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClipsModel(i=");
        sbLIZ.append(this.i);
        sbLIZ.append(", o=");
        sbLIZ.append(this.o);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", xPoints=");
        sbLIZ.append(this.xPoints);
        sbLIZ.append(", yPoints=");
        sbLIZ.append(this.yPoints);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.i);
        parcel.writeDouble(this.o);
        parcel.writeFloat(this.duration);
        List<Float> list = this.xPoints;
        parcel.writeInt(list.size());
        Iterator<Float> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeFloat(it2.next().floatValue());
        }
        List<Float> list2 = this.yPoints;
        parcel.writeInt(list2.size());
        Iterator<Float> it3 = list2.iterator();
        while (it3.hasNext()) {
            parcel.writeFloat(it3.next().floatValue());
        }
    }

    public int hashCode() {
        return (((((((C786410Ut5.X2(this.i) * 31) + C786410Ut5.X2(this.o)) * 31) + Float.floatToIntBits(this.duration)) * 31) + this.xPoints.hashCode()) * 31) + this.yPoints.hashCode();
    }

    public final float getDuration() {
        return this.duration;
    }

    public final double getI() {
        return this.i;
    }

    public final double getO() {
        return this.o;
    }

    public final List<Float> getXPoints() {
        return this.xPoints;
    }

    public final List<Float> getYPoints() {
        return this.yPoints;
    }

    public ClipsModel(double d, double d2, float f, List<Float> list, List<Float> list2) {
        this.i = d;
        this.o = d2;
        this.duration = f;
        this.xPoints = list;
        this.yPoints = list2;
    }
}
