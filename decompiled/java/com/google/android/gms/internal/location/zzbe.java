package com.google.android.gms.internal.location;

import X.C786410Ut5;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzbe;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.tts.oecverify.BdTuring;
import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
public final class zzbe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbe> CREATOR = new Parcelable.Creator<zzbe>() { // from class: X.0W45
        @Override // android.os.Parcelable.Creator
        public final zzbe createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            int iLJIJJLI = 0;
            short s = 0;
            int iLJIJJLI2 = 0;
            double dLJIILLIIL = 0.0d;
            double dLJIILLIIL2 = 0.0d;
            float fLJIJ = 0.0f;
            long jLJJ = 0;
            int iLJIJJLI3 = -1;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 1:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 2:
                        jLJJ = C0W6J.LJJ(i, parcel);
                        break;
                    case 3:
                        C0W6J.LJJIIJZLJL(parcel, i, 4);
                        s = (short) parcel.readInt();
                        break;
                    case 4:
                        dLJIILLIIL = C0W6J.LJIILLIIL(i, parcel);
                        break;
                    case 5:
                        dLJIILLIIL2 = C0W6J.LJIILLIIL(i, parcel);
                        break;
                    case 6:
                        fLJIJ = C0W6J.LJIJ(i, parcel);
                        break;
                    case 7:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case '\b':
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        iLJIJJLI3 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzbe(strLJII, iLJIJJLI, s, dLJIILLIIL, dLJIILLIIL2, fLJIJ, jLJJ, iLJIJJLI2, iLJIJJLI3);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ zzbe[] newArray(int i) {
            return new zzbe[i];
        }
    };
    public final String zza;
    public final long zzb;
    public final short zzc;
    public final double zzd;
    public final double zze;
    public final float zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.zzd);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.zze);
        return ((((((((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.zzf)) * 31) + this.zzc) * 31) + this.zzg;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        short s = this.zzc;
        objArr[0] = s != -1 ? s != 1 ? "UNKNOWN" : "CIRCLE" : "INVALID";
        objArr[1] = this.zza.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.zzg);
        objArr[3] = Double.valueOf(this.zzd);
        objArr[4] = Double.valueOf(this.zze);
        objArr[5] = Float.valueOf(this.zzf);
        objArr[6] = Integer.valueOf(this.zzh / LSPassThroughRecordSizeConfig.DEFAULT);
        objArr[7] = Integer.valueOf(this.zzi);
        objArr[8] = Long.valueOf(this.zzb);
        return C786410Ut5.k4(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbe) {
            zzbe zzbeVar = (zzbe) obj;
            if (this.zzf == zzbeVar.zzf && this.zzd == zzbeVar.zzd && this.zze == zzbeVar.zze && this.zzc == zzbeVar.zzc) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 1, this.zza, false);
        C817940W6u.LJIILJJIL(2, this.zzb, parcel);
        short s = this.zzc;
        parcel.writeInt(262147);
        parcel.writeInt(s);
        C817940W6u.LJFF(parcel, 4, this.zzd);
        C817940W6u.LJFF(parcel, 5, this.zze);
        C817940W6u.LJII(parcel, 6, this.zzf);
        C817940W6u.LJIIJ(parcel, 7, this.zzg);
        C817940W6u.LJIIJ(parcel, 8, this.zzh);
        C817940W6u.LJIIJ(parcel, 9, this.zzi);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzbe(String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        String str2;
        if (str != null && str.length() <= 100) {
            if (f > 0.0f) {
                if (d <= 90.0d && d >= -90.0d) {
                    if (d2 <= 180.0d && d2 >= -180.0d) {
                        int i4 = i & 7;
                        if (i4 != 0) {
                            this.zzc = s;
                            this.zza = str;
                            this.zzd = d;
                            this.zze = d2;
                            this.zzf = f;
                            this.zzb = j;
                            this.zzg = i4;
                            this.zzh = i2;
                            this.zzi = i3;
                            return;
                        }
                        StringBuilder sb = new StringBuilder(46);
                        sb.append("No supported transition specified: ");
                        sb.append(i);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    StringBuilder sb2 = new StringBuilder(43);
                    sb2.append("invalid longitude: ");
                    sb2.append(d2);
                    throw new IllegalArgumentException(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder(42);
                sb3.append("invalid latitude: ");
                sb3.append(d);
                throw new IllegalArgumentException(sb3.toString());
            }
            StringBuilder sb4 = new StringBuilder(31);
            sb4.append("invalid radius: ");
            sb4.append(f);
            throw new IllegalArgumentException(sb4.toString());
        }
        String strValueOf = String.valueOf(str);
        if (strValueOf.length() != 0) {
            str2 = "requestId is null or too long: ".concat(strValueOf);
        } else {
            str2 = new String("requestId is null or too long: ");
        }
        throw new IllegalArgumentException(str2);
    }
}
