package com.ss.android.ugc.aweme.tako.model;

import X.C09CT;
import X.C123100dR;
import X.C13BV;
import X.C201993141v;
import X.C2097608Jq;
import X.C665120Q7a;
import X.EnumC1864410ycJ;
import X.EnumC219700t1;
import X.InterfaceC1294060jmO;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.model.ReferenceItemBridge;
import com.ss.android.ugc.aweme.tako.router.model.CsiBotData;
import com.ss.android.ugc.aweme.tako.router.model.EnterAwemeData;
import com.ss.android.ugc.aweme.tako.router.model.TakoAutoSendData;
import com.ss.android.ugc.aweme.tako.router.model.TakoBehaviorCollectData;
import com.ss.android.ugc.aweme.tako.router.model.TakoCarriedUpData;
import com.ss.android.ugc.aweme.tako.router.model.TakoCarriedUpRequestInfo;
import com.ss.android.ugc.aweme.tako.router.model.TakoChatContainerData;
import com.ss.android.ugc.aweme.tako.router.model.TakoDuplicateEnterData;
import com.ss.android.ugc.aweme.tako.router.model.TakoInteractGuideData;
import com.ss.android.ugc.aweme.tako.router.model.TakoStreamRequestExtParams;
import com.ss.android.ugc.aweme.tako.router.model.TakoSubBotData;
import com.ss.android.ugc.aweme.tako.router.model.TakoSubConversationData;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoEnterParams implements Serializable {

    @C09CT("auto_send_image_path_list")
    public List<String> _autoSendImagePathList;

    @C09CT("auto_send_msg_content")
    public String _autoSendMsgContent;

    @C09CT("auto_send_msg_key")
    public final String _autoSendMsgKey;

    @C09CT("carried_bing_list")
    public final List<SearchBingItem> _carriedBingList;

    @C09CT("carried_image_list")
    public final List<TakoImageItem> _carriedImageList;

    @C09CT("carried_placeholder_map")
    public Map<String, String> _carriedPlaceholders;

    @C09CT("carried_referene_list")
    public List<ReferenceItemBridge> _carriedReferenceList;

    @C09CT("carried_repeat_key")
    public String _carriedRepeatKey;

    @C09CT("carried_send_answer_content")
    public String _carriedSendAnswerContent;

    @C09CT("carried_send_anwser_video")
    public final List<SearchVideoItem> _carriedSendAnswerVideo;

    @C09CT("carried_sug_list")
    public List<String> _carriedSugList;

    @C09CT("carryup_scene")
    public Integer _carryUpScene;

    @C09CT("disclaimer_content_text")
    public final String _disclaimerContentText;

    @C09CT("entrance_request_info")
    public final TakoEntranceRequestInfo _entranceRequestInfo;

    @C09CT("expand_sheet_on_right_side")
    public final boolean _expandSheetOnRight;

    @C09CT("feed_bar")
    public final String _feedBar;

    @C09CT("gid")
    public final String _gid;

    @C09CT("icon_state")
    public final String _iconState;

    @C09CT("input_content")
    public final String _inputContent;

    @C09CT("interaction_type")
    public String _interactionType;

    @C09CT("nimble_params")
    public final NimbleParams _nimbleParams;

    @C09CT("sar_info")
    public String _sarInfo;

    @C09CT("screenType")
    public String _screenType;

    @C09CT("search_card_type")
    public Integer _searchCardType;

    @C09CT("search_keyword")
    public String _searchKeyword;

    @C09CT("search_landing_page_request")
    public final C665120Q7a _searchLandingPageRequest;

    @C09CT("search_message_id")
    public final String _searchMessageId;

    @C09CT("show_loading")
    public final boolean _showLoading;

    @C09CT("sub_enter_method")
    public final String _subEnterMethod;

    @C09CT("sub_process_id")
    public final String _subProcessId;

    @C09CT("sug_source")
    public String _sugSource;

    @C09CT("type")
    public String _type;

    @C09CT("video_total_consumption_duration")
    public final long _videoTotalConsumptionDuration;
    public TakoAutoSendData autoSendData;

    @C09CT("auto_send_msg_type")
    public Integer autoSendMsgType;
    public TakoBehaviorCollectData behaviorCollectData;

    @C09CT("bot_info")
    public final AIBotInfo botInfo;

    @C09CT("carried_action_item")
    public final TakoActionItem carriedActionItem;

    @C09CT("carried_feedbar_draw_create_info")
    public final FeedbarDrawCreateInfo carriedFeedbarDrawCreateInfo;
    public String carriedRepeatKey;
    public TakoCarriedUpData carriedUpData;
    public TakoChatContainerData chatContainerData;
    public CsiBotData csiBotData;

    @C09CT("keep_duplicate_enter_data")
    public TakoDuplicateEnterData duplicateEnterData;

    @C09CT("is_dynamic_icon")
    public boolean dynamicIcon;

    @C09CT("enter_from")
    public String enterFrom;

    @C09CT("enter_from_last_page")
    public final String enterFromLastPage;

    @C09CT("enter_method")
    public String enterMethod;

    @C09CT("enter_start_time")
    public Long enterStartTime;

    @C09CT("extra_flag")
    public final String extraFlag;

    @C09CT("feed_enter_aweme_info")
    public final FeedEnterAwemeInfo feedEnterAwemeInfo;

    @C09CT("feed_icon_bubble_info")
    public final FeedIconBubbleInfo feedIconBubbleInfo;
    public TakoInteractGuideData interactGuideData;
    public String interactionType;

    @C09CT("is_from_schema")
    public boolean isFromSchema;

    @C09CT("list_result_type")
    public final String listResultType;

    @C09CT("open_by_sheet")
    public final boolean openBySheet;

    @C09CT("process_id")
    public String processId;

    @C09CT("push_msg_channel")
    public int pushMsgChannel;

    @C09CT("push_msg_id")
    public String pushMsgId;

    @C09CT("search_general_card_type")
    public String searchGeneralCardType;

    @C09CT("search_id")
    public String searchId;

    @C09CT("search_id_list")
    public final String searchIdList;

    @C09CT("search_is_quote_video")
    public final Integer searchIsQuoteVideo;

    @C09CT("search_log_id")
    public final String searchLogId;

    @C09CT("search_message_type")
    public final String searchMessageType;

    @C09CT("search_type")
    public final String searchType;

    @C09CT("smart_search_info")
    public final SmartSearchItem smartSearchInfo;
    public TakoSubBotData subBotData;
    public TakoSubConversationData subConversationData;

    @C09CT("suggestion_word_info")
    public final SuggestionWordInfo suggestionWordInfo;

    @C09CT("tako_chat_id")
    public String takoChatId;

    @C09CT("token_type")
    public String tokenType;

    @C09CT("universal_rank")
    public final String universalRank;

    @C09CT("update_keyboard_on_sheet")
    public final boolean updateKeyboardOnSheet;

    @C09CT("video_longest_consumption_duration")
    public final long videoLongestConsumptionDuration;
    public static final C201993141v Companion = new Object() { // from class: X.141v
    };
    public static final int $stable = 8;

    public TakoEnterParams() {
        this(null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 1023, null);
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getAutoSendMsgType$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getDynamicIcon$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getEnterFromLastPage$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getExtraFlag$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getFeedEnterAwemeInfo$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getFeedIconBubbleInfo$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getListResultType$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getOpenBySheet$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getPushMsgChannel$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getSearchGeneralCardType$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getSearchIdList$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getSearchIsQuoteVideo$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getSearchLogId$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getSearchMessageType$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getSearchType$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getSmartSearchInfo$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getSuggestionWordInfo$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getTokenType$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getUniversalRank$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getUpdateKeyboardOnSheet$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getVideoLongestConsumptionDuration$annotations() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoEnterParams)) {
            return false;
        }
        TakoEnterParams takoEnterParams = (TakoEnterParams) obj;
        return Intrinsics.LJFF(this.enterFrom, takoEnterParams.enterFrom) && Intrinsics.LJFF(this.enterMethod, takoEnterParams.enterMethod) && this.dynamicIcon == takoEnterParams.dynamicIcon && Intrinsics.LJFF(this.searchId, takoEnterParams.searchId) && Intrinsics.LJFF(this._searchKeyword, takoEnterParams._searchKeyword) && Intrinsics.LJFF(this.searchLogId, takoEnterParams.searchLogId) && Intrinsics.LJFF(this.searchMessageType, takoEnterParams.searchMessageType) && Intrinsics.LJFF(this._searchCardType, takoEnterParams._searchCardType) && Intrinsics.LJFF(this.searchGeneralCardType, takoEnterParams.searchGeneralCardType) && Intrinsics.LJFF(this._searchMessageId, takoEnterParams._searchMessageId) && Intrinsics.LJFF(this.searchIdList, takoEnterParams.searchIdList) && Intrinsics.LJFF(this.searchIsQuoteVideo, takoEnterParams.searchIsQuoteVideo) && Intrinsics.LJFF(this.searchType, takoEnterParams.searchType) && Intrinsics.LJFF(this.tokenType, takoEnterParams.tokenType) && Intrinsics.LJFF(this._interactionType, takoEnterParams._interactionType) && Intrinsics.LJFF(this._type, takoEnterParams._type) && this.pushMsgChannel == takoEnterParams.pushMsgChannel && Intrinsics.LJFF(this.pushMsgId, takoEnterParams.pushMsgId) && Intrinsics.LJFF(this._autoSendMsgContent, takoEnterParams._autoSendMsgContent) && Intrinsics.LJFF(this.autoSendMsgType, takoEnterParams.autoSendMsgType) && Intrinsics.LJFF(this._autoSendMsgKey, takoEnterParams._autoSendMsgKey) && Intrinsics.LJFF(this._autoSendImagePathList, takoEnterParams._autoSendImagePathList) && Intrinsics.LJFF(this.carriedActionItem, takoEnterParams.carriedActionItem) && Intrinsics.LJFF(this._carriedRepeatKey, takoEnterParams._carriedRepeatKey) && Intrinsics.LJFF(this._carriedSendAnswerContent, takoEnterParams._carriedSendAnswerContent) && Intrinsics.LJFF(this._carriedSendAnswerVideo, takoEnterParams._carriedSendAnswerVideo) && Intrinsics.LJFF(this._carriedSugList, takoEnterParams._carriedSugList) && Intrinsics.LJFF(this.carriedFeedbarDrawCreateInfo, takoEnterParams.carriedFeedbarDrawCreateInfo) && Intrinsics.LJFF(this._carriedBingList, takoEnterParams._carriedBingList) && Intrinsics.LJFF(this._carriedImageList, takoEnterParams._carriedImageList) && Intrinsics.LJFF(this._carriedReferenceList, takoEnterParams._carriedReferenceList) && Intrinsics.LJFF(this._carriedPlaceholders, takoEnterParams._carriedPlaceholders) && Intrinsics.LJFF(this._carryUpScene, takoEnterParams._carryUpScene) && Intrinsics.LJFF(this.enterStartTime, takoEnterParams.enterStartTime) && this.isFromSchema == takoEnterParams.isFromSchema && Intrinsics.LJFF(this._gid, takoEnterParams._gid) && Intrinsics.LJFF(this._feedBar, takoEnterParams._feedBar) && this._videoTotalConsumptionDuration == takoEnterParams._videoTotalConsumptionDuration && this.videoLongestConsumptionDuration == takoEnterParams.videoLongestConsumptionDuration && Intrinsics.LJFF(this._sugSource, takoEnterParams._sugSource) && Intrinsics.LJFF(this.processId, takoEnterParams.processId) && Intrinsics.LJFF(this.takoChatId, takoEnterParams.takoChatId) && Intrinsics.LJFF(this._subProcessId, takoEnterParams._subProcessId) && Intrinsics.LJFF(this._subEnterMethod, takoEnterParams._subEnterMethod) && Intrinsics.LJFF(this.feedEnterAwemeInfo, takoEnterParams.feedEnterAwemeInfo) && Intrinsics.LJFF(this.suggestionWordInfo, takoEnterParams.suggestionWordInfo) && Intrinsics.LJFF(this.feedIconBubbleInfo, takoEnterParams.feedIconBubbleInfo) && Intrinsics.LJFF(this.extraFlag, takoEnterParams.extraFlag) && Intrinsics.LJFF(this.botInfo, takoEnterParams.botInfo) && this.openBySheet == takoEnterParams.openBySheet && this._expandSheetOnRight == takoEnterParams._expandSheetOnRight && this.updateKeyboardOnSheet == takoEnterParams.updateKeyboardOnSheet && Intrinsics.LJFF(this._sarInfo, takoEnterParams._sarInfo) && Intrinsics.LJFF(this._iconState, takoEnterParams._iconState) && Intrinsics.LJFF(this._inputContent, takoEnterParams._inputContent) && Intrinsics.LJFF(this.enterFromLastPage, takoEnterParams.enterFromLastPage) && Intrinsics.LJFF(this._screenType, takoEnterParams._screenType) && this._showLoading == takoEnterParams._showLoading && Intrinsics.LJFF(this._entranceRequestInfo, takoEnterParams._entranceRequestInfo) && Intrinsics.LJFF(this.smartSearchInfo, takoEnterParams.smartSearchInfo) && Intrinsics.LJFF(this.universalRank, takoEnterParams.universalRank) && Intrinsics.LJFF(this._disclaimerContentText, takoEnterParams._disclaimerContentText) && Intrinsics.LJFF(this._nimbleParams, takoEnterParams._nimbleParams) && Intrinsics.LJFF(this._searchLandingPageRequest, takoEnterParams._searchLandingPageRequest) && Intrinsics.LJFF(this.listResultType, takoEnterParams.listResultType) && Intrinsics.LJFF(this.csiBotData, takoEnterParams.csiBotData) && Intrinsics.LJFF(this.subBotData, takoEnterParams.subBotData) && Intrinsics.LJFF(this.chatContainerData, takoEnterParams.chatContainerData) && Intrinsics.LJFF(this.autoSendData, takoEnterParams.autoSendData) && Intrinsics.LJFF(this.carriedUpData, takoEnterParams.carriedUpData) && Intrinsics.LJFF(this.interactGuideData, takoEnterParams.interactGuideData) && Intrinsics.LJFF(this.behaviorCollectData, takoEnterParams.behaviorCollectData) && Intrinsics.LJFF(this.subConversationData, takoEnterParams.subConversationData) && Intrinsics.LJFF(this.duplicateEnterData, takoEnterParams.duplicateEnterData);
    }

    public final Map<String, String> getCommonParams() {
        String str;
        String str2;
        Map<String, String> map;
        Map<String, String> map2;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("enter_from", this.enterFrom);
        pairArr[1] = new Pair("enter_method", this.enterMethod);
        pairArr[2] = new Pair("process_id", this.processId);
        TakoSubConversationData takoSubConversationData = this.subConversationData;
        if (takoSubConversationData == null || (str = takoSubConversationData.subConversationId) == null) {
            str = "";
        }
        pairArr[3] = new Pair("tako_session_id", str);
        pairArr[4] = new Pair("tako_chat_id", this.takoChatId);
        pairArr[5] = new Pair("bot_id", String.valueOf(this.botInfo.botId));
        pairArr[6] = new Pair("search_id", getEnterSearchId());
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        String subEnterMethod = getSubEnterMethod();
        if (C123100dR.LIZ(subEnterMethod)) {
            mapLJIIJ.put("sub_process_id", getSubProcessId());
            mapLJIIJ.put("sub_enter_method", subEnterMethod);
        }
        String iconState = getIconState();
        if (C123100dR.LIZ(iconState) && iconState != null) {
            mapLJIIJ.put("icon_state", iconState);
        }
        TakoBehaviorCollectData takoBehaviorCollectData = this.behaviorCollectData;
        if (takoBehaviorCollectData == null || (map2 = takoBehaviorCollectData.sendMessageMobParams) == null || (str2 = map2.get("abase_id")) == null) {
            TakoBehaviorCollectData takoBehaviorCollectData2 = this.behaviorCollectData;
            str2 = (takoBehaviorCollectData2 == null || (map = takoBehaviorCollectData2.chatMobParams) == null) ? null : map.get("abase_id");
        }
        if (C123100dR.LIZ(str2)) {
            mapLJIIJ.put("abase_id", str2);
        }
        CsiBotData csiBotData = this.csiBotData;
        String str3 = csiBotData != null ? csiBotData.inspirationSessionId : null;
        if (C123100dR.LIZ(str3) && str3 != null) {
            mapLJIIJ.put("inspiration_session_id", str3);
            mapLJIIJ.put("bot_type", "csi");
        }
        return mapLJIIJ;
    }

    public String toString() {
        return "TakoEnterParams(enterFrom=" + this.enterFrom + ", enterMethod=" + this.enterMethod + ", dynamicIcon=" + this.dynamicIcon + ", searchId=" + this.searchId + ", _searchKeyword=" + this._searchKeyword + ", searchLogId=" + this.searchLogId + ", searchMessageType=" + this.searchMessageType + ", _searchCardType=" + this._searchCardType + ", searchGeneralCardType=" + this.searchGeneralCardType + ", _searchMessageId=" + this._searchMessageId + ", searchIdList=" + this.searchIdList + ", searchIsQuoteVideo=" + this.searchIsQuoteVideo + ", searchType=" + this.searchType + ", tokenType=" + this.tokenType + ", _interactionType=" + this._interactionType + ", _type=" + this._type + ", pushMsgChannel=" + this.pushMsgChannel + ", pushMsgId=" + this.pushMsgId + ", _autoSendMsgContent=" + this._autoSendMsgContent + ", autoSendMsgType=" + this.autoSendMsgType + ", _autoSendMsgKey=" + this._autoSendMsgKey + ", _autoSendImagePathList=" + this._autoSendImagePathList + ", carriedActionItem=" + this.carriedActionItem + ", _carriedRepeatKey=" + this._carriedRepeatKey + ", _carriedSendAnswerContent=" + this._carriedSendAnswerContent + ", _carriedSendAnswerVideo=" + this._carriedSendAnswerVideo + ", _carriedSugList=" + this._carriedSugList + ", carriedFeedbarDrawCreateInfo=" + this.carriedFeedbarDrawCreateInfo + ", _carriedBingList=" + this._carriedBingList + ", _carriedImageList=" + this._carriedImageList + ", _carriedReferenceList=" + this._carriedReferenceList + ", _carriedPlaceholders=" + this._carriedPlaceholders + ", _carryUpScene=" + this._carryUpScene + ", enterStartTime=" + this.enterStartTime + ", isFromSchema=" + this.isFromSchema + ", _gid=" + this._gid + ", _feedBar=" + this._feedBar + ", _videoTotalConsumptionDuration=" + this._videoTotalConsumptionDuration + ", videoLongestConsumptionDuration=" + this.videoLongestConsumptionDuration + ", _sugSource=" + this._sugSource + ", processId=" + this.processId + ", takoChatId=" + this.takoChatId + ", _subProcessId=" + this._subProcessId + ", _subEnterMethod=" + this._subEnterMethod + ", feedEnterAwemeInfo=" + this.feedEnterAwemeInfo + ", suggestionWordInfo=" + this.suggestionWordInfo + ", feedIconBubbleInfo=" + this.feedIconBubbleInfo + ", extraFlag=" + this.extraFlag + ", botInfo=" + this.botInfo + ", openBySheet=" + this.openBySheet + ", _expandSheetOnRight=" + this._expandSheetOnRight + ", updateKeyboardOnSheet=" + this.updateKeyboardOnSheet + ", _sarInfo=" + this._sarInfo + ", _iconState=" + this._iconState + ", _inputContent=" + this._inputContent + ", enterFromLastPage=" + this.enterFromLastPage + ", _screenType=" + this._screenType + ", _showLoading=" + this._showLoading + ", _entranceRequestInfo=" + this._entranceRequestInfo + ", smartSearchInfo=" + this.smartSearchInfo + ", universalRank=" + this.universalRank + ", _disclaimerContentText=" + this._disclaimerContentText + ", _nimbleParams=" + this._nimbleParams + ", _searchLandingPageRequest=" + this._searchLandingPageRequest + ", listResultType=" + this.listResultType + ", csiBotData=" + this.csiBotData + ", subBotData=" + this.subBotData + ", chatContainerData=" + this.chatContainerData + ", autoSendData=" + this.autoSendData + ", carriedUpData=" + this.carriedUpData + ", interactGuideData=" + this.interactGuideData + ", behaviorCollectData=" + this.behaviorCollectData + ", subConversationData=" + this.subConversationData + ", duplicateEnterData=" + this.duplicateEnterData + ')';
    }

    public final List<String> getAutoSendImagePathList() {
        List<String> list;
        TakoAutoSendData takoAutoSendData = this.autoSendData;
        return (takoAutoSendData == null || (list = takoAutoSendData.imagePathList) == null) ? this._autoSendImagePathList : list;
    }

    public final String getAutoSendInteractionType() {
        String str;
        TakoAutoSendData takoAutoSendData = this.autoSendData;
        return (takoAutoSendData == null || (str = takoAutoSendData.interactionType) == null) ? this._interactionType : str;
    }

    public final String getAutoSendMsgContent() {
        String str;
        TakoAutoSendData takoAutoSendData = this.autoSendData;
        return (takoAutoSendData == null || (str = takoAutoSendData.messageText) == null) ? this._autoSendMsgContent : str;
    }

    public final String getAutoSendMsgKey() {
        TakoCarriedUpRequestInfo takoCarriedUpRequestInfo;
        String str;
        TakoCarriedUpData takoCarriedUpData = this.carriedUpData;
        return (takoCarriedUpData == null || (takoCarriedUpRequestInfo = takoCarriedUpData.requestInfo) == null || (str = takoCarriedUpRequestInfo.answerMessageKey) == null) ? this._autoSendMsgKey : str;
    }

    public final TakoBehaviorCollectData getBehaviorCollectDataAndInit() {
        TakoBehaviorCollectData takoBehaviorCollectData = this.behaviorCollectData;
        if (takoBehaviorCollectData != null) {
            return takoBehaviorCollectData;
        }
        TakoBehaviorCollectData takoBehaviorCollectData2 = new TakoBehaviorCollectData(null, null, null, null, null);
        this.behaviorCollectData = takoBehaviorCollectData2;
        return takoBehaviorCollectData2;
    }

    public final List<SearchBingItem> getCarriedBingList() {
        List<SearchBingItem> list;
        TakoCarriedUpData takoCarriedUpData = this.carriedUpData;
        return (takoCarriedUpData == null || (list = takoCarriedUpData.answerBingList) == null) ? this._carriedBingList : list;
    }

    public final List<TakoImageItem> getCarriedImageList() {
        List<TakoImageItem> list;
        TakoCarriedUpData takoCarriedUpData = this.carriedUpData;
        return (takoCarriedUpData == null || (list = takoCarriedUpData.answerImageList) == null) ? this._carriedImageList : list;
    }

    public final Map<String, String> getCarriedPlaceholders() {
        Map<String, String> map;
        TakoCarriedUpData takoCarriedUpData = this.carriedUpData;
        return (takoCarriedUpData == null || (map = takoCarriedUpData.answerPlaceHolders) == null) ? this._carriedPlaceholders : map;
    }

    public final List<ReferenceItemBridge> getCarriedReferenceList() {
        List<ReferenceItemBridge> list;
        TakoCarriedUpData takoCarriedUpData = this.carriedUpData;
        return (takoCarriedUpData == null || (list = takoCarriedUpData.answerReferenceList) == null) ? this._carriedReferenceList : list;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getCarriedRepeatKey() {
        /*
            r3 = this;
            java.lang.String r0 = r3.carriedRepeatKey
            if (r0 != 0) goto L2f
            com.ss.android.ugc.aweme.tako.router.model.TakoCarriedUpData r0 = r3.carriedUpData
            if (r0 == 0) goto L2b
            java.lang.String r1 = r0.repeatKey
            if (r1 == 0) goto L2b
            int r0 = r1.length()
            if (r0 <= 0) goto L2b
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            r2.append(r1)
            r0 = 45
            r2.append(r0)
            com.ss.android.ugc.aweme.tako.model.AIBotInfo r0 = r3.botInfo
            long r0 = r0.botId
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            if (r0 != 0) goto L2d
        L2b:
            java.lang.String r0 = r3._carriedRepeatKey
        L2d:
            r3.carriedRepeatKey = r0
        L2f:
            java.lang.String r0 = r3.carriedRepeatKey
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.model.TakoEnterParams.getCarriedRepeatKey():java.lang.String");
    }

    public final String getCarriedSendAnswerContent() {
        String str;
        TakoCarriedUpData takoCarriedUpData = this.carriedUpData;
        return (takoCarriedUpData == null || (str = takoCarriedUpData.answerMsgContent) == null) ? this._carriedSendAnswerContent : str;
    }

    public final List<SearchVideoItem> getCarriedSendAnswerVideo() {
        List<SearchVideoItem> list;
        TakoCarriedUpData takoCarriedUpData = this.carriedUpData;
        return (takoCarriedUpData == null || (list = takoCarriedUpData.answerVideoList) == null) ? this._carriedSendAnswerVideo : list;
    }

    public final List<TakoImageItem> getCarriedSendImageList() {
        TakoCarriedUpData takoCarriedUpData = this.carriedUpData;
        if (takoCarriedUpData != null) {
            return takoCarriedUpData.sendImageList;
        }
        return null;
    }

    public final List<String> getCarriedSugList() {
        List<String> list;
        TakoCarriedUpData takoCarriedUpData = this.carriedUpData;
        return (takoCarriedUpData == null || (list = takoCarriedUpData.sugList) == null) ? this._carriedSugList : list;
    }

    public final TakoCarriedUpData getCarriedUpDataAndInit() {
        TakoCarriedUpData takoCarriedUpData = this.carriedUpData;
        if (takoCarriedUpData != null) {
            return takoCarriedUpData;
        }
        TakoCarriedUpData takoCarriedUpData2 = new TakoCarriedUpData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        takoCarriedUpData2.setLocateConfigType(EnumC219700t1.SEND_MSG_TOP);
        this.carriedUpData = takoCarriedUpData2;
        return takoCarriedUpData2;
    }

    public final String getCarryUpInteractionType() {
        String str;
        TakoCarriedUpData takoCarriedUpData = this.carriedUpData;
        return (takoCarriedUpData == null || (str = takoCarriedUpData.sendInteractionType) == null) ? this._interactionType : str;
    }

    public final Integer getCarryUpScene() {
        TakoCarriedUpRequestInfo takoCarriedUpRequestInfo;
        Integer num;
        TakoCarriedUpData takoCarriedUpData = this.carriedUpData;
        return (takoCarriedUpData == null || (takoCarriedUpRequestInfo = takoCarriedUpData.requestInfo) == null || (num = takoCarriedUpRequestInfo.upSyncScene) == null) ? this._carryUpScene : num;
    }

    public final String getDataRepeatKey() {
        NimbleParams nimbleParams;
        String str;
        TakoCarriedUpData takoCarriedUpData = this.carriedUpData;
        return (takoCarriedUpData == null || (nimbleParams = takoCarriedUpData.nimbleParams) == null || (str = nimbleParams.dateRepeatKey) == null) ? this.searchId : str;
    }

    public final String getDisclaimerContentText() {
        String str;
        TakoCarriedUpData takoCarriedUpData = this.carriedUpData;
        return (takoCarriedUpData == null || (str = takoCarriedUpData.answerDisclaimerContent) == null) ? this._disclaimerContentText : str;
    }

    public final EnterAwemeData getEnterAwemeData() {
        EnterAwemeData enterAwemeData;
        TakoInteractGuideData takoInteractGuideData = this.interactGuideData;
        if (takoInteractGuideData != null && (enterAwemeData = takoInteractGuideData.enterAwemeData) != null) {
            return enterAwemeData;
        }
        FeedEnterAwemeInfo feedEnterAwemeInfo = this.feedEnterAwemeInfo;
        if (feedEnterAwemeInfo == null) {
            return null;
        }
        return new EnterAwemeData(feedEnterAwemeInfo.videoCoverUri, feedEnterAwemeInfo.videoCoverUrlList);
    }

    public final String getEnterAwemeId() {
        String str;
        TakoBehaviorCollectData takoBehaviorCollectData = this.behaviorCollectData;
        return (takoBehaviorCollectData == null || (str = takoBehaviorCollectData.enterAwemeId) == null) ? this._gid : str;
    }

    public final String getEnterSearchId() {
        String str;
        TakoBehaviorCollectData takoBehaviorCollectData = this.behaviorCollectData;
        return (takoBehaviorCollectData == null || (str = takoBehaviorCollectData.enterSearchId) == null) ? this.searchId : str;
    }

    public final TakoEntranceRequestInfo getEntranceRequestInfo() {
        TakoEntranceRequestInfo takoEntranceRequestInfo;
        TakoAutoSendData takoAutoSendData = this.autoSendData;
        return (takoAutoSendData == null || (takoEntranceRequestInfo = takoAutoSendData.requestInfo) == null) ? this._entranceRequestInfo : takoEntranceRequestInfo;
    }

    public final boolean getExpandSheetOnRight() {
        Boolean bool;
        TakoChatContainerData takoChatContainerData = this.chatContainerData;
        return (takoChatContainerData == null || (bool = takoChatContainerData.expandSheetOnRight) == null) ? this._expandSheetOnRight : bool.booleanValue();
    }

    public final String getFeedBar() {
        TakoStreamRequestExtParams takoStreamRequestExtParams;
        String str;
        TakoBehaviorCollectData takoBehaviorCollectData = this.behaviorCollectData;
        return (takoBehaviorCollectData == null || (takoStreamRequestExtParams = takoBehaviorCollectData.streamRequestExtParams) == null || (str = takoStreamRequestExtParams.feedBar) == null) ? this._feedBar : str;
    }

    public final String getIconState() {
        Map<String, String> map;
        String str;
        TakoBehaviorCollectData takoBehaviorCollectData = this.behaviorCollectData;
        return (takoBehaviorCollectData == null || (map = takoBehaviorCollectData.chatMobParams) == null || (str = map.get("icon_state")) == null) ? this._iconState : str;
    }

    public final String getInputContent() {
        String str;
        TakoInteractGuideData takoInteractGuideData = this.interactGuideData;
        return (takoInteractGuideData == null || (str = takoInteractGuideData.inputTextContent) == null) ? this._inputContent : str;
    }

    public final NimbleParams getNimbleParams() {
        NimbleParams nimbleParams;
        TakoCarriedUpData takoCarriedUpData = this.carriedUpData;
        return (takoCarriedUpData == null || (nimbleParams = takoCarriedUpData.nimbleParams) == null) ? this._nimbleParams : nimbleParams;
    }

    public final String getSarInfo() {
        TakoStreamRequestExtParams takoStreamRequestExtParams;
        String str;
        TakoBehaviorCollectData takoBehaviorCollectData = this.behaviorCollectData;
        return (takoBehaviorCollectData == null || (takoStreamRequestExtParams = takoBehaviorCollectData.streamRequestExtParams) == null || (str = takoStreamRequestExtParams.sarInfo) == null) ? this._sarInfo : str;
    }

    public final String getScreenType() {
        EnumC1864410ycJ enumC1864410ycJ;
        String value;
        TakoChatContainerData takoChatContainerData = this.chatContainerData;
        return (takoChatContainerData == null || (enumC1864410ycJ = takoChatContainerData.screenType) == null || (value = enumC1864410ycJ.getValue()) == null) ? this._screenType : value;
    }

    public final Integer getSearchCardType() {
        Integer num;
        TakoCarriedUpData takoCarriedUpData = this.carriedUpData;
        return (takoCarriedUpData == null || (num = takoCarriedUpData.answerCardType) == null) ? this._searchCardType : num;
    }

    public final String getSearchKeyword() {
        String str;
        TakoCarriedUpData takoCarriedUpData = this.carriedUpData;
        return (takoCarriedUpData == null || (str = takoCarriedUpData.sendMsgContent) == null) ? this._searchKeyword : str;
    }

    public final C665120Q7a getSearchLandingPageRequest() {
        C665120Q7a c665120Q7a;
        TakoCarriedUpData takoCarriedUpData = this.carriedUpData;
        return (takoCarriedUpData == null || (c665120Q7a = takoCarriedUpData.searchLandingPageRequest) == null) ? this._searchLandingPageRequest : c665120Q7a;
    }

    public final String getSearchMessageId() {
        String str;
        TakoCarriedUpData takoCarriedUpData = this.carriedUpData;
        return (takoCarriedUpData == null || (str = takoCarriedUpData.answerMsgId) == null) ? this._searchMessageId : str;
    }

    public final boolean getShowLoading() {
        Boolean bool;
        TakoSubBotData takoSubBotData = this.subBotData;
        return (takoSubBotData == null || (bool = takoSubBotData.showLoading) == null) ? this._showLoading : bool.booleanValue();
    }

    public final String getSubEnterMethod() {
        String str;
        TakoSubBotData takoSubBotData = this.subBotData;
        return (takoSubBotData == null || (str = takoSubBotData.subEnterMethod) == null) ? this._subEnterMethod : str;
    }

    public final String getSubProcessId() {
        String str;
        TakoSubBotData takoSubBotData = this.subBotData;
        return (takoSubBotData == null || (str = takoSubBotData.subProcessId) == null) ? this._subProcessId : str;
    }

    public final String getSugSource() {
        String str;
        TakoInteractGuideData takoInteractGuideData = this.interactGuideData;
        return (takoInteractGuideData == null || (str = takoInteractGuideData.firstRoundSugSource) == null) ? this._sugSource : str;
    }

    public final String getType() {
        String str;
        TakoCarriedUpData takoCarriedUpData = this.carriedUpData;
        return (takoCarriedUpData == null || (str = takoCarriedUpData.enterActionType) == null) ? this._type : str;
    }

    public final long getVideoTotalConsumptionDuration() {
        TakoStreamRequestExtParams takoStreamRequestExtParams;
        Long l;
        TakoBehaviorCollectData takoBehaviorCollectData = this.behaviorCollectData;
        return (takoBehaviorCollectData == null || (takoStreamRequestExtParams = takoBehaviorCollectData.streamRequestExtParams) == null || (l = takoStreamRequestExtParams.viewDuration) == null) ? this._videoTotalConsumptionDuration : l.longValue();
    }

    public final boolean getVoiceTalkDirectly() {
        TakoInteractGuideData takoInteractGuideData = this.interactGuideData;
        if (takoInteractGuideData != null) {
            return takoInteractGuideData.voiceTalkDirectly;
        }
        return false;
    }

    public final boolean isFromSchema() {
        return this.isFromSchema;
    }

    public final void addAutoSendMessageMobParams(Map<String, String> map) {
        Map<String, String> mapLJIIL;
        TakoAutoSendData takoAutoSendData = this.autoSendData;
        if (takoAutoSendData == null) {
            takoAutoSendData = new TakoAutoSendData(null, null, null, null, null, null);
            this.autoSendData = takoAutoSendData;
        }
        Map<String, String> map2 = takoAutoSendData.mobParams;
        if (map2 != null && !map2.isEmpty()) {
            Map<String, String> map3 = takoAutoSendData.mobParams;
            if (map3 != null) {
                mapLJIIL = C2097608Jq.LJIIL(map3, map);
            } else {
                mapLJIIL = null;
            }
            takoAutoSendData.setMobParams(mapLJIIL);
            return;
        }
        takoAutoSendData.setMobParams(map);
    }

    public final void addCarriedUpMessageMobParams(Map<String, String> map) {
        Map<String, String> mapLJIIL;
        TakoCarriedUpData carriedUpDataAndInit = getCarriedUpDataAndInit();
        Map<String, String> map2 = carriedUpDataAndInit.messageMobParams;
        if (map2 != null && !map2.isEmpty()) {
            Map<String, String> map3 = carriedUpDataAndInit.messageMobParams;
            if (map3 != null) {
                mapLJIIL = C2097608Jq.LJIIL(map3, map);
            } else {
                mapLJIIL = null;
            }
            carriedUpDataAndInit.setMessageMobParams(mapLJIIL);
            return;
        }
        carriedUpDataAndInit.setMessageMobParams(map);
    }

    public final void addChatMobParams(Map<String, String> map) {
        Map<String, String> mapLJIIL;
        TakoBehaviorCollectData behaviorCollectDataAndInit = getBehaviorCollectDataAndInit();
        Map<String, String> map2 = behaviorCollectDataAndInit.chatMobParams;
        if (map2 != null && !map2.isEmpty()) {
            Map<String, String> map3 = behaviorCollectDataAndInit.chatMobParams;
            if (map3 != null) {
                mapLJIIL = C2097608Jq.LJIIL(map3, map);
            } else {
                mapLJIIL = null;
            }
            behaviorCollectDataAndInit.setChatMobParams(mapLJIIL);
            return;
        }
        behaviorCollectDataAndInit.setChatMobParams(map);
    }

    public final void addInteractGuideData(TakoInteractGuideData takoInteractGuideData) {
        this.interactGuideData = takoInteractGuideData;
    }

    public final void addSendMessageMobParams(Map<String, String> map) {
        Map<String, String> mapLJIIL;
        TakoBehaviorCollectData behaviorCollectDataAndInit = getBehaviorCollectDataAndInit();
        Map<String, String> map2 = behaviorCollectDataAndInit.sendMessageMobParams;
        if (map2 != null && !map2.isEmpty()) {
            Map<String, String> map3 = behaviorCollectDataAndInit.sendMessageMobParams;
            if (map3 != null) {
                mapLJIIL = C2097608Jq.LJIIL(map3, map);
            } else {
                mapLJIIL = null;
            }
            behaviorCollectDataAndInit.setSendMessageMobParams(mapLJIIL);
            return;
        }
        behaviorCollectDataAndInit.setSendMessageMobParams(map);
    }

    public final void setAutoSendData(TakoAutoSendData takoAutoSendData) {
        this.autoSendData = takoAutoSendData;
    }

    public final void setAutoSendImagePathList(List<String> list) {
        this._autoSendImagePathList = list;
    }

    public final void setAutoSendMsgContent(String str) {
        this._autoSendMsgContent = str;
    }

    public final void setAutoSendMsgType(Integer num) {
        this.autoSendMsgType = num;
    }

    public final void setBehaviorCollectData(TakoBehaviorCollectData takoBehaviorCollectData) {
        this.behaviorCollectData = takoBehaviorCollectData;
    }

    public final void setCarriedReferenceList(List<ReferenceItemBridge> list) {
        this._carriedReferenceList = list;
    }

    public final void setCarriedRepeatKey(String str) {
        this._carriedRepeatKey = str;
    }

    public final void setCarriedSendAnswerContent(String str) {
        this._carriedSendAnswerContent = str;
    }

    public final void setCarriedSugList(List<String> list) {
        this._carriedSugList = list;
    }

    public final void setCarriedUpData(TakoCarriedUpData takoCarriedUpData) {
        this.carriedUpData = takoCarriedUpData;
    }

    public final void setChatContainerData(TakoChatContainerData takoChatContainerData) {
        this.chatContainerData = takoChatContainerData;
    }

    public final void setCsiBotData(CsiBotData csiBotData) {
        this.csiBotData = csiBotData;
    }

    public final void setDuplicateEnterData(TakoDuplicateEnterData takoDuplicateEnterData) {
        this.duplicateEnterData = takoDuplicateEnterData;
    }

    public final void setDynamicIcon(boolean z) {
        this.dynamicIcon = z;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setEnterSearchId(String str) {
        this.searchId = str;
    }

    public final void setEnterStartTime(Long l) {
        this.enterStartTime = l;
    }

    public final void setFromSchema(boolean z) {
        this.isFromSchema = z;
    }

    public final void setInteractGuideData(TakoInteractGuideData takoInteractGuideData) {
        this.interactGuideData = takoInteractGuideData;
    }

    public final void setInteractionType(String str) {
        this._interactionType = str;
    }

    public final void setProcessId(String str) {
        this.processId = str;
    }

    public final void setPushMsgChannel(int i) {
        this.pushMsgChannel = i;
    }

    public final void setPushMsgId(String str) {
        this.pushMsgId = str;
    }

    public final void setSarInfo(String str) {
        this._sarInfo = str;
    }

    public final void setScreenType(String str) {
        this._screenType = str;
    }

    public final void setSearchCardType(Integer num) {
        this._searchCardType = num;
    }

    public final void setSearchGeneralCardType(String str) {
        this.searchGeneralCardType = str;
    }

    public final void setSearchKeyword(String str) {
        this._searchKeyword = str;
    }

    public final void setSubBotData(TakoSubBotData takoSubBotData) {
        this.subBotData = takoSubBotData;
    }

    public final void setSubConversationData(TakoSubConversationData takoSubConversationData) {
        this.subConversationData = takoSubConversationData;
    }

    public final void setSugSource(String str) {
        this._sugSource = str;
    }

    public final void setTakoChatId(String str) {
        this.takoChatId = str;
    }

    public final void setTokenType(String str) {
        this.tokenType = str;
    }

    public final void setType(String str) {
        this._type = str;
    }

    public TakoEnterParams(String str, String str2, boolean z, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, Integer num2, String str10, String str11, String str12, String str13, int i, String str14, String str15, Integer num3, String str16, List<String> list, TakoActionItem takoActionItem, String str17, String str18, List<SearchVideoItem> list2, List<String> list3, FeedbarDrawCreateInfo feedbarDrawCreateInfo, List<SearchBingItem> list4, List<TakoImageItem> list5, List<ReferenceItemBridge> list6, Map<String, String> map, Integer num4, Long l, boolean z2, String str19, String str20, long j, long j2, String str21, String str22, String str23, String str24, String str25, FeedEnterAwemeInfo feedEnterAwemeInfo, SuggestionWordInfo suggestionWordInfo, FeedIconBubbleInfo feedIconBubbleInfo, String str26, AIBotInfo aIBotInfo, boolean z3, boolean z4, boolean z5, String str27, String str28, String str29, String str30, String str31, boolean z6, TakoEntranceRequestInfo takoEntranceRequestInfo, SmartSearchItem smartSearchItem, String str32, String str33, NimbleParams nimbleParams, C665120Q7a c665120Q7a, String str34, CsiBotData csiBotData, TakoSubBotData takoSubBotData, TakoChatContainerData takoChatContainerData, TakoAutoSendData takoAutoSendData, TakoCarriedUpData takoCarriedUpData, TakoInteractGuideData takoInteractGuideData, TakoBehaviorCollectData takoBehaviorCollectData, TakoSubConversationData takoSubConversationData, TakoDuplicateEnterData takoDuplicateEnterData) {
        this.enterFrom = str;
        this.enterMethod = str2;
        this.dynamicIcon = z;
        this.searchId = str3;
        this._searchKeyword = str4;
        this.searchLogId = str5;
        this.searchMessageType = str6;
        this._searchCardType = num;
        this.searchGeneralCardType = str7;
        this._searchMessageId = str8;
        this.searchIdList = str9;
        this.searchIsQuoteVideo = num2;
        this.searchType = str10;
        this.tokenType = str11;
        this._interactionType = str12;
        this._type = str13;
        this.pushMsgChannel = i;
        this.pushMsgId = str14;
        this._autoSendMsgContent = str15;
        this.autoSendMsgType = num3;
        this._autoSendMsgKey = str16;
        this._autoSendImagePathList = list;
        this.carriedActionItem = takoActionItem;
        this._carriedRepeatKey = str17;
        this._carriedSendAnswerContent = str18;
        this._carriedSendAnswerVideo = list2;
        this._carriedSugList = list3;
        this.carriedFeedbarDrawCreateInfo = feedbarDrawCreateInfo;
        this._carriedBingList = list4;
        this._carriedImageList = list5;
        this._carriedReferenceList = list6;
        this._carriedPlaceholders = map;
        this._carryUpScene = num4;
        this.enterStartTime = l;
        this.isFromSchema = z2;
        this._gid = str19;
        this._feedBar = str20;
        this._videoTotalConsumptionDuration = j;
        this.videoLongestConsumptionDuration = j2;
        this._sugSource = str21;
        this.processId = str22;
        this.takoChatId = str23;
        this._subProcessId = str24;
        this._subEnterMethod = str25;
        this.feedEnterAwemeInfo = feedEnterAwemeInfo;
        this.suggestionWordInfo = suggestionWordInfo;
        this.feedIconBubbleInfo = feedIconBubbleInfo;
        this.extraFlag = str26;
        this.botInfo = aIBotInfo;
        this.openBySheet = z3;
        this._expandSheetOnRight = z4;
        this.updateKeyboardOnSheet = z5;
        this._sarInfo = str27;
        this._iconState = str28;
        this._inputContent = str29;
        this.enterFromLastPage = str30;
        this._screenType = str31;
        this._showLoading = z6;
        this._entranceRequestInfo = takoEntranceRequestInfo;
        this.smartSearchInfo = smartSearchItem;
        this.universalRank = str32;
        this._disclaimerContentText = str33;
        this._nimbleParams = nimbleParams;
        this._searchLandingPageRequest = c665120Q7a;
        this.listResultType = str34;
        this.csiBotData = csiBotData;
        this.subBotData = takoSubBotData;
        this.chatContainerData = takoChatContainerData;
        this.autoSendData = takoAutoSendData;
        this.carriedUpData = takoCarriedUpData;
        this.interactGuideData = takoInteractGuideData;
        this.behaviorCollectData = takoBehaviorCollectData;
        this.subConversationData = takoSubConversationData;
        this.duplicateEnterData = takoDuplicateEnterData;
    }

    public TakoEnterParams(String str, String str2, boolean z, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, Integer num2, String str10, String str11, String str12, String str13, int i, String str14, String str15, Integer num3, String str16, List list, TakoActionItem takoActionItem, String str17, String str18, List list2, List list3, FeedbarDrawCreateInfo feedbarDrawCreateInfo, List list4, List list5, List list6, Map map, Integer num4, Long l, boolean z2, String str19, String str20, long j, long j2, String str21, String str22, String str23, String str24, String str25, FeedEnterAwemeInfo feedEnterAwemeInfo, SuggestionWordInfo suggestionWordInfo, FeedIconBubbleInfo feedIconBubbleInfo, String str26, AIBotInfo aIBotInfo, boolean z3, boolean z4, boolean z5, String str27, String str28, String str29, String str30, String str31, boolean z6, TakoEntranceRequestInfo takoEntranceRequestInfo, SmartSearchItem smartSearchItem, String str32, String str33, NimbleParams nimbleParams, C665120Q7a c665120Q7a, String str34, CsiBotData csiBotData, TakoSubBotData takoSubBotData, TakoChatContainerData takoChatContainerData, TakoAutoSendData takoAutoSendData, TakoCarriedUpData takoCarriedUpData, TakoInteractGuideData takoInteractGuideData, TakoBehaviorCollectData takoBehaviorCollectData, TakoSubConversationData takoSubConversationData, TakoDuplicateEnterData takoDuplicateEnterData, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? null : num, (i2 & 256) != 0 ? null : str7, (i2 & 512) != 0 ? "" : str8, (i2 & 1024) != 0 ? null : str9, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : num2, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str10, (i2 & 8192) != 0 ? null : str11, (i2 & 16384) != 0 ? null : str12, (i2 & 32768) != 0 ? "fetch_sug" : str13, (i2 & 65536) != 0 ? 0 : i, (i2 & 131072) != 0 ? "" : str14, (i2 & 262144) != 0 ? null : str15, (524288 & i2) != 0 ? null : num3, (1048576 & i2) != 0 ? null : str16, (2097152 & i2) != 0 ? null : list, (4194304 & i2) != 0 ? null : takoActionItem, (8388608 & i2) != 0 ? null : str17, (16777216 & i2) != 0 ? "" : str18, (33554432 & i2) != 0 ? null : list2, (67108864 & i2) != 0 ? null : list3, (134217728 & i2) != 0 ? null : feedbarDrawCreateInfo, (268435456 & i2) != 0 ? C13BV.INSTANCE : list4, (536870912 & i2) != 0 ? C13BV.INSTANCE : list5, (1073741824 & i2) != 0 ? C13BV.INSTANCE : list6, (i2 & Integer.MIN_VALUE) != 0 ? new LinkedHashMap() : map, (i3 & 1) != 0 ? null : num4, (i3 & 2) != 0 ? null : l, (i3 & 4) != 0 ? false : z2, (i3 & 8) != 0 ? "" : str19, (i3 & 16) != 0 ? "" : str20, (i3 & 32) != 0 ? 0L : j, (i3 & 64) != 0 ? 0L : j2, (i3 & 128) != 0 ? "" : str21, (i3 & 256) != 0 ? UUID.randomUUID().toString() : str22, (i3 & 512) == 0 ? str23 : "", (i3 & 1024) != 0 ? UUID.randomUUID().toString() : str24, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str25, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : feedEnterAwemeInfo, (i3 & 8192) != 0 ? null : suggestionWordInfo, (i3 & 16384) != 0 ? null : feedIconBubbleInfo, (i3 & 32768) != 0 ? null : str26, (i3 & 65536) != 0 ? new AIBotInfo(0L, null, null, 0, 0, 0, null, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, null, 8388607, null) : aIBotInfo, (i3 & 131072) != 0 ? false : z3, (i3 & 262144) != 0 ? false : z4, (524288 & i3) != 0 ? false : z5, (1048576 & i3) != 0 ? null : str27, (2097152 & i3) != 0 ? null : str28, (4194304 & i3) != 0 ? null : str29, (8388608 & i3) != 0 ? null : str30, (16777216 & i3) != 0 ? null : str31, (33554432 & i3) != 0 ? false : z6, (67108864 & i3) != 0 ? null : takoEntranceRequestInfo, (134217728 & i3) != 0 ? null : smartSearchItem, (268435456 & i3) != 0 ? null : str32, (536870912 & i3) != 0 ? null : str33, (1073741824 & i3) != 0 ? null : nimbleParams, (i3 & Integer.MIN_VALUE) != 0 ? null : c665120Q7a, (i4 & 1) != 0 ? null : str34, (i4 & 2) != 0 ? null : csiBotData, (i4 & 4) != 0 ? null : takoSubBotData, (i4 & 8) != 0 ? null : takoChatContainerData, (i4 & 16) != 0 ? null : takoAutoSendData, (i4 & 32) != 0 ? null : takoCarriedUpData, (i4 & 64) != 0 ? null : takoInteractGuideData, (i4 & 128) != 0 ? null : takoBehaviorCollectData, (i4 & 256) != 0 ? null : takoSubConversationData, (i4 & 512) != 0 ? null : takoDuplicateEnterData);
    }
}
