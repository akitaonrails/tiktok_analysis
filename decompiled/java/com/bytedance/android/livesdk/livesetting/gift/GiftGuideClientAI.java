package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.android.gms.common.ConnectionResult;
import com.google.gson.TypeAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes36.dex */
public final class GiftGuideClientAI {
    public static final TypeAdapter ADAPTER = new GiftGuideClientAI_OptTypeAdapter(NormalGson.singleton());

    @C09CT("auto_trigger_config")
    public Map<String, AutoTriggerConfig> autoTriggerConfigMap;

    @C09CT("business_name")
    public String businessName;

    @C09CT("collect_enable")
    public boolean enableCollect;

    @C09CT("frequency_control_business_name")
    public String frequencyControlBusinessName;

    @C09CT("frequency_control_task_delay")
    public long frequencyControlTaskDelay;

    @C09CT("gift_combo_count")
    public int giftComboCount;

    @C09CT("massive_comment_count")
    public int massiveCommentCount;

    @C09CT("massive_gifts_count")
    public int massiveGiftCount;

    @C09CT("native_trigger_config")
    public NativeTriggerConfig nativeTriggerConfig;

    @C09CT("polling_duration")
    public long pollingDuration;

    @C09CT("client_ai_task_timeout")
    public int taskTimeout;

    @C09CT("trigger_duration")
    public long triggerDuration;

    public GiftGuideClientAI() {
        this("", "", 10000L, 30L, false, 30L, 10, 5, 5, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, null, new NativeTriggerConfig(null, null, 3, null));
    }

    public GiftGuideClientAI(String str, String str2, long j, long j2, boolean z, long j3, int i, int i2, int i3, int i4, Map<String, AutoTriggerConfig> map, NativeTriggerConfig nativeTriggerConfig) {
        this.frequencyControlBusinessName = str;
        this.businessName = str2;
        this.frequencyControlTaskDelay = j;
        this.pollingDuration = j2;
        this.enableCollect = z;
        this.triggerDuration = j3;
        this.massiveCommentCount = i;
        this.massiveGiftCount = i2;
        this.giftComboCount = i3;
        this.taskTimeout = i4;
        this.autoTriggerConfigMap = map;
        this.nativeTriggerConfig = nativeTriggerConfig;
    }
}
