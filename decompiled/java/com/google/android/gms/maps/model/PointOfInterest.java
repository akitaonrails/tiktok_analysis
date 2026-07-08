package com.google.android.gms.maps.model;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PointOfInterest;

/* JADX INFO: loaded from: classes14.dex */
public final class PointOfInterest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PointOfInterest> CREATOR = new Parcelable.Creator() { // from class: X.0Wsp
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            LatLng latLng = null;
            String strLJII = null;
            String strLJII2 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            strLJII2 = C0W6J.LJII(i, parcel);
                        }
                    } else {
                        strLJII = C0W6J.LJII(i, parcel);
                    }
                } else {
                    latLng = (LatLng) C0W6J.LJI(parcel, i, LatLng.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new PointOfInterest(latLng, strLJII, strLJII2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new PointOfInterest[i];
        }
    };
    public final LatLng latLng;
    public final String name;
    public final String placeId;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 2, this.latLng, i, false);
        C817940W6u.LJIJ(parcel, 3, this.placeId, false);
        C817940W6u.LJIJ(parcel, 4, this.name, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public PointOfInterest(LatLng latLng, String str, String str2) {
        this.latLng = latLng;
        this.placeId = str;
        this.name = str2;
    }
}
