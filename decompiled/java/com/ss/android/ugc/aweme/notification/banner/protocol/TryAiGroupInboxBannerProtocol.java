package com.ss.android.ugc.aweme.notification.banner.protocol;

import X.C1271804yK;
import X.C13IQ;
import X.C13LE;
import X.C1701006lM;
import X.C1903110zcj;
import X.C19719912Dl;
import X.C637600Oze;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class TryAiGroupInboxBannerProtocol extends InboxBannerCustomProtocol {
    public final C637600Oze LLILLL = C637600Oze.LJ;
    public final C19719912Dl LLILZ = C13LE.LIZ(TryAiGroupInboxBannerAssem.class);
    public final List<C13IQ<C1271804yK>> LLILZIL = Collections.singletonList(C13LE.LIZ(C1271804yK.class));
    public final List<C13IQ<? extends RecyclerView.ViewHolder>> LLILZLL = Collections.singletonList(C13LE.LIZ(C1903110zcj.class));

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final boolean LIZ() {
        return C1701006lM.LIZIZ.LJI();
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
    public final List<C13IQ<C1271804yK>> LJFF() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol
    public final List<C13IQ<? extends RecyclerView.ViewHolder>> LJI() {
        return this.LLILZLL;
    }
}
