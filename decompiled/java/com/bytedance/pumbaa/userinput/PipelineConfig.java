package com.bytedance.pumbaa.userinput;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class PipelineConfig {

    @C09CT("ui_text_field")
    public final ComponentConfig uiTextField;

    @C09CT("ui_text_view")
    public final ComponentConfig uiTextView;

    public PipelineConfig() {
        this(new ComponentConfig(false, 5000), new ComponentConfig(false, 5000));
    }

    public PipelineConfig(ComponentConfig componentConfig, ComponentConfig componentConfig2) {
        this.uiTextField = componentConfig;
        this.uiTextView = componentConfig2;
    }
}
