package webcast.api.game;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class TextTrack {

    @C09CT("align_type")
    public int alignType;

    @C09CT("background_border_size")
    public double backgroundBorderSize;

    @C09CT("background_type")
    public int backgroundType;

    @C09CT("bold")
    public boolean bold;

    @C09CT("border_width")
    public int borderWidth;

    @C09CT("font_size")
    public int fontSize;

    @C09CT("inner_padding")
    public double innerPadding;

    @C09CT("italic")
    public boolean italic;

    @C09CT("line_max_width")
    public double lineMaxWidth;

    @C09CT("line_padding")
    public int linePadding;

    @C09CT("type_setting")
    public int typeSetting;

    @C09CT("underline")
    public boolean underline;

    @C09CT("text")
    public String text = "";

    @C09CT("text_res")
    public String textRes = "";

    @C09CT("font_type")
    public String fontType = "";

    @C09CT("font_color")
    public String fontColor = "";

    @C09CT("shadow_color")
    public String shadowColor = "";

    @C09CT("background_color")
    public String backgroundColor = "";

    @C09CT("border_color")
    public String borderColor = "";

    @C09CT("rich_text_list")
    public List<RichTextInfo> richTextList = new ArrayList();
}
