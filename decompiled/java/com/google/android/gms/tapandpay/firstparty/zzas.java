package com.google.android.gms.tapandpay.firstparty;

import X.C0W0T;
import X.C0W3L;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.zzas;
import java.math.BigDecimal;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzas> CREATOR = new Parcelable.Creator() { // from class: X.0W6K
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            BigDecimal bigDecimalLIZ = null;
            int iLJIJJLI = 0;
            long jLJJ = 0;
            long jLJJ2 = 0;
            String strLJII = null;
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
                                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                                }
                            } else {
                                jLJJ2 = C0W6J.LJJ(i, parcel);
                            }
                        } else {
                            strLJII = C0W6J.LJII(i, parcel);
                        }
                    } else {
                        bigDecimalLIZ = C0W6J.LIZ(i, parcel);
                    }
                } else {
                    jLJJ = C0W6J.LJJ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzas(jLJJ, bigDecimalLIZ, strLJII, jLJJ2, iLJIJJLI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzas[i];
        }
    };
    public final long LL;
    public final BigDecimal LLILLJJLI;
    public final String LLILLL;
    public final long LLILZ;
    public final int LLILZIL;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.LL), this.LLILLJJLI, this.LLILLL, Long.valueOf(this.LLILZ), Integer.valueOf(this.LLILZIL)});
    }

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(Long.valueOf(this.LL), "transactionId");
        c0w3l.LIZ(this.LLILLJJLI, "amount");
        c0w3l.LIZ(this.LLILLL, "currency");
        c0w3l.LIZ(Long.valueOf(this.LLILZ), "transactionTimeMillis");
        c0w3l.LIZ(Integer.valueOf(this.LLILZIL), "type");
        return c0w3l.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzas) {
            zzas zzasVar = (zzas) obj;
            if (this.LL == zzasVar.LL && C0W0T.LIZIZ(this.LLILLJJLI, zzasVar.LLILLJJLI) && C0W0T.LIZIZ(this.LLILLL, zzasVar.LLILLL) && this.LLILZ == zzasVar.LLILZ && this.LLILZIL == zzasVar.LLILZIL) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIILJJIL(1, this.LL, parcel);
        BigDecimal bigDecimal = this.LLILLJJLI;
        if (bigDecimal != null) {
            int iLJJ2 = C817940W6u.LJJ(2, parcel);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            C817940W6u.LJJI(iLJJ2, parcel);
        }
        C817940W6u.LJIJ(parcel, 3, this.LLILLL, false);
        C817940W6u.LJIILJJIL(4, this.LLILZ, parcel);
        C817940W6u.LJIIJ(parcel, 5, this.LLILZIL);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzas(long j, BigDecimal bigDecimal, String str, long j2, int i) {
        this.LL = j;
        this.LLILLJJLI = bigDecimal;
        this.LLILLL = str;
        this.LLILZ = j2;
        this.LLILZIL = i;
    }
}
