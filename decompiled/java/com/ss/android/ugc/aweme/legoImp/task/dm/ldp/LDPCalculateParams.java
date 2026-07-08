package com.ss.android.ugc.aweme.legoImp.task.dm.ldp;

import X.C09CT;
import X.C2097608Jq;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class LDPCalculateParams {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("event_sampling_map")
    public final Map<String, Long> eventSamplingMap;

    @C09CT("func_size")
    public final int funcSize;

    @C09CT("hash_domain_range")
    public final int hashDomainRange;

    @C09CT("is_uuid_upload")
    public final boolean isUUIDUpload;

    @C09CT("max_cache_size")
    public final int maxCacheSize;

    @C09CT("probability")
    public final double probabilty;

    @C09CT("protocol_version")
    public final int protocolVersion;

    @C09CT("sample_rate")
    public final int sampleRate;

    @C09CT("vector_size")
    public final int vectorSize;

    public LDPCalculateParams() {
        this(false, 1024, LSPassThroughRecordSizeConfig.DEFAULT, 56, 1, 5, 0.5d, false, 1, C2097608Jq.LJ());
    }

    public LDPCalculateParams(boolean z, int i, int i2, int i3, int i4, int i5, double d, boolean z2, int i6, Map<String, Long> map) {
        this.enable = z;
        this.hashDomainRange = i;
        this.funcSize = i2;
        this.vectorSize = i3;
        this.protocolVersion = i4;
        this.maxCacheSize = i5;
        this.probabilty = d;
        this.isUUIDUpload = z2;
        this.sampleRate = i6;
        this.eventSamplingMap = map;
    }
}
