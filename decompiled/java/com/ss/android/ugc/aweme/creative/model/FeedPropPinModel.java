package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.FeedPropPinModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class FeedPropPinModel implements Parcelable {
    public static final Parcelable.Creator<FeedPropPinModel> CREATOR = new Parcelable.Creator<FeedPropPinModel>() { // from class: X.0mdy
        @Override // android.os.Parcelable.Creator
        public final FeedPropPinModel createFromParcel(Parcel parcel) {
            return new FeedPropPinModel(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FeedPropPinModel[] newArray(int i) {
            return new FeedPropPinModel[i];
        }
    };

    @C09CT("effect_id")
    public final String effectId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeedPropPinModel) && Intrinsics.LJFF(this.effectId, ((FeedPropPinModel) obj).effectId);
    }

    public final int hashCode() {
        return this.effectId.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedPropPinModel(effectId=");
        sbLIZ.append(this.effectId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.effectId);
    }

    public FeedPropPinModel() {
        this("");
    }

    public FeedPropPinModel(String str) {
        this.effectId = str;
    }
}
