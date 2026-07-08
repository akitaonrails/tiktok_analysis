package com.ss.android.ugc.gamora.recorder.sticker.templateeffect;

import X.C2188811AlT;
import X.InterfaceC111300bX;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectBeanData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class MobileEffectBeanData implements InterfaceC111300bX, Parcelable {
    public final String sdkExtra;
    public static final Parcelable.Creator<MobileEffectBeanData> CREATOR = new Parcelable.Creator<MobileEffectBeanData>() { // from class: X.0vDh
        @Override // android.os.Parcelable.Creator
        public final MobileEffectBeanData createFromParcel(Parcel parcel) {
            return new MobileEffectBeanData(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MobileEffectBeanData[] newArray(int i) {
            return new MobileEffectBeanData[i];
        }
    };
    public static final int $stable = 8;

    public MobileEffectBeanData() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileEffectBeanData) && Intrinsics.LJFF(this.sdkExtra, ((MobileEffectBeanData) obj).sdkExtra);
    }

    public final int hashCode() {
        String str = this.sdkExtra;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MobileEffectBeanData(sdkExtra=");
        sbLIZ.append(this.sdkExtra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sdkExtra);
    }

    public MobileEffectBeanData(String str) {
        this.sdkExtra = str;
    }
}
