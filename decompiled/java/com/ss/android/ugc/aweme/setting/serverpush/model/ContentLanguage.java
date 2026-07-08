package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public class ContentLanguage implements Serializable {

    @C09CT("en_name")
    public String englishName;

    @C09CT("code")
    public String languageCode;

    @C09CT("local_name")
    public String localName;

    public String getEnglishName() {
        return this.englishName;
    }

    public String getLanguageCode() {
        return this.languageCode;
    }

    public String getLocalName() {
        return this.localName;
    }

    public void setEnglishName(String str) {
        this.englishName = str;
    }

    public void setLanguageCode(String str) {
        this.languageCode = str;
    }

    public void setLocalName(String str) {
        this.localName = str;
    }
}
