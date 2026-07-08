package com.google.android.gms.tapandpay.issuer;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.issuer.TokenStatus;

/* JADX INFO: loaded from: classes14.dex */
public final class TokenStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TokenStatus> CREATOR = new Parcelable.Creator() { // from class: X.0W6l
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            String strLJII = null;
            boolean zLJIILIIL = false;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                        }
                    } else {
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new TokenStatus(strLJII, iLJIJJLI, zLJIILIIL);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new TokenStatus[i];
        }
    };
    public final String LL;
    public final int zzb;
    public final boolean zzc;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 2, this.LL, false);
        C817940W6u.LJIIJ(parcel, 3, this.zzb);
        C817940W6u.LIZ(parcel, 4, this.zzc);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public TokenStatus(String str, int i, boolean z) {
        this.LL = str;
        this.zzb = i;
        this.zzc = z;
    }
}
