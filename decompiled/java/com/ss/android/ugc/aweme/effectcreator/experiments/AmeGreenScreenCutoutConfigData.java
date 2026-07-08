package com.ss.android.ugc.aweme.effectcreator.experiments;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class AmeGreenScreenCutoutConfigData {

    @C09CT("cutout_entrance_config")
    public final String cutoutEntranceConfig;

    @C09CT("greenscreen_default_placeholder_link")
    public final String greenScreenDefaultPlaceholderLink;

    @C09CT("greenscreen_human_big_placeholder_link")
    public final String greenScreenHumanBigPlaceholderLink;

    @C09CT("greenscreen_human_small_placeholder_link")
    public final String greenScreenHumanSmallPlaceholderLink;

    public AmeGreenScreenCutoutConfigData() {
        this("portrait_cutout,auto_fit,stroke", "", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/aulpsj_lth_rvarpa/ljhwZthlaukjlkulzlp/images/greenscreen_cutout/greenScreen_gortrait_small.png", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/aulpsj_lth_rvarpa/ljhwZthlaukjlkulzlp/images/greenscreen_cutout/greenScreen_gortrait_big.png");
    }

    public AmeGreenScreenCutoutConfigData(String str, String str2, String str3, String str4) {
        this.cutoutEntranceConfig = str;
        this.greenScreenDefaultPlaceholderLink = str2;
        this.greenScreenHumanSmallPlaceholderLink = str3;
        this.greenScreenHumanBigPlaceholderLink = str4;
    }
}
