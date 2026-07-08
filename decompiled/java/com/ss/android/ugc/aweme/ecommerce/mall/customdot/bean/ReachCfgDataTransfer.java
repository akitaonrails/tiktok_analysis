package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

/* JADX INFO: loaded from: classes27.dex */
public final class ReachCfgDataTransfer {
    public final Boolean isNewSession;
    public final ReachCfg reachCfg;
    public final ReachCfgData reachCfgData;
    public final CustomDotResponseV2 response;

    public final Boolean isNewSession() {
        return this.isNewSession;
    }

    public ReachCfgDataTransfer(CustomDotResponseV2 customDotResponseV2, ReachCfg reachCfg, ReachCfgData reachCfgData, Boolean bool) {
        this.response = customDotResponseV2;
        this.reachCfg = reachCfg;
        this.reachCfgData = reachCfgData;
        this.isNewSession = bool;
    }
}
