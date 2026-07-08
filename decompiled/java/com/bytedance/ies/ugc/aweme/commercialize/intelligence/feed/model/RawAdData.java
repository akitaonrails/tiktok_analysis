package com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class RawAdData implements Serializable {

    @C09CT("ad_id")
    public final long adId;

    @C09CT("ad_source_type")
    public final Integer adSourceType;

    @C09CT("charge_type")
    public final Integer chargeType;

    @C09CT("cid")
    public final Long cid;

    @C09CT("component_type")
    public final Integer componentType;

    @C09CT("system_origin")
    public final Integer systemOrigin;

    public final long getAdId() {
        return this.adId;
    }

    public final Integer getAdSourceType() {
        return this.adSourceType;
    }

    public final Integer getChargeType() {
        return this.chargeType;
    }

    public final Long getCid() {
        return this.cid;
    }

    public final Integer getComponentType() {
        return this.componentType;
    }

    public final Integer getSystemOrigin() {
        return this.systemOrigin;
    }

    public RawAdData(long j, Integer num, Integer num2, Integer num3, Integer num4, Long l) {
        this.adId = j;
        this.componentType = num;
        this.adSourceType = num2;
        this.chargeType = num3;
        this.systemOrigin = num4;
        this.cid = l;
    }
}
