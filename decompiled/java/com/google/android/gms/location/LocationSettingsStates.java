package com.google.android.gms.location;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationSettingsStates;

/* JADX INFO: loaded from: classes31.dex */
public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new Parcelable.Creator<LocationSettingsStates>() { // from class: X.12jo
        @Override // android.os.Parcelable.Creator
        public final LocationSettingsStates createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            boolean zLJIILIIL = false;
            boolean zLJIILIIL2 = false;
            boolean zLJIILIIL3 = false;
            boolean zLJIILIIL4 = false;
            boolean zLJIILIIL5 = false;
            boolean zLJIILIIL6 = false;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 1:
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case 2:
                        zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case 3:
                        zLJIILIIL3 = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case 4:
                        zLJIILIIL4 = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case 5:
                        zLJIILIIL5 = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case 6:
                        zLJIILIIL6 = C0W6J.LJIILIIL(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new LocationSettingsStates(zLJIILIIL, zLJIILIIL2, zLJIILIIL3, zLJIILIIL4, zLJIILIIL5, zLJIILIIL6);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LocationSettingsStates[] newArray(int i) {
            return new LocationSettingsStates[i];
        }
    };
    public final boolean zza;
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;
    public final boolean zze;
    public final boolean zzf;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LIZ(parcel, 1, this.zza);
        C817940W6u.LIZ(parcel, 2, this.zzb);
        C817940W6u.LIZ(parcel, 3, this.zzc);
        C817940W6u.LIZ(parcel, 4, this.zzd);
        C817940W6u.LIZ(parcel, 5, this.zze);
        C817940W6u.LIZ(parcel, 6, this.zzf);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public LocationSettingsStates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = z3;
        this.zzd = z4;
        this.zze = z5;
        this.zzf = z6;
    }
}
