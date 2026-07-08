package com.ss.android.ugc.aweme.compliance.business.banner;

import X.C1056650dbT;
import X.C13IQ;
import X.C13LE;
import X.C1713200ugQ;
import X.C19719912Dl;
import X.C637600Oze;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class ParentalInboxBannerProtocol extends InboxBannerCustomProtocol {
    public final C637600Oze LLILLL = C637600Oze.LJIILJJIL;
    public final C19719912Dl LLILZ = C13LE.LIZ(ParentInboxBannerAssem.class);
    public final List<C13IQ<C1713200ugQ>> LLILZIL = Collections.singletonList(C13LE.LIZ(C1713200ugQ.class));
    public final List<C13IQ<C1056650dbT>> LLILZLL = Collections.singletonList(C13LE.LIZ(C1056650dbT.class));

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final boolean LIZ() {
        IGatekeeperService iGatekeeperService;
        DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ;
        SettingsManager.LIZLLL().getClass();
        return (!SettingsManager.LIZ("parent_inbox_banner", true) || KevaImpl.getRepo("vpc_parent_inbox_banner_go_rule", 0).getBoolean("close_once", false) || (iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null)) == null || (eligibilityModelLIZ = iGatekeeperService.LIZ("vpc_parent_inbox_banner_go_rule")) == null || !eligibilityModelLIZ.isEligible()) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final C19719912Dl LIZJ() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final C637600Oze LIZLLL() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol
    public final List<C13IQ<C1713200ugQ>> LJFF() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol
    public final List<C13IQ<C1056650dbT>> LJI() {
        return this.LLILZLL;
    }
}
