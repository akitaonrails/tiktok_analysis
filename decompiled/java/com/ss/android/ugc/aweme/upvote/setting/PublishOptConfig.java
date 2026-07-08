package com.ss.android.ugc.aweme.upvote.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class PublishOptConfig {

    @C09CT("click_white_bar_new_interaction")
    public final boolean goInputWhenOnlySelf;

    @C09CT("use_new_hint")
    public final boolean newHint;

    @C09CT("new_text_input_style")
    public final boolean newInputStyle;

    @C09CT("repost_panel_bottom_new_style")
    public final boolean useTextBox;

    public PublishOptConfig() {
        this(false, false, false, false);
    }

    public PublishOptConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.newInputStyle = z;
        this.goInputWhenOnlySelf = z2;
        this.newHint = z3;
        this.useTextBox = z4;
    }
}
