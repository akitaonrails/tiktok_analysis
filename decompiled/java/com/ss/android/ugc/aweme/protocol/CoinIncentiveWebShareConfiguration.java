package com.ss.android.ugc.aweme.protocol;

import X.AbstractC1372680lpC;
import X.C1377380lwm;
import X.C13LE;
import android.content.Context;
import com.ss.android.ugc.aweme.protocol.channel.CoinWebReferralChannelShareProtocol;
import com.ss.android.ugc.aweme.protocol.panel.CoinWebIncentiveSharePanelLogicProtocol;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig;
import com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol;
import com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;

/* JADX INFO: loaded from: classes22.dex */
public final class CoinIncentiveWebShareConfiguration extends TTShareDefaultConfig<WebSharePackage> {
    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final AbstractC1372680lpC LIZLLL() {
        return new C1377380lwm("incentive_share_video_page", C13LE.LIZ(WebSharePackage.class));
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final SharePanelLogicProtocol LJ(BaseSharePackage baseSharePackage) {
        return new CoinWebIncentiveSharePanelLogicProtocol(baseSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final ShareChannelProtocol LIZJ(Context context, BaseSharePackage baseSharePackage) {
        return new CoinWebReferralChannelShareProtocol(context, baseSharePackage);
    }
}
