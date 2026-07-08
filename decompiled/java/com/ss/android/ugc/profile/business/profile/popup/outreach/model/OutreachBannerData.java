package com.ss.android.ugc.profile.business.profile.popup.outreach.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class OutreachBannerData {
    public String LIZ;

    @C09CT("banner_type")
    public final Integer bannerType;

    @C09CT("button_info")
    public final ButtonInfo buttonInfo;

    @C09CT("close_button")
    public final Boolean closeButton;

    @C09CT("content")
    public final String content;

    @C09CT("duration")
    public final Integer durationSeconds;

    @C09CT("event_params")
    public final List<EventParam> eventParams;

    @C09CT("exit_strategy")
    public final List<ExitRule> exitRules;

    @C09CT("frequency_control")
    public final List<FrequencyRule> frequencyRules;

    @C09CT("icon_url")
    public final UrlModel iconUrl;

    @C09CT("banner_key")
    public final String key;

    @C09CT("schema_url")
    public final String schemaUrl;

    @C09CT("strategy_key")
    public final String strategyKey;

    @C09CT("title")
    public final String title;

    public OutreachBannerData() {
        this(null, Boolean.FALSE, null, null, null, null, null, null, null, null, null, null, null);
    }

    public OutreachBannerData(String str, Boolean bool, Integer num, Integer num2, UrlModel urlModel, String str2, String str3, ButtonInfo buttonInfo, String str4, List<FrequencyRule> list, List<ExitRule> list2, String str5, List<EventParam> list3) {
        this.key = str;
        this.closeButton = bool;
        this.bannerType = num;
        this.durationSeconds = num2;
        this.iconUrl = urlModel;
        this.title = str2;
        this.content = str3;
        this.buttonInfo = buttonInfo;
        this.schemaUrl = str4;
        this.frequencyRules = list;
        this.exitRules = list2;
        this.strategyKey = str5;
        this.eventParams = list3;
    }
}
