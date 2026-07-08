package com.ss.android.ugc.aweme.search.pages.result.bot.model;

import X.C09CT;
import X.C0Q7Q;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tako.model.SearchBingItem;
import com.ss.android.ugc.aweme.tako.model.TakoEventTracker;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoInfo implements Serializable {

    @C09CT("aweme_list")
    public List<? extends Aweme> awemeList;

    @C09CT("introduction_text")
    public final String botIntroduction;

    @C09CT("short_rich_text_content")
    public final String botSummary;

    @C09CT("chat_sug_key")
    public final String chatSugKey;

    @C09CT("tracker")
    public final TakoEventTracker eventTracker;

    @C09CT("is_intervene")
    public final Boolean isIntervene;

    @C09CT("is_use_rich_content")
    public final boolean isNewStyle;

    @C09CT("landing_page_hint")
    public final String landingPageHint;

    @C09CT("landing_page_schema")
    public final String landingPageSchema;

    @C09CT("loading")
    public final Boolean loading;

    @C09CT("long_sug_list")
    public List<String> longSugList;

    @C09CT("message")
    public final String message;

    @C09CT("message_key")
    public final String messageKey;

    @C09CT("message_type")
    public final Integer messageType;

    @C09CT("placeholder_sources")
    public final Map<String, String> placeholderSources;

    @C09CT("full_rich_text_content")
    public final String richMessage;

    @C09CT("sug_list")
    public List<String> sugList;

    @C09CT("sug_title")
    public final String sugTitle;

    @C09CT("web_doc_list")
    public List<SearchBingItem> webDocList;
    public static final C0Q7Q Companion = new Object() { // from class: X.0Q7Q
    };
    public static final int $stable = 8;

    public TakoInfo() {
        this(Boolean.TRUE, "", "", "", null, null, 0, null, null, null, "", Boolean.FALSE, false, "", "", "", "", "", new LinkedHashMap());
    }

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final String getBotIntroduction() {
        return this.botIntroduction;
    }

    public final String getBotSummary() {
        return this.botSummary;
    }

    public final String getChatSugKey() {
        return this.chatSugKey;
    }

    public final TakoEventTracker getEventTracker() {
        return this.eventTracker;
    }

    public final String getLandingPageHint() {
        return this.landingPageHint;
    }

    public final String getLandingPageSchema() {
        return this.landingPageSchema;
    }

    public final Boolean getLoading() {
        return this.loading;
    }

    public final List<String> getLongSugList() {
        return this.longSugList;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getMessageKey() {
        return this.messageKey;
    }

    public final Integer getMessageType() {
        return this.messageType;
    }

    public final Map<String, String> getPlaceholderSources() {
        return this.placeholderSources;
    }

    public final String getRichMessage() {
        return this.richMessage;
    }

    public final List<String> getSugList() {
        return this.sugList;
    }

    public final String getSugTitle() {
        return this.sugTitle;
    }

    public final List<SearchBingItem> getWebDocList() {
        return this.webDocList;
    }

    public final Boolean isIntervene() {
        return this.isIntervene;
    }

    public final boolean isNewStyle() {
        return this.isNewStyle;
    }

    public final void setAwemeList(List<? extends Aweme> list) {
        this.awemeList = list;
    }

    public final void setLongSugList(List<String> list) {
        this.longSugList = list;
    }

    public final void setSugList(List<String> list) {
        this.sugList = list;
    }

    public final void setWebDocList(List<SearchBingItem> list) {
        this.webDocList = list;
    }

    public TakoInfo(Boolean bool, String str, String str2, String str3, List<? extends Aweme> list, List<SearchBingItem> list2, Integer num, List<String> list3, List<String> list4, TakoEventTracker takoEventTracker, String str4, Boolean bool2, boolean z, String str5, String str6, String str7, String str8, String str9, Map<String, String> map) {
        this.loading = bool;
        this.messageKey = str;
        this.chatSugKey = str2;
        this.message = str3;
        this.awemeList = list;
        this.webDocList = list2;
        this.messageType = num;
        this.sugList = list3;
        this.longSugList = list4;
        this.eventTracker = takoEventTracker;
        this.sugTitle = str4;
        this.isIntervene = bool2;
        this.isNewStyle = z;
        this.richMessage = str5;
        this.botSummary = str6;
        this.botIntroduction = str7;
        this.landingPageHint = str8;
        this.landingPageSchema = str9;
        this.placeholderSources = map;
    }
}
