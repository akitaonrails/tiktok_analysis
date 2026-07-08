package com.google.android.gms.tapandpay.issuer;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.issuer.GetPaymentCredentialsRequest;

/* JADX INFO: loaded from: classes31.dex */
public class GetPaymentCredentialsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetPaymentCredentialsRequest> CREATOR = new Parcelable.Creator() { // from class: X.12jb
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            boolean zLJIILIIL = false;
            String strLJII2 = null;
            String strLJII3 = null;
            String strLJII4 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                if (c != 5) {
                                    C0W6J.LJJII(i, parcel);
                                } else {
                                    zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                                }
                            } else {
                                strLJII4 = C0W6J.LJII(i, parcel);
                            }
                        } else {
                            strLJII3 = C0W6J.LJII(i, parcel);
                        }
                    } else {
                        strLJII2 = C0W6J.LJII(i, parcel);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new GetPaymentCredentialsRequest(strLJII, strLJII2, strLJII3, strLJII4, zLJIILIIL);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new GetPaymentCredentialsRequest[i];
        }
    };
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 1, this.LL, false);
        C817940W6u.LJIJ(parcel, 2, this.LLILLJJLI, false);
        C817940W6u.LJIJ(parcel, 3, this.LLILLL, false);
        C817940W6u.LJIJ(parcel, 4, this.LLILZ, false);
        C817940W6u.LIZ(parcel, 5, this.LLILZIL);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public GetPaymentCredentialsRequest(String str, String str2, String str3, String str4, boolean z) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = z;
    }
}
