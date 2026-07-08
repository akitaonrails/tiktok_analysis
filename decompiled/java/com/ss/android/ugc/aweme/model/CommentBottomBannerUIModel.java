package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class CommentBottomBannerUIModel implements Serializable {

    @C09CT("avatar_icon")
    public final String avatar;

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("information")
    public final String information;

    @C09CT("promo_code")
    public final String promoCode;

    @C09CT("promo_code_copied_text")
    public final String promoCodeCopiedText;

    @C09CT("promo_id")
    public final String promoId;

    @C09CT("title")
    public final String title;

    public CommentBottomBannerUIModel() {
        this(null, null, null, null, null, null, null);
    }

    public CommentBottomBannerUIModel(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.avatar = str;
        this.buttonText = str2;
        this.title = str3;
        this.information = str4;
        this.promoCode = str5;
        this.promoCodeCopiedText = str6;
        this.promoId = str7;
    }
}
