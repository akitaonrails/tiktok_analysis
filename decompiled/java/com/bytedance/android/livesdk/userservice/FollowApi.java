package com.bytedance.android.livesdk.userservice;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;

/* JADX INFO: loaded from: classes32.dex */
public interface FollowApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/user/relation/update/")
    C11NZ<C470590Icr<FollowResult>> follow(@InterfaceC1501050pAF("follow_type") int i, @InterfaceC1501050pAF("to_user_id") long j, @InterfaceC1501050pAF("current_room_id") long j2, @InterfaceC1501050pAF("sec_user_id") String str, @InterfaceC1501050pAF("sec_to_user_id") String str2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/user/relation/update/")
    C11NZ<C470590Icr<FollowResult>> follow(@InterfaceC1501050pAF("follow_type") int i, @InterfaceC1501050pAF("to_user_id") long j, @InterfaceC1501050pAF("current_room_id") long j2, @InterfaceC1501050pAF("sec_user_id") String str, @InterfaceC1501050pAF("sec_to_user_id") String str2, @InterfaceC1501050pAF("need_block_check") boolean z, @InterfaceC1501050pAF("from_preview") boolean z2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/user/relation/update/")
    C11NZ<C470590Icr<FollowResult>> unfollow(@InterfaceC1501050pAF("follow_type") int i, @InterfaceC1501050pAF("sec_user_id") String str, @InterfaceC1501050pAF("to_user_id") long j, @InterfaceC1501050pAF("sec_to_user_id") String str2, @InterfaceC1501050pAF("current_room_id") long j2);
}
