package com.google.android.gms.wallet;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.CardInfo;

/* JADX INFO: loaded from: classes14.dex */
public final class CardInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CardInfo> CREATOR = new Parcelable.Creator() { // from class: X.0WpC
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            String strLJII2 = null;
            String strLJII3 = null;
            UserAddress userAddress = null;
            int iLJIJJLI = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                if (c != 5) {
                                    C0W6J.LJJII(i, parcel);
                                } else {
                                    userAddress = (UserAddress) C0W6J.LJI(parcel, i, UserAddress.CREATOR);
                                }
                            } else {
                                iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                            }
                        } else {
                            strLJII3 = C0W6J.LJII(i, parcel);
                        }
                    } else {
                        strLJII2 = C0W6J.LJII(i, parcel);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new CardInfo(strLJII, strLJII2, strLJII3, iLJIJJLI, userAddress);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new CardInfo[i];
        }
    };
    public final int LL;
    public String zza;
    public String zzb;
    public String zzc;
    public UserAddress zze;

    public CardInfo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 1, this.zza, false);
        C817940W6u.LJIJ(parcel, 2, this.zzb, false);
        C817940W6u.LJIJ(parcel, 3, this.zzc, false);
        C817940W6u.LJIIJ(parcel, 4, this.LL);
        C817940W6u.LJIIZILJ(parcel, 5, this.zze, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public CardInfo(String str, String str2, String str3, int i, UserAddress userAddress) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.LL = i;
        this.zze = userAddress;
    }
}
