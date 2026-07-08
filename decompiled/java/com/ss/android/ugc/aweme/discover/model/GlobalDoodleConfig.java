package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.ecom.data.ECServerPerfInfo;
import com.ss.android.ugc.aweme.search.ecom.data.EcomSearchInfo;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class GlobalDoodleConfig implements Serializable {

    @C09CT("ab_params")
    public Map<String, String> abParams;

    @C09CT("activity_card_bg")
    public SearchActivityCardBgData activityCardBg;

    @C09CT("background_config")
    public SearchBackgroundConfig backgroundConfig;

    @C09CT("can_pull_refresh")
    public boolean canPullRefresh;

    @C09CT("hashtag_vertical_style_type")
    public final int challengeItemStyle;

    @C09CT("create_button_config")
    public CreateButtonConfig createButtonConfig;

    @C09CT("disable_gold_task")
    public Boolean disableGoldTask;

    @C09CT("disable_inner_flow")
    public boolean disableInnerFlow;

    @C09CT("disable_music_dsp_freq_ctrl")
    public final boolean disableMusicDspFreqCtrl;

    @C09CT("disable_reorder")
    public int disableReorder;

    @C09CT("disable_search_task")
    public Boolean disableSearchTask;

    @C09CT("display_filter_bar")
    public int displayFilterBar = 1;

    @C09CT("ecom_api_version")
    public String ecomApiVersion;

    @C09CT("ecom_search_info")
    public EcomSearchInfo ecomSearchInfo;

    @C09CT("enable_image_record")
    public Boolean enableImageRecord;

    @C09CT("feedback_survey")
    public List<FeedbackContents> feedbackSurvey;

    @C09CT("feel_good")
    public HashMap<String, Object> feelGood;

    @C09CT("forbid_search_type")
    public int forbidSearchType;

    @C09CT("has_ecom_intent")
    public Boolean hasEcomIntent;

    @C09CT("hide_results")
    public Boolean hideResults;

    @C09CT("his_intent_info")
    public final HistoryIntentInfo historyIntentInfo;

    @C09CT("new_source")
    public String newSource;

    @C09CT("original_ecom_intent")
    public Integer originalEcomIntent;

    @C09CT("prefetch_degrade_level")
    public int prefetchDegradeLevel;

    @C09CT("keyword")
    public String requestKeyword;

    @C09CT("search_channel")
    public String searchChannel;

    @C09CT("search_intent")
    public SearchIntentStruct searchIntentStruct;

    @C09CT("server_perf_info")
    public ECServerPerfInfo serverPerfInfo;

    @C09CT("server_state")
    public int serverState;

    @C09CT("should_show_native_gps_banner")
    public boolean shouldShowNativeGPSPopup;

    @C09CT("show_video_research_tab_list")
    public Boolean showResearchFilter;

    @C09CT("show_results_source")
    public String showResultsSource;

    @C09CT("sounds_list_type")
    public int soundsListType;

    @C09CT("survey_config")
    public SearchSurveyConfig surveyConfig;

    @C09CT("tns_search_result")
    public String tnsBanType;

    @C09CT("use_scenario")
    public String useScenario;

    public GlobalDoodleConfig() {
        Boolean bool = Boolean.FALSE;
        this.disableGoldTask = bool;
        this.disableSearchTask = bool;
        this.disableReorder = -1;
    }

    public final Map<String, String> getAbParams() {
        return this.abParams;
    }

    public final SearchActivityCardBgData getActivityCardBg() {
        return this.activityCardBg;
    }

    public final SearchBackgroundConfig getBackgroundConfig() {
        return this.backgroundConfig;
    }

    public final boolean getCanPullRefresh() {
        return this.canPullRefresh;
    }

    public final int getChallengeItemStyle() {
        return this.challengeItemStyle;
    }

    public final CreateButtonConfig getCreateButtonConfig() {
        return this.createButtonConfig;
    }

    public final Boolean getDisableGoldTask() {
        return this.disableGoldTask;
    }

    public final boolean getDisableInnerFlow() {
        return this.disableInnerFlow;
    }

    public final boolean getDisableMusicDspFreqCtrl() {
        return this.disableMusicDspFreqCtrl;
    }

    public final int getDisableReorder() {
        return this.disableReorder;
    }

    public final Boolean getDisableSearchTask() {
        return this.disableSearchTask;
    }

    public final int getDisplayFilterBar() {
        return this.displayFilterBar;
    }

    public final String getEcomApiVersion() {
        return this.ecomApiVersion;
    }

    public final EcomSearchInfo getEcomSearchInfo() {
        return this.ecomSearchInfo;
    }

    public final Boolean getEnableImageRecord() {
        return this.enableImageRecord;
    }

    public final List<FeedbackContents> getFeedbackSurvey() {
        return this.feedbackSurvey;
    }

    public final HashMap<String, Object> getFeelGood() {
        return this.feelGood;
    }

    public final int getForbidSearchType() {
        return this.forbidSearchType;
    }

    public final Boolean getHasEcomIntent() {
        return this.hasEcomIntent;
    }

    public final Boolean getHideResults() {
        return this.hideResults;
    }

    public final HistoryIntentInfo getHistoryIntentInfo() {
        return this.historyIntentInfo;
    }

    public final String getNewSource() {
        return this.newSource;
    }

    public final Integer getOriginalEcomIntent() {
        return this.originalEcomIntent;
    }

    public final int getPrefetchDegradeLevel() {
        return this.prefetchDegradeLevel;
    }

    public final String getRequestKeyword() {
        return this.requestKeyword;
    }

    public final String getSearchChannel() {
        return this.searchChannel;
    }

    public final SearchIntentStruct getSearchIntentStruct() {
        return this.searchIntentStruct;
    }

    public final ECServerPerfInfo getServerPerfInfo() {
        return this.serverPerfInfo;
    }

    public final int getServerState() {
        return this.serverState;
    }

    public final boolean getShouldShowNativeGPSPopup() {
        return this.shouldShowNativeGPSPopup;
    }

    public final Boolean getShowResearchFilter() {
        return this.showResearchFilter;
    }

    public final String getShowResultsSource() {
        return this.showResultsSource;
    }

    public final int getSoundsListType() {
        return this.soundsListType;
    }

    public final SearchSurveyConfig getSurveyConfig() {
        return this.surveyConfig;
    }

    public final String getTnsBanType() {
        return this.tnsBanType;
    }

    public final String getUseScenario() {
        return this.useScenario;
    }

    public final void setAbParams(Map<String, String> map) {
        this.abParams = map;
    }

    public final void setActivityCardBg(SearchActivityCardBgData searchActivityCardBgData) {
        this.activityCardBg = searchActivityCardBgData;
    }

    public final void setBackgroundConfig(SearchBackgroundConfig searchBackgroundConfig) {
        this.backgroundConfig = searchBackgroundConfig;
    }

    public final void setCanPullRefresh(boolean z) {
        this.canPullRefresh = z;
    }

    public final void setCreateButtonConfig(CreateButtonConfig createButtonConfig) {
        this.createButtonConfig = createButtonConfig;
    }

    public final void setDisableGoldTask(Boolean bool) {
        this.disableGoldTask = bool;
    }

    public final void setDisableInnerFlow(boolean z) {
        this.disableInnerFlow = z;
    }

    public final void setDisableReorder(int i) {
        this.disableReorder = i;
    }

    public final void setDisableSearchTask(Boolean bool) {
        this.disableSearchTask = bool;
    }

    public final void setDisplayFilterBar(int i) {
        this.displayFilterBar = i;
    }

    public final void setEcomApiVersion(String str) {
        this.ecomApiVersion = str;
    }

    public final void setEcomSearchInfo(EcomSearchInfo ecomSearchInfo) {
        this.ecomSearchInfo = ecomSearchInfo;
    }

    public final void setEnableImageRecord(Boolean bool) {
        this.enableImageRecord = bool;
    }

    public final void setFeedbackSurvey(List<FeedbackContents> list) {
        this.feedbackSurvey = list;
    }

    public final void setFeelGood(HashMap<String, Object> map) {
        this.feelGood = map;
    }

    public final void setForbidSearchType(int i) {
        this.forbidSearchType = i;
    }

    public final void setHasEcomIntent(Boolean bool) {
        this.hasEcomIntent = bool;
    }

    public final void setHideResults(Boolean bool) {
        this.hideResults = bool;
    }

    public final void setNewSource(String str) {
        this.newSource = str;
    }

    public final void setOriginalEcomIntent(Integer num) {
        this.originalEcomIntent = num;
    }

    public final void setPrefetchDegradeLevel(int i) {
        this.prefetchDegradeLevel = i;
    }

    public final void setRequestKeyword(String str) {
        this.requestKeyword = str;
    }

    public final void setSearchChannel(String str) {
        this.searchChannel = str;
    }

    public final void setSearchIntentStruct(SearchIntentStruct searchIntentStruct) {
        this.searchIntentStruct = searchIntentStruct;
    }

    public final void setServerPerfInfo(ECServerPerfInfo eCServerPerfInfo) {
        this.serverPerfInfo = eCServerPerfInfo;
    }

    public final void setServerState(int i) {
        this.serverState = i;
    }

    public final void setShouldShowNativeGPSPopup(boolean z) {
        this.shouldShowNativeGPSPopup = z;
    }

    public final void setShowResearchFilter(Boolean bool) {
        this.showResearchFilter = bool;
    }

    public final void setShowResultsSource(String str) {
        this.showResultsSource = str;
    }

    public final void setSoundsListType(int i) {
        this.soundsListType = i;
    }

    public final void setSurveyConfig(SearchSurveyConfig searchSurveyConfig) {
        this.surveyConfig = searchSurveyConfig;
    }

    public final void setTnsBanType(String str) {
        this.tnsBanType = str;
    }

    public final void setUseScenario(String str) {
        this.useScenario = str;
    }
}
