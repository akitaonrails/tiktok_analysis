package com.bytedance.android.livesdk.programmedlive.api;

import X.AnonymousClass0957;
import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.live.programmedlive.model.FollowCardCloseRequest;
import com.bytedance.android.live.programmedlive.model.FollowCardResponse;
import com.bytedance.android.livesdk.chatroom.model.GetLiveChainResponse;
import com.bytedance.android.livesdk.chatroom.model.GetStarlingTranslationResponse;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public interface ProgrammedLiveApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/follow_card_close/")
    C11NZ<C470590Icr<Unit>> closeFollowCard(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("card_id") long j2, @InterfaceC1501050pAF("card_anchor_id") long j3, @InterfaceC1501050pAF("user_close") boolean z);

    @InterfaceC1501170pAR("/webcast/room/follow_card_close/")
    C11NZ<C470590Icr<Unit>> closeFollowCard(@InterfaceC1485405rg FollowCardCloseRequest followCardCloseRequest);

    @InterfaceC1501160pAQ("/webcast/room/follow_card/")
    C11NZ<C470590Icr<FollowCardResponse>> getFollowCard(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("card_id") long j2);

    @InterfaceC1501160pAQ("/webcast/room/live_chain/")
    Object getLiveChain(@InterfaceC1501070pAH("room_id") String str, InterfaceC1364105Vn<? super GetLiveChainResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/webcast/room/get_starling_translation/")
    AnonymousClass0957<C470590Icr<GetStarlingTranslationResponse.ResponseData>> getLocalContent(@InterfaceC1501050pAF("brand_name_key") String str, @InterfaceC1501050pAF("content_key") String str2);
}
