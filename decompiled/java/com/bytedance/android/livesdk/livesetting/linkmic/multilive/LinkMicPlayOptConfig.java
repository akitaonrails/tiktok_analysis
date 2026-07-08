package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class LinkMicPlayOptConfig {
    public static final TypeAdapter ADAPTER = new LinkMicPlayOptConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("code_tech_switch_for_live_show")
    public int codeTechSwitchForLiveShow;

    @C09CT("code_tech_switch_for_mutual_exclusion")
    public int codeTechSwitchForMutualExclusion;

    @C09CT("entity_show_setting_page_time_out")
    public long entityShowSettingPageTimeOut;

    @C09CT("force_delay")
    public boolean isForceDelay;

    @C09CT("mutex_finish_delay_time")
    public long mutexFinishDelayTime;

    public LinkMicPlayOptConfig() {
        this(1, 1, 10000L, false, 15000L);
    }

    public LinkMicPlayOptConfig(int i, int i2, long j, boolean z, long j2) {
        this.codeTechSwitchForLiveShow = i;
        this.codeTechSwitchForMutualExclusion = i2;
        this.mutexFinishDelayTime = j;
        this.isForceDelay = z;
        this.entityShowSettingPageTimeOut = j2;
    }
}
