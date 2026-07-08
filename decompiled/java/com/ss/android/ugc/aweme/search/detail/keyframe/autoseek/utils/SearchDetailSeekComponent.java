package com.ss.android.ugc.aweme.search.detail.keyframe.autoseek.utils;

import X.C01GW;
import X.C0RD6;
import X.C1566140qrE;
import X.C2189821An6;
import X.C299750Boz;
import X.C452501pT;
import X.C630740Ooa;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import X.InterfaceC1616070s9l;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.search.detail.keyframe.autoseek.utils.SearchDetailSeekComponent;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.AwS130S0110000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class SearchDetailSeekComponent extends BasePanelComponent {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public Float LLILZ;

    public final void bo() {
        Float f = this.LLILZ;
        if (f != null) {
            float fFloatValue = f.floatValue();
            IPlayerComponentAbility iPlayerComponentAbility = (IPlayerComponentAbility) this.LLILLL.getValue();
            if (iPlayerComponentAbility != null) {
                iPlayerComponentAbility.dO0(fFloatValue * 100.0f);
            }
        }
    }

    public SearchDetailSeekComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS556S0100000_12((InterfaceC1565950qqv) this, 577), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS130S0110000_12(false, (InterfaceC1565950qqv) this, 19));
        }
        this.LL = c01gwLIZIZ;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 578));
        this.LLILLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 576));
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        DetailNavArgModel navArgModel;
        Float searchSeekProgress;
        super.onParentViewCreated();
        final C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        if (c2189821An6 == null || (navArgModel = c2189821An6.getNavArgModel()) == null || (searchSeekProgress = navArgModel.getSearchSeekProgress()) == null) {
            return;
        }
        float fFloatValue = searchSeekProgress.floatValue();
        if (0.0f > fFloatValue || fFloatValue > 1.0f) {
            return;
        }
        this.LLILZ = searchSeekProgress;
        final IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILLJJLI.getValue();
        if (iViewPagerComponentAbility == null) {
            return;
        }
        iViewPagerComponentAbility.Bv0(new InterfaceC1616070s9l() { // from class: X.0T2N
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
                IFeedPanelPlatformAbility iFeedPanelPlatformAbility;
                String aid;
                IPlayerComponentAbility iPlayerComponentAbilityX32;
                C0N0Y playerManager;
                String strLJJJLIIL;
                Aweme awemeLJIIIIZZ;
                C0SZ8 c0sz8LJLIL = iViewPagerComponentAbility.LJLIL();
                if (c0sz8LJLIL != null) {
                    IViewPagerComponentAbility iViewPagerComponentAbility2 = iViewPagerComponentAbility;
                    C2189821An6 c2189821An62 = c2189821An6;
                    SearchDetailSeekComponent searchDetailSeekComponent = this;
                    iViewPagerComponentAbility2.Xl0(this);
                    InterfaceC665370Q7z interfaceC665370Q7zLIZ = C0T0K.LIZ(c0sz8LJLIL);
                    if (interfaceC665370Q7zLIZ != null) {
                        iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, IFeedPanelPlatformAbility.class, null);
                        if (iFeedPanelPlatformAbility != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbility.LJIIIIZZ()) != null) {
                            aid = awemeLJIIIIZZ.getAid();
                        }
                        if (!Intrinsics.LJFF(aid, c2189821An62.getAid()) && iFeedPanelPlatformAbility != null && (iPlayerComponentAbilityX32 = iFeedPanelPlatformAbility.x32()) != null && (playerManager = iPlayerComponentAbilityX32.getPlayerManager()) != null && (strLJJJLIIL = playerManager.LJJJLIIL()) != null && strLJJJLIIL.length() > 0) {
                            searchDetailSeekComponent.bo();
                            searchDetailSeekComponent.LLILZ = null;
                            return;
                        }
                        return;
                    }
                    iFeedPanelPlatformAbility = null;
                    aid = null;
                    if (!Intrinsics.LJFF(aid, c2189821An62.getAid())) {
                    }
                }
            }
        });
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        c0rd6.LIZIZ("event_on_render_first_frame", new AwS591S0100000_12(this, 644));
    }
}
