package com.ss.android.ugc.aweme.network;

import X.C040I;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485505rh;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501330pAh;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.network.model.AuditBatchAckReqBody;
import com.ss.android.ugc.aweme.network.model.AuditBatchAckResponse;
import com.ss.android.ugc.aweme.network.model.AuditClearUnreadRequest;
import com.ss.android.ugc.aweme.network.model.GetAccessCriteriaRequestBody;
import com.ss.android.ugc.aweme.network.model.GetAccessCriteriaResponseBody;
import com.ss.android.ugc.aweme.network.model.GetAuditListRequestBody;
import com.ss.android.ugc.aweme.network.model.GetAuditListResponseBody;
import com.ss.android.ugc.aweme.network.model.GetManagementPageSettingsBody;
import com.ss.android.ugc.aweme.network.model.GetManagementPageSettingsResponse;
import com.ss.android.ugc.aweme.network.model.GetUnreadAuditCountResponse;
import com.ss.android.ugc.aweme.network.model.GroupLinkPreviewResponse;

/* JADX INFO: loaded from: classes36.dex */
public interface IGroupChatNetworkRequestApi {
    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501240pAY("/tiktok/v1/im/group/audit/get_list")
    Object LIZ(@C040I GetAuditListRequestBody getAuditListRequestBody, InterfaceC1364105Vn<? super GetAuditListResponseBody> interfaceC1364105Vn);

    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501240pAY("/tiktok/v1/im/group/audit/clear_unread")
    Object LIZIZ(@C040I AuditClearUnreadRequest auditClearUnreadRequest, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/tiktok/v1/im/group/link/preview")
    @InterfaceC1485505rh
    Object LIZJ(@InterfaceC1501100pAK(Scene.SCENE_SERVICE) int i, @InterfaceC1501100pAK("short_link") String str, @InterfaceC1501100pAK("item_id") long j, InterfaceC1364105Vn<? super GroupLinkPreviewResponse> interfaceC1364105Vn);

    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501240pAY("/tiktok/v1/im/group/audit/batch_ack")
    Object LIZLLL(@C040I AuditBatchAckReqBody auditBatchAckReqBody, InterfaceC1364105Vn<? super AuditBatchAckResponse> interfaceC1364105Vn);

    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501240pAY("/tiktok/v1/im/group/access_criteria/get")
    Object LJ(@C040I GetAccessCriteriaRequestBody getAccessCriteriaRequestBody, InterfaceC1364105Vn<? super GetAccessCriteriaResponseBody> interfaceC1364105Vn);

    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501240pAY("/tiktok/v1/im/group/management_page")
    Object LJFF(@C040I GetManagementPageSettingsBody getManagementPageSettingsBody, InterfaceC1364105Vn<? super GetManagementPageSettingsResponse> interfaceC1364105Vn);

    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501160pAQ("/tiktok/v1/im/group/audit/get_unread")
    Object getUnreadAuditCount(@InterfaceC1501070pAH("conversation_short_ids") String str, InterfaceC1364105Vn<? super GetUnreadAuditCountResponse> interfaceC1364105Vn);
}
