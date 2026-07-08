package com.google.android.gms.tapandpay.firstparty;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.zzj;

/* JADX INFO: loaded from: classes14.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new Parcelable.Creator() { // from class: X.0W6c
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            AccountInfo accountInfo = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 2) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    accountInfo = (AccountInfo) C0W6J.LJI(parcel, i, AccountInfo.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzj(accountInfo);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzj[i];
        }
    };
    public final AccountInfo LL;

    public zzj(AccountInfo accountInfo) {
        this.LL = accountInfo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 2, this.LL, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
