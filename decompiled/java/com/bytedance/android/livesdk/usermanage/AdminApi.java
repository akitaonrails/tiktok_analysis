package com.bytedance.android.livesdk.usermanage;

import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.usermanage.model.AddAdminExtra;
import com.bytedance.android.livesdk.usermanage.model.AdminListExtra;
import com.bytedance.android.livesdk.usermanage.model.AdminResponse;
import com.bytedance.scene.Scene;
import tikcast.api.anchor.AdminHostListResponse;
import tikcast.api.anchor.AdminOperationRecordListResponse;
import tikcast.api.anchor.AdminOverallTabResponse;
import tikcast.api.anchor.AnchorAdminListResponse;
import tikcast.api.anchor.DelHostRelationResponse;
import tikcast.api.perception.ViolationStatusResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface AdminApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/anchor/admin/del_host_relation/")
    C11NZ<DelHostRelationResponse> delHostIModerator(@InterfaceC1501050pAF("host_id") long j, @InterfaceC1501050pAF("room_id") long j2);

    @InterfaceC1501160pAQ("/webcast/user/admin/list/")
    C11NZ<BaseListResponse<AdminResponse, AdminListExtra>> fetchAdministrators(@InterfaceC1501070pAH("anchor_id") long j, @InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("sec_user_id") String str2);

    @InterfaceC1501160pAQ("/webcast/anchor/admin/list/")
    C11NZ<C470590Icr<AnchorAdminListResponse.Data>> fetchAdministratorsNew(@InterfaceC1501070pAH("anchor_id") long j, @InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("sec_user_id") String str2, @InterfaceC1501070pAH("room_id") long j2);

    @InterfaceC1501160pAQ("/webcast/anchor/admin/overall_tab/")
    C11NZ<AdminOverallTabResponse> getAdminOverallTab(@InterfaceC1501070pAH("cursor") Long l, @InterfaceC1501070pAH("count") int i);

    @InterfaceC1501160pAQ("/webcast/anchor/admin/operation_record_list/")
    @C09SO(EnumC1846380y9E.BROADCAST)
    C11NZ<C470590Icr<AdminOperationRecordListResponse.Data>> getModeratorOperationRecords();

    @InterfaceC1501160pAQ("/webcast/anchor/admin/host_list/")
    C11NZ<AdminHostListResponse> requestModeratorIHostList();

    @InterfaceC1501160pAQ("/webcast/perception/violation/status/")
    C11NZ<ViolationStatusResponse> requestReportViolation(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("room_id") long j);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/user/admin/update/")
    C11NZ<C470590Icr<Object>> updateAdmin(@InterfaceC1501050pAF("update_type") int i, @InterfaceC1501050pAF("to_user_id") long j, @InterfaceC1501050pAF("anchor_id") long j2, @InterfaceC1501050pAF("current_room_id") long j3);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/user/admin/permission/update/")
    C11NZ<C470590Icr<Object>> updateAdminPermission(@InterfaceC1501050pAF("permission_type") int i, @InterfaceC1501050pAF("permission_value") int i2, @InterfaceC1501050pAF("to_user_id") long j, @InterfaceC1501050pAF("anchor_id") long j2, @InterfaceC1501050pAF("room_id") long j3, @InterfaceC1501050pAF("sec_anchor_id") String str, @InterfaceC1501050pAF("sec_to_user_id") String str2);

    @InterfaceC1501170pAR("/webcast/user/admin/update/")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    C11NZ<BaseResponse<Object, AddAdminExtra>> updateAdminWithExtra(@InterfaceC1485405rg UpdateAdminParams updateAdminParams);
}
