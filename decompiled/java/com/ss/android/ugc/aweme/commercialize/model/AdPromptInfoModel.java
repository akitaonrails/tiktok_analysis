package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdPromptInfoModel implements Serializable {

    @C09CT("button_strategy")
    public AdButtonStrategyModel buttonStrategy;

    @C09CT("card_strategy")
    public AdCardStrategyModel cardStrategy;

    public AdPromptInfoModel() {
        this(null, null);
    }

    public final AdButtonStrategyModel getButtonStrategy() {
        return this.buttonStrategy;
    }

    public final AdCardStrategyModel getCardStrategy() {
        return this.cardStrategy;
    }

    public final void setButtonStrategy(AdButtonStrategyModel adButtonStrategyModel) {
        this.buttonStrategy = adButtonStrategyModel;
    }

    public final void setCardStrategy(AdCardStrategyModel adCardStrategyModel) {
        this.cardStrategy = adCardStrategyModel;
    }

    public AdPromptInfoModel(AdButtonStrategyModel adButtonStrategyModel, AdCardStrategyModel adCardStrategyModel) {
        this.buttonStrategy = adButtonStrategyModel;
        this.cardStrategy = adCardStrategyModel;
    }
}
