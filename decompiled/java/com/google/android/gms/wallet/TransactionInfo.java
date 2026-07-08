package com.google.android.gms.wallet;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.TransactionInfo;

/* JADX INFO: loaded from: classes14.dex */
public final class TransactionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TransactionInfo> CREATOR = new Parcelable.Creator() { // from class: X.0WoR
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            String strLJII = null;
            String strLJII2 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            strLJII2 = C0W6J.LJII(i, parcel);
                        }
                    } else {
                        strLJII = C0W6J.LJII(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new TransactionInfo(iLJIJJLI, strLJII, strLJII2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new TransactionInfo[i];
        }
    };
    public int zza;
    public String zzb;
    public String zzc;

    public TransactionInfo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.zza);
        C817940W6u.LJIJ(parcel, 2, this.zzb, false);
        C817940W6u.LJIJ(parcel, 3, this.zzc, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public TransactionInfo(int i, String str, String str2) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
    }
}
