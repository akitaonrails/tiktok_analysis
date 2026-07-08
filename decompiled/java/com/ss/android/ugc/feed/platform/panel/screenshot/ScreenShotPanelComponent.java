package com.ss.android.ugc.feed.platform.panel.screenshot;

import X.C01GW;
import X.C0SUI;
import X.C0SUJ;
import X.C1566140qrE;
import X.C299750Boz;
import X.C452501pT;
import X.C630740Ooa;
import X.C733900Sqa;
import X.C733920Sqc;
import X.C733960Sqg;
import X.C735610StL;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class ScreenShotPanelComponent extends BasePanelComponent {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final IFeedPanelPlatformAbility m349do() {
        return (IFeedPanelPlatformAbility) this.LL.getValue();
    }

    public ScreenShotPanelComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS555S0100000_11((InterfaceC1565950qqv) this, 1302), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C733900Sqa(false, this));
        }
        this.LL = c01gwLIZIZ;
        this.LLILLJJLI = C452501pT.LIZIZ(new C733960Sqg());
        this.LLILLL = C452501pT.LIZIZ(new C0SUJ(this));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityM349do = m349do();
        int iCl2 = iFeedPanelPlatformAbilityM349do != null ? iFeedPanelPlatformAbilityM349do.cl2() : 0;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityM349do2 = m349do();
        bo(C735610StL.LIZ(iCl2, iFeedPanelPlatformAbilityM349do2 != null ? iFeedPanelPlatformAbilityM349do2.cY1() : null, true), (C0SUI) this.LLILLL.getValue());
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityM349do = m349do();
        int iCl2 = iFeedPanelPlatformAbilityM349do != null ? iFeedPanelPlatformAbilityM349do.cl2() : 0;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityM349do2 = m349do();
        bo(C735610StL.LIZ(iCl2, iFeedPanelPlatformAbilityM349do2 != null ? iFeedPanelPlatformAbilityM349do2.cY1() : null, true), (C0SUI) this.LLILLL.getValue());
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565950qqv
    public final void setUserVisibleHint(boolean z) {
        int iCl2;
        String strCY1;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityM349do = m349do();
        if (iFeedPanelPlatformAbilityM349do != null) {
            iCl2 = iFeedPanelPlatformAbilityM349do.cl2();
        } else {
            iCl2 = 0;
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityM349do2 = m349do();
        if (iFeedPanelPlatformAbilityM349do2 != null) {
            strCY1 = iFeedPanelPlatformAbilityM349do2.cY1();
        } else {
            strCY1 = null;
        }
        String strLIZ = C735610StL.LIZ(iCl2, strCY1, true);
        if (z) {
            bo(strLIZ, (C0SUI) this.LLILLL.getValue());
        } else {
            ((IScreenshotService) this.LLILLJJLI.getValue()).LIZJ(strLIZ);
        }
    }

    public final void bo(String str, C0SUI c0sui) {
        if (str != null && str.length() != 0) {
            C733920Sqc.LIZ.getClass();
            if (C733920Sqc.LIZIZ.contains(str)) {
                ((IScreenshotService) this.LLILLJJLI.getValue()).LJI(str, c0sui);
            }
        }
    }
}
