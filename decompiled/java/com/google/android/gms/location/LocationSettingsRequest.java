package com.google.android.gms.location;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.zzbj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new Parcelable.Creator<LocationSettingsRequest>() { // from class: X.0W3a
        @Override // android.os.Parcelable.Creator
        public final LocationSettingsRequest createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            ArrayList arrayListLJIIJJI = null;
            boolean zLJIILIIL = false;
            boolean zLJIILIIL2 = false;
            zzbj zzbjVar = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 5) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                zzbjVar = (zzbj) C0W6J.LJI(parcel, i, zzbj.CREATOR);
                            }
                        } else {
                            zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                        }
                    } else {
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                    }
                } else {
                    arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, LocationRequest.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new LocationSettingsRequest(arrayListLJIIJJI, zLJIILIIL, zLJIILIIL2, zzbjVar);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LocationSettingsRequest[] newArray(int i) {
            return new LocationSettingsRequest[i];
        }
    };
    public final List<LocationRequest> zza;
    public final boolean zzb;
    public final boolean zzc;
    public zzbj zzd;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIL(parcel, 1, Collections.unmodifiableList(this.zza), false);
        C817940W6u.LIZ(parcel, 2, this.zzb);
        C817940W6u.LIZ(parcel, 3, this.zzc);
        C817940W6u.LJIIZILJ(parcel, 5, this.zzd, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public LocationSettingsRequest(List<LocationRequest> list, boolean z, boolean z2, zzbj zzbjVar) {
        this.zza = list;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = zzbjVar;
    }
}
