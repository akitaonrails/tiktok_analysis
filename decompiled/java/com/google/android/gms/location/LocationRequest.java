package com.google.android.gms.location;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import com.tts.oecverify.BdTuring;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new Parcelable.Creator<LocationRequest>() { // from class: X.0W3V
        @Override // android.os.Parcelable.Creator
        public final LocationRequest createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 102;
            long jLJJ = 3600000;
            long jLJJ2 = 600000;
            boolean zLJIILIIL = false;
            boolean zLJIILIIL2 = false;
            long jLJJ3 = Long.MAX_VALUE;
            int iLJIJJLI2 = Integer.MAX_VALUE;
            float fLJIJ = 0.0f;
            long jLJJ4 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 1:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 2:
                        jLJJ = C0W6J.LJJ(i, parcel);
                        break;
                    case 3:
                        jLJJ2 = C0W6J.LJJ(i, parcel);
                        break;
                    case 4:
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case 5:
                        jLJJ3 = C0W6J.LJJ(i, parcel);
                        break;
                    case 6:
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 7:
                        fLJIJ = C0W6J.LJIJ(i, parcel);
                        break;
                    case '\b':
                        jLJJ4 = C0W6J.LJJ(i, parcel);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new LocationRequest(iLJIJJLI, jLJJ, jLJJ2, zLJIILIIL, jLJJ3, iLJIJJLI2, fLJIJ, jLJJ4, zLJIILIIL2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LocationRequest[] newArray(int i) {
            return new LocationRequest[i];
        }
    };
    public final long LL;
    public int zza;
    public long zzb;
    public long zzc;
    public boolean zzd;
    public long zze;
    public int zzf;
    public float zzg;
    public boolean zzi;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Long.valueOf(this.zzb), Float.valueOf(this.zzg), Long.valueOf(this.LL)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request[");
        int i = this.zza;
        sb.append(i != 100 ? i != 102 ? i != 104 ? i != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.zza != 105) {
            sb.append(" requested=");
            sb.append(this.zzb);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.zzc);
        sb.append("ms");
        if (this.LL > this.zzb) {
            sb.append(" maxWait=");
            sb.append(this.LL);
            sb.append("ms");
        }
        if (this.zzg > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.zzg);
            sb.append("m");
        }
        long j = this.zze;
        if (j != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j - jElapsedRealtime);
            sb.append("ms");
        }
        if (this.zzf != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.zzf);
        }
        sb.append(']');
        return sb.toString();
    }

    public LocationRequest() {
        this.zza = 102;
        this.zzb = 3600000L;
        this.zzc = 600000L;
        this.zze = Long.MAX_VALUE;
        this.zzf = Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.zza == locationRequest.zza) {
                long j = this.zzb;
                long j2 = locationRequest.zzb;
                if (j == j2 && this.zzc == locationRequest.zzc && this.zzd == locationRequest.zzd && this.zze == locationRequest.zze && this.zzf == locationRequest.zzf && this.zzg == locationRequest.zzg) {
                    long j3 = this.LL;
                    if (j3 >= j) {
                        j = j3;
                    }
                    long j4 = locationRequest.LL;
                    if (j4 >= j2) {
                        j2 = j4;
                    }
                    if (j == j2 && this.zzi == locationRequest.zzi) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.zza);
        C817940W6u.LJIILJJIL(2, this.zzb, parcel);
        C817940W6u.LJIILJJIL(3, this.zzc, parcel);
        C817940W6u.LIZ(parcel, 4, this.zzd);
        C817940W6u.LJIILJJIL(5, this.zze, parcel);
        C817940W6u.LJIIJ(parcel, 6, this.zzf);
        C817940W6u.LJII(parcel, 7, this.zzg);
        C817940W6u.LJIILJJIL(8, this.LL, parcel);
        C817940W6u.LIZ(parcel, 9, this.zzi);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4, boolean z2) {
        this.zza = i;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = z;
        this.zze = j3;
        this.zzf = i2;
        this.zzg = f;
        this.LL = j4;
        this.zzi = z2;
    }
}
