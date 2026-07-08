package com.ss.android.ugc.aweme.account.login.config;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class SignupConsentConfig {

    @C09CT("consent")
    public final BasicConfig consent;

    /* JADX WARN: Multi-variable type inference failed */
    public SignupConsentConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SignupConsentConfig) && Intrinsics.LJFF(this.consent, ((SignupConsentConfig) obj).consent);
    }

    public final int hashCode() {
        return this.consent.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SignupConsentConfig(consent=");
        sbLIZ.append(this.consent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SignupConsentConfig(BasicConfig basicConfig) {
        this.consent = basicConfig;
    }

    public /* synthetic */ SignupConsentConfig(BasicConfig basicConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new BasicConfig(true) : basicConfig);
    }
}
