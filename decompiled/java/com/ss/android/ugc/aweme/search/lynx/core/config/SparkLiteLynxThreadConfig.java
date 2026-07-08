package com.ss.android.ugc.aweme.search.lynx.core.config;

import X.C09CT;
import X.C13BV;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SparkLiteLynxThreadConfig {

    @C09CT("enable_general_double_switch")
    public List<String> doubleSwitchRenderList;

    @C09CT("enable_transfer_switch_to_engine")
    public boolean enableTransferSwitchToEngineAfterRender;

    @C09CT("enable_transfer_switch_to_main")
    public boolean enableTransferSwitchToMainBeforeRender;

    @C09CT("disable_general_switch_to_engine_list")
    public List<String> switchToEngineAfterRenderBlackList;

    @C09CT("enable_general_switch_to_engine_list")
    public List<String> switchToEngineAfterRenderWhiteList;

    @C09CT("disable_general_switch_to_main_list")
    public List<String> switchToMainBeforeRenderBlackList;

    @C09CT("enable_general_switch_to_main_list")
    public List<String> switchToMainBeforeRenderList;

    public SparkLiteLynxThreadConfig() {
        C13BV c13bv = C13BV.INSTANCE;
        this.switchToMainBeforeRenderList = c13bv;
        this.switchToEngineAfterRenderWhiteList = c13bv;
        this.doubleSwitchRenderList = c13bv;
        this.switchToEngineAfterRenderBlackList = c13bv;
        this.switchToMainBeforeRenderBlackList = c13bv;
    }
}
