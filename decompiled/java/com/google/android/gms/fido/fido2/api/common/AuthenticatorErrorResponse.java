package com.google.android.gms.fido.fido2.api.common;

import X.C0W0T;
import X.C1490970otz;
import X.C19840412jy;
import X.C19840612k0;
import X.C19840812k2;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import java.util.Arrays;

/* JADX INFO: loaded from: classes31.dex */
public class AuthenticatorErrorResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new Parcelable.Creator() { // from class: X.12k1
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            String strLJII = null;
            int iLJIJJLI2 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        }
                    } else {
                        strLJII = C0W6J.LJII(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new AuthenticatorErrorResponse(iLJIJJLI, strLJII, iLJIJJLI2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new AuthenticatorErrorResponse[i];
        }
    };
    public final ErrorCode zza;
    public final String zzb;
    public final int zzc;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, Integer.valueOf(this.zzc)});
    }

    public final String toString() {
        C19840612k0 c19840612k0LIZ = C19840412jy.LIZ(this);
        String strValueOf = String.valueOf(this.zza.getCode());
        C19840812k2 c19840812k2 = new C19840812k2();
        c19840612k0LIZ.LIZJ.LIZJ = c19840812k2;
        c19840612k0LIZ.LIZJ = c19840812k2;
        c19840812k2.LIZIZ = strValueOf;
        c19840812k2.LIZ = "errorCode";
        String str = this.zzb;
        if (str != null) {
            c19840612k0LIZ.LIZ(str, "errorMessage");
        }
        return c19840612k0LIZ.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        if (!C0W0T.LIZIZ(this.zza, authenticatorErrorResponse.zza) || !C0W0T.LIZIZ(this.zzb, authenticatorErrorResponse.zzb) || !C0W0T.LIZIZ(Integer.valueOf(this.zzc), Integer.valueOf(authenticatorErrorResponse.zzc))) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 2, this.zza.getCode());
        C817940W6u.LJIJ(parcel, 3, this.zzb, false);
        C817940W6u.LJIIJ(parcel, 4, this.zzc);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public AuthenticatorErrorResponse(int i, String str, int i2) {
        try {
            this.zza = ErrorCode.toErrorCode(i);
            this.zzb = str;
            this.zzc = i2;
        } catch (C1490970otz e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalArgumentException(e);
        }
    }
}
