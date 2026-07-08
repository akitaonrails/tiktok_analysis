package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC19850812le;
import X.C0W3J;
import X.C19840412jy;
import X.C19840612k0;
import X.C19851012lg;
import X.C817940W6u;
import X.C818940WAq;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new Parcelable.Creator() { // from class: X.12k4
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            byte[] bArrLIZJ = null;
            byte[] bArrLIZJ2 = null;
            byte[] bArrLIZJ3 = null;
            byte[] bArrLIZJ4 = null;
            byte[] bArrLIZJ5 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                if (c != 6) {
                                    C0W6J.LJJII(i, parcel);
                                } else {
                                    bArrLIZJ5 = C0W6J.LIZJ(i, parcel);
                                }
                            } else {
                                bArrLIZJ4 = C0W6J.LIZJ(i, parcel);
                            }
                        } else {
                            bArrLIZJ3 = C0W6J.LIZJ(i, parcel);
                        }
                    } else {
                        bArrLIZJ2 = C0W6J.LIZJ(i, parcel);
                    }
                } else {
                    bArrLIZJ = C0W6J.LIZJ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new AuthenticatorAssertionResponse(bArrLIZJ, bArrLIZJ2, bArrLIZJ3, bArrLIZJ4, bArrLIZJ5);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new AuthenticatorAssertionResponse[i];
        }
    };
    public final byte[] zza;
    public final byte[] zzb;
    public final byte[] zzc;
    public final byte[] zzd;
    public final byte[] zze;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(Arrays.hashCode(this.zzb)), Integer.valueOf(Arrays.hashCode(this.zzc)), Integer.valueOf(Arrays.hashCode(this.zzd)), Integer.valueOf(Arrays.hashCode(this.zze))});
    }

    public final JSONObject LJLZ() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", C818940WAq.LIZ(this.zzb));
            jSONObject.put("authenticatorData", C818940WAq.LIZ(this.zzc));
            jSONObject.put("signature", C818940WAq.LIZ(this.zzd));
            byte[] bArr = this.zze;
            if (bArr != null) {
                jSONObject.put("userHandle", C818940WAq.LIZ(bArr));
            }
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e);
        }
    }

    public final String toString() {
        C19840612k0 c19840612k0LIZ = C19840412jy.LIZ(this);
        C19851012lg c19851012lg = AbstractC19850812le.LIZ;
        byte[] bArr = this.zza;
        c19840612k0LIZ.LIZ(c19851012lg.LIZIZ(bArr, bArr.length), "keyHandle");
        byte[] bArr2 = this.zzb;
        c19840612k0LIZ.LIZ(c19851012lg.LIZIZ(bArr2, bArr2.length), "clientDataJSON");
        byte[] bArr3 = this.zzc;
        c19840612k0LIZ.LIZ(c19851012lg.LIZIZ(bArr3, bArr3.length), "authenticatorData");
        byte[] bArr4 = this.zzd;
        c19840612k0LIZ.LIZ(c19851012lg.LIZIZ(bArr4, bArr4.length), "signature");
        byte[] bArr5 = this.zze;
        if (bArr5 != null) {
            c19840612k0LIZ.LIZ(c19851012lg.LIZIZ(bArr5, bArr5.length), "userHandle");
        }
        return c19840612k0LIZ.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        if (!Arrays.equals(this.zza, authenticatorAssertionResponse.zza) || !Arrays.equals(this.zzb, authenticatorAssertionResponse.zzb) || !Arrays.equals(this.zzc, authenticatorAssertionResponse.zzc) || !Arrays.equals(this.zzd, authenticatorAssertionResponse.zzd) || !Arrays.equals(this.zze, authenticatorAssertionResponse.zze)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJ(parcel, 2, this.zza, false);
        C817940W6u.LJ(parcel, 3, this.zzb, false);
        C817940W6u.LJ(parcel, 4, this.zzc, false);
        C817940W6u.LJ(parcel, 5, this.zzd, false);
        C817940W6u.LJ(parcel, 6, this.zze, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public AuthenticatorAssertionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        C0W3J.LJIIIIZZ(bArr);
        this.zza = bArr;
        C0W3J.LJIIIIZZ(bArr2);
        this.zzb = bArr2;
        C0W3J.LJIIIIZZ(bArr3);
        this.zzc = bArr3;
        C0W3J.LJIIIIZZ(bArr4);
        this.zzd = bArr4;
        this.zze = bArr5;
    }
}
