package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class PreviewCardInfo implements Serializable {

    @C09CT("card_info")
    public final String cardInfo;

    @C09CT("card_type")
    public final Integer cardType;

    @C09CT("da_info")
    public final Map<String, String> daInfo;

    @C09CT("pin_voucher_card_delay_show_ms")
    public final Long pinVoucherDelayShowMs;

    public PreviewCardInfo() {
        this(2000L, null, null, null);
    }

    public PreviewCardInfo(Long l, Integer num, Map<String, String> map, String str) {
        this.pinVoucherDelayShowMs = l;
        this.cardType = num;
        this.daInfo = map;
        this.cardInfo = str;
    }
}
