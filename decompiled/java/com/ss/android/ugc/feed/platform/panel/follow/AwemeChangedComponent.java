package com.ss.android.ugc.feed.platform.panel.follow;

import X.C0VNC;
import X.C0XQ7;
import X.C1595060rbs;
import X.C1615490s8p;
import X.C1615510s8r;
import X.C19EG;
import X.C724240Sb0;
import X.C740740T3w;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.service.IFollowReadService;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;

/* JADX INFO: loaded from: classes25.dex */
public final class AwemeChangedComponent extends BasePanelComponent {
    public C19EG LL;
    public Observer<Aweme> LLILLJJLI;
    public boolean LLILLL = true;

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        IDetailFeedSafService iDetailFeedSafService;
        Fragment fragmentLIZLLL;
        super.onCreate();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        this.LL = c19egLIZ;
        Fragment fragment = getPanelContext().LJ;
        this.LLILLJJLI = (fragment == null || (iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null)) == null || (fragmentLIZLLL = iDetailFeedSafService.LIZLLL(fragment)) == null) ? C740740T3w.LIZJ(c19egLIZ, this, new C1615510s8r(this)) : C740740T3w.LIZLLL(fragmentLIZLLL, this, new C1615490s8p(this));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        Observer<Aweme> observer;
        IDetailFeedSafService iDetailFeedSafService;
        Fragment fragmentLIZLLL;
        super.onDestroy();
        C19EG c19egLIZ = this.LL;
        if ((c19egLIZ == null && (c19egLIZ = C724240Sb0.LIZ(this)) == null) || (observer = this.LLILLJJLI) == null) {
            return;
        }
        Fragment fragment = getPanelContext().LJ;
        if (fragment == null || (iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null)) == null || (fragmentLIZLLL = iDetailFeedSafService.LIZLLL(fragment)) == null) {
            C740740T3w.LJIIIZ(c19egLIZ, observer);
        } else {
            C740740T3w.LJIIIIZZ(fragmentLIZLLL, observer);
        }
    }

    public final void bo(Aweme aweme) {
        String aid;
        long j;
        if (aweme == null || (aid = aweme.getAid()) == null || !TextUtils.isDigitsOnly(aid)) {
            return;
        }
        C1595060rbs.LIZIZ.LJ(aid);
        String curUserId = C0XQ7.LJFF().getCurUserId();
        if (curUserId == null) {
            return;
        }
        IFollowReadService iFollowReadService = (IFollowReadService) PluggableExtentionKt.pluggableSpi$default(IFollowReadService.class, false, false, false, 14, null);
        if (iFollowReadService != null) {
            C0VNC c0vnc = new C0VNC(0, System.currentTimeMillis(), aweme.getAwemeType(), aid, curUserId);
            if (this.LLILLL) {
                j = 2000;
            } else {
                j = 0;
            }
            iFollowReadService.LIZIZ(c0vnc, j);
        }
        this.LLILLL = false;
    }
}
