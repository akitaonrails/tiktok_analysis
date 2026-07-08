package com.ss.android.ugc.aweme.feed.ui.foryoutab;

import X.C01GW;
import X.C0BU8;
import X.C0S1A;
import X.C0SQJ;
import X.C1017070cZd;
import X.C1017410caB;
import X.C1570630qyT;
import X.C1576740r8K;
import X.C19EG;
import X.C426750GoL;
import X.C452501pT;
import X.C497820Jfg;
import X.C690440R6k;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.slide.IMainPageSlide;
import com.ss.android.ugc.aweme.homepage.ui.slide.AbsTabScrollProfileStrategy;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class ForYouTabScrollProfileStrategy extends AbsTabScrollProfileStrategy {
    public final C19EG LLILZIL;
    public boolean LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;

    @Override // com.ss.android.ugc.aweme.homepage.ui.slide.AbsTabScrollProfileStrategy
    public final boolean LIZ() {
        C1576740r8K c1576740r8KLIZ = C690440R6k.LIZ();
        return c1576740r8KLIZ == null || !c1576740r8KLIZ.LIZ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.InterceptHomeViewPagerProtocol
    public final boolean enable() {
        return LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.slide.IXTabScrollProfileStrategy
    public final boolean zu1() {
        return this.LLILZLL;
    }

    public ForYouTabScrollProfileStrategy(C19EG c19eg) {
        super(c19eg, "For You");
        this.LLILZIL = c19eg;
        this.LLIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 424));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 421));
        this.LLJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(146));
        this.LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 422));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 423));
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.slide.IXTabScrollProfileStrategy
    public final void S50(boolean z) {
        this.LLILZLL = z;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.slide.AbsTabScrollProfileStrategy
    public final boolean LIZLLL(int i, int i2) {
        Aweme awemeLJIIIIZZ;
        C1017410caB c1017410caBLIZIZ;
        boolean z;
        boolean zLIZLLL;
        C1017410caB c1017410caBLIZIZ2;
        MainBusinessAbility mainBusinessAbility = (MainBusinessAbility) this.LLIZ.getValue();
        if (mainBusinessAbility != null) {
            awemeLJIIIIZZ = mainBusinessAbility.LJIIIIZZ();
        } else {
            awemeLJIIIIZZ = null;
        }
        if (C0BU8.LIZ() == 2) {
            IMainPageSlide iMainPageSlide = (IMainPageSlide) this.LLJ.getValue();
            if (iMainPageSlide != null && (c1017410caBLIZIZ2 = iMainPageSlide.LIZIZ(awemeLJIIIIZZ)) != null && c1017410caBLIZIZ2.LIZ) {
                z = true;
            } else {
                z = false;
            }
            if (awemeLJIIIIZZ != null) {
                if (awemeLJIIIIZZ.getAwemeType() != 150) {
                    awemeLJIIIIZZ.getAwemeType();
                }
                AwemeRawAd awemeRawAd = awemeLJIIIIZZ.getAwemeRawAd();
                if (awemeRawAd != null) {
                    awemeRawAd.isEnableLeftSlideGuide();
                }
            }
            HomeTabAbility homeTabAbility = (HomeTabAbility) this.LLJI.getValue();
            if (homeTabAbility != null && homeTabAbility.qM1() && C0S1A.LIZIZ()) {
                if (!z) {
                    if (C1017070cZd.LJJLIIIJ(awemeLJIIIIZZ)) {
                        return false;
                    }
                } else if (awemeLJIIIIZZ == null || !AwemeExtKt.isPhotoMode(awemeLJIIIIZZ)) {
                    zLIZLLL = C0S1A.LIZ(i, C497820Jfg.LIZIZ(this.LLILZIL), C426750GoL.LIZLLL(this.LLILZIL));
                }
                zLIZLLL = super.LIZLLL(i, i2);
            } else {
                zLIZLLL = super.LIZLLL(i, i2);
            }
            if (!zLIZLLL) {
                return zLIZLLL;
            }
            if (z && (awemeLJIIIIZZ == null || !C1017070cZd.LLIIL(awemeLJIIIIZZ))) {
                return zLIZLLL;
            }
            HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) this.LLJIJIL.getValue();
            if (homeViewPagerAbility != null) {
                homeViewPagerAbility.LLIFFJFJJ(false);
            }
            return false;
        }
        C0SQJ.LIZ(awemeLJIIIIZZ);
        HomeTabAbility homeTabAbility2 = (HomeTabAbility) this.LLJI.getValue();
        if (homeTabAbility2 != null && homeTabAbility2.qM1() && C0S1A.LIZIZ()) {
            IMainPageSlide iMainPageSlide2 = (IMainPageSlide) this.LLJ.getValue();
            if (iMainPageSlide2 != null && (c1017410caBLIZIZ = iMainPageSlide2.LIZIZ(awemeLJIIIIZZ)) != null && !c1017410caBLIZIZ.LIZ) {
                if (C1017070cZd.LJJLIIIJ(awemeLJIIIIZZ)) {
                    return false;
                }
            } else if (awemeLJIIIIZZ == null || !AwemeExtKt.isPhotoMode(awemeLJIIIIZZ)) {
                return C0S1A.LIZ(i, C497820Jfg.LIZIZ(this.LLILZIL), C426750GoL.LIZLLL(this.LLILZIL));
            }
        }
        return super.LIZLLL(i, i2);
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.slide.AbsTabScrollProfileStrategy, com.bytedance.tiktok.homepage.mainfragment.InterceptHomeViewPagerProtocol
    public final boolean LY1(float f, float f2, boolean z) {
        if (C0BU8.LIZ() == 2) {
            if (!LIZJ() || this.LLILZLL || !LIZ()) {
                return false;
            }
            int i = (int) f;
            int i2 = (int) f2;
            C19EG c19eg = this.LLILLJJLI;
            boolean zLIZLLL = C426750GoL.LIZLLL(c19eg);
            if (zLIZLLL != AbsTabScrollProfileStrategy.LLILLL) {
                AbsTabScrollProfileStrategy.LLILLL = zLIZLLL;
                C1570630qyT.LIZ(c19eg);
            }
            return LIZLLL(i, i2);
        }
        return super.LY1(f, f2, z);
    }
}
