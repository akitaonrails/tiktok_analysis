package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class CommentTopBarUIModel implements Serializable {

    @C09CT("avatar_icon")
    public final String avatar;

    @C09CT("information")
    public final String information;

    @C09CT("is_default_icon")
    public final Boolean isDefaultICon;

    @C09CT("promo_code")
    public final String promoCode;

    @C09CT("promo_code_copied_text")
    public final String promoCodeCopiedText;

    @C09CT("promo_id")
    public final String promoId;

    @C09CT("title")
    public final String title;

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getInformation() {
        return this.information;
    }

    public final String getPromoCode() {
        return this.promoCode;
    }

    public final String getPromoCodeCopiedText() {
        return this.promoCodeCopiedText;
    }

    public final String getPromoId() {
        return this.promoId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Boolean isDefaultICon() {
        return this.isDefaultICon;
    }

    public CommentTopBarUIModel(String str, Boolean bool, String str2, String str3, String str4, String str5, String str6) {
        this.avatar = str;
        this.isDefaultICon = bool;
        this.title = str2;
        this.information = str3;
        this.promoCode = str4;
        this.promoCodeCopiedText = str5;
        this.promoId = str6;
    }
}
