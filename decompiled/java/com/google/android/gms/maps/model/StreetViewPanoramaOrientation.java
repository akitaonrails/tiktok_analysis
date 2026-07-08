package com.google.android.gms.maps.model;

import X.C0W3J;
import X.C0W3L;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class StreetViewPanoramaOrientation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOrientation> CREATOR = new Parcelable.Creator() { // from class: X.0Wsi
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            float fLJIJ = 0.0f;
            float fLJIJ2 = 0.0f;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        fLJIJ2 = C0W6J.LJIJ(i, parcel);
                    }
                } else {
                    fLJIJ = C0W6J.LJIJ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new StreetViewPanoramaOrientation(fLJIJ, fLJIJ2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new StreetViewPanoramaOrientation[i];
        }
    };
    public final float bearing;
    public final float tilt;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.tilt), Float.valueOf(this.bearing)});
    }

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(Float.valueOf(this.tilt), "tilt");
        c0w3l.LIZ(Float.valueOf(this.bearing), "bearing");
        return c0w3l.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        if (Float.floatToIntBits(this.tilt) == Float.floatToIntBits(streetViewPanoramaOrientation.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaOrientation.bearing)) {
            return true;
        }
        return false;
    }

    public StreetViewPanoramaOrientation(float f, float f2) {
        boolean z = false;
        if (f >= -90.0f && f <= 90.0f) {
            z = true;
        }
        C0W3J.LIZ("Tilt needs to be between -90 and 90 inclusive: " + f, z);
        this.tilt = f + 0.0f;
        this.bearing = (((double) f2) <= 0.0d ? (f2 % 360.0f) + 360.0f : f2) % 360.0f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJII(parcel, 2, this.tilt);
        C817940W6u.LJII(parcel, 3, this.bearing);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
