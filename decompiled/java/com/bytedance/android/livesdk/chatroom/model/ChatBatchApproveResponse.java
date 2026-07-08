package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ChatBatchApproveResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("msg_ids")
        public List<Long> msgIds = new ArrayList();
    }
}
