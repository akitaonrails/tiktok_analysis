package com.ss.android.ugc.tiktok.pns;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes32.dex */
public final class FamilyPairingModel {
    public final Integer childrenCount;
    public final Long duration;
    public final Integer linkCount;
    public final GuardianRestrictionBean restriction;
    public final Integer userIdentity;

    public FamilyPairingModel() {
        this(1, new GuardianRestrictionBean(0, 0, 0, new PnSDoNotDisturbSettings(Boolean.FALSE, 0, 0, 0, 0), 0, 0, 0, 0, 0, new ArrayList(), false, new PnSScheduleBreakSettings(false, 0, 0, new ArrayList(), 0)), 0, 0, 0L);
    }

    public FamilyPairingModel(Integer num, GuardianRestrictionBean guardianRestrictionBean, Integer num2, Integer num3, Long l) {
        this.userIdentity = num;
        this.restriction = guardianRestrictionBean;
        this.childrenCount = num2;
        this.linkCount = num3;
        this.duration = l;
    }
}
