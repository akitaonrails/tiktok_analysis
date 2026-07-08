package com.google.android.gms.maps.model;

import X.C0W3L;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.StreetViewPanoramaLink;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class StreetViewPanoramaLink extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLink> CREATOR = new Parcelable.Creator() { // from class: X.0WsJ
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            float fLJIJ = 0.0f;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        fLJIJ = C0W6J.LJIJ(i, parcel);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new StreetViewPanoramaLink(strLJII, fLJIJ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new StreetViewPanoramaLink[i];
        }
    };
    public final float bearing;
    public final String panoId;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.panoId, Float.valueOf(this.bearing)});
    }

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(this.panoId, "panoId");
        c0w3l.LIZ(Float.valueOf(this.bearing), "bearing");
        return c0w3l.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        if (this.panoId.equals(streetViewPanoramaLink.panoId) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaLink.bearing)) {
            return true;
        }
        return false;
    }

    public StreetViewPanoramaLink(String str, float f) {
        this.panoId = str;
        this.bearing = (((double) f) <= 0.0d ? (f % 360.0f) + 360.0f : f) % 360.0f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 2, this.panoId, false);
        C817940W6u.LJII(parcel, 3, this.bearing);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
