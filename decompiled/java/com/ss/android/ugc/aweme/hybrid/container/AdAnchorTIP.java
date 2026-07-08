package com.ss.android.ugc.aweme.hybrid.container;

import X.C1014150cUv;
import X.C1014220cV2;
import X.C1014230cV3;
import X.C13BV;
import X.InterfaceC1018920ccc;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.commercialize.model.feed.anchor.AnchorInfoStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AdAnchorTIP implements InterfaceC1018920ccc<Aweme> {
    public static final int $stable = 0;

    @Override // X.InterfaceC1018920ccc
    public C1014150cUv obtainGeckoConfig(Aweme aweme) {
        List list;
        AwemeRawAd awemeRawAd;
        AnchorInfoStruct anchorAdInfo;
        NativeSiteConfig nativeSiteConfig;
        String strLIZ = C1014230cV3.LIZ("feed_follow_up_ace_survey");
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (anchorAdInfo = awemeRawAd.getAnchorAdInfo()) == null || (nativeSiteConfig = anchorAdInfo.getNativeSiteConfig()) == null || (list = nativeSiteConfig.geckoChannel) == null) {
            list = C13BV.INSTANCE;
        }
        return new C1014220cV2(strLIZ, "scene_feed_anchor_tip", list);
    }
}
