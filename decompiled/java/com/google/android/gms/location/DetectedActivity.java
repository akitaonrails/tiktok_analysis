package com.google.android.gms.location;

import X.C0W3J;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.DetectedActivity;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes14.dex */
public class DetectedActivity extends AbstractSafeParcelable {
    public final int LL;
    public int zzc;
    public static final Comparator<DetectedActivity> zza = new Comparator<DetectedActivity>() { // from class: X.0W0D
        @Override // java.util.Comparator
        public final int compare(DetectedActivity detectedActivity, DetectedActivity detectedActivity2) {
            DetectedActivity detectedActivity3 = detectedActivity;
            DetectedActivity detectedActivity4 = detectedActivity2;
            C0W3J.LJIIIIZZ(detectedActivity3);
            C0W3J.LJIIIIZZ(detectedActivity4);
            int iCompareTo = Integer.valueOf(detectedActivity4.zzc).compareTo(Integer.valueOf(detectedActivity3.zzc));
            if (iCompareTo == 0) {
                int i = detectedActivity3.LL;
                int i2 = 4;
                if (i > 22 || i < 0) {
                    i = 4;
                }
                Integer numValueOf = Integer.valueOf(i);
                int i3 = detectedActivity4.LL;
                if (i3 <= 22 && i3 >= 0) {
                    i2 = i3;
                }
                return numValueOf.compareTo(Integer.valueOf(i2));
            }
            return iCompareTo;
        }
    };
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new Parcelable.Creator<DetectedActivity>() { // from class: X.0W0C
        @Override // android.os.Parcelable.Creator
        public final DetectedActivity createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            int iLJIJJLI2 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new DetectedActivity(iLJIJJLI, iLJIJJLI2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DetectedActivity[] newArray(int i) {
            return new DetectedActivity[i];
        }
    };

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.LL), Integer.valueOf(this.zzc)});
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r4 = this;
            int r2 = r4.LL
            r0 = 22
            r1 = 4
            if (r2 > r0) goto L72
            if (r2 < 0) goto L72
            if (r2 == 0) goto L6f
            r0 = 1
            if (r2 == r0) goto L6c
            r0 = 2
            if (r2 == r0) goto L69
            r0 = 3
            if (r2 == r0) goto L66
            if (r2 == r1) goto L72
            r0 = 5
            if (r2 == r0) goto L63
            r0 = 7
            if (r2 == r0) goto L60
            r0 = 8
            if (r2 == r0) goto L5d
            r0 = 16
            if (r2 == r0) goto L5a
            r0 = 17
            if (r2 == r0) goto L57
            java.lang.String r3 = java.lang.Integer.toString(r2)
        L2c:
            int r2 = r4.zzc
            java.lang.String r0 = java.lang.String.valueOf(r3)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 48
            r1.<init>(r0)
            java.lang.String r0 = "DetectedActivity [type="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", confidence="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L57:
            java.lang.String r3 = "IN_RAIL_VEHICLE"
            goto L2c
        L5a:
            java.lang.String r3 = "IN_ROAD_VEHICLE"
            goto L2c
        L5d:
            java.lang.String r3 = "RUNNING"
            goto L2c
        L60:
            java.lang.String r3 = "WALKING"
            goto L2c
        L63:
            java.lang.String r3 = "TILTING"
            goto L2c
        L66:
            java.lang.String r3 = "STILL"
            goto L2c
        L69:
            java.lang.String r3 = "ON_FOOT"
            goto L2c
        L6c:
            java.lang.String r3 = "ON_BICYCLE"
            goto L2c
        L6f:
            java.lang.String r3 = "IN_VEHICLE"
            goto L2c
        L72:
            java.lang.String r3 = "UNKNOWN"
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.DetectedActivity.toString():java.lang.String");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DetectedActivity) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.LL == detectedActivity.LL && this.zzc == detectedActivity.zzc) {
                return true;
            }
        }
        return false;
    }

    public DetectedActivity(int i, int i2) {
        this.LL = i;
        this.zzc = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C0W3J.LJIIIIZZ(parcel);
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIIJ(parcel, 2, this.zzc);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
