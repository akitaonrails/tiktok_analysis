package com.google.android.gms.tapandpay.firstparty;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.zzau;
import com.google.android.gms.tapandpay.firstparty.zzn;

/* JADX INFO: loaded from: classes14.dex */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new Parcelable.Creator() { // from class: X.0W6R
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            zzau[] zzauVarArr = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 1) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    zzauVarArr = (zzau[]) C0W6J.LJIIJ(parcel, i, zzau.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzn(zzauVarArr);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzn[i];
        }
    };
    public final zzau[] LL;

    public zzn(zzau[] zzauVarArr) {
        this.LL = zzauVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJJLI(parcel, 1, this.LL, i);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
