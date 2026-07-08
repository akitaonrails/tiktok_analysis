package com.bytedance.android.livesdk.function;

import X.C09CT;
import X.C470590Icr;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.bytedance.android.livesdk.chatroom.model.AnchorSettingsResponse;
import com.bytedance.android.livesdk.chatroom.model.AnchorSettingsUpdateRequest;
import com.bytedance.android.livesdk.chatroom.model.AnchorSettingsUpdateResponse;
import com.bytedance.android.livesdk.chatroom.model.ChatBatchApproveRequest;
import com.bytedance.android.livesdk.chatroom.model.ChatBatchApproveResponse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public interface RoomFunctionApi {

    public static final class BaseProtoMessageBase64 {

        @C09CT("is_history")
        public boolean isHistory;

        @C09CT("method")
        public String method;

        @C09CT("msg_id")
        public long msgId;

        @C09CT("msg_type")
        public int msgType;

        @C09CT("offset")
        public long offset;

        @C09CT("payload")
        public String payload;
    }

    public static final class GetFilteredCommentsResponseBase64 {

        @C09CT("data")
        public ResponseData data;

        @C09CT("status_code")
        public int statusCode;

        public static final class ResponseData {

            @C09CT("messages")
            public List<BaseProtoMessageBase64> messages = new ArrayList();
        }
    }

    @InterfaceC1501170pAR("/webcast/room/chat/batch_approve")
    Object batchApproveFilteredComments(@InterfaceC1485405rg ChatBatchApproveRequest chatBatchApproveRequest, InterfaceC1364105Vn<? super C470590Icr<ChatBatchApproveResponse>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/room/anchor_settings/read/")
    Object requestAnchorSettingsRead(@InterfaceC1501070pAH("room_id") long j, InterfaceC1364105Vn<? super C470590Icr<AnchorSettingsResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/room/anchor_settings/update/")
    Object requestAnchorSettingsUpdate(@InterfaceC1485405rg AnchorSettingsUpdateRequest anchorSettingsUpdateRequest, InterfaceC1364105Vn<? super C470590Icr<AnchorSettingsUpdateResponse>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/room/interaction/get_filtered_comments/")
    Object requestFilteredComments(@InterfaceC1501070pAH("room_id") long j, InterfaceC1364105Vn<? super GetFilteredCommentsResponseBase64> interfaceC1364105Vn);
}
