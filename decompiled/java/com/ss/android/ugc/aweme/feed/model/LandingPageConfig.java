package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class LandingPageConfig implements Serializable {

    @C09CT("ai_components")
    public final List<String> aiComponents;

    @C09CT("auto_popup_action_model")
    public final AutoPopupActionModel autoPopupActionModel;

    @C09CT("efficiency_component_button")
    public final EfficiencyComponents efficiencyComponents;

    @C09CT("enable_iab_framework_revamp")
    public final boolean enableIabFrameworkRevamp;

    @C09CT("enable_utm_param_attach")
    public final Integer enableUtmAttach;

    @C09CT("forward_back_button_position")
    public final String forwardBackButtonPosition;

    @C09CT("iab_history")
    public final IABHistory iabHistory;

    @C09CT("iab_to_iab_add_utm")
    public final Integer iabToIabAddUtm;

    @C09CT("is_autofill_noneffective")
    public final int isAutofillNoneffective;

    @C09CT("landing_page_bottom_bar_type")
    public final Integer landingPageBottomBarType;

    @C09CT("sheet_ratio")
    public final Integer sheetRatio;

    @C09CT("should_add_user_interaction_record")
    public final Boolean shouldAddUserInteractionRecord;

    @C09CT("show_boc_banner_type")
    public final Integer showBocBannerType;

    @C09CT("strict_use_pure_link")
    public final boolean strictUsePureLink;

    @C09CT("ulink_allowed_domain_list")
    public final List<String> ulinkAllowedDomainList;

    @C09CT("web_gecko_channels")
    public final List<String> webGeckoChannels;

    @C09CT("web_watch_while_loading_type")
    public final Integer webWatchWhileLoadingType;

    @C09CT("while_loading_expand_limit_time")
    public final int whileLoadingExpandLimitTime;

    @C09CT("while_loading_expand_max_time")
    public final int whileLoadingExpandMaxTime;

    @C09CT("while_loading_finish_fullscreen_type")
    public final Integer whileLoadingFinishFullScreenType;

    @C09CT("while_loading_timing_type")
    public final int whileLoadingTimingType;

    public LandingPageConfig() {
        this(false, 0, null, Boolean.FALSE, "bottom", null, null, null, 0, 60, false, null, 0, 0, -1, -1, -1, -1, -1, null, 0);
    }

    public final int isAutofillNoneffective() {
        return this.isAutofillNoneffective;
    }

    public LandingPageConfig(boolean z, Integer num, List<String> list, Boolean bool, String str, List<String> list2, EfficiencyComponents efficiencyComponents, AutoPopupActionModel autoPopupActionModel, Integer num2, Integer num3, boolean z2, IABHistory iABHistory, Integer num4, int i, int i2, int i3, Integer num5, Integer num6, Integer num7, List<String> list3, int i4) {
        this.enableIabFrameworkRevamp = z;
        this.landingPageBottomBarType = num;
        this.webGeckoChannels = list;
        this.shouldAddUserInteractionRecord = bool;
        this.forwardBackButtonPosition = str;
        this.aiComponents = list2;
        this.efficiencyComponents = efficiencyComponents;
        this.autoPopupActionModel = autoPopupActionModel;
        this.webWatchWhileLoadingType = num2;
        this.sheetRatio = num3;
        this.strictUsePureLink = z2;
        this.iabHistory = iABHistory;
        this.whileLoadingFinishFullScreenType = num4;
        this.whileLoadingTimingType = i;
        this.whileLoadingExpandMaxTime = i2;
        this.whileLoadingExpandLimitTime = i3;
        this.enableUtmAttach = num5;
        this.iabToIabAddUtm = num6;
        this.showBocBannerType = num7;
        this.ulinkAllowedDomainList = list3;
        this.isAutofillNoneffective = i4;
    }
}
