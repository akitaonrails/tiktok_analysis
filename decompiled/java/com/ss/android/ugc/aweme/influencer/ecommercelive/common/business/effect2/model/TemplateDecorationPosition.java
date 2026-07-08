package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateDecorationPosition;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class TemplateDecorationPosition implements Parcelable {

    @C09CT("x")
    public final Integer posX;

    @C09CT("y")
    public final Integer posY;
    public static final Parcelable.Creator<TemplateDecorationPosition> CREATOR = new Parcelable.Creator<TemplateDecorationPosition>() { // from class: X.0ux6
        @Override // android.os.Parcelable.Creator
        public final TemplateDecorationPosition createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new TemplateDecorationPosition(numValueOf, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateDecorationPosition[] newArray(int i) {
            return new TemplateDecorationPosition[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateDecorationPosition)) {
            return false;
        }
        TemplateDecorationPosition templateDecorationPosition = (TemplateDecorationPosition) obj;
        return Intrinsics.LJFF(this.posX, templateDecorationPosition.posX) && Intrinsics.LJFF(this.posY, templateDecorationPosition.posY);
    }

    public final int hashCode() {
        Integer num = this.posX;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.posY;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateDecorationPosition(posX=");
        sbLIZ.append(this.posX);
        sbLIZ.append(", posY=");
        sbLIZ.append(this.posY);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.posX;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.posY;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public TemplateDecorationPosition(Integer num, Integer num2) {
        this.posX = num;
        this.posY = num2;
    }
}
