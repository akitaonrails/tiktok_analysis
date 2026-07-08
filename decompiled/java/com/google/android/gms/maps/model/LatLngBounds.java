package com.google.android.gms.maps.model;

import X.C0W3J;
import X.C0W3L;
import X.C786410Ut5;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new Parcelable.Creator() { // from class: X.0Wsn
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            LatLng latLng = null;
            LatLng latLng2 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        latLng2 = (LatLng) C0W6J.LJI(parcel, i, LatLng.CREATOR);
                    }
                } else {
                    latLng = (LatLng) C0W6J.LJI(parcel, i, LatLng.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new LatLngBounds(latLng, latLng2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new LatLngBounds[i];
        }
    };
    public final LatLng northeast;
    public final LatLng southwest;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.southwest, this.northeast});
    }

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(this.southwest, "southwest");
        c0w3l.LIZ(this.northeast, "northeast");
        return c0w3l.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        if (this.southwest.equals(latLngBounds.southwest) && this.northeast.equals(latLngBounds.northeast)) {
            return true;
        }
        return false;
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        boolean z;
        C0W3J.LJIIIZ(latLng, "southwest must not be null.");
        C0W3J.LJIIIZ(latLng2, "northeast must not be null.");
        double d = latLng2.latitude;
        double d2 = latLng.latitude;
        if (d >= d2) {
            z = true;
        } else {
            z = false;
        }
        Object[] objArr = {Double.valueOf(d2), Double.valueOf(latLng2.latitude)};
        if (z) {
            this.southwest = latLng;
            this.northeast = latLng2;
            return;
        }
        throw new IllegalArgumentException(C786410Ut5.j4("southern latitude exceeds northern latitude (%s > %s)", objArr));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 2, this.southwest, i, false);
        C817940W6u.LJIIZILJ(parcel, 3, this.northeast, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
