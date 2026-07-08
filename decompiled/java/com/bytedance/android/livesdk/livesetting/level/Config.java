package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class Config {
    public static final TypeAdapter ADAPTER = new Config_OptTypeAdapter(NormalGson.singleton());

    @C09CT("expire_points_message_switch")
    public boolean expirePointSwitch;

    @C09CT("fans_claim_webp_resource_config")
    public List<FansClaimResConfig> fansClaimWebpResConfig;

    @C09CT("first_claim_message_switch")
    public boolean firstTimeClaimMessage;

    @C09CT("new_claim_animation_switch")
    public boolean newClaimAnimationSwitch;

    @C09CT("new_fans_claim_webp_resource_config")
    public List<FansClaimResConfig> newFansClaimWebpResConfig;

    @C09CT("new_join_complete_task_message_switch")
    public boolean newJoinCompleteTaskSwitch;

    @C09CT("points_expire_interval")
    public long pointsExpireInterval;

    @C09CT("system_message_block_interval")
    public long systemMessageBlockInterval;

    public Config() {
        this(true, true, true, true, null, null, 600L, 60L);
    }

    public Config(boolean z, boolean z2, boolean z3, boolean z4, List<FansClaimResConfig> list, List<FansClaimResConfig> list2, long j, long j2) {
        this.firstTimeClaimMessage = z;
        this.newJoinCompleteTaskSwitch = z2;
        this.expirePointSwitch = z3;
        this.newClaimAnimationSwitch = z4;
        this.fansClaimWebpResConfig = list;
        this.newFansClaimWebpResConfig = list2;
        this.pointsExpireInterval = j;
        this.systemMessageBlockInterval = j2;
    }
}
