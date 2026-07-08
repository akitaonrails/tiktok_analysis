package com.ss.android.ugc.aweme.ecommerce.mall.service.searchentrance;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class ECMiddleEntranceData implements Serializable {

    @C09CT("attachProducts")
    public String attachProducts;

    @C09CT("ecHintVoucherInfo")
    public String ecHintVoucherInfo;

    @C09CT("ecomSearchExtraInfo")
    public String ecomSearchExtraInfo;

    @C09CT("ecomSearchWordExtraInfo")
    public String ecomSearchWordExtraInfo;

    @C09CT("extraBusinessParams")
    public String extraBusinessParams;

    @C09CT("promotionInfo")
    public String promotionInfo;

    @C09CT("refreshTime")
    public String refreshTime;

    @C09CT("searchLogId")
    public String searchLogId;

    @C09CT("searchWord")
    public String searchWord;

    @C09CT("searchWordId")
    public String searchWordId;

    @C09CT("searchWordPosition")
    public Number searchWordPosition;

    public final void setAttachProducts(String str) {
        this.attachProducts = str;
    }

    public final void setEcHintVoucherInfo(String str) {
        this.ecHintVoucherInfo = str;
    }

    public final void setEcomSearchExtraInfo(String str) {
        this.ecomSearchExtraInfo = str;
    }

    public final void setEcomSearchWordExtraInfo(String str) {
        this.ecomSearchWordExtraInfo = str;
    }

    public final void setExtraBusinessParams(String str) {
        this.extraBusinessParams = str;
    }

    public final void setPromotionInfo(String str) {
        this.promotionInfo = str;
    }

    public final void setRefreshTime(String str) {
        this.refreshTime = str;
    }

    public final void setSearchLogId(String str) {
        this.searchLogId = str;
    }

    public final void setSearchWord(String str) {
        this.searchWord = str;
    }

    public final void setSearchWordId(String str) {
        this.searchWordId = str;
    }

    public final void setSearchWordPosition(Number number) {
        this.searchWordPosition = number;
    }

    public ECMiddleEntranceData(String str, String str2, Number number, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.searchWord = str;
        this.searchWordId = str2;
        this.searchWordPosition = number;
        this.searchLogId = str3;
        this.ecHintVoucherInfo = str4;
        this.promotionInfo = str5;
        this.attachProducts = str6;
        this.ecomSearchExtraInfo = str7;
        this.refreshTime = str8;
        this.ecomSearchWordExtraInfo = str9;
        this.extraBusinessParams = str10;
    }
}
