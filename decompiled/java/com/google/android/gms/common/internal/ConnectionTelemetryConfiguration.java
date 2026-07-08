package com.google.android.gms.common.internal;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes14.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new Parcelable.Creator() { // from class: X.0Win
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            RootTelemetryConfiguration rootTelemetryConfiguration = null;
            int[] iArrLIZLLL = null;
            int[] iArrLIZLLL2 = null;
            boolean zLJIILIIL = false;
            boolean zLJIILIIL2 = false;
            int iLJIJJLI = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 1:
                        rootTelemetryConfiguration = (RootTelemetryConfiguration) C0W6J.LJI(parcel, i, RootTelemetryConfiguration.CREATOR);
                        break;
                    case 2:
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case 3:
                        zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case 4:
                        iArrLIZLLL = C0W6J.LIZLLL(i, parcel);
                        break;
                    case 5:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 6:
                        iArrLIZLLL2 = C0W6J.LIZLLL(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, zLJIILIIL, zLJIILIIL2, iArrLIZLLL, iLJIJJLI, iArrLIZLLL2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new ConnectionTelemetryConfiguration[i];
        }
    };
    public final RootTelemetryConfiguration zza;
    public final boolean zzb;
    public final boolean zzc;
    public final int[] zzd;
    public final int zze;
    public final int[] zzf;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.zza = rootTelemetryConfiguration;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = iArr;
        this.zze = i;
        this.zzf = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 1, this.zza, i, false);
        C817940W6u.LIZ(parcel, 2, this.zzb);
        C817940W6u.LIZ(parcel, 3, this.zzc);
        C817940W6u.LJIIJJI(parcel, 4, this.zzd);
        C817940W6u.LJIIJ(parcel, 5, this.zze);
        C817940W6u.LJIIJJI(parcel, 6, this.zzf);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
