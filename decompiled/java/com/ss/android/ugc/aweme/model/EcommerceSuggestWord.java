package com.ss.android.ugc.aweme.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes11.dex */
public final class EcommerceSuggestWord {

    @C09CT("ecom_promotion_icon")
    public final EcPromotionIcon ecomPromotionIcon;

    @C09CT("face_value_text")
    public final String faceValueText;

    @C09CT(alternate = {"group_id"}, value = FollowStatusChangeMethod.PARAM_UID)
    public String id;
    public String implId;

    @C09CT("is_show_voucher_icon")
    public final Boolean isShowVoucherIcon;
    public boolean isShowed;

    @C09CT("show_word")
    public String showWord;

    @C09CT("type_image")
    public com.ss.android.ugc.aweme.base.model.UrlModel typeImage;

    @C09CT(alternate = {"words_content"}, value = "word")
    public String word;

    @C09CT("words_position")
    public Integer wordPosition;

    @C09CT("words_source")
    public String wordSource;

    @C09CT("words_type")
    public String wordType;

    public EcommerceSuggestWord() {
        this(null, null, null, 0, null, null, null, null, null, null, null, false);
    }

    public final Boolean isShowVoucherIcon() {
        return this.isShowVoucherIcon;
    }

    public final boolean isShowed() {
        return this.isShowed;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setImplId(String str) {
        this.implId = str;
    }

    public final void setShowWord(String str) {
        this.showWord = str;
    }

    public final void setShowed(boolean z) {
        this.isShowed = z;
    }

    public final void setTypeImage(com.ss.android.ugc.aweme.base.model.UrlModel urlModel) {
        this.typeImage = urlModel;
    }

    public final void setWord(String str) {
        this.word = str;
    }

    public final void setWordPosition(Integer num) {
        this.wordPosition = num;
    }

    public final void setWordSource(String str) {
        this.wordSource = str;
    }

    public final void setWordType(String str) {
        this.wordType = str;
    }

    public EcommerceSuggestWord(String str, String str2, String str3, Integer num, String str4, String str5, com.ss.android.ugc.aweme.base.model.UrlModel urlModel, EcPromotionIcon ecPromotionIcon, Boolean bool, String str6, String str7, boolean z) {
        this.id = str;
        this.word = str2;
        this.showWord = str3;
        this.wordPosition = num;
        this.wordSource = str4;
        this.wordType = str5;
        this.typeImage = urlModel;
        this.ecomPromotionIcon = ecPromotionIcon;
        this.isShowVoucherIcon = bool;
        this.faceValueText = str6;
        this.implId = str7;
        this.isShowed = z;
    }
}
