package com.google.android.gms.tapandpay.issuer;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.issuer.GetPaymentCredentialsResponse;

/* JADX INFO: loaded from: classes31.dex */
public class GetPaymentCredentialsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetPaymentCredentialsResponse> CREATOR = new Parcelable.Creator() { // from class: X.12ki
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            byte[] bArrLIZJ = null;
            byte[] bArrLIZJ2 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        bArrLIZJ2 = C0W6J.LIZJ(i, parcel);
                    }
                } else {
                    bArrLIZJ = C0W6J.LIZJ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new GetPaymentCredentialsResponse(bArrLIZJ, bArrLIZJ2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new GetPaymentCredentialsResponse[i];
        }
    };
    public final byte[] LL;
    public final byte[] LLILLJJLI;

    public GetPaymentCredentialsResponse(byte[] bArr, byte[] bArr2) {
        this.LL = bArr;
        this.LLILLJJLI = bArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJ(parcel, 1, this.LL, false);
        C817940W6u.LJ(parcel, 2, this.LLILLJJLI, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
