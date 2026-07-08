package com.ss.android.ugc.aweme.im.creative.common.api.navigation;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.creative.common.api.navigation.TargetResolution;

/* JADX INFO: loaded from: classes23.dex */
public final class TargetResolution implements Parcelable {
    public static final Parcelable.Creator<TargetResolution> CREATOR = new Parcelable.Creator<TargetResolution>() { // from class: X.0ni3
        @Override // android.os.Parcelable.Creator
        public final TargetResolution createFromParcel(Parcel parcel) {
            return new TargetResolution(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final TargetResolution[] newArray(int i) {
            return new TargetResolution[i];
        }
    };
    public final int height;
    public final int width;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TargetResolution)) {
            return false;
        }
        TargetResolution targetResolution = (TargetResolution) obj;
        return this.width == targetResolution.width && this.height == targetResolution.height;
    }

    public final int hashCode() {
        return (this.width * 31) + this.height;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TargetResolution(width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }

    public TargetResolution(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
