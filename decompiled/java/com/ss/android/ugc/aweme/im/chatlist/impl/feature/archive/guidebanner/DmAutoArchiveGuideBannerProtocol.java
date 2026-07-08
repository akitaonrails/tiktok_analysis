package com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.guidebanner;

import X.C0CYM;
import X.C13IQ;
import X.C13LE;
import X.C1896107bj;
import X.C19212010Ec;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C461720I8s;
import X.C637600Oze;
import X.C888280Yt0;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class DmAutoArchiveGuideBannerProtocol extends InboxBannerCustomProtocol {
    public static final /* synthetic */ int LLIZ = 0;
    public final C637600Oze LLILLL = C637600Oze.LJIILL;
    public final C19719912Dl LLILZ = C13LE.LIZ(DmAutoArchiveGuideBannerAssem.class);
    public final List<C13IQ<C1896107bj>> LLILZIL = Collections.singletonList(C13LE.LIZ(C1896107bj.class));
    public final List<C13IQ<C888280Yt0>> LLILZLL = Collections.singletonList(C13LE.LIZ(C888280Yt0.class));

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final boolean LIZ() {
        if (!C19212010Ec.LIZJ.LJLLLLLL() || !C0CYM.LIZJ.LJIIIIZZ()) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dm_auto_archive_guide_banner_keva:");
        sbLIZ.append(C461720I8s.LIZIZ());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ)).getInt("auto_archive_banner_shown_time", 0) < 1;
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
    public final List<C13IQ<C1896107bj>> LJFF() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol
    public final List<C13IQ<C888280Yt0>> LJI() {
        return this.LLILZLL;
    }
}
