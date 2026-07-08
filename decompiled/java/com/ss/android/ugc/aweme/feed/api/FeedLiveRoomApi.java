package com.ss.android.ugc.aweme.feed.api;

import X.C0X9S;
import X.C2188811AlT;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.response.BaseResponse;
import com.ss.android.ugc.aweme.live.response.Extra;

/* JADX INFO: loaded from: classes17.dex */
public final class FeedLiveRoomApi {
    public static final RoomApi LIZ;

    public interface RoomApi {
        @InterfaceC1501160pAQ("webcast/d/topview_room/")
        C0X9S<BaseResponse<Room, Extra>> queryRoomInfo(@InterfaceC1501070pAH("uid") long j, @InterfaceC1501070pAH("sec_uid") String str);

        @InterfaceC1501160pAQ("/webcast/topview/room/")
        C0X9S<BaseResponse<Room, Extra>> queryTopViewLiveRoomInfo(@InterfaceC1501070pAH("uid") long j, @InterfaceC1501070pAH("sec_uid") String str);
    }

    static {
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).U4().LIZLLL());
        LIZ = (RoomApi) iRetrofitFactory.createBuilder(C2188811AlT.LIZIZ(sbLIZ)).build().retrofit.LIZ(RoomApi.class);
    }
}
