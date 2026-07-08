package com.bytedance.android.livesdk.content_spotlight.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class ContentSpotlightPageBanner {

    @C09CT("banner_id")
    public long bannerId;

    @C09CT("image")
    public ImageModel image;

    @C09CT("in_live_schema")
    public String inLiveSchema = "";

    @C09CT("out_live_schema")
    public String outLiveSchema = "";

    @C09CT("rtl_image")
    public ImageModel rtlImage;

    @C09CT("sub_title")
    public Text subTitle;

    @C09CT("title")
    public Text title;

    @C09CT("title_style")
    public int titleStyle;
}
