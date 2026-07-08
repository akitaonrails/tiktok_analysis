package com.google.android.gms.measurement.internal;

import X.C0W3J;
import X.C19784112at;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzno;

/* JADX INFO: loaded from: classes31.dex */
public final class zzno extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzno> CREATOR = new Parcelable.Creator<zzno>() { // from class: X.0W6q
        @Override // android.os.Parcelable.Creator
        public final zzno createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            int iLJIJJLI = 0;
            Long lLJJI = null;
            Float fLJIJI = null;
            String strLJII2 = null;
            String strLJII3 = null;
            Double dLJIIZILJ = null;
            long jLJJ = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 1:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 2:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 3:
                        jLJJ = C0W6J.LJJ(i, parcel);
                        break;
                    case 4:
                        lLJJI = C0W6J.LJJI(i, parcel);
                        break;
                    case 5:
                        fLJIJI = C0W6J.LJIJI(i, parcel);
                        break;
                    case 6:
                        strLJII2 = C0W6J.LJII(i, parcel);
                        break;
                    case 7:
                        strLJII3 = C0W6J.LJII(i, parcel);
                        break;
                    case '\b':
                        dLJIIZILJ = C0W6J.LJIIZILJ(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzno(iLJIJJLI, strLJII, jLJJ, lLJJI, fLJIJI, strLJII2, strLJII3, dLJIIZILJ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ zzno[] newArray(int i) {
            return new zzno[i];
        }
    };
    public final String zza;
    public final long zzb;
    public final Long zzc;
    public final String zzd;
    public final String zze;
    public final Double zzf;
    public final int zzg;

    public final Object zza() {
        Long l = this.zzc;
        if (l != null) {
            return l;
        }
        Double d = this.zzf;
        if (d != null) {
            return d;
        }
        String str = this.zzd;
        if (str != null) {
            return str;
        }
        return null;
    }

    public zzno(C19784112at c19784112at) {
        this(c19784112at.LIZLLL, c19784112at.LJ, c19784112at.LIZJ, c19784112at.LIZIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.zzg);
        C817940W6u.LJIJ(parcel, 2, this.zza, false);
        C817940W6u.LJIILJJIL(3, this.zzb, parcel);
        C817940W6u.LJIILLIIL(parcel, 4, this.zzc);
        C817940W6u.LJIJ(parcel, 6, this.zzd, false);
        C817940W6u.LJIJ(parcel, 7, this.zze, false);
        C817940W6u.LJI(parcel, 8, this.zzf);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzno(long j, Object obj, String str, String str2) {
        C0W3J.LJI(str);
        this.zzg = 2;
        this.zza = str;
        this.zzb = j;
        this.zze = str2;
        if (obj == null) {
            this.zzc = null;
            this.zzf = null;
            this.zzd = null;
            return;
        }
        if (obj instanceof Long) {
            this.zzc = (Long) obj;
            this.zzf = null;
            this.zzd = null;
        } else if (obj instanceof String) {
            this.zzc = null;
            this.zzf = null;
            this.zzd = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.zzc = null;
                this.zzf = (Double) obj;
                this.zzd = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public zzno(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        Double dValueOf;
        this.zzg = i;
        this.zza = str;
        this.zzb = j;
        this.zzc = l;
        if (i == 1) {
            if (f != null) {
                dValueOf = Double.valueOf(f.doubleValue());
            } else {
                dValueOf = null;
            }
            this.zzf = dValueOf;
        } else {
            this.zzf = d;
        }
        this.zzd = str2;
        this.zze = str3;
    }
}
