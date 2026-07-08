package com.ss.android.ugc.aweme.tako.botpage.bottombox;

import X.C09CT;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoEditAskInfo {

    @C09CT("answer_msg_id")
    public final String answerMsgId;

    @C09CT("edit_message")
    public final Message editMessage;

    @C09CT("query_msg_id")
    public final String queryMsgId;

    public TakoEditAskInfo() {
        this(null, null, null);
    }

    public TakoEditAskInfo(String str, String str2, Message message) {
        this.queryMsgId = str;
        this.answerMsgId = str2;
        this.editMessage = message;
    }
}
