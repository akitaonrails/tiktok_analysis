package com.ss.android.ugc.aweme.commercialize.profile.impl.ad;

import X.AbstractC207072161e;
import X.C13LE;
import X.C2097908Jt;
import X.C2805016t;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class ProfileFeedAdsPageWatchEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public ProfileFeedAdsPageWatchEvent() {
        super("profile_feed_ads_page_watch");
        this.LJII = C2097908Jt.LIZJ(new Pair("count", new C2805016t(true, AbstractC207072161e.LIZIZ(C13LE.LIZ(Integer.TYPE)), AbstractC207072161e.LJ("{}", "ordinary"), false)));
    }

    @Override // X.AbstractC207072161e
    public final Map<String, C2805016t> LIZJ() {
        return this.LJII;
    }

    @Override // X.AbstractC207072161e
    public final AbstractC207072161e LJII(InterfaceC1282004zy interfaceC1282004zy) {
        LIZ().add(interfaceC1282004zy);
        return this;
    }
}
