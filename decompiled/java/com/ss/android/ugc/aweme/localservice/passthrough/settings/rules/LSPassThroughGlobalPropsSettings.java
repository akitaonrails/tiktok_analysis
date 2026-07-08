package com.ss.android.ugc.aweme.localservice.passthrough.settings.rules;

import X.AnonymousClass0206;
import X.C01GW;
import X.C452501pT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LSPassThroughGlobalPropsSettings {
    public static final LSPassThroughGlobalPropsSettings INSTANCE = new LSPassThroughGlobalPropsSettings();
    public static final GlobalPropsParamsConfig defaultConfig = new GlobalPropsParamsConfig(null);
    public static final C01GW config$delegate = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(195));

    public final GlobalPropsParamsConfig getConfig() {
        return (GlobalPropsParamsConfig) config$delegate.getValue();
    }

    public final boolean enable() {
        GlobalPropsParamRules globalPropsParamRules;
        GlobalPropsParamsConfig config = getConfig();
        return (config == null || (globalPropsParamRules = config.globalPropsRules) == null || !globalPropsParamRules.enable) ? false : true;
    }

    public final List<GlobalPropsParamsConfigRule> getRules() {
        GlobalPropsParamRules globalPropsParamRules;
        GlobalPropsParamsConfig config = getConfig();
        if (config == null || (globalPropsParamRules = config.globalPropsRules) == null) {
            return null;
        }
        return globalPropsParamRules.rules;
    }

    public final GlobalPropsParamsConfig getDefaultConfig() {
        return defaultConfig;
    }
}
