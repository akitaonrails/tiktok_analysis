package com.ss.android.ugc.aweme.creative.model.ailive;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ailive.BlipData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class BlipData implements Parcelable {
    public static final Parcelable.Creator<BlipData> CREATOR = new Parcelable.Creator<BlipData>() { // from class: X.0MC2
        @Override // android.os.Parcelable.Creator
        public final BlipData createFromParcel(Parcel parcel) {
            return new BlipData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BlipData[] newArray(int i) {
            return new BlipData[i];
        }
    };

    @C09CT("blip")
    public final String blip;

    @C09CT("path")
    public final String path;

    @C09CT("tosKey")
    public final String tos;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlipData)) {
            return false;
        }
        BlipData blipData = (BlipData) obj;
        return Intrinsics.LJFF(this.path, blipData.path) && Intrinsics.LJFF(this.tos, blipData.tos) && Intrinsics.LJFF(this.blip, blipData.blip);
    }

    public final int hashCode() {
        return (((this.path.hashCode() * 31) + this.tos.hashCode()) * 31) + this.blip.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BlipData(path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", tos=");
        sbLIZ.append(this.tos);
        sbLIZ.append(", blip=");
        sbLIZ.append(this.blip);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.path);
        parcel.writeString(this.tos);
        parcel.writeString(this.blip);
    }

    public BlipData() {
        this("", "", "");
    }

    public BlipData(String str, String str2, String str3) {
        this.path = str;
        this.tos = str2;
        this.blip = str3;
    }
}
