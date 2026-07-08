package com.ss.android.ugc.aweme.series.feed.tab.controller;

import X.C1576740r8K;
import X.C19EG;
import X.C690440R6k;
import com.ss.android.ugc.aweme.homepage.ui.slide.AbsTabScrollProfileStrategy;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesTabScrollProfileStrategy extends AbsTabScrollProfileStrategy {
    public boolean LLILZIL;

    @Override // com.ss.android.ugc.aweme.homepage.ui.slide.AbsTabScrollProfileStrategy
    public final boolean LIZ() {
        C1576740r8K c1576740r8KLIZ = C690440R6k.LIZ();
        return c1576740r8KLIZ == null || !c1576740r8KLIZ.LJI;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.InterceptHomeViewPagerProtocol
    public final boolean enable() {
        return LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.slide.IXTabScrollProfileStrategy
    public final boolean zu1() {
        return this.LLILZIL;
    }

    public SeriesTabScrollProfileStrategy(C19EG c19eg) {
        super(c19eg, "Drama");
        this.LLILZIL = true;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.slide.IXTabScrollProfileStrategy
    public final void S50(boolean z) {
        this.LLILZIL = z;
    }
}
