package com.google.android.gms.tapandpay.quickaccesswallet;

import X.C0W0T;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class WalletCardIntentExtra extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WalletCardIntentExtra> CREATOR = new Parcelable.Creator() { // from class: X.0W4m
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            long jLJJ = 0;
            int iLJIJJLI = 0;
            boolean zLJIILIIL = false;
            int iLJIJJLI2 = 0;
            String strLJII2 = null;
            byte[] bArrLIZJ = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 1:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 2:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 3:
                        strLJII2 = C0W6J.LJII(i, parcel);
                        break;
                    case 4:
                        bArrLIZJ = C0W6J.LIZJ(i, parcel);
                        break;
                    case 5:
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case 6:
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 7:
                        jLJJ = C0W6J.LJJ(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new WalletCardIntentExtra(strLJII, iLJIJJLI, strLJII2, bArrLIZJ, zLJIILIIL, iLJIJJLI2, jLJJ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new WalletCardIntentExtra[i];
        }
    };
    public String zza;
    public int zzb;
    public String zzc;
    public byte[] zzd;
    public boolean zze;
    public int zzf;
    public long zzg;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, Integer.valueOf(Arrays.hashCode(this.zzd)), Boolean.valueOf(this.zze), Integer.valueOf(this.zzf), Long.valueOf(this.zzg)});
    }

    public WalletCardIntentExtra() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WalletCardIntentExtra) {
            WalletCardIntentExtra walletCardIntentExtra = (WalletCardIntentExtra) obj;
            if (C0W0T.LIZIZ(this.zza, walletCardIntentExtra.zza) && C0W0T.LIZIZ(Integer.valueOf(this.zzb), Integer.valueOf(walletCardIntentExtra.zzb)) && C0W0T.LIZIZ(this.zzc, walletCardIntentExtra.zzc) && Arrays.equals(this.zzd, walletCardIntentExtra.zzd) && C0W0T.LIZIZ(Boolean.valueOf(this.zze), Boolean.valueOf(walletCardIntentExtra.zze)) && C0W0T.LIZIZ(Integer.valueOf(this.zzf), Integer.valueOf(walletCardIntentExtra.zzf)) && C0W0T.LIZIZ(Long.valueOf(this.zzg), Long.valueOf(walletCardIntentExtra.zzg))) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 1, this.zza, false);
        C817940W6u.LJIIJ(parcel, 2, this.zzb);
        C817940W6u.LJIJ(parcel, 3, this.zzc, false);
        C817940W6u.LJ(parcel, 4, this.zzd, false);
        C817940W6u.LIZ(parcel, 5, this.zze);
        C817940W6u.LJIIJ(parcel, 6, this.zzf);
        C817940W6u.LJIILJJIL(7, this.zzg, parcel);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public WalletCardIntentExtra(String str, int i, String str2, byte[] bArr, boolean z, int i2, long j) {
        this.zza = str;
        this.zzb = i;
        this.zzc = str2;
        this.zzd = bArr;
        this.zze = z;
        this.zzf = i2;
        this.zzg = j;
    }
}
