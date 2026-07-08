package com.google.android.gms.internal.measurement;

import X.C817940W6u;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.zzdl;

/* JADX INFO: loaded from: classes14.dex */
public final class zzdl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdl> CREATOR = new Parcelable.Creator<zzdl>() { // from class: X.0WH3
        @Override // android.os.Parcelable.Creator
        public final zzdl createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            long jLJJ = 0;
            long jLJJ2 = 0;
            boolean zLJIILIIL = false;
            String strLJII2 = null;
            String strLJII3 = null;
            Bundle bundleLIZIZ = null;
            String strLJII4 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 1:
                        jLJJ = C0W6J.LJJ(i, parcel);
                        break;
                    case 2:
                        jLJJ2 = C0W6J.LJJ(i, parcel);
                        break;
                    case 3:
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case 4:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 5:
                        strLJII2 = C0W6J.LJII(i, parcel);
                        break;
                    case 6:
                        strLJII3 = C0W6J.LJII(i, parcel);
                        break;
                    case 7:
                        bundleLIZIZ = C0W6J.LIZIZ(i, parcel);
                        break;
                    case '\b':
                        strLJII4 = C0W6J.LJII(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzdl(jLJJ, jLJJ2, zLJIILIIL, strLJII, strLJII2, strLJII3, bundleLIZIZ, strLJII4);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ zzdl[] newArray(int i) {
            return new zzdl[i];
        }
    };
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final Bundle zzg;
    public final String zzh;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIILJJIL(1, this.zza, parcel);
        C817940W6u.LJIILJJIL(2, this.zzb, parcel);
        C817940W6u.LIZ(parcel, 3, this.zzc);
        C817940W6u.LJIJ(parcel, 4, this.zzd, false);
        C817940W6u.LJIJ(parcel, 5, this.zze, false);
        C817940W6u.LJIJ(parcel, 6, this.zzf, false);
        C817940W6u.LIZJ(parcel, 7, this.zzg);
        C817940W6u.LJIJ(parcel, 8, this.zzh, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzdl(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = z;
        this.zzd = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = bundle;
        this.zzh = str4;
    }
}
