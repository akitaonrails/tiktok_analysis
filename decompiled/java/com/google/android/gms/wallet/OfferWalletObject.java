package com.google.android.gms.wallet;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.OfferWalletObject;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* JADX INFO: loaded from: classes14.dex */
public final class OfferWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OfferWalletObject> CREATOR = new Parcelable.Creator() { // from class: X.0Wqk
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            String strLJII = null;
            String strLJII2 = null;
            CommonWalletObject commonWalletObject = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                commonWalletObject = (CommonWalletObject) C0W6J.LJI(parcel, i, CommonWalletObject.CREATOR);
                            }
                        } else {
                            strLJII2 = C0W6J.LJII(i, parcel);
                        }
                    } else {
                        strLJII = C0W6J.LJII(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new OfferWalletObject(iLJIJJLI, strLJII, strLJII2, commonWalletObject);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new OfferWalletObject[i];
        }
    };
    public final CommonWalletObject LL;
    public String zzb;
    public final int zzd;

    public OfferWalletObject() {
        this.zzd = 3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.zzd);
        C817940W6u.LJIJ(parcel, 3, this.zzb, false);
        C817940W6u.LJIIZILJ(parcel, 4, this.LL, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public OfferWalletObject(int i, String str, String str2, CommonWalletObject commonWalletObject) {
        this.zzd = i;
        this.zzb = str2;
        if (i < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.zza = str;
            this.LL = commonWalletObject2;
            return;
        }
        this.LL = commonWalletObject;
    }
}
