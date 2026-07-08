package com.bytedance.effectcreatormobile.ckeapi.api.effectonboarding;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.effectcreatormobile.ckeapi.api.effectonboarding.EffectOnBoardingData;
import com.bytedance.effectcreatormobile.ckeapi.api.onboardingv2.OnBoardingV2LinkData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class EffectOnBoardingData implements Parcelable {
    public static final Parcelable.Creator<EffectOnBoardingData> CREATOR = new Parcelable.Creator<EffectOnBoardingData>() { // from class: X.0mcw
        @Override // android.os.Parcelable.Creator
        public final EffectOnBoardingData createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            OnBoardingV2LinkData onBoardingV2LinkDataCreateFromParcel = OnBoardingV2LinkData.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new EffectOnBoardingData(string, onBoardingV2LinkDataCreateFromParcel, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final EffectOnBoardingData[] newArray(int i) {
            return new EffectOnBoardingData[i];
        }
    };
    public final String descContent;
    public final OnBoardingV2LinkData linkData;
    public final Integer marginBottomInDp;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectOnBoardingData)) {
            return false;
        }
        EffectOnBoardingData effectOnBoardingData = (EffectOnBoardingData) obj;
        return Intrinsics.LJFF(this.descContent, effectOnBoardingData.descContent) && Intrinsics.LJFF(this.linkData, effectOnBoardingData.linkData) && Intrinsics.LJFF(this.marginBottomInDp, effectOnBoardingData.marginBottomInDp);
    }

    public final int hashCode() {
        int iHashCode = ((this.descContent.hashCode() * 31) + this.linkData.hashCode()) * 31;
        Integer num = this.marginBottomInDp;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectOnBoardingData(descContent=");
        sbLIZ.append(this.descContent);
        sbLIZ.append(", linkData=");
        sbLIZ.append(this.linkData);
        sbLIZ.append(", marginBottomInDp=");
        sbLIZ.append(this.marginBottomInDp);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.descContent);
        this.linkData.writeToParcel(parcel, i);
        Integer num = this.marginBottomInDp;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public EffectOnBoardingData(String str, OnBoardingV2LinkData onBoardingV2LinkData, Integer num) {
        this.descContent = str;
        this.linkData = onBoardingV2LinkData;
        this.marginBottomInDp = num;
    }
}
