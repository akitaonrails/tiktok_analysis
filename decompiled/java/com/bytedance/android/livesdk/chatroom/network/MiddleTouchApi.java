package com.bytedance.android.livesdk.chatroom.network;

import X.AnonymousClass0957;
import X.C1098440egs;
import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import webcast.api.room.UnifyBaseBusinessResponse;

/* JADX INFO: loaded from: classes18.dex */
public interface MiddleTouchApi {
    public static final C1098440egs LIZ = C1098440egs.LIZ;

    @InterfaceC1501160pAQ("/webcast/room/unify_base/get_middle_touch/")
    AnonymousClass0957<C470590Icr<UnifyBaseBusinessResponse.Data>> getMiddleTouchData(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("anchor_id") long j2, @InterfaceC1501070pAH("unify_base_id") int i);

    @InterfaceC1501160pAQ("/webcast/room/unify_base/get_middle_touch/")
    C11NZ<C470590Icr<UnifyBaseBusinessResponse.Data>> getMiddleTouchDataV2(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("anchor_id") long j2, @InterfaceC1501070pAH("unify_base_id") int i);
}
