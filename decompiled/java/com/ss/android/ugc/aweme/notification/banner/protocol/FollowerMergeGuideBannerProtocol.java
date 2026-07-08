package com.ss.android.ugc.aweme.notification.banner.protocol;

import X.C13LE;
import X.C1901640zaM;
import X.C19719912Dl;
import X.C637600Oze;
import X.C890320YwI;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerFrequencyControlData;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol;

/* JADX INFO: loaded from: classes29.dex */
public final class FollowerMergeGuideBannerProtocol extends InboxBannerProtocol {
    public final C637600Oze LL = C637600Oze.LJIILLIIL;
    public final C19719912Dl LLILLJJLI = C13LE.LIZ(FollowerMergeGuideBannerAssem.class);
    public final InboxBannerFrequencyControlData LLILLL;

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final boolean LIZ() {
        return C890320YwI.LIZIZ.LIZJ(true);
    }

    public FollowerMergeGuideBannerProtocol() {
        InboxBannerFrequencyControlData inboxBannerFrequencyControlData = (InboxBannerFrequencyControlData) C1901640zaM.LIZIZ.getValue();
        this.LLILLL = inboxBannerFrequencyControlData == null ? C1901640zaM.LIZ : inboxBannerFrequencyControlData;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final C19719912Dl LIZJ() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final C637600Oze LIZLLL() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final InboxBannerFrequencyControlData LJ() {
        return this.LLILLL;
    }
}
