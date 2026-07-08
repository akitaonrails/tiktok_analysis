package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes32.dex */
public final class FamilyPairingBean {

    @C09CT("children_count")
    public final Integer childrenCount;

    @C09CT("duration_as_parent")
    public final Long duration;

    @C09CT("link_count")
    public final Integer linkCount;

    @C09CT("restriction")
    public final GuardianRestrictionBean restriction;

    @C09CT("user_identity")
    public final Integer userIdentity;

    public FamilyPairingBean() {
        this(1, new GuardianRestrictionBean(0, 0, 0, new DoNotDisturbSettings(Boolean.FALSE, 0, 0, 0, 0), 0, 0, 0, 0, 0, new ArrayList(), false, new ScheduleBreakSettings(false, 0, 0, new ArrayList(), 0), null, 0), 0, 0, 0L);
    }

    public FamilyPairingBean(Integer num, GuardianRestrictionBean guardianRestrictionBean, Integer num2, Integer num3, Long l) {
        this.userIdentity = num;
        this.restriction = guardianRestrictionBean;
        this.childrenCount = num2;
        this.linkCount = num3;
        this.duration = l;
    }
}
