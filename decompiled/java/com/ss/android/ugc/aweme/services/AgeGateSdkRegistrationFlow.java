package com.ss.android.ugc.aweme.services;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes29.dex */
public final class AgeGateSdkRegistrationFlow {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AgeGateSdkRegistrationFlow[] $VALUES;
    public final int flow;
    public static final AgeGateSdkRegistrationFlow SIGN_UP = new AgeGateSdkRegistrationFlow("SIGN_UP", 0, 0);
    public static final AgeGateSdkRegistrationFlow LOGIN_CONSENT = new AgeGateSdkRegistrationFlow("LOGIN_CONSENT", 1, 1);
    public static final AgeGateSdkRegistrationFlow COMPONENT_PROVIDER = new AgeGateSdkRegistrationFlow("COMPONENT_PROVIDER", 2, 2);
    public static final AgeGateSdkRegistrationFlow NEW_COMPONENT = new AgeGateSdkRegistrationFlow("NEW_COMPONENT", 3, 3);

    public static final /* synthetic */ AgeGateSdkRegistrationFlow[] $values() {
        return new AgeGateSdkRegistrationFlow[]{SIGN_UP, LOGIN_CONSENT, COMPONENT_PROVIDER, NEW_COMPONENT};
    }

    public static InterfaceC2044707zh<AgeGateSdkRegistrationFlow> getEntries() {
        return $ENTRIES;
    }

    static {
        AgeGateSdkRegistrationFlow[] ageGateSdkRegistrationFlowArr$values = $values();
        $VALUES = ageGateSdkRegistrationFlowArr$values;
        $ENTRIES = new C2254308sP(ageGateSdkRegistrationFlowArr$values);
    }

    public static AgeGateSdkRegistrationFlow[] values() {
        return (AgeGateSdkRegistrationFlow[]) $VALUES.clone();
    }

    public final int getFlow() {
        return this.flow;
    }

    public static AgeGateSdkRegistrationFlow valueOf(String str) {
        return (AgeGateSdkRegistrationFlow) C08FF.LIZ(AgeGateSdkRegistrationFlow.class, str);
    }

    public AgeGateSdkRegistrationFlow(String str, int i, int i2) {
        this.flow = i2;
    }
}
