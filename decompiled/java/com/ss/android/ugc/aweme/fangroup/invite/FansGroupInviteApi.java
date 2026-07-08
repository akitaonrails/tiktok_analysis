package com.ss.android.ugc.aweme.fangroup.invite;

import X.C470590Icr;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import webcast.api.fans.FansGetGroupInviteListRequest;
import webcast.api.fans.FansGetGroupInviteListResponse;

/* JADX INFO: loaded from: classes33.dex */
public interface FansGroupInviteApi {
    @InterfaceC1501170pAR("/webcast/privilege/fans_get_group_invite_list/")
    Object getInviteGroupList(@InterfaceC1485405rg FansGetGroupInviteListRequest fansGetGroupInviteListRequest, InterfaceC1364105Vn<? super C470590Icr<FansGetGroupInviteListResponse.Data>> interfaceC1364105Vn);
}
