package com.ss.android.ugc.aweme.texttoimage.setting;

import X.C09CT;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class TextToImageUrlsConfig {

    @C09CT("text_image_ai_guide_fallback")
    public final String aiFallbackGuide;

    @C09CT("eidt_background_url")
    public final String editBgUrl;

    @C09CT("text_image_guide")
    public final String editGuide;

    /* JADX WARN: Multi-variable type inference failed */
    public TextToImageUrlsConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public TextToImageUrlsConfig(String str, String str2, String str3) {
        this.editBgUrl = str;
        this.editGuide = str2;
        this.aiFallbackGuide = str3;
    }

    public /* synthetic */ TextToImageUrlsConfig(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "https://sf16-sg.tiktokcdn.com/obj/eden-sg/5991eh7pkbd/text_to_image_bg_new.webp" : str, (i & 2) != 0 ? "https://sf16-sg.tiktokcdn.com/obj/eden-sg/5991eh7pkbd/textimage_guide.png" : str2, (i & 4) != 0 ? "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nulwpfhbo/text_image_ai_guide_fallback.png" : str3);
    }
}
