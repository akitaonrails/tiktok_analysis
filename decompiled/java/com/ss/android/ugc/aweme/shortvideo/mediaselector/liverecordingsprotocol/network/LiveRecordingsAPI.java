package com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.network;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.BaseResponse;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsConfigResponse;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsListResponse;

/* JADX INFO: loaded from: classes4.dex */
public interface LiveRecordingsAPI {
    @InterfaceC1501160pAQ("/webcast/anchor/live_fragment/camera_tab/")
    Object getLiveRecordingsConfig(InterfaceC1364105Vn<? super BaseResponse<LiveRecordingsConfigResponse>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/anchor/live_fragment/camera/list/")
    Object getLiveRecordingsList(@InterfaceC1501070pAH("limit") Integer num, @InterfaceC1501070pAH("last_id") Long l, InterfaceC1364105Vn<? super BaseResponse<LiveRecordingsListResponse>> interfaceC1364105Vn);
}
