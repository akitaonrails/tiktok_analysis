package com.ss.android.ugc.aweme.music.api;

import X.C0OG3;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501290pAd;
import X.InterfaceC1501320pAg;
import X.InterfaceC2174708fZ;
import com.ss.android.ugc.aweme.music.model.CollectMusicResponse;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public interface MusicDetailApiV2 {
    public static final C0OG3 LIZ = C0OG3.LIZ;

    @InterfaceC1501160pAQ("/aweme/v1/music/collect/")
    Object collectMusic(@InterfaceC1501070pAH("music_id") String str, @InterfaceC1501070pAH("action") int i, InterfaceC1364105Vn<? super CollectMusicResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/music/detail/")
    Object queryMusic(@InterfaceC1501070pAH("music_id") String str, @InterfaceC1501070pAH("click_reason") int i, InterfaceC1364105Vn<? super MusicDetail> interfaceC1364105Vn);

    @InterfaceC1501160pAQ
    Object queryMusicAwemeList(@InterfaceC2174708fZ String str, @InterfaceC1501070pAH("music_id") String str2, @InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("type") int i2, @InterfaceC1501070pAH("video_cover_shrink") String str3, InterfaceC1364105Vn<? super MusicAwemeList> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/music/detail/")
    Object queryMusicExtra(@InterfaceC1501070pAH("music_id") String str, @InterfaceC1501070pAH("click_reason") int i, @InterfaceC1501070pAH("music_compliance_account") int i2, @InterfaceC1501130pAN Map<String, String> map, InterfaceC1364105Vn<? super MusicDetail> interfaceC1364105Vn);

    @InterfaceC1501290pAd(4)
    @InterfaceC1501160pAQ("/aweme/v1/music/detail/")
    @InterfaceC1501320pAg(3)
    Object queryMusicExtraWithHighPriority(@InterfaceC1501070pAH("music_id") String str, @InterfaceC1501070pAH("click_reason") int i, @InterfaceC1501070pAH("music_compliance_account") int i2, @InterfaceC1501130pAN Map<String, String> map, InterfaceC1364105Vn<? super MusicDetail> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/music/partner/detail/")
    Object queryPartnerMusic(@InterfaceC1501070pAH("partner_music_id") String str, @InterfaceC1501070pAH("partner_name") String str2, InterfaceC1364105Vn<? super MusicDetail> interfaceC1364105Vn);
}
