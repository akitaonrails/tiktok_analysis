package com.ss.android.ugc.aweme.feed.model.commercialize;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes24.dex */
public class CommerceSmartUIModel implements Serializable {

    @C09CT("playtime_ml")
    public CommerceSmartUIPlayTime playTime;

    @C09CT("commerce_ml_ui_strategy")
    public CommerceSmartUIStrategyConfig uiStrategy;

    public final CommerceSmartUIPlayTime getPlayTime() {
        return this.playTime;
    }

    public final CommerceSmartUIStrategyConfig getUiStrategy() {
        return this.uiStrategy;
    }

    public final void setPlayTime(CommerceSmartUIPlayTime commerceSmartUIPlayTime) {
        this.playTime = commerceSmartUIPlayTime;
    }

    public final void setUiStrategy(CommerceSmartUIStrategyConfig commerceSmartUIStrategyConfig) {
        this.uiStrategy = commerceSmartUIStrategyConfig;
    }
}
