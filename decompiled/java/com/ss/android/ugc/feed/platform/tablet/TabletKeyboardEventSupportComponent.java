package com.ss.android.ugc.feed.platform.tablet;

import X.AbstractC19484711Kz;
import X.C01GW;
import X.C0SZ8;
import X.C0T0X;
import X.C11NJ;
import X.C11S5;
import X.C1388190mED;
import X.C1483410ohn;
import X.C1558520qew;
import X.C1701940uOG;
import X.C19252910Tv;
import X.C19EG;
import X.C452501pT;
import X.InterfaceC1554640qYg;
import X.InterfaceC300801Eo;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import Y.AfS173S0100000_4;
import android.content.Context;
import android.view.KeyEvent;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCommentAbility;
import com.ss.android.ugc.feed.platform.cell.RootCellComponent;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.IRootAbility;
import com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class TabletKeyboardEventSupportComponent extends BasePanelComponent implements ITabletKeyboardEventSupport, InterfaceC1554640qYg {
    public final C01GW LL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1581));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1579));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1578));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1580));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1577));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(423));

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1258986933) {
            return null;
        }
        return this;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        ((C11NJ) this.LLILZLL.getValue()).LJ();
    }

    @Override // com.ss.android.ugc.feed.platform.tablet.ITabletKeyboardEventSupport
    public final boolean J3(KeyEvent keyEvent) {
        C19EG c19egLIZIZ;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility;
        IViewPagerComponentAbility iViewPagerComponentAbility;
        C0SZ8 c0sz8LJLIL;
        RootCellComponent rootCellComponentLIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL;
        IVideoCommentAbility iVideoCommentAbility;
        IRootAbility iRootAbility = (IRootAbility) this.LLILZ.getValue();
        boolean z = false;
        if (iRootAbility == null || !iRootAbility.getUserVisibleHint() || !C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJZ()) {
            return false;
        }
        if (keyEvent != null && keyEvent.getAction() == 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 31) {
                        if (keyCode == 62 || keyCode == 85) {
                            if (C1483410ohn.LJLJJI().isPlaying()) {
                                C1483410ohn.LJLJJI().LIZ();
                                IPlayButtonAbility iPlayButtonAbility = (IPlayButtonAbility) this.LLILLL.getValue();
                                if (iPlayButtonAbility != null) {
                                    iPlayButtonAbility.Ol2();
                                    return true;
                                }
                                return true;
                            }
                            C1483410ohn.LJLJJI().LJIILLIIL();
                            IPlayButtonAbility iPlayButtonAbility2 = (IPlayButtonAbility) this.LLILLL.getValue();
                            if (iPlayButtonAbility2 == null) {
                                return true;
                            }
                            iPlayButtonAbility2.cx1(true);
                            return true;
                        }
                    } else {
                        IFeedPanelPlatformAbility iFeedPanelPlatformAbility2 = (IFeedPanelPlatformAbility) this.LLILZIL.getValue();
                        if (iFeedPanelPlatformAbility2 != null && !iFeedPanelPlatformAbility2.kU1() && (iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LL.getValue()) != null && (c0sz8LJLIL = iViewPagerComponentAbility.LJLIL()) != null && (rootCellComponentLIZ = C0T0X.LIZ(c0sz8LJLIL)) != null && (interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(rootCellComponentLIZ)) != null && (iVideoCommentAbility = (IVideoCommentAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, IVideoCommentAbility.class, null)) != null) {
                            iVideoCommentAbility.Pb0();
                            return true;
                        }
                    }
                } else {
                    IFeedPanelPlatformAbility iFeedPanelPlatformAbility3 = (IFeedPanelPlatformAbility) this.LLILZIL.getValue();
                    if (iFeedPanelPlatformAbility3 != null && !iFeedPanelPlatformAbility3.kU1()) {
                        ITabletExternalDeviceFeedScrollRecordAbility iTabletExternalDeviceFeedScrollRecordAbility = (ITabletExternalDeviceFeedScrollRecordAbility) this.LLILLJJLI.getValue();
                        if (iTabletExternalDeviceFeedScrollRecordAbility != null) {
                            iTabletExternalDeviceFeedScrollRecordAbility.PD2();
                        }
                        IViewPagerComponentAbility iViewPagerComponentAbility2 = (IViewPagerComponentAbility) this.LL.getValue();
                        if (iViewPagerComponentAbility2 != null) {
                            iViewPagerComponentAbility2.rH();
                        }
                        ITabletExternalDeviceFeedScrollRecordAbility iTabletExternalDeviceFeedScrollRecordAbility2 = (ITabletExternalDeviceFeedScrollRecordAbility) this.LLILLJJLI.getValue();
                        if (iTabletExternalDeviceFeedScrollRecordAbility2 != null) {
                            iTabletExternalDeviceFeedScrollRecordAbility2.pj2();
                            return true;
                        }
                        return true;
                    }
                }
            } else {
                IFeedPanelPlatformAbility iFeedPanelPlatformAbility4 = (IFeedPanelPlatformAbility) this.LLILZIL.getValue();
                if (iFeedPanelPlatformAbility4 != null && !iFeedPanelPlatformAbility4.kU1()) {
                    ITabletExternalDeviceFeedScrollRecordAbility iTabletExternalDeviceFeedScrollRecordAbility3 = (ITabletExternalDeviceFeedScrollRecordAbility) this.LLILLJJLI.getValue();
                    if (iTabletExternalDeviceFeedScrollRecordAbility3 != null) {
                        iTabletExternalDeviceFeedScrollRecordAbility3.PD2();
                    }
                    IViewPagerComponentAbility iViewPagerComponentAbility3 = (IViewPagerComponentAbility) this.LL.getValue();
                    if (iViewPagerComponentAbility3 != null) {
                        iViewPagerComponentAbility3.X20();
                    }
                    ITabletExternalDeviceFeedScrollRecordAbility iTabletExternalDeviceFeedScrollRecordAbility4 = (ITabletExternalDeviceFeedScrollRecordAbility) this.LLILLJJLI.getValue();
                    if (iTabletExternalDeviceFeedScrollRecordAbility4 != null) {
                        iTabletExternalDeviceFeedScrollRecordAbility4.pj2();
                        return true;
                    }
                    return true;
                }
            }
            z = false;
            int keyCode2 = keyEvent.getKeyCode();
            if (29 > keyCode2 ? !(7 > keyCode2 || keyCode2 >= 17) : keyCode2 < 55) {
                Context context = getContext();
                if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLILZIL.getValue()) != null && !iFeedPanelPlatformAbility.kU1()) {
                    ((C11NJ) this.LLILZLL.getValue()).LIZ(AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0DIH
                        @Override // X.InterfaceC300801Eo
                        public final void subscribe(InterfaceC2329309At<Boolean> interfaceC2329309At) {
                            interfaceC2329309At.onSuccess(Boolean.valueOf(C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLLJ()));
                        }
                    }).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIJZLJL(new AfS173S0100000_4(c19egLIZIZ, 13)));
                    return true;
                }
                return false;
            }
        }
        return z;
    }
}
