package com.ss.android.ugc.aweme.slash.component;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashConfig {

    @C09CT("async_load_time_out_ms")
    public final SkeletonDismissTimeConfig asyncLoadTimeOutMs;

    @C09CT("is_async_load")
    public final Boolean isAsyncLoad;

    @C09CT("elevator_navi_enable")
    public final Boolean naviEnable;

    @C09CT("elevator_navi_tab_name")
    public final String naviTabName;

    @C09CT("secondary_page_button_name")
    public final String secondaryPageBtnName;

    @C09CT("skeleton_delay_dismiss_time_ms")
    public final SkeletonDismissTimeConfig skeletonDelayDismissTimeMs;

    @C09CT("slash_popup_config")
    public final SlashPopupConfig slashPopupConfig;

    @C09CT("style")
    public final ComponentStyle style;

    public SlashConfig() {
        this(null, null, null, null, null, null, null, null);
    }

    public SlashConfig(Boolean bool, String str, String str2, SlashPopupConfig slashPopupConfig, SkeletonDismissTimeConfig skeletonDismissTimeConfig, Boolean bool2, SkeletonDismissTimeConfig skeletonDismissTimeConfig2, ComponentStyle componentStyle) {
        this.naviEnable = bool;
        this.naviTabName = str;
        this.secondaryPageBtnName = str2;
        this.slashPopupConfig = slashPopupConfig;
        this.skeletonDelayDismissTimeMs = skeletonDismissTimeConfig;
        this.isAsyncLoad = bool2;
        this.asyncLoadTimeOutMs = skeletonDismissTimeConfig2;
        this.style = componentStyle;
    }
}
