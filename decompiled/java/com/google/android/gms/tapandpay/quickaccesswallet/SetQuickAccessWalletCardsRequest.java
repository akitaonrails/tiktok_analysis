package com.google.android.gms.tapandpay.quickaccesswallet;

import X.C0W0T;
import X.C817940W6u;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard;
import com.google.android.gms.tapandpay.quickaccesswallet.SetQuickAccessWalletCardsRequest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class SetQuickAccessWalletCardsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetQuickAccessWalletCardsRequest> CREATOR = new Parcelable.Creator() { // from class: X.0W4q
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            Account account = null;
            int iLJIJJLI = 0;
            QuickAccessWalletCard[] quickAccessWalletCardArr = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            quickAccessWalletCardArr = (QuickAccessWalletCard[]) C0W6J.LJIIJ(parcel, i, QuickAccessWalletCard.CREATOR);
                        }
                    } else {
                        account = (Account) C0W6J.LJI(parcel, i, Account.CREATOR);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new SetQuickAccessWalletCardsRequest(iLJIJJLI, account, quickAccessWalletCardArr);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new SetQuickAccessWalletCardsRequest[i];
        }
    };
    public int zza;
    public Account zzb;
    public QuickAccessWalletCard[] zzc;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), this.zzb, Integer.valueOf(Arrays.hashCode(this.zzc))});
    }

    public SetQuickAccessWalletCardsRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetQuickAccessWalletCardsRequest) {
            SetQuickAccessWalletCardsRequest setQuickAccessWalletCardsRequest = (SetQuickAccessWalletCardsRequest) obj;
            if (C0W0T.LIZIZ(Integer.valueOf(this.zza), Integer.valueOf(setQuickAccessWalletCardsRequest.zza)) && C0W0T.LIZIZ(this.zzb, setQuickAccessWalletCardsRequest.zzb) && Arrays.equals(this.zzc, setQuickAccessWalletCardsRequest.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.zza);
        C817940W6u.LJIIZILJ(parcel, 2, this.zzb, i, false);
        C817940W6u.LJIJJLI(parcel, 3, this.zzc, i);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public SetQuickAccessWalletCardsRequest(int i, Account account, QuickAccessWalletCard[] quickAccessWalletCardArr) {
        this.zza = i;
        this.zzb = account;
        this.zzc = quickAccessWalletCardArr;
    }
}
