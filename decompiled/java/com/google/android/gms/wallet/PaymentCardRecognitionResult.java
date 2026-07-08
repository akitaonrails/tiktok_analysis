package com.google.android.gms.wallet;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.CreditCardExpirationDate;
import com.google.android.gms.wallet.PaymentCardRecognitionResult;

/* JADX INFO: loaded from: classes31.dex */
public final class PaymentCardRecognitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentCardRecognitionResult> CREATOR = new Parcelable.Creator() { // from class: X.12lA
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            CreditCardExpirationDate creditCardExpirationDate = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        creditCardExpirationDate = (CreditCardExpirationDate) C0W6J.LJI(parcel, i, CreditCardExpirationDate.CREATOR);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new PaymentCardRecognitionResult(strLJII, creditCardExpirationDate);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new PaymentCardRecognitionResult[i];
        }
    };
    public String zza;
    public CreditCardExpirationDate zzb;

    public PaymentCardRecognitionResult() {
    }

    public PaymentCardRecognitionResult(String str, CreditCardExpirationDate creditCardExpirationDate) {
        this.zza = str;
        this.zzb = creditCardExpirationDate;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 1, this.zza, false);
        C817940W6u.LJIIZILJ(parcel, 2, this.zzb, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
