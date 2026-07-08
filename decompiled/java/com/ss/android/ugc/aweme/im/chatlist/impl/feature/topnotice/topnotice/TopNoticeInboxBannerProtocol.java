package com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.topnotice;

import X.C13IQ;
import X.C13LE;
import X.C1697810uHb;
import X.C1874120yry;
import X.C1874130yrz;
import X.C1874140ys0;
import X.C1874150ys1;
import X.C1880890z2t;
import X.C1880910z2v;
import X.C1884020z7w;
import X.C19719912Dl;
import X.C637600Oze;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class TopNoticeInboxBannerProtocol extends InboxBannerCustomProtocol {
    public final C637600Oze LLILLL = C637600Oze.LJII;
    public final C19719912Dl LLILZ = C13LE.LIZ(TopNoticeInboxBannerAssem.class);
    public final List<C13IQ<? extends C1874120yry>> LLILZIL = C1697810uHb.LJIIJJI(C13LE.LIZ(C1874130yrz.class), C13LE.LIZ(C1874140ys0.class), C13LE.LIZ(C1874150ys1.class));
    public final List<C13IQ<? extends RecyclerView.ViewHolder>> LLILZLL = C1697810uHb.LJIIJJI(C13LE.LIZ(C1880890z2t.class), C13LE.LIZ(C1880910z2v.class), C13LE.LIZ(C1884020z7w.class));

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final C19719912Dl LIZJ() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final C637600Oze LIZLLL() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol
    public final List<C13IQ<? extends C1874120yry>> LJFF() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol
    public final List<C13IQ<? extends RecyclerView.ViewHolder>> LJI() {
        return this.LLILZLL;
    }
}
