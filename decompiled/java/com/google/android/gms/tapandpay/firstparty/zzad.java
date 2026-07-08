package com.google.android.gms.tapandpay.firstparty;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.zzad;

/* JADX INFO: loaded from: classes14.dex */
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new Parcelable.Creator() { // from class: X.0W6m
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            boolean zLJIILIIL = false;
            boolean zLJIILIIL2 = false;
            boolean zLJIILIIL3 = false;
            boolean zLJIILIIL4 = false;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                zLJIILIIL4 = C0W6J.LJIILIIL(i, parcel);
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
            return new zzad(zLJIILIIL, zLJIILIIL2, zLJIILIIL3, zLJIILIIL4);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzad[i];
        }
    };
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LIZ(parcel, 2, this.LL);
        C817940W6u.LIZ(parcel, 3, this.LLILLJJLI);
        C817940W6u.LIZ(parcel, 4, this.LLILLL);
        C817940W6u.LIZ(parcel, 5, this.LLILZ);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzad(boolean z, boolean z2, boolean z3, boolean z4) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
        this.LLILZ = z4;
    }
}
