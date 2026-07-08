package com.google.android.gms.tapandpay.firstparty;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.zzab;
import com.google.android.gms.tapandpay.firstparty.zzas;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new Parcelable.Creator() { // from class: X.0W6L
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            ArrayList arrayListLJIIJJI = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 1) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, zzas.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzab(arrayListLJIIJJI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzab[i];
        }
    };
    public final List LL;

    public zzab(List list) {
        this.LL = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIL(parcel, 1, this.LL, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
