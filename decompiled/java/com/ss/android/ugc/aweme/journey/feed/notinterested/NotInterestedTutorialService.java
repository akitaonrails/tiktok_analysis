package com.ss.android.ugc.aweme.journey.feed.notinterested;

import X.C0TJ4;
import X.C1620050sGB;
import X.C20684815ws;
import X.C2344009Gk;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.guide.notinterested.INotInterestedTutorialService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.newusermode.INewUserModeService;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* JADX INFO: loaded from: classes13.dex */
public final class NotInterestedTutorialService implements INotInterestedTutorialService {
    public C0TJ4 LIZ;

    @Override // com.ss.android.ugc.aweme.feed.guide.notinterested.INotInterestedTutorialService
    public final void LIZJ() {
        if (this.LIZ != null) {
            C0TJ4.LJII = System.currentTimeMillis();
            C0TJ4.LJ.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.guide.notinterested.INotInterestedTutorialService
    public final void LIZ(WeakReference<IBaseListFragmentPanel> weakReference, WeakReference<C1620050sGB> weakReference2) {
        INewUserModeService iNewUserModeService = (INewUserModeService) PluggableExtentionKt.pluggableSpi$default(INewUserModeService.class, false, false, false, 14, null);
        if (iNewUserModeService != null && iNewUserModeService.LIZIZ()) {
            return;
        }
        this.LIZ = new C0TJ4(weakReference, weakReference2);
    }

    @Override // com.ss.android.ugc.aweme.feed.guide.notinterested.INotInterestedTutorialService
    public final void LIZIZ(int i, Aweme aweme) {
        C1620050sGB c1620050sGB;
        C1620050sGB c1620050sGB2;
        C0TJ4 c0tj4 = this.LIZ;
        if (c0tj4 != null) {
            Keva keva = C0TJ4.LIZLLL;
            if (!keva.getBoolean("has_not_interested_tutorial_shown", false) && C0TJ4.LJII != -1 && C0TJ4.LJIIIIZZ <= 100) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                double d = jCurrentTimeMillis - C0TJ4.LJII;
                C0TJ4.LJII = jCurrentTimeMillis;
                HashSet<Integer> hashSet = C0TJ4.LJ;
                if (!hashSet.contains(Integer.valueOf(i))) {
                    int i2 = C0TJ4.LJIIIIZZ + 1;
                    C0TJ4.LJIIIIZZ = i2;
                    keva.storeInt("total_video_count", i2);
                    if (d > 2000.0d) {
                        hashSet.add(Integer.valueOf(i));
                        C0TJ4.LJFF = 0;
                        return;
                    }
                    if (!keva.getBoolean("has_not_interested_tutorial_shown", false) && C0TJ4.LJFF < C0TJ4.LJI && aweme != null && !aweme.isAd()) {
                        C0TJ4.LJFF++;
                    }
                    if (C0TJ4.LJFF == C0TJ4.LJI - 1 && aweme != null && !aweme.isAd()) {
                        C0TJ4.LJIIIZ = aweme;
                    }
                    if (C0TJ4.LJFF < C0TJ4.LJI || (c1620050sGB = c0tj4.LIZIZ.get()) == null || c1620050sGB.LIZLLL() || (c1620050sGB2 = c0tj4.LIZIZ.get()) == null || c1620050sGB2.LJFF() || c1620050sGB2.LIZIZ() || c1620050sGB2.LIZJ() || aweme == null || aweme.isAd() || keva.getBoolean("has_not_interested_tutorial_shown", false) || c0tj4.LIZJ == null || C0TJ4.LJIIIIZZ >= 100) {
                        return;
                    }
                    IBaseListFragmentPanel iBaseListFragmentPanel = c0tj4.LIZ.get();
                    String groupId = null;
                    if (iBaseListFragmentPanel == null || iBaseListFragmentPanel.getContext() == null) {
                        return;
                    }
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
                    c2344009Gk.LIZJ(C0TJ4.LJIIIIZZ, "vv_cnt");
                    c2344009Gk.LIZJ(C0TJ4.LJI, "skip_cnt");
                    Aweme aweme2 = C0TJ4.LJIIIZ;
                    if (aweme2 != null) {
                        groupId = aweme2.getGroupId();
                    }
                    c2344009Gk.LJIIIIZZ("group_id", groupId);
                    C20684815ws.LJIILLIIL("show_not_interested_tutorial", c2344009Gk.LIZ);
                    IBaseListFragmentPanel iBaseListFragmentPanel2 = c0tj4.LIZ.get();
                    if (iBaseListFragmentPanel2 != null) {
                        iBaseListFragmentPanel2.We();
                    }
                    keva.storeBoolean("has_not_interested_tutorial_shown", true);
                }
            }
        }
    }
}
