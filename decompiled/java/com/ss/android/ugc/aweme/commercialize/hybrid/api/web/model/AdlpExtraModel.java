package com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model;

import X.C09CT;
import X.C1028150crV;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.AiAgentConfig;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.ad.QuickActionModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdlpExtraModel implements Serializable {
    public static final C1028150crV Companion = new Object() { // from class: X.0crV
    };

    @C09CT("ai_agent_config")
    public AiAgentConfig aiAgentConfig;

    @C09CT("aweme_id")
    public String aid;

    @C09CT("alpha_loading_effective_scene")
    public Integer alphaLoadingEffectiveScene;

    @C09CT("author")
    public User author;

    @C09CT("authorAvatar")
    public UrlModel authorAvatar;

    @C09CT("business_extra")
    public String businessExtra;

    @C09CT("container_bg_color")
    public String containerBgColor;

    @C09CT("enter_scene")
    public String enterScene;

    @C09CT("hide_nav_bar")
    public Boolean hideNavBar;

    @C09CT("initial_data")
    public String initialData;

    @C09CT("landingPageStyle")
    public Integer landingPageStyle;

    @C09CT("lynxPresentationStyle")
    public Integer lynxPresentationStyle;

    @C09CT("lynxShowType")
    public Integer lynxShowType;

    @C09CT("message_session_id")
    public String messageSessionId;

    @C09CT("nonAdWebModel")
    public NonAdWebModel nonAdWebModel;

    @C09CT("quick_action_model")
    public QuickActionModel quickActionModel;

    @C09CT("refer")
    public String refer;

    @C09CT("report_ad_extra_data")
    public String reportAdExtraData;

    @C09CT("request_id")
    public String requestId;

    @C09CT("trans_status_bar")
    public Boolean transStatusBar;

    @C09CT("url_extra_data")
    public final String urlExtraData;

    @C09CT("video")
    public Video video;

    public AdlpExtraModel() {
        this(null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final String getAuthorUid() {
        String uid;
        User user = this.author;
        return (user == null || (uid = user.getUid()) == null) ? "" : uid;
    }

    public final AiAgentConfig getAiAgentConfig() {
        return this.aiAgentConfig;
    }

    public final String getAid() {
        return this.aid;
    }

    public final Integer getAlphaLoadingEffectiveScene() {
        return this.alphaLoadingEffectiveScene;
    }

    public final User getAuthor() {
        return this.author;
    }

    public final UrlModel getAuthorAvatar() {
        return this.authorAvatar;
    }

    public final String getBusinessExtra() {
        return this.businessExtra;
    }

    public final String getContainerBgColor() {
        return this.containerBgColor;
    }

    public final String getEnterScene() {
        return this.enterScene;
    }

    public final Boolean getHideNavBar() {
        return this.hideNavBar;
    }

    public final String getInitialData() {
        return this.initialData;
    }

    public final Integer getLandingPageStyle() {
        return this.landingPageStyle;
    }

    public final Integer getLynxPresentationStyle() {
        return this.lynxPresentationStyle;
    }

    public final Integer getLynxShowType() {
        return this.lynxShowType;
    }

    public final String getMessageSessionId() {
        return this.messageSessionId;
    }

    public final NonAdWebModel getNonAdWebModel() {
        return this.nonAdWebModel;
    }

    public final QuickActionModel getQuickActionModel() {
        return this.quickActionModel;
    }

    public final String getRefer() {
        return this.refer;
    }

    public final String getReportAdExtraData() {
        return this.reportAdExtraData;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final Boolean getTransStatusBar() {
        return this.transStatusBar;
    }

    public final String getUrlExtraData() {
        return this.urlExtraData;
    }

    public final Video getVideo() {
        return this.video;
    }

    public final void setAiAgentConfig(AiAgentConfig aiAgentConfig) {
        this.aiAgentConfig = aiAgentConfig;
    }

    public final void setAid(String str) {
        this.aid = str;
    }

    public final void setAlphaLoadingEffectiveScene(Integer num) {
        this.alphaLoadingEffectiveScene = num;
    }

    public final void setAuthor(User user) {
        this.author = user;
    }

    public final void setAuthorAvatar(UrlModel urlModel) {
        this.authorAvatar = urlModel;
    }

    public final void setBusinessExtra(String str) {
        this.businessExtra = str;
    }

    public final void setContainerBgColor(String str) {
        this.containerBgColor = str;
    }

    public final void setEnterScene(String str) {
        this.enterScene = str;
    }

    public final void setHideNavBar(Boolean bool) {
        this.hideNavBar = bool;
    }

    public final void setInitialData(String str) {
        this.initialData = str;
    }

    public final void setLandingPageStyle(Integer num) {
        this.landingPageStyle = num;
    }

    public final void setLynxPresentationStyle(Integer num) {
        this.lynxPresentationStyle = num;
    }

    public final void setLynxShowType(Integer num) {
        this.lynxShowType = num;
    }

    public final void setMessageSessionId(String str) {
        this.messageSessionId = str;
    }

    public final void setNonAdWebModel(NonAdWebModel nonAdWebModel) {
        this.nonAdWebModel = nonAdWebModel;
    }

    public final void setQuickActionModel(QuickActionModel quickActionModel) {
        this.quickActionModel = quickActionModel;
    }

    public final void setRefer(String str) {
        this.refer = str;
    }

    public final void setReportAdExtraData(String str) {
        this.reportAdExtraData = str;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }

    public final void setTransStatusBar(Boolean bool) {
        this.transStatusBar = bool;
    }

    public final void setVideo(Video video) {
        this.video = video;
    }

    public AdlpExtraModel(User user, String str, String str2, Video video, String str3, String str4, Integer num, Integer num2, Integer num3, NonAdWebModel nonAdWebModel, UrlModel urlModel, String str5, Boolean bool, Boolean bool2, String str6, String str7, String str8, QuickActionModel quickActionModel, String str9, String str10, AiAgentConfig aiAgentConfig, Integer num4) {
        this.author = user;
        this.requestId = str;
        this.aid = str2;
        this.video = video;
        this.urlExtraData = str3;
        this.refer = str4;
        this.landingPageStyle = num;
        this.lynxShowType = num2;
        this.lynxPresentationStyle = num3;
        this.nonAdWebModel = nonAdWebModel;
        this.authorAvatar = urlModel;
        this.containerBgColor = str5;
        this.hideNavBar = bool;
        this.transStatusBar = bool2;
        this.initialData = str6;
        this.businessExtra = str7;
        this.reportAdExtraData = str8;
        this.quickActionModel = quickActionModel;
        this.messageSessionId = str9;
        this.enterScene = str10;
        this.aiAgentConfig = aiAgentConfig;
        this.alphaLoadingEffectiveScene = num4;
    }
}
