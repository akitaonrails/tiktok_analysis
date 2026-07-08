package com.ss.android.ugc.aweme.feed.model.commercialize.adexperience;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceAceSurveyInfo implements Serializable {

    @C09CT("brand_name")
    public final String brandName;

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("options")
    public final List<AceSurveyOption> options;

    @C09CT("schema_url")
    public final String schema;

    @C09CT("send_notice_time")
    public final int sendNoticeTime;

    @C09CT("bg_url")
    public final String surveyBgCover;

    @C09CT("text")
    public final String text;

    @C09CT("title")
    public final String title;

    @C09CT("style_type")
    public final Integer styleType = -1;

    @C09CT("user_convert")
    public final AceSurveyUserConvert userConvert = new AceSurveyUserConvert();

    @C09CT("gecko_channel")
    public final ArrayList<String> geckoChannel = new ArrayList<>();

    public final String getBrandName() {
        return this.brandName;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final ArrayList<String> getGeckoChannel() {
        return this.geckoChannel;
    }

    public final List<AceSurveyOption> getOptions() {
        return this.options;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final int getSendNoticeTime() {
        return this.sendNoticeTime;
    }

    public final Integer getStyleType() {
        return this.styleType;
    }

    public final String getSurveyBgCover() {
        return this.surveyBgCover;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final AceSurveyUserConvert getUserConvert() {
        return this.userConvert;
    }
}
