package com.google.android.gms.wallet;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.PaymentMethodToken;

/* JADX INFO: loaded from: classes14.dex */
public final class PaymentMethodToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentMethodToken> CREATOR = new Parcelable.Creator() { // from class: X.0WpD
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            String strLJII = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        strLJII = C0W6J.LJII(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new PaymentMethodToken(iLJIJJLI, strLJII);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new PaymentMethodToken[i];
        }
    };
    public int zza;
    public String zzb;

    public PaymentMethodToken() {
    }

    public PaymentMethodToken(int i, String str) {
        this.zza = i;
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 2, this.zza);
        C817940W6u.LJIJ(parcel, 3, this.zzb, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
