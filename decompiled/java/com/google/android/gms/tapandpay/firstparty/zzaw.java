package com.google.android.gms.tapandpay.firstparty;

import X.C0W0T;
import X.C0W3L;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.zzaw;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new Parcelable.Creator() { // from class: X.0W3R
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            String strLJII = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzaw(strLJII, iLJIJJLI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzaw[i];
        }
    };
    public final String LL;
    public final int LLILLJJLI;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LL, Integer.valueOf(this.LLILLJJLI)});
    }

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(this.LL, "tokenReferenceId");
        c0w3l.LIZ(Integer.valueOf(this.LLILLJJLI), "tokenProvider");
        return c0w3l.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaw) {
            zzaw zzawVar = (zzaw) obj;
            if (C0W0T.LIZIZ(this.LL, zzawVar.LL) && this.LLILLJJLI == zzawVar.LLILLJJLI) {
                return true;
            }
        }
        return false;
    }

    public zzaw(String str, int i) {
        this.LL = str;
        this.LLILLJJLI = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 2, this.LL, false);
        C817940W6u.LJIIJ(parcel, 3, this.LLILLJJLI);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
