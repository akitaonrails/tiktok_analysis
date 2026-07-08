package com.ss.android.ugc.aweme.tako.aivideo.detail.assem;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C05P0;
import X.C05P1;
import X.C05VF;
import X.C05VX;
import X.C05VZ;
import X.C09R3;
import X.C0MXE;
import X.C0QSJ;
import X.C0T1R;
import X.C1220000hqw;
import X.C1244280iU6;
import X.C127G;
import X.C13D2;
import X.C13LE;
import X.C13Z4;
import X.C13ZC;
import X.C1637806bA;
import X.C1637906bB;
import X.C1665740tRs;
import X.C1665790tRx;
import X.C1665930tSB;
import X.C1668040tVa;
import X.C1668650tWZ;
import X.C1669670tYD;
import X.C1670410tZP;
import X.C1671550tbF;
import X.C1672220tcK;
import X.C1675290thH;
import X.C1676510tjF;
import X.C1676540tjI;
import X.C1676550tjJ;
import X.C1676630tjR;
import X.C1676680tjW;
import X.C1677480tko;
import X.C1677710tlB;
import X.C1679460to0;
import X.C1679570toB;
import X.C1679660toK;
import X.C1679930tol;
import X.C1680510tph;
import X.C1680520tpi;
import X.C1680540tpk;
import X.C1682210tsR;
import X.C1682520tsw;
import X.C1685720ty6;
import X.C1685760tyA;
import X.C1687230u0X;
import X.C1687240u0Y;
import X.C1687250u0Z;
import X.C1687290u0d;
import X.C1687370u0l;
import X.C1687990u1l;
import X.C1688130u1z;
import X.C1690080u58;
import X.C1690130u5D;
import X.C1857750yRZ;
import X.C19719912Dl;
import X.C20028913Yh;
import X.C20030013Ys;
import X.C20055113dV;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C687700QyG;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.EnumC1679580toC;
import X.EnumC325100Com;
import X.InterfaceC1146704e9;
import X.InterfaceC1668050tVb;
import X.InterfaceC1680500tpg;
import X.InterfaceC1682240tsU;
import X.InterfaceC1684280tvm;
import X.InterfaceC1685750ty9;
import X.InterfaceC1687280u0c;
import X.InterfaceC1690500u5o;
import X.InterfaceC20032213Zo;
import X.InterfaceC20053113dB;
import X.InterfaceC2217451BqZ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC497601wk;
import X.InterfaceC665370Q7z;
import Y.AObjectS399S0100000_25;
import android.view.View;
import androidx.compose.foundation.layout.c;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.tako.aivideo.detail.ability.TakoAIVideoOverlayAbility;
import com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoFeedViewModel;
import com.ss.android.ugc.aweme.tako.aivideo.detail.scope.TakoAIVideoDetailScope;
import com.ss.android.ugc.aweme.tako.aivideo.detail.vm.AIVideoBottomTextInputViewModel;
import com.ss.android.ugc.aweme.tako.aivideo.detail.vm.AiVideoViewModel;
import h0.n2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS11S0211000_25;
import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS20S0111000_25;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS460S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS674S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;
import tiktok.compose.assem.UiComposableAssem;

