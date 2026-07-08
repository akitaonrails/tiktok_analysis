package com.ss.android.ugc.aweme.editSticker.text.font;

import X.C09CT;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class TextFontStyleData {
    public String LIZ;
    public Map<String, String> LIZIZ;
    public Effect LJ;

    @C09CT("enable_bg_color")
    public int enableBgColor;

    @C09CT("enable_maskblur_light_color")
    public int enableMaskBlurLightColor;

    @C09CT("font_file_name")
    public String fileName;

    @C09CT("font_name")
    public String fontName;

    @C09CT("default_font_size")
    public int fontSize;

    @C09CT("title")
    public String title;

    @C09CT("top_offset")
    public int topOffset;

    @C09CT("text_animation_id")
    public String textAnimResourceId = "";
    public TextMotionData LIZJ = new TextMotionData();
    public int LIZLLL = 2;
    public boolean LJFF = false;

    public final boolean LIZ() {
        return this.enableMaskBlurLightColor == 1;
    }

    public final boolean LIZIZ() {
        return this.LIZLLL == 1;
    }
}
