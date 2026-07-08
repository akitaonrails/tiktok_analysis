package com.ss.android.ugc.aweme.account.model;

import X.C09CT;
import X.C13BV;
import X.C15438062q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes20.dex */
public final class SafeEnvData {

    @C09CT("captcha")
    public final String captcha;

    @C09CT("desc_url")
    public final String desc_url;

    @C09CT("eligible_verification_methods")
    public final List<VerificationMethod> eligibleVerificationMethods;

    @C09CT("error_code")
    public final int errorCode;

    @C09CT("description")
    public final String errorDescription;

    @C09CT("passport_ticket")
    public final String passportTicket;

    @C09CT("safe")
    public final boolean safe;

    @C09CT("show_security_checkup")
    public final Boolean showSecurityCheckUp;

    @C09CT("two_step_verify_ways")
    public final List<TwoStepVerifyWays> twoStepVerifyWays;

    public final List<VerificationMethodType> LIZ() {
        List<VerificationMethod> list = this.eligibleVerificationMethods;
        if (list == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<VerificationMethod> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().type);
        }
        return arrayList;
    }

    public SafeEnvData(String str, String str2, String str3, int i, boolean z, String str4, List<VerificationMethod> list, List<TwoStepVerifyWays> list2, Boolean bool) {
        this.captcha = str;
        this.errorDescription = str2;
        this.desc_url = str3;
        this.errorCode = i;
        this.safe = z;
        this.passportTicket = str4;
        this.eligibleVerificationMethods = list;
        this.twoStepVerifyWays = list2;
        this.showSecurityCheckUp = bool;
    }

    public SafeEnvData(String str, String str2, String str3, int i, boolean z, String str4, List list, List list2, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? null : str3, i, z, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? C13BV.INSTANCE : list, (i2 & 128) != 0 ? C13BV.INSTANCE : list2, (i2 & 256) != 0 ? Boolean.FALSE : bool);
    }
}
