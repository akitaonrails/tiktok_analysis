package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public class BannerCollapseInfo {

    @C09CT("background_color")
    public String backgroundColor;

    @C09CT("collapse_height")
    public Long collapseHeight;

    @C09CT("enable")
    public boolean enabled;

    @C09CT("collapse_image")
    public ImageModel image;

    @C09CT("collapse_title")
    public Text title;

    @C09CT("vertical_line_color")
    public String verticalLineColor;
}
