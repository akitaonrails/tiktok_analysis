package com.ss.android.ugc.aweme.ecommerce.preload.gecko.settings;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes24.dex */
public final class EcomGeckoPreloadConfigItem {

    @C09CT("check_update")
    public final Integer checkUpdate;

    @C09CT("cpu_usage_threshold")
    public final Float cpuUsageThreshold;

    @C09CT("delay")
    public final Integer delay;

    @C09CT("event_params")
    public final EventParamsConfig eventParams;

    @C09CT("ignore_block_list")
    public final Integer ignoreBlockList;

    @C09CT("network_type")
    public final int[] networkTypes;

    @C09CT("router_params")
    public final RouterParamsConfig routerParams;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("trigger_type")
    public final String triggerType;

    @C09CT("wait_cpu_free")
    public final Integer waitCPUFree;

    public EcomGeckoPreloadConfigItem(String str, String str2, Integer num, Float f, int[] iArr, Integer num2, Integer num3, Integer num4, EventParamsConfig eventParamsConfig, RouterParamsConfig routerParamsConfig) {
        this.triggerType = str;
        this.scene = str2;
        this.waitCPUFree = num;
        this.cpuUsageThreshold = f;
        this.networkTypes = iArr;
        this.delay = num2;
        this.ignoreBlockList = num3;
        this.checkUpdate = num4;
        this.eventParams = eventParamsConfig;
        this.routerParams = routerParamsConfig;
    }
}
