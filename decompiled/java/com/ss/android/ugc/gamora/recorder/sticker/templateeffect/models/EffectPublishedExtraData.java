package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.EffectPublishedExtraData;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class EffectPublishedExtraData implements Parcelable {
    public final String draftId;
    public final String effectId;
    public final MobileEffect mobileEffect;
    public final String shootEnterFrom;
    public final String shootWay;
    public static final Parcelable.Creator<EffectPublishedExtraData> CREATOR = new Parcelable.Creator<EffectPublishedExtraData>() { // from class: X.0siX
        @Override // android.os.Parcelable.Creator
        public final EffectPublishedExtraData createFromParcel(Parcel parcel) {
            return new EffectPublishedExtraData(parcel.readString(), (MobileEffect) parcel.readParcelable(EffectPublishedExtraData.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EffectPublishedExtraData[] newArray(int i) {
            return new EffectPublishedExtraData[i];
        }
    };
    public static final int $stable = MobileEffect.$stable;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectPublishedExtraData)) {
            return false;
        }
        EffectPublishedExtraData effectPublishedExtraData = (EffectPublishedExtraData) obj;
        return Intrinsics.LJFF(this.effectId, effectPublishedExtraData.effectId) && Intrinsics.LJFF(this.mobileEffect, effectPublishedExtraData.mobileEffect) && Intrinsics.LJFF(this.shootWay, effectPublishedExtraData.shootWay) && Intrinsics.LJFF(this.shootEnterFrom, effectPublishedExtraData.shootEnterFrom) && Intrinsics.LJFF(this.draftId, effectPublishedExtraData.draftId);
    }

    public final int hashCode() {
        int iHashCode = this.effectId.hashCode() * 31;
        MobileEffect mobileEffect = this.mobileEffect;
        int iHashCode2 = (((((iHashCode + (mobileEffect == null ? 0 : mobileEffect.hashCode())) * 31) + this.shootWay.hashCode()) * 31) + this.shootEnterFrom.hashCode()) * 31;
        String str = this.draftId;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectPublishedExtraData(effectId=");
        sbLIZ.append(this.effectId);
        sbLIZ.append(", mobileEffect=");
        sbLIZ.append(this.mobileEffect);
        sbLIZ.append(", shootWay=");
        sbLIZ.append(this.shootWay);
        sbLIZ.append(", shootEnterFrom=");
        sbLIZ.append(this.shootEnterFrom);
        sbLIZ.append(", draftId=");
        sbLIZ.append(this.draftId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.effectId);
        parcel.writeParcelable(this.mobileEffect, i);
        parcel.writeString(this.shootWay);
        parcel.writeString(this.shootEnterFrom);
        parcel.writeString(this.draftId);
    }

    public EffectPublishedExtraData(String str, MobileEffect mobileEffect, String str2, String str3, String str4) {
        this.effectId = str;
        this.mobileEffect = mobileEffect;
        this.shootWay = str2;
        this.shootEnterFrom = str3;
        this.draftId = str4;
    }
}
