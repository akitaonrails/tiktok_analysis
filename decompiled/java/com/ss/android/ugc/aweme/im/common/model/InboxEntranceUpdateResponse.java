package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class InboxEntranceUpdateResponse extends BaseResponse {

    @C09CT("chat_requests")
    public List<Object> chatRequests;

    public final List<Object> getChatRequests() {
        return this.chatRequests;
    }

    public final void setChatRequests(List<Object> list) {
        this.chatRequests = list;
    }
}
