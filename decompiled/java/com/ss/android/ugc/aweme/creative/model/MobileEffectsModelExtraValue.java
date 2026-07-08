package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.MobileEffectsModelExtraValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class MobileEffectsModelExtraValue implements Parcelable {
    public static final Parcelable.Creator<MobileEffectsModelExtraValue> CREATOR = new Parcelable.Creator<MobileEffectsModelExtraValue>() { // from class: X.0nJ4
        @Override // android.os.Parcelable.Creator
        public final MobileEffectsModelExtraValue createFromParcel(Parcel parcel) {
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
            return new MobileEffectsModelExtraValue(numValueOf, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final MobileEffectsModelExtraValue[] newArray(int i) {
            return new MobileEffectsModelExtraValue[i];
        }
    };

    @C040H
    public Integer effectSource;

    @C040H
    public Integer moderationStatus;

    public MobileEffectsModelExtraValue() {
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
        if (!(obj instanceof MobileEffectsModelExtraValue)) {
            return false;
        }
        MobileEffectsModelExtraValue mobileEffectsModelExtraValue = (MobileEffectsModelExtraValue) obj;
        return Intrinsics.LJFF(this.moderationStatus, mobileEffectsModelExtraValue.moderationStatus) && Intrinsics.LJFF(this.effectSource, mobileEffectsModelExtraValue.effectSource);
    }

    public final int hashCode() {
        Integer num = this.moderationStatus;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.effectSource;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MobileEffectsModelExtraValue(moderationStatus=");
        sbLIZ.append(this.moderationStatus);
        sbLIZ.append(", effectSource=");
        sbLIZ.append(this.effectSource);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.moderationStatus;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.effectSource;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public MobileEffectsModelExtraValue(Integer num, Integer num2) {
        this.moderationStatus = num;
        this.effectSource = num2;
    }
}
