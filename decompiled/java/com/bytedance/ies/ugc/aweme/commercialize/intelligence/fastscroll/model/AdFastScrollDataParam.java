package com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class AdFastScrollDataParam implements Serializable {

    @C09CT("ad_absolute_position")
    public final Integer ad_absolute_position;

    @C09CT("ad_relative_position")
    public final Integer ad_relative_position;

    @C09CT("ad_cid")
    public final String cid;

    @C09CT("ad_ctr")
    public final Double ctr;

    @C09CT("ad_cvr")
    public final Double cvr;

    @C09CT("ad_ecpm")
    public final Long ecpm;

    @C09CT("ad_gap_from_first_ad")
    public final Integer gap_from_first_ad;

    @C09CT("ad_gap_from_last_ad")
    public final Integer gap_from_last_ad;

    @C09CT("ad_is_promote")
    public final Integer isPromote;

    @C09CT("ad_is_soft_ad")
    public final Integer isSoftAd;

    @C09CT("ad_is_spark")
    public final Integer isSpark;

    @C09CT("is_carousel_ad")
    public final Integer is_carousel_ad;

    @C09CT("is_live_ad")
    public final Integer is_live_ad;

    @C09CT("ad_item_id")
    public final String itemId;

    @C09CT("ad_pctr")
    public final Double pctr;

    @C09CT("ad_pcvr")
    public final Double pcvr;

    @C09CT("ad_price_type")
    public final Long priceType;

    @C09CT("time_gap_from_first_ad")
    public final Long time_gap_from_first_ad;

    @C09CT("time_gap_from_last_ad")
    public final Long time_gap_from_last_ad;

    @C09CT("time_gap_from_session")
    public final Long time_gap_from_session;

    @C09CT("ad_type")
    public final String type;

    @C09CT("ad_videolength")
    public final Integer videoLength;

    public final Integer getAd_absolute_position() {
        return this.ad_absolute_position;
    }

    public final Integer getAd_relative_position() {
        return this.ad_relative_position;
    }

    public final String getCid() {
        return this.cid;
    }

    public final Double getCtr() {
        return this.ctr;
    }

    public final Double getCvr() {
        return this.cvr;
    }

    public final Long getEcpm() {
        return this.ecpm;
    }

    public final Integer getGap_from_first_ad() {
        return this.gap_from_first_ad;
    }

    public final Integer getGap_from_last_ad() {
        return this.gap_from_last_ad;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final Double getPctr() {
        return this.pctr;
    }

    public final Double getPcvr() {
        return this.pcvr;
    }

    public final Long getPriceType() {
        return this.priceType;
    }

    public final Long getTime_gap_from_first_ad() {
        return this.time_gap_from_first_ad;
    }

    public final Long getTime_gap_from_last_ad() {
        return this.time_gap_from_last_ad;
    }

    public final Long getTime_gap_from_session() {
        return this.time_gap_from_session;
    }

    public final String getType() {
        return this.type;
    }

    public final Integer getVideoLength() {
        return this.videoLength;
    }

    public final Integer isPromote() {
        return this.isPromote;
    }

    public final Integer isSoftAd() {
        return this.isSoftAd;
    }

    public final Integer isSpark() {
        return this.isSpark;
    }

    public final Integer is_carousel_ad() {
        return this.is_carousel_ad;
    }

    public final Integer is_live_ad() {
        return this.is_live_ad;
    }

    public AdFastScrollDataParam(String str, String str2, String str3, Integer num, Integer num2, Integer num3, Double d, Double d2, Double d3, Double d4, Long l, Integer num4, Long l2, Integer num5, Integer num6, Long l3, Long l4, Long l5, Integer num7, Integer num8, Integer num9, Integer num10) {
        this.itemId = str;
        this.cid = str2;
        this.type = str3;
        this.isSpark = num;
        this.isPromote = num2;
        this.isSoftAd = num3;
        this.ctr = d;
        this.pctr = d2;
        this.cvr = d3;
        this.pcvr = d4;
        this.ecpm = l;
        this.videoLength = num4;
        this.priceType = l2;
        this.ad_absolute_position = num5;
        this.ad_relative_position = num6;
        this.time_gap_from_session = l3;
        this.time_gap_from_first_ad = l4;
        this.time_gap_from_last_ad = l5;
        this.gap_from_first_ad = num7;
        this.gap_from_last_ad = num8;
        this.is_carousel_ad = num9;
        this.is_live_ad = num10;
    }
}
