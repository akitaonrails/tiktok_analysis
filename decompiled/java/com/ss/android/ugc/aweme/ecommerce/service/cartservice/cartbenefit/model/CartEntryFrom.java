package com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class CartEntryFrom {

    @C09CT("3")
    public static final CartEntryFrom CATEGORY_PAGE;

    @C09CT("8")
    public static final CartEntryFrom COUPON_ADDON_PAGE;

    @C09CT("2")
    public static final CartEntryFrom DEAL_CHANNEL;

    @C09CT("4")
    public static final CartEntryFrom GENERAL_CHANNEL_PAGE;

    @C09CT("6")
    public static final CartEntryFrom LIVE;
    public static final /* synthetic */ CartEntryFrom[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("1")
    public static final CartEntryFrom NEW_BEE_CHANNEL;

    @C09CT("5")
    public static final CartEntryFrom PDP;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final CartEntryFrom UNDEFINED;

    @C09CT("7")
    public static final CartEntryFrom VIDEO;

    @C09CT("26")
    public static final CartEntryFrom VIDEO_ANCHOR_FEED;

    public static InterfaceC2044707zh<CartEntryFrom> getEntries() {
        return LLILLJJLI;
    }

    static {
        CartEntryFrom cartEntryFrom = new CartEntryFrom("UNDEFINED", 0, 0);
        UNDEFINED = cartEntryFrom;
        CartEntryFrom cartEntryFrom2 = new CartEntryFrom("NEW_BEE_CHANNEL", 1, 1);
        NEW_BEE_CHANNEL = cartEntryFrom2;
        CartEntryFrom cartEntryFrom3 = new CartEntryFrom("DEAL_CHANNEL", 2, 2);
        DEAL_CHANNEL = cartEntryFrom3;
        CartEntryFrom cartEntryFrom4 = new CartEntryFrom("CATEGORY_PAGE", 3, 3);
        CATEGORY_PAGE = cartEntryFrom4;
        CartEntryFrom cartEntryFrom5 = new CartEntryFrom("GENERAL_CHANNEL_PAGE", 4, 4);
        GENERAL_CHANNEL_PAGE = cartEntryFrom5;
        CartEntryFrom cartEntryFrom6 = new CartEntryFrom("PDP", 5, 5);
        PDP = cartEntryFrom6;
        CartEntryFrom cartEntryFrom7 = new CartEntryFrom("LIVE", 6, 6);
        LIVE = cartEntryFrom7;
        CartEntryFrom cartEntryFrom8 = new CartEntryFrom("VIDEO", 7, 7);
        VIDEO = cartEntryFrom8;
        CartEntryFrom cartEntryFrom9 = new CartEntryFrom("COUPON_ADDON_PAGE", 8, 8);
        COUPON_ADDON_PAGE = cartEntryFrom9;
        CartEntryFrom cartEntryFrom10 = new CartEntryFrom("VIDEO_ANCHOR_FEED", 9, 26);
        VIDEO_ANCHOR_FEED = cartEntryFrom10;
        CartEntryFrom[] cartEntryFromArr = {cartEntryFrom, cartEntryFrom2, cartEntryFrom3, cartEntryFrom4, cartEntryFrom5, cartEntryFrom6, cartEntryFrom7, cartEntryFrom8, cartEntryFrom9, cartEntryFrom10};
        LL = cartEntryFromArr;
        LLILLJJLI = new C2254308sP(cartEntryFromArr);
    }

    public static CartEntryFrom[] values() {
        return (CartEntryFrom[]) LL.clone();
    }

    public static CartEntryFrom valueOf(String str) {
        return (CartEntryFrom) C08FF.LIZ(CartEntryFrom.class, str);
    }

    public CartEntryFrom(String str, int i, int i2) {
    }
}
