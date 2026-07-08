package com.google.android.gms.tapandpay.firstparty;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.zzap;

/* JADX INFO: loaded from: classes14.dex */
public final class zzap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzap> CREATOR = new Parcelable.Creator() { // from class: X.0W6n
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            while (parcel.dataPosition() < iLJJIII) {
                C0W6J.LJJII(parcel.readInt(), parcel);
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzap();
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzap[i];
        }
    };

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C817940W6u.LJJI(C817940W6u.LJJ(20293, parcel), parcel);
    }
}