/* JADX INFO: loaded from: classes26.dex */
public final class TakoAIVideoInputAssem extends UiComposableAssem<C1679570toB> implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public View LLJI;
    public final AssemVMLazy LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final C736950SvV LLJILJILJ;
    public volatile C05VZ LLJILLL;
    public volatile InterfaceC1682240tsU LLJJ;
    public volatile InterfaceC1687280u0c LLJJI;
    public volatile TakoAIVideoOverlayAbility LLJJIII;
    public C127G LLJJIJI;
    public InterfaceC665370Q7z LLJJIJIIJIL;
    public C0QSJ LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoAIVideoInputAssem.class, "heightAbility", "getHeightAbility()Lcom/ss/android/ugc/aweme/tako/aivideo/detail/ability/TakoAIVideoBottomHeightAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TakoAIVideoInputAssem.class, "hostAbility", "getHostAbility()Lcom/ss/android/ugc/aweme/tako/aivideo/detail/ability/TakoAIVideoHostAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(TakoAIVideoInputAssem.class, "preloadAbility", "getPreloadAbility()Lcom/ss/android/ugc/aweme/tako/aivideo/detail/ability/TakoAIVideoPreloadAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(TakoAIVideoInputAssem.class, "overlayAbility", "getOverlayAbility()Lcom/ss/android/ugc/aweme/tako/aivideo/detail/ability/TakoAIVideoOverlayAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(TakoAIVideoInputAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/tako/aivideo/detail/vm/AIVideoBottomTextInputViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(TakoAIVideoInputAssem.class, "aiVideoViewModel", "getAiVideoViewModel()Lcom/ss/android/ugc/aweme/tako/aivideo/detail/vm/AiVideoViewModel;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoAIVideoDetailScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoAIVideoDetailScope.class);
        return arrayList;
    }

    public TakoAIVideoInputAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AIVideoBottomTextInputViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS569S0100000_25(c19719912DlLIZ, 440), AFwS266S0000000_25.get$arr$(252), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(AiVideoViewModel.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS569S0100000_25(c19719912DlLIZ2, 441), AFwS266S0000000_25.get$arr$(253), null, true);
        AFwS214S0000000_25 aFwS214S0000000_25 = AFwS214S0000000_25.get$arr$(225);
        this.LLJILJILJ = new C736950SvV(C13LE.LIZ(TakoAIVideoFeedViewModel.class), aFwS214S0000000_25, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS266S0000000_25.get$arr$(251), new AwS571S0100000_27((AbstractC738140SxQ) this, 627), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    public final C0QSJ So() {
        C0QSJ c0qsj = this.LLJJIJIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJIJIIJIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJJIJIIJIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{TakoAIVideoDetailScope.class});
        this.LLJJIJIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final AiVideoViewModel Zo() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (AiVideoViewModel) assemVMLazy.getValue();
    }

    public final InterfaceC1682240tsU ap() {
        InterfaceC1682240tsU interfaceC1682240tsU;
        InterfaceC1682240tsU interfaceC1682240tsU2 = this.LLJJ;
        if (interfaceC1682240tsU2 == null) {
            synchronized (this) {
                interfaceC1682240tsU2 = this.LLJJ;
                if (interfaceC1682240tsU2 == null) {
                    C0QSJ c0qsjSo = So();
                    if (c0qsjSo != null) {
                        interfaceC1682240tsU = (InterfaceC1682240tsU) c0qsjSo.getAbility(InterfaceC1682240tsU.class);
                        C687700QyG.LJ(interfaceC1682240tsU, InterfaceC1682240tsU.class);
                    } else {
                        interfaceC1682240tsU = null;
                    }
                    this.LLJJ = interfaceC1682240tsU;
                    return interfaceC1682240tsU;
                }
            }
        }
        return interfaceC1682240tsU2;
    }

    public final InterfaceC1687280u0c bp() {
        InterfaceC1687280u0c interfaceC1687280u0c;
        InterfaceC1687280u0c interfaceC1687280u0c2 = this.LLJJI;
        if (interfaceC1687280u0c2 == null) {
            synchronized (this) {
                interfaceC1687280u0c2 = this.LLJJI;
                if (interfaceC1687280u0c2 == null) {
                    C0QSJ c0qsjSo = So();
                    if (c0qsjSo != null) {
                        interfaceC1687280u0c = (InterfaceC1687280u0c) c0qsjSo.getAbility(InterfaceC1687280u0c.class);
                        C687700QyG.LJ(interfaceC1687280u0c, InterfaceC1687280u0c.class);
                    } else {
                        interfaceC1687280u0c = null;
                    }
                    this.LLJJI = interfaceC1687280u0c;
                    return interfaceC1687280u0c;
                }
            }
        }
        return interfaceC1687280u0c2;
    }

    public final AIVideoBottomTextInputViewModel cp() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (AIVideoBottomTextInputViewModel) assemVMLazy.getValue();
    }

    public final Integer Vo() {
        Fragment fragment;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ;
        Object objAp = ap();
        if ((objAp instanceof Fragment) && (fragment = (Fragment) objAp) != null && (iFeedPanelPlatformAbilityLIZJ = C0T1R.LIZJ(fragment)) != null) {
            Integer numValueOf = Integer.valueOf(iFeedPanelPlatformAbilityLIZJ.LJLLJ());
            if (numValueOf.intValue() >= 0) {
                return numValueOf;
            }
        }
        return null;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJIJI;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJIJI;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{AIVideoBottomTextInputViewModel.class, new AObjectS399S0100000_25(this, 1), AiVideoViewModel.class, new AObjectS399S0100000_25(this, 0)}, defaultViewModelProviderFactory);
                    this.LLJJIJI = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // tiktok.compose.assem.UiComposableAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJI = view;
        C736680Sv4.LJIIIIZZ(this, Zo(), new C2217381BqS() { // from class: X.0u0a
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1687320u0g) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), new AwS460S0200000_25(this, view, 0), 4);
    }

    public final void Jo(boolean z, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-673105566);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C05P0 c05p0LIZ = C1244280iU6.LIZ(Zo(), null, c13zcLJIIJ, 0, 7);
            C1690080u58 c1690080u58LIZ = C1690130u5D.LIZ(0, 0, c13zcLJIIJ, 0, 3);
            AFwS214S0000000_25 aFwS214S0000000_25 = AFwS214S0000000_25.get$arr$(223);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C1680540tpk.LJIIIIZZ((CoroutineContext) aFwS214S0000000_25.invoke(), c13zcLJIIJ);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) objLJJ;
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(c1690080u58LIZ) | c13zcLJIIJ.LJJIIJ(interfaceC497601wk);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ || objLJJ2 == c1680520tpi) {
                objLJJ2 = new C05VF(c1690080u58LIZ, interfaceC497601wk);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            C05VF c05vf = (C05VF) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            boolean zLJJIIJ2 = c13zcLJIIJ.LJJIIJ(c05vf);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ2 || objLJJ3 == c1680520tpi) {
                objLJJ3 = new AwS581S0100000_2(c05vf, 318);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LIZIZ(c05vf, (Function1) objLJJ3, c13zcLJIIJ);
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = c.LIZLLL(c1685760tyA);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZLLL);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_252 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_252);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, g.a.LIZLLL);
                C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                InterfaceC1684280tvm interfaceC1684280tvm = (InterfaceC1684280tvm) c13zcLJIIJ.LJJIL(C20055113dV.LJIJI);
                InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(C20055113dV.LJII);
                c13zcLJIIJ.LJJIIJZLJL(-1633490746);
                boolean zLJJIIJ3 = c13zcLJIIJ.LJJIIJ(interfaceC1684280tvm) | c13zcLJIIJ.LJJIIJ(interfaceC1690500u5o);
                Object objLJJ4 = c13zcLJIIJ.LJJ();
                if (zLJJIIJ3 || objLJJ4 == c1680520tpi) {
                    objLJJ4 = new C1668650tWZ(interfaceC1690500u5o.LJJI((int) (interfaceC1684280tvm.LIZIZ() >> 32)) - 74);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ4);
                }
                float f = ((C1668650tWZ) objLJJ4).LL;
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ5 = c13zcLJIIJ.LJJ();
                if (objLJJ5 == c1680520tpi) {
                    objLJJ5 = new C1677480tko(new C1668650tWZ(52), n2.LIZJ, null, 12);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ5);
                }
                C1677480tko c1677480tko = (C1677480tko) objLJJ5;
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(-1746271574);
                if ((i2 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean zLJJIIJ4 = z2 | c13zcLJIIJ.LJJIIJ(interfaceC1690500u5o) | c13zcLJIIJ.LJII(c1677480tko);
                Object objLJJ6 = c13zcLJIIJ.LJJ();
                if (zLJJIIJ4 || objLJJ6 == c1680520tpi) {
                    objLJJ6 = new C05VX(this, interfaceC1690500u5o, c1677480tko, null);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ6);
                }
                c13zcLJIIJ.LJJJJL(false);
                C1680540tpk.LJFF(interfaceC1690500u5o, (Function2) objLJJ6, c13zcLJIIJ);
                C1682210tsR.LIZ(c05p0LIZ, ap(), c05vf, z, c1672220tcK.LIZIZ(c.LJIILLIIL(C1682520tsw.LJIIL(c1685760tyA, 0.0f, 0.0f, 0.0f, ((C1668650tWZ) c1677480tko.LIZLLL()).LL, 7), f), C1668040tVa.LJII), c13zcLJIIJ, (i2 << 9) & 7168, 0);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS20S0111000_25(this, z, i, 0);
        }
    }

    public final void No(boolean z, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(121580012);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            TakoAIVideoOverlayAbility takoAIVideoOverlayAbility = this.LLJJIII;
            if (takoAIVideoOverlayAbility == null) {
                synchronized (this) {
                    takoAIVideoOverlayAbility = this.LLJJIII;
                    if (takoAIVideoOverlayAbility == null) {
                        C0QSJ c0qsjSo = So();
                        if (c0qsjSo != null) {
                            takoAIVideoOverlayAbility = (TakoAIVideoOverlayAbility) c0qsjSo.getAbility(TakoAIVideoOverlayAbility.class);
                            C687700QyG.LJ(takoAIVideoOverlayAbility, TakoAIVideoOverlayAbility.class);
                        } else {
                            takoAIVideoOverlayAbility = null;
                        }
                        this.LLJJIII = takoAIVideoOverlayAbility;
                    }
                }
            }
            if (((Boolean) C20028913Yh.LIZIZ(takoAIVideoOverlayAbility.Vg2(), c13zcLJIIJ, 0).getValue()).booleanValue()) {
                C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
                if (c20030013YsLJJJJZI != null) {
                    c20030013YsLJJJJZI.LIZLLL = new AwS20S0111000_25(this, z, i, 1);
                    return;
                }
                return;
            }
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(bp().LLF());
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            Unit unit = Unit.LIZ;
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            if ((i2 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (z2 || objLJJ2 == c1680520tpi) {
                objLJJ2 = new C1687230u0X(this, c05p0, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(unit, (Function2) objLJJ2, c13zcLJIIJ);
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = c.LIZLLL(c1685760tyA);
            InterfaceC1668050tVb.LIZ.getClass();
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LIZJ, C1668040tVa.LJIILJJIL, c13zcLJIIJ, 48);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZLLL);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, g.a.LIZLLL);
                C1687990u1l c1687990u1l = C1687990u1l.LIZ;
                C1665790tRx.LIZ(c.LIZIZ(c1685760tyA, 0.4f), c13zcLJIIJ);
                C1676540tjI c1676540tjILIZIZ = C1676510tjF.LJ(0.0f, C1671550tbF.LIZLLL(200, 0, new C1677710tlB(0.0f, 0.0f, 1.0f, 1.0f), 2)).LIZIZ(C1676510tjF.LJIIIIZZ(C1671550tbF.LIZLLL(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 0, new C1677710tlB(0.32f, 0.94f, 0.6f, 1.0f), 2), 0.0f, 6));
                C1676550tjJ c1676550tjJLIZIZ = C1676510tjF.LJI(0.0f, C1671550tbF.LIZLLL(200, 0, new C1677710tlB(0.0f, 0.0f, 1.0f, 1.0f), 2)).LIZIZ(C1676510tjF.LJIIIZ(C1671550tbF.LIZLLL(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 0, new C1677710tlB(0.32f, 0.94f, 0.6f, 1.0f), 2), 0.0f, 6));
                InterfaceC1685750ty9 interfaceC1685750ty9LJIJJ = c.LJIJJ(c1685760tyA, null, 3);
                long j = C1676680tjW.LIZIZ;
                int i5 = ((i2 << 3) & 112) | 1600518;
                C1676630tjR.LIZLLL(c1687990u1l, z, C1679660toK.LIZIZ(interfaceC1685750ty9LJIJJ, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, j, null, false, 0, 130047), c1676540tjILIZIZ, c1676550tjJLIZIZ, null, C13Z4.LIZJ(1439842362, new AwS674S0100000_25(c05p0, (C05P0<String>) 23), c13zcLJIIJ), c13zcLJIIJ, i5, 16);
                C1676630tjR.LIZLLL(c1687990u1l, z, C1682520tsw.LJIIL(C1679660toK.LIZIZ(c.LJIJJ(c1685760tyA, null, 3), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, j, null, false, 0, 130047), 0.0f, 20, 0.0f, 0.0f, 13), C1676510tjF.LJ(0.0f, C1671550tbF.LIZLLL(200, 0, new C1677710tlB(0.0f, 0.0f, 1.0f, 1.0f), 2)), C1676510tjF.LJI(0.0f, C1671550tbF.LIZLLL(200, 0, new C1677710tlB(0.0f, 0.0f, 1.0f, 1.0f), 2)), null, C1675290thH.LIZ, c13zcLJIIJ, i5, 16);
                C1665790tRx.LIZ(c1687990u1l.LIZ(c1685760tyA, 6.0f, true), c13zcLJIIJ);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI2 = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI2 != null) {
            c20030013YsLJJJJZI2.LIZLLL = new AwS20S0111000_25(this, z, i, 2);
        }
    }

    @Override // tiktok.compose.assem.UiComposableAssem
    /* JADX INFO: renamed from: Oo, reason: merged with bridge method [inline-methods] */
    public final void Co(C1679570toB c1679570toB, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-344367937);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1679570toB)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1670410tZP.LIZ(C1669670tYD.LIZJ(c13zcLJIIJ), null, null, null, null, null, C13Z4.LIZJ(707219290, new AwS460S0200000_25(this, c1679570toB, 17), c13zcLJIIJ), c13zcLJIIJ, 1572864, 62);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(this, c1679570toB, i, 49);
        }
    }

    public final void Lo(C1679570toB c1679570toB, boolean z, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        String strLJII;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        EnumC325100Com networkStatus;
        boolean z10;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(876481919);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1679570toB)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(this)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C05P0 c05p0LIZIZ = C20028913Yh.LIZIZ(Zo().LLILLL, c13zcLJIIJ, 0);
            C05P0 c05p0LIZ = C1244280iU6.LIZ(Zo(), null, c13zcLJIIJ, 0, 7);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJ(new AwS569S0100000_25(c05p0LIZ, (C05P0<Boolean>) 439));
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P1 c05p1 = (C05P1) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C20028913Yh.LJ(new AwS569S0100000_25(c05p0LIZ, (C05P0<Boolean>) 438));
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            C05P1 c05p12 = (C05P1) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            Unit unit = Unit.LIZ;
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(c05p0LIZ);
            int i6 = i2 & 896;
            boolean z11 = true;
            if (i6 == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z12 = zLJJIIJ | z2;
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (z12 || objLJJ3 == c1680520tpi) {
                objLJJ3 = new C1687240u0Y(c05p0LIZ, this, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(unit, (Function2) objLJJ3, c13zcLJIIJ);
            Boolean boolValueOf = Boolean.valueOf(z);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            int i7 = i2 & 112;
            if (i7 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i6 == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z13 = z4 | z3;
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (z13 || objLJJ4 == c1680520tpi) {
                objLJJ4 = new C1687290u0d(z, this, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(boolValueOf, (Function2) objLJJ4, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(-1442242090);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ5 = c13zcLJIIJ.LJJ();
            if (objLJJ5 == c1680520tpi) {
                objLJJ5 = (INetworkStateService) PluggableExtentionKt.pluggableSpi$default(INetworkStateService.class, false, false, false, 14, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ5);
            }
            INetworkStateService iNetworkStateService = (INetworkStateService) objLJJ5;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ6 = c13zcLJIIJ.LJJ();
            if (objLJJ6 == c1680520tpi) {
                if (iNetworkStateService != null) {
                    networkStatus = iNetworkStateService.getNetworkStatus();
                } else {
                    networkStatus = null;
                }
                if (networkStatus == EnumC325100Com.NOT_AVAILABLE) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objLJJ6 = C20028913Yh.LJI(Boolean.valueOf(z10));
                c13zcLJIIJ.LJJIJIIJI(objLJJ6);
            }
            C05P0 c05p0 = (C05P0) objLJJ6;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJII = c13zcLJIIJ.LJII(iNetworkStateService);
            Object objLJJ7 = c13zcLJIIJ.LJJ();
            if (zLJII || objLJJ7 == c1680520tpi) {
                objLJJ7 = new AwS394S0200000_28(iNetworkStateService, (INetworkStateService) c05p0, (C05P0<Boolean>) 0);
                c13zcLJIIJ.LJJIJIIJI(objLJJ7);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LIZIZ(iNetworkStateService, (Function1) objLJJ7, c13zcLJIIJ);
            c13zcLJIIJ.LJJJJL(false);
            if (((Boolean) c05p0.getValue()).booleanValue()) {
                strLJII = C1857750yRZ.LJII(2131827517);
            } else {
                strLJII = C1857750yRZ.LJII(2131822568);
            }
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ8 = c13zcLJIIJ.LJJ();
            if (objLJJ8 == c1680520tpi) {
                objLJJ8 = C20028913Yh.LJI(null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ8);
            }
            C05P0 c05p02 = (C05P0) objLJJ8;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ9 = c13zcLJIIJ.LJJ();
            if (objLJJ9 == c1680520tpi) {
                objLJJ9 = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ9);
            }
            C05P0 c05p03 = (C05P0) objLJJ9;
            c13zcLJIIJ.LJJJJL(false);
            Boolean boolValueOf2 = Boolean.valueOf(z);
            EnumC1679580toC enumC1679580toC = c1679570toB.LLILLJJLI;
            Object value = c05p02.getValue();
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            if (i7 == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            int i8 = i2 & 14;
            if (i8 == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z14 = z5 | z6;
            if (i6 == 256) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z15 = z14 | z7;
            Object objLJJ10 = c13zcLJIIJ.LJJ();
            if (z15 || objLJJ10 == c1680520tpi) {
                objLJJ10 = new C1687250u0Z(z, c1679570toB, this, c05p02, c05p03, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ10);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LIZLLL(boolValueOf2, enumC1679580toC, value, (Function2) objLJJ10, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            if (i6 == 256) {
                z8 = true;
            } else {
                z8 = false;
            }
            Object objLJJ11 = c13zcLJIIJ.LJJ();
            if (z8 || objLJJ11 == c1680520tpi) {
                objLJJ11 = new AwS604S0100000_25(this, 321);
                c13zcLJIIJ.LJJIJIIJI(objLJJ11);
            }
            Function1 function1 = (Function1) objLJJ11;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            if (i6 == 256) {
                z9 = true;
            } else {
                z9 = false;
            }
            Object objLJJ12 = c13zcLJIIJ.LJJ();
            if (z9 || objLJJ12 == c1680520tpi) {
                objLJJ12 = new C1687370u0l(this);
                c13zcLJIIJ.LJJIJIIJI(objLJJ12);
            }
            c13zcLJIIJ.LJJJJL(false);
            Function1 function12 = (Function1) ((InterfaceC2217451BqZ) objLJJ12);
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            Object objLJJ13 = c13zcLJIIJ.LJJ();
            if (objLJJ13 == c1680520tpi) {
                objLJJ13 = new AwS604S0100000_25(c05p02, (C05P0<Boolean>) 322);
                c13zcLJIIJ.LJJIJIIJI(objLJJ13);
            }
            Function1 function13 = (Function1) objLJJ13;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            if (i6 != 256) {
                z11 = false;
            }
            Object objLJJ14 = c13zcLJIIJ.LJJ();
            if (z11 || objLJJ14 == c1680520tpi) {
                objLJJ14 = new AwS604S0100000_25(this, 323);
                c13zcLJIIJ.LJJIJIIJI(objLJJ14);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1679460to0.LJIIIIZZ(c1679570toB, c05p0LIZIZ, c05p1, z, c05p12, function1, function12, function13, strLJII, (Function1) objLJJ14, c13zcLJIIJ, i8 | 12607872 | ((i2 << 6) & 7168), 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS11S0211000_25(this, c1679570toB, z, i, 5);
        }
    }
}
