package com.ss.android.ugc.templatecore.templatedata;

import X.C09CT;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;

/* JADX INFO: loaded from: classes6.dex */
public final class TextStickerBizModel {

    @C09CT("auto_line_break")
    public final Boolean autoLineBreak;

    @C09CT("caption_template")
    public final CaptionTemplateData captionTemplateData;

    @C09CT("effect_style_info")
    public final TextStyleModel effectStyleInfo;

    @C09CT("force_lowercase")
    public final boolean forceLowercase;

    @C09CT("force_uppercase")
    public final boolean forceUppercase;

    @C09CT("style_info")
    public final TextStyleModel styleInfo;

    @C09CT("tts_info")
    public final TTSModel ttsInfo;

    public TextStickerBizModel(TTSModel tTSModel, TextStyleModel textStyleModel, TextStyleModel textStyleModel2, Boolean bool, CaptionTemplateData captionTemplateData, boolean z, boolean z2) {
        this.ttsInfo = tTSModel;
        this.styleInfo = textStyleModel;
        this.effectStyleInfo = textStyleModel2;
        this.autoLineBreak = bool;
        this.captionTemplateData = captionTemplateData;
        this.forceLowercase = z;
        this.forceUppercase = z2;
    }
}
