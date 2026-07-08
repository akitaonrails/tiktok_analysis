package webcast.api.room;

import X.C09CT;
import com.bytedance.android.live.base.model.roomcomponents.OnlineRankListResponse;
import com.bytedance.android.livesdk.rank.model.RankEntranceV3Response;
import java.util.ArrayList;
import java.util.List;
import webcast.api.room.FirstScreenResponse;
import webcast.api.room.GetOnlineRoomPCUResponse;

/* JADX INFO: loaded from: classes36.dex */
public final class RoomComponentsV2Response {

    @C09CT("components")
    public FirstScreenResponse.ResponseData components;

    @C09CT("components_status")
    public long componentsStatus;

    @C09CT("online_audience")
    public OnlineRankListResponse onlineAudience;

    @C09CT("online_audience_status")
    public long onlineAudienceStatus;

    @C09CT("rankings")
    public List<RankEntranceV3Response.EntranceGroup> rankings = new ArrayList();

    @C09CT("rankings_status")
    public long rankingsStatus;

    @C09CT("room_pcu")
    public GetOnlineRoomPCUResponse.ResponseData roomPcu;

    @C09CT("room_pcu_status")
    public long roomPcuStatus;
}
