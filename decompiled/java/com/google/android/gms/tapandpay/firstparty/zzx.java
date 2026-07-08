package com.google.android.gms.tapandpay.firstparty;

import X.C0W3L;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.zzx;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class zzx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzx> CREATOR = new Parcelable.Creator() { // from class: X.0W5o
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            long jLJJ = 0;
            int iLJIJJLI = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        jLJJ = C0W6J.LJJ(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzx(iLJIJJLI, jLJJ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzx[i];
        }
    };
    public final int LL;
    public final long LLILLJJLI;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.LL), Long.valueOf(this.LLILLJJLI)});
    }

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(Integer.valueOf(this.LL), "result");
        c0w3l.LIZ(Long.valueOf(this.LLILLJJLI), "timeMillis");
        return c0w3l.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzx) {
            zzx zzxVar = (zzx) obj;
            if (this.LL == zzxVar.LL && this.LLILLJJLI == zzxVar.LLILLJJLI) {
                return true;
            }
        }
        return false;
    }

    public zzx(int i, long j) {
        this.LL = i;
        this.LLILLJJLI = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIILJJIL(2, this.LLILLJJLI, parcel);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
