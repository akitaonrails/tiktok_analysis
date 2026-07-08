package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;

/* JADX INFO: loaded from: classes33.dex */
public final class PanelExpansionVoucher {

    @C09CT("banner_bg")
    public final Image bannerBg;

    @C09CT("banner_bg_dark")
    public final Image bannerBgDark;

    @C09CT("banner_button_text")
    public final String bannerButtonText;

    @C09CT("banner_desc_text")
    public final String bannerDescText;

    @C09CT("banner_icon")
    public final Image bannerIcon;

    @C09CT("banner_text")
    public final String bannerText;

    @C09CT("expansion_voucher")
    public final ExpansionVoucher expansionVoucher;

    public PanelExpansionVoucher() {
        this(null, null, null, null, null, null, null);
    }

    public PanelExpansionVoucher(ExpansionVoucher expansionVoucher, String str, String str2, String str3, Image image, Image image2, Image image3) {
        this.expansionVoucher = expansionVoucher;
        this.bannerText = str;
        this.bannerDescText = str2;
        this.bannerButtonText = str3;
        this.bannerIcon = image;
        this.bannerBg = image2;
        this.bannerBgDark = image3;
    }
}
