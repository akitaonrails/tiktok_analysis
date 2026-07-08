package com.ss.android.ugc.aweme.template;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class TemplateButtonConfig implements Serializable {

    @C09CT("learn_more_bg_color")
    public String buttonBgColor;

    @C09CT("button_text")
    public String buttonText;

    @C09CT("schema_url")
    public String schemaUrl;

    @C09CT("show_button_right_arrow")
    public Boolean showBtnArrow;

    @C09CT("show_button_color_seconds")
    public Integer showButtonColorSeconds;

    @C09CT("show_button_seconds")
    public Integer showButtonSeconds;

    public TemplateButtonConfig() {
        this(null, null, null, null, null, null);
    }

    public TemplateButtonConfig(String str, Integer num, Integer num2, String str2, String str3, Boolean bool) {
        this.buttonText = str;
        this.showButtonSeconds = num;
        this.showButtonColorSeconds = num2;
        this.buttonBgColor = str2;
        this.schemaUrl = str3;
        this.showBtnArrow = bool;
    }
}
