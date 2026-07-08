package com.ss.android.ugc.aweme.mob;

import X.C01GW;
import X.C0RD6;
import X.C0T2S;
import X.C0T2Y;
import X.C0TU8;
import X.C0TU9;
import X.C14EU;
import X.C1566140qrE;
import X.C19EG;
import X.C2037707yZ;
import X.C2189821An6;
import X.C295520BiA;
import X.C299750Boz;
import X.C452501pT;
import X.C630740Ooa;
import X.C722770SWt;
import X.C724240Sb0;
import X.C740740T3w;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import X.InterfaceC743730TFj;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import kotlin.jvm.internal.AwS130S0110000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes13.dex */
public final class ExploreCardPlayAttributionPanelComponent extends BasePanelComponent implements InterfaceC743730TFj {
    public final C01GW LL;
    public Observer<Aweme> LLILLJJLI;
    public boolean LLILLL;
    public final C01GW LLILZ;

    @Override // X.InterfaceC743730TFj
    public final void Bg(Activity activity, Fragment fragment) {
    }

    @Override // X.InterfaceC743730TFj
    public final void L() {
    }

    @Override // X.InterfaceC743730TFj
    public final void LLLZIL() {
    }

    @Override // X.InterfaceC743730TFj
    public final void M1(Configuration configuration) {
    }

    @Override // X.InterfaceC743730TFj
    public final void Mf(Bundle bundle) {
    }

    @Override // X.InterfaceC743730TFj
    public final void Re(Bundle bundle) {
    }

    @Override // X.InterfaceC743730TFj
    public final void Tg() {
    }

    @Override // X.InterfaceC743730TFj
    public final void fl() {
    }

    @Override // X.InterfaceC743730TFj
    public final void w4() {
    }

