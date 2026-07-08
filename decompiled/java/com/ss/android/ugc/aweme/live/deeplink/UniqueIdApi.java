package com.ss.android.ugc.aweme.live.deeplink;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes8.dex */
public interface UniqueIdApi {
    @InterfaceC1501170pAR("/webcast/room/get_latest_room/")
    C11NZ<BaseResponse<Room, Extra>> getLatestRoom(@InterfaceC1501070pAH("unique_id") String str);

    @InterfaceC1501160pAQ("/aweme/v1/user/uniqueid/")
    C11NZ<UserIdResponse> getRoomId(@InterfaceC1501070pAH(FollowStatusChangeMethod.PARAM_UID) String str);
}
