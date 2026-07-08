package com.google.android.gms.fido.u2f.api.common;

import X.AbstractC19850812le;
import X.C0W0T;
import X.C19840112jv;
import X.C19840412jy;
import X.C19840612k0;
import X.C19851012lg;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.fido.u2f.api.common.RegisterResponseData;
import java.util.Arrays;

/* JADX INFO: loaded from: classes31.dex */
public class RegisterResponseData extends ResponseData {
    public static final Parcelable.Creator<RegisterResponseData> CREATOR = new Parcelable.Creator() { // from class: X.12jr
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            byte[] bArrLIZJ = null;
            String strLJII = null;
            String strLJII2 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            strLJII2 = C0W6J.LJII(i, parcel);
                        }
                    } else {
                        strLJII = C0W6J.LJII(i, parcel);
                    }
                } else {
                    bArrLIZJ = C0W6J.LIZJ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new RegisterResponseData(strLJII, strLJII2, bArrLIZJ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new RegisterResponseData[i];
        }
    };
    public final byte[] zza;
    public final ProtocolVersion zzb;
    public final String zzc;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, Integer.valueOf(Arrays.hashCode(this.zza)), this.zzc});
    }

    public final String toString() {
        C19840612k0 c19840612k0LIZ = C19840412jy.LIZ(this);
        c19840612k0LIZ.LIZ(this.zzb, "protocolVersion");
        C19851012lg c19851012lg = AbstractC19850812le.LIZ;
        byte[] bArr = this.zza;
        c19840612k0LIZ.LIZ(c19851012lg.LIZIZ(bArr, bArr.length), "registerData");
        String str = this.zzc;
        if (str != null) {
            c19840612k0LIZ.LIZ(str, "clientDataString");
        }
        return c19840612k0LIZ.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RegisterResponseData)) {
            return false;
        }
        RegisterResponseData registerResponseData = (RegisterResponseData) obj;
        if (!C0W0T.LIZIZ(this.zzb, registerResponseData.zzb) || !Arrays.equals(this.zza, registerResponseData.zza) || !C0W0T.LIZIZ(this.zzc, registerResponseData.zzc)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJ(parcel, 2, this.zza, false);
        C817940W6u.LJIJ(parcel, 3, this.zzb.toString(), false);
        C817940W6u.LJIJ(parcel, 4, this.zzc, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public RegisterResponseData(String str, String str2, byte[] bArr) {
        this.zza = bArr;
        try {
            this.zzb = ProtocolVersion.fromString(str);
            this.zzc = str2;
        } catch (C19840112jv e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalArgumentException(e);
        }
    }
}
