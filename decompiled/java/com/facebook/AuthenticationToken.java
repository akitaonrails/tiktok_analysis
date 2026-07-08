package com.facebook;

import X.C0W7K;
import X.C2188811AlT;
import X.C821540WKq;
import X.C821590WKv;
import X.C854630Xfp;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public final class AuthenticationToken implements Parcelable {
    public final AuthenticationTokenClaims claims;
    public final String expectedNonce;
    public final AuthenticationTokenHeader header;
    public final String signature;
    public final String token;
    public static final C821590WKv Companion = new C821590WKv();
    public static final Parcelable.Creator<AuthenticationToken> CREATOR = new C854630Xfp(12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_string", this.token);
        jSONObject.put("expected_nonce", this.expectedNonce);
        AuthenticationTokenHeader authenticationTokenHeader = this.header;
        authenticationTokenHeader.getClass();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("alg", authenticationTokenHeader.alg);
        jSONObject2.put("typ", authenticationTokenHeader.typ);
        jSONObject2.put("kid", authenticationTokenHeader.kid);
        jSONObject.put("header", jSONObject2);
        jSONObject.put("claims", this.claims.LIZ());
        jSONObject.put("signature", this.signature);
        return jSONObject;
    }

    public final int hashCode() {
        return ((((((((527 + this.token.hashCode()) * 31) + this.expectedNonce.hashCode()) * 31) + this.header.hashCode()) * 31) + this.claims.hashCode()) * 31) + this.signature.hashCode();
    }

    public AuthenticationToken(Parcel parcel) {
        String string = parcel.readString();
        C0W7K.LJ(string, "token");
        this.token = string;
        String string2 = parcel.readString();
        C0W7K.LJ(string2, "expectedNonce");
        this.expectedNonce = string2;
        Parcelable parcelable = parcel.readParcelable(AuthenticationTokenHeader.class.getClassLoader());
        if (parcelable != null) {
            this.header = (AuthenticationTokenHeader) parcelable;
            Parcelable parcelable2 = parcel.readParcelable(AuthenticationTokenClaims.class.getClassLoader());
            if (parcelable2 != null) {
                this.claims = (AuthenticationTokenClaims) parcelable2;
                String string3 = parcel.readString();
                C0W7K.LJ(string3, "signature");
                this.signature = string3;
                return;
            }
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationToken)) {
            return false;
        }
        AuthenticationToken authenticationToken = (AuthenticationToken) obj;
        if (Intrinsics.LJFF(this.token, authenticationToken.token) && Intrinsics.LJFF(this.expectedNonce, authenticationToken.expectedNonce) && Intrinsics.LJFF(this.header, authenticationToken.header) && Intrinsics.LJFF(this.claims, authenticationToken.claims) && Intrinsics.LJFF(this.signature, authenticationToken.signature)) {
            return true;
        }
        return false;
    }

    public AuthenticationToken(String str, String str2) {
        C0W7K.LIZIZ(str, "token");
        C0W7K.LIZIZ(str2, "expectedNonce");
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() == 3) {
            String str3 = (String) listLJJLIIIJILLIZJL.get(0);
            String str4 = (String) listLJJLIIIJILLIZJL.get(1);
            String str5 = (String) listLJJLIIIJILLIZJL.get(2);
            this.token = str;
            this.expectedNonce = str2;
            AuthenticationTokenHeader authenticationTokenHeader = new AuthenticationTokenHeader(str3);
            this.header = authenticationTokenHeader;
            this.claims = new AuthenticationTokenClaims(str4, str2);
            try {
                String strLIZIZ = C821540WKq.LIZIZ(authenticationTokenHeader.kid);
                if (strLIZIZ != null) {
                    PublicKey publicKeyLIZ = C821540WKq.LIZ(strLIZIZ);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str3);
                    sbLIZ.append('.');
                    sbLIZ.append(str4);
                    if (C821540WKq.LIZJ(publicKeyLIZ, C2188811AlT.LIZIZ(sbLIZ), str5)) {
                        this.signature = str5;
                        return;
                    }
                }
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (InvalidKeySpecException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            "Invalid Signature".toString();
            throw new IllegalArgumentException("Invalid Signature");
        }
        "Invalid IdToken string".toString();
        throw new IllegalArgumentException("Invalid IdToken string");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.token);
        parcel.writeString(this.expectedNonce);
        parcel.writeParcelable(this.header, i);
        parcel.writeParcelable(this.claims, i);
        parcel.writeString(this.signature);
    }
}
