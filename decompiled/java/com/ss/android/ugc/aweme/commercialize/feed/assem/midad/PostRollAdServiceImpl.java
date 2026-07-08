package com.ss.android.ugc.aweme.commercialize.feed.assem.midad;

import X.C01GW;
import X.C2245981CvU;
import X.C2245991CvV;
import X.C2246001CvW;
import X.C2246011CvX;
import X.C452501pT;
import com.ss.android.ugc.aweme.ad.feed.midad.IPostRollAdService;

/* JADX INFO: loaded from: classes35.dex */
public final class PostRollAdServiceImpl implements IPostRollAdService {
    public final C01GW LIZ = C452501pT.LIZIZ(new C2245981CvU());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C2246011CvX());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C2246001CvW());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C2245991CvV());

    @Override // com.ss.android.ugc.aweme.ad.feed.midad.IPostRollAdService
    public final boolean LIZ() {
        return ((Boolean) this.LIZLLL.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.midad.IPostRollAdService
    public final boolean LIZIZ() {
        return ((Boolean) this.LIZJ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.midad.IPostRollAdService
    public final boolean LIZJ() {
        return ((Boolean) this.LIZIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.midad.IPostRollAdService
    public final boolean LIZLLL() {
        return ((Boolean) this.LIZ.getValue()).booleanValue();
    }
}
