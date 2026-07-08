package com.facebook;

import X.C0W7K;
import X.C786410Ut5;
import X.C821550WKr;
import X.C854630Xfp;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class AuthenticationTokenHeader implements Parcelable {
    public final String alg;
    public final String kid;
    public final String typ;
    public static final C821550WKr Companion = new Object() { // from class: X.0WKr
    };
    public static final Parcelable.Creator<AuthenticationTokenHeader> CREATOR = new C854630Xfp(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return ((((527 + this.alg.hashCode()) * 31) + this.typ.hashCode()) * 31) + this.kid.hashCode();
    }

    public final String toString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.alg);
        jSONObject.put("typ", this.typ);
        jSONObject.put("kid", this.kid);
        return C786410Ut5.J3(jSONObject);
    }

    public AuthenticationTokenHeader(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        C0W7K.LIZIZ(str, "encodedHeaderString");
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(str, 0), Charsets.UTF_8));
            String strOptString = jSONObject.optString("alg");
            if (strOptString.length() > 0 && Intrinsics.LJFF(strOptString, "RS256")) {
                z = true;
            } else {
                z = false;
            }
            if (jSONObject.optString("kid").length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (jSONObject.optString("typ").length() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z && z2 && z3) {
                JSONObject jSONObject2 = new JSONObject(new String(Base64.decode(str, 0), Charsets.UTF_8));
                this.alg = jSONObject2.getString("alg");
                this.typ = jSONObject2.getString("typ");
                this.kid = jSONObject2.getString("kid");
                return;
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        "Invalid Header".toString();
        throw new IllegalArgumentException("Invalid Header");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationTokenHeader)) {
            return false;
        }
        AuthenticationTokenHeader authenticationTokenHeader = (AuthenticationTokenHeader) obj;
        if (Intrinsics.LJFF(this.alg, authenticationTokenHeader.alg) && Intrinsics.LJFF(this.typ, authenticationTokenHeader.typ) && Intrinsics.LJFF(this.kid, authenticationTokenHeader.kid)) {
            return true;
        }
        return false;
    }

    public AuthenticationTokenHeader(Parcel parcel) {
        String string = parcel.readString();
        C0W7K.LJ(string, "alg");
        this.alg = string;
        String string2 = parcel.readString();
        C0W7K.LJ(string2, "typ");
        this.typ = string2;
        String string3 = parcel.readString();
        C0W7K.LJ(string3, "kid");
        this.kid = string3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.alg);
        parcel.writeString(this.typ);
        parcel.writeString(this.kid);
    }
}
