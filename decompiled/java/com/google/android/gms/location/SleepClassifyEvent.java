package com.google.android.gms.location;

import X.C0W3J;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.SleepClassifyEvent;
import com.tts.oecverify.BdTuring;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class SleepClassifyEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepClassifyEvent> CREATOR = new Parcelable.Creator<SleepClassifyEvent>() { // from class: X.0W0N
        @Override // android.os.Parcelable.Creator
        public final SleepClassifyEvent createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            int iLJIJJLI2 = 0;
            int iLJIJJLI3 = 0;
            int iLJIJJLI4 = 0;
            int iLJIJJLI5 = 0;
            int iLJIJJLI6 = 0;
            int iLJIJJLI7 = 0;
            int iLJIJJLI8 = 0;
            boolean zLJIILIIL = false;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 1:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 2:
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 3:
                        iLJIJJLI3 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 4:
                        iLJIJJLI4 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 5:
                        iLJIJJLI5 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 6:
                        iLJIJJLI6 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 7:
                        iLJIJJLI7 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case '\b':
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        iLJIJJLI8 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new SleepClassifyEvent(iLJIJJLI, iLJIJJLI2, iLJIJJLI3, iLJIJJLI4, iLJIJJLI5, iLJIJJLI6, iLJIJJLI7, iLJIJJLI8, zLJIILIIL);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SleepClassifyEvent[] newArray(int i) {
            return new SleepClassifyEvent[i];
        }
    };
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final boolean zzh;
    public final int zzi;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzb)});
    }

    public final String toString() {
        int i = this.zza;
        int i2 = this.zzb;
        int i3 = this.zzc;
        int i4 = this.zzd;
        StringBuilder sb = new StringBuilder(65);
        sb.append(i);
        sb.append(" Conf:");
        sb.append(i2);
        sb.append(" Motion:");
        sb.append(i3);
        sb.append(" Light:");
        sb.append(i4);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepClassifyEvent)) {
            return false;
        }
        SleepClassifyEvent sleepClassifyEvent = (SleepClassifyEvent) obj;
        if (this.zza == sleepClassifyEvent.zza && this.zzb == sleepClassifyEvent.zzb) {
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
        C817940W6u.LJIIJ(parcel, 5, this.zze);
        C817940W6u.LJIIJ(parcel, 6, this.zzf);
        C817940W6u.LJIIJ(parcel, 7, this.zzg);
        C817940W6u.LIZ(parcel, 8, this.zzh);
        C817940W6u.LJIIJ(parcel, 9, this.zzi);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public SleepClassifyEvent(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = i6;
        this.zzg = i7;
        this.zzh = z;
        this.zzi = i8;
    }
}
