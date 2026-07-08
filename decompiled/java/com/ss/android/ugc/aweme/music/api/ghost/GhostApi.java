package com.ss.android.ugc.aweme.music.api.ghost;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.music.ghost.GhostMusicTabReportResponse;

/* JADX INFO: loaded from: classes10.dex */
public interface GhostApi {
    @InterfaceC1501170pAR("/tiktok/user/ghost_music_tab/set/v1/")
    Object reportGhostEntranceNotInterested(@InterfaceC1501070pAH("show_status") boolean z, @InterfaceC1501070pAH("close_music_tab_reason") int i, InterfaceC1364105Vn<? super GhostMusicTabReportResponse> interfaceC1364105Vn);
}
