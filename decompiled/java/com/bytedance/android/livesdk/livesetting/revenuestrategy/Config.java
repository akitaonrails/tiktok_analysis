package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class Config {
    public static final TypeAdapter ADAPTER = new Config_OptTypeAdapter(NormalGson.singleton());

    @C09CT("block_list")
    public List<String> blockList;

    @C09CT("default_duration")
    public int defaultDuration;

    @C09CT("enable")
    public boolean enable;

    @C09CT("execute_time_point")
    public int executeMode;

    @C09CT("algo_package_name")
    public String packageName;

    @C09CT("timeout_threshold")
    public int timeoutThreshold;

    public Config() {
        this(false, "live_gift_guide_optimize_strategy", 1, LSPassThroughRecordSizeConfig.DEFAULT, 10, C1697810uHb.LJIIJJI("gift_guide_ug_task_show_popup", "gift_guide_heartme_task_show_popup", "gift_guide_ug_task_gift_popup"));
    }

    public Config(boolean z, String str, int i, int i2, int i3, List<String> list) {
        this.enable = z;
        this.packageName = str;
        this.executeMode = i;
        this.timeoutThreshold = i2;
        this.defaultDuration = i3;
        this.blockList = list;
    }
}
