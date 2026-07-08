package com.google.android.gms.tapandpay.firstparty;

import X.C0W0T;
import X.C0W3L;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import com.google.android.gms.tapandpay.firstparty.zzaw;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class TokenStatus extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenStatus> CREATOR = new Parcelable.Creator() { // from class: X.0W3S
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            zzaw zzawVar = null;
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
                    zzawVar = (zzaw) C0W6J.LJI(parcel, i, zzaw.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new TokenStatus(zzawVar, iLJIJJLI, zLJIILIIL);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new TokenStatus[i];
        }
    };
    public final zzaw LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LL, Integer.valueOf(this.LLILLJJLI), Boolean.valueOf(this.LLILLL)});
    }

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(this.LL, "tokenReference");
        c0w3l.LIZ(Integer.valueOf(this.LLILLJJLI), "tokenState");
        c0w3l.LIZ(Boolean.valueOf(this.LLILLL), "isSelected");
        return c0w3l.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TokenStatus) {
            TokenStatus tokenStatus = (TokenStatus) obj;
            if (C0W0T.LIZIZ(this.LL, tokenStatus.LL) && this.LLILLJJLI == tokenStatus.LLILLJJLI && this.LLILLL == tokenStatus.LLILLL) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 2, this.LL, i, false);
        C817940W6u.LJIIJ(parcel, 3, this.LLILLJJLI);
        C817940W6u.LIZ(parcel, 4, this.LLILLL);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public TokenStatus(zzaw zzawVar, int i, boolean z) {
        this.LL = zzawVar;
        this.LLILLJJLI = i;
        this.LLILLL = z;
    }
}
