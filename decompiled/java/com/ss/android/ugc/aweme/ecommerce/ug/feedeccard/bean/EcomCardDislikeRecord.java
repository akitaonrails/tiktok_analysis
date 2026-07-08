package com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class EcomCardDislikeRecord {

    @C09CT("card_subtype")
    public final Integer cardSubtype;

    @C09CT("click_count")
    public int clickCount;

    @C09CT("last_click_time")
    public long lastClickTime;

    @C09CT("trigger_condition")
    public final Integer triggerCondition;

    public EcomCardDislikeRecord() {
        this(0, 0, 0, 0L);
    }

    public EcomCardDislikeRecord(Integer num, Integer num2, int i, long j) {
        this.cardSubtype = num;
        this.triggerCondition = num2;
        this.clickCount = i;
        this.lastClickTime = j;
    }
}
