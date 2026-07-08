package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class OfferInfo implements Serializable {
    public boolean isSelected;

    @C09CT("label_text")
    public final List<String> labelText;

    @C09CT("offer_detailed_description")
    public final Description offerDescription;

    @C09CT("offer_detailed_description_list")
    public final List<Description> offerDescriptionList;

    @C09CT("offer_name")
    public final String offerName;

    @C09CT("period_name")
    public final String periodName;

    @C09CT("product_info")
    public final ProductInfo productInfo;

    @C09CT("selected_button_text")
    public final String selectButtonText;

    @C09CT("selected_button_detailed_description")
    public final Description selectedButtonDescription;

    @C09CT("subtitle")
    public final String subtitle;

    @C09CT("title")
    public final String title;

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public OfferInfo(List<String> list, String str, String str2, String str3, String str4, String str5, Description description, Description description2, List<Description> list2, ProductInfo productInfo, boolean z) {
        this.labelText = list;
        this.offerName = str;
        this.title = str2;
        this.subtitle = str3;
        this.periodName = str4;
        this.selectButtonText = str5;
        this.selectedButtonDescription = description;
        this.offerDescription = description2;
        this.offerDescriptionList = list2;
        this.productInfo = productInfo;
        this.isSelected = z;
    }
}
