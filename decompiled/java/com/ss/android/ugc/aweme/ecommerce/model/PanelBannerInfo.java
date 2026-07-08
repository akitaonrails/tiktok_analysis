package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.ext.GImage;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class PanelBannerInfo implements Serializable {

    @C09CT("background_img")
    public final GImage backgroundImg;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("left_img")
    public final GImage leftImg;

    @C09CT("schema")
    public final String schema;

    @C09CT("sub_title")
    public final String subTitle;

    @C09CT("sub_title_color")
    public final String subTitleColor;

    public PanelBannerInfo() {
        this(null, null, null, null, null, null);
    }

    public PanelBannerInfo(GImage gImage, GImage gImage2, String str, String str2, String str3, String str4) {
        this.backgroundImg = gImage;
        this.leftImg = gImage2;
        this.subTitle = str;
        this.schema = str2;
        this.daInfo = str3;
        this.subTitleColor = str4;
    }
}
