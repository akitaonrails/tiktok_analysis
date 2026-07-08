package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public class CommonToastMessage extends AbstractC1136060ffY {

    @C09CT("discardable")
    public boolean discardable;

    @C09CT("duration")
    public int duration;

    @C09CT("top_img_height")
    public int imageHeight;

    @C09CT("top_img_width")
    public int imageWidth;

    @C09CT("immediate")
    public boolean immediate;

    @C09CT("show_mongolia_layer")
    public boolean showMongoliaLayer;

    @C09CT("top_img")
    public ImageModel topImage;

    @C09CT("background_color_start")
    public String backgroundColorStart = "#ff9d5c";

    @C09CT("background_color_end")
    public String backgroundColorEnd = "#ff9d5c";

    @C09CT("text_color")
    public String textColor = "#ffffff";

    @C09CT("position")
    public int position = 1;

    public CommonToastMessage() {
        this.type = C001A.COMMON_TOAST;
    }
}
