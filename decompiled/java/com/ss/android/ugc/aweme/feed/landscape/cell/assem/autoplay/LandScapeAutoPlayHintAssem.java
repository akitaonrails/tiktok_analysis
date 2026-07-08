package com.ss.android.ugc.aweme.feed.landscape.cell.assem.autoplay;

import X.C01GW;
import X.C0QBT;
import X.C13LE;
import X.C14EU;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C2217381BqS;
import X.C2248751Czx;
import X.C452501pT;
import X.C722910SXh;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.LandscapePanelStateViewModel;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.ability.LandscapeFeedAutoPlayAbility;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.ability.LandscapeGestureConsumeProtocol;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandScapeFeedIntroAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeProfilePanelAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes12.dex */
public final class LandScapeAutoPlayHintAssem extends BaseCellSlotComponent<LandScapeAutoPlayHintAssem> implements LandscapeFeedAutoPlayAbility, InterfaceC1554640qYg {
    public Aweme LLJLLIL;
    public int LLJLLL;
    public TuxTextView LLJZ;
    public RelativeLayout LLJZIJLIL;
    public volatile int LLL;
    public final C01GW LLLF = C737910Sx3.LIZJ(this, C13LE.LIZ(LandscapePanelStateViewModel.class), AFwS243S0000000_11.get$arr$(185));
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS555S0100000_11(this, 389));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.d07;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 49691396) {
            return null;
        }
        return this;
    }

    public final boolean Bp() {
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility;
        if (this.LLL > 0) {
            return false;
        }
        LandscapeProfilePanelAbility landscapeProfilePanelAbility = (LandscapeProfilePanelAbility) this.LLLFF.getValue();
        if ((landscapeProfilePanelAbility != null && landscapeProfilePanelAbility.LJJII()) || (landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandscapeFeedViewPagerAbility.class, null)) == null || landscapeFeedViewPagerAbility.F() == null) {
            return false;
        }
        LandScapeFeedIntroAbility landScapeFeedIntroAbility = (LandScapeFeedIntroAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandScapeFeedIntroAbility.class, null);
        return landScapeFeedIntroAbility == null || !landScapeFeedIntroAbility.gq2();
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.cell.assem.ability.LandscapeFeedAutoPlayAbility
    public final void Yu1() {
        this.LLL++;
        RelativeLayout relativeLayout = this.LLJZIJLIL;
        if (relativeLayout != null) {
            C786410Ut5.LLIIL(relativeLayout, 8);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.cell.assem.ability.LandscapeFeedAutoPlayAbility
    public final void ic1() {
        this.LLL--;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @C14EU
    public final void onPlayerControllerVideoPlayProgressChange(C2248751Czx c2248751Czx) {
        String aid;
        Aweme aweme = this.LLJLLIL;
        String aid2 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        Aweme aweme2 = c2248751Czx.LIZ;
        if (aweme2 != null) {
            aid2 = aweme2.getAid();
        }
        if (!Intrinsics.LJFF(aid, aid2) || !Bp()) {
            return;
        }
        float f = c2248751Czx.LIZJ;
        int i = this.LLJLLL;
        int i2 = i - ((int) ((f * i) / 100));
        if (1 <= i2 && i2 < 6) {
            RelativeLayout relativeLayout = this.LLJZIJLIL;
            if (relativeLayout != null) {
                C786410Ut5.LLIIL(relativeLayout, 0);
            }
            TuxTextView tuxTextView = this.LLJZ;
            if (tuxTextView != null) {
                tuxTextView.setText(LJJIJL().getContext().getResources().getQuantityString(2131755396, i2, Integer.valueOf(i2)));
                return;
            }
            return;
        }
        RelativeLayout relativeLayout2 = this.LLJZIJLIL;
        if (relativeLayout2 == null) {
            return;
        }
        C786410Ut5.LLIIL(relativeLayout2, 8);
    }

    @C14EU
    public final void onPlayerControllerVideoStatusEvent(C722910SXh c722910SXh) {
        String aid;
        String aid2;
        String aid3;
        String aid4;
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility;
        int iLJLLJ;
        Aweme aweme = this.LLJLLIL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        Aweme aweme2 = c722910SXh.LIZ;
        if (aweme2 != null) {
            aid2 = aweme2.getAid();
        } else {
            aid2 = null;
        }
        if (Intrinsics.LJFF(aid, aid2) && c722910SXh.LIZJ == 3) {
            Aweme aweme3 = c722910SXh.LIZ;
            if (aweme3 != null) {
                aid3 = aweme3.getAid();
            } else {
                aid3 = null;
            }
            Aweme aweme4 = this.LLJLLIL;
            if (aweme4 != null) {
                aid4 = aweme4.getAid();
            } else {
                aid4 = null;
            }
            if (Intrinsics.LJFF(aid3, aid4) && Bp() && (landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandscapeFeedViewPagerAbility.class, null)) != null && (iLJLLJ = landscapeFeedViewPagerAbility.LJLLJ()) != -1) {
                RelativeLayout relativeLayout = this.LLJZIJLIL;
                if (relativeLayout != null) {
                    C786410Ut5.LLIIL(relativeLayout, 8);
                }
                LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility2 = (LandscapeFeedViewPagerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandscapeFeedViewPagerAbility.class, null);
                if (landscapeFeedViewPagerAbility2 != null) {
                    landscapeFeedViewPagerAbility2.to(iLJLLJ + 1);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJZ = (TuxTextView) view.findViewById(R.id.be4);
        this.LLJZIJLIL = (RelativeLayout) view.findViewById(R.id.be5);
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), LandscapeGestureConsumeProtocol.class, C1697810uHb.LJIILJJIL(new LandscapeGestureConsumeProtocol() { // from class: com.ss.android.ugc.aweme.feed.landscape.cell.assem.autoplay.LandScapeAutoPlayHintAssem.onViewCreated.1
        }));
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandscapeFeedViewPagerAbility.class, null);
        if (landscapeFeedViewPagerAbility != null) {
            landscapeFeedViewPagerAbility.bY0(this, new AwS625S0100000_11(this, 31));
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0SHD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C692820RFo) obj).LL;
            }
        }, null, AFwS294S0000000_11.get$arr$(80), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(VideoItemParams videoItemParams) {
        int duration;
        Video video;
        Aweme aweme = videoItemParams.getAweme();
        this.LLJLLIL = aweme;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            duration = video.getDuration();
        } else {
            duration = 0;
        }
        this.LLJLLL = C0QBT.LIZJ(duration);
    }
}
