package com.google.android.gms.location;

import X.C817940W6u;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationResult;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes31.dex */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public final List<Location> zzb;
    public static final List<Location> LL = Collections.emptyList();
    public static final Parcelable.Creator<LocationResult> CREATOR = new Parcelable.Creator<LocationResult>() { // from class: X.12lI
        @Override // android.os.Parcelable.Creator
        public final LocationResult createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            List<Location> listLJIIJJI = LocationResult.LL;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 1) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    listLJIIJJI = C0W6J.LJIIJJI(parcel, i, Location.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new LocationResult(listLJIIJJI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LocationResult[] newArray(int i) {
            return new LocationResult[i];
        }
    };

    public final int hashCode() {
        Iterator<Location> it2 = this.zzb.iterator();
        int i = 17;
        while (it2.hasNext()) {
            long time = it2.next().getTime();
            i = (i * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(strValueOf);
        sb.append(e3.f);
        return sb.toString();
    }

    public LocationResult(List<Location> list) {
        this.zzb = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.zzb.size() != this.zzb.size()) {
            return false;
        }
        Iterator<Location> it2 = locationResult.zzb.iterator();
        Iterator<Location> it3 = this.zzb.iterator();
        while (it2.hasNext()) {
            if (it3.next().getTime() != it2.next().getTime()) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIL(parcel, 1, this.zzb, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
