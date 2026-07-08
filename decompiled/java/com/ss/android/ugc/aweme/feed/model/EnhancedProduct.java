package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class EnhancedProduct implements Serializable {

    @C09CT("big_sale_icon")
    public final PromotionIcon bigSaleIcon;

    @C09CT("cover")
    public final String cover;

    @C09CT("discount_struct")
    public final DiscountStruct discountStruct;

    @C09CT("is_has_arrow")
    public final boolean hasArrow;

    @C09CT("anchor_icon_style")
    public final Product.LabelIcon labelIcon;

    @C09CT("price_struct")
    public final PriceStruct priceStruct;

    @C09CT("product_id")
    public final long productId;

    @C09CT("small_product_card")
    public final SmallProductCard smallProductCard;

    @C09CT("product_id_str")
    public final String productIdStr = "";

    @C09CT("anchor_style")
    public int anchorStyle = Style.UNKNOWN.getValue();

    @C09CT("keyword")
    public final String keyword = "";

    @C09CT("schema")
    public final String schema = "";

    @C09CT("anchor_text_style")
    public final int anchorTextStyle = AnchorTextStyle.DEFAULT_TEXT.getValue();

    @C09CT("anchor_text_parent_type")
    public final String anchorTextType = "";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AnchorTextStyle {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ AnchorTextStyle[] $VALUES;
        public final int value;
        public static final AnchorTextStyle DEFAULT_TEXT = new AnchorTextStyle("DEFAULT_TEXT", 0, 0);
        public static final AnchorTextStyle SELLING_POINT = new AnchorTextStyle("SELLING_POINT", 1, 1);
        public static final AnchorTextStyle ONLY_PRICE = new AnchorTextStyle("ONLY_PRICE", 2, 2);
        public static final AnchorTextStyle PREFIX_TEXT_AND_DISCOUNT = new AnchorTextStyle("PREFIX_TEXT_AND_DISCOUNT", 3, 3);
        public static final AnchorTextStyle PREFIX_TEXT_AND_SOLD_COUNT = new AnchorTextStyle("PREFIX_TEXT_AND_SOLD_COUNT", 4, 4);
        public static final AnchorTextStyle PREFIX_TEXT_AND_PRICE = new AnchorTextStyle("PREFIX_TEXT_AND_PRICE", 5, 5);
        public static final AnchorTextStyle RATING_AND_SOLD_COUNT = new AnchorTextStyle("RATING_AND_SOLD_COUNT", 6, 12);

        public static final /* synthetic */ AnchorTextStyle[] $values() {
            return new AnchorTextStyle[]{DEFAULT_TEXT, SELLING_POINT, ONLY_PRICE, PREFIX_TEXT_AND_DISCOUNT, PREFIX_TEXT_AND_SOLD_COUNT, PREFIX_TEXT_AND_PRICE, RATING_AND_SOLD_COUNT};
        }

        public static InterfaceC2044707zh<AnchorTextStyle> getEntries() {
            return $ENTRIES;
        }

        static {
            AnchorTextStyle[] anchorTextStyleArr$values = $values();
            $VALUES = anchorTextStyleArr$values;
            $ENTRIES = new C2254308sP(anchorTextStyleArr$values);
        }

        public static AnchorTextStyle[] values() {
            return (AnchorTextStyle[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }

        public static AnchorTextStyle valueOf(String str) {
            return (AnchorTextStyle) C08FF.LIZ(AnchorTextStyle.class, str);
        }

        public AnchorTextStyle(String str, int i, int i2) {
            this.value = i2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Style {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ Style[] $VALUES;
        public final int value;
        public static final Style UNKNOWN = new Style("UNKNOWN", 0, 0);
        public static final Style STYLE_STRONG = new Style("STYLE_STRONG", 1, 1);
        public static final Style STYLE_WEAK = new Style("STYLE_WEAK", 2, 2);
        public static final Style STYLE_STRONG_V2 = new Style("STYLE_STRONG_V2", 3, 3);
        public static final Style STYLE_ANCHOR_PROMOTION_TITLE_WITH_PLAY_ANIMATION = new Style("STYLE_ANCHOR_PROMOTION_TITLE_WITH_PLAY_ANIMATION", 4, 4);
        public static final Style STYLE_ANCHOR_SMALL_PRODUCT = new Style("STYLE_ANCHOR_SMALL_PRODUCT", 5, 5);

        public static final /* synthetic */ Style[] $values() {
            return new Style[]{UNKNOWN, STYLE_STRONG, STYLE_WEAK, STYLE_STRONG_V2, STYLE_ANCHOR_PROMOTION_TITLE_WITH_PLAY_ANIMATION, STYLE_ANCHOR_SMALL_PRODUCT};
        }

        public static InterfaceC2044707zh<Style> getEntries() {
            return $ENTRIES;
        }

        static {
            Style[] styleArr$values = $values();
            $VALUES = styleArr$values;
            $ENTRIES = new C2254308sP(styleArr$values);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }

        public static Style valueOf(String str) {
            return (Style) C08FF.LIZ(Style.class, str);
        }

        public Style(String str, int i, int i2) {
            this.value = i2;
        }
    }

    public final int getAnchorStyle() {
        return this.anchorStyle;
    }

    public final int getAnchorTextStyle() {
        return this.anchorTextStyle;
    }

    public final String getAnchorTextType() {
        return this.anchorTextType;
    }

    public final PromotionIcon getBigSaleIcon() {
        return this.bigSaleIcon;
    }

    public final String getCover() {
        return this.cover;
    }

    public final DiscountStruct getDiscountStruct() {
        return this.discountStruct;
    }

    public final boolean getHasArrow() {
        return this.hasArrow;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final Product.LabelIcon getLabelIcon() {
        return this.labelIcon;
    }

    public final PriceStruct getPriceStruct() {
        return this.priceStruct;
    }

    public final long getProductId() {
        return this.productId;
    }

    public final String getProductIdStr() {
        return this.productIdStr;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final SmallProductCard getSmallProductCard() {
        return this.smallProductCard;
    }

    public final void setAnchorStyle(int i) {
        this.anchorStyle = i;
    }
}
