package com.ss.android.ugc.aweme.music.dsp.dm.api;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501290pAd;
import X.InterfaceC1501320pAg;
import com.ss.android.ugc.aweme.music.model.MusicDetail;

/* JADX INFO: loaded from: classes10.dex */
public interface Dsp2ttDmApi {
    @InterfaceC1501290pAd(4)
    @InterfaceC1501160pAQ("/aweme/v1/music/detail/")
    @InterfaceC1501320pAg(3)
    Object getMusicDetail(@InterfaceC1501070pAH("music_id") String str, InterfaceC1364105Vn<? super MusicDetail> interfaceC1364105Vn);
}
