package com.ss.android.ugc.aweme.notification.banner.protocol;

import X.C13IQ;
import X.C13LE;
import X.C1890930zJ5;
import X.C1890960zJ8;
import X.C19719912Dl;
import X.C637600Oze;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class DMCommonBannerProtocol extends InboxBannerCustomProtocol {
    public final C637600Oze LLILLL = C637600Oze.LJFF;
    public final C19719912Dl LLILZ = C13LE.LIZ(DMCommonBannerAssem.class);
    public final List<C13IQ<C1890930zJ5>> LLILZIL = Collections.singletonList(C13LE.LIZ(C1890930zJ5.class));
    public final List<C13IQ<? extends RecyclerView.ViewHolder>> LLILZLL = Collections.singletonList(C13LE.LIZ(C1890960zJ8.class));

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final C19719912Dl LIZJ() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final C637600Oze LIZLLL() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol
    public final List<C13IQ<C1890930zJ5>> LJFF() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol
    public final List<C13IQ<? extends RecyclerView.ViewHolder>> LJI() {
        return this.LLILZLL;
    }
}
