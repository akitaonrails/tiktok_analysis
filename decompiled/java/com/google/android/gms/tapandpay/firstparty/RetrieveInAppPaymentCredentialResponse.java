package com.google.android.gms.tapandpay.firstparty;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse;

/* JADX INFO: loaded from: classes14.dex */
public class RetrieveInAppPaymentCredentialResponse extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<RetrieveInAppPaymentCredentialResponse> CREATOR = new Parcelable.Creator() { // from class: X.0W6k
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            String strLJII2 = null;
            String strLJII3 = null;
            byte[] bArrLIZJ = null;
            int iLJIJJLI = 0;
            int iLJIJJLI2 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 2:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 3:
                        bArrLIZJ = C0W6J.LIZJ(i, parcel);
                        break;
                    case 4:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 5:
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 6:
                        strLJII2 = C0W6J.LJII(i, parcel);
                        break;
                    case 7:
                        strLJII3 = C0W6J.LJII(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new RetrieveInAppPaymentCredentialResponse(iLJIJJLI, iLJIJJLI2, strLJII, strLJII2, strLJII3, bArrLIZJ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new RetrieveInAppPaymentCredentialResponse[i];
        }
    };
    public final String LL;
    public final byte[] LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 2, this.LL, false);
        C817940W6u.LJ(parcel, 3, this.LLILLJJLI, false);
        C817940W6u.LJIIJ(parcel, 4, this.LLILLL);
        C817940W6u.LJIIJ(parcel, 5, this.LLILZ);
        C817940W6u.LJIJ(parcel, 6, this.LLILZIL, false);
        C817940W6u.LJIJ(parcel, 7, this.LLILZLL, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public RetrieveInAppPaymentCredentialResponse(int i, int i2, String str, String str2, String str3, byte[] bArr) {
        this.LL = str;
        this.LLILLJJLI = bArr;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
    }
}
