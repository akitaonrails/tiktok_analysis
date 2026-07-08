package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class AgeGateInfo implements Serializable {

    @C09CT("age_gate_image_url")
    public final String ageGateImageUrl;

    @C09CT("age_input_placeholder")
    public final String ageGateInputPlaceHolder;

    @C09CT("age_indicator_type")
    public final Integer ageIndicatorType;

    @C09CT("confirmation_type")
    public final Integer confirmationType;

    @C09CT("content")
    public final String content;

    @C09CT("default_date")
    public final String defaultDate;

    @C09CT("age_gate_header")
    public final String header;

    @C09CT("age_gate_content_hyperlinks")
    public final List<AgeGateHyperlink> hyperlinks;

    @C09CT("lower_bound_date")
    public final String lowerBoundDate;

    @C09CT("age_gate_buttons")
    public List<AgeGateNavButton> navButtons;

    @C09CT("age_action_text")
    public final String nextButtonText;

    @C09CT("option_list")
    public final List<AgeGateOption> optionList;

    @C09CT("title")
    public final String title;

    @C09CT("upper_bound_date")
    public final String upperBoundDate;

    public final String getAgeGateImageUrl() {
        return this.ageGateImageUrl;
    }

    public final String getAgeGateInputPlaceHolder() {
        return this.ageGateInputPlaceHolder;
    }

    public final Integer getAgeIndicatorType() {
        return this.ageIndicatorType;
    }

    public final Integer getConfirmationType() {
        return this.confirmationType;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getDefaultDate() {
        return this.defaultDate;
    }

    public final String getHeader() {
        return this.header;
    }

    public final List<AgeGateHyperlink> getHyperlinks() {
        return this.hyperlinks;
    }

    public final String getLowerBoundDate() {
        return this.lowerBoundDate;
    }

    public final List<AgeGateNavButton> getNavButtons() {
        return this.navButtons;
    }

    public final String getNextButtonText() {
        return this.nextButtonText;
    }

    public final List<AgeGateOption> getOptionList() {
        return this.optionList;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUpperBoundDate() {
        return this.upperBoundDate;
    }

    public final void setNavButtons(List<AgeGateNavButton> list) {
        this.navButtons = list;
    }
}