    public final C0T2S bo() {
        return (C0T2S) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC743730TFj
    public final void dd() {
        if (this.LLILLL) {
            EventBus.LIZLLL().LJJI(this);
            this.LLILLL = false;
        }
    }

    public ExploreCardPlayAttributionPanelComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS556S0100000_12((InterfaceC1565950qqv) this, 521), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS130S0110000_12(false, (InterfaceC1565950qqv) this, 16));
        }
        this.LL = c01gwLIZIZ;
        this.LLILZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS556S0100000_12(this, 520));
    }

    @Override // X.InterfaceC743730TFj
    public final void M() {
        C0TU9 c0tu9 = bo().LJI;
        if (c0tu9 != null) {
            c0tu9.LJIIIZ();
        }
    }

    @Override // X.InterfaceC743730TFj
    public final void cq() {
        C0T2S c0t2sBo = bo();
        C0TU9 c0tu9 = c0t2sBo.LJI;
        if (c0tu9 != null) {
            if (c0tu9.LIZIZ) {
                c0tu9.LIZLLL();
                if (!c0tu9.LJJIIJ) {
                    c0tu9.LJJIFFI = System.currentTimeMillis();
                }
            }
            c0t2sBo.LIZJ(8);
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final Fragment m270do() {
        IDetailFeedSafService iDetailFeedSafService;
        Fragment fragment = getPanelContext().LJ;
        if (fragment == null || (iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null)) == null) {
            return null;
        }
        return iDetailFeedSafService.LIZLLL(fragment);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        Observer<Aweme> observerLIZJ;
        super.onCreate();
        C0T2Y c0t2y = new C0T2Y() { // from class: X.0T2T
            @Override // X.C0T2Y
            public final void Y3(Aweme aweme) {
                C0TU9 c0tu9;
                C0TUB c0tub;
                C0T2S c0t2sBo = this.LL.bo();
                String strLIZ = C0T2S.LIZ(c0t2sBo.LIZ.invoke(), FollowStatusChangeMethod.PARAM_UID);
                if (strLIZ != null && strLIZ.length() != 0 && aweme != null && !Intrinsics.LJFF(aweme.getAid(), strLIZ) && (c0tu9 = c0t2sBo.LJI) != null && c0tu9.LIZIZ) {
                    if (!c0tu9.LJJIIJ) {
                        if (c0tu9.LJJIFFI > 0) {
                            c0tu9.LJJII += System.currentTimeMillis() - c0tu9.LJJIFFI;
                            c0tu9.LJJIFFI = 0L;
                        }
                        c0tu9.LJJIIJ = true;
                    }
                    if (!c0tu9.LJI && c0tu9.LJIJJ == null) {
                        c0tu9.LIZLLL();
                        if (!c0tu9.LJI) {
                            AwS556S0100000_12 awS556S0100000_12 = c0tu9.LJIJJLI;
                            if (awS556S0100000_12 != null) {
                                c0tub = (C0TUB) awS556S0100000_12.invoke();
                            } else {
                                c0tub = null;
                            }
                            c0tu9.LJIJJ = c0tu9.LIZIZ(false, c0tub);
                        }
                    }
                }
            }
        };
        Fragment fragmentM270do = m270do();
        if (fragmentM270do != null) {
            observerLIZJ = C740740T3w.LIZLLL(fragmentM270do, this, c0t2y);
        } else {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ == null) {
                return;
            } else {
                observerLIZJ = C740740T3w.LIZJ(c19egLIZ, this, c0t2y);
            }
        }
        this.LLILLJJLI = observerLIZJ;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Observer<Aweme> observer = this.LLILLJJLI;
        if (observer != null) {
            Fragment fragmentM270do = m270do();
            if (fragmentM270do != null) {
                C740740T3w.LJIIIIZZ(fragmentM270do, observer);
            } else {
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                if (c19egLIZ != null) {
                    C740740T3w.LJIIIZ(c19egLIZ, observer);
                }
            }
            this.LLILLJJLI = null;
        }
        if (this.LLILLL) {
            EventBus.LIZLLL().LJJI(this);
            this.LLILLL = false;
        }
        C0T2S c0t2sBo = bo();
        C0TU9 c0tu9 = c0t2sBo.LJI;
        if (c0tu9 != null) {
            c0tu9.LJIIIIZZ(c0t2sBo.LIZIZ());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        c0rd6.LIZIZ("event_on_play_failed", new AwS591S0100000_12(this, 635));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDetailVideoCoverTransitionEndEvent(C722770SWt c722770SWt) {
        C0TU9 c0tu9 = bo().LJI;
        if (c0tu9 != null && c0tu9.LIZIZ) {
            c0tu9.LJ = true;
            c0tu9.LJII();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDetailVideoFirstFrameEvent(C2037707yZ c2037707yZ) {
        C0T2S c0t2sBo = bo();
        String str = c2037707yZ.LIZ;
        C0TU9 c0tu9 = c0t2sBo.LJI;
        if (c0tu9 != null && c0tu9.LIZIZ) {
            c0tu9.LJI(str);
        }
        c0t2sBo.LIZJ(8);
    }

    @Override // X.InterfaceC743730TFj
    public final void LLZLLLL(View view, Bundle bundle) {
        C0TU9 c0tu9;
        DetailNavArgModel navArgModel;
        C0T2S c0t2sBo = bo();
        boolean zLJFF = false;
        if (c0t2sBo.LJI == null && C295520BiA.LIZ() && c0t2sBo.LIZ.invoke().getBooleanExtra("from_explore_video_cell", false)) {
            C0TU9.LJJIJIIJI.getClass();
            C0TU8.LIZ(false);
            C0TU9 c0tu92 = new C0TU9();
            c0tu92.LJIIJ(c0t2sBo.LIZIZ());
            c0tu92.LJIJJLI = new AwS556S0100000_12(c0t2sBo, 526);
            c0t2sBo.LJI = c0tu92;
        }
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        if (c2189821An6 != null && (navArgModel = c2189821An6.getNavArgModel()) != null) {
            zLJFF = Intrinsics.LJFF(navArgModel.isThumbnailScaleUp(), Boolean.TRUE);
        }
        if (!zLJFF && (c0tu9 = bo().LJI) != null && c0tu9.LIZIZ) {
            c0tu9.LJ = true;
            c0tu9.LJII();
        }
        if (!this.LLILLL) {
            EventBus.LIZLLL().LJIJJ(this);
            this.LLILLL = true;
        }
    }
}
