package com.ss.android.vesdk;

import X.C1864730ycp;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes28.dex */
public class VESize implements Parcelable {
    public static final Parcelable.Creator<VESize> CREATOR = new C1864730ycp(17);
    public int height;
    public int width;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isValid() {
        return this.width > 0 && this.height > 0;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.width);
        sbLIZ.append("*");
        sbLIZ.append(this.height);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VESize(Parcel parcel) {
        this.width = 720;
        this.height = 1280;
        this.width = parcel.readInt();
        this.height = parcel.readInt();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof VESize)) {
            return false;
        }
        VESize vESize = (VESize) obj;
        if (this.width != vESize.width || this.height != vESize.height) {
            return false;
        }
        return true;
    }

    public VESize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }
}
