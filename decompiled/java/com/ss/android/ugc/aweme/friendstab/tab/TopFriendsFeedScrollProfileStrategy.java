package com.ss.android.ugc.aweme.friendstab.tab;

import X.C1558360qeg;
import X.C1558520qew;
import X.C1576740r8K;
import X.C1589640rT8;
import X.C19EG;
import X.C690440R6k;
import com.ss.android.ugc.aweme.homepage.ui.slide.AbsTabScrollProfileStrategy;
import com.ss.android.ugc.aweme.relation.recuser.helper.IRecSwipeFriendTabDisableScrollProfileHelper;

/* JADX INFO: loaded from: classes25.dex */
public final class TopFriendsFeedScrollProfileStrategy extends AbsTabScrollProfileStrategy {
    public final C19EG LLILZIL;

    @Override // com.ss.android.ugc.aweme.homepage.ui.slide.IXTabScrollProfileStrategy
    public final void S50(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.slide.AbsTabScrollProfileStrategy
    public final boolean LIZ() {
        IRecSwipeFriendTabDisableScrollProfileHelper iRecSwipeFriendTabDisableScrollProfileHelper = (IRecSwipeFriendTabDisableScrollProfileHelper) C1558520qew.LIZ(C1558360qeg.LJI(this.LLILZIL, null), IRecSwipeFriendTabDisableScrollProfileHelper.class, "homepage_friends");
        boolean z = false;
        if (iRecSwipeFriendTabDisableScrollProfileHelper != null && iRecSwipeFriendTabDisableScrollProfileHelper.sw2()) {
            return false;
        }
        C1576740r8K c1576740r8KLIZ = C690440R6k.LIZ();
        if (c1576740r8KLIZ != null && c1576740r8KLIZ.LIZJ) {
            z = true;
        }
        return !z;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.slide.IXTabScrollProfileStrategy
    public final boolean zu1() {
        return C1589640rT8.LIZIZ.LLLLLLL();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.InterceptHomeViewPagerProtocol
    public final boolean enable() {
        return LIZJ();
    }

    public TopFriendsFeedScrollProfileStrategy(C19EG c19eg) {
        super(c19eg, "FRIENDS_FEED");
        this.LLILZIL = c19eg;
    }
}
