package com.google.android.gms.maps.model;

import X.C0W3L;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaLink;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class StreetViewPanoramaLocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLocation> CREATOR = new Parcelable.Creator() { // from class: X.0WsI
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            StreetViewPanoramaLink[] streetViewPanoramaLinkArr = null;
            LatLng latLng = null;
            String strLJII = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            strLJII = C0W6J.LJII(i, parcel);
                        }
                    } else {
                        latLng = (LatLng) C0W6J.LJI(parcel, i, LatLng.CREATOR);
                    }
                } else {
                    streetViewPanoramaLinkArr = (StreetViewPanoramaLink[]) C0W6J.LJIIJ(parcel, i, StreetViewPanoramaLink.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new StreetViewPanoramaLocation(streetViewPanoramaLinkArr, latLng, strLJII);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new StreetViewPanoramaLocation[i];
        }
    };
    public final StreetViewPanoramaLink[] links;
    public final String panoId;
    public final LatLng position;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.position, this.panoId});
    }

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(this.panoId, "panoId");
        c0w3l.LIZ(this.position.toString(), "position");
        return c0w3l.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLocation)) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
        if (this.panoId.equals(streetViewPanoramaLocation.panoId) && this.position.equals(streetViewPanoramaLocation.position)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJJLI(parcel, 2, this.links, i);
        C817940W6u.LJIIZILJ(parcel, 3, this.position, i, false);
        C817940W6u.LJIJ(parcel, 4, this.panoId, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public StreetViewPanoramaLocation(StreetViewPanoramaLink[] streetViewPanoramaLinkArr, LatLng latLng, String str) {
        this.links = streetViewPanoramaLinkArr;
        this.position = latLng;
        this.panoId = str;
    }
}
