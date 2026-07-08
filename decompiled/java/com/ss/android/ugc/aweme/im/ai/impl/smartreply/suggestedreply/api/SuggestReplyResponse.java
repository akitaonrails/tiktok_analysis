package com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SuggestReplyResponse implements Serializable {

    @C09CT("intent_matched")
    public final Boolean intentMatched;

    @C09CT("interactions")
    public final DMBotInteraction interactions;

    @C09CT("rewritten_query")
    public final String rewrittenQuery;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("topic_info")
    public final String topicInfo;

    public SuggestReplyResponse() {
        this(null, null, null, null, null, null);
    }

    public SuggestReplyResponse(Integer num, String str, DMBotInteraction dMBotInteraction, String str2, Boolean bool, String str3) {
        this.statusCode = num;
        this.statusMsg = str;
        this.interactions = dMBotInteraction;
        this.topicInfo = str2;
        this.intentMatched = bool;
        this.rewrittenQuery = str3;
    }
}
