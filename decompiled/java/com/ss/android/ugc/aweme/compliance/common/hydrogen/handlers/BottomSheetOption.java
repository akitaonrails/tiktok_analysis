package com.ss.android.ugc.aweme.compliance.common.hydrogen.handlers;

import X.C09CT;
import X.EnumC094500Xf;

/* JADX INFO: loaded from: classes28.dex */
public final class BottomSheetOption {

    @C09CT("option_content")
    public final String optionContent;

    @C09CT("option_id")
    public final String optionId;

    @C09CT("option_style")
    public final EnumC094500Xf optionStyle;

    @C09CT("option_url")
    public final String optionUrl;

    public BottomSheetOption(String str, EnumC094500Xf enumC094500Xf, String str2, String str3) {
        this.optionContent = str;
        this.optionStyle = enumC094500Xf;
        this.optionId = str2;
        this.optionUrl = str3;
    }
}
