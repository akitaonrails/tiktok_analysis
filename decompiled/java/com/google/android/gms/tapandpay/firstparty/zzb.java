package com.google.android.gms.tapandpay.firstparty;

import X.C0W0T;
import X.C0W3L;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import com.google.android.gms.tapandpay.firstparty.zzaz;
import com.google.android.gms.tapandpay.firstparty.zzb;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new Parcelable.Creator() { // from class: X.0W6T
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            byte[] bArrLIZJ = null;
            TokenStatus tokenStatus = null;
            String strLJII2 = null;
            zzaz zzazVar = null;
            int iLJIJJLI = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 1:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 2:
                        bArrLIZJ = C0W6J.LIZJ(i, parcel);
                        break;
                    case 3:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 4:
                        tokenStatus = (TokenStatus) C0W6J.LJI(parcel, i, TokenStatus.CREATOR);
                        break;
                    case 5:
                        strLJII2 = C0W6J.LJII(i, parcel);
                        break;
                    case 6:
                        zzazVar = (zzaz) C0W6J.LJI(parcel, i, zzaz.CREATOR);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzb(strLJII, bArrLIZJ, iLJIJJLI, tokenStatus, strLJII2, zzazVar);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzb[i];
        }
    };
    public final String LL;
    public final byte[] LLILLJJLI;
    public final int LLILLL;
    public final TokenStatus LLILZ;
    public final String LLILZIL;
    public final zzaz LLILZLL;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LL, this.LLILLJJLI, Integer.valueOf(this.LLILLL), this.LLILZ, this.LLILZIL, this.LLILZLL});
    }

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(this.LL, "clientTokenId");
        byte[] bArr = this.LLILLJJLI;
        c0w3l.LIZ(bArr == null ? null : Arrays.toString(bArr), "serverToken");
        c0w3l.LIZ(Integer.valueOf(this.LLILLL), "cardNetwork");
        c0w3l.LIZ(this.LLILZ, "tokenStatus");
        c0w3l.LIZ(this.LLILZIL, "tokenLastDigits");
        c0w3l.LIZ(this.LLILZLL, "transactionInfo");
        return c0w3l.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzb) {
            zzb zzbVar = (zzb) obj;
            if (this.LLILLL == zzbVar.LLILLL && C0W0T.LIZIZ(this.LL, zzbVar.LL) && Arrays.equals(this.LLILLJJLI, zzbVar.LLILLJJLI) && C0W0T.LIZIZ(this.LLILZ, zzbVar.LLILZ) && C0W0T.LIZIZ(this.LLILZIL, zzbVar.LLILZIL) && C0W0T.LIZIZ(this.LLILZLL, zzbVar.LLILZLL)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 1, this.LL, false);
        C817940W6u.LJ(parcel, 2, this.LLILLJJLI, false);
        C817940W6u.LJIIJ(parcel, 3, this.LLILLL);
        C817940W6u.LJIIZILJ(parcel, 4, this.LLILZ, i, false);
        C817940W6u.LJIJ(parcel, 5, this.LLILZIL, false);
        C817940W6u.LJIIZILJ(parcel, 6, this.LLILZLL, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzb(String str, byte[] bArr, int i, TokenStatus tokenStatus, String str2, zzaz zzazVar) {
        this.LL = str;
        this.LLILLJJLI = bArr;
        this.LLILLL = i;
        this.LLILZ = tokenStatus;
        this.LLILZIL = str2;
        this.LLILZLL = zzazVar;
    }
}
