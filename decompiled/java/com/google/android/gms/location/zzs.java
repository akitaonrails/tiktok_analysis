package com.google.android.gms.location;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzs;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new Parcelable.Creator<zzs>() { // from class: X.0W3W
        @Override // android.os.Parcelable.Creator
        public final zzs createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            boolean zLJIILIIL = true;
            long jLJJ = 50;
            float fLJIJ = 0.0f;
            long jLJJ2 = Long.MAX_VALUE;
            int iLJIJJLI = Integer.MAX_VALUE;
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
                                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                                }
                            } else {
                                jLJJ2 = C0W6J.LJJ(i, parcel);
                            }
                        } else {
                            fLJIJ = C0W6J.LJIJ(i, parcel);
                        }
                    } else {
                        jLJJ = C0W6J.LJJ(i, parcel);
                    }
                } else {
                    zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzs(zLJIILIIL, jLJJ, fLJIJ, jLJJ2, iLJIJJLI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ zzs[] newArray(int i) {
            return new zzs[i];
        }
    };
    public final boolean LL;
    public final long LLILLJJLI;
    public final float LLILLL;
    public final long LLILZ;
    public final int LLILZIL;

    public zzs() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.LL), Long.valueOf(this.LLILLJJLI), Float.valueOf(this.LLILLL), Long.valueOf(this.LLILZ), Integer.valueOf(this.LLILZIL)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.LL);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.LLILLJJLI);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.LLILLL);
        long j = this.LLILZ;
        if (j != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j - jElapsedRealtime);
            sb.append("ms");
        }
        if (this.LLILZIL != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.LLILZIL);
        }
        sb.append(']');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzsVar = (zzs) obj;
        if (this.LL == zzsVar.LL && this.LLILLJJLI == zzsVar.LLILLJJLI && Float.compare(this.LLILLL, zzsVar.LLILLL) == 0 && this.LLILZ == zzsVar.LLILZ && this.LLILZIL == zzsVar.LLILZIL) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LIZ(parcel, 1, this.LL);
        C817940W6u.LJIILJJIL(2, this.LLILLJJLI, parcel);
        C817940W6u.LJII(parcel, 3, this.LLILLL);
        C817940W6u.LJIILJJIL(4, this.LLILZ, parcel);
        C817940W6u.LJIIJ(parcel, 5, this.LLILZIL);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzs(boolean z, long j, float f, long j2, int i) {
        this.LL = z;
        this.LLILLJJLI = j;
        this.LLILLL = f;
        this.LLILZ = j2;
        this.LLILZIL = i;
    }
}
