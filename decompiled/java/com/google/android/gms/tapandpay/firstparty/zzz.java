package com.google.android.gms.tapandpay.firstparty;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.zzal;
import com.google.android.gms.tapandpay.firstparty.zzz;

/* JADX INFO: loaded from: classes14.dex */
public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzz> CREATOR = new Parcelable.Creator() { // from class: X.0W3Q
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            zzal zzalVar = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 1) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    zzalVar = (zzal) C0W6J.LJI(parcel, i, zzal.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzz(zzalVar);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzz[i];
        }
    };
    public final zzal LL;

    public zzz(zzal zzalVar) {
        this.LL = zzalVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 1, this.LL, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
