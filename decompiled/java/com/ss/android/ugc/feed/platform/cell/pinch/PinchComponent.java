package com.ss.android.ugc.feed.platform.cell.pinch;

import X.AbstractC1604130rqV;
import X.C01GW;
import X.C0RUJ;
import X.C0SUB;
import X.C0SZ8;
import X.C0TK0;
import X.C1386360mBG;
import X.C1558520qew;
import X.C1A2L;
import X.C1A2M;
import X.C1A2N;
import X.C1A2O;
import X.C1A2P;
import X.C1A2Q;
import X.C1A2R;
import X.C1AF0;
import X.C21651519oP;
import X.C2188811AlT;
import X.C452501pT;
import X.C716990SAn;
import X.C724270Sb3;
import X.EnumC452301pR;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC707080RoQ;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.settings.PinchToClearModeSettings;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.pinch.PinchComponent;
import com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility;
import com.ss.android.ugc.feed.platform.panel.clearmode.IPinchToClearModePanelComponent;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public class PinchComponent extends BaseCellContentComponent<PinchComponent> implements PinchAbility, C0RUJ, InterfaceC1554640qYg {
    public static final /* synthetic */ int LLJZIJLIL = 0;
    public C21651519oP LLJJJJLIIL;
    public C1A2Q LLJJL;
    public View LLJLL;
    public InterfaceC707080RoQ LLJLLIL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new C1A2P(this));
    public final C01GW LLJL = C452501pT.LIZIZ(new C1A2N(this));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new C1A2O(this));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZ(EnumC452301pR.NONE, new C1A2R());
    public final C01GW LLJLLL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(518));
    public final C1A2L LLJZ = new InterfaceC707080RoQ() { // from class: X.1A2L
        @Override // X.InterfaceC707080RoQ
        public final void LJJJIL() {
            PinchComponent pinchComponent = this.LL;
            if (pinchComponent.hp().LJIIJ()) {
                IPinchToClearModePanelComponent iPinchToClearModePanelComponent = (IPinchToClearModePanelComponent) C1558520qew.LIZ(C1558520qew.LJIIL(pinchComponent), IPinchToClearModePanelComponent.class, null);
                Boolean boolValueOf = iPinchToClearModePanelComponent != null ? Boolean.valueOf(iPinchToClearModePanelComponent.Rf0()) : null;
                pinchComponent.ep().LJIIJJI(new C5182020e(boolValueOf, 489));
                C21651519oP c21651519oP = pinchComponent.LLJJJJLIIL;
                if (c21651519oP != null) {
                    c21651519oP.LJII = !(boolValueOf != null ? boolValueOf.booleanValue() : false);
                }
            }
            this.LL.kp(0L, true, true);
            InterfaceC707080RoQ interfaceC707080RoQ = this.LL.LLJLLIL;
            if (interfaceC707080RoQ != null) {
                interfaceC707080RoQ.LJJJIL();
            }
            this.LL.ep().LJIIJJI(AFwS224S0000000_33.get$arr$(512));
        }

        @Override // X.InterfaceC707080RoQ
        public final void LJZL() {
            PinchComponent pinchComponent = this.LL;
            int i = PinchComponent.LLJZIJLIL;
            pinchComponent.kp(0L, false, true);
            InterfaceC707080RoQ interfaceC707080RoQ = this.LL.LLJLLIL;
            if (interfaceC707080RoQ != null) {
                interfaceC707080RoQ.LJZL();
            }
            this.LL.ep().LJIIJJI(AFwS224S0000000_33.get$arr$(513));
        }

        @Override // X.InterfaceC707080RoQ
        public final void onScaleBegin() {
            InterfaceC707080RoQ interfaceC707080RoQ = this.LL.LLJLLIL;
            if (interfaceC707080RoQ != null) {
                interfaceC707080RoQ.onScaleBegin();
            }
            this.LL.ep().LJIIJJI(AFwS224S0000000_33.get$arr$(515));
        }

        @Override // X.InterfaceC707080RoQ
        public final void onScaleEnd() {
            InterfaceC707080RoQ interfaceC707080RoQ = this.LL.LLJLLIL;
            if (interfaceC707080RoQ != null) {
                interfaceC707080RoQ.onScaleEnd();
            }
            this.LL.ep().LJIIJJI(AFwS224S0000000_33.get$arr$(516));
        }

        @Override // X.InterfaceC707080RoQ
        public final void jl(float f) {
            InterfaceC707080RoQ interfaceC707080RoQ = this.LL.LLJLLIL;
            if (interfaceC707080RoQ != null) {
                interfaceC707080RoQ.jl(f);
            }
            this.LL.hp().LIZ();
            this.LL.ep().LJIIJJI(AFwS224S0000000_33.get$arr$(514));
        }

        @Override // X.InterfaceC707080RoQ
        public final void onScale(float f) {
            InterfaceC707080RoQ interfaceC707080RoQ = this.LL.LLJLLIL;
            if (interfaceC707080RoQ != null) {
                interfaceC707080RoQ.onScale(f);
            }
            this.LL.hp().LJIIIZ(f);
        }
    };

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "cell_pinch_component";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.C0RUJ
    public boolean m8() {
        return false;
    }

    public InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1479031592) {
            return null;
        }
        return this;
    }

    public final AbstractC1604130rqV ep() {
        return (AbstractC1604130rqV) this.LLJLILLLLZIIL.getValue();
    }

    public final C1A2M hp() {
        return (C1A2M) this.LLJLLL.getValue();
    }

    public final IVideoCellAbility ip() {
        return (IVideoCellAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // X.C0RUJ
    public final void lj() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        x90((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        ep().LJIIJJI(AFwS224S0000000_33.get$arr$(509));
        if (hp().LJIIIIZZ()) {
            hp().LIZLLL();
            C21651519oP c21651519oP = this.LLJJJJLIIL;
            if (c21651519oP != null) {
                c21651519oP.LIZLLL();
            }
        }
        C21651519oP c21651519oP2 = this.LLJJJJLIIL;
        if (c21651519oP2 != null) {
            try {
                MotionEvent motionEvent = c21651519oP2.LJIILJJIL;
                if (motionEvent != null) {
                    motionEvent.setAction(3);
                    c21651519oP2.LIZJ(motionEvent);
                }
                MotionEvent motionEvent2 = c21651519oP2.LJIILJJIL;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                c21651519oP2.LJIILJJIL = null;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1386360mBG.LIZLLL().LJ(String.valueOf(e.getMessage()));
                C1AF0.LJ(e);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        ep().LJIIJJI(AFwS224S0000000_33.get$arr$(510));
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        ep().LJIIJJI(AFwS224S0000000_33.get$arr$(519));
        C21651519oP c21651519oP = this.LLJJJJLIIL;
        if (c21651519oP != null) {
            if (Intrinsics.LJFF(c21651519oP.LJIILLIIL, this.LLJZ)) {
                c21651519oP.LJIILLIIL = null;
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.pinch.PinchAbility
    public final View.OnTouchListener q5() {
        return this.LLJJL;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        ep().LJIIJJI(AFwS224S0000000_33.get$arr$(508));
        if (hp().LJIIIIZZ()) {
            hp().LIZLLL();
            C21651519oP c21651519oP = this.LLJJJJLIIL;
            if (c21651519oP != null) {
                c21651519oP.LIZLLL();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.1A2Q] */
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        C0SUB c0sub;
        BaseListFragmentPanel baseListFragmentPanelYE;
        C21651519oP c21651519oP;
        ep().LJIIJJI(AFwS224S0000000_33.get$arr$(511));
        Context context = view.getContext();
        boolean zLJIIIIZZ = hp().LJIIIIZZ();
        this.LLJJJJLIIL = new C21651519oP(context, zLJIIIIZZ, zLJIIIIZZ);
        this.LLJJL = new View.OnTouchListener() { // from class: X.1A2Q
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                C21651519oP c21651519oP2 = this.LL.LLJJJJLIIL;
                if (c21651519oP2 != null) {
                    return c21651519oP2.LIZJ(motionEvent);
                }
                return false;
            }
        };
        if (C716990SAn.LIZ() && (c21651519oP = this.LLJJJJLIIL) != null) {
            c21651519oP.LIZLLL = PinchToClearModeSettings.LIZ().minScale;
            c21651519oP.LJ = PinchToClearModeSettings.LIZ().maxScale;
        }
        if (hp().LJIIIIZZ()) {
            C0TK0 c0tk0LIZIZ = hp().LIZIZ();
            C21651519oP c21651519oP2 = this.LLJJJJLIIL;
            if (c21651519oP2 != null) {
                c21651519oP2.LIZLLL = c0tk0LIZIZ.LIZ;
                c21651519oP2.LJ = c0tk0LIZIZ.LIZIZ;
            }
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLJLIL.getValue();
        if (iFeedPanelPlatformAbility != null && (baseListFragmentPanelYE = iFeedPanelPlatformAbility.yE()) != null) {
            c0sub = baseListFragmentPanelYE.c;
        } else {
            c0sub = null;
        }
        this.LLJLLIL = c0sub;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        ep().LJIIJJI(AFwS224S0000000_33.get$arr$(607));
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x0134  */
    @Override // com.ss.android.ugc.feed.platform.cell.pinch.PinchAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x90(com.ss.android.ugc.aweme.feed.model.VideoItemParams r8) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.pinch.PinchComponent.x90(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }

    public void kp(long j, boolean z, boolean z2) {
        BaseListFragmentPanel baseListFragmentPanelYE;
        C0SZ8 c0sz8LJLIL;
        BaseFeedPageParams baseFeedPageParams = jm().LJ;
        if (baseFeedPageParams != null && baseFeedPageParams.isPlayListCleanMode()) {
            return;
        }
        IFeedCleanAbility iFeedCleanAbility = (IFeedCleanAbility) this.LLJL.getValue();
        if (iFeedCleanAbility != null) {
            iFeedCleanAbility.Xk(null, "pinch", z, z2, true, false);
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLJLIL.getValue();
        if (iFeedPanelPlatformAbility != null && (baseListFragmentPanelYE = iFeedPanelPlatformAbility.yE()) != null && (c0sz8LJLIL = baseListFragmentPanelYE.LJLIL()) != null) {
            c0sz8LJLIL.o(z);
        }
        AbstractC1604130rqV abstractC1604130rqVEp = ep();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[toggleClean] ");
        sbLIZ.append(z);
        sbLIZ.append(" immediately: ");
        sbLIZ.append(z2);
        abstractC1604130rqVEp.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
    }
}
