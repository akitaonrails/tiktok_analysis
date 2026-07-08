package com.google.android.gms.auth.api.identity;

import X.C0W0T;
import X.C0W3J;
import X.C817940W6u;
import X.C836210WrD;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SignInPassword;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class SavePasswordRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new Parcelable.Creator() { // from class: X.0WrC
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            SignInPassword signInPassword = null;
            String strLJII = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        }
                    } else {
                        strLJII = C0W6J.LJII(i, parcel);
                    }
                } else {
                    signInPassword = (SignInPassword) C0W6J.LJI(parcel, i, SignInPassword.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new SavePasswordRequest(signInPassword, strLJII, iLJIJJLI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new SavePasswordRequest[i];
        }
    };
    public final SignInPassword zba;
    public final String zbb;
    public final int zbc;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zba, this.zbb});
    }

    public static C836210WrD LJLZ(SavePasswordRequest savePasswordRequest) {
        C836210WrD c836210WrD = new C836210WrD();
        c836210WrD.LIZ = savePasswordRequest.zba;
        c836210WrD.LIZJ = savePasswordRequest.zbc;
        String str = savePasswordRequest.zbb;
        if (str != null) {
            c836210WrD.LIZIZ = str;
        }
        return c836210WrD;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        if (!C0W0T.LIZIZ(this.zba, savePasswordRequest.zba) || !C0W0T.LIZIZ(this.zbb, savePasswordRequest.zbb) || this.zbc != savePasswordRequest.zbc) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 1, this.zba, i, false);
        C817940W6u.LJIJ(parcel, 2, this.zbb, false);
        C817940W6u.LJIIJ(parcel, 3, this.zbc);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public SavePasswordRequest(SignInPassword signInPassword, String str, int i) {
        C0W3J.LJIIIIZZ(signInPassword);
        this.zba = signInPassword;
        this.zbb = str;
        this.zbc = i;
    }
}
