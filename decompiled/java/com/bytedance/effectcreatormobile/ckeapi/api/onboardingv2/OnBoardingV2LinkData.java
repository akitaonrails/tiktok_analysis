package com.bytedance.effectcreatormobile.ckeapi.api.onboardingv2;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.effectcreatormobile.ckeapi.api.onboardingv2.OnBoardingV2LinkData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class OnBoardingV2LinkData implements Parcelable {
    public static final Parcelable.Creator<OnBoardingV2LinkData> CREATOR = new Parcelable.Creator<OnBoardingV2LinkData>() { // from class: X.0mcx
        @Override // android.os.Parcelable.Creator
        public final OnBoardingV2LinkData createFromParcel(Parcel parcel) {
            return new OnBoardingV2LinkData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OnBoardingV2LinkData[] newArray(int i) {
            return new OnBoardingV2LinkData[i];
        }
    };
    public final String placeHolderLink;
    public final String sourceId;
    public final String videoLink;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnBoardingV2LinkData)) {
            return false;
        }
        OnBoardingV2LinkData onBoardingV2LinkData = (OnBoardingV2LinkData) obj;
        return Intrinsics.LJFF(this.videoLink, onBoardingV2LinkData.videoLink) && Intrinsics.LJFF(this.placeHolderLink, onBoardingV2LinkData.placeHolderLink) && Intrinsics.LJFF(this.sourceId, onBoardingV2LinkData.sourceId);
    }

    public final int hashCode() {
        return (((this.videoLink.hashCode() * 31) + this.placeHolderLink.hashCode()) * 31) + this.sourceId.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnBoardingV2LinkData(videoLink=");
        sbLIZ.append(this.videoLink);
        sbLIZ.append(", placeHolderLink=");
        sbLIZ.append(this.placeHolderLink);
        sbLIZ.append(", sourceId=");
        sbLIZ.append(this.sourceId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoLink);
        parcel.writeString(this.placeHolderLink);
        parcel.writeString(this.sourceId);
    }

    public OnBoardingV2LinkData(String str, String str2, String str3) {
        this.videoLink = str;
        this.placeHolderLink = str2;
        this.sourceId = str3;
    }
}
