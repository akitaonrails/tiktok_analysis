package com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2;

import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import tikcast.api.anchor.replay.GetRecordingsPageReq;
import tikcast.api.anchor.replay.GetRecordingsPageResponse;

/* JADX INFO: loaded from: classes28.dex */
public interface LiveReplayV2Api {
    @InterfaceC1501170pAR("/webcast/anchor/replay/recordings_page/")
    Object getRecordingsPage(@InterfaceC1485405rg GetRecordingsPageReq getRecordingsPageReq, InterfaceC1364105Vn<? super GetRecordingsPageResponse> interfaceC1364105Vn);
}
