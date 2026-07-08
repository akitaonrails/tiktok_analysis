package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.DependencyInfo;
import com.ss.ugc.aweme.creation.base.SpecialEffectResModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class SpecialEffectResModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<SpecialEffectResModel> CREATOR = new Parcelable.Creator<SpecialEffectResModel>() { // from class: X.0MhG
        @Override // android.os.Parcelable.Creator
        public final SpecialEffectResModel createFromParcel(Parcel parcel) {
            return new SpecialEffectResModel((DependencyInfo) parcel.readParcelable(SpecialEffectResModel.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SpecialEffectResModel[] newArray(int i) {
            return new SpecialEffectResModel[i];
        }
    };

    @C09CT("dependency_info")
    public DependencyInfo dependencyInfo;

    @C09CT("effect_id")
    public String effectId;

    public SpecialEffectResModel() {
        this(null, "");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.dependencyInfo, i);
        parcel.writeString(this.effectId);
    }

    public final DependencyInfo getDependencyInfo() {
        return this.dependencyInfo;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final void setDependencyInfo(DependencyInfo dependencyInfo) {
        this.dependencyInfo = dependencyInfo;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public SpecialEffectResModel(DependencyInfo dependencyInfo, String str) {
        this.dependencyInfo = dependencyInfo;
        this.effectId = str;
    }
}
