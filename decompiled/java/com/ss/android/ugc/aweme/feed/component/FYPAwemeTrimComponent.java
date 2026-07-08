package com.ss.android.ugc.aweme.feed.component;

import X.AbstractC1255880imo;
import X.C01GW;
import X.C09QK;
import X.C0SR4;
import X.C0SR6;
import X.C1255920ims;
import X.C13BV;
import X.C1563580qn6;
import X.C1563700qnI;
import X.C1564280qoE;
import X.C1566140qrE;
import X.C1601390rm5;
import X.C2188561Al4;
import X.C299750Boz;
import X.C300500BqC;
import X.C452501pT;
import X.C476250Ilz;
import X.C630740Ooa;
import X.EnumC452301pR;
import X.InterfaceC1563590qn7;
import X.InterfaceC1565950qqv;
import X.InterfaceC2188711AlJ;
import X.InterfaceC606860NrA;
import Y.ARunnableS124S0100000_24;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility;
import com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS140S0110000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FYPAwemeTrimComponent extends BasePanelComponent {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public C1563700qnI LLILZ;

    public final DataLayerAbility bo() {
        return (DataLayerAbility) this.LLILLJJLI.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0qnI, X.1AlJ] */
    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        DataLayerAbility dataLayerAbilityBo;
        if (C300500BqC.LIZLLL && !((Boolean) C300500BqC.LJ.getValue()).booleanValue() && (dataLayerAbilityBo = bo()) != null) {
            dataLayerAbilityBo.kh0(new InterfaceC606860NrA() { // from class: X.0qnC
                @Override // X.InterfaceC606860NrA
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC606860NrA
                public final void LIZJ() {
                }

                @Override // X.InterfaceC606860NrA
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC606860NrA
                public final void LJ() {
                }

                @Override // X.InterfaceC606860NrA
                public final void LJFF() {
                }

                @Override // X.InterfaceC606860NrA
                public final void fn() {
                }

                @Override // X.InterfaceC606860NrA
                public final void LIZ(List<? extends Aweme> list) {
                    C1564280qoE.LIZJ = 0;
                }

                @Override // X.InterfaceC606860NrA
                public final void fr(List<? extends Aweme> list) {
                    C786410Ut5.LJLIIL(500L, C2113808Pw.LIZIZ.LL, new ARunnableS124S0100000_24(this.LIZ, 153));
                }
            });
        }
        if (((Boolean) C300500BqC.LJI.getValue()).booleanValue()) {
            ?? r1 = new InterfaceC2188711AlJ() { // from class: X.0qnI
                @Override // X.InterfaceC2188711AlJ
                public final void LIZ(C1768270w7F c1768270w7F) {
                    C09QO c09qo;
                    if (c1768270w7F != null) {
                        c09qo = c1768270w7F.LIZIZ;
                    } else {
                        c09qo = null;
                    }
                    if (c09qo != C09QO.LOW_JAVA_MEM) {
                        return;
                    }
                    int i = c1768270w7F.LIZLLL;
                    if (i != 8 && i != 9) {
                        return;
                    }
                    C786410Ut5.LJJZZIII(C2113808Pw.LIZIZ.LL, new ARunnableS124S0100000_24(this.LIZ, 152));
                }
            };
            this.LLILZ = r1;
            C476250Ilz.LIZ.getClass();
            C2188561Al4.LJII(r1);
        }
    }

    public FYPAwemeTrimComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        C01GW c01gwLIZIZ3;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 389), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 1));
        }
        this.LL = c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 390), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 2));
        }
        this.LLILLJJLI = c01gwLIZIZ2;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa3 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 391), null);
            C1566140qrE.LIZJ(this, c630740Ooa3);
            c01gwLIZIZ3 = c630740Ooa3;
        } else {
            c01gwLIZIZ3 = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 3));
        }
        this.LLILLL = c01gwLIZIZ3;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        AbstractC1255880imo abstractC1255880imo;
        C0SR4 c0sr4Zv0;
        C0SR6 c0sr6;
        super.onDestroy();
        C1564280qoE.LIZJ = 0;
        C1563700qnI c1563700qnI = this.LLILZ;
        if (c1563700qnI != null) {
            C476250Ilz.LIZ.getClass();
            C09QK.LIZ(c1563700qnI);
        }
        this.LLILZ = null;
        if (((Boolean) C300500BqC.LJII.getValue()).booleanValue()) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.getValue();
            if (iFeedPanelPlatformAbility != null && (c0sr4Zv0 = iFeedPanelPlatformAbility.Zv0()) != null && (c0sr6 = c0sr4Zv0.LLJILJIL) != null) {
                c0sr6.LIZ();
            }
            IFeedFetchDataAbility iFeedFetchDataAbility = (IFeedFetchDataAbility) this.LLILLL.getValue();
            C1255920ims<?> c1255920imsKB1 = iFeedFetchDataAbility != null ? iFeedFetchDataAbility.KB1() : null;
            if (!(c1255920imsKB1 instanceof C1601390rm5) || c1255920imsKB1 == null || (abstractC1255880imo = (AbstractC1255880imo) c1255920imsKB1.LL) == null) {
                return;
            }
            abstractC1255880imo.setItems(C13BV.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static void m192do(int i) {
        if (((Boolean) C300500BqC.LJIIIIZZ.getValue()).booleanValue()) {
            C1564280qoE.LIZJ += i;
            C1563580qn6 c1563580qn6 = new C1563580qn6(i, C1564280qoE.LIZJ);
            C1564280qoE.LIZ.LIZJ(c1563580qn6);
            Iterator<InterfaceC1563590qn7> it2 = C1564280qoE.LIZIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(c1563580qn6);
            }
        }
    }
}
