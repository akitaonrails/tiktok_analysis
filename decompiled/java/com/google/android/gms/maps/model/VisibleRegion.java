package com.google.android.gms.maps.model;

import X.C0W3L;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class VisibleRegion extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VisibleRegion> CREATOR = new Parcelable.Creator() { // from class: X.0Wso
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            LatLng latLng = null;
            LatLng latLng2 = null;
            LatLng latLng3 = null;
            LatLng latLng4 = null;
            LatLngBounds latLngBounds = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                if (c != 6) {
                                    C0W6J.LJJII(i, parcel);
                                } else {
                                    latLngBounds = (LatLngBounds) C0W6J.LJI(parcel, i, LatLngBounds.CREATOR);
                                }
                            } else {
                                latLng4 = (LatLng) C0W6J.LJI(parcel, i, LatLng.CREATOR);
                            }
                        } else {
                            latLng3 = (LatLng) C0W6J.LJI(parcel, i, LatLng.CREATOR);
                        }
                    } else {
                        latLng2 = (LatLng) C0W6J.LJI(parcel, i, LatLng.CREATOR);
                    }
                } else {
                    latLng = (LatLng) C0W6J.LJI(parcel, i, LatLng.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new VisibleRegion(latLng, latLng2, latLng3, latLng4, latLngBounds);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new VisibleRegion[i];
        }
    };
    public final LatLng farLeft;
    public final LatLng farRight;
    public final LatLngBounds latLngBounds;
    public final LatLng nearLeft;
    public final LatLng nearRight;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.nearLeft, this.nearRight, this.farLeft, this.farRight, this.latLngBounds});
    }

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(this.nearLeft, "nearLeft");
        c0w3l.LIZ(this.nearRight, "nearRight");
        c0w3l.LIZ(this.farLeft, "farLeft");
        c0w3l.LIZ(this.farRight, "farRight");
        c0w3l.LIZ(this.latLngBounds, "latLngBounds");
        return c0w3l.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        if (this.nearLeft.equals(visibleRegion.nearLeft) && this.nearRight.equals(visibleRegion.nearRight) && this.farLeft.equals(visibleRegion.farLeft) && this.farRight.equals(visibleRegion.farRight) && this.latLngBounds.equals(visibleRegion.latLngBounds)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 2, this.nearLeft, i, false);
        C817940W6u.LJIIZILJ(parcel, 3, this.nearRight, i, false);
        C817940W6u.LJIIZILJ(parcel, 4, this.farLeft, i, false);
        C817940W6u.LJIIZILJ(parcel, 5, this.farRight, i, false);
        C817940W6u.LJIIZILJ(parcel, 6, this.latLngBounds, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public VisibleRegion(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.nearLeft = latLng;
        this.nearRight = latLng2;
        this.farLeft = latLng3;
        this.farRight = latLng4;
        this.latLngBounds = latLngBounds;
    }
}
