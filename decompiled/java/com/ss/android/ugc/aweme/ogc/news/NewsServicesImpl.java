package com.ss.android.ugc.aweme.ogc.news;

import X.C01GW;
import X.C1168080gVC;
import X.C1697810uHb;
import X.C19513511Wb;
import X.C19605811nE;
import X.C19605911nF;
import X.C19606011nG;
import X.C19640311sn;
import X.C452501pT;
import X.C613010O2p;
import com.bytedance.router.interceptor.IInterceptor;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class NewsServicesImpl implements INewsService {
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C19605911nF());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C19605811nE());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C19606011nG());
    public final C01GW LJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(102));
    public final ArrayList<NewsRouterInterceptor> LJFF = C1697810uHb.LJ(new NewsRouterInterceptor());

    @Override // com.ss.android.ugc.aweme.ogc.news.INewsService
    public final C1168080gVC LIZ() {
        return (C1168080gVC) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ogc.news.INewsService
    public final C19640311sn LIZJ() {
        return (C19640311sn) this.LJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ogc.news.INewsService
    public final C19513511Wb LIZLLL() {
        return (C19513511Wb) this.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ogc.news.INewsService
    public final C613010O2p LJ() {
        return (C613010O2p) this.LIZLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ogc.news.INewsService
    public final List<IInterceptor> LIZIZ() {
        return this.LJFF;
    }
}
