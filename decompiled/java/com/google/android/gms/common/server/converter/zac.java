package com.google.android.gms.common.server.converter;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.zac;

/* JADX INFO: loaded from: classes14.dex */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new Parcelable.Creator<zac>() { // from class: X.0W6E
        @Override // android.os.Parcelable.Creator
        public final zac createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            String strLJII = null;
            int iLJIJJLI2 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        }
                    } else {
                        strLJII = C0W6J.LJII(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zac(iLJIJJLI, strLJII, iLJIJJLI2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ zac[] newArray(int i) {
            return new zac[i];
        }
    };
    public final int LL;
    public final String LLILLJJLI;
    public final int LLILLL;

    public zac(String str, int i) {
        this.LL = 1;
        this.LLILLJJLI = str;
        this.LLILLL = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIJ(parcel, 2, this.LLILLJJLI, false);
        C817940W6u.LJIIJ(parcel, 3, this.LLILLL);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zac(int i, String str, int i2) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = i2;
    }
}
