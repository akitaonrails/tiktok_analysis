package com.google.android.gms.maps.model;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes14.dex */
public final class LatLng extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new Parcelable.Creator() { // from class: X.0WsH
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            double dLJIILLIIL = 0.0d;
            double dLJIILLIIL2 = 0.0d;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        dLJIILLIIL2 = C0W6J.LJIILLIIL(i, parcel);
                    }
                } else {
                    dLJIILLIIL = C0W6J.LJIILLIIL(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new LatLng(dLJIILLIIL, dLJIILLIIL2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new LatLng[i];
        }
    };
    public final double latitude;
    public final double longitude;

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.latitude);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        return ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        return "lat/lng: (" + this.latitude + "," + this.longitude + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        if (Double.doubleToLongBits(this.latitude) == Double.doubleToLongBits(latLng.latitude) && Double.doubleToLongBits(this.longitude) == Double.doubleToLongBits(latLng.longitude)) {
            return true;
        }
        return false;
    }

    public LatLng(double d, double d2) {
        if (d2 >= -180.0d && d2 < 180.0d) {
            this.longitude = d2;
        } else {
            this.longitude = ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        }
        this.latitude = Math.max(-90.0d, Math.min(90.0d, d));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJFF(parcel, 2, this.latitude);
        C817940W6u.LJFF(parcel, 3, this.longitude);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
