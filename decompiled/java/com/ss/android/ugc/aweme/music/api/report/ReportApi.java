package com.ss.android.ugc.aweme.music.api.report;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.music.model.MusicBaseResponse;
import com.ss.android.ugc.aweme.music.model.report.ReportMusicList;

/* JADX INFO: loaded from: classes10.dex */
public interface ReportApi {
    @InterfaceC1501160pAQ("/tiktok/user/not_my_song_review_list/v1/")
    Object getMusicReportList(@InterfaceC1501070pAH("cursor") int i, @InterfaceC1501070pAH("count") int i2, @InterfaceC1501070pAH("group_offset") int i3, InterfaceC1364105Vn<? super ReportMusicList> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/user/not_my_song_submit_request/v1/")
    Object submitReport(@InterfaceC1501050pAF("music_id") String str, InterfaceC1364105Vn<? super MusicBaseResponse> interfaceC1364105Vn);
}
