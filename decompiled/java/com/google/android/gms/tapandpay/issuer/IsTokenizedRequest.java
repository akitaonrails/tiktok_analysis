package com.google.android.gms.tapandpay.issuer;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.issuer.IsTokenizedRequest;

/* JADX INFO: loaded from: classes31.dex */
public class IsTokenizedRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<IsTokenizedRequest> CREATOR = new Parcelable.Creator() { // from class: X.12jc
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            int iLJIJJLI = 0;
            int iLJIJJLI2 = 0;
            String strLJII2 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                strLJII2 = C0W6J.LJII(i, parcel);
                            }
                        } else {
                            iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        }
                    } else {
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new IsTokenizedRequest(strLJII, iLJIJJLI, iLJIJJLI2, strLJII2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new IsTokenizedRequest[i];
        }
    };
    public final String LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final String LLILZ;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 1, this.LL, false);
        C817940W6u.LJIIJ(parcel, 2, this.LLILLJJLI);
        C817940W6u.LJIIJ(parcel, 3, this.LLILLL);
        C817940W6u.LJIJ(parcel, 4, this.LLILZ, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public IsTokenizedRequest(String str, int i, int i2, String str2) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = str2;
    }
}
