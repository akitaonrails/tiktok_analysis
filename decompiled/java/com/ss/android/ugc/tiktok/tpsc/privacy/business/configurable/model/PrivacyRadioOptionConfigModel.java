package com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class PrivacyRadioOptionConfigModel {

    @C09CT("alternative_title")
    public final Map<String, String> alternativeTitle;

    @C09CT("option_subtitle")
    public final String optionSubtitle;

    @C09CT("option_subtitle_with_inline_link")
    public final PrivacyTextWithInlineLink optionSubtitleWithInlineLink;

    @C09CT("option_tag")
    public final String optionTag;

    @C09CT("option_title")
    public final String optionTitle;

    @C09CT("option_value")
    public final Integer optionValue;

    public PrivacyRadioOptionConfigModel() {
        this(null, null, null, null, null, null);
    }

    public PrivacyRadioOptionConfigModel(String str, String str2, String str3, Integer num, Map<String, String> map, PrivacyTextWithInlineLink privacyTextWithInlineLink) {
        this.optionTitle = str;
        this.optionSubtitle = str2;
        this.optionTag = str3;
        this.optionValue = num;
        this.alternativeTitle = map;
        this.optionSubtitleWithInlineLink = privacyTextWithInlineLink;
    }
}
