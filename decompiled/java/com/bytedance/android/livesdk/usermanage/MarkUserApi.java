package com.bytedance.android.livesdk.usermanage;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.livesdk.chatroom.model.MarkListResp;
import com.bytedance.android.livesdk.chatroom.model.MarkUserResp;
import com.bytedance.android.livesdk.chatroom.model.UnmarkUserResp;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface MarkUserApi {
    @InterfaceC1501160pAQ("/webcast/room/mark/list/")
    C11NZ<C470590Icr<List<MarkListResp.MarkedUser>>> fetchMarkedUserList();

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/mark/user/")
    C11NZ<C470590Icr<MarkUserResp.Data>> mark(@InterfaceC1501050pAF("to_user_id") long j, @InterfaceC1501050pAF("sec_user_id") String str);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/unmark/user/")
    C11NZ<C470590Icr<UnmarkUserResp.Data>> unmark(@InterfaceC1501050pAF("to_user_id") long j, @InterfaceC1501050pAF("sec_user_id") String str);
}
