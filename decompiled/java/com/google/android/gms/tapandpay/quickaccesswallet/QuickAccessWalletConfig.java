package com.google.android.gms.tapandpay.quickaccesswallet;

import X.C0W0T;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class QuickAccessWalletConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<QuickAccessWalletConfig> CREATOR = new Parcelable.Creator() { // from class: X.0W6h
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String[] strArrLJIIIIZZ = null;
            int iLJIJJLI = 0;
            int iLJIJJLI2 = 0;
            int iLJIJJLI3 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 5) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                strArrLJIIIIZZ = C0W6J.LJIIIIZZ(i, parcel);
                            }
                        } else {
                            iLJIJJLI3 = C0W6J.LJIJJLI(i, parcel);
                        }
                    } else {
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new QuickAccessWalletConfig(iLJIJJLI, iLJIJJLI2, iLJIJJLI3, strArrLJIIIIZZ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new QuickAccessWalletConfig[i];
        }
    };
    public int zza;
    public int zzb;
    public int zzc;
    public String[] zzd;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(Arrays.hashCode(this.zzd))});
    }

    public QuickAccessWalletConfig() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QuickAccessWalletConfig) {
            QuickAccessWalletConfig quickAccessWalletConfig = (QuickAccessWalletConfig) obj;
            if (C0W0T.LIZIZ(Integer.valueOf(this.zza), Integer.valueOf(quickAccessWalletConfig.zza)) && C0W0T.LIZIZ(Integer.valueOf(this.zzb), Integer.valueOf(quickAccessWalletConfig.zzb)) && C0W0T.LIZIZ(Integer.valueOf(this.zzc), Integer.valueOf(quickAccessWalletConfig.zzc)) && Arrays.equals(this.zzd, quickAccessWalletConfig.zzd)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.zza);
        C817940W6u.LJIIJ(parcel, 2, this.zzb);
        C817940W6u.LJIIJ(parcel, 3, this.zzc);
        C817940W6u.LJIJI(parcel, 5, this.zzd);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public QuickAccessWalletConfig(int i, int i2, int i3, String[] strArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = strArr;
    }
}
