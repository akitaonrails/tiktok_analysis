package com.ss.android.ugc.nearby.component;

import X.C01GW;
import X.C1205220hT6;
import X.C1205420hTQ;
import X.C20019113Un;
import X.C266800Acw;
import X.C452501pT;
import X.InterfaceC1616070s9l;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.NearbyInfo;
import com.ss.android.ugc.aweme.feed.model.NearbyInfoKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.ss.android.ugc.nearby.component.NearbyFeedDetailQuitComponent;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyFeedDetailQuitComponent extends BasePanelComponent {
    public Aweme LLILLJJLI;
    public final C1205420hTQ LL = new C1205420hTQ();
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2339));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2340));

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        IViewPagerAbility iViewPagerAbility;
        super.onParentViewCreated();
        if (((Boolean) C266800Acw.LIZ.getValue()).booleanValue() && (iViewPagerAbility = (IViewPagerAbility) this.LLILZ.getValue()) != null) {
            iViewPagerAbility.Em(true);
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILZ.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new InterfaceC1616070s9l() { // from class: X.0hT7
                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onBeforePageChange() {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i) {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageScrolled(int i, float f, int i2) {
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageScrolledEnd(int i, float f, int i2) {
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageSelected(int i, boolean z) {
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageUnSelected(C0SZ8 c0sz8) {
                }

                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onScrollToItemStart(int i) {
                }

                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageSelected(int i) {
                    Aweme awemeLJIIIIZZ;
                    String aid;
                    String aid2;
                    NearbyInfo nearbyInfoAddParamsToNearbyDoubleColumnEventTrack;
                    try {
                        NearbyFeedDetailQuitComponent nearbyFeedDetailQuitComponent = this.LL;
                        IViewPagerComponentAbility iViewPagerComponentAbility2 = (IViewPagerComponentAbility) nearbyFeedDetailQuitComponent.LLILZ.getValue();
                        String groupId = null;
                        if (iViewPagerComponentAbility2 != null) {
                            awemeLJIIIIZZ = iViewPagerComponentAbility2.LJIIIIZZ();
                        } else {
                            awemeLJIIIIZZ = null;
                        }
                        nearbyFeedDetailQuitComponent.LLILLJJLI = awemeLJIIIIZZ;
                        Aweme aweme = this.LL.LLILLJJLI;
                        if (aweme != null) {
                            NearbyInfo nearbyInfo = aweme.getNearbyInfo();
                            if (nearbyInfo != null) {
                                C1205260hTA c1205260hTA = C1205260hTA.LIZ;
                                String strValueOf = String.valueOf(i);
                                c1205260hTA.getClass();
                                nearbyInfoAddParamsToNearbyDoubleColumnEventTrack = NearbyInfoKt.addParamsToNearbyDoubleColumnEventTrack(nearbyInfo, C1205260hTA.LIZ(strValueOf));
                            } else {
                                nearbyInfoAddParamsToNearbyDoubleColumnEventTrack = null;
                            }
                            aweme.setNearbyInfo(nearbyInfoAddParamsToNearbyDoubleColumnEventTrack);
                        }
                        C1205260hTA c1205260hTA2 = C1205260hTA.LIZ;
                        Aweme aweme2 = this.LL.LLILLJJLI;
                        if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                            aid = "";
                        }
                        c1205260hTA2.getClass();
                        C1205260hTA.LJFF(aid);
                        C20019113Un c20019113Un = C20019113Un.LIZ;
                        Aweme aweme3 = this.LL.LLILLJJLI;
                        if (aweme3 != null) {
                            aid2 = aweme3.getAid();
                        } else {
                            aid2 = null;
                        }
                        Aweme aweme4 = this.LL.LLILLJJLI;
                        if (aweme4 != null) {
                            groupId = aweme4.getGroupId();
                        }
                        c20019113Un.getClass();
                        C20019113Un.LJII(aid2, groupId);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onPageSelected position=");
                        sbLIZ.append(i);
                        sbLIZ.append(", something is wrong, e=");
                        sbLIZ.append(e);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                    if (!C0BXK.LIZ()) {
                        C1440005kM.LIZ(new AnonymousClass0350(i));
                    }
                }
            });
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        C1205420hTQ c1205420hTQ = this.LL;
        c1205420hTQ.getClass();
        c1205420hTQ.LIZ();
        ((IScreenshotService) ServiceManager.get().getService(IScreenshotService.class)).LIZJ(null);
        C20019113Un.LIZ.getClass();
        C20019113Un.LIZIZ();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C1205420hTQ c1205420hTQ = this.LL;
        c1205420hTQ.getClass();
        c1205420hTQ.LIZIZ = false;
        c1205420hTQ.LIZ = SystemClock.elapsedRealtime();
        ((IScreenshotService) ServiceManager.get().getService(IScreenshotService.class)).LJI("homepage_nearby", new C1205220hT6(this));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565950qqv
    public final void onPagePause(int i) {
        super.onPagePause(i);
        C1205420hTQ c1205420hTQ = this.LL;
        c1205420hTQ.getClass();
        c1205420hTQ.LIZ();
        ((IScreenshotService) ServiceManager.get().getService(IScreenshotService.class)).LIZJ(null);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565950qqv
    public final void onPageResume(int i) {
        super.onPageResume(i);
        C1205420hTQ c1205420hTQ = this.LL;
        c1205420hTQ.getClass();
        c1205420hTQ.LIZIZ = false;
        c1205420hTQ.LIZ = SystemClock.elapsedRealtime();
        ((IScreenshotService) ServiceManager.get().getService(IScreenshotService.class)).LJI("homepage_nearby", new C1205220hT6(this));
    }
}
