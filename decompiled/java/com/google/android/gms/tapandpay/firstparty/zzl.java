package com.google.android.gms.tapandpay.firstparty;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.zzl;

/* JADX INFO: loaded from: classes14.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new Parcelable.Creator() { // from class: X.0W6Z
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            CardInfo[] cardInfoArr = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 2) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    cardInfoArr = (CardInfo[]) C0W6J.LJIIJ(parcel, i, CardInfo.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzl(cardInfoArr);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzl[i];
        }
    };
    public final CardInfo[] LL;

    public zzl(CardInfo[] cardInfoArr) {
        this.LL = cardInfoArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJJLI(parcel, 2, this.LL, i);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
