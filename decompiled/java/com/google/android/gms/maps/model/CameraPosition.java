package com.google.android.gms.maps.model;

import X.C0W3J;
import X.C0W3L;
import X.C786410Ut5;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new Parcelable.Creator() { // from class: X.0Wsg
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            LatLng latLng = null;
            float fLJIJ = 0.0f;
            float fLJIJ2 = 0.0f;
            float fLJIJ3 = 0.0f;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
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
                } else {
                    latLng = (LatLng) C0W6J.LJI(parcel, i, LatLng.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new CameraPosition(latLng, fLJIJ, fLJIJ2, fLJIJ3);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new CameraPosition[i];
        }
    };
    public final float bearing;
    public final LatLng target;
    public final float tilt;
    public final float zoom;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.target, Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing)});
    }

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(this.target, "target");
        c0w3l.LIZ(Float.valueOf(this.zoom), "zoom");
        c0w3l.LIZ(Float.valueOf(this.tilt), "tilt");
        c0w3l.LIZ(Float.valueOf(this.bearing), "bearing");
        return c0w3l.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        if (this.target.equals(cameraPosition.target) && Float.floatToIntBits(this.zoom) == Float.floatToIntBits(cameraPosition.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(cameraPosition.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(cameraPosition.bearing)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 2, this.target, i, false);
        C817940W6u.LJII(parcel, 3, this.zoom);
        C817940W6u.LJII(parcel, 4, this.tilt);
        C817940W6u.LJII(parcel, 5, this.bearing);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        boolean z;
        C0W3J.LJIIIZ(latLng, "camera target must not be null.");
        if (f2 >= 0.0f && f2 <= 90.0f) {
            z = true;
        } else {
            z = false;
        }
        Object[] objArr = {Float.valueOf(f2)};
        if (z) {
            this.target = latLng;
            this.zoom = f;
            this.tilt = f2 + 0.0f;
            this.bearing = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
            return;
        }
        throw new IllegalArgumentException(C786410Ut5.j4("Tilt needs to be between 0 and 90 inclusive: %s", objArr));
    }
}
