package com.ss.android.ugc.tiktok.commercialize.track;

import X.C1017070cZd;
import X.C1022820ciu;
import X.C2184171Adz;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class TikTokWideDependencyProviderImpl implements TikTokAdEventDependencyProvider {
    @Override // com.ss.android.ugc.tiktok.commercialize.track.TikTokAdEventDependencyProvider
    public final AwemeRawAd LIZIZ(Aweme aweme) {
        return C1017070cZd.LJJIJLIJ(aweme);
    }

    @Override // com.ss.android.ugc.tiktok.commercialize.track.TikTokAdEventDependencyProvider
    public final void LIZJ(String str, String str2, CommonAdData commonAdData, Map<String, ? extends Object> map) {
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(str, str2, commonAdData);
        c1022820ciuLIZLLL.LIZLLL(map);
        c1022820ciuLIZLLL.LJII();
    }

    @Override // com.ss.android.ugc.tiktok.commercialize.track.TikTokAdEventDependencyProvider
    public final void LIZ(String str, String str2, String str3, String str4, String str5, Map<String, ? extends Object> map) {
        C1022820ciu c1022820ciuLJ = C2184171Adz.LJ(str, str2, str3, str4, str5);
        c1022820ciuLJ.LIZLLL(map);
        c1022820ciuLJ.LJII();
    }
}
