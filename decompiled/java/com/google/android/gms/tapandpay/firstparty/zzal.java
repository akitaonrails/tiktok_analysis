package com.google.android.gms.tapandpay.firstparty;

import X.C0W3L;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.zzal;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new Parcelable.Creator() { // from class: X.0W3P
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            boolean zLJIILIIL = false;
            boolean zLJIILIIL2 = false;
            boolean zLJIILIIL3 = false;
            int iLJIJJLI = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                            }
                        } else {
                            zLJIILIIL3 = C0W6J.LJIILIIL(i, parcel);
                        }
                    } else {
                        zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                    }
                } else {
                    zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzal(zLJIILIIL, zLJIILIIL2, zLJIILIIL3, iLJIJJLI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzal[i];
        }
    };
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final int LLILZ;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.LL), Boolean.valueOf(this.LLILLJJLI), Boolean.valueOf(this.LLILLL), Integer.valueOf(this.LLILZ)});
    }

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(Boolean.valueOf(this.LL), "transactions");
        c0w3l.LIZ(Boolean.valueOf(this.LLILLJJLI), "plasticTransactions");
        c0w3l.LIZ(Boolean.valueOf(this.LLILLL), "promotions");
        c0w3l.LIZ(Integer.valueOf(this.LLILZ), "bitMask");
        return c0w3l.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzal) {
            zzal zzalVar = (zzal) obj;
            if (this.LL == zzalVar.LL && this.LLILLJJLI == zzalVar.LLILLJJLI && this.LLILLL == zzalVar.LLILLL && this.LLILZ == zzalVar.LLILZ) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LIZ(parcel, 1, this.LL);
        C817940W6u.LIZ(parcel, 2, this.LLILLJJLI);
        C817940W6u.LIZ(parcel, 3, this.LLILLL);
        C817940W6u.LJIIJ(parcel, 4, this.LLILZ);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzal(boolean z, boolean z2, boolean z3, int i) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
        this.LLILZ = i;
    }
}
