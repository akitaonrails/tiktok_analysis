package com.ss.android.ugc.aweme.editpost;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class DescTitleTranslatedText implements Serializable {

    @C09CT("translated_desc_client_text")
    public ClientText translatedDescClientText;

    @C09CT("translated_desc_content")
    public String translatedDescContent;

    @C09CT("translated_desc_lang")
    public String translatedDescLang;

    @C09CT("translated_desc_variant")
    public String translatedDescVariant;

    @C09CT("translated_title")
    public String translatedTitle;

    @C09CT("translated_title_lang")
    public String translatedTitleLang;

    @C09CT("translated_title_variant")
    public String translatedTitleVariant;

    public DescTitleTranslatedText() {
        this("", "", "", null, "", "", "");
    }

    public DescTitleTranslatedText(String str, String str2, String str3, ClientText clientText, String str4, String str5, String str6) {
        this.translatedDescContent = str;
        this.translatedDescLang = str2;
        this.translatedDescVariant = str3;
        this.translatedDescClientText = clientText;
        this.translatedTitle = str4;
        this.translatedTitleLang = str5;
        this.translatedTitleVariant = str6;
    }
}
