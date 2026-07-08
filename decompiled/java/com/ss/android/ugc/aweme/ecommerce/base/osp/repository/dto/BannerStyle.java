package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C02RS;
import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class BannerStyle {

    @C09CT("5")
    public static final BannerStyle BANNER_STYLE_BENEFIT_V2;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final BannerStyle BANNER_STYLE_DEFAULT;

    @C09CT("1")
    public static final BannerStyle BANNER_STYLE_DISCOUNTS;

    @C09CT("3")
    public static final BannerStyle BANNER_STYLE_DISCOUNTS_WITH_FREE_SHIPPING;

    @C09CT("2")
    public static final BannerStyle BANNER_STYLE_FREE_SHIPPING;

    @C09CT("6")
    public static final BannerStyle BANNER_STYLE_OVERSEAS_SHIPPING;

    @C09CT("4")
    public static final BannerStyle BANNER_STYLE_PURCHASE_REWARD;
    public static final C02RS Companion;
    public static final /* synthetic */ BannerStyle[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<BannerStyle> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.02RS] */
    static {
        BannerStyle bannerStyle = new BannerStyle("BANNER_STYLE_DEFAULT", 0, 0);
        BANNER_STYLE_DEFAULT = bannerStyle;
        BannerStyle bannerStyle2 = new BannerStyle("BANNER_STYLE_DISCOUNTS", 1, 1);
        BANNER_STYLE_DISCOUNTS = bannerStyle2;
        BannerStyle bannerStyle3 = new BannerStyle("BANNER_STYLE_FREE_SHIPPING", 2, 2);
        BANNER_STYLE_FREE_SHIPPING = bannerStyle3;
        BannerStyle bannerStyle4 = new BannerStyle("BANNER_STYLE_DISCOUNTS_WITH_FREE_SHIPPING", 3, 3);
        BANNER_STYLE_DISCOUNTS_WITH_FREE_SHIPPING = bannerStyle4;
        BannerStyle bannerStyle5 = new BannerStyle("BANNER_STYLE_PURCHASE_REWARD", 4, 4);
        BANNER_STYLE_PURCHASE_REWARD = bannerStyle5;
        BannerStyle bannerStyle6 = new BannerStyle("BANNER_STYLE_BENEFIT_V2", 5, 5);
        BANNER_STYLE_BENEFIT_V2 = bannerStyle6;
        BannerStyle bannerStyle7 = new BannerStyle("BANNER_STYLE_OVERSEAS_SHIPPING", 6, 6);
        BANNER_STYLE_OVERSEAS_SHIPPING = bannerStyle7;
        BannerStyle[] bannerStyleArr = {bannerStyle, bannerStyle2, bannerStyle3, bannerStyle4, bannerStyle5, bannerStyle6, bannerStyle7};
        LLILLJJLI = bannerStyleArr;
        LLILLL = new C2254308sP(bannerStyleArr);
        Companion = new Object() { // from class: X.02RS
        };
    }

    public static BannerStyle[] values() {
        return (BannerStyle[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static BannerStyle valueOf(String str) {
        return (BannerStyle) C08FF.LIZ(BannerStyle.class, str);
    }

    public BannerStyle(String str, int i, int i2) {
        this.LL = i2;
    }
}
