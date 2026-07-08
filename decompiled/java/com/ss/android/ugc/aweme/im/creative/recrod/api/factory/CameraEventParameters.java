package com.ss.android.ugc.aweme.im.creative.recrod.api.factory;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.creative.recrod.api.factory.CameraEventParameters;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class CameraEventParameters implements Parcelable {
    public static final Parcelable.Creator<CameraEventParameters> CREATOR = new Parcelable.Creator<CameraEventParameters>() { // from class: X.18m0
        @Override // android.os.Parcelable.Creator
        public final CameraEventParameters createFromParcel(Parcel parcel) {
            return new CameraEventParameters(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CameraEventParameters[] newArray(int i) {
            return new CameraEventParameters[i];
        }
    };
    public final String enterFrom;
    public final String enterMethod;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraEventParameters)) {
            return false;
        }
        CameraEventParameters cameraEventParameters = (CameraEventParameters) obj;
        return Intrinsics.LJFF(this.enterFrom, cameraEventParameters.enterFrom) && Intrinsics.LJFF(this.enterMethod, cameraEventParameters.enterMethod);
    }

    public final int hashCode() {
        return (this.enterFrom.hashCode() * 31) + this.enterMethod.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameraEventParameters(enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.enterMethod);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.enterMethod);
    }

    public CameraEventParameters() {
        this("", "");
    }

    public CameraEventParameters(String str, String str2) {
        this.enterFrom = str;
        this.enterMethod = str2;
    }
}
