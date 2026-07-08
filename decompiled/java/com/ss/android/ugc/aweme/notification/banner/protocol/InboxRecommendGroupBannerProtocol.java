package com.ss.android.ugc.aweme.notification.banner.protocol;

import X.C13IQ;
import X.C13LE;
import X.C1421930n6d;
import X.C1421950n6f;
import X.C19719912Dl;
import X.C637600Oze;
import X.InterfaceC1891350zJl;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class InboxRecommendGroupBannerProtocol extends InboxBannerCustomProtocol {
    public static final /* synthetic */ int LLIZ = 0;
    public final C19719912Dl LLILLL = C13LE.LIZ(InboxRecommendGroupBannerAssem.class);
    public final C637600Oze LLILZ = C637600Oze.LJIIL;
    public final List<C13IQ<? extends InterfaceC1891350zJl>> LLILZIL = Collections.singletonList(C13LE.LIZ(C1421950n6f.class));
    public final List<C13IQ<? extends RecyclerView.ViewHolder>> LLILZLL = Collections.singletonList(C13LE.LIZ(C1421930n6d.class));

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final C19719912Dl LIZJ() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final C637600Oze LIZLLL() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol
    public final List<C13IQ<? extends InterfaceC1891350zJl>> LJFF() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol
    public final List<C13IQ<? extends RecyclerView.ViewHolder>> LJI() {
        return this.LLILZLL;
    }
}
