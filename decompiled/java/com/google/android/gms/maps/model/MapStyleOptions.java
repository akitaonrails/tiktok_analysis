package com.google.android.gms.maps.model;

import X.C0W3J;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.MapStyleOptions;

/* JADX INFO: loaded from: classes31.dex */
public final class MapStyleOptions extends AbstractSafeParcelable {
    public String zzb;
    public static final String zza = "MapStyleOptions";
    public static final Parcelable.Creator<MapStyleOptions> CREATOR = new Parcelable.Creator() { // from class: X.12lF
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 2) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new MapStyleOptions(strLJII);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new MapStyleOptions[i];
        }
    };

    public MapStyleOptions(String str) {
        C0W3J.LJIIIZ(str, "json must not be null");
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 2, this.zzb, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
