package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.EffectShowModel;
import com.ss.android.ugc.aweme.utils.ParcelableConcurrentSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class EffectShowModel implements Parcelable {
    public static final Parcelable.Creator<EffectShowModel> CREATOR = new Parcelable.Creator<EffectShowModel>() { // from class: X.0nWa
        @Override // android.os.Parcelable.Creator
        public final EffectShowModel createFromParcel(Parcel parcel) {
            return new EffectShowModel(ParcelableConcurrentSet.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final EffectShowModel[] newArray(int i) {
            return new EffectShowModel[i];
        }
    };

    @C09CT("effect_set")
    public final ParcelableConcurrentSet set;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectShowModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EffectShowModel) && Intrinsics.LJFF(this.set, ((EffectShowModel) obj).set);
    }

    public final int hashCode() {
        return this.set.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectShowModel(set=");
        sbLIZ.append(this.set);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.set.writeToParcel(parcel, i);
    }

    public EffectShowModel(ParcelableConcurrentSet parcelableConcurrentSet) {
        this.set = parcelableConcurrentSet;
    }

    public /* synthetic */ EffectShowModel(ParcelableConcurrentSet parcelableConcurrentSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ParcelableConcurrentSet() : parcelableConcurrentSet);
    }
}
