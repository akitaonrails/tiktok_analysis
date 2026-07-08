package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class CustomDotResponseV2 {

    @C09CT("bring_back_info")
    public String bringBackInfo;

    @C09CT("display_delay_time_ms")
    public final Long displayDelayTimeMs;

    @C09CT("generated_session_id")
    public final String generatedSessionId;

    @C09CT("reach_cfg_list")
    public final List<ReachCfg> reachConfigList;

    @C09CT("ui_action")
    public final Integer uiAction;

    @C09CT("waiting_time_s")
    public final long waitingTime;

    public CustomDotResponseV2(List<ReachCfg> list, String str, Integer num, String str2, long j, Long l) {
        this.reachConfigList = list;
        this.bringBackInfo = str;
        this.uiAction = num;
        this.generatedSessionId = str2;
        this.waitingTime = j;
        this.displayDelayTimeMs = l;
    }
}
