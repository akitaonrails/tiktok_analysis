package com.ss.android.ugc.aweme.verify;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class EffectNetworkAllowUrls {

    @C09CT("effect_sdk_url_list_version_2")
    public final boolean effectNetworkAllowListSwitchV2;

    @C09CT("urls")
    public final List<String> urls;

    public EffectNetworkAllowUrls() {
        this(C1697810uHb.LJIIJJI("^https://api\\.tiktokv\\.com/media/api/pic/afr$", "^https://api2\\.musical\\.ly/media/api/pic/afr$", "^https://api16-normal-c-alisg\\.tiktokv\\.com/media/api/pic/afr$", "^https://api16-normal-useast5\\.tiktokv\\.us/media/api/pic/afr$", "^https://api22-normal-c-useast2a\\.tiktokv\\.com/media/api/pic/afr$", "^https://api\\.tiktokv\\.com/media/api/pic/video(/.*)?$", "^https://api2\\.musical\\.ly/media/api/pic/video(/.*)?$", "^https://api16-normal-c-alisg\\.tiktokv\\.com/media/api/pic/video(/.*)?$", "^https://api16-normal-useast5\\.tiktokv\\.us/media/api/pic/video(/.*)?$", "^https://api22-normal-c-useast2a\\.tiktokv\\.com/media/api/pic/video(/.*)?$", "^https://api16-normal-c-useast1a\\.tiktokv\\.com(/.*)?$", "^https://api\\.tiktokv\\.com/tiktok/user/relation/mutual_friends/list/v1(/.*)?$", "^https://ar(-va|-sg|-i18n|-us|-ttp)?\\.byteintlapi\\.com/api/contents/ar-keys(/.*)?$", "^https://ar(-va|-sg|-i18n|-us|-ttp)?\\.byteintlapi\\.com/near-points-v3(/.*)?$", "^https://ar(-va|-sg|-i18n|-us|-ttp)?\\.isnssdk\\.com/near-points-v3(/.*)?$", "^https://ar(-va|-sg|-i18n|-us|-ttp)?\\.byteintlapi\\.com/v1/ttpoi/api(/.*)?$", "^https://api\\.tiktokv\\.com/media/api/text/speech/invoke(/.*)?$", "^https://sami(-va|-sg|-i18n|-us)?\\.tiktokv\\.com(/.*)?$", "^https://(p|lf|sf)[0-9]{1,2}[a-z0-9-]{1,25}\\.(tiktokcdn|tiktokcdn-us|tiktokcdn-eu|ibyteimg)\\.com(/.*)?$", "^https://image(-useast2a|-sg|\\.us|-va)\\.tiktok(v)?\\.com(/.*)?$", "^https://api\\.tiktokv\\.com/tiktok/v2/effect/api/ttapp/effect/common-count(/.*)?$", "^https://api\\.tiktokv\\.com/tiktok/v1/api/effect/leaderboard/retrieve(/.*)?$", "^https://api\\.tiktokv\\.com/tiktok/v1/api/effect/leaderboard/encrypt_key/retrieve(/.*)?$", "^https://api\\.tiktokv\\.com/tiktok/v2/effect/api/ttapp/effect/streak/stats(/.*)?$"), false);
    }

    public EffectNetworkAllowUrls(List<String> list, boolean z) {
        this.urls = list;
        this.effectNetworkAllowListSwitchV2 = z;
    }
}
