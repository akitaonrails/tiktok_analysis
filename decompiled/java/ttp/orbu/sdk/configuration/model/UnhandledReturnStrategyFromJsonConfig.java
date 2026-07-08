package ttp.orbu.sdk.configuration.model;

import X.C08FF;

/* JADX INFO: loaded from: classes9.dex */
public enum UnhandledReturnStrategyFromJsonConfig {
    allow,
    deny;

    public static UnhandledReturnStrategyFromJsonConfig valueOf(String str) {
        return (UnhandledReturnStrategyFromJsonConfig) C08FF.LIZ(UnhandledReturnStrategyFromJsonConfig.class, str);
    }
}
