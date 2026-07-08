package com.ss.android.ugc.aweme.compliance.common.hydrogen.handlers;

import X.C09CT;
import X.EnumC849350XTp;

/* JADX INFO: loaded from: classes14.dex */
public final class DialogOption {

    @C09CT("option_content")
    public final String optionContent;

    @C09CT("option_id")
    public final String optionId;

    @C09CT("option_style")
    public final EnumC849350XTp optionStyle;

    @C09CT("option_url")
    public final String optionUrl;

    public DialogOption(String str, EnumC849350XTp enumC849350XTp, String str2, String str3) {
        this.optionContent = str;
        this.optionStyle = enumC849350XTp;
        this.optionId = str2;
        this.optionUrl = str3;
    }
}
