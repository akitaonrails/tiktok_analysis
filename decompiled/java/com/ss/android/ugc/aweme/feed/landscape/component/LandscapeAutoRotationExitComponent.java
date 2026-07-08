package com.ss.android.ugc.aweme.feed.landscape.component;

import X.C01GW;
import X.C0SHX;
import X.C1620050sGB;
import X.C19EG;
import X.C452501pT;
import X.C726430SeX;
import X.InterfaceC783040Une;
import com.ss.android.ugc.aweme.feed.landscape.component.LandscapeAutoRotationExitComponent;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeProfilePanelAbility;
import com.ss.android.ugc.aweme.feed.landscape.service.LandscapeAutoRotationServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class LandscapeAutoRotationExitComponent extends BasePanelComponent {
    public C1620050sGB LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 402));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 401));
    public final C726430SeX LLILZ = new InterfaceC783040Une() { // from class: X.0SeX
        @Override // X.InterfaceC783040Une
        public final boolean LJJLIIIJL() {
            return true;
        }

        @Override // X.InterfaceC783040Une
        public final AbstractC726480Sec LJJLIIIJLLLLLLLZ(int i, int i2, int i3) {
            return null;
        }

        @Override // X.InterfaceC783040Une
        public final String LJJLIIIJJI() {
            C2189821An6 c2189821An6 = this.LIZ.getPanelContext().LIZJ;
            if (c2189821An6 != null) {
                return c2189821An6.getEventType();
            }
            return null;
        }

        @Override // X.InterfaceC783040Une
        public final Aweme LJJLIIIJJIZ() {
            LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityBo = this.LIZ.bo();
            if (landscapeFeedViewPagerAbilityBo != null) {
                return landscapeFeedViewPagerAbilityBo.LLLLLJLJLL();
            }
            return null;
        }

        @Override // X.InterfaceC783040Une
        public final AbstractC726480Sec LJJLIIIJLJLI(int i, int i2) {
            boolean z;
            Aweme awemeLLLLLJLJLL;
            Aweme awemeLLLLLJLJLL2;
            Aweme awemeLLLLLJLJLL3;
            C0SZF c0szf;
            Aweme awemeLLLLLJLJLL4;
            Aweme awemeLLLLLJLJLL5;
            C1620050sGB c1620050sGB;
            C1620050sGB c1620050sGB2;
            LandscapeAutoRotationExitComponent landscapeAutoRotationExitComponent = this.LIZ;
            C1620050sGB c1620050sGB3 = landscapeAutoRotationExitComponent.LL;
            if (c1620050sGB3 != null && !c1620050sGB3.LJFF() && (c1620050sGB = landscapeAutoRotationExitComponent.LL) != null && !c1620050sGB.LIZIZ() && (c1620050sGB2 = landscapeAutoRotationExitComponent.LL) != null && !c1620050sGB2.LIZJ()) {
                z = true;
            } else {
                z = false;
            }
            String eventType = null;
            if (!z) {
                LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityBo = this.LIZ.bo();
                if (landscapeFeedViewPagerAbilityBo != null) {
                    awemeLLLLLJLJLL5 = landscapeFeedViewPagerAbilityBo.LLLLLJLJLL();
                } else {
                    awemeLLLLLJLJLL5 = null;
                }
                C2189821An6 c2189821An6 = this.LIZ.getPanelContext().LIZJ;
                if (c2189821An6 != null) {
                    eventType = c2189821An6.getEventType();
                }
                return new C726470Seb(awemeLLLLLJLJLL5, eventType, "pop_up");
            }
            C1620050sGB c1620050sGB4 = this.LIZ.LL;
            if (c1620050sGB4 != null && !c1620050sGB4.LJ()) {
                C1620050sGB c1620050sGB5 = this.LIZ.LL;
                if (c1620050sGB5 != null && !c1620050sGB5.LJI()) {
                    LandscapeProfilePanelAbility landscapeProfilePanelAbility = (LandscapeProfilePanelAbility) this.LIZ.LLILLL.getValue();
                    if (landscapeProfilePanelAbility != null && landscapeProfilePanelAbility.LJJII()) {
                        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityBo2 = this.LIZ.bo();
                        if (landscapeFeedViewPagerAbilityBo2 != null) {
                            awemeLLLLLJLJLL4 = landscapeFeedViewPagerAbilityBo2.LLLLLJLJLL();
                        } else {
                            awemeLLLLLJLJLL4 = null;
                        }
                        C2189821An6 c2189821An62 = this.LIZ.getPanelContext().LIZJ;
                        if (c2189821An62 != null) {
                            eventType = c2189821An62.getEventType();
                        }
                        return new C726470Seb(awemeLLLLLJLJLL4, eventType, "pop_up");
                    }
                    InterfaceC1670800ta2 interfaceC1670800ta2LIZ = this.LIZ.getPanelContext().LIZ();
                    if ((interfaceC1670800ta2LIZ instanceof C0SZF) && (c0szf = (C0SZF) interfaceC1670800ta2LIZ) != null) {
                        c0szf.LJLLLLLL(i, i2);
                    }
                    LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityBo3 = this.LIZ.bo();
                    if (landscapeFeedViewPagerAbilityBo3 != null) {
                        awemeLLLLLJLJLL3 = landscapeFeedViewPagerAbilityBo3.LLLLLJLJLL();
                    } else {
                        awemeLLLLLJLJLL3 = null;
                    }
                    C2189821An6 c2189821An63 = this.LIZ.getPanelContext().LIZJ;
                    if (c2189821An63 != null) {
                        eventType = c2189821An63.getEventType();
                    }
                    return new C726460Sea(awemeLLLLLJLJLL3, eventType);
                }
                LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityBo4 = this.LIZ.bo();
                if (landscapeFeedViewPagerAbilityBo4 != null) {
                    awemeLLLLLJLJLL2 = landscapeFeedViewPagerAbilityBo4.LLLLLJLJLL();
                } else {
                    awemeLLLLLJLJLL2 = null;
                }
                C2189821An6 c2189821An64 = this.LIZ.getPanelContext().LIZJ;
                if (c2189821An64 != null) {
                    eventType = c2189821An64.getEventType();
                }
                return new C726470Seb(awemeLLLLLJLJLL2, eventType, "pop_up");
            }
            LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityBo5 = this.LIZ.bo();
            if (landscapeFeedViewPagerAbilityBo5 != null) {
                awemeLLLLLJLJLL = landscapeFeedViewPagerAbilityBo5.LLLLLJLJLL();
            } else {
                awemeLLLLLJLJLL = null;
            }
            C2189821An6 c2189821An65 = this.LIZ.getPanelContext().LIZJ;
            if (c2189821An65 != null) {
                eventType = c2189821An65.getEventType();
            }
            return new C726470Seb(awemeLLLLLJLJLL, eventType, "pop_up");
        }
    };

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final LandscapeFeedViewPagerAbility bo() {
        return (LandscapeFeedViewPagerAbility) this.LLILLJJLI.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        LandscapeAutoRotationServiceImpl.LJIIIIZZ().LIZ(true);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        LandscapeAutoRotationServiceImpl.LJIIIIZZ().LJFF(this.LLILZ);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        LandscapeAutoRotationServiceImpl.LJIIIIZZ().LIZIZ(this.LLILZ);
        C19EG c19egLIZ = getPanelContext().LIZ();
        this.LL = c19egLIZ != null ? C0SHX.LIZ(c19egLIZ, null) : null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        LandscapeAutoRotationServiceImpl.LJIIIIZZ().LIZ(false);
    }
}
