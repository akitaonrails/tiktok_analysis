package com.ss.android.ugc.aweme.ecommerce.proto.hybrid;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class EcHybridPbDecodeConfigModel {

    @C09CT("api")
    public final String apiPath;

    @C09CT("api_trigger_preload_disk")
    public final Map<String, Object> apiTriggerPreloadDisk;

    @C09CT("channel")
    public final String channelName;

    @C09CT("enable_native_prefetch")
    public final boolean enableNaPrefetch;

    @C09CT("enable_transcode")
    public final boolean enableTranscode;

    @C09CT("event_trigger_preload_memory")
    public final Map<String, Object> eventTriggerPreloadMemory;

    @C09CT("message")
    public final String messageName;

    @C09CT("transcode_filter_not")
    public final String transcodeFilterNot;

    public EcHybridPbDecodeConfigModel() {
        this("", "", "", false, false, null, null, null);
    }

    public EcHybridPbDecodeConfigModel(String str, String str2, String str3, boolean z, boolean z2, String str4, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        this.apiPath = str;
        this.channelName = str2;
        this.messageName = str3;
        this.enableNaPrefetch = z;
        this.enableTranscode = z2;
        this.transcodeFilterNot = str4;
        this.apiTriggerPreloadDisk = map;
        this.eventTriggerPreloadMemory = map2;
    }
}
