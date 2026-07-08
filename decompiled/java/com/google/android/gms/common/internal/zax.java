package com.google.android.gms.common.internal;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zax;

/* JADX INFO: loaded from: classes14.dex */
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new Parcelable.Creator<zax>() { // from class: X.0Wmr
        @Override // android.os.Parcelable.Creator
        public final zax createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            Scope[] scopeArr = null;
            int iLJIJJLI2 = 0;
            int iLJIJJLI3 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                scopeArr = (Scope[]) C0W6J.LJIIJ(parcel, i, Scope.CREATOR);
                            }
                        } else {
                            iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        }
                    } else {
                        iLJIJJLI3 = C0W6J.LJIJJLI(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zax(iLJIJJLI, iLJIJJLI3, iLJIJJLI2, scopeArr);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ zax[] newArray(int i) {
            return new zax[i];
        }
    };
    public final int LL;
    public final int zab;
    public final int zac;
    public final Scope[] zad;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIIJ(parcel, 2, this.zab);
        C817940W6u.LJIIJ(parcel, 3, this.zac);
        C817940W6u.LJIJJLI(parcel, 4, this.zad, i);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zax(int i, int i2, int i3, Scope[] scopeArr) {
        this.LL = i;
        this.zab = i2;
        this.zac = i3;
        this.zad = scopeArr;
    }
}
