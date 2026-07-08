package com.ss.android.ugc.aweme.music.discovery.api;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public interface MusicChartApi {
    @InterfaceC1501160pAQ("/tiktok/music/chart/v1/")
    Object getMusicList(@InterfaceC1501130pAN Map<String, String> map, InterfaceC1364105Vn<? super MusicChartV1Response> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/music/chart/videos/v1/")
    Object getVideoListByMusicId(@InterfaceC1501130pAN Map<String, String> map, InterfaceC1364105Vn<? super MusicChartVideosV1Response> interfaceC1364105Vn);
}
