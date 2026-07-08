package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CardBindPromotionPopUpInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("popup_content")
    public String popupContent;

    @C09CT("popup_icon_dark_url")
    public String popupIconDarkUrl;

    @C09CT("popup_icon_url")
    public String popupIconUrl;

    @C09CT("popup_title")
    public String popupTitle;

    public CardBindPromotionPopUpInfo() {
        this(null, null, null, null);
    }

    public CardBindPromotionPopUpInfo(String str, String str2, String str3, String str4) {
        this.popupTitle = str;
        this.popupContent = str2;
        this.popupIconUrl = str3;
        this.popupIconDarkUrl = str4;
    }
}
