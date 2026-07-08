package com.ss.android.ugc.aweme.plugin.tooltipprotection;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class TooltipProtectionModel$TooltipDataProtection {

    @C09CT("enable_flow")
    public final Boolean enabled;

    @C09CT("protection")
    public final List<Integer> protection;

    @C09CT("remove")
    public final List<TooltipProtectionModel$TooltipsByScene> removeTooltips;

    @C09CT("priority")
    public final List<TooltipProtectionModel$TooltipsByScene> tooltipPriority;

    public TooltipProtectionModel$TooltipDataProtection(List<TooltipProtectionModel$TooltipsByScene> list, List<TooltipProtectionModel$TooltipsByScene> list2, List<Integer> list3, Boolean bool) {
        this.tooltipPriority = list;
        this.removeTooltips = list2;
        this.protection = list3;
        this.enabled = bool;
    }

    public TooltipProtectionModel$TooltipDataProtection(List list, List list2, List list3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C13BV.INSTANCE : list3, (i & 8) != 0 ? Boolean.FALSE : bool);
    }
}
