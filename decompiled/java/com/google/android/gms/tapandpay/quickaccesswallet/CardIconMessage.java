package com.google.android.gms.tapandpay.quickaccesswallet;

import X.C0W0T;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.quickaccesswallet.CardIconMessage;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class CardIconMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CardIconMessage> CREATOR = new Parcelable.Creator() { // from class: X.0W4p
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int[] iArrLIZLLL = null;
            int iLJIJJLI = 0;
            String strLJII = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            strLJII = C0W6J.LJII(i, parcel);
                        }
                    } else {
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                    }
                } else {
                    iArrLIZLLL = C0W6J.LIZLLL(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new CardIconMessage(iLJIJJLI, strLJII, iArrLIZLLL);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new CardIconMessage[i];
        }
    };
    public int[] zza;
    public int zzb;
    public String zzc;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(this.zzb), this.zzc});
    }

    public CardIconMessage() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CardIconMessage) {
            CardIconMessage cardIconMessage = (CardIconMessage) obj;
            if (Arrays.equals(this.zza, cardIconMessage.zza) && C0W0T.LIZIZ(Integer.valueOf(this.zzb), Integer.valueOf(cardIconMessage.zzb)) && C0W0T.LIZIZ(this.zzc, cardIconMessage.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJJI(parcel, 1, this.zza);
        C817940W6u.LJIIJ(parcel, 2, this.zzb);
        C817940W6u.LJIJ(parcel, 3, this.zzc, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public CardIconMessage(int i, String str, int[] iArr) {
        this.zza = iArr;
        this.zzb = i;
        this.zzc = str;
    }
}
