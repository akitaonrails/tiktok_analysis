package com.ss.android.ugc.aweme.notification.banner.protocol;

import X.C112400bi;
import X.C1399230mW1;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C637600Oze;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol;
import com.ss.android.ugc.aweme.services.IExternalService;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class AILiveInboxBannerProtocol extends InboxBannerCustomProtocol {
    public final C637600Oze LLILLL = C637600Oze.LJIIJJI;
    public final C19719912Dl LLILZ = C13LE.LIZ(AILiveInboxBannerAssem.class);
    public final List<C13IQ<C112400bi>> LLILZIL = Collections.singletonList(C13LE.LIZ(C112400bi.class));
    public final List<C13IQ<? extends RecyclerView.ViewHolder>> LLILZLL = Collections.singletonList(C13LE.LIZ(C1399230mW1.class));

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final boolean LIZ() {
        return ((IExternalService) ServiceManager.get().getService(IExternalService.class)).getAILiveService().enableInboxBanner();
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
    public final List<C13IQ<C112400bi>> LJFF() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol
    public final List<C13IQ<? extends RecyclerView.ViewHolder>> LJI() {
        return this.LLILZLL;
    }
}
