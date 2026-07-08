package com.google.android.gms.auth;

import X.C817940W6u;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes14.dex */
public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new Parcelable.Creator() { // from class: X.0W4s
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            String strLJII = null;
            Account account = null;
            int iLJIJJLI2 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                account = (Account) C0W6J.LJI(parcel, i, Account.CREATOR);
                            }
                        } else {
                            strLJII = C0W6J.LJII(i, parcel);
                        }
                    } else {
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new AccountChangeEventsRequest(iLJIJJLI, iLJIJJLI2, strLJII, account);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new AccountChangeEventsRequest[i];
        }
    };
    public final int LL;
    public int zzb;
    public String zzc;
    public Account zzd;

    public AccountChangeEventsRequest() {
        this.LL = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIIJ(parcel, 2, this.zzb);
        C817940W6u.LJIJ(parcel, 3, this.zzc, false);
        C817940W6u.LJIIZILJ(parcel, 4, this.zzd, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public AccountChangeEventsRequest(int i, int i2, String str, Account account) {
        this.LL = i;
        this.zzb = i2;
        this.zzc = str;
        if (account == null && !TextUtils.isEmpty(str)) {
            this.zzd = new Account(str, "com.google");
        } else {
            this.zzd = account;
        }
    }
}
