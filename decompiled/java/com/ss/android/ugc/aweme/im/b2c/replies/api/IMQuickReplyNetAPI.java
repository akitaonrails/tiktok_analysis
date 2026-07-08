package com.ss.android.ugc.aweme.im.b2c.replies.api;

import X.C1798930wuh;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes28.dex */
public interface IMQuickReplyNetAPI {
    public static final C1798930wuh LIZ = C1798930wuh.LIZ;

    @InterfaceC1501170pAR("/tiktok/v1/im/b2c/quick_reply/delete")
    Object deleteQuickReply(@InterfaceC1485405rg QuickReplyIdListRequest quickReplyIdListRequest, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/v1/im/b2c/quick_reply/feedback")
    Object feedbackQuickReply(@InterfaceC1485405rg QuickReplySaveRequest quickReplySaveRequest, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/v1/im/b2c/quick_reply/list")
    Object fetchQuickReplyList(@InterfaceC1485405rg QuickReplyListRequestBody quickReplyListRequestBody, InterfaceC1364105Vn<? super QuickReplyListResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/v1/im/b2c/quick_reply/reorder")
    Object reorderQuickReply(@InterfaceC1485405rg QuickReplyIdListRequest quickReplyIdListRequest, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/v1/im/b2c/quick_reply/save")
    Object saveQuickReply(@InterfaceC1485405rg QuickReplySaveRequest quickReplySaveRequest, InterfaceC1364105Vn<? super QuickReplySaveResponse> interfaceC1364105Vn);
}
