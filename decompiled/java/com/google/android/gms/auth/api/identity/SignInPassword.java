package com.google.android.gms.auth.api.identity;

import X.C0W0T;
import X.C0W3J;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SignInPassword;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class SignInPassword extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInPassword> CREATOR = new Parcelable.Creator() { // from class: X.0WrE
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            String strLJII2 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        strLJII2 = C0W6J.LJII(i, parcel);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new SignInPassword(strLJII, strLJII2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new SignInPassword[i];
        }
    };
    public final String zba;
    public final String zbb;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zba, this.zbb});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj;
        if (!C0W0T.LIZIZ(this.zba, signInPassword.zba) || !C0W0T.LIZIZ(this.zbb, signInPassword.zbb)) {
            return false;
        }
        return true;
    }

    public SignInPassword(String str, String str2) {
        C0W3J.LJIIIZ(str, "Account identifier cannot be null");
        String strTrim = str.trim();
        C0W3J.LJFF("Account identifier cannot be empty", strTrim);
        this.zba = strTrim;
        C0W3J.LJI(str2);
        this.zbb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 1, this.zba, false);
        C817940W6u.LJIJ(parcel, 2, this.zbb, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
