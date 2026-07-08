package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.PropModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class PropModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<PropModel> CREATOR = new Parcelable.Creator<PropModel>() { // from class: X.0MhT
        @Override // android.os.Parcelable.Creator
        public final PropModel createFromParcel(Parcel parcel) {
            return new PropModel(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PropModel[] newArray(int i) {
            return new PropModel[i];
        }
    };

    @C09CT("effect_id")
    public String effectId;

    public PropModel() {
        this(null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.effectId);
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public PropModel(String str) {
        this.effectId = str;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }
}
