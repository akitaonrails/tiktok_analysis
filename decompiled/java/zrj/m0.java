package zrj;

import X.AbstractC1252750ihl;
import X.AbstractC1653180t7c;
import X.AbstractC214814194y;
import X.C004I;
import X.C01GW;
import X.C0CHQ;
import X.C0LCS;
import X.C0LGN;
import X.C1170060gYO;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C13LE;
import X.C1631190sY9;
import X.C1634100scq;
import X.C1644460stY;
import X.C1645380sv2;
import X.C1653330t7r;
import X.C1664740tQG;
import X.C1664750tQH;
import X.C1664770tQJ;
import X.C1765020w20;
import X.C1DRG;
import X.C2217381BqS;
import X.C2298208zU;
import X.C452501pT;
import X.C578760Mmw;
import X.C578820Mn2;
import X.EnumC20228014Cw;
import X.InterfaceC1166920gTK;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1648570t0B;
import X.InterfaceC1650230t2r;
import X.InterfaceC1653190t7d;
import X.InterfaceC1653360t7u;
import X.InterfaceC1685420txc;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC420801kM;
import X.InterfaceC570310MYj;
import X.InterfaceC578770Mmx;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import Y.AObjectS246S0100000_25;
import a6n.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import lnn.q;
import lth.o;
import zrj.m0;

