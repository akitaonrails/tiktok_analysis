package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class PromptPayload implements Serializable {

    @C09CT("button_left_text")
    public final String buttonLeftText;

    @C09CT("button_right_text")
    public final String buttonRightText;

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("prompt_description")
    public final List<Description> description;

    @C09CT("prompt_title")
    public final String title;

    public PromptPayload(String str, List<Description> list, String str2, String str3, String str4) {
        this.title = str;
        this.description = list;
        this.buttonText = str2;
        this.buttonLeftText = str3;
        this.buttonRightText = str4;
    }
}
