package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CardDO extends BaseWidgetDO {
    public final String LL;
    public final Map<String, Object> LLILLJJLI;
    public final Boolean LLILLL;

    @C09CT("background")
    public final BackgroundDO background;

    @C09CT("card_data")
    public final String cardData;

    @C09CT("card_padding")
    public final MarginDO cardPadding;

    @C09CT("card_show")
    public final String cardShow;

    @C09CT("banner_show")
    public final Integer cardValid;

    @C09CT("height")
    public final String height;

    @C09CT("card_id")
    public final String id;

    @C09CT("layout_gravity")
    public final String layoutGravity;

    @C09CT("card_margin")
    public final MarginDO margin;

    @C09CT("theme")
    public final String theme;

    @C09CT("card_type")
    public final String type;

    @C09CT("width")
    public final String width;

    public CardDO() {
        this(null, null, null, null, null, null, null, null, null, 1, "1", null, null, null, null);
    }

    public final CardDO copy(String str, String str2, String str3, String str4, MarginDO marginDO, MarginDO marginDO2, BackgroundDO backgroundDO, String str5, String str6, Integer num, String str7, String str8, String str9, Map<String, ? extends Object> map, Boolean bool) {
        return new CardDO(str, str2, str3, str4, marginDO, marginDO2, backgroundDO, str5, str6, num, str7, str8, str9, map, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardDO)) {
            return false;
        }
        CardDO cardDO = (CardDO) obj;
        return Intrinsics.LJFF(this.id, cardDO.id) && Intrinsics.LJFF(this.type, cardDO.type) && Intrinsics.LJFF(this.width, cardDO.width) && Intrinsics.LJFF(this.height, cardDO.height) && Intrinsics.LJFF(this.margin, cardDO.margin) && Intrinsics.LJFF(this.cardPadding, cardDO.cardPadding) && Intrinsics.LJFF(this.background, cardDO.background) && Intrinsics.LJFF(this.cardData, cardDO.cardData) && Intrinsics.LJFF(this.theme, cardDO.theme) && Intrinsics.LJFF(this.cardValid, cardDO.cardValid) && Intrinsics.LJFF(this.cardShow, cardDO.cardShow) && Intrinsics.LJFF(this.layoutGravity, cardDO.layoutGravity) && Intrinsics.LJFF(this.LL, cardDO.LL) && Intrinsics.LJFF(this.LLILLJJLI, cardDO.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, cardDO.LLILLL);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.width;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.height;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        MarginDO marginDO = this.margin;
        int iHashCode5 = (iHashCode4 + (marginDO == null ? 0 : marginDO.hashCode())) * 31;
        MarginDO marginDO2 = this.cardPadding;
        int iHashCode6 = (iHashCode5 + (marginDO2 == null ? 0 : marginDO2.hashCode())) * 31;
        BackgroundDO backgroundDO = this.background;
        int iHashCode7 = (iHashCode6 + (backgroundDO == null ? 0 : backgroundDO.hashCode())) * 31;
        String str5 = this.cardData;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.theme;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.cardValid;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.cardShow;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.layoutGravity;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LL;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Map<String, Object> map = this.LLILLJJLI;
        int iHashCode14 = (iHashCode13 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.LLILLL;
        return iHashCode14 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "CardDO(id=" + this.id + ", type=" + this.type + ", width=" + this.width + ", height=" + this.height + ", margin=" + this.margin + ", cardPadding=" + this.cardPadding + ", background=" + this.background + ", cardData=" + this.cardData + ", theme=" + this.theme + ", cardValid=" + this.cardValid + ", cardShow=" + this.cardShow + ", layoutGravity=" + this.layoutGravity + ", sectionId=" + this.LL + ", sectionTrackingParams=" + this.LLILLJJLI + ", shouldTrackSection=" + this.LLILLL + ')';
    }

    public final BackgroundDO getBackground() {
        return this.background;
    }

    public final String getCardData() {
        return this.cardData;
    }

    public final MarginDO getCardPadding() {
        return this.cardPadding;
    }

    public final String getCardShow() {
        return this.cardShow;
    }

    public final Integer getCardValid() {
        return this.cardValid;
    }

    public final String getHeight() {
        return this.height;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLayoutGravity() {
        return this.layoutGravity;
    }

    public final MarginDO getMargin() {
        return this.margin;
    }

    public final String getSectionId() {
        return this.LL;
    }

    public final Map<String, Object> getSectionTrackingParams() {
        return this.LLILLJJLI;
    }

    public final Boolean getShouldTrackSection() {
        return this.LLILLL;
    }

    public final String getTheme() {
        return this.theme;
    }

    public final String getType() {
        return this.type;
    }

    public final String getWidth() {
        return this.width;
    }

    public CardDO(String str, String str2, String str3, String str4, MarginDO marginDO, MarginDO marginDO2, BackgroundDO backgroundDO, String str5, String str6, Integer num, String str7, String str8, String str9, Map<String, ? extends Object> map, Boolean bool) {
        super(null, null, 1, null, null);
        this.id = str;
        this.type = str2;
        this.width = str3;
        this.height = str4;
        this.margin = marginDO;
        this.cardPadding = marginDO2;
        this.background = backgroundDO;
        this.cardData = str5;
        this.theme = str6;
        this.cardValid = num;
        this.cardShow = str7;
        this.layoutGravity = str8;
        this.LL = str9;
        this.LLILLJJLI = map;
        this.LLILLL = bool;
    }
}
