package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC19850812le;
import X.C0W3J;
import X.C19840412jy;
import X.C19840612k0;
import X.C19851012lg;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import java.util.Arrays;

/* JADX INFO: loaded from: classes31.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new Parcelable.Creator() { // from class: X.12jq
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            byte[] bArrLIZJ = null;
            byte[] bArrLIZJ2 = null;
            byte[] bArrLIZJ3 = null;
            String[] strArrLJIIIIZZ = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                strArrLJIIIIZZ = C0W6J.LJIIIIZZ(i, parcel);
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
            return new AuthenticatorAttestationResponse(bArrLIZJ, bArrLIZJ2, bArrLIZJ3, strArrLJIIIIZZ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new AuthenticatorAttestationResponse[i];
        }
    };
    public final byte[] zza;
    public final byte[] zzb;
    public final byte[] zzc;
    public final String[] zzd;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(Arrays.hashCode(this.zzb)), Integer.valueOf(Arrays.hashCode(this.zzc))});
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0129 A[Catch: 12kg -> 0x0220, JSONException -> 0x0283, TRY_LEAVE, TryCatch #1 {12kg -> 0x0220, blocks: (B:35:0x00f8, B:40:0x0118, B:42:0x0129, B:47:0x0141, B:50:0x0161, B:52:0x017d, B:54:0x0183, B:55:0x01a1, B:56:0x01a6, B:57:0x01a7, B:58:0x01ac, B:63:0x01b7, B:65:0x01c6, B:67:0x01d8, B:68:0x01ef, B:69:0x01f4, B:70:0x01f5, B:71:0x01fa, B:77:0x021a, B:78:0x021f), top: B:115:0x00f8, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x021a A[Catch: 12kg -> 0x0220, JSONException -> 0x0283, TRY_ENTER, TryCatch #1 {12kg -> 0x0220, blocks: (B:35:0x00f8, B:40:0x0118, B:42:0x0129, B:47:0x0141, B:50:0x0161, B:52:0x017d, B:54:0x0183, B:55:0x01a1, B:56:0x01a6, B:57:0x01a7, B:58:0x01ac, B:63:0x01b7, B:65:0x01c6, B:67:0x01d8, B:68:0x01ef, B:69:0x01f4, B:70:0x01f5, B:71:0x01fa, B:77:0x021a, B:78:0x021f), top: B:115:0x00f8, outer: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LJLZ() {
        /*
            Method dump skipped, instruction units count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse.LJLZ():org.json.JSONObject");
    }

    public final String toString() {
        C19840612k0 c19840612k0LIZ = C19840412jy.LIZ(this);
        C19851012lg c19851012lg = AbstractC19850812le.LIZ;
        byte[] bArr = this.zza;
        c19840612k0LIZ.LIZ(c19851012lg.LIZIZ(bArr, bArr.length), "keyHandle");
        byte[] bArr2 = this.zzb;
        c19840612k0LIZ.LIZ(c19851012lg.LIZIZ(bArr2, bArr2.length), "clientDataJSON");
        byte[] bArr3 = this.zzc;
        c19840612k0LIZ.LIZ(c19851012lg.LIZIZ(bArr3, bArr3.length), "attestationObject");
        c19840612k0LIZ.LIZ(Arrays.toString(this.zzd), "transports");
        return c19840612k0LIZ.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        if (!Arrays.equals(this.zza, authenticatorAttestationResponse.zza) || !Arrays.equals(this.zzb, authenticatorAttestationResponse.zzb) || !Arrays.equals(this.zzc, authenticatorAttestationResponse.zzc)) {
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
        C817940W6u.LJIJI(parcel, 5, this.zzd);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        C0W3J.LJIIIIZZ(bArr);
        this.zza = bArr;
        C0W3J.LJIIIIZZ(bArr2);
        this.zzb = bArr2;
        C0W3J.LJIIIIZZ(bArr3);
        this.zzc = bArr3;
        C0W3J.LJIIIIZZ(strArr);
        this.zzd = strArr;
    }
}
