package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.C588002Ra;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class PromotionTagStyle {
    public static final C588002Ra Companion;
    public static final /* synthetic */ PromotionTagStyle[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final PromotionTagStyle PURE_TEXT;

    @C09CT("1")
    public static final PromotionTagStyle RED_BACKGROUND;
    public final int LL;

    public static InterfaceC2044707zh<PromotionTagStyle> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.02Ra] */
    static {
        PromotionTagStyle promotionTagStyle = new PromotionTagStyle("PURE_TEXT", 0, 0);
        PURE_TEXT = promotionTagStyle;
        PromotionTagStyle promotionTagStyle2 = new PromotionTagStyle("RED_BACKGROUND", 1, 1);
        RED_BACKGROUND = promotionTagStyle2;
        PromotionTagStyle[] promotionTagStyleArr = {promotionTagStyle, promotionTagStyle2};
        LLILLJJLI = promotionTagStyleArr;
        LLILLL = new C2254308sP(promotionTagStyleArr);
        Companion = new Object() { // from class: X.02Ra
        };
    }

    public static PromotionTagStyle[] values() {
        return (PromotionTagStyle[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static PromotionTagStyle valueOf(String str) {
        return (PromotionTagStyle) C08FF.LIZ(PromotionTagStyle.class, str);
    }

    public PromotionTagStyle(String str, int i, int i2) {
        this.LL = i2;
    }
}
