package com.ss.android.ugc.aweme.unifiedauth.banner;

import X.C13LE;
import X.C19208710Cv;
import X.C19719912Dl;
import X.C637600Oze;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelAuthEdmAndSmsGuideV3;

/* JADX INFO: loaded from: classes29.dex */
public final class UgTopInboxBannerProtocol extends InboxBannerProtocol {
    public final C637600Oze LL = C637600Oze.LJIIIIZZ;
    public final C19719912Dl LLILLJJLI = C13LE.LIZ(UgTopInboxBannerAssem.class);

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final boolean LIZ() {
        return ChannelAuthEdmAndSmsGuideV3.INSTANCE.canShowBanner() && C19208710Cv.LJ();
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final C19719912Dl LIZJ() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final C637600Oze LIZLLL() {
        return this.LL;
    }
}
