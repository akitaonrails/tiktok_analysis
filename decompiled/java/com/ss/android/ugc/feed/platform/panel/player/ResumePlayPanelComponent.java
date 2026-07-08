package com.ss.android.ugc.feed.platform.panel.player;

import X.C01GW;
import X.C0N0Y;
import X.C0SZ8;
import X.C1478160oZK;
import X.C1483340ohg;
import X.C1566140qrE;
import X.C2188811AlT;
import X.C299750Boz;
import X.C300880Bqo;
import X.C452501pT;
import X.C630740Ooa;
import X.C786130Usd;
import X.EnumC452301pR;
import X.InterfaceC1483670oiD;
import X.InterfaceC1484080ois;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC494301wD;
import X.InterfaceC582840MtW;
import android.text.TextUtils;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.pip.IPipAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.AwS130S0110000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class ResumePlayPanelComponent extends BasePanelComponent implements IResumePlayPanelComponent, InterfaceC1554640qYg {
    public static final /* synthetic */ int LLILZLL = 0;
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public long LLILZIL;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -827329592) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IResumePlayPanelComponent
    public final boolean CX() {
        return this.LLILZIL > 0;
    }

    public ResumePlayPanelComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS556S0100000_12((InterfaceC1565950qqv) this, 656), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS130S0110000_12(false, (InterfaceC1565950qqv) this, 25));
        }
        this.LL = c01gwLIZIZ;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 655));
        this.LLILLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 658));
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS556S0100000_12((InterfaceC1565950qqv) this, 657), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS130S0110000_12(false, (InterfaceC1565950qqv) this, 26));
        }
        this.LLILZ = c01gwLIZIZ2;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LLILZIL = 0L;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILLL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new C786130Usd(this, 3));
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        C0N0Y playerManager;
        super.onPause();
        IPlayerComponentAbility iPlayerComponentAbility = (IPlayerComponentAbility) this.LLILLJJLI.getValue();
        this.LLILZIL = (iPlayerComponentAbility == null || (playerManager = iPlayerComponentAbility.getPlayerManager()) == null) ? 0L : playerManager.getCurrentPosition();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IResumePlayPanelComponent
    public final boolean jx(Aweme aweme) {
        C0SZ8 c0sz8LJLIL;
        String strXy2;
        String strLJJJLIIL;
        boolean zEquals;
        C0N0Y playerManager;
        int state;
        int i;
        int iEk1;
        long j;
        InterfaceC1484080ois playState;
        String aid;
        String strLJJJLIIL2;
        C0N0Y playerManager2;
        Aweme awemeLJIIIIZZ;
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILLL.getValue();
        String strXy22 = null;
        if (iViewPagerComponentAbility != null) {
            c0sz8LJLIL = iViewPagerComponentAbility.LJLIL();
        } else {
            c0sz8LJLIL = null;
        }
        if (c0sz8LJLIL instanceof InterfaceC582840MtW) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.getValue();
            if (iFeedPanelPlatformAbility != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbility.LJIIIIZZ()) != null) {
                aid = awemeLJIIIIZZ.getAid();
            } else {
                aid = null;
            }
            IPlayerComponentAbility iPlayerComponentAbility = (IPlayerComponentAbility) this.LLILLJJLI.getValue();
            if (iPlayerComponentAbility != null && (playerManager2 = iPlayerComponentAbility.getPlayerManager()) != null) {
                strLJJJLIIL2 = playerManager2.LJJJLIIL();
            } else {
                strLJJJLIIL2 = null;
            }
            zEquals = TextUtils.equals(aid, strLJJJLIIL2);
        } else {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility2 = (IFeedPanelPlatformAbility) this.LL.getValue();
            if (iFeedPanelPlatformAbility2 != null) {
                strXy2 = iFeedPanelPlatformAbility2.xy2();
            } else {
                strXy2 = null;
            }
            IPlayerComponentAbility iPlayerComponentAbility2 = (IPlayerComponentAbility) this.LLILLJJLI.getValue();
            if (iPlayerComponentAbility2 != null && (playerManager = iPlayerComponentAbility2.getPlayerManager()) != null) {
                strLJJJLIIL = playerManager.LJJJLIIL();
            } else {
                strLJJJLIIL = null;
            }
            zEquals = TextUtils.equals(strXy2, strLJJJLIIL);
        }
        boolean z = !zEquals;
        IPlayerComponentAbility iPlayerComponentAbility3 = (IPlayerComponentAbility) this.LLILLJJLI.getValue();
        if (iPlayerComponentAbility3 == null) {
            return false;
        }
        InterfaceC1483670oiD interfaceC1483670oiDLJIILL = iPlayerComponentAbility3.getPlayerManager().LJIILL();
        if (interfaceC1483670oiDLJIILL != null && (playState = interfaceC1483670oiDLJIILL.getPlayState()) != null) {
            state = playState.getState();
        } else {
            state = 0;
        }
        if (this.LLILZIL > 0 && (z || state < 2 || state > 5)) {
            if (((Number) C300880Bqo.LIZ.getValue()).intValue() == 2) {
                if (C1478160oZK.LIZ().LJJ(C1483340ohg.LJFF(aweme))) {
                    j = this.LLILZIL;
                }
                i = 0;
            } else {
                j = this.LLILZIL;
            }
            i = (int) j;
        } else {
            i = 0;
        }
        IPipAbility iPipAbility = (IPipAbility) this.LLILZ.getValue();
        if (iPipAbility != null) {
            iPipAbility.ac1();
            IPipAbility iPipAbility2 = (IPipAbility) this.LLILZ.getValue();
            if (iPipAbility2 != null && (iEk1 = iPipAbility2.ek1(aweme)) > 0) {
                i = iEk1;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resume play ");
        sbLIZ.append(z);
        sbLIZ.append(' ');
        sbLIZ.append(i);
        sbLIZ.append(' ');
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility3 = (IFeedPanelPlatformAbility) this.LL.getValue();
        if (iFeedPanelPlatformAbility3 != null) {
            strXy22 = iFeedPanelPlatformAbility3.xy2();
        }
        sbLIZ.append(strXy22);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("ResumePlayPanelComponent", C2188811AlT.LIZIZ(sbLIZ));
        iPlayerComponentAbility3.p6(aweme, i, false);
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565950qqv
    public final void onPagePause(int i) {
        long currentPosition;
        C0N0Y playerManager;
        super.onPagePause(i);
        IPlayerComponentAbility iPlayerComponentAbility = (IPlayerComponentAbility) this.LLILLJJLI.getValue();
        if (iPlayerComponentAbility != null && (playerManager = iPlayerComponentAbility.getPlayerManager()) != null) {
            currentPosition = playerManager.getCurrentPosition();
        } else {
            currentPosition = 0;
        }
        this.LLILZIL = currentPosition;
    }
}
