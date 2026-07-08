package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class OspXmlPreloadConfig {

    @C09CT("app_list_preload_event")
    public final String appListPreloadEvent;

    @C09CT("device_score_limit")
    public final DeviceScoreLimit deviceScoreLimit;

    @C09CT("dynamic_preload_xml_config")
    public final DynamicPreloadXmlConfig dynamicPreloadXmlConfig;

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("preload_scene")
    public final Map<String, OspXmlPreloadScene> preloadScene;

    @C09CT("version")
    public final Integer version;

    /* JADX WARN: Illegal instructions before constructor call */
    public OspXmlPreloadConfig() {
        Boolean bool = Boolean.FALSE;
        Float fValueOf = Float.valueOf(0.0f);
        this(bool, 0, null, new DeviceScoreLimit(fValueOf, fValueOf), null, null);
    }

    public OspXmlPreloadConfig(Boolean bool, Integer num, Map<String, OspXmlPreloadScene> map, DeviceScoreLimit deviceScoreLimit, String str, DynamicPreloadXmlConfig dynamicPreloadXmlConfig) {
        this.enable = bool;
        this.version = num;
        this.preloadScene = map;
        this.deviceScoreLimit = deviceScoreLimit;
        this.appListPreloadEvent = str;
        this.dynamicPreloadXmlConfig = dynamicPreloadXmlConfig;
    }
}
