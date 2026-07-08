package com.ss.android.ugc.feed.platform.tablet;

import X.AbstractC1604130rqV;
import X.AbstractC726740Sf2;
import X.C01GW;
import X.C0R7C;
import X.C1558520qew;
import X.C1616490sAR;
import X.C1619980sG4;
import X.C19252910Tv;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C452501pT;
import X.C628500Oky;
import X.C724270Sb3;
import X.C735370Ssx;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC583650Mup;
import X.InterfaceC690260R5s;
import X.ViewOnLayoutChangeListenerC738740SyO;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.tablet.api.helper.feed.fakelandscape.TabletFakeLandscapeAbility;
import com.ss.android.ugc.aweme.tablet.api.helper.feed.shrink.RotateLandscapeVideoShrinkAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.clean.ICellCleanAbility;
import com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class RotateLandscapeVideoShrinkComponent extends BaseCellContentComponent<RotateLandscapeVideoShrinkComponent> implements RotateLandscapeVideoShrinkAbility, InterfaceC1554640qYg {
    public AbstractC726740Sf2 LLJJL;
    public final ValueAnimator LLJLL;
    public int LLJLLIL;
    public float LLJLLL;
    public final C01GW LLJJJJLIIL = C452501pT.LIZ(EnumC452301pR.NONE, AFwS198S0000000_11.get$arr$(271));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1308));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1305));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1304));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1307));

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1941653833) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.tablet.api.helper.feed.shrink.RotateLandscapeVideoShrinkAbility
    public final void B4() {
        InterfaceC583650Mup interfaceC583650MupX3;
        View videoView;
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (iVideoCellAbility == null || (interfaceC583650MupX3 = iVideoCellAbility.x3()) == null || (videoView = interfaceC583650MupX3.getVideoView()) == null) {
            return;
        }
        videoView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC738740SyO(this, 7));
    }

    @Override // com.ss.android.ugc.aweme.tablet.api.helper.feed.shrink.RotateLandscapeVideoShrinkAbility
    public final void LJJLIIIIJ() {
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJIJI().LLJJJJ().LJIIIZ()) {
            IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
            InterfaceC583650Mup interfaceC583650MupX3 = iVideoCellAbility != null ? iVideoCellAbility.x3() : null;
            IVideoCellAbility iVideoCellAbility2 = (IVideoCellAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
            View viewVy1 = iVideoCellAbility2 != null ? iVideoCellAbility2.Vy1() : null;
            if (interfaceC583650MupX3 == null) {
                AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LLJJJJLIIL.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("feedPlayerView null ");
                C724270Sb3 c724270Sb3 = this.LLJI;
                sbLIZ.append(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid());
                abstractC1604130rqV.LJIILL(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                ep();
                InterfaceC690260R5s interfaceC690260R5sLLILLIZIL = c19252910Tv.LIZLLL().LJIJI().LLILLIZIL();
                C724270Sb3 c724270Sb32 = this.LLJI;
                this.LLJJL = interfaceC690260R5sLLILLIZIL.LLLLIILL(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme(), interfaceC583650MupX3.getVideoView(), viewVy1, interfaceC583650MupX3.zt1());
            }
            if (this.LLJLLIL == 1) {
                return;
            }
            ep();
            hp(this, false, true, 4);
            this.LLJLLIL = 1;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        C0R7C c0r7cLLJJJJ = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLJJJJ();
        Activity activityLJFF = C2214201BlK.LJFF();
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c0r7cLLJJJJ.LIZ(activityLJFF, C1616490sAR.LIZ(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme()))) {
            ep();
            ((AbstractC1604130rqV) this.LLJJJJLIIL.getValue()).LJIIIZ("onHolderUnselected");
        }
    }

    public final void ep() {
        AbstractC726740Sf2 abstractC726740Sf2 = this.LLJJL;
        if (abstractC726740Sf2 != null) {
            View view = abstractC726740Sf2.LIZ;
            if (view != null) {
                C786410Ut5.Ob(view, abstractC726740Sf2.LIZLLL);
                C786410Ut5.pc(view, abstractC726740Sf2.LJ);
                C786410Ut5.Jc(view, abstractC726740Sf2.LIZ());
                C786410Ut5.ed(view, ((Number) abstractC726740Sf2.LJI.getValue()).floatValue());
            }
            View view2 = abstractC726740Sf2.LIZIZ;
            if (view2 != null) {
                C786410Ut5.Ob(view2, abstractC726740Sf2.LIZLLL);
                C786410Ut5.pc(view2, abstractC726740Sf2.LJ);
                C786410Ut5.Jc(view2, abstractC726740Sf2.LIZ());
                C786410Ut5.ed(view2, ((Number) abstractC726740Sf2.LJI.getValue()).floatValue());
            }
        }
    }

    public RotateLandscapeVideoShrinkComponent() {
        C628500Oky.LIZ(new AwS555S0100000_11(this, 1306));
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(100L);
        valueAnimator.setInterpolator(C1619980sG4.LIZLLL());
        this.LLJLL = valueAnimator;
        this.LLJLLIL = 1;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    public final boolean ip(Aweme aweme) {
        if (!C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLJJJJ().LIZ(C2214201BlK.LJFF(), C1616490sAR.LIZ(aweme))) {
            return false;
        }
        return C1616490sAR.LIZ(aweme);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        InterfaceC583650Mup interfaceC583650MupX3;
        VideoItemParams videoItemParams2 = videoItemParams;
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        View viewVy1 = null;
        if (iVideoCellAbility != null) {
            interfaceC583650MupX3 = iVideoCellAbility.x3();
        } else {
            interfaceC583650MupX3 = null;
        }
        IVideoCellAbility iVideoCellAbility2 = (IVideoCellAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (iVideoCellAbility2 != null) {
            viewVy1 = iVideoCellAbility2.Vy1();
        }
        if (interfaceC583650MupX3 == null) {
            AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LLJJJJLIIL.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("feedPlayerView null ");
            sbLIZ.append(videoItemParams2.getAweme().getAid());
            abstractC1604130rqV.LJIILL(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        Aweme aweme = videoItemParams2.getAweme();
        if (aweme == null) {
            return;
        }
        this.LLJJL = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLILLIZIL().LLLLIILL(aweme, interfaceC583650MupX3.getVideoView(), viewVy1, interfaceC583650MupX3.zt1());
    }

    @Override // com.ss.android.ugc.aweme.tablet.api.helper.feed.shrink.RotateLandscapeVideoShrinkAbility
    public final void O42(float f, float f2) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        if (!ip(aweme) || !C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLJJJJ().LIZ(C2214201BlK.LJFF(), C1616490sAR.LIZ(aweme)) || f2 <= 0.0f) {
            return;
        }
        TabletFakeLandscapeAbility tabletFakeLandscapeAbility = (TabletFakeLandscapeAbility) this.LLJLILLLLZIIL.getValue();
        if (tabletFakeLandscapeAbility != null) {
            tabletFakeLandscapeAbility.NA1();
        }
        AbstractC726740Sf2 abstractC726740Sf2 = this.LLJJL;
        if (abstractC726740Sf2 != null) {
            abstractC726740Sf2.LIZIZ(f, f2);
        }
        if (f > 0.0f && f == f2) {
            this.LLJLLL = f;
        }
    }

    @Override // com.ss.android.ugc.aweme.tablet.api.helper.feed.shrink.RotateLandscapeVideoShrinkAbility
    public final void lc2(int i, int i2) {
        Object obj;
        Object obj2;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj3 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (ip(((VideoItemParams) obj).getAweme())) {
            C0R7C c0r7cLLJJJJ = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLJJJJ();
            Activity activityLJFF = C2214201BlK.LJFF();
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            if (c0r7cLLJJJJ.LIZ(activityLJFF, C1616490sAR.LIZ(((VideoItemParams) obj2).getAweme()))) {
                C724270Sb3 c724270Sb33 = this.LLJI;
                if (c724270Sb33 != null) {
                    obj3 = c724270Sb33.LL;
                }
                C735370Ssx.LJJIJIL(((VideoItemParams) obj3).getAweme());
                AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LLJJJJLIIL.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[onSideSheetStateChanged] ");
                sbLIZ.append(i);
                sbLIZ.append(' ');
                sbLIZ.append(i2);
                abstractC1604130rqV.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
                if (i2 == 1) {
                    ep();
                    hp(this, false, true, 4);
                }
                if (i == 2) {
                    if (i2 == 4) {
                        hp(this, false, false, 6);
                    }
                } else if (i2 == 3) {
                    hp(this, true, false, 2);
                }
                this.LLJLLIL = i2;
            }
        }
    }

    public static void hp(RotateLandscapeVideoShrinkComponent rotateLandscapeVideoShrinkComponent, boolean z, boolean z2, int i) {
        boolean z3 = z2;
        if ((i & 2) != 0) {
            z3 = false;
        }
        ValueAnimator valueAnimatorClone = rotateLandscapeVideoShrinkComponent.LLJLL.clone();
        valueAnimatorClone.setStartDelay(0L);
        ICellCleanAbility iCellCleanAbility = (ICellCleanAbility) rotateLandscapeVideoShrinkComponent.LLJLIL.getValue();
        if (iCellCleanAbility != null) {
            iCellCleanAbility.Xk(valueAnimatorClone, "rotate_shrink", z, true, true, z3);
        }
        IFeedCleanAbility iFeedCleanAbility = (IFeedCleanAbility) rotateLandscapeVideoShrinkComponent.LLJL.getValue();
        if (iFeedCleanAbility != null) {
            iFeedCleanAbility.Xk(valueAnimatorClone, "rotate_shrink", z, z3, true, false);
        }
        AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) rotateLandscapeVideoShrinkComponent.LLJJJJLIIL.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[toggleClean] ");
        sbLIZ.append(z);
        sbLIZ.append(" immediately: ");
        sbLIZ.append(z3);
        abstractC1604130rqV.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
    }
}
