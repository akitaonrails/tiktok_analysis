package com.bytedance.android.livesdk.subscribe.model.invite;

import X.C09CT;
import X.C13BV;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class SubEnable {

    @C09CT("can_enable")
    public boolean canEnable;

    @C09CT("condition_list")
    public List<SubEnableCondition> conditionList = C13BV.INSTANCE;

    @C09CT("use_new_eligibility")
    public boolean useNewEligibility;
}
