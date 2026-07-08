package com.bytedance.ies.ugc.aweme.rich.model.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class LandingPageConfig implements Serializable {

    @C09CT("efficiency_component_button")
    public final EfficiencyComponents efficiencyComponents;

    @C09CT("forward_back_button_position")
    public final String forwardBackButtonPosition;

    @C09CT("iab_history")
    public final IABHistory iabHistory;

    @C09CT("landing_page_bottom_bar_type")
    public final Integer landingPageBottomBarType;

    @C09CT("sheet_ratio")
    public final Integer sheetRatio;

    @C09CT("should_add_user_interaction_record")
    public final Boolean shouldAddUserInteractionRecord;

    @C09CT("strict_use_pure_link")
    public final boolean strictUsePureLink;

    @C09CT("web_gecko_channels")
    public final List<String> webGeckoChannels;

    @C09CT("web_watch_while_loading_type")
    public final Integer webWatchWhileLoadingType;

    @C09CT("while_loading_finish_fullscreen_type")
    public final Integer whileLoadingFinishFullScreenType;

    @C09CT("while_loading_timing_type")
    public final int whileLoadingTimingType;

    public LandingPageConfig() {
        this(0, null, Boolean.FALSE, "bottom", null, 0, 60, false, null, 0, 0);
    }

    public LandingPageConfig(Integer num, List<String> list, Boolean bool, String str, EfficiencyComponents efficiencyComponents, Integer num2, Integer num3, boolean z, IABHistory iABHistory, Integer num4, int i) {
        this.landingPageBottomBarType = num;
        this.webGeckoChannels = list;
        this.shouldAddUserInteractionRecord = bool;
        this.forwardBackButtonPosition = str;
        this.efficiencyComponents = efficiencyComponents;
        this.webWatchWhileLoadingType = num2;
        this.sheetRatio = num3;
        this.strictUsePureLink = z;
        this.iabHistory = iABHistory;
        this.whileLoadingFinishFullScreenType = num4;
        this.whileLoadingTimingType = i;
    }
}
