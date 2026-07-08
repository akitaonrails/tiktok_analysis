package com.bytedance.bpea.cert.token;

import X.AbstractC1202400hOY;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class TokenCert extends AbstractC1202400hOY {
    public static final Companion Companion = new Companion();
    public String authKey;
    public final String token;

    public static final TokenCert with(String str) {
        return Companion.with(str);
    }

    public final TokenCert copy(String str) {
        return new TokenCert(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TokenCert) && Intrinsics.LJFF(this.token, ((TokenCert) obj).token);
    }

    public int hashCode() {
        String str = this.token;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // X.AbstractC1202400hOY
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TokenCert(token=");
        sbLIZ.append(this.token);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1202400hOY, com.bytedance.bpea.basics.Cert
    public String authKey() {
        return this.authKey;
    }

    public final String getToken() {
        return this.token;
    }

    public static final class Companion {
        public final TokenCert with(String str) {
            return new TokenCert(str);
        }
    }

    public TokenCert(String str) {
        super(str, "TokenCert");
        this.token = str;
    }

    public final TokenCert auth(String str) {
        this.authKey = str;
        return this;
    }
}
