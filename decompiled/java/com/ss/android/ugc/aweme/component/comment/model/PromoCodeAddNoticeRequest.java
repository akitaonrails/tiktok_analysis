package com.ss.android.ugc.aweme.component.comment.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class PromoCodeAddNoticeRequest implements Serializable {
    public static final int $stable = 0;

    @C09CT("promo_code_notice_msg")
    public final String promoCodeNoticeMsg;

    public PromoCodeAddNoticeRequest(String str) {
        this.promoCodeNoticeMsg = str;
    }
}
