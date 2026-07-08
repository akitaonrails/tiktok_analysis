package com.ss.android.ugc.aweme.tako.router.model;

import X.C09CT;
import X.C665120Q7a;
import X.EnumC219700t1;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.model.ReferenceItemBridge;
import com.ss.android.ugc.aweme.tako.model.NimbleParams;
import com.ss.android.ugc.aweme.tako.model.SearchBingItem;
import com.ss.android.ugc.aweme.tako.model.SearchVideoItem;
import com.ss.android.ugc.aweme.tako.model.TakoImageItem;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoCarriedUpData implements Serializable {
    public static final int $stable = 8;
    public transient List<? extends Aweme> answerAwemeListCache;

    @C09CT("answer_bing_list")
    public List<SearchBingItem> answerBingList;

    @C09CT("answer_card_type")
    public Integer answerCardType;

    @C09CT("answer_disclaimer_content")
    public String answerDisclaimerContent;

    @C09CT("answer_image_list")
    public List<TakoImageItem> answerImageList;

    @C09CT("answer_msg_content")
    public String answerMsgContent;

    @C09CT("answer_msg_id")
    public String answerMsgId;

    @C09CT("answer_placeholders")
    public Map<String, String> answerPlaceHolders;

    @C09CT("answer_reference_list")
    public List<ReferenceItemBridge> answerReferenceList;

    @C09CT("answer_video_list")
    public List<SearchVideoItem> answerVideoList;

    @C09CT("enter_action_type")
    public String enterActionType;
    public EnumC219700t1 locateConfigType;

    @C09CT("message_mob_params")
    public Map<String, String> messageMobParams;

    @C09CT("nimble_params")
    public NimbleParams nimbleParams;

    @C09CT("repeat_key")
    public String repeatKey;

    @C09CT("request_info")
    public TakoCarriedUpRequestInfo requestInfo;

    @C09CT("search_landing_page_request")
    public C665120Q7a searchLandingPageRequest;

    @C09CT("send_image_list")
    public List<TakoImageItem> sendImageList;

    @C09CT("send_interaction_type")
    public String sendInteractionType;

    @C09CT("send_msg_content")
    public String sendMsgContent;

    @C09CT("sug_list")
    public List<String> sugList;

    @C09CT("sug_mob_params")
    public Map<String, String> sugMobParams;

    public TakoCarriedUpData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public String toString() {
        return "TakoCarriedUpData(sendMsgContent=" + this.sendMsgContent + ", sendInteractionType=" + this.sendInteractionType + ", sendImageList=" + this.sendImageList + ", answerCardType=" + this.answerCardType + ", answerMsgId=" + this.answerMsgId + ", answerMsgContent=" + this.answerMsgContent + ", answerVideoList=" + this.answerVideoList + ", answerBingList=" + this.answerBingList + ", answerImageList=" + this.answerImageList + ", answerReferenceList=" + this.answerReferenceList + ", answerPlaceHolders=" + this.answerPlaceHolders + ", answerDisclaimerContent=" + this.answerDisclaimerContent + ", answerAwemeListCache=" + this.answerAwemeListCache + ", sugList=" + this.sugList + ", enterActionType=" + this.enterActionType + ", repeatKey=" + this.repeatKey + ", nimbleParams=" + this.nimbleParams + ", searchLandingPageRequest=" + this.searchLandingPageRequest + ", locateConfigType=" + this.locateConfigType + ", messageMobParams=" + this.messageMobParams + ", sugMobParams=" + this.sugMobParams + ", requestInfo=" + this.requestInfo + ')';
    }

    public final void setAnswerAwemeListCache(List<? extends Aweme> list) {
        this.answerAwemeListCache = list;
    }

    public final void setAnswerBingList(List<SearchBingItem> list) {
        this.answerBingList = list;
    }

    public final void setAnswerCardType(Integer num) {
        this.answerCardType = num;
    }

    public final void setAnswerDisclaimerContent(String str) {
        this.answerDisclaimerContent = str;
    }

    public final void setAnswerImageList(List<TakoImageItem> list) {
        this.answerImageList = list;
    }

    public final void setAnswerMsgContent(String str) {
        this.answerMsgContent = str;
    }

    public final void setAnswerMsgId(String str) {
        this.answerMsgId = str;
    }

    public final void setAnswerPlaceHolders(Map<String, String> map) {
        this.answerPlaceHolders = map;
    }

    public final void setAnswerReferenceList(List<ReferenceItemBridge> list) {
        this.answerReferenceList = list;
    }

    public final void setAnswerVideoList(List<SearchVideoItem> list) {
        this.answerVideoList = list;
    }

    public final void setEnterActionType(String str) {
        this.enterActionType = str;
    }

    public final void setLocateConfigType(EnumC219700t1 enumC219700t1) {
        this.locateConfigType = enumC219700t1;
    }

    public final void setMessageMobParams(Map<String, String> map) {
        this.messageMobParams = map;
    }

    public final void setNimbleParams(NimbleParams nimbleParams) {
        this.nimbleParams = nimbleParams;
    }

    public final void setRepeatKey(String str) {
        this.repeatKey = str;
    }

    public final void setRequestInfo(TakoCarriedUpRequestInfo takoCarriedUpRequestInfo) {
        this.requestInfo = takoCarriedUpRequestInfo;
    }

    public final void setSearchLandingPageRequest(C665120Q7a c665120Q7a) {
        this.searchLandingPageRequest = c665120Q7a;
    }

    public final void setSendImageList(List<TakoImageItem> list) {
        this.sendImageList = list;
    }

    public final void setSendInteractionType(String str) {
        this.sendInteractionType = str;
    }

    public final void setSendMsgContent(String str) {
        this.sendMsgContent = str;
    }

    public final void setSugList(List<String> list) {
        this.sugList = list;
    }

    public final void setSugMobParams(Map<String, String> map) {
        this.sugMobParams = map;
    }

    public TakoCarriedUpData(String str, String str2, List<TakoImageItem> list, Integer num, String str3, String str4, List<SearchVideoItem> list2, List<SearchBingItem> list3, List<TakoImageItem> list4, List<ReferenceItemBridge> list5, Map<String, String> map, String str5, List<? extends Aweme> list6, List<String> list7, String str6, String str7, NimbleParams nimbleParams, C665120Q7a c665120Q7a, EnumC219700t1 enumC219700t1, Map<String, String> map2, Map<String, String> map3, TakoCarriedUpRequestInfo takoCarriedUpRequestInfo) {
        this.sendMsgContent = str;
        this.sendInteractionType = str2;
        this.sendImageList = list;
        this.answerCardType = num;
        this.answerMsgId = str3;
        this.answerMsgContent = str4;
        this.answerVideoList = list2;
        this.answerBingList = list3;
        this.answerImageList = list4;
        this.answerReferenceList = list5;
        this.answerPlaceHolders = map;
        this.answerDisclaimerContent = str5;
        this.answerAwemeListCache = list6;
        this.sugList = list7;
        this.enterActionType = str6;
        this.repeatKey = str7;
        this.nimbleParams = nimbleParams;
        this.searchLandingPageRequest = c665120Q7a;
        this.locateConfigType = enumC219700t1;
        this.messageMobParams = map2;
        this.sugMobParams = map3;
        this.requestInfo = takoCarriedUpRequestInfo;
    }
}
