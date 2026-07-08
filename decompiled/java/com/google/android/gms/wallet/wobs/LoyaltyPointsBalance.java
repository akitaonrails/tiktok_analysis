package com.google.android.gms.wallet.wobs;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.LoyaltyPointsBalance;

/* JADX INFO: loaded from: classes14.dex */
public final class LoyaltyPointsBalance extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyPointsBalance> CREATOR = new Parcelable.Creator() { // from class: X.0W73
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            int iLJIJJLI = 0;
            String strLJII2 = null;
            double dLJIILLIIL = 0.0d;
            long jLJJ = 0;
            int iLJIJJLI2 = -1;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 2:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 3:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 4:
                        dLJIILLIIL = C0W6J.LJIILLIIL(i, parcel);
                        break;
                    case 5:
                        strLJII2 = C0W6J.LJII(i, parcel);
                        break;
                    case 6:
                        jLJJ = C0W6J.LJJ(i, parcel);
                        break;
                    case 7:
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new LoyaltyPointsBalance(iLJIJJLI, strLJII, dLJIILLIIL, strLJII2, jLJJ, iLJIJJLI2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new LoyaltyPointsBalance[i];
        }
    };
    public int zza;
    public String zzb;
    public double zzc;
    public String zzd;
    public long zze;
    public int zzf;

    public LoyaltyPointsBalance() {
        this.zzf = -1;
        this.zza = -1;
        this.zzc = -1.0d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 2, this.zza);
        C817940W6u.LJIJ(parcel, 3, this.zzb, false);
        C817940W6u.LJFF(parcel, 4, this.zzc);
        C817940W6u.LJIJ(parcel, 5, this.zzd, false);
        C817940W6u.LJIILJJIL(6, this.zze, parcel);
        C817940W6u.LJIIJ(parcel, 7, this.zzf);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public LoyaltyPointsBalance(int i, String str, double d, String str2, long j, int i2) {
        this.zza = i;
        this.zzb = str;
        this.zzc = d;
        this.zzd = str2;
        this.zze = j;
        this.zzf = i2;
    }
}
