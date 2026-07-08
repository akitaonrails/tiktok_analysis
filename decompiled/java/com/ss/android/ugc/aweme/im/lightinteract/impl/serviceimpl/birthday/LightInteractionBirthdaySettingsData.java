package com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.birthday;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.im.lightinteract.impl.model.LightInteractionFrequencyControlRule;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class LightInteractionBirthdaySettingsData {

    @C09CT("rule_list")
    public final List<LightInteractionFrequencyControlRule> ruleList;

    public LightInteractionBirthdaySettingsData() {
        this(null, 1, null);
    }

    public LightInteractionBirthdaySettingsData(List<LightInteractionFrequencyControlRule> list) {
        this.ruleList = list;
    }

    public LightInteractionBirthdaySettingsData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
