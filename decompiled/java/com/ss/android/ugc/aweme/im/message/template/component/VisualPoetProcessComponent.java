package com.ss.android.ugc.aweme.im.message.template.component;

import X.C2188811AlT;
import X.C2241321Cny;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetProcessComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class VisualPoetProcessComponent implements BaseComponent<C2241321Cny> {
    public static final Parcelable.Creator<VisualPoetProcessComponent> CREATOR = new Parcelable.Creator<VisualPoetProcessComponent>() { // from class: X.18Xe
        @Override // android.os.Parcelable.Creator
        public final VisualPoetProcessComponent createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            Integer numValueOf4 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            return new VisualPoetProcessComponent(numValueOf, numValueOf2, numValueOf3, numValueOf4);
        }

        @Override // android.os.Parcelable.Creator
        public final VisualPoetProcessComponent[] newArray(int i) {
            return new VisualPoetProcessComponent[i];
        }
    };
    public final Integer estimatedTimeCost;
    public final Integer processEnd;
    public final Integer processStart;
    public final Integer stage;

    public VisualPoetProcessComponent() {
        this(null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisualPoetProcessComponent)) {
            return false;
        }
        VisualPoetProcessComponent visualPoetProcessComponent = (VisualPoetProcessComponent) obj;
        return Intrinsics.LJFF(this.processStart, visualPoetProcessComponent.processStart) && Intrinsics.LJFF(this.processEnd, visualPoetProcessComponent.processEnd) && Intrinsics.LJFF(this.estimatedTimeCost, visualPoetProcessComponent.estimatedTimeCost) && Intrinsics.LJFF(this.stage, visualPoetProcessComponent.stage);
    }

    public final int hashCode() {
        Integer num = this.processStart;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.processEnd;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.estimatedTimeCost;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.stage;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VisualPoetProcessComponent(processStart=");
        sbLIZ.append(this.processStart);
        sbLIZ.append(", processEnd=");
        sbLIZ.append(this.processEnd);
        sbLIZ.append(", estimatedTimeCost=");
        sbLIZ.append(this.estimatedTimeCost);
        sbLIZ.append(", stage=");
        sbLIZ.append(this.stage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.processStart;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.processEnd;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.estimatedTimeCost;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.stage;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
    }

    public VisualPoetProcessComponent(Integer num, Integer num2, Integer num3, Integer num4) {
        this.processStart = num;
        this.processEnd = num2;
        this.estimatedTimeCost = num3;
        this.stage = num4;
    }
}
