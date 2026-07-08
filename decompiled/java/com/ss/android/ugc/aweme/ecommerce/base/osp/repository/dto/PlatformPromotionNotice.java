package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PlatformPromotionNotice {

    @C09CT("content")
    public String content;

    @C09CT("disappear_time")
    public Long disappearTime;

    @C09CT("type")
    public Integer type;

    public PlatformPromotionNotice() {
    }

    public PlatformPromotionNotice(Integer num, String str, Long l) {
        this.type = num;
        this.content = str;
        this.disappearTime = l;
    }
}
