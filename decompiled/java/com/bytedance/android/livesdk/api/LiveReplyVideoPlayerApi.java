package com.bytedance.android.livesdk.api;

import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.livesdk.chatroom.model.AnchorReplayDeleteResponse;
import com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData;
import java.util.Map;
import tikcast.api.anchor.AnchorClipInfoResponse;
import tikcast.api.anchor.AnchorLiveFragmentEditResponse;
import tikcast.api.anchor.AnchorLiveFragmentInfoResponse;
import tikcast.api.anchor.AnchorLiveReplayFrameResponse;
import tikcast.api.anchor.CancelAutoDownloadResponse;
import tikcast.api.anchor.ScheduleAutoDownloadResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface LiveReplyVideoPlayerApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/anchor/replay/cancel_auto_download/")
    C11NZ<CancelAutoDownloadResponse> cancelAutoDownload(@InterfaceC1501050pAF("room_id") long j);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/anchor/live_fragment/edit/")
    C11NZ<AnchorLiveFragmentEditResponse> clipOrSaveLiveReplayFragment(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("start_time") long j2, @InterfaceC1501050pAF("end_time") long j3, @InterfaceC1501050pAF("action") int i);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/replay/delete/")
    C11NZ<AnchorReplayDeleteResponse> deleteLiveReplayAutoDownload(@InterfaceC1501050pAF("replay_id") long j);

    @InterfaceC1501160pAQ("/webcast/anchor/clip_info/")
    C11NZ<AnchorClipInfoResponse> getAnchorClipInfo();

    @InterfaceC1501160pAQ("/webcast/anchor/live_fragment/info/")
    C11NZ<AnchorLiveFragmentInfoResponse> getLiveReplayFragment(@InterfaceC1501070pAH("fragment_id") long j);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/anchor/replay/frame/")
    C11NZ<C470590Icr<AnchorLiveReplayFrameResponse.ResponseData>> getLiveReplayFrame(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("start_time") long j2, @InterfaceC1501050pAF("end_time") long j3, @InterfaceC1501050pAF("generate_if_not_get") boolean z, @InterfaceC1501050pAF("frame_interval") long j4, @InterfaceC1501050pAF("user_type") int i);

    @InterfaceC1501160pAQ("/webcast/room/replay/info/")
    @C09SO(EnumC1846380y9E.BROADCAST)
    C11NZ<C470590Icr<AnchorReplayInfoData>> getLiveReplayVideoInfo(@InterfaceC1501130pAN Map<String, Object> map);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/anchor/replay/schedule_auto_download/")
    C11NZ<ScheduleAutoDownloadResponse> scheduleAutoDownload(@InterfaceC1501050pAF("room_id") long j);
}