/* JADX INFO: loaded from: classes26.dex */
public final class m0 implements InterfaceC1653190t7d, InterfaceC1166920gTK {
    public static final C578820Mn2 LLJJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final String LL;
    public final String LLILLJJLI;
    public final boolean LLILZ;
    public final C1DRG LLILZIL;
    public ShortVideoContextViewModel LLILZLL;
    public InterfaceC1650230t2r LLIZ;
    public a LLIZLLLIL;
    public final q LLJ;
    public final C1664750tQH LLJI;
    public final C0LGN LLJIJIL;
    public final C1664740tQG LLJILJIL;
    public final C1664740tQG LLJILJILJ;
    public final String LLILLL = "quick_photo";
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1201));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1202));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(m0.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(m0.class, "lazyBeautyFilterLogic", "getLazyBeautyFilterLogic()Lcom/ss/android/ugc/aweme/property/BeautyFilterConfig;", 0), new C2217381BqS(m0.class, "lazyControlProgressConfig", "getLazyControlProgressConfig()Lcom/ss/android/ugc/aweme/property/LazyLoadControlProgressComponentConfig;", 0)};
        LLJJI = new C578820Mn2();
    }

    @Override // X.InterfaceC1653190t7d
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final void LIZ() {
        ShortVideoContextViewModel shortVideoContextViewModel = this.LLILZLL;
        C578760Mmw c578760Mmw = null;
        if (shortVideoContextViewModel == null) {
            shortVideoContextViewModel = null;
        }
        boolean zLJJIIJZLJL = shortVideoContextViewModel.LL.LJJIIJZLJL();
        InterfaceC578770Mmx interfaceC578770Mmx = (InterfaceC578770Mmx) this.LLJILLL.getValue();
        AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(this, 1148);
        AwS604S0100000_25 awS604S0100000_25 = new AwS604S0100000_25(this, 960);
        ShortVideoContextViewModel shortVideoContextViewModel2 = this.LLILZLL;
        if (shortVideoContextViewModel2 == null) {
            shortVideoContextViewModel2 = null;
        }
        if (shortVideoContextViewModel2.LL.creativeModel.initialModel.recordPageOptionalConfig != null) {
            InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
            a aVar = this.LLIZLLLIL;
            if (aVar == null) {
                aVar = null;
            }
            String strLIZIZ = C2298208zU.LIZIZ(pathService, aVar.LIZLLL().creativeInfo, EnumC20228014Cw.RECORD_CACHE_FILE, "photo", 8);
            ShortVideoContextViewModel shortVideoContextViewModel3 = this.LLILZLL;
            c578760Mmw = new C578760Mmw(strLIZIZ, Boolean.valueOf((shortVideoContextViewModel3 != null ? shortVideoContextViewModel3 : null).LL.creativeModel.initialModel.recordPageOptionalConfig != null), Boolean.valueOf(zLJJIIJZLJL), new AwS604S0100000_25(this, 961));
        } else if (zLJJIIJZLJL) {
            c578760Mmw = new C578760Mmw((Boolean) null, Boolean.TRUE, (Function1) null, 11);
        }
        interfaceC578770Mmx.LIZ(awS566S0100000_22, awS604S0100000_25, c578760Mmw);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle;
        Scene scene = (Scene) this.LLILZIL.LJIIL(null, AbstractC214814194y.class);
        if (scene != null && (lifecycle = scene.getLifecycle()) != null) {
            return lifecycle;
        }
        a aVar = this.LLIZLLLIL;
        return (aVar != null ? aVar : null).LIZ().getLifecycle();
    }

    @Override // X.InterfaceC1653190t7d
    public final AbstractC1653180t7c provideScene() {
        return (AbstractC1653180t7c) this.LLJJ.getValue();
    }

    @Override // X.InterfaceC1653190t7d
    public final C1653330t7r createBottomTabItem(final a aVar) {
        return new C1653330t7r(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, new InterfaceC1653360t7u() { // from class: X.0t2A
            @Override // X.InterfaceC1653360t7u
            public final void onCelebrationStyleApplied(String str) {
            }

            @Override // X.InterfaceC1653360t7u
            public final void onTabChanged(Object obj, Object obj2, C1653300t7o c1653300t7o) {
            }

            @Override // X.InterfaceC1653360t7u
            public final boolean onTabSelected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                InterfaceC1630630sXF interfaceC1630630sXF;
                aVar.LIZLLL().shootMode = 2;
                C1439190nYT.LJIIIIZZ(2);
                a aVar2 = aVar;
                if (aVar2.LIZ) {
                    InterfaceC1646290swV interfaceC1646290swV = aVar2.LIZIZ;
                    if (interfaceC1646290swV != null) {
                        interfaceC1646290swV.n3("record");
                    }
                } else {
                    ln3.a aVar3 = aVar2.LIZLLL;
                    if (aVar3 != null) {
                        aVar3.n3("record");
                    }
                }
                ((com.ss.android.ugc.aweme.shortvideo.component.a) this.LLILZIL.LJII(com.ss.android.ugc.aweme.shortvideo.component.a.class, null)).eP2(true);
                ShortVideoContextViewModel shortVideoContextViewModel = this.LLILZLL;
                if (shortVideoContextViewModel == null) {
                    shortVideoContextViewModel = null;
                }
                shortVideoContextViewModel.LLILLJJLI.put("photo_mode", Boolean.TRUE);
                InterfaceC1650230t2r interfaceC1650230t2r = this.LLIZ;
                if (interfaceC1650230t2r == null) {
                    interfaceC1650230t2r = null;
                }
                interfaceC1650230t2r.qh(0);
                m0 m0Var = this;
                if (C1631200sYA.LIZ((C1631190sY9) m0Var.LLJILJILJ.getValue(m0Var, m0.LLJJIII[2]))) {
                    ((C0ETY) this.LLILZIL.LJII(C0ETY.class, null)).Sd(InterfaceC1630630sXF.class, new AwS604S0100000_25(aVar, 959));
                } else {
                    InterfaceC1649820t2C interfaceC1649820t2C = (InterfaceC1649820t2C) this.LLILZIL.LJII(InterfaceC1649820t2C.class, null);
                    if ((interfaceC1649820t2C instanceof InterfaceC1630630sXF) && (interfaceC1630630sXF = (InterfaceC1630630sXF) interfaceC1649820t2C) != null) {
                        interfaceC1630630sXF.LZ1(EnumC1648530t07.DEFAULT);
                    }
                    interfaceC1649820t2C.Hn(1, true);
                    InterfaceC376620Epg interfaceC376620Epg = o.LIZJ;
                    String str = aVar.LIZLLL().shootWay;
                    interfaceC376620Epg.getClass();
                    C1649810t2B c1649810t2B = new C1649810t2B();
                    C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
                    c1649810t2B.LJFF("shoot_way", str, c2082308Dt);
                    c1649810t2B.LJFF("shoot_type", "photo_shoot", c2082308Dt);
                    c1649810t2B.LJIILJJIL();
                    interfaceC1649820t2C.hF2(false, false);
                }
                if (!aVar.LIZLLL().mIsFromDraft) {
                    aVar.LIZLLL().mIsPhotoMvModeMusic = false;
                }
                return true;
            }

            @Override // X.InterfaceC1653360t7u
            public final boolean onTabUnselected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                ShortVideoContextViewModel shortVideoContextViewModel = this.LLILZLL;
                if (shortVideoContextViewModel == null) {
                    shortVideoContextViewModel = null;
                }
                shortVideoContextViewModel.LLILLJJLI.put("photo_mode", Boolean.FALSE);
                if (!aVar.LIZLLL().mIsFromDraft) {
                    aVar.LIZLLL().mIsPhotoMvModeMusic = false;
                    return true;
                }
                return true;
            }
        }, null, false, null, null, 480);
    }

    @Override // X.InterfaceC1653190t7d
    public final void initialize(a aVar) {
        this.LLIZLLLIL = aVar;
        this.LLILZLL = (ShortVideoContextViewModel) ((ViewModelProvider) this.LLILZIL.LJII(ViewModelProvider.class, null)).get(ShortVideoContextViewModel.class);
        this.LLIZ = aVar.LIZIZ();
        InterfaceC1648570t0B interfaceC1648570t0B = aVar.LJIIIZ;
        if (interfaceC1648570t0B == null) {
            interfaceC1648570t0B = null;
        }
        interfaceC1648570t0B.qK0().LIZ((LifecycleOwner) this.LLILZIL.LJII(LifecycleOwner.class, null), new AObjectS246S0100000_25(this, 729));
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    public m0(String str, String str2, boolean z, C1DRG c1drg) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILZ = z;
        this.LLILZIL = c1drg;
        this.LLJ = (q) c1drg.LJIIL(null, q.class);
        this.LLJI = C1664770tQJ.LIZ(c1drg, com.ss.android.ugc.aweme.shortvideo.component.a.class, null);
        this.LLJIJIL = (C0LGN) c1drg.LJIIL(null, C0LGN.class);
        this.LLJILJIL = new C1664740tQG(c1drg.LJIILIIL("lazyBeautyFilter", C1645380sv2.class), C1645380sv2.class);
        this.LLJILJILJ = new C1664740tQG(c1drg.LJIILIIL("lazyControlProgressConfig", C1631190sY9.class), C1631190sY9.class);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
