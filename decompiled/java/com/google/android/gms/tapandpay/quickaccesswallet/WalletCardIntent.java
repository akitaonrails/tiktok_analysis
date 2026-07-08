package com.google.android.gms.tapandpay.quickaccesswallet;

import X.C0W0T;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent;
import com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class WalletCardIntent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WalletCardIntent> CREATOR = new Parcelable.Creator() { // from class: X.0W4n
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            String strLJII2 = null;
            WalletCardIntentExtra[] walletCardIntentExtraArr = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            walletCardIntentExtraArr = (WalletCardIntentExtra[]) C0W6J.LJIIJ(parcel, i, WalletCardIntentExtra.CREATOR);
                        }
                    } else {
                        strLJII2 = C0W6J.LJII(i, parcel);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new WalletCardIntent(strLJII, strLJII2, walletCardIntentExtraArr);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new WalletCardIntent[i];
        }
    };
    public String zza;
    public String zzb;
    public WalletCardIntentExtra[] zzc;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, Integer.valueOf(Arrays.hashCode(this.zzc))});
    }

    public WalletCardIntent() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WalletCardIntent) {
            WalletCardIntent walletCardIntent = (WalletCardIntent) obj;
            if (C0W0T.LIZIZ(this.zza, walletCardIntent.zza) && C0W0T.LIZIZ(this.zzb, walletCardIntent.zzb) && Arrays.equals(this.zzc, walletCardIntent.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 1, this.zza, false);
        C817940W6u.LJIJ(parcel, 2, this.zzb, false);
        C817940W6u.LJIJJLI(parcel, 3, this.zzc, i);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public WalletCardIntent(String str, String str2, WalletCardIntentExtra[] walletCardIntentExtraArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = walletCardIntentExtraArr;
    }
}
