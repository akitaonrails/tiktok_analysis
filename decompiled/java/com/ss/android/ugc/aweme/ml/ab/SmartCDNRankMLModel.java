package com.ss.android.ugc.aweme.ml.ab;

import X.C09CT;
import com.ss.android.ugc.aweme.setting.model.MLModel;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartCDNRankMLModel extends MLModel {

    @C09CT("calcuate_throttle")
    public int calcuate_throttle = 2000;

    @C09CT("enabled")
    public boolean enabled;

    @C09CT("main_cdn_list")
    public List<Integer> main_cdn_list;

    @C09CT("strategy_config")
    public SmartCDNStrategyConfig strategy_config;

    public final int getCalcuate_throttle() {
        return this.calcuate_throttle;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final List<Integer> getMain_cdn_list() {
        return this.main_cdn_list;
    }

    public final SmartCDNStrategyConfig getStrategy_config() {
        return this.strategy_config;
    }

    public final void setCalcuate_throttle(int i) {
        this.calcuate_throttle = i;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setMain_cdn_list(List<Integer> list) {
        this.main_cdn_list = list;
    }

    public final void setStrategy_config(SmartCDNStrategyConfig smartCDNStrategyConfig) {
        this.strategy_config = smartCDNStrategyConfig;
    }
}
