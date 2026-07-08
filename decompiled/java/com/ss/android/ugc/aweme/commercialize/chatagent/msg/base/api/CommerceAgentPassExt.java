package com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api;

import X.C09CT;
import X.C1278004zK;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes28.dex */
public final class CommerceAgentPassExt {

    @C09CT("answer_status")
    public final int answerStatus;

    @C09CT("auto_send_message_type")
    public final String autoSendMessageType;

    @C09CT("commerce_agent_out_search_id")
    public final String commerceAgentOutSearchId;

    @C09CT("content_extra")
    public final String contentExtra;

    @C09CT("id_list")
    public final String idList;

    @C09CT("is_big_video")
    public final int isBigVideo;

    @C09CT("is_quote_product")
    public final int isQuoteProduct;

    @C09CT("is_quote_video")
    public final int isQuoteVideo;

    @C09CT("message_type")
    public final String messageType;

    @C09CT("plugin_type")
    public String pluginType;

    @C09CT("push_source")
    public final String pushSource;

    @C09CT("tns_intercept")
    public final int tnsIntercept;

    @C09CT("user_intent")
    public final String userIntent;

    public CommerceAgentPassExt() {
        this(0, null, 0, null, null, null, 0, null, 0, null, 0, null, null, 8191, null);
    }

    public CommerceAgentPassExt(int i, String str, int i2, String str2, String str3, String str4, int i3, String str5, int i4, String str6, int i5, String str7, String str8) {
        this.answerStatus = i;
        this.contentExtra = str;
        this.tnsIntercept = i2;
        this.pluginType = str2;
        this.messageType = str3;
        this.idList = str4;
        this.isQuoteVideo = i3;
        this.commerceAgentOutSearchId = str5;
        this.isBigVideo = i4;
        this.autoSendMessageType = str6;
        this.isQuoteProduct = i5;
        this.pushSource = str7;
        this.userIntent = str8;
    }

    public CommerceAgentPassExt(int i, String str, int i2, String str2, String str3, String str4, int i3, String str5, int i4, String str6, int i5, String str7, String str8, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? "" : str, (i6 & 4) != 0 ? 0 : i2, (i6 & 8) != 0 ? "" : str2, (i6 & 16) != 0 ? "" : str3, (i6 & 32) != 0 ? (String) C1278004zK.LIZ.getValue() : str4, (i6 & 64) != 0 ? 0 : i3, (i6 & 128) != 0 ? "" : str5, (i6 & 256) != 0 ? 0 : i4, (i6 & 512) != 0 ? "" : str6, (i6 & 1024) == 0 ? i5 : 0, (i6 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? str7 : "", (i6 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str8);
    }
}
