package com.google.android.gms.measurement.internal;

import X.C0W3J;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzba;
import com.google.android.gms.measurement.internal.zzbf;

/* JADX INFO: loaded from: classes31.dex */
public final class zzbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbf> CREATOR = new Parcelable.Creator<zzbf>() { // from class: X.12fh
        @Override // android.os.Parcelable.Creator
        public final zzbf createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            zzba zzbaVar = null;
            String strLJII2 = null;
            long jLJJ = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                jLJJ = C0W6J.LJJ(i, parcel);
                            }
                        } else {
                            strLJII2 = C0W6J.LJII(i, parcel);
                        }
                    } else {
                        zzbaVar = (zzba) C0W6J.LJI(parcel, i, zzba.CREATOR);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzbf(strLJII, zzbaVar, strLJII2, jLJJ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ zzbf[] newArray(int i) {
            return new zzbf[i];
        }
    };
    public final String zza;
    public final zzba zzb;
    public final String zzc;
    public final long zzd;

    public final String toString() {
        return "origin=" + this.zzc + ",name=" + this.zza + ",params=" + String.valueOf(this.zzb);
    }

    public zzbf(zzbf zzbfVar, long j) {
        C0W3J.LJIIIIZZ(zzbfVar);
        this.zza = zzbfVar.zza;
        this.zzb = zzbfVar.zzb;
        this.zzc = zzbfVar.zzc;
        this.zzd = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 2, this.zza, false);
        C817940W6u.LJIIZILJ(parcel, 3, this.zzb, i, false);
        C817940W6u.LJIJ(parcel, 4, this.zzc, false);
        C817940W6u.LJIILJJIL(5, this.zzd, parcel);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzbf(String str, zzba zzbaVar, String str2, long j) {
        this.zza = str;
        this.zzb = zzbaVar;
        this.zzc = str2;
        this.zzd = j;
    }
}
