package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class GiftPanelBanner {

    @C09CT("banner_priority")
    public int bannerPriority;

    @C09CT("bg_color_values")
    public List<String> bgColors;

    @C09CT("bg_image")
    public ImageModel bgImage;

    @C09CT("display_text")
    public Text displayText;

    @C09CT("left_icon")
    public ImageModel leftIcon;

    @C09CT("schema_url")
    public String schemaUrl;

    @C09CT("banner_lynx_url")
    public String bannerLynxUrl = "";

    @C09CT("banner_lynx_extra")
    public String bannerLynxExtra = "";

    static {
        new GiftPanelBanner();
    }
}
