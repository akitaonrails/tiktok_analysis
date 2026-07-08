package com.google.android.gms.internal.auth;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.auth.zzbw;

/* JADX INFO: loaded from: classes31.dex */
public final class zzbw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbw> CREATOR = new Parcelable.Creator() { // from class: X.12ja
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            String strLJII = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        strLJII = C0W6J.LJII(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzbw(iLJIJJLI, strLJII);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzbw[i];
        }
    };
    public final int LL;
    public final String LLILLJJLI;

    public zzbw() {
        this.LL = 1;
    }

    public zzbw(int i, String str) {
        this.LL = i;
        this.LLILLJJLI = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIJ(parcel, 2, this.LLILLJJLI, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
