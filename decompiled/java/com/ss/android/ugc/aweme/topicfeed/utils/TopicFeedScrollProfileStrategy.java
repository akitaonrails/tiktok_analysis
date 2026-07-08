package com.ss.android.ugc.aweme.topicfeed.utils;

import X.C1576740r8K;
import X.C19EG;
import X.C690440R6k;
import com.ss.android.ugc.aweme.homepage.ui.slide.AbsTabScrollProfileStrategy;

/* JADX INFO: loaded from: classes25.dex */
public final class TopicFeedScrollProfileStrategy extends AbsTabScrollProfileStrategy {
    public final int LLILZIL;
    public boolean LLILZLL;

    @Override // com.ss.android.ugc.aweme.homepage.ui.slide.AbsTabScrollProfileStrategy
    public final boolean LIZ() {
        C1576740r8K c1576740r8KLIZ = C690440R6k.LIZ();
        return c1576740r8KLIZ == null || !c1576740r8KLIZ.LIZIZ(this.LLILZIL);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.InterceptHomeViewPagerProtocol
    public final boolean enable() {
        return LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.slide.IXTabScrollProfileStrategy
    public final boolean zu1() {
        return this.LLILZLL;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.slide.IXTabScrollProfileStrategy
    public final void S50(boolean z) {
        this.LLILZLL = z;
    }

    public TopicFeedScrollProfileStrategy(int i, C19EG c19eg) {
        super(c19eg, "homepage_topic");
        this.LLILZIL = i;
    }
}
