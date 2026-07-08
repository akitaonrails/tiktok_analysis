package com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.settings;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public final class EcButtonConfigSetting {

    @C09CT("config")
    public final Map<String, EcButtonConfig> configs;

    @C09CT("show_strategy")
    public final Integer showStrategy;

    public EcButtonConfigSetting() {
        this(null, null);
    }

    public EcButtonConfigSetting(Integer num, Map<String, EcButtonConfig> map) {
        this.showStrategy = num;
        this.configs = map;
    }
}
