package com.google.android.gms.fido.fido2.api.common;

import X.C0W0T;
import X.C0W3J;
import X.C786410Ut5;
import X.C817940W6u;
import X.C818940WAq;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public class PublicKeyCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new Parcelable.Creator() { // from class: X.12k5
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            String strLJII2 = null;
            byte[] bArrLIZJ = null;
            AuthenticatorAttestationResponse authenticatorAttestationResponse = null;
            AuthenticatorAssertionResponse authenticatorAssertionResponse = null;
            AuthenticatorErrorResponse authenticatorErrorResponse = null;
            AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = null;
            String strLJII3 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 1:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 2:
                        strLJII2 = C0W6J.LJII(i, parcel);
                        break;
                    case 3:
                        bArrLIZJ = C0W6J.LIZJ(i, parcel);
                        break;
                    case 4:
                        authenticatorAttestationResponse = (AuthenticatorAttestationResponse) C0W6J.LJI(parcel, i, AuthenticatorAttestationResponse.CREATOR);
                        break;
                    case 5:
                        authenticatorAssertionResponse = (AuthenticatorAssertionResponse) C0W6J.LJI(parcel, i, AuthenticatorAssertionResponse.CREATOR);
                        break;
                    case 6:
                        authenticatorErrorResponse = (AuthenticatorErrorResponse) C0W6J.LJI(parcel, i, AuthenticatorErrorResponse.CREATOR);
                        break;
                    case 7:
                        authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) C0W6J.LJI(parcel, i, AuthenticationExtensionsClientOutputs.CREATOR);
                        break;
                    case '\b':
                        strLJII3 = C0W6J.LJII(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new PublicKeyCredential(strLJII, strLJII2, bArrLIZJ, authenticatorAttestationResponse, authenticatorAssertionResponse, authenticatorErrorResponse, authenticationExtensionsClientOutputs, strLJII3);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new PublicKeyCredential[i];
        }
    };
    public final String zza;
    public final String zzb;
    public final byte[] zzc;
    public final AuthenticatorAttestationResponse zzd;
    public final AuthenticatorAssertionResponse zze;
    public final AuthenticatorErrorResponse zzf;
    public final AuthenticationExtensionsClientOutputs zzg;
    public final String zzh;

    public final AuthenticatorResponse LJLZ() {
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.zzd;
        if (authenticatorAttestationResponse != null) {
            return authenticatorAttestationResponse;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.zze;
        if (authenticatorAssertionResponse != null) {
            return authenticatorAssertionResponse;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = this.zzf;
        if (authenticatorErrorResponse != null) {
            return authenticatorErrorResponse;
        }
        throw new IllegalStateException("No response set.");
    }

    public final String LLFFF() {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            byte[] bArr = this.zzc;
            if (bArr != null && bArr.length > 0) {
                jSONObject2.put("rawId", C818940WAq.LIZ(bArr));
            }
            String str = this.zzh;
            if (str != null) {
                jSONObject2.put("authenticatorAttachment", str);
            }
            String str2 = this.zzb;
            if (str2 != null && this.zzf == null) {
                jSONObject2.put("type", str2);
            }
            String str3 = this.zza;
            if (str3 != null) {
                jSONObject2.put(FollowStatusChangeMethod.PARAM_UID, str3);
            }
            String str4 = "response";
            AuthenticatorAssertionResponse authenticatorAssertionResponse = this.zze;
            boolean z = true;
            if (authenticatorAssertionResponse != null) {
                jSONObject = authenticatorAssertionResponse.LJLZ();
            } else {
                AuthenticatorAttestationResponse authenticatorAttestationResponse = this.zzd;
                if (authenticatorAttestationResponse != null) {
                    jSONObject = authenticatorAttestationResponse.LJLZ();
                } else {
                    AuthenticatorErrorResponse authenticatorErrorResponse = this.zzf;
                    z = false;
                    if (authenticatorErrorResponse != null) {
                        try {
                            jSONObject = new JSONObject();
                            jSONObject.put("code", authenticatorErrorResponse.zza.getCode());
                            String str5 = authenticatorErrorResponse.zzb;
                            if (str5 != null) {
                                jSONObject.put("message", str5);
                            }
                            str4 = "error";
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                            throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e);
                        }
                    } else {
                        jSONObject = null;
                    }
                }
            }
            if (jSONObject != null) {
                jSONObject2.put(str4, jSONObject);
            }
            AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.zzg;
            if (authenticationExtensionsClientOutputs != null) {
                jSONObject2.put("clientExtensionResults", authenticationExtensionsClientOutputs.LJLZ());
            } else if (z) {
                jSONObject2.put("clientExtensionResults", new JSONObject());
            }
            return C786410Ut5.J3(jSONObject2);
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e2);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zze, this.zzd, this.zzf, this.zzg, this.zzh});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        if (!C0W0T.LIZIZ(this.zza, publicKeyCredential.zza) || !C0W0T.LIZIZ(this.zzb, publicKeyCredential.zzb) || !Arrays.equals(this.zzc, publicKeyCredential.zzc) || !C0W0T.LIZIZ(this.zzd, publicKeyCredential.zzd) || !C0W0T.LIZIZ(this.zze, publicKeyCredential.zze) || !C0W0T.LIZIZ(this.zzf, publicKeyCredential.zzf) || !C0W0T.LIZIZ(this.zzg, publicKeyCredential.zzg) || !C0W0T.LIZIZ(this.zzh, publicKeyCredential.zzh)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 1, this.zza, false);
        C817940W6u.LJIJ(parcel, 2, this.zzb, false);
        C817940W6u.LJ(parcel, 3, this.zzc, false);
        C817940W6u.LJIIZILJ(parcel, 4, this.zzd, i, false);
        C817940W6u.LJIIZILJ(parcel, 5, this.zze, i, false);
        C817940W6u.LJIIZILJ(parcel, 6, this.zzf, i, false);
        C817940W6u.LJIIZILJ(parcel, 7, this.zzg, i, false);
        C817940W6u.LJIJ(parcel, 8, this.zzh, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public PublicKeyCredential(String str, String str2, byte[] bArr, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3) {
        boolean z = true;
        if (authenticatorAttestationResponse == null ? authenticatorAssertionResponse == null ? authenticatorErrorResponse == null : authenticatorErrorResponse != null : authenticatorAssertionResponse != null || authenticatorErrorResponse != null) {
            z = false;
        }
        C0W3J.LIZIZ(z);
        this.zza = str;
        this.zzb = str2;
        this.zzc = bArr;
        this.zzd = authenticatorAttestationResponse;
        this.zze = authenticatorAssertionResponse;
        this.zzf = authenticatorErrorResponse;
        this.zzg = authenticationExtensionsClientOutputs;
        this.zzh = str3;
    }
}
