package com.bytedance.pipo.ttpay.model;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.pipo.stellar.base.model.BaseWidgetDO;
import com.bytedance.pipo.stellar.base.model.ImageDO;
import com.bytedance.pipo.stellar.base.model.PriceDO;
import com.bytedance.pipo.stellar.base.model.TextDO;
import com.bytedance.pipo.stellar.base.model.TuxTagDO;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class FinancialProductDO extends BaseWidgetDO {

    @C09CT("arrow_icon")
    public final ImageDO arrowIcon;

    @C09CT("price_tag")
    public final PriceDO priceTag;

    @C09CT("product_icon")
    public final ImageDO productIcon;

    @C09CT("status_icon")
    public final ImageDO statusIcon;

    @C09CT("sub_title")
    public final TextDO subTitle;

    @C09CT("tag_view")
    public final TuxTagDO tag;

    @C09CT("title")
    public final TextDO title;

    public FinancialProductDO() {
        this(null, null, null, null, null, null, null);
    }

    public final FinancialProductDO copy(ImageDO imageDO, TextDO textDO, ImageDO imageDO2, PriceDO priceDO, ImageDO imageDO3, TuxTagDO tuxTagDO, TextDO textDO2) {
        return new FinancialProductDO(imageDO, textDO, imageDO2, priceDO, imageDO3, tuxTagDO, textDO2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinancialProductDO)) {
            return false;
        }
        FinancialProductDO financialProductDO = (FinancialProductDO) obj;
        return Intrinsics.LJFF(this.productIcon, financialProductDO.productIcon) && Intrinsics.LJFF(this.title, financialProductDO.title) && Intrinsics.LJFF(this.arrowIcon, financialProductDO.arrowIcon) && Intrinsics.LJFF(this.priceTag, financialProductDO.priceTag) && Intrinsics.LJFF(this.statusIcon, financialProductDO.statusIcon) && Intrinsics.LJFF(this.tag, financialProductDO.tag) && Intrinsics.LJFF(this.subTitle, financialProductDO.subTitle);
    }

    public int hashCode() {
        ImageDO imageDO = this.productIcon;
        int iHashCode = (imageDO == null ? 0 : imageDO.hashCode()) * 31;
        TextDO textDO = this.title;
        int iHashCode2 = (iHashCode + (textDO == null ? 0 : textDO.hashCode())) * 31;
        ImageDO imageDO2 = this.arrowIcon;
        int iHashCode3 = (iHashCode2 + (imageDO2 == null ? 0 : imageDO2.hashCode())) * 31;
        PriceDO priceDO = this.priceTag;
        int iHashCode4 = (iHashCode3 + (priceDO == null ? 0 : priceDO.hashCode())) * 31;
        ImageDO imageDO3 = this.statusIcon;
        int iHashCode5 = (iHashCode4 + (imageDO3 == null ? 0 : imageDO3.hashCode())) * 31;
        TuxTagDO tuxTagDO = this.tag;
        int iHashCode6 = (iHashCode5 + (tuxTagDO == null ? 0 : tuxTagDO.hashCode())) * 31;
        TextDO textDO2 = this.subTitle;
        return iHashCode6 + (textDO2 != null ? textDO2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FinancialProductDO(productIcon=");
        sbLIZ.append(this.productIcon);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", arrowIcon=");
        sbLIZ.append(this.arrowIcon);
        sbLIZ.append(", priceTag=");
        sbLIZ.append(this.priceTag);
        sbLIZ.append(", statusIcon=");
        sbLIZ.append(this.statusIcon);
        sbLIZ.append(", tag=");
        sbLIZ.append(this.tag);
        sbLIZ.append(", subTitle=");
        sbLIZ.append(this.subTitle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final ImageDO getArrowIcon() {
        return this.arrowIcon;
    }

    public final PriceDO getPriceTag() {
        return this.priceTag;
    }

    public final ImageDO getProductIcon() {
        return this.productIcon;
    }

    public final ImageDO getStatusIcon() {
        return this.statusIcon;
    }

    public final TextDO getSubTitle() {
        return this.subTitle;
    }

    public final TuxTagDO getTag() {
        return this.tag;
    }

    public final TextDO getTitle() {
        return this.title;
    }

    public FinancialProductDO(ImageDO imageDO, TextDO textDO, ImageDO imageDO2, PriceDO priceDO, ImageDO imageDO3, TuxTagDO tuxTagDO, TextDO textDO2) {
        super(null, null, 1, null, null);
        this.productIcon = imageDO;
        this.title = textDO;
        this.arrowIcon = imageDO2;
        this.priceTag = priceDO;
        this.statusIcon = imageDO3;
        this.tag = tuxTagDO;
        this.subTitle = textDO2;
    }
}
