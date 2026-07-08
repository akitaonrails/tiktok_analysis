package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes.dex */
public final class RichTextStyle {

    @C09CT("color_background")
    public ColorBackground colorBackground;

    @C09CT("content_align_x")
    public int contentAlignX;

    @C09CT("flow_spec")
    public FlowSpec flowSpec;

    @C09CT("font_size")
    public int fontSize;

    @C09CT("image_background")
    public ImageBackground imageBackground;

    @C09CT("inline_background")
    public ColorBackground inlineBackground;

    @C09CT("line_height")
    public float lineHeight;

    @C09CT("line_spacing")
    public float lineSpacing;

    @C09CT("padding")
    public EdgeInsets padding;

    @C09CT("paragraph_layout")
    public ParagraphLayout paragraphLayout;

    @C09CT("stroke")
    public StrokeStyle stroke;

    @C09CT("type")
    public int type;

    @C09CT("name")
    public String name = "";

    @C09CT("text_style")
    public int textStyle = LSPassThroughRecordSizeConfig.DEFAULT;

    @C09CT("font_family")
    public String fontFamily = "";

    @C09CT("color")
    public String color = "";
}
