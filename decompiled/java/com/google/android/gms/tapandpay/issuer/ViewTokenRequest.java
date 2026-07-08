package com.google.android.gms.tapandpay.issuer;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.issuer.ViewTokenRequest;

/* JADX INFO: loaded from: classes31.dex */
public class ViewTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ViewTokenRequest> CREATOR = new Parcelable.Creator() { // from class: X.12jd
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            String strLJII = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new ViewTokenRequest(strLJII, iLJIJJLI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new ViewTokenRequest[i];
        }
    };
    public final String LL;
    public final int LLILLJJLI;

    public ViewTokenRequest(String str, int i) {
        this.LL = str;
        this.LLILLJJLI = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 1, this.LL, false);
        C817940W6u.LJIIJ(parcel, 2, this.LLILLJJLI);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
