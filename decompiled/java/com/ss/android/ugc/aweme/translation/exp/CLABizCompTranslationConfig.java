package com.ss.android.ugc.aweme.translation.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class CLABizCompTranslationConfig {

    @C09CT("enable_cla_bizcomp_generic_translation")
    public final boolean enableClaBizCompGenericTranslation;

    @C09CT("enable_half_screen_translation_and_dnt_setting_panels")
    public final boolean enableHalfScreenTranslationAndDntSettingPanels;

    public CLABizCompTranslationConfig() {
        this(false, false);
    }

    public CLABizCompTranslationConfig(boolean z, boolean z2) {
        this.enableClaBizCompGenericTranslation = z;
        this.enableHalfScreenTranslationAndDntSettingPanels = z2;
    }
}
