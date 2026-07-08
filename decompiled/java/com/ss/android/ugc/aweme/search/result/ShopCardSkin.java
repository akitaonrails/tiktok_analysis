package com.ss.android.ugc.aweme.search.result;

import X.C09CT;
import X.C0QOD;
import com.ss.android.ugc.aweme.search.model.ThemeColor;
import com.ss.android.ugc.aweme.search.model.ThemeImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class ShopCardSkin extends C0QOD {

    @C09CT("bottom_theme_color")
    public final ThemeColor bottomThemeColor;

    @C09CT("bottom_theme_image")
    public final ThemeImage bottomThemeImage;

    @C09CT("use_full_config")
    public final Boolean enableUseFullPic;

    @C09CT("full_theme_color")
    public final ThemeColor fullThemeColor;

    @C09CT("full_theme_image")
    public final ThemeImage fullThemeImage;

    @C09CT("header_mask_color")
    public final ThemeColor headerMaskColor;

    @C09CT("header_theme_color")
    public final ThemeColor headerThemeColor;

    @C09CT("header_theme_image")
    public final ThemeImage headerThemeImage;

    @C09CT("middle_theme_color")
    public final ThemeColor middleThemeColor;

    @C09CT("middle_theme_image")
    public final ThemeImage middlehemeImage;

    @C09CT("search_box_style_type")
    public final Integer searchBoxStyleType;

    @C09CT("shop_card_skin_type")
    public final Integer skinType;

    public ShopCardSkin() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopCardSkin)) {
            return false;
        }
        ShopCardSkin shopCardSkin = (ShopCardSkin) obj;
        return Intrinsics.LJFF(this.enableUseFullPic, shopCardSkin.enableUseFullPic) && Intrinsics.LJFF(this.fullThemeImage, shopCardSkin.fullThemeImage) && Intrinsics.LJFF(this.fullThemeColor, shopCardSkin.fullThemeColor) && Intrinsics.LJFF(this.headerThemeImage, shopCardSkin.headerThemeImage) && Intrinsics.LJFF(this.headerThemeColor, shopCardSkin.headerThemeColor) && Intrinsics.LJFF(this.middlehemeImage, shopCardSkin.middlehemeImage) && Intrinsics.LJFF(this.middleThemeColor, shopCardSkin.middleThemeColor) && Intrinsics.LJFF(this.bottomThemeImage, shopCardSkin.bottomThemeImage) && Intrinsics.LJFF(this.bottomThemeColor, shopCardSkin.bottomThemeColor) && Intrinsics.LJFF(this.skinType, shopCardSkin.skinType) && Intrinsics.LJFF(this.headerMaskColor, shopCardSkin.headerMaskColor) && Intrinsics.LJFF(this.searchBoxStyleType, shopCardSkin.searchBoxStyleType);
    }

    public final int hashCode() {
        Boolean bool = this.enableUseFullPic;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        ThemeImage themeImage = this.fullThemeImage;
        int iHashCode2 = (iHashCode + (themeImage == null ? 0 : themeImage.hashCode())) * 31;
        ThemeColor themeColor = this.fullThemeColor;
        int iHashCode3 = (iHashCode2 + (themeColor == null ? 0 : themeColor.hashCode())) * 31;
        ThemeImage themeImage2 = this.headerThemeImage;
        int iHashCode4 = (iHashCode3 + (themeImage2 == null ? 0 : themeImage2.hashCode())) * 31;
        ThemeColor themeColor2 = this.headerThemeColor;
        int iHashCode5 = (iHashCode4 + (themeColor2 == null ? 0 : themeColor2.hashCode())) * 31;
        ThemeImage themeImage3 = this.middlehemeImage;
        int iHashCode6 = (iHashCode5 + (themeImage3 == null ? 0 : themeImage3.hashCode())) * 31;
        ThemeColor themeColor3 = this.middleThemeColor;
        int iHashCode7 = (iHashCode6 + (themeColor3 == null ? 0 : themeColor3.hashCode())) * 31;
        ThemeImage themeImage4 = this.bottomThemeImage;
        int iHashCode8 = (iHashCode7 + (themeImage4 == null ? 0 : themeImage4.hashCode())) * 31;
        ThemeColor themeColor4 = this.bottomThemeColor;
        int iHashCode9 = (iHashCode8 + (themeColor4 == null ? 0 : themeColor4.hashCode())) * 31;
        Integer num = this.skinType;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        ThemeColor themeColor5 = this.headerMaskColor;
        int iHashCode11 = (iHashCode10 + (themeColor5 == null ? 0 : themeColor5.hashCode())) * 31;
        Integer num2 = this.searchBoxStyleType;
        return iHashCode11 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "ShopCardSkin(enableUseFullPic=" + this.enableUseFullPic + ", fullThemeImage=" + this.fullThemeImage + ", fullThemeColor=" + this.fullThemeColor + ", headerThemeImage=" + this.headerThemeImage + ", headerThemeColor=" + this.headerThemeColor + ", middlehemeImage=" + this.middlehemeImage + ", middleThemeColor=" + this.middleThemeColor + ", bottomThemeImage=" + this.bottomThemeImage + ", bottomThemeColor=" + this.bottomThemeColor + ", skinType=" + this.skinType + ", headerMaskColor=" + this.headerMaskColor + ", searchBoxStyleType=" + this.searchBoxStyleType + ')';
    }

    public ShopCardSkin(Boolean bool, ThemeImage themeImage, ThemeColor themeColor, ThemeImage themeImage2, ThemeColor themeColor2, ThemeImage themeImage3, ThemeColor themeColor3, ThemeImage themeImage4, ThemeColor themeColor4, Integer num, ThemeColor themeColor5, Integer num2) {
        this.enableUseFullPic = bool;
        this.fullThemeImage = themeImage;
        this.fullThemeColor = themeColor;
        this.headerThemeImage = themeImage2;
        this.headerThemeColor = themeColor2;
        this.middlehemeImage = themeImage3;
        this.middleThemeColor = themeColor3;
        this.bottomThemeImage = themeImage4;
        this.bottomThemeColor = themeColor4;
        this.skinType = num;
        this.headerMaskColor = themeColor5;
        this.searchBoxStyleType = num2;
    }
}
