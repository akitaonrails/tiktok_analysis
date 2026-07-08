package com.google.android.gms.location;

import X.C0W3J;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzbx;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class zzbx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbx> CREATOR = new Parcelable.Creator<zzbx>() { // from class: X.0WA2
        @Override // android.os.Parcelable.Creator
        public final zzbx createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            int iLJIJJLI2 = 0;
            int iLJIJJLI3 = 0;
            int iLJIJJLI4 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                iLJIJJLI4 = C0W6J.LJIJJLI(i, parcel);
                            }
                        } else {
                            iLJIJJLI3 = C0W6J.LJIJJLI(i, parcel);
                        }
                    } else {
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzbx(iLJIJJLI, iLJIJJLI2, iLJIJJLI3, iLJIJJLI4);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ zzbx[] newArray(int i) {
            return new zzbx[i];
        }
    };
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd)});
    }

    public final String toString() {
        int i = this.zza;
        int i2 = this.zzb;
        int i3 = this.zzc;
        int i4 = this.zzd;
        StringBuilder sb = new StringBuilder(117);
        sb.append("UserPreferredSleepWindow [startHour=");
        sb.append(i);
        sb.append(", startMinute=");
        sb.append(i2);
        sb.append(", endHour=");
        sb.append(i3);
        sb.append(", endMinute=");
        sb.append(i4);
        sb.append(']');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbx)) {
            return false;
        }
        zzbx zzbxVar = (zzbx) obj;
        if (this.zza == zzbxVar.zza && this.zzb == zzbxVar.zzb && this.zzc == zzbxVar.zzc && this.zzd == zzbxVar.zzd) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C0W3J.LJIIIIZZ(parcel);
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.zza);
        C817940W6u.LJIIJ(parcel, 2, this.zzb);
        C817940W6u.LJIIJ(parcel, 3, this.zzc);
        C817940W6u.LJIIJ(parcel, 4, this.zzd);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzbx(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (i >= 0 && i <= 23) {
            z = true;
        } else {
            z = false;
        }
        C0W3J.LJIIJ("Start hour must be in range [0, 23].", z);
        if (i2 >= 0 && i2 <= 59) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0W3J.LJIIJ("Start minute must be in range [0, 59].", z2);
        if (i3 >= 0 && i3 <= 23) {
            z3 = true;
        } else {
            z3 = false;
        }
        C0W3J.LJIIJ("End hour must be in range [0, 23].", z3);
        if (i4 >= 0 && i4 <= 59) {
            z4 = true;
        } else {
            z4 = false;
        }
        C0W3J.LJIIJ("End minute must be in range [0, 59].", z4);
        C0W3J.LJIIJ("Parameters can't be all 0.", ((i + i2) + i3) + i4 > 0);
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
    }
}
