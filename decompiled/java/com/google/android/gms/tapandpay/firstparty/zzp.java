package com.google.android.gms.tapandpay.firstparty;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.zzp;

/* JADX INFO: loaded from: classes14.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new Parcelable.Creator() { // from class: X.0W6a
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            CardInfo[] cardInfoArr = null;
            AccountInfo accountInfo = null;
            String strLJII = null;
            String strLJII2 = null;
            SparseArray sparseArray = null;
            byte[] bArrLIZJ = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 2:
                        cardInfoArr = (CardInfo[]) C0W6J.LJIIJ(parcel, i, CardInfo.CREATOR);
                        break;
                    case 3:
                        accountInfo = (AccountInfo) C0W6J.LJI(parcel, i, AccountInfo.CREATOR);
                        break;
                    case 4:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 5:
                        strLJII2 = C0W6J.LJII(i, parcel);
                        break;
                    case 6:
                        int iLJJIFFI = C0W6J.LJJIFFI(i, parcel);
                        int iDataPosition = parcel.dataPosition();
                        if (iLJJIFFI == 0) {
                            sparseArray = null;
                        } else {
                            sparseArray = new SparseArray();
                            int i2 = parcel.readInt();
                            for (int i3 = 0; i3 < i2; i3++) {
                                sparseArray.append(parcel.readInt(), parcel.readString());
                            }
                            parcel.setDataPosition(iDataPosition + iLJJIFFI);
                        }
                        break;
                    case 7:
                        bArrLIZJ = C0W6J.LIZJ(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzp(cardInfoArr, accountInfo, strLJII, strLJII2, sparseArray, bArrLIZJ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzp[i];
        }
    };
    public final CardInfo[] LL;
    public final AccountInfo LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final SparseArray LLILZIL;
    public final byte[] LLILZLL;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJJLI(parcel, 2, this.LL, i);
        C817940W6u.LJIIZILJ(parcel, 3, this.LLILLJJLI, i, false);
        C817940W6u.LJIJ(parcel, 4, this.LLILLL, false);
        C817940W6u.LJIJ(parcel, 5, this.LLILZ, false);
        SparseArray sparseArray = this.LLILZIL;
        if (sparseArray != null) {
            int iLJJ2 = C817940W6u.LJJ(6, parcel);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(sparseArray.keyAt(i2));
                parcel.writeString((String) sparseArray.valueAt(i2));
            }
            C817940W6u.LJJI(iLJJ2, parcel);
        }
        C817940W6u.LJ(parcel, 7, this.LLILZLL, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzp(CardInfo[] cardInfoArr, AccountInfo accountInfo, String str, String str2, SparseArray sparseArray, byte[] bArr) {
        this.LL = cardInfoArr;
        this.LLILLJJLI = accountInfo;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = sparseArray;
        this.LLILZLL = bArr;
    }
}
