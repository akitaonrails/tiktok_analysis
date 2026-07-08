package com.ss.android.ugc.feed.platform.cell.interact.mob;

import X.C01GW;
import X.C0H9H;
import X.C14LC;
import X.C1558520qew;
import X.C452501pT;
import X.C696660RUi;
import X.C709160Rrm;
import X.InterfaceC1554640qYg;
import X.InterfaceC1616070s9l;
import X.InterfaceC494301wD;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.interact.mob.InteractAreaHeightMobComponent;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public final class InteractAreaHeightMobComponent extends BaseCellContentComponent<InteractAreaHeightMobComponent> implements InteractAreaHeightMobAbility, InteractAreaMobCommonAbility, InterfaceC1554640qYg {
    public static final int LLLFF = C0H9H.LIZIZ(C14LC.LJIILIIL);
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new C696660RUi(this));
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public C709160Rrm LLJL;
    public View LLJLIL;
    public View LLJLILLLLZIIL;
    public View LLJLL;
    public Integer LLJLLIL;
    public Integer LLJLLL;
    public Integer LLJZ;
    public Integer LLJZIJLIL;
    public Integer LLL;
    public Integer LLLF;

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        this.LLJJL = false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -109404956 || iHashCode == 993373654) {
            return this;
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.mob.InteractAreaHeightMobAbility
    public final void Tb1(ComponentPriorityProtocol componentPriorityProtocol) {
        this.LLJLILLLLZIIL = componentPriorityProtocol.xb();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.mob.InteractAreaHeightMobAbility
    public final void fU(ComponentPriorityProtocol componentPriorityProtocol) {
        this.LLJLIL = componentPriorityProtocol.xb();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJL = (C709160Rrm) view.findViewById(R.id.bm5);
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJJJJLIIL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new InterfaceC1616070s9l() { // from class: X.0Rs6
                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onBeforePageChange() {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageScrolled(int i, float f, int i2) {
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageScrolledEnd(int i, float f, int i2) {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageSelected(int i) {
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
                public final void onPageScrollStateChanged(int i) {
                    Integer numValueOf;
                    Integer numValueOf2;
                    Integer numValueOf3;
                    Integer numValueOf4;
                    int iIntValue;
                    int iIntValue2;
                    int iIntValue3 = 0;
                    if (i == 0) {
                        this.LL.LLJJLIIIJLLLLLLLZ = false;
                        return;
                    }
                    InteractAreaHeightMobComponent interactAreaHeightMobComponent = this.LL;
                    if (interactAreaHeightMobComponent.LLJJLIIIJLLLLLLLZ) {
                        return;
                    }
                    interactAreaHeightMobComponent.LLJJLIIIJLLLLLLLZ = true;
                    C709160Rrm c709160Rrm = interactAreaHeightMobComponent.LLJL;
                    Object obj = null;
                    if (c709160Rrm != null) {
                        numValueOf = Integer.valueOf(c709160Rrm.getHeight());
                    } else {
                        numValueOf = null;
                    }
                    interactAreaHeightMobComponent.LLJZ = numValueOf;
                    InteractAreaHeightMobComponent interactAreaHeightMobComponent2 = this.LL;
                    View view2 = interactAreaHeightMobComponent2.LLJLIL;
                    if (view2 != null) {
                        numValueOf2 = Integer.valueOf(view2.getHeight());
                    } else {
                        numValueOf2 = null;
                    }
                    interactAreaHeightMobComponent2.LLJZIJLIL = numValueOf2;
                    InteractAreaHeightMobComponent interactAreaHeightMobComponent3 = this.LL;
                    View view3 = interactAreaHeightMobComponent3.LLJLILLLLZIIL;
                    if (view3 != null) {
                        numValueOf3 = Integer.valueOf(view3.getHeight());
                    } else {
                        numValueOf3 = null;
                    }
                    interactAreaHeightMobComponent3.LLL = numValueOf3;
                    InteractAreaHeightMobComponent interactAreaHeightMobComponent4 = this.LL;
                    View view4 = interactAreaHeightMobComponent4.LLJLL;
                    if (view4 != null) {
                        numValueOf4 = Integer.valueOf(view4.getHeight());
                    } else {
                        numValueOf4 = null;
                    }
                    interactAreaHeightMobComponent4.LLJLLL = numValueOf4;
                    this.LL.LLLF = Integer.valueOf(InteractAreaHeightMobComponent.LLLFF - C14LC.LJIILLIIL);
                    final InteractAreaHeightMobComponent interactAreaHeightMobComponent5 = this.LL;
                    C724270Sb3 c724270Sb3 = interactAreaHeightMobComponent5.LLJI;
                    if (c724270Sb3 != null) {
                        obj = c724270Sb3.LL;
                    }
                    final String aid = ((VideoItemParams) obj).getAweme().getAid();
                    Integer num = interactAreaHeightMobComponent5.LLJLLL;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    Integer num2 = interactAreaHeightMobComponent5.LLJLLIL;
                    if (num2 == null && (num2 = interactAreaHeightMobComponent5.LLJLLL) == null) {
                        iIntValue2 = 0;
                    } else {
                        iIntValue2 = num2.intValue();
                    }
                    int i2 = iIntValue - iIntValue2;
                    Integer num3 = interactAreaHeightMobComponent5.LLJZ;
                    if (num3 != null) {
                        iIntValue3 = num3.intValue();
                    }
                    final int i3 = iIntValue3 - i2;
                    if (!interactAreaHeightMobComponent5.LLJJL) {
                        return;
                    }
                    InterfaceC1483670oiD interfaceC1483670oiDLJIILL = C1483410ohn.LJLJJI().LJIILL();
                    if (interfaceC1483670oiDLJIILL != null) {
                        interfaceC1483670oiDLJIILL.LJJLIIIJILLIZJL(C0RRP.G_VIEW_POS.toString(), aid);
                    }
                    C709340Rs4.LIZIZ(new Runnable() { // from class: X.0Rs7
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference incomplete: some casts might be missing */
                        public final void LIZ() {
                            C01GW c01gw = C709340Rs4.LIZ;
                            String str = aid;
                            Integer numValueOf5 = Integer.valueOf(i3);
                            InteractAreaHeightMobComponent interactAreaHeightMobComponent6 = interactAreaHeightMobComponent5;
                            Integer num4 = interactAreaHeightMobComponent6.LLJZIJLIL;
                            Integer num5 = interactAreaHeightMobComponent6.LLL;
                            Integer num6 = interactAreaHeightMobComponent6.LLLF;
                            if (str != null) {
                                C199596137q c199596137q = C709340Rs4.LIZJ;
                                C709400RsA c709400RsA = (C709400RsA) c199596137q.LIZ(str, new Callable() { // from class: X.0Rs8
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        C1C7U.LIZ("InteractAreaMobParamManager@d5cb.setHeightParams$old$1");
                                        C709400RsA c709400RsA2 = new C709400RsA(0);
                                        C1C7U.LIZIZ("InteractAreaMobParamManager@d5cb.setHeightParams$old$1");
                                        return c709400RsA2;
                                    }
                                });
                                C709400RsA c709400RsA2 = new C709400RsA(0);
                                if (num4 == null) {
                                    num4 = c709400RsA.LIZIZ;
                                }
                                c709400RsA2.LIZIZ = num4;
                                if (numValueOf5 == null) {
                                    numValueOf5 = c709400RsA.LIZ;
                                }
                                c709400RsA2.LIZ = numValueOf5;
                                if (num5 == null) {
                                    num5 = c709400RsA.LIZJ;
                                }
                                c709400RsA2.LIZJ = num5;
                                if (num6 == null) {
                                    num6 = c709400RsA.LIZLLL;
                                }
                                c709400RsA2.LIZLLL = num6;
                                c199596137q.LL.put((K) str, (V) c709400RsA2);
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("InteractAreaHeightMobComponent@2ee9.setParamsInner$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("InteractAreaHeightMobComponent@2ee9.setParamsInner$1");
                        }
                    });
                }
            });
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.mob.InteractAreaHeightMobAbility
    public final void qd2(ComponentPriorityProtocol componentPriorityProtocol) {
        this.LLJLL = componentPriorityProtocol.xb();
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        this.LLJJL = true;
        this.LLJLLIL = null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.mob.InteractAreaMobCommonAbility
    public final void gW1(boolean z, boolean z2) {
        Integer numValueOf;
        if (z && z2) {
            View view = this.LLJLL;
            if (view != null) {
                numValueOf = Integer.valueOf(view.getHeight());
            } else {
                numValueOf = null;
            }
            this.LLJLLIL = numValueOf;
        }
    }
}
