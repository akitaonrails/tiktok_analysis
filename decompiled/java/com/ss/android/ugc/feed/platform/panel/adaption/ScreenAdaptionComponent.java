package com.ss.android.ugc.feed.platform.panel.adaption;

import X.C01GW;
import X.C054900Hz;
import X.C0RAA;
import X.C0RG1;
import X.C0RGM;
import X.C0SR4;
import X.C0T2O;
import X.C0T3C;
import X.C0T9W;
import X.C0T9X;
import X.C0T9Y;
import X.C1017070cZd;
import X.C1030680cva;
import X.C14LC;
import X.C1566140qrE;
import X.C15O7;
import X.C1604390rqv;
import X.C1604400rqw;
import X.C1604410rqx;
import X.C1604440rr0;
import X.C1604450rr1;
import X.C19EG;
import X.C20039813b2;
import X.C20562515d9;
import X.C20569715eJ;
import X.C293840BfS;
import X.C293860BfU;
import X.C295540BiC;
import X.C299750Boz;
import X.C309690CBz;
import X.C452501pT;
import X.C630740Ooa;
import X.C692910RFx;
import X.C786410Ut5;
import X.C988540bpc;
import X.EnumC1783170wVH;
import X.EnumC452301pR;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC1604490rr5;
import X.InterfaceC20562615dA;
import X.InterfaceC494301wD;
import X.InterfaceC743730TFj;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.screenadaption.adaptionparams.ScreenAdaptionResult;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes25.dex */
public class ScreenAdaptionComponent extends BasePanelUIComponent implements InterfaceC743730TFj, IScreenComponentAbility, InterfaceC20562615dA, InterfaceC1554640qYg {
    public static final /* synthetic */ int LLJL = 0;
    public View LLJILJILJ;
    public View LLJILLL;
    public ViewGroup LLJJ;
    public ViewGroup LLJJI;
    public View LLJJIII;
    public ViewGroup LLJJIJI;
    public View LLJJIJIIJIL;
    public ViewGroup LLJJIJIL;
    public boolean LLJJJ;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final EnumC1783170wVH LLJIJIL = EnumC1783170wVH.BUSINESS;
    public final String LLJILJIL = "screen_component";
    public final boolean LLJJJIL = true;

    @Override // X.InterfaceC743730TFj
    public final void Bg(Activity activity, Fragment fragment) {
    }

    public String Ho() {
        return "screen_component";
    }

    @Override // X.InterfaceC743730TFj
    public final void L() {
    }

    @Override // X.InterfaceC743730TFj
    public final void LLLZIL() {
    }

