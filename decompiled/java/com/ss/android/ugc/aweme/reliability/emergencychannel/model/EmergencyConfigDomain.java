package com.ss.android.ugc.aweme.reliability.emergencychannel.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class EmergencyConfigDomain {

    @C09CT("libra")
    public static final EmergencyConfigDomain LIBRA;
    public static final /* synthetic */ EmergencyConfigDomain[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("unknown")
    public static final EmergencyConfigDomain UNKNOWN;

    public static InterfaceC2044707zh<EmergencyConfigDomain> getEntries() {
        return LLILLJJLI;
    }

    static {
        EmergencyConfigDomain emergencyConfigDomain = new EmergencyConfigDomain("LIBRA", 0);
        LIBRA = emergencyConfigDomain;
        EmergencyConfigDomain emergencyConfigDomain2 = new EmergencyConfigDomain("UNKNOWN", 1);
        UNKNOWN = emergencyConfigDomain2;
        EmergencyConfigDomain[] emergencyConfigDomainArr = {emergencyConfigDomain, emergencyConfigDomain2};
        LL = emergencyConfigDomainArr;
        LLILLJJLI = new C2254308sP(emergencyConfigDomainArr);
    }

    public static EmergencyConfigDomain[] values() {
        return (EmergencyConfigDomain[]) LL.clone();
    }

    public static EmergencyConfigDomain valueOf(String str) {
        return (EmergencyConfigDomain) C08FF.LIZ(EmergencyConfigDomain.class, str);
    }

    public EmergencyConfigDomain(String str, int i) {
    }
}
