package com.google.android.gms.location;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.zzbo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Arrays;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new Parcelable.Creator<LocationAvailability>() { // from class: X.0W0Z
        @Override // android.os.Parcelable.Creator
        public final LocationAvailability createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            zzbo[] zzboVarArr = null;
            int iLJIJJLI = LSPassThroughRecordSizeConfig.DEFAULT;
            int iLJIJJLI2 = 1;
            int iLJIJJLI3 = 1;
            long jLJJ = 0;
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
                                    zzboVarArr = (zzbo[]) C0W6J.LJIIJ(parcel, i, zzbo.CREATOR);
                                }
                            } else {
                                iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                            }
                        } else {
                            jLJJ = C0W6J.LJJ(i, parcel);
                        }
                    } else {
                        iLJIJJLI3 = C0W6J.LJIJJLI(i, parcel);
                    }
                } else {
                    iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new LocationAvailability(iLJIJJLI, iLJIJJLI2, iLJIJJLI3, jLJJ, zzboVarArr);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LocationAvailability[] newArray(int i) {
            return new LocationAvailability[i];
        }
    };
    public final int LL;
    public final int LLILLJJLI;
    public final long LLILLL;
    public final int LLILZ;
    public final zzbo[] LLILZIL;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.LLILZ), Integer.valueOf(this.LL), Integer.valueOf(this.LLILLJJLI), Long.valueOf(this.LLILLL), this.LLILZIL});
    }

    public final String toString() {
        boolean z = this.LLILZ < 1000;
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(z);
        sb.append(e3.f);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.LL == locationAvailability.LL && this.LLILLJJLI == locationAvailability.LLILLJJLI && this.LLILLL == locationAvailability.LLILLL && this.LLILZ == locationAvailability.LLILZ && Arrays.equals(this.LLILZIL, locationAvailability.LLILZIL)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIIJ(parcel, 2, this.LLILLJJLI);
        C817940W6u.LJIILJJIL(3, this.LLILLL, parcel);
        C817940W6u.LJIIJ(parcel, 4, this.LLILZ);
        C817940W6u.LJIJJLI(parcel, 5, this.LLILZIL, i);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public LocationAvailability(int i, int i2, int i3, long j, zzbo[] zzboVarArr) {
        this.LLILZ = i;
        this.LL = i2;
        this.LLILLJJLI = i3;
        this.LLILLL = j;
        this.LLILZIL = zzboVarArr;
    }
}
