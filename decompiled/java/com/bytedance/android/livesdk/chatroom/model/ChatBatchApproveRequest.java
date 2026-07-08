package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ChatBatchApproveRequest {

    @C09CT("msg_ids")
    public List<Long> msgIds = new ArrayList();

    @C09CT("room_id")
    public long roomId;
}
