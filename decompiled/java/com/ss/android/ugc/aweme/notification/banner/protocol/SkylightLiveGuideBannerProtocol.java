package com.ss.android.ugc.aweme.notification.banner.protocol;

import X.C13IQ;
import X.C13LE;
import X.C1903680zde;
import X.C19719912Dl;
import X.C637600Oze;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol;
import com.ss.android.ugc.aweme.notification.banner.vh.SkylightLiveGuideBannerItem;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class SkylightLiveGuideBannerProtocol extends InboxBannerCustomProtocol {
    public final C637600Oze LLILLL = C637600Oze.LJIIIZ;
    public final C19719912Dl LLILZ = C13LE.LIZ(SkylightLiveGuideBannerAssem.class);
    public final List<C13IQ<SkylightLiveGuideBannerItem>> LLILZIL = Collections.singletonList(C13LE.LIZ(SkylightLiveGuideBannerItem.class));
    public final List<C13IQ<? extends RecyclerView.ViewHolder>> LLILZLL = Collections.singletonList(C13LE.LIZ(C1903680zde.class));

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final C19719912Dl LIZJ() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final C637600Oze LIZLLL() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol
    public final List<C13IQ<SkylightLiveGuideBannerItem>> LJFF() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol
    public final List<C13IQ<? extends RecyclerView.ViewHolder>> LJI() {
        return this.LLILZLL;
    }
}
