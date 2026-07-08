package com.google.android.gms.auth.api.signin.internal;

import X.C0W3J;
import X.C817940W6u;
import X.C833460Wmm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes14.dex */
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new Parcelable.Creator() { // from class: X.0Wml
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            GoogleSignInOptions googleSignInOptions = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 5) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) C0W6J.LJI(parcel, i, GoogleSignInOptions.CREATOR);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new SignInConfiguration(strLJII, googleSignInOptions);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new SignInConfiguration[i];
        }
    };
    public final String zba;
    public final GoogleSignInOptions zbb;

    public final int hashCode() {
        C833460Wmm c833460Wmm = new C833460Wmm();
        c833460Wmm.LIZ(this.zba);
        c833460Wmm.LIZ(this.zbb);
        return c833460Wmm.LIZ;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.zba.equals(signInConfiguration.zba)) {
            GoogleSignInOptions googleSignInOptions = this.zbb;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.zbb;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        C0W3J.LJI(str);
        this.zba = str;
        this.zbb = googleSignInOptions;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 2, this.zba, false);
        C817940W6u.LJIIZILJ(parcel, 5, this.zbb, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
