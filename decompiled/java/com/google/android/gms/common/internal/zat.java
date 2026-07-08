package com.google.android.gms.common.internal;

import X.C817940W6u;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;

/* JADX INFO: loaded from: classes14.dex */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new Parcelable.Creator<zat>() { // from class: X.0WlI
        @Override // android.os.Parcelable.Creator
        public final zat createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            Account account = null;
            GoogleSignInAccount googleSignInAccount = null;
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
                                googleSignInAccount = (GoogleSignInAccount) C0W6J.LJI(parcel, i, GoogleSignInAccount.CREATOR);
                            }
                        } else {
                            iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        }
                    } else {
                        account = (Account) C0W6J.LJI(parcel, i, Account.CREATOR);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zat(iLJIJJLI, account, iLJIJJLI2, googleSignInAccount);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ zat[] newArray(int i) {
            return new zat[i];
        }
    };
    public final int LL;
    public final Account zab;
    public final int zac;
    public final GoogleSignInAccount zad;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIIZILJ(parcel, 2, this.zab, i, false);
        C817940W6u.LJIIJ(parcel, 3, this.zac);
        C817940W6u.LJIIZILJ(parcel, 4, this.zad, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zat(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.LL = i;
        this.zab = account;
        this.zac = i2;
        this.zad = googleSignInAccount;
    }
}
