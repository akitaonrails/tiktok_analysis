package com.google.android.gms.common.internal;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes14.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new Parcelable.Creator() { // from class: X.0Wio
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            int iLJIJJLI2 = 0;
            int iLJIJJLI3 = 0;
            boolean zLJIILIIL = false;
            boolean zLJIILIIL2 = false;
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
                            zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                        }
                    } else {
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new RootTelemetryConfiguration(iLJIJJLI, iLJIJJLI2, iLJIJJLI3, zLJIILIIL, zLJIILIIL2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new RootTelemetryConfiguration[i];
        }
    };
    public final int zza;
    public final boolean zzb;
    public final boolean zzc;
    public final int zzd;
    public final int zze;

    public RootTelemetryConfiguration(int i, int i2, int i3, boolean z, boolean z2) {
        this.zza = i;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = i2;
        this.zze = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.zza);
        C817940W6u.LIZ(parcel, 2, this.zzb);
        C817940W6u.LIZ(parcel, 3, this.zzc);
        C817940W6u.LJIIJ(parcel, 4, this.zzd);
        C817940W6u.LJIIJ(parcel, 5, this.zze);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
