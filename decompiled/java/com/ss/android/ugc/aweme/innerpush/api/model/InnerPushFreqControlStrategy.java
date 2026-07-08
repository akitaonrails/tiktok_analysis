package com.ss.android.ugc.aweme.innerpush.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class InnerPushFreqControlStrategy implements Serializable {

    @C09CT("ban_strategy")
    public final InnerPushBanStrategy banStrategy;

    @C09CT("popup_limit_strategies")
    public final List<InnerPushPopupLimitStrategy> popupLimitStrategies;

    public InnerPushFreqControlStrategy() {
        this(null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InnerPushFreqControlStrategy(popupLimitStrategies=");
        sbLIZ.append(this.popupLimitStrategies);
        sbLIZ.append(", banStrategy=");
        sbLIZ.append(this.banStrategy);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InnerPushFreqControlStrategy(List<InnerPushPopupLimitStrategy> list, InnerPushBanStrategy innerPushBanStrategy) {
        this.popupLimitStrategies = list;
        this.banStrategy = innerPushBanStrategy;
    }
}
