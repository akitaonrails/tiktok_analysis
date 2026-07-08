package com.google.android.gms.location;

import X.C0W3J;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.ActivityTransitionEvent;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new Parcelable.Creator<ActivityTransitionEvent>() { // from class: X.0W3G
        @Override // android.os.Parcelable.Creator
        public final ActivityTransitionEvent createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            long jLJJ = 0;
            int iLJIJJLI2 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            C0W6J.LJJII(i, parcel);
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
            return new ActivityTransitionEvent(iLJIJJLI, iLJIJJLI2, jLJJ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ActivityTransitionEvent[] newArray(int i) {
            return new ActivityTransitionEvent[i];
        }
    };
    public final int zza;
    public final int zzb;
    public final long zzc;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Long.valueOf(this.zzc)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.zza;
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("ActivityType ");
        sb2.append(i);
        sb.append(sb2.toString());
        sb.append(" ");
        int i2 = this.zzb;
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("TransitionType ");
        sb3.append(i2);
        sb.append(sb3.toString());
        sb.append(" ");
        long j = this.zzc;
        StringBuilder sb4 = new StringBuilder(41);
        sb4.append("ElapsedRealTimeNanos ");
        sb4.append(j);
        sb.append(sb4.toString());
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        if (this.zza == activityTransitionEvent.zza && this.zzb == activityTransitionEvent.zzb && this.zzc == activityTransitionEvent.zzc) {
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
        C817940W6u.LJIILJJIL(3, this.zzc, parcel);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ActivityTransitionEvent(int r4, int r5, long r6) {
        /*
            r3 = this;
            r3.<init>()
            if (r5 < 0) goto L2a
            r2 = 1
            if (r5 > r2) goto L2a
        L8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r0 = 41
            r1.<init>(r0)
            java.lang.String r0 = "Transition type "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " is not valid."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.C0W3J.LIZ(r0, r2)
            r3.zza = r4
            r3.zzb = r5
            r3.zzc = r6
            return
        L2a:
            r2 = 0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.ActivityTransitionEvent.<init>(int, int, long):void");
    }
}
