package com.ss.android.ugc.aweme.commercialize.chatagent.api.model;

import X.C09CT;
import X.C1077020e8K;
import X.C13BV;
import X.C2097608Jq;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.CommerceAgentHint;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceAgentEnterParams implements Serializable {
    public static final C1077020e8K Companion = new Object() { // from class: X.0e8K
    };

    @C09CT("auto_send_msg_content")
    public String autoSendMsgContent;

    @C09CT("bot_info")
    public final AIBotInfo botInfo;

    @C09CT("commerce_agentAction_barItems_list")
    public List<CommerceAgentActionBarItem> commerceAgentActionBarItems;

    @C09CT("disclaimer_text")
    public String disclaimerText;

    @C09CT("is_dynamic_icon")
    public boolean dynamicIcon;

    @C09CT("enter_from")
    public String enterFrom;

    @C09CT("enter_method")
    public String enterMethod;

    @C09CT("enter_start_time")
    public Long enterStartTime;

    @C09CT("gid")
    public final String gid;

    @C09CT("is_from_schema")
    public boolean isFromSchema;

    @C09CT("open_by_sheet")
    public final boolean openBySheet;

    @C09CT("process_id")
    public String processId;

    @C09CT("push_msg_channel")
    public int pushMsgChannel;

    @C09CT("push_msg_id")
    public String pushMsgId;
    public Function1<? super List<CommerceAgentHint>, Unit> refreshBarAction;

    @C09CT("screenType")
    public String screenType;

    @C09CT("search_card_type")
    public Integer searchCardType;

    @C09CT("search_id_list")
    public final String searchIdList;

    @C09CT("search_log_id")
    public final String searchLogId;

    @C09CT("search_message_id")
    public final String searchMessageId;

    @C09CT("search_message_type")
    public final String searchMessageType;

    @C09CT("show_loading")
    public final boolean showLoading;

    @C09CT("token_type")
    public String tokenType;

    @C09CT("welcome_wording")
    public String welcomeWording;

    @C09CT("words_content")
    public final String wordsContent;

    @C09CT("words_source")
    public final String wordsSource;

    public CommerceAgentEnterParams() {
        this(null, null, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, null, null, null, null, 67108863, null);
    }

    public final Map<String, String> getCommonParams() {
        return C2097608Jq.LJIIJ(new Pair("enter_from", this.enterFrom), new Pair("enter_method", this.enterMethod), new Pair("process_id", this.processId), new Pair("bot_id", String.valueOf(this.botInfo.botId)));
    }

    public final boolean isFromSchema() {
        return this.isFromSchema;
    }

    public final void setAutoSendMsgContent(String str) {
        this.autoSendMsgContent = str;
    }

    public final void setCommerceAgentActionBarItems(List<CommerceAgentActionBarItem> list) {
        this.commerceAgentActionBarItems = list;
    }

    public final void setDisclaimerText(String str) {
        this.disclaimerText = str;
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

    public final void setEnterStartTime(Long l) {
        this.enterStartTime = l;
    }

    public final void setFromSchema(boolean z) {
        this.isFromSchema = z;
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

    public final void setRefreshBarAction(Function1<? super List<CommerceAgentHint>, Unit> function1) {
        this.refreshBarAction = function1;
    }

    public final void setScreenType(String str) {
        this.screenType = str;
    }

    public final void setSearchCardType(Integer num) {
        this.searchCardType = num;
    }

    public final void setTokenType(String str) {
        this.tokenType = str;
    }

    public final void setWelcomeWording(String str) {
        this.welcomeWording = str;
    }

    public CommerceAgentEnterParams(String str, String str2, boolean z, String str3, String str4, Integer num, String str5, String str6, String str7, int i, String str8, String str9, Long l, boolean z2, String str10, String str11, String str12, String str13, AIBotInfo aIBotInfo, boolean z3, String str14, boolean z4, List<CommerceAgentActionBarItem> list, String str15, String str16, Function1<? super List<CommerceAgentHint>, Unit> function1) {
        this.enterFrom = str;
        this.enterMethod = str2;
        this.dynamicIcon = z;
        this.searchLogId = str3;
        this.searchMessageType = str4;
        this.searchCardType = num;
        this.searchMessageId = str5;
        this.searchIdList = str6;
        this.tokenType = str7;
        this.pushMsgChannel = i;
        this.pushMsgId = str8;
        this.autoSendMsgContent = str9;
        this.enterStartTime = l;
        this.isFromSchema = z2;
        this.gid = str10;
        this.processId = str11;
        this.wordsSource = str12;
        this.wordsContent = str13;
        this.botInfo = aIBotInfo;
        this.openBySheet = z3;
        this.screenType = str14;
        this.showLoading = z4;
        this.commerceAgentActionBarItems = list;
        this.welcomeWording = str15;
        this.disclaimerText = str16;
        this.refreshBarAction = function1;
    }

    public CommerceAgentEnterParams(String str, String str2, boolean z, String str3, String str4, Integer num, String str5, String str6, String str7, int i, String str8, String str9, Long l, boolean z2, String str10, String str11, String str12, String str13, AIBotInfo aIBotInfo, boolean z3, String str14, boolean z4, List list, String str15, String str16, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? -1 : num, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? null : str6, (i2 & 256) != 0 ? null : str7, (i2 & 512) != 0 ? 0 : i, (i2 & 1024) != 0 ? "" : str8, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str9, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : l, (i2 & 8192) != 0 ? false : z2, (i2 & 16384) != 0 ? "" : str10, (32768 & i2) != 0 ? UUID.randomUUID().toString() : str11, (65536 & i2) != 0 ? null : str12, (131072 & i2) != 0 ? null : str13, (262144 & i2) != 0 ? new AIBotInfo(0L, null, null, 0, 0, 0, null, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, null, 8388607, null) : aIBotInfo, (524288 & i2) != 0 ? false : z3, (1048576 & i2) != 0 ? null : str14, (2097152 & i2) != 0 ? false : z4, (4194304 & i2) != 0 ? C13BV.INSTANCE : list, (8388608 & i2) != 0 ? null : str15, (16777216 & i2) == 0 ? str16 : "", (i2 & 33554432) != 0 ? null : function1);
    }
}
