package com.google.android.gms.wallet;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.CreditCardExpirationDate;

/* JADX INFO: loaded from: classes31.dex */
public final class CreditCardExpirationDate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreditCardExpirationDate> CREATOR = new Parcelable.Creator() { // from class: X.12lB
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
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
            return new CreditCardExpirationDate(iLJIJJLI, iLJIJJLI2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new CreditCardExpirationDate[i];
        }
    };
    public int zza;
    public int zzb;

    public CreditCardExpirationDate() {
    }

    public CreditCardExpirationDate(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.zza);
        C817940W6u.LJIIJ(parcel, 2, this.zzb);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
