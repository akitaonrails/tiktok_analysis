package com.ss.android.ugc.aweme.feed.model.banner;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class ConditionData implements Serializable {

    @C09CT("can_apply_appear")
    public boolean canApplyDisplay;

    @C09CT("can_apply_slot")
    public boolean canApplySlot;

    @C09CT("can_default_apply_display")
    public Boolean canDefaultApplyDisplay;

    @C09CT("can_default_apply_slot")
    public Boolean canDefaultApplySlot;

    @C09CT("can_default_apply_release")
    public Boolean canDefaultReleaseSlot;

    @C09CT("outreach_timings")
    public final List<String> outreachTimings;

    @C09CT("slot_consume_times")
    public int slotConsumeTimes;

    public ConditionData() {
        this(null, 1, null, null, null, false, false);
    }

    public final void setCanApplyDisplay(boolean z) {
        this.canApplyDisplay = z;
    }

    public final void setCanApplySlot(boolean z) {
        this.canApplySlot = z;
    }

    public final void setCanDefaultApplyDisplay(Boolean bool) {
        this.canDefaultApplyDisplay = bool;
    }

    public final void setCanDefaultApplySlot(Boolean bool) {
        this.canDefaultApplySlot = bool;
    }

    public final void setCanDefaultReleaseSlot(Boolean bool) {
        this.canDefaultReleaseSlot = bool;
    }

    public final void setSlotConsumeTimes(int i) {
        this.slotConsumeTimes = i;
    }

    public ConditionData(List<String> list, int i, Boolean bool, Boolean bool2, Boolean bool3, boolean z, boolean z2) {
        this.outreachTimings = list;
        this.slotConsumeTimes = i;
        this.canDefaultApplySlot = bool;
        this.canDefaultApplyDisplay = bool2;
        this.canDefaultReleaseSlot = bool3;
        this.canApplySlot = z;
        this.canApplyDisplay = z2;
    }
}
