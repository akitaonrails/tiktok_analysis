package com.google.android.gms.wallet;

import X.C817940W6u;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;

/* JADX INFO: loaded from: classes14.dex */
public final class PaymentMethodTokenizationParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentMethodTokenizationParameters> CREATOR = new Parcelable.Creator() { // from class: X.0WoQ
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            Bundle bundleLIZIZ = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        bundleLIZIZ = C0W6J.LIZIZ(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new PaymentMethodTokenizationParameters(iLJIJJLI, bundleLIZIZ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new PaymentMethodTokenizationParameters[i];
        }
    };
    public final Bundle LL;
    public int zza;

    public PaymentMethodTokenizationParameters() {
        this.LL = new Bundle();
    }

    public PaymentMethodTokenizationParameters(int i, Bundle bundle) {
        new Bundle();
        this.zza = i;
        this.LL = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 2, this.zza);
        C817940W6u.LIZJ(parcel, 3, this.LL);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
