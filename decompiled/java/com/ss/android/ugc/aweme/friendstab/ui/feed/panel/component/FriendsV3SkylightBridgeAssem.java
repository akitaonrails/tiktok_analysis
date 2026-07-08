package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component;

import X.AbstractC1581290rFf;
import X.C019F;
import X.C01GW;
import X.C0AI0;
import X.C0W17;
import X.C1308910kAL;
import X.C1319600kRa;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1581270rFd;
import X.C1581310rFh;
import X.C1587740rQ4;
import X.C1618440sDa;
import X.C1637806bA;
import X.C16BC;
import X.C16G1;
import X.C16GX;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C281310B0v;
import X.C452501pT;
import X.C614770O9j;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.EnumC1581260rFc;
import X.EnumC452301pR;
import X.InterfaceC1324370kZH;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC729460SjQ;
import Y.ALAdapterS9S0200000_12;
import Y.AUListenerS269S0100000_20;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3ListStatusAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3NavBarAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3SkylightAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3SkylightViewStatusAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3SkylightBridgeViewModel;
import com.ss.android.ugc.aweme.service.IFeedSkylightCommonService;
import com.ss.android.ugc.aweme.story.ability.StoryToolBarIconAbility;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS173S1100000_24;
import kotlin.jvm.internal.AwS22S1110000_24;
import kotlin.jvm.internal.AwS268S0300000_24;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3SkylightBridgeAssem extends UIContentAssem implements FriendsV3SkylightAbility, FriendsV3SkylightViewStatusAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public EnumC1581260rFc LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public final C630740Ooa LLJJIJIIJIL;
    public final C630740Ooa LLJJIJIL;
    public final C630740Ooa LLJJJ;
    public final C630740Ooa LLJJJIL;
    public final C630740Ooa LLJJJJ;
    public final C630740Ooa LLJJJJJIL;
    public final C630740Ooa LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3SkylightBridgeAssem.class, "skylightBridgeViewModel", "getSkylightBridgeViewModel()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3SkylightBridgeViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FriendsV3SkylightBridgeAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3SkylightBridgeViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS556S0100000_12(c19719912DlLIZ, 496), AFwS264S0000000_24.get$arr$(160), null, true);
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLJ = C452501pT.LIZ(enumC452301pR, new AwS568S0100000_24(this, 531));
        this.LLJI = C452501pT.LIZ(enumC452301pR, new AwS568S0100000_24(this, 530));
        this.LLJIJIL = C452501pT.LIZ(enumC452301pR, new AwS568S0100000_24(this, 539));
        this.LLJILJIL = C452501pT.LIZ(enumC452301pR, new AwS568S0100000_24(this, 535));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 534));
        this.LLJILLL = C452501pT.LIZ(enumC452301pR, new AwS568S0100000_24(this, 533));
        C01GW c01gw = C0AI0.LIZ;
        this.LLJJ = ((Boolean) c01gw.getValue()).booleanValue() ? EnumC1581260rFc.EXPANDED : EnumC1581260rFc.COLLAPSED;
        this.LLJJI = ((Boolean) c01gw.getValue()).booleanValue();
        this.LLJJIJIIJIL = C628500Oky.LIZ(new AwS568S0100000_24(this, 536));
        this.LLJJIJIL = C628500Oky.LIZ(new AwS568S0100000_24(this, 537));
        this.LLJJJ = C628500Oky.LIZ(new AwS568S0100000_24(this, 532));
        this.LLJJJIL = C628500Oky.LIZ(new AwS568S0100000_24(this, 538));
        this.LLJJJJ = C628500Oky.LIZ(new AwS568S0100000_24(this, 540));
        this.LLJJJJJIL = C628500Oky.LIZ(new AwS568S0100000_24(this, 529));
        this.LLJJJJLIIL = C628500Oky.LIZ(new AwS568S0100000_24(this, 541));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 469515738) {
            return null;
        }
        return this;
    }

    public final C16GX Go() {
        return (C16GX) this.LLJI.getValue();
    }

    public final int Ho() {
        Integer numLIZJ;
        Integer numLIZJ2;
        if (C1581270rFd.LIZ[this.LLJJ.ordinal()] == 1) {
            Context context = getContext();
            if (context == null || (numLIZJ2 = C1308910kAL.LIZJ(R.attr.zn, context)) == null) {
                return 0;
            }
            return numLIZJ2.intValue();
        }
        Context context2 = getContext();
        if (context2 == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.uk, context2)) == null) {
            return 0;
        }
        return numLIZJ.intValue();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3SkylightAbility
    public final boolean ZQ1() {
        return this.LLJJ == EnumC1581260rFc.OVERLAY;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3SkylightAbility
    public final void yv0() {
        if (this.LLJJ == EnumC1581260rFc.OVERLAY) {
            PD0("auto", "friends_v3_landing_to_anchor", false);
        } else {
            Rs1(false);
            Jo("auto", true);
        }
    }

    public final void No() {
        if (C281310B0v.LIZ()) {
            if (this.LLJJ == EnumC1581260rFc.EXPANDED) {
                Go().LJ(true, false, true);
            }
            PD0("publish_landing", null, true);
            C614770O9j.LIZIZ.LJ().LJIJI(0, true);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), FriendsV3SkylightAbility.class, null);
        }
        C1618440sDa.LIZIZ.LJJIFFI().LJIIL("friends3_skylight");
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3SkylightAbility
    public final int rs() {
        return Go().getHeight();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3SkylightViewStatusAbility
    public final boolean ua1() {
        return this.LLJJIJI;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3SkylightAbility
    public final void Rs1(boolean z) {
        Go().LJ(z, false, true);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3SkylightAbility
    public final void Zs(boolean z) {
        C1587740rQ4 c1587740rQ4 = C1587740rQ4.LIZ;
        c1587740rQ4.getClass();
        if (!C1587740rQ4.LJIJI) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c1587740rQ4.getClass();
            long j = jElapsedRealtime - C1587740rQ4.LIZJ;
            if (C1587740rQ4.LJIIJJI == -1) {
                C1587740rQ4.LJIIJJI = j;
            }
            if (z) {
                Long lValueOf = Long.valueOf(SystemClock.elapsedRealtime() - C1587740rQ4.LIZJ);
                if (C1587740rQ4.LJIIL == null) {
                    C1587740rQ4.LJIIL = lValueOf;
                }
                C1587740rQ4.LJIJ = true;
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ((C1319600kRa) this.LLJ.getValue()).setOnCollapseSkylight(new AwS568S0100000_24(this, 1651));
        C16GX c16gxGo = Go();
        c16gxGo.LIZ((InterfaceC1324370kZH) this.LLJJJJLIIL.getValue());
        c16gxGo.bringToFront();
        c16gxGo.requestLayout();
        c16gxGo.invalidate();
        if (((Boolean) C0AI0.LIZ.getValue()).booleanValue()) {
            Go().LJ(false, false, true);
        }
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0gLV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159400gHC) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 134), 4);
        C736680Sv4.LJIIIIZZ(this, this.LLIZLLLIL.getValue(), new C2217381BqS() { // from class: X.0gLO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1159400gHC) obj).LLILLJJLI);
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 136), 4);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, FriendsV3SkylightAbility.class, null, null);
        }
        C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
        if (c1618440sDa.LJJIFFI().isPublishing()) {
            No();
        }
        c1618440sDa.LJJIFFI().LJII("friends3_skylight", new InterfaceC729460SjQ() { // from class: X.0rFe
            @Override // X.InterfaceC729460SjQ
            public final void LIZJ(float f) {
            }

            @Override // X.InterfaceC729460SjQ
            public final void LIZLLL(String str) {
            }

            @Override // X.InterfaceC729460SjQ
            public final void LJ(String str) {
            }

            @Override // X.InterfaceC729460SjQ
            public final void LJFF() {
            }

            @Override // X.InterfaceC729460SjQ
            public final void LJI(C729450SjP c729450SjP, String str) {
            }

            @Override // X.InterfaceC729460SjQ
            public final void LIZ(String str, C0SPF c0spf) {
                this.LIZ.getClass();
                C614770O9j.LIZIZ.LJ().LJIJI(0, false);
            }

            @Override // X.InterfaceC729460SjQ
            public final void LIZIZ(EnumC729410SjL enumC729410SjL, String str) {
                this.LIZ.No();
            }
        });
    }

    public final void Jo(String str, boolean z) {
        StoryToolBarIconAbility storyToolBarIconAbility;
        boolean z2;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (storyToolBarIconAbility = (StoryToolBarIconAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), StoryToolBarIconAbility.class, null)) != null) {
            if (!z) {
                z2 = true;
            } else {
                z2 = false;
            }
            storyToolBarIconAbility.u81("FRIENDS_FEED", str, z2, false);
        }
    }

    public final void Lo(String str, boolean z) {
        PD0(str, null, z);
        FriendsV3NavBarAbility friendsV3NavBarAbility = (FriendsV3NavBarAbility) this.LLJJIJIL.getValue();
        if (friendsV3NavBarAbility != null) {
            friendsV3NavBarAbility.iy(new AwS22S1110000_24(this, z, str, 1), !z);
        }
        if (!this.LLJJIJI) {
            this.LLJJIJI = true;
            FriendsV3ListStatusAbility friendsV3ListStatusAbility = (FriendsV3ListStatusAbility) this.LLJJIJIIJIL.getValue();
            if (friendsV3ListStatusAbility != null) {
                friendsV3ListStatusAbility.QM2();
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("markSkylightFirstShow, skylightFirstShow=");
        sbLIZ.append(this.LLJJIJI);
        C0W17.LIZJ("FriendsV3ErrorStatusAssem", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3SkylightAbility
    public final void PD0(String str, String str2, boolean z) {
        String str3 = str;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null) {
            return;
        }
        IFeedSkylightCommonService iFeedSkylightCommonServiceLJ = C614770O9j.LIZIZ.LJ();
        if (!this.LLJJIJI) {
            str3 = "auto";
        }
        iFeedSkylightCommonServiceLJ.LJIILL(fragmentLJI, z, str3, 0, true, true, str2);
    }

    public static void Oo(FriendsV3SkylightBridgeAssem friendsV3SkylightBridgeAssem, AbstractC1581290rFf abstractC1581290rFf, AwS173S1100000_24 awS173S1100000_24, AwS568S0100000_24 awS568S0100000_24, int i) {
        int topAndBottomOffset;
        int i2;
        AppBarLayout$Behavior appBarLayout$Behavior = null;
        if ((i & 2) != 0) {
            awS173S1100000_24 = null;
        }
        if ((i & 4) != 0) {
            awS568S0100000_24 = null;
        }
        if (!friendsV3SkylightBridgeAssem.LLJJIII) {
            Object value = friendsV3SkylightBridgeAssem.LLJ.getValue();
            C16GX c16gxGo = friendsV3SkylightBridgeAssem.Go();
            boolean z = abstractC1581290rFf instanceof C1581310rFh;
            AwS268S0300000_24 awS268S0300000_24 = new AwS268S0300000_24(friendsV3SkylightBridgeAssem, (FriendsV3SkylightBridgeAssem) awS173S1100000_24, (Function0<Unit>) abstractC1581290rFf, (AbstractC1581290rFf) 10);
            AwS268S0300000_24 awS268S0300000_242 = new AwS268S0300000_24(friendsV3SkylightBridgeAssem, (FriendsV3SkylightBridgeAssem) awS568S0100000_24, (Function0<Unit>) abstractC1581290rFf, (AbstractC1581290rFf) 11);
            int i3 = C1319600kRa.LLJLIL;
            AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
            value.getClass();
            C16BC c16bc = ((C16G1) c16gxGo.getLayoutParams()).LIZ;
            if (c16bc instanceof AppBarLayout$Behavior) {
                appBarLayout$Behavior = (AppBarLayout$Behavior) c16bc;
            }
            if (appBarLayout$Behavior != null) {
                topAndBottomOffset = appBarLayout$Behavior.getTopAndBottomOffset();
            } else {
                topAndBottomOffset = 0;
            }
            if (z) {
                i2 = 0;
            } else {
                i2 = -c16gxGo.getHeight();
            }
            if (topAndBottomOffset == i2) {
                awS268S0300000_24.invoke();
                return;
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(topAndBottomOffset, i2);
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.setInterpolator(accelerateDecelerateInterpolator);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS269S0100000_20(appBarLayout$Behavior, 28));
            valueAnimatorOfInt.addListener(new ALAdapterS9S0200000_12(awS268S0300000_24, awS268S0300000_242, 10));
            valueAnimatorOfInt.start();
        }
    }
}
