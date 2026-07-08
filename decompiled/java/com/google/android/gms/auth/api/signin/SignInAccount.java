package com.google.android.gms.auth.api.signin;

import X.C0W3J;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes14.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new Parcelable.Creator() { // from class: X.0WnB
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = "";
            GoogleSignInAccount googleSignInAccount = null;
            String strLJII2 = "";
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 4) {
                    if (c != 7) {
                        if (c != '\b') {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            strLJII2 = C0W6J.LJII(i, parcel);
                        }
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) C0W6J.LJI(parcel, i, GoogleSignInAccount.CREATOR);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new SignInAccount(strLJII, googleSignInAccount, strLJII2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new SignInAccount[i];
        }
    };
    public final String LL;
    public final String LLILLJJLI;
    public final GoogleSignInAccount zbc;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 4, this.LL, false);
        C817940W6u.LJIIZILJ(parcel, 7, this.zbc, i, false);
        C817940W6u.LJIJ(parcel, 8, this.LLILLJJLI, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.zbc = googleSignInAccount;
        C0W3J.LJFF("8.3 and 8.4 SDKs require non-null email", str);
        this.LL = str;
        C0W3J.LJFF("8.3 and 8.4 SDKs require non-null userId", str2);
        this.LLILLJJLI = str2;
    }
}
