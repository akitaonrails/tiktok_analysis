package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class QuickCommentTranslateInOnEndConfig implements Serializable {

    @C09CT("fix_deferred_transit_in_guard")
    public final boolean fixDeferredTransitInGuard;

    @C09CT("ignore_strategy_adjustment_check")
    public final boolean ignoreStrategyAdjustmentCheck;

    @C09CT("only_invoke_on_end_when_visible")
    public final boolean onlyInvokeOnEndWhenVisible;

    @C09CT("reset_helper_on_rebind")
    public final boolean resetHelperOnRebind;

    public QuickCommentTranslateInOnEndConfig() {
        this(false, false, false, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickCommentTranslateInOnEndConfig)) {
            return false;
        }
        QuickCommentTranslateInOnEndConfig quickCommentTranslateInOnEndConfig = (QuickCommentTranslateInOnEndConfig) obj;
        return this.ignoreStrategyAdjustmentCheck == quickCommentTranslateInOnEndConfig.ignoreStrategyAdjustmentCheck && this.onlyInvokeOnEndWhenVisible == quickCommentTranslateInOnEndConfig.onlyInvokeOnEndWhenVisible && this.fixDeferredTransitInGuard == quickCommentTranslateInOnEndConfig.fixDeferredTransitInGuard && this.resetHelperOnRebind == quickCommentTranslateInOnEndConfig.resetHelperOnRebind;
    }

    public int hashCode() {
        return (((((C786410Ut5.Z2(this.ignoreStrategyAdjustmentCheck) * 31) + C786410Ut5.Z2(this.onlyInvokeOnEndWhenVisible)) * 31) + C786410Ut5.Z2(this.fixDeferredTransitInGuard)) * 31) + C786410Ut5.Z2(this.resetHelperOnRebind);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickCommentTranslateInOnEndConfig(ignoreStrategyAdjustmentCheck=");
        sbLIZ.append(this.ignoreStrategyAdjustmentCheck);
        sbLIZ.append(", onlyInvokeOnEndWhenVisible=");
        sbLIZ.append(this.onlyInvokeOnEndWhenVisible);
        sbLIZ.append(", fixDeferredTransitInGuard=");
        sbLIZ.append(this.fixDeferredTransitInGuard);
        sbLIZ.append(", resetHelperOnRebind=");
        sbLIZ.append(this.resetHelperOnRebind);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public QuickCommentTranslateInOnEndConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.ignoreStrategyAdjustmentCheck = z;
        this.onlyInvokeOnEndWhenVisible = z2;
        this.fixDeferredTransitInGuard = z3;
        this.resetHelperOnRebind = z4;
    }
}
