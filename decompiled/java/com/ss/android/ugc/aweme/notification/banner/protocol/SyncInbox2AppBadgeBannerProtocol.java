package com.ss.android.ugc.aweme.notification.banner.protocol;

import X.C0181003v;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C637550OzZ;
import X.C637600Oze;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class SyncInbox2AppBadgeBannerProtocol extends InboxBannerCustomProtocol {
    public final C637600Oze LLILLL = C637600Oze.LJIILIIL;
    public final C19719912Dl LLILZ = C13LE.LIZ(SyncInbox2AppBadgeBannerAssem.class);
    public final List<C13IQ<C0181003v>> LLILZIL = Collections.singletonList(C13LE.LIZ(C0181003v.class));
    public final List<C13IQ<C637550OzZ>> LLILZLL = Collections.singletonList(C13LE.LIZ(C637550OzZ.class));

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final C19719912Dl LIZJ() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final C637600Oze LIZLLL() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol
    public final List<C13IQ<C0181003v>> LJFF() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol
    public final List<C13IQ<C637550OzZ>> LJI() {
        return this.LLILZLL;
    }
}
