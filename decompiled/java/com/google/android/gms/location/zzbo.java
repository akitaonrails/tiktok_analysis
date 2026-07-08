package com.google.android.gms.location;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzbo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class zzbo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbo> CREATOR = new Parcelable.Creator<zzbo>() { // from class: X.0W0a
        @Override // android.os.Parcelable.Creator
        public final zzbo createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 1;
            int iLJIJJLI2 = 1;
            long jLJJ = -1;
            long jLJJ2 = -1;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                jLJJ2 = C0W6J.LJJ(i, parcel);
                            }
                        } else {
                            jLJJ = C0W6J.LJJ(i, parcel);
                        }
                    } else {
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzbo(iLJIJJLI, iLJIJJLI2, jLJJ, jLJJ2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ zzbo[] newArray(int i) {
            return new zzbo[i];
        }
    };
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), Integer.valueOf(this.zza), Long.valueOf(this.zzd), Long.valueOf(this.zzc)});
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.zza + " Cell status: " + this.zzb + " elapsed time NS: " + this.zzd + " system time ms: " + this.zzc;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbo) {
            zzbo zzboVar = (zzbo) obj;
            if (this.zza == zzboVar.zza && this.zzb == zzboVar.zzb && this.zzc == zzboVar.zzc && this.zzd == zzboVar.zzd) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.zza);
        C817940W6u.LJIIJ(parcel, 2, this.zzb);
        C817940W6u.LJIILJJIL(3, this.zzc, parcel);
        C817940W6u.LJIILJJIL(4, this.zzd, parcel);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzbo(int i, int i2, long j, long j2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = j;
        this.zzd = j2;
    }
}
