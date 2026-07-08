package com.google.android.gms.fido.u2f.api.common;

import X.C19840112jv;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes31.dex */
public class RegisterRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisterRequest> CREATOR = new Parcelable.Creator() { // from class: X.12ju
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            String strLJII2 = null;
            int iLJIJJLI = 0;
            byte[] bArrLIZJ = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                strLJII2 = C0W6J.LJII(i, parcel);
                            }
                        } else {
                            bArrLIZJ = C0W6J.LIZJ(i, parcel);
                        }
                    } else {
                        strLJII = C0W6J.LJII(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new RegisterRequest(iLJIJJLI, strLJII, strLJII2, bArrLIZJ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new RegisterRequest[i];
        }
    };
    public final int zza;
    public final ProtocolVersion zzb;
    public final byte[] zzc;
    public final String zzd;

    public final int hashCode() {
        int iHashCode = ((Arrays.hashCode(this.zzc) + 31) * 31) + this.zzb.hashCode();
        String str = this.zzd;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequest)) {
            return false;
        }
        RegisterRequest registerRequest = (RegisterRequest) obj;
        if (!Arrays.equals(this.zzc, registerRequest.zzc) || this.zzb != registerRequest.zzb) {
            return false;
        }
        String str = this.zzd;
        if (str == null) {
            if (registerRequest.zzd != null) {
                return false;
            }
        } else if (!str.equals(registerRequest.zzd)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.zza);
        C817940W6u.LJIJ(parcel, 2, this.zzb.toString(), false);
        C817940W6u.LJ(parcel, 3, this.zzc, false);
        C817940W6u.LJIJ(parcel, 4, this.zzd, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public RegisterRequest(int i, String str, String str2, byte[] bArr) {
        this.zza = i;
        try {
            this.zzb = ProtocolVersion.fromString(str);
            this.zzc = bArr;
            this.zzd = str2;
        } catch (C19840112jv e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalArgumentException(e);
        }
    }
}