    @Override // X.InterfaceC743730TFj
    public final void M() {
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

    public void Vo() {
    }

    @Override // X.InterfaceC743730TFj
    public final void cq() {
    }

    @Override // X.InterfaceC743730TFj
    public final void dd() {
    }

    @Override // X.InterfaceC743730TFj
    public final void fl() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1570964940) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC743730TFj
    public final void w4() {
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public void CG() {
        View view = this.LLJILJILJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public C0T9X Go() {
        return new C0T9X(null, Boolean.valueOf(this.LLJJJIL), null);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final C1604450rr1 HE0() {
        return (C1604450rr1) this.LLJJJJLIIL.getValue();
    }

    public final IFeedPanelPlatformAbility Jo() {
        return (IFeedPanelPlatformAbility) this.LLJJJJ.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final int KA2() {
        return Lo(this.LLJILJILJ);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final int LLJILLL() {
        View view = this.LLJILLL;
        if (view != null) {
            return view.getHeight();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final void Mh2() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        View view = this.LLJILLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLJILLL;
        if (view2 != null && (layoutParams2 = view2.getLayoutParams()) != null) {
            layoutParams2.height = 0;
        }
        View view3 = this.LLJILJILJ;
        if (view3 == null || (layoutParams = view3.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0181  */
    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void adaptation() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent.adaptation():void");
    }

    public boolean bp() {
        return (this.LLJILJILJ == null || this.LLJJJIL) ? false : true;
    }

    public void cp() {
        View view = this.LLJILJILJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final int getScreenHeight() {
        ViewGroup viewGroup = this.LLJJI;
        if (viewGroup != null) {
            return viewGroup.getHeight();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final int getScreenWidth() {
        ViewGroup viewGroup = this.LLJJI;
        if (viewGroup != null) {
            return viewGroup.getWidth();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final boolean qh1() {
        View view = this.LLJILLL;
        return view != null && view.getVisibility() == 0;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final int tE() {
        int height;
        ViewGroup viewGroup = this.LLJJ;
        if (viewGroup != null && (height = viewGroup.getHeight()) > 0) {
            return height;
        }
        C0RG1.LIZ.getValue().getClass();
        return C692910RFx.LJFF();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final int wN0() {
        return Lo(this.LLJILLL);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final int xu1() {
        int width;
        ViewGroup viewGroup = this.LLJJ;
        return (viewGroup == null || (width = viewGroup.getWidth()) <= 0) ? C692910RFx.LJFF : width;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final boolean z71() {
        View view = this.LLJILJILJ;
        return view != null && view.getVisibility() == 0;
    }

    public ScreenAdaptionComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS556S0100000_12((InterfaceC1565950qqv) this, 640), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C0T2O(false, this));
        }
        this.LLJJJJ = c01gwLIZIZ;
        this.LLJJJJJIL = C452501pT.LIZIZ(new C0T9W(this));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new C1604440rr0(this));
        this.LLJJL = C452501pT.LIZIZ(new C1604410rqx(this));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new C0T3C());
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final ScreenAdaptionResult M82() {
        C1604450rr1 c1604450rr1HE0 = HE0();
        if (c1604450rr1HE0 != null) {
            return (ScreenAdaptionResult) c1604450rr1HE0.LLILZ;
        }
        return null;
    }

    public void No() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityJo = Jo();
        if (iFeedPanelPlatformAbilityJo == null || iFeedPanelPlatformAbilityJo.QU() != 4) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityJo2 = Jo();
            if (!C1030680cva.LJIJ(iFeedPanelPlatformAbilityJo2 != null ? iFeedPanelPlatformAbilityJo2.LJIIIIZZ() : null)) {
                CG();
                View view = this.LLJILLL;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                    return;
                }
                return;
            }
        }
        if (bp()) {
            cp();
            View view2 = this.LLJILJILJ;
            if (view2 != null) {
                view2.setBackgroundResource(R.color.b6);
            }
        } else {
            CG();
        }
        View view3 = this.LLJILLL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
    }

    public final boolean So() {
        Aweme awemeLJIIIIZZ;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityJo;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityJo2 = Jo();
        return iFeedPanelPlatformAbilityJo2 != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbilityJo2.LJIIIIZZ()) != null && C1017070cZd.LLIZLLLIL(awemeLJIIIIZZ) && C1030680cva.LJ && ((iFeedPanelPlatformAbilityJo = Jo()) == null || iFeedPanelPlatformAbilityJo.QU() != 4);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final int eD2() {
        ScreenAdaptionResult screenAdaptionResultM82 = M82();
        if (screenAdaptionResultM82 != null) {
            return screenAdaptionResultM82.getScreenInsetByTop();
        }
        return 0;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        this.LLJJJ = false;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public boolean xa0() {
        return KA2() > 0;
    }

    @Override // X.InterfaceC20562615dA
    public final String getName() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC20562615dA
    public final EnumC1783170wVH getNodeType() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int Lo(android.view.View r4) {
        /*
            r3 = 0
            if (r4 == 0) goto L27
            int r2 = r4.getHeight()
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            if (r0 == 0) goto L1a
            int r1 = r0.height
        Lf:
            if (r4 == 0) goto L27
            int r0 = r4.getVisibility()
            if (r0 != 0) goto L1e
            if (r2 <= 0) goto L1c
            return r2
        L1a:
            r1 = 0
            goto Lf
        L1c:
            if (r4 == 0) goto L27
        L1e:
            int r0 = r4.getVisibility()
            if (r0 != 0) goto L27
            if (r1 <= 0) goto L27
            return r1
        L27:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent.Lo(android.view.View):int");
    }

    public static boolean Oo(Aweme aweme) {
        boolean z;
        boolean z2;
        if (aweme == null) {
            return false;
        }
        if (aweme.getAwemeType() == 101) {
            z = true;
        } else {
            z = false;
        }
        if (aweme.getAwemeType() == 4000) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final void F52(int i) {
        ViewGroup.LayoutParams layoutParams;
        View view = this.LLJILLL;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.height = i;
        }
        View view2 = this.LLJILLL;
        if (view2 != null) {
            view2.requestLayout();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final void LS1(int i) {
        Aweme item;
        C0SR4 c0sr4Zv0;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityJo = Jo();
        if (iFeedPanelPlatformAbilityJo != null && (c0sr4Zv0 = iFeedPanelPlatformAbilityJo.Zv0()) != null) {
            item = c0sr4Zv0.getItem(iFeedPanelPlatformAbilityJo.LJLJJL());
        } else {
            item = null;
        }
        C1030680cva.LJIILJJIL(item, i, this.LLJJIJI, this.LLJJIJIL);
    }

    public void Zo(ScreenAdaptionResult screenAdaptionResult) throws Throwable {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        VerticalViewPager verticalViewPagerJ51;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        int topSpaceHeight;
        int bottomSpaceHeight;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb2;
        VerticalViewPager verticalViewPagerJ512;
        View view;
        View view2;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (C293840BfS.LIZJ) {
            View view3 = this.LLJILJILJ;
            if (view3 != null && view3.getVisibility() == 8) {
                topSpaceHeight = 0;
            } else {
                topSpaceHeight = screenAdaptionResult.getTopSpaceHeight();
            }
            View view4 = this.LLJILLL;
            if (view4 != null && view4.getVisibility() == 8) {
                bottomSpaceHeight = 0;
            } else {
                bottomSpaceHeight = screenAdaptionResult.getBottomSpaceHeight();
            }
            int topSpaceHeight2 = screenAdaptionResult.getTopSpaceHeight();
            int bottomSpaceHeight2 = screenAdaptionResult.getBottomSpaceHeight();
            int containerHeight = screenAdaptionResult.getContainerHeight();
            int statusBarHeight = screenAdaptionResult.getStatusBarHeight();
            C14LC.LJIILL = topSpaceHeight2;
            C14LC.LJIILLIIL = bottomSpaceHeight2;
            C14LC.LJIIZILJ.postValue(Integer.valueOf(bottomSpaceHeight2));
            C14LC c14lc = C309690CBz.LIZ;
            if (topSpaceHeight != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            c14lc.LJII = z6;
            if (bottomSpaceHeight != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            c14lc.LJIIIIZZ = z7;
            if (bottomSpaceHeight != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            c14lc.LJFF = z8;
            c14lc.LIZJ = containerHeight;
            c14lc.LJ.getClass();
            C1604400rqw c1604400rqw = c14lc.LJ;
            c1604400rqw.LIZ = statusBarHeight;
            c1604400rqw.LIZIZ = bottomSpaceHeight2;
            View view5 = this.LLJILJILJ;
            if (view5 != null && (layoutParams2 = view5.getLayoutParams()) != null && topSpaceHeight == layoutParams2.height) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z11 = !z9;
            View view6 = this.LLJILLL;
            if (view6 != null && (layoutParams = view6.getLayoutParams()) != null && bottomSpaceHeight == layoutParams.height) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z12 = true ^ z10;
            if (z11 && (view2 = this.LLJILJILJ) != null) {
                ap(topSpaceHeight, view2);
            }
            if (z12 && (view = this.LLJILLL) != null) {
                ap(bottomSpaceHeight, view);
            }
            if (z11 || z12 || (((Boolean) C988540bpc.LIZ.getValue()).booleanValue() && So())) {
                IFeedPanelPlatformAbility iFeedPanelPlatformAbilityJo = Jo();
                if (iFeedPanelPlatformAbilityJo != null && (iViewPagerComponentAbilityMb2 = iFeedPanelPlatformAbilityJo.Mb()) != null && (verticalViewPagerJ512 = iViewPagerComponentAbilityMb2.j51()) != null) {
                    int childCount = verticalViewPagerJ512.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        Object tag = verticalViewPagerJ512.getChildAt(i).getTag(R.id.hu_);
                        if (tag instanceof C0RGM) {
                            ((C0RGM) tag).LLI();
                        }
                    }
                }
                ((C1604390rqv) this.LLJJL.getValue()).y();
                return;
            }
            return;
        }
        if (((Number) C293860BfU.LIZ.getValue()).intValue() == 1 && !this.LLJJJ) {
            z = true;
        } else {
            z = false;
        }
        if (screenAdaptionResult.getTopSpaceHeight() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (screenAdaptionResult.getTopSpaceHeight() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (screenAdaptionResult.getBottomSpaceHeight() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (screenAdaptionResult.getBottomSpaceHeight() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!C20039813b2.LIZIZ) {
            zb(null, null, screenAdaptionResult, new C054900Hz(z2, z4, z3, z5));
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityJo2 = Jo();
        if (iFeedPanelPlatformAbilityJo2 != null && (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbilityJo2.Mb()) != null) {
            verticalViewPagerJ51 = iViewPagerComponentAbilityMb.j51();
        } else {
            verticalViewPagerJ51 = null;
        }
        final View view7 = this.LLJILJILJ;
        final View view8 = this.LLJILLL;
        final C19EG c19egLIZ = getPanelContext().LIZ();
        final C1604390rqv c1604390rqv = (C1604390rqv) this.LLJJL.getValue();
        boolean z13 = C14LC.LJIIIZ;
        C309690CBz.LIZ.getClass();
        if (z) {
            C14LC.LIZ(verticalViewPagerJ51, view7, view8, z2, z4, z3, z5, c19egLIZ, C14LC.LJIILIIL, c1604390rqv, true);
        } else {
            final VerticalViewPager verticalViewPager = verticalViewPagerJ51;
            final boolean z14 = z2;
            final boolean z15 = z4;
            final boolean z16 = z3;
            final boolean z17 = z5;
            C15O7.LIZIZ(new Callable() { // from class: X.0rqz
                @Override // java.util.concurrent.Callable
                public final Object call() throws Throwable {
                    ViewGroup viewGroup = verticalViewPager;
                    View view9 = view7;
                    View view10 = view8;
                    boolean z18 = z14;
                    boolean z19 = z15;
                    boolean z20 = z16;
                    boolean z21 = z17;
                    Activity activity = c19egLIZ;
                    C14LF c14lf = c1604390rqv;
                    C1C7U.LIZ("AdaptationManager@dcfd.doAdaptation$1L");
                    C14LC.LIZ(viewGroup, view9, view10, z18, z19, z20, z21, activity, C14LC.LJIILIIL, c14lf, false);
                    C1C7U.LIZIZ("AdaptationManager@dcfd.doAdaptation$1L");
                    return null;
                }
            }, C15O7.LJI, null);
        }
        if (!C20039813b2.LIZIZ) {
            zb(null, null, null, new AwS556S0100000_12(this, 740));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final void mb2(int i) {
        ViewGroup.LayoutParams layoutParams;
        View view = this.LLJILJILJ;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.height = i;
        }
        View view2 = this.LLJILJILJ;
        if (view2 != null) {
            view2.requestLayout();
        }
    }

    @Override // X.InterfaceC743730TFj
    public void LLZLLLL(View view, Bundle bundle) {
        View viewFindViewById;
        View viewFindViewById2;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        View viewFindViewById3;
        View viewFindViewById4;
        ViewGroup viewGroup3;
        boolean z;
        ViewGroup viewGroup4 = null;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.ydi);
        } else {
            viewFindViewById = null;
        }
        this.LLJILJILJ = viewFindViewById;
        if (view != null) {
            viewFindViewById2 = view.findViewById(R.id.ch3);
        } else {
            viewFindViewById2 = null;
        }
        this.LLJILLL = viewFindViewById2;
        if (view != null) {
            viewGroup = (ViewGroup) view.findViewById(R.id.viewpager);
        } else {
            viewGroup = null;
        }
        this.LLJJ = viewGroup;
        if (view != null) {
            viewGroup2 = (ViewGroup) view.findViewById(R.id.viewpager_container);
        } else {
            viewGroup2 = null;
        }
        this.LLJJI = viewGroup2;
        if (view != null) {
            viewFindViewById3 = view.findViewById(R.id.y_y);
        } else {
            viewFindViewById3 = null;
        }
        this.LLJJIII = viewFindViewById3;
        if (view != null) {
            viewFindViewById4 = view.findViewById(R.id.cd2);
        } else {
            viewFindViewById4 = null;
        }
        this.LLJJIJIIJIL = viewFindViewById4;
        if (view != null) {
            viewGroup3 = (ViewGroup) view.findViewById(R.id.y_z);
        } else {
            viewGroup3 = null;
        }
        this.LLJJIJI = viewGroup3;
        if (view != null) {
            viewGroup4 = (ViewGroup) view.findViewById(R.id.cd3);
        }
        this.LLJJIJIL = viewGroup4;
        if (C20562515d9.LJFF) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = C295540BiC.LIZIZ;
        C20039813b2.LIZ = z;
        C20039813b2.LIZIZ = z2;
        if (C1604450rr1.LLJ == null) {
            C1604450rr1.LLJ = new C1604450rr1("screen_singleton", new C0T9X(null, null, null), false);
        }
    }

    public final void ap(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        C786410Ut5.W5(view, layoutParams);
    }

    @Override // X.InterfaceC20562615dA
    public final void Ui(Function0<String> function0, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa) {
        C20569715eJ.LJIIIZ(this, function0, interfaceC1604490rr5, c0raa);
    }

    @Override // X.InterfaceC20562615dA
    public final void ah(Function0<String> function0, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa) {
        C20569715eJ.LJII(this, function0, interfaceC1604490rr5, c0raa);
    }

    @Override // X.InterfaceC20562615dA
    public final void em(Function0<String> function0, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa) {
        C20569715eJ.LJIIJJI(this, function0, interfaceC1604490rr5, c0raa);
    }

    @Override // X.InterfaceC20562615dA
    public final void Lj(C0T9Y c0t9y, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa, Function0<? extends Object> function0) {
        C20569715eJ.LJ(this, c0t9y, interfaceC1604490rr5, c0raa, function0);
    }

    @Override // X.InterfaceC20562615dA
    public final void y5(C0T9Y c0t9y, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa, Function0<? extends Object> function0) {
        C20569715eJ.LIZJ(this, c0t9y, interfaceC1604490rr5, c0raa, function0);
    }

    @Override // X.InterfaceC20562615dA
    public final void zb(C0T9Y c0t9y, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa, Function0<? extends Object> function0) {
        C20569715eJ.LIZ(this, c0t9y, interfaceC1604490rr5, c0raa, function0);
    }
}
