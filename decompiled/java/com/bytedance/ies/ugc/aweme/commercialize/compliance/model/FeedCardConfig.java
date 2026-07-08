package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class FeedCardConfig implements Serializable {

    @C09CT("tt_plus_card_frequency_cap")
    public final Integer cardFrequencyCap;

    @C09CT("tt_plus_card_req_gap_max")
    public final Integer cardReqGapMax;

    @C09CT("tt_plus_card_req_gap_min")
    public final Integer cardReqGapMin;

    @C09CT("tt_plus_card_slot_id")
    public final Integer cardType;

    public FeedCardConfig() {
        this(null, null, null, null);
    }

    public FeedCardConfig(Integer num, Integer num2, Integer num3, Integer num4) {
        this.cardType = num;
        this.cardFrequencyCap = num2;
        this.cardReqGapMin = num3;
        this.cardReqGapMax = num4;
    }
}
