package com.google.android.gms.location;

import X.C0W3J;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.SleepSegmentEvent;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class SleepSegmentEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepSegmentEvent> CREATOR = new Parcelable.Creator<SleepSegmentEvent>() { // from class: X.0W0E
        @Override // android.os.Parcelable.Creator
        public final SleepSegmentEvent createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            long jLJJ = 0;
            long jLJJ2 = 0;
            int iLJIJJLI = 0;
            int iLJIJJLI2 = 0;
            int iLJIJJLI3 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                if (c != 5) {
                                    C0W6J.LJJII(i, parcel);
                                } else {
                                    iLJIJJLI3 = C0W6J.LJIJJLI(i, parcel);
                                }
                            } else {
                                iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                            }
                        } else {
                            iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        }
                    } else {
                        jLJJ2 = C0W6J.LJJ(i, parcel);
                    }
                } else {
                    jLJJ = C0W6J.LJJ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new SleepSegmentEvent(jLJJ, jLJJ2, iLJIJJLI, iLJIJJLI2, iLJIJJLI3);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SleepSegmentEvent[] newArray(int i) {
            return new SleepSegmentEvent[i];
        }
    };
    public final long zza;
    public final long zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc)});
    }

    public final String toString() {
        long j = this.zza;
        long j2 = this.zzb;
        int i = this.zzc;
        StringBuilder sb = new StringBuilder(84);
        sb.append("startMillis=");
        sb.append(j);
        sb.append(", endMillis=");
        sb.append(j2);
        sb.append(", status=");
        sb.append(i);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SleepSegmentEvent) {
            SleepSegmentEvent sleepSegmentEvent = (SleepSegmentEvent) obj;
            if (this.zza == sleepSegmentEvent.zza && this.zzb == sleepSegmentEvent.zzb && this.zzc == sleepSegmentEvent.zzc && this.zzd == sleepSegmentEvent.zzd && this.zze == sleepSegmentEvent.zze) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C0W3J.LJIIIIZZ(parcel);
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIILJJIL(1, this.zza, parcel);
        C817940W6u.LJIILJJIL(2, this.zzb, parcel);
        C817940W6u.LJIIJ(parcel, 3, this.zzc);
        C817940W6u.LJIIJ(parcel, 4, this.zzd);
        C817940W6u.LJIIJ(parcel, 5, this.zze);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public SleepSegmentEvent(long j, long j2, int i, int i2, int i3) {
        boolean z;
        if (j <= j2) {
            z = true;
        } else {
            z = false;
        }
        C0W3J.LIZ("endTimeMillis must be greater than or equal to startTimeMillis", z);
        this.zza = j;
        this.zzb = j2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
    }
}
