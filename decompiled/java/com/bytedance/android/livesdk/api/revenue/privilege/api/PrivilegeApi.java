package com.bytedance.android.livesdk.api.revenue.privilege.api;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import tikcast.api.privilege.CentreEntranceResponse;
import tikcast.api.privilege.QueryUserPrivilegesResponse;

/* JADX INFO: loaded from: classes8.dex */
public interface PrivilegeApi {
    @InterfaceC1501170pAR("/webcast/privilege/centre/entrance/")
    C11NZ<CentreEntranceResponse> getPrivilegeCenterEntranceInfo(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("anchor_id") String str2, @InterfaceC1501070pAH("request_from") int i);

    @InterfaceC1501170pAR("/webcast/privilege/query_user_privileges/")
    C11NZ<QueryUserPrivilegesResponse> getUserPrivilegeInfo(@InterfaceC1501070pAH("need_privilege_detail") boolean z, @InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("anchor_id") String str2, @InterfaceC1501070pAH("request_from") int i);
}
