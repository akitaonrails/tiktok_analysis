package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.bytedance.android.livesdkapi.message.ProtoMessageFetchResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetFilteredCommentsResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("messages")
        public List<ProtoMessageFetchResult.BaseProtoMessage> messages = new ArrayList();
    }
}
