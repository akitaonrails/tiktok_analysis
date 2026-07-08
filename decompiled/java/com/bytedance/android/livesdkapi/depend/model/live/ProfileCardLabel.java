package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes8.dex */
public final class ProfileCardLabel {

    @C09CT("arrow_config")
    public LabelArrowConfig arrowConfig;

    @C09CT("background")
    public LabelBackground background;

    @C09CT("background_auto_mirrored")
    public boolean backgroundAutoMirrored;

    @C09CT("background_dark_mode")
    public LabelBackground backgroundDarkMode;

    @C09CT("font_style")
    public LabelFontStyle fontStyle;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("icon_auto_mirrored")
    public boolean iconAutoMirrored;

    @C09CT("padding")
    public LabelPadding padding;

    @C09CT("show_style")
    public int showStyle;

    @C09CT("text")
    public Text text;

    @C09CT("type")
    public int type;

    @C09CT("open_web_url")
    public String openWebUrl = "";

    @C09CT("label_id")
    public String labelId = "";
}
