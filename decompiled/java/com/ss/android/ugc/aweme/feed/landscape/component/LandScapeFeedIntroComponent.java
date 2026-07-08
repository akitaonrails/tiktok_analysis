package com.ss.android.ugc.aweme.feed.landscape.component;

import X.C0QBT;
import X.C0RJN;
import X.C0SHX;
import X.C0SXF;
import X.C1303280k1G;
import X.C14EU;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1620050sGB;
import X.C1697810uHb;
import X.C19EG;
import X.C20684815ws;
import X.C2189821An6;
import X.C2248751Czx;
import X.C2344009Gk;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import Y.ATListenerS445S0100000_11;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.ability.LandscapeGestureConsumeProtocol;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandScapeFeedIntroAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes12.dex */
public final class LandScapeFeedIntroComponent extends UISlotAssem implements LandScapeFeedIntroAbility, InterfaceC1554640qYg {
    public RelativeLayout LLJJI;
    public C1303280k1G LLJJIII;
    public boolean LLJJIJI;
    public Aweme LLJJIJIIJIL;
    public int LLJJIJIL;
    public final Keva LLJJJ;
    public boolean LLJJJIL;
    public int LLJJJJ;
    public C1620050sGB LLJJJJJIL;
    public volatile int LLJJJJLIIL;
    public VerticalViewPager LLJJL;
    public float LLJJLIIIJLLLLLLLZ;
    public float LLJL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.d0b;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1607372477) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandScapeFeedIntroAbility
    public final void FV0() {
        this.LLJJJJLIIL++;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandScapeFeedIntroAbility
    public final boolean gq2() {
        return this.LLJJIJI || this.LLJJJIL;
    }

    public final void hp() {
        C0RJN c0rjnLIZIZ;
        LogPbBean logPbBean;
        C2344009Gk c2344009Gk = new C2344009Gk();
        Aweme aweme = this.LLJJIJIIJIL;
        C2189821An6 c2189821An6 = null;
        c2344009Gk.LJIIIIZZ("group_id", aweme != null ? aweme.getAid() : null);
        Aweme aweme2 = this.LLJJIJIIJIL;
        c2344009Gk.LJIIIIZZ("author_id", aweme2 != null ? AwemeExtKt.getAuthorUid(aweme2) : null);
        Aweme aweme3 = this.LLJJIJIIJIL;
        c2344009Gk.LJIIIIZZ("request_id", aweme3 != null ? aweme3.getRequestId() : null);
        Aweme aweme4 = this.LLJJIJIIJIL;
        c2344009Gk.LJIIIIZZ("log_pb", (aweme4 == null || (logPbBean = aweme4.getLogPbBean()) == null) ? null : logPbBean.getImprId());
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (c0rjnLIZIZ = C1578630rBN.LIZIZ(fragmentLJI)) != null) {
            c2189821An6 = c0rjnLIZIZ.LIZJ;
        }
        C0SXF.LJFF(c2344009Gk, c2189821An6, this.LLJJIJIIJIL, getContext(), false);
        C20684815ws.LJIILLIIL("landscape_screen_guide_show", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandScapeFeedIntroAbility
    public final void iI() {
        this.LLJJJJLIIL--;
    }

    public LandScapeFeedIntroComponent() {
        Keva repo = Keva.getRepo("keva_repo_landscape_component");
        this.LLJJJ = repo;
        this.LLJJJIL = repo.getBoolean("enable_show_intro", true);
        this.LLJJJJ = -100;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        if (this.LLJJJIL) {
            EventBus.LIZLLL().LJIJJ(this);
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        this.LLJJJJJIL = c19egLIZ != null ? C0SHX.LIZ(c19egLIZ, null) : null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @C14EU
    public final void onPlayerControllerVideoPlayProgressChange(C2248751Czx c2248751Czx) {
        boolean z;
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility;
        int itemCount;
        if (Intrinsics.LJFF(this.LLJJIJIIJIL, c2248751Czx.LIZ) && this.LLJJJIL) {
            int i = this.LLJJIJIL;
            int i2 = i - ((int) ((c2248751Czx.LIZJ * i) / 100));
            if (1 <= i2 && i2 < 6) {
                z = true;
            } else {
                z = false;
            }
            if (z && !this.LLJJIJI && this.LLJJJJLIIL == 0 && (landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandscapeFeedViewPagerAbility.class, null)) != null && (itemCount = landscapeFeedViewPagerAbility.getItemCount()) > 1 && itemCount != this.LLJJJJ + 1) {
                try {
                    RelativeLayout relativeLayout = this.LLJJI;
                    if (relativeLayout != null) {
                        C786410Ut5.LLIIL(relativeLayout, 0);
                    }
                    C1303280k1G c1303280k1G = this.LLJJIII;
                    if (c1303280k1G != null) {
                        c1303280k1G.setAnimation("ds_gestures_swipe_up_landscape_tux_lottie.json");
                        c1303280k1G.setRepeatCount(-1);
                        this.LLJJIJI = true;
                        c1303280k1G.playAnimation();
                    }
                    hp();
                    this.LLJJJIL = false;
                    this.LLJJJ.storeBoolean("enable_show_intro", false);
                    C1620050sGB c1620050sGB = this.LLJJJJJIL;
                    if (c1620050sGB != null) {
                        c1620050sGB.LJIIJ(true);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (i2 < 1) {
                this.LLJJJIL = false;
                this.LLJJJ.storeBoolean("enable_show_intro", false);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Aweme awemeLLLLLJLJLL;
        int iLJLLJ;
        int duration;
        Video video;
        this.LLJJI = (RelativeLayout) view.findViewById(R.id.m5e);
        this.LLJJIII = (C1303280k1G) view.findViewById(R.id.kxg);
        VerticalViewPager verticalViewPagerSP1 = null;
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandscapeFeedViewPagerAbility.class, null);
        if (landscapeFeedViewPagerAbility != null) {
            awemeLLLLLJLJLL = landscapeFeedViewPagerAbility.LLLLLJLJLL();
        } else {
            awemeLLLLLJLJLL = null;
        }
        this.LLJJIJIIJIL = awemeLLLLLJLJLL;
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility2 = (LandscapeFeedViewPagerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandscapeFeedViewPagerAbility.class, null);
        if (landscapeFeedViewPagerAbility2 != null) {
            iLJLLJ = landscapeFeedViewPagerAbility2.LJLLJ();
        } else {
            iLJLLJ = -100;
        }
        this.LLJJJJ = iLJLLJ;
        Aweme aweme = this.LLJJIJIIJIL;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            duration = video.getDuration();
        } else {
            duration = 0;
        }
        this.LLJJIJIL = C0QBT.LIZJ(duration);
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility3 = (LandscapeFeedViewPagerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandscapeFeedViewPagerAbility.class, null);
        if (landscapeFeedViewPagerAbility3 != null) {
            landscapeFeedViewPagerAbility3.bY0(this, new AwS625S0100000_11(this, 33));
        }
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), LandscapeGestureConsumeProtocol.class, C1697810uHb.LJIILJJIL(new LandscapeGestureConsumeProtocol() { // from class: com.ss.android.ugc.aweme.feed.landscape.component.LandScapeFeedIntroComponent.onViewCreated.2
        }));
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility4 = (LandscapeFeedViewPagerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandscapeFeedViewPagerAbility.class, null);
        if (landscapeFeedViewPagerAbility4 != null) {
            verticalViewPagerSP1 = landscapeFeedViewPagerAbility4.sP1();
        }
        this.LLJJL = verticalViewPagerSP1;
        RelativeLayout relativeLayout = this.LLJJI;
        if (relativeLayout != null) {
            relativeLayout.setOnTouchListener(new ATListenerS445S0100000_11(this, 1));
        }
    }
}
