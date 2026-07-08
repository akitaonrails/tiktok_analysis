package com.google.android.gms.tapandpay.firstparty;

import X.C0W3L;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.zzah;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new Parcelable.Creator() { // from class: X.0W6W
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            boolean zLJIILIIL = false;
            int iLJIJJLI = 0;
            int iLJIJJLI2 = 0;
            int iLJIJJLI3 = 0;
            boolean zLJIILIIL2 = false;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                if (c != 6) {
                                    C0W6J.LJJII(i, parcel);
                                } else {
                                    zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
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
                } else {
                    zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzah(zLJIILIIL, iLJIJJLI, iLJIJJLI2, iLJIJJLI3, zLJIILIIL2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzah[i];
        }
    };
    public final boolean LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final boolean LLILZIL;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.LL), Integer.valueOf(this.LLILLJJLI), Integer.valueOf(this.LLILZ), Integer.valueOf(this.LLILLL), Boolean.valueOf(this.LLILZIL)});
    }

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(Boolean.valueOf(this.LL), "requireCdcvmPassing");
        c0w3l.LIZ(Integer.valueOf(this.LLILLJJLI), "cdcvmExpirationInSecs");
        c0w3l.LIZ(Integer.valueOf(this.LLILLL), "unlockedTapLimit");
        c0w3l.LIZ(Integer.valueOf(this.LLILZ), "cdcvmTapLimit");
        c0w3l.LIZ(Boolean.valueOf(this.LLILZIL), "prioritizeOnlinePinOverCdcvm");
        return c0w3l.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzah) {
            zzah zzahVar = (zzah) obj;
            if (this.LL == zzahVar.LL && this.LLILLJJLI == zzahVar.LLILLJJLI && this.LLILZ == zzahVar.LLILZ && this.LLILLL == zzahVar.LLILLL && this.LLILZIL == zzahVar.LLILZIL) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LIZ(parcel, 2, this.LL);
        C817940W6u.LJIIJ(parcel, 3, this.LLILLJJLI);
        C817940W6u.LJIIJ(parcel, 4, this.LLILLL);
        C817940W6u.LJIIJ(parcel, 5, this.LLILZ);
        C817940W6u.LIZ(parcel, 6, this.LLILZIL);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzah(boolean z, int i, int i2, int i3, boolean z2) {
        this.LL = z;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = z2;
    }
}
