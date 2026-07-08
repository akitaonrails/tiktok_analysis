package com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class PrivacyLabelConfigModel {

    @C09CT("alternative_title")
    public final Map<String, String> alternativeTitle;

    @C09CT("label_title")
    public final String labelTitle;

    @C09CT("option_value")
    public final Integer optionValue;

    public PrivacyLabelConfigModel() {
        this(null, null, null);
    }

    public PrivacyLabelConfigModel(Integer num, String str, Map<String, String> map) {
        this.optionValue = num;
        this.labelTitle = str;
        this.alternativeTitle = map;
    }
}
