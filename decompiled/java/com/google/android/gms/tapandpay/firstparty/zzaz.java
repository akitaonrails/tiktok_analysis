package com.google.android.gms.tapandpay.firstparty;

import X.C0W3L;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.zzaz;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new Parcelable.Creator() { // from class: X.0W6V
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            int iLJIJJLI2 = 0;
            int iLJIJJLI3 = 0;
            int iLJIJJLI4 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                iLJIJJLI4 = C0W6J.LJIJJLI(i, parcel);
                            }
                        } else {
                            iLJIJJLI3 = C0W6J.LJIJJLI(i, parcel);
                        }
                    } else {
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzaz(iLJIJJLI, iLJIJJLI2, iLJIJJLI3, iLJIJJLI4);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzaz[i];
        }
    };
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.LL), Integer.valueOf(this.LLILLJJLI), Integer.valueOf(this.LLILLL), Integer.valueOf(this.LLILZ)});
    }

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(Integer.valueOf(this.LL), "transactionDelivery");
        c0w3l.LIZ(Integer.valueOf(this.LLILLJJLI), "transactionLimit");
        c0w3l.LIZ(Integer.valueOf(this.LLILLL), "supportedTransactions");
        c0w3l.LIZ(Integer.valueOf(this.LLILZ), "deliveryPreference");
        return c0w3l.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaz) {
            zzaz zzazVar = (zzaz) obj;
            if (this.LL == zzazVar.LL && this.LLILLJJLI == zzazVar.LLILLJJLI && this.LLILLL == zzazVar.LLILLL && this.LLILZ == zzazVar.LLILZ) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 2, this.LL);
        C817940W6u.LJIIJ(parcel, 3, this.LLILLJJLI);
        C817940W6u.LJIIJ(parcel, 4, this.LLILLL);
        C817940W6u.LJIIJ(parcel, 5, this.LLILZ);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzaz(int i, int i2, int i3, int i4) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = i4;
    }
}
