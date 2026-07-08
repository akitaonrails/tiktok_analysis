package com.ss.android.ugc.aweme.notification.banner.customevent;

import X.C1901570zaF;
import X.C20684815ws;
import X.C2344009Gk;
import X.C637600Oze;
import X.EnumC637460OzQ;
import com.ss.android.ugc.aweme.inbox.banner.InboxPlatformBannerEventProtocol;
import com.ss.android.ugc.aweme.inbox.banner.model.InboxBannerInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class M2PlatformBannerEventProtocol extends InboxPlatformBannerEventProtocol {
    public final C637600Oze LL = C637600Oze.LIZIZ;

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxPlatformBannerEventProtocol
    public final C637600Oze LIZ() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxPlatformBannerEventProtocol
    public final void LIZLLL(InboxBannerInfo inboxBannerInfo) {
        C1901570zaF c1901570zaF = C1901570zaF.LIZ;
        Map<String, String> map = inboxBannerInfo.eventParams;
        c1901570zaF.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(map);
        c2344009Gk.LJIIIIZZ("enter_from", "notification_page");
        C20684815ws.LJIILLIIL("guide_user_m2_show", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxPlatformBannerEventProtocol
    public final void LIZJ(EnumC637460OzQ enumC637460OzQ, InboxBannerInfo inboxBannerInfo) {
        C1901570zaF c1901570zaF = C1901570zaF.LIZ;
        Map<String, String> map = inboxBannerInfo.eventParams;
        c1901570zaF.getClass();
        C1901570zaF.LIZLLL(enumC637460OzQ, map);
    }
}
