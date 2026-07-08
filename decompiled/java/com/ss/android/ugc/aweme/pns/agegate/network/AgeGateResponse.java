package com.ss.android.ugc.aweme.pns.agegate.network;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class AgeGateResponse extends BaseResponse {

    @C09CT("age_gate_post_action")
    public final Integer ageGatePostAction;

    @C09CT("is_mixed_age")
    public final Boolean isMixedAge;

    @C09CT("is_prompt")
    public final boolean is_prompt;

    @C09CT("need_screen_time_reminder")
    public final Boolean needScreenTimeReminder;

    @C09CT("register_age_gate_post_action")
    public final Integer registerAgeGatePostAction;

    @C09CT("supplement_action")
    public final Integer supplementAction;

    public AgeGateResponse() {
        this(false, null, null, null, null, null);
    }

    public final Integer getAgeGatePostAction() {
        return this.ageGatePostAction;
    }

    public final Boolean getNeedScreenTimeReminder() {
        return this.needScreenTimeReminder;
    }

    public final Integer getRegisterAgeGatePostAction() {
        return this.registerAgeGatePostAction;
    }

    public final Integer getSupplementAction() {
        return this.supplementAction;
    }

    public final Boolean isMixedAge() {
        return this.isMixedAge;
    }

    public final boolean is_prompt() {
        return this.is_prompt;
    }

    public AgeGateResponse(boolean z, Integer num, Integer num2, Boolean bool, Integer num3, Boolean bool2) {
        super(0, "", null);
        this.is_prompt = z;
        this.registerAgeGatePostAction = num;
        this.ageGatePostAction = num2;
        this.isMixedAge = bool;
        this.supplementAction = num3;
        this.needScreenTimeReminder = bool2;
    }
}
