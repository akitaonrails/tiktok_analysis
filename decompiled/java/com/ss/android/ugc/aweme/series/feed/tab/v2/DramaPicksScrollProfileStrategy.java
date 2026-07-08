package com.ss.android.ugc.aweme.series.feed.tab.v2;

import X.C1576740r8K;
import X.C19EG;
import X.C690440R6k;
import com.ss.android.ugc.aweme.homepage.ui.slide.AbsTabScrollProfileStrategy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class DramaPicksScrollProfileStrategy extends AbsTabScrollProfileStrategy {
    public final Function0<Boolean> LLILZIL;
    public boolean LLILZLL;

    @Override // com.ss.android.ugc.aweme.homepage.ui.slide.AbsTabScrollProfileStrategy
    public final boolean LIZ() {
        C1576740r8K c1576740r8KLIZ = C690440R6k.LIZ();
        return c1576740r8KLIZ == null || !c1576740r8KLIZ.LJI;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.InterceptHomeViewPagerProtocol
    public final boolean enable() {
        return LIZJ() && this.LLILZIL.invoke().booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.slide.IXTabScrollProfileStrategy
    public final boolean zu1() {
        return this.LLILZLL;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.slide.IXTabScrollProfileStrategy
    public final void S50(boolean z) {
        this.LLILZLL = z;
    }

    public DramaPicksScrollProfileStrategy(C19EG c19eg, AwS568S0100000_24 awS568S0100000_24) {
        super(c19eg, "Drama");
        this.LLILZIL = awS568S0100000_24;
        this.LLILZLL = true;
    }
}
