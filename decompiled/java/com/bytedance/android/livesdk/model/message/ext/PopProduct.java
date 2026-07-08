package com.bytedance.android.livesdk.model.message.ext;

import X.AbstractC1136060ffY;
import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes33.dex */
public class PopProduct extends AbstractC1136060ffY {

    @C09CT("image_url")
    public String imageUrl;

    @C09CT("open_url")
    public String openUrl;

    @C09CT("platform")
    public int platform;

    @C09CT("price")
    public String price;

    @C09CT("product_id")
    public long productId;

    @C09CT("product_status")
    public int productStatus;

    @C09CT("product_type")
    public String productType;

    @C09CT("promotion_view")
    public PromotionView promotionView;

    @C09CT("schema")
    public String schema;

    @C09CT("source")
    public String source;

    @C09CT("source_from")
    public int sourceFrom;

    @C09CT("title")
    public String title;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PopProduct{title='");
        sbLIZ.append(this.title);
        sbLIZ.append('\'');
        sbLIZ.append(", price='");
        sbLIZ.append(this.price);
        sbLIZ.append('\'');
        sbLIZ.append(", imageUrl='");
        sbLIZ.append(this.imageUrl);
        sbLIZ.append('\'');
        sbLIZ.append(", openUrl='");
        sbLIZ.append(this.openUrl);
        sbLIZ.append('\'');
        sbLIZ.append(", productType='");
        sbLIZ.append(this.productType);
        sbLIZ.append('\'');
        sbLIZ.append(", productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", source='");
        sbLIZ.append(this.source);
        sbLIZ.append('\'');
        sbLIZ.append(", sourceFrom=");
        sbLIZ.append(this.sourceFrom);
        sbLIZ.append(", schema='");
        sbLIZ.append(this.schema);
        sbLIZ.append('\'');
        sbLIZ.append(", platform=");
        sbLIZ.append(this.platform);
        sbLIZ.append(", productStatus=");
        sbLIZ.append(this.productStatus);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
