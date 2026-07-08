package com.ss.android.ugc.aweme.pipo.hybrid.retention;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoRetentionPopupConfig {

    @C09CT("content_text")
    public final String contentText;

    @C09CT("primary_button")
    public final PipoRetentionButtonConfig primaryButton;

    @C09CT("secondary_button")
    public final PipoRetentionButtonConfig secondaryButton;

    @C09CT("title_text")
    public final String titleText;

    public PipoRetentionPopupConfig() {
        this(null, null, null, null);
    }

    public PipoRetentionPopupConfig(String str, String str2, PipoRetentionButtonConfig pipoRetentionButtonConfig, PipoRetentionButtonConfig pipoRetentionButtonConfig2) {
        this.titleText = str;
        this.contentText = str2;
        this.primaryButton = pipoRetentionButtonConfig;
        this.secondaryButton = pipoRetentionButtonConfig2;
    }
}
