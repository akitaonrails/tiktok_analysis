package com.ss.android.ugc.aweme.ecommerce.mall.tools.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ToolPanelEntryTitleDTO {

    @C09CT("default_text")
    public String defaultText;

    @C09CT("starling_key")
    public String starlingKey;

    @C09CT("text")
    public String text;

    public ToolPanelEntryTitleDTO() {
        this(null, null, null);
    }

    public ToolPanelEntryTitleDTO(String str, String str2, String str3) {
        this.text = str;
        this.starlingKey = str2;
        this.defaultText = str3;
    }
}
