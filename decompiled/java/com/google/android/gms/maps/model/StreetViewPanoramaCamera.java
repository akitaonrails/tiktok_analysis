package com.google.android.gms.maps.model;

import X.C0W3J;
import X.C0W3L;
import X.C817940W6u;
import X.C837150Wsj;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new Parcelable.Creator() { // from class: X.0Wsh
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            float fLJIJ = 0.0f;
            float fLJIJ2 = 0.0f;
            float fLJIJ3 = 0.0f;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            fLJIJ3 = C0W6J.LJIJ(i, parcel);
                        }
                    } else {
                        fLJIJ2 = C0W6J.LJIJ(i, parcel);
                    }
                } else {
                    fLJIJ = C0W6J.LJIJ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new StreetViewPanoramaCamera(fLJIJ, fLJIJ2, fLJIJ3);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new StreetViewPanoramaCamera[i];
        }
    };
    public final float bearing;
    public final float tilt;
    public final float zoom;
    public final StreetViewPanoramaOrientation zza;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing)});
    }

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(Float.valueOf(this.zoom), "zoom");
        c0w3l.LIZ(Float.valueOf(this.tilt), "tilt");
        c0w3l.LIZ(Float.valueOf(this.bearing), "bearing");
        return c0w3l.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        if (Float.floatToIntBits(this.zoom) == Float.floatToIntBits(streetViewPanoramaCamera.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(streetViewPanoramaCamera.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaCamera.bearing)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJII(parcel, 2, this.zoom);
        C817940W6u.LJII(parcel, 3, this.tilt);
        C817940W6u.LJII(parcel, 4, this.bearing);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public StreetViewPanoramaCamera(float f, float f2, float f3) {
        float f4;
        boolean z = false;
        if (f2 >= -90.0f && f2 <= 90.0f) {
            z = true;
        }
        C0W3J.LIZ("Tilt needs to be between -90 and 90 inclusive: " + f2, z);
        this.zoom = ((double) f) <= 0.0d ? 0.0f : f;
        this.tilt = 0.0f + f2;
        if (f3 <= 0.0d) {
            f4 = (f3 % 360.0f) + 360.0f;
        } else {
            f4 = f3;
        }
        this.bearing = f4 % 360.0f;
        C837150Wsj c837150Wsj = new C837150Wsj();
        c837150Wsj.LIZIZ = f2;
        c837150Wsj.LIZ = f3;
        this.zza = new StreetViewPanoramaOrientation(c837150Wsj.LIZIZ, c837150Wsj.LIZ);
    }
}
