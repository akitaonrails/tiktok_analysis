package com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.agegraduation;

import X.C13IQ;
import X.C13LE;
import X.C15558067g;
import X.C1903830zdt;
import X.C19719912Dl;
import X.C342440Dbe;
import X.C637600Oze;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GraduationBannerProtocol extends InboxBannerCustomProtocol {
    public final C637600Oze LLILLL = C637600Oze.LIZJ;
    public final C19719912Dl LLILZ = C13LE.LIZ(AgeGraduationBannerAssem.class);
    public final List<C13IQ<C15558067g>> LLILZIL = Collections.singletonList(C13LE.LIZ(C15558067g.class));
    public final List<C13IQ<C1903830zdt>> LLILZLL = Collections.singletonList(C13LE.LIZ(C1903830zdt.class));

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final boolean LIZ() {
        C342440Dbe.LIZ.getClass();
        return C342440Dbe.LIZIZ();
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
    public final List<C13IQ<C15558067g>> LJFF() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol
    public final List<C13IQ<C1903830zdt>> LJI() {
        return this.LLILZLL;
    }
}
