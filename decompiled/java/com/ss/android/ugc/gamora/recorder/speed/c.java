package com.ss.android.ugc.gamora.recorder.speed;

import X.AbstractC1252750ihl;
import X.AbstractC2255721DQs;
import X.C004I;
import X.C05YF;
import X.C09R3;
import X.C0LCS;
import X.C0MGL;
import X.C1170060gYO;
import X.C1171740gb6;
import X.C11DL;
import X.C11E5;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EE;
import X.C11EF;
import X.C13LE;
import X.C1631190sY9;
import X.C1631200sYA;
import X.C1634100scq;
import X.C1644460stY;
import X.C1651500t4u;
import X.C1652670t6n;
import X.C1652680t6o;
import X.C1654400t9a;
import X.C1654500t9k;
import X.C1654510t9l;
import X.C1658150tFd;
import X.C1664770tQJ;
import X.C1765020w20;
import X.C19A3;
import X.C1DRG;
import X.C2217381BqS;
import X.C385670FAf;
import X.C538770LBb;
import X.C560530Lyd;
import X.C577560Ml0;
import X.EnumC1650720t3e;
import X.EnumC1651770t5L;
import X.EnumC993100bwy;
import X.InterfaceC1166920gTK;
import X.InterfaceC1630630sXF;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1638550sk1;
import X.InterfaceC1647420syK;
import X.InterfaceC1648020szI;
import X.InterfaceC1649530t1j;
import X.InterfaceC1650230t2r;
import X.InterfaceC1651080t4E;
import X.InterfaceC1651490t4t;
import X.InterfaceC1652690t6p;
import X.InterfaceC1652700t6q;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import X.ViewOnLayoutChangeListenerC1698100uI4;
import Y.AObjectS246S0100000_25;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import pyl.s;

/* JADX INFO: loaded from: classes26.dex */
public final class c extends AbstractC2255721DQs<InterfaceC1649530t1j> implements InterfaceC1166920gTK, InterfaceC1649530t1j, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public static final int LLJLL;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final InterfaceC1649530t1j LLILLL = this;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1652690t6p.class, null);
    public final a LLILZIL = (a) getDiContainer().LJII(a.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1652700t6q.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1651080t4E.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1630630sXF.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), C1631190sY9.class, "lazyControlProgressConfig");
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1638550sk1.class, null);
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
    public final C538770LBb<Boolean> LLJILLL = new C538770LBb<>(Boolean.valueOf(W2().LIZLLL()));
    public final C538770LBb<Integer> LLJJ = new C538770LBb<>(0);
    public final C560530Lyd<Integer> LLJJI;
    public final C560530Lyd<s> LLJJIII;
    public final C560530Lyd<Boolean> LLJJIJI;
    public final C560530Lyd<C1644460stY<Integer, Integer, Integer, Integer>> LLJJIJIIJIL;
    public final C560530Lyd<Pair<Integer, Integer>> LLJJIJIL;
    public final h0<s> LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public boolean LLJJJJJIL;
    public C1654500t9k LLJJJJLIIL;
    public View LLJJL;
    public final ConcurrentHashSet<EnumC993100bwy> LLJJLIIIJLLLLLLLZ;
    public final C1652670t6n LLJL;
    public final LiveEvent<Integer> LLJLIL;

    @Override // X.InterfaceC960503pD, X.C11E6
    public LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public InterfaceC960503pD getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(c.class, "speedPanelShowStore", "getSpeedPanelShowStore()Lcom/ss/android/ugc/gamora/recorder/speed/ISpeedPanelShowPropertyStore;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(c.class, "commerceApiComponent", "getCommerceApiComponent()Lcom/ss/android/ugc/gamora/recorder/commerce/CommerceApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(c.class, "toolbarApiComponent", "getToolbarApiComponent()Lcom/ss/android/ugc/gamora/recorder/toolbar/refactory/ToolbarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(c.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(c.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(c.class, "lighteningControlApiComponent", "getLighteningControlApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/LighteningControlProgressApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(c.class, "lazyControlProgressConfig", "getLazyControlProgressConfig()Lcom/ss/android/ugc/aweme/property/LazyLoadControlProgressComponentConfig;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(c.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(c.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(c.class, "exitApiComponent", "getExitApiComponent()Lcom/ss/android/ugc/gamora/recorder/exit/ExitApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(c.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        c09r3.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11};
        LLJLL = 8;
    }

    private final C1631190sY9 G2() {
        return (C1631190sY9) this.LLJIJIL.getValue(this, LLJLILLLLZIIL[6]);
    }

    private final InterfaceC1630630sXF H2() {
        return (InterfaceC1630630sXF) this.LLJI.getValue(this, LLJLILLLLZIIL[5]);
    }

    private final InterfaceC1648020szI Op() {
        return (InterfaceC1648020szI) this.LLJJJJ.getValue(this, LLJLILLLLZIIL[10]);
    }

    private final void W1() {
        if (this.LL.findSceneByTag("RecordSpeedGroupScene") != null) {
            return;
        }
        C1654500t9k c1654500t9k = new C1654500t9k(this.LLJL, this.LLJJJ, this.LLJJIJIIJIL, this.LLJJIJIL, new C1652680t6o(X1(), (TextUtils.isEmpty(getShortVideoContext().cameraComponentModel.duetContext.duetVideoPath) || TextUtils.isEmpty(getShortVideoContext().cameraComponentModel.duetContext.duetAudioPath) || getShortVideoContext().mIsFromDraft) ? false : true, getShortVideoContext().LJJJJZ(), new AwS569S0100000_25(this, 589), new AwS569S0100000_25(this, 590)));
        this.LLJJJJLIIL = c1654500t9k;
        this.LL.add(R.id.szh, c1654500t9k, "RecordSpeedGroupScene");
        C1658150tFd.LIZIZ(this.LL, "RecordSpeedGroupScene");
    }

    private final InterfaceC1651080t4E c3() {
        return (InterfaceC1651080t4E) this.LLIZ.getValue(this, LLJLILLLLZIIL[2]);
    }

    private final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLIZLLLIL.getValue(this, LLJLILLLLZIIL[3]);
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLJILJILJ.getValue(this, LLJLILLLLZIIL[8]);
    }

    private final C0MGL w2() {
        return (C0MGL) this.LLJJJIL.getValue(this, LLJLILLLLZIIL[9]);
    }

    public final InterfaceC1652690t6p W2() {
        return (InterfaceC1652690t6p) this.LLILZ.getValue(this, LLJLILLLLZIIL[0]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJ.getValue(this, LLJLILLLLZIIL[4]);
    }

    public final InterfaceC1638550sk1 gq() {
        return (InterfaceC1638550sk1) this.LLJILJIL.getValue(this, LLJLILLLLZIIL[7]);
    }

    public final InterfaceC1652700t6q o2() {
        return (InterfaceC1652700t6q) this.LLILZLL.getValue(this, LLJLILLLLZIIL[1]);
    }

    private final View X1() {
        C1654400t9a c1654400t9aZu0 = c3().Zu0(EnumC1651770t5L.SPEED);
        if (c1654400t9aZu0 != null) {
            return c1654400t9aZu0.LIZJ;
        }
        return null;
    }

    @Override // X.InterfaceC1649530t1j
    public EnumC1650720t3e F8() {
        return W2().LIZIZ();
    }

    @Override // X.InterfaceC1649530t1j
    public boolean ZA() {
        return W2().LIZLLL();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        C385670FAf<Boolean> c385670FAfHC;
        C385670FAf<String> c385670FAfJP0;
        super.onCreate();
        getRecordAdapterApi().Oe2(this);
        this.LLJILLL.LIZ(this, new AObjectS246S0100000_25(this, 524));
        this.LLILZIL.RS().LIZ(this, new AObjectS246S0100000_25(this, 525));
        jh(s.NORMAL);
        w2().CZ1().LIZ(this, new AObjectS246S0100000_25(this, 526));
        if (!C1631200sYA.LIZ(G2())) {
            InterfaceC1630630sXF interfaceC1630630sXFH2 = H2();
            if (interfaceC1630630sXFH2 != null && (c385670FAfHC = interfaceC1630630sXFH2.HC()) != null) {
                c385670FAfHC.LIZ(this, new AObjectS246S0100000_25(this, 528));
            }
        } else if (getDiContainer().LIZJ(InterfaceC1630630sXF.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1630630sXF.class, new AwS604S0100000_25(this, 374));
        }
        InterfaceC1638550sk1 interfaceC1638550sk1Gq = gq();
        if (interfaceC1638550sk1Gq != null && (c385670FAfJP0 = interfaceC1638550sk1Gq.jP0()) != null) {
            c385670FAfJP0.LIZ(this, new AObjectS246S0100000_25(this, 529));
        }
        this.LLILZIL.O50().LIZ(this, new AObjectS246S0100000_25(this, 530));
        Op().getBottomTabIndexChangeEvent().LIZ(this, new AObjectS246S0100000_25(this, 531));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        W2().LIZJ(false);
        this.LLJJI.LJIIJ(8);
        o2().hV1(true);
        super.onDestroy();
        getRecordAdapterApi().Oe2(null);
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
        if (this.LL.findSceneByTag("RecordSpeedGroupScene") != null) {
            this.LLJILLL.LJII(Boolean.FALSE);
            W2().LIZJ(false);
            this.LLJJI.LJIIJ(8);
            o2().hV1(true);
            C19A3 c19a3 = this.LL;
            C1654500t9k c1654500t9k = this.LLJJJJLIIL;
            if (c1654500t9k == null) {
                c1654500t9k = null;
            }
            c19a3.remove(c1654500t9k);
        }
    }

    @Override // X.InterfaceC1649530t1j
    public LiveEvent<Boolean> Po2() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC1649530t1j
    public LiveEvent<s> R7() {
        return this.LLJJIII;
    }

    public final C19A3 T2() {
        return this.LL;
    }

    public InterfaceC1649530t1j Z1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    @Override // X.C11DL
    public /* bridge */ /* synthetic */ InterfaceC874803bO getReceiver() {
        getReceiver();
        return this;
    }

    @Override // X.InterfaceC1649530t1j
    public LiveEvent<Integer> h9() {
        return this.LLJLIL;
    }

    @Override // X.InterfaceC1649530t1j
    public void U7(int i) {
        this.LLJJ.LJII(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1649530t1j
    public void fo(EnumC1650720t3e enumC1650720t3e) {
        W2().LIZ(enumC1650720t3e);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I> S1 getState(VM1 vm1) {
        return (S1) C1170060gYO.LIZ(this, vm1);
    }

    public final void i3(boolean z) {
        C1654510t9l c1654510t9l;
        C1654510t9l c1654510t9l2;
        if (c3().ch0(EnumC1651770t5L.SPEED) == null && this.LLJJL == null) {
            p7(false);
            return;
        }
        if (z) {
            if (this.LLJILLL.LIZJ().booleanValue()) {
                W1();
                C1658150tFd.LJ(this.LL, "RecordSpeedGroupScene");
                InterfaceC1651490t4t interfaceC1651490t4tKY1 = c3().KY1();
                if ((!(interfaceC1651490t4tKY1 instanceof C1651500t4u)) && interfaceC1651490t4tKY1 != null) {
                    interfaceC1651490t4tKY1.LJI(C577560Ml0.LIZ, Boolean.TRUE);
                }
                C1654500t9k c1654500t9k = this.LLJJJJLIIL;
                if (c1654500t9k == null) {
                    c1654500t9k = null;
                }
                ViewParent parent = c1654500t9k.mView.getParent();
                C1654500t9k c1654500t9k2 = this.LLJJJJLIIL;
                if (c1654500t9k2 == null) {
                    c1654500t9k2 = null;
                }
                parent.bringChildToFront(c1654500t9k2.mView);
                C1654500t9k c1654500t9k3 = this.LLJJJJLIIL;
                if (c1654500t9k3 == null) {
                    c1654500t9k3 = null;
                }
                View view = c1654500t9k3.mView;
                if ((view instanceof C1654510t9l) && (c1654510t9l2 = (C1654510t9l) view) != null) {
                    c1654510t9l2.LJII();
                    return;
                }
                return;
            }
            return;
        }
        if (this.LL.findSceneByTag("RecordSpeedGroupScene") == null) {
            return;
        }
        InterfaceC1651490t4t interfaceC1651490t4tKY12 = c3().KY1();
        if ((!(interfaceC1651490t4tKY12 instanceof C1651500t4u)) && interfaceC1651490t4tKY12 != null) {
            interfaceC1651490t4tKY12.LJI(C577560Ml0.LIZ, Boolean.FALSE);
        }
        C1654500t9k c1654500t9k4 = this.LLJJJJLIIL;
        if (c1654500t9k4 == null) {
            c1654500t9k4 = null;
        }
        View view2 = c1654500t9k4.mView;
        if (!(view2 instanceof C1654510t9l) || (c1654510t9l = (C1654510t9l) view2) == null) {
            return;
        }
        c1654510t9l.LJFF();
    }

    @Override // X.InterfaceC1649530t1j
    public void jh(s sVar) {
        getCameraApiComponent().NF(sVar);
        this.LLJJJ.LJII(sVar);
        this.LLJJIII.LJIIJ(sVar);
    }

    @Override // X.InterfaceC1649530t1j
    public void p7(boolean z) {
        this.LLJILLL.LJII(Boolean.valueOf(z));
    }

    public c(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
        C560530Lyd<Integer> c560530Lyd = new C560530Lyd<>();
        this.LLJJI = c560530Lyd;
        this.LLJJIII = new C560530Lyd<>();
        this.LLJJIJI = new C560530Lyd<>();
        this.LLJJIJIIJIL = new C560530Lyd<>();
        this.LLJJIJIL = new C560530Lyd<>();
        this.LLJJJ = new h0<>(s.NORMAL);
        this.LLJJJIL = C1664770tQJ.LIZ(getDiContainer(), C0MGL.class, null);
        this.LLJJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648020szI.class, null);
        this.LLJJJJJIL = true;
        this.LLJJLIIIJLLLLLLLZ = new ConcurrentHashSet<>();
        this.LLJL = new C1652670t6n(this);
        this.LLJLIL = c560530Lyd;
    }

    @Override // X.InterfaceC1649530t1j
    public void Gs(int i, int i2) {
        this.LLJJIJIL.LJIIJ(new Pair<>(Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // X.InterfaceC1649530t1j
    public void Po0(boolean z, EnumC993100bwy enumC993100bwy) {
        if (z) {
            this.LLJJLIIIJLLLLLLLZ.remove(enumC993100bwy);
            if (this.LLJJLIIIJLLLLLLLZ.isEmpty()) {
                this.LLJJIJI.LJIIJ(Boolean.TRUE);
                return;
            }
            return;
        }
        this.LLJJLIIIJLLLLLLLZ.add(enumC993100bwy);
        this.LLJJIJI.LJIIJ(Boolean.FALSE);
    }

    @Override // X.InterfaceC1649530t1j
    public void n51(View view, Function0<Unit> function0) {
        C1654510t9l c1654510t9l;
        this.LLJJL = view;
        C1654500t9k c1654500t9k = this.LLJJJJLIIL;
        if (c1654500t9k != null) {
            View view2 = c1654500t9k.mView;
            if ((view2 instanceof C1654510t9l) && (c1654510t9l = (C1654510t9l) view2) != null) {
                C1652680t6o c1652680t6oLIZ = C1652680t6o.LIZ(c1654500t9k.LLJILLL, view);
                c1654510t9l.LL = c1652680t6oLIZ;
                View view3 = c1652680t6oLIZ.LIZ;
                if (view3 != null) {
                    view3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1698100uI4(c1654510t9l, 4));
                }
            }
        }
    }

    @Override // X.C11E9
    public <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, Function1<? super PROP1, ? extends R> function1) {
        return (R) C1171740gb6.LJIIIIZZ(c11e5, function1);
    }

    @Override // X.C11E9
    public <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, R> R withState(VM1 vm1, VM2 vm2, Function2<? super S1, ? super S2, ? extends R> function2) {
        return (R) C1171740gb6.LIZLLL(vm1, vm2, function2);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, Function2<? super PROP1, ? super PROP2, ? extends R> function2) {
        return (R) C1171740gb6.LJII(c11e5, c11e52, function2);
    }

    @Override // X.InterfaceC1649530t1j
    public void aj(int i, int i2, int i3, int i4) {
        this.LLJJIJIIJIL.LJIIJ(new C1644460stY<>(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
    }

    @Override // X.InterfaceC1166920gTK
    public <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC1631620sYq<? super S1, ? super S2, ? super S3, ? extends R> interfaceC1631620sYq) {
        return (R) C1171740gb6.LIZJ(vm1, vm2, vm3, interfaceC1631620sYq);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, InterfaceC1631620sYq<? super PROP1, ? super PROP2, ? super PROP3, ? extends R> interfaceC1631620sYq) {
        return (R) C1171740gb6.LJI(c11e5, c11e52, c11e53, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, VM4 extends JediViewModel<S4>, S4 extends C004I, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, InterfaceC1631630sYr<? super S1, ? super S2, ? super S3, ? super S4, ? extends R> interfaceC1631630sYr) {
        return (R) C1171740gb6.LIZIZ(vm1, vm2, vm3, vm4, interfaceC1631630sYr);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, M4 extends C11E5<S4, PROP4>, PROP4 extends C004I, S4 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, C11E5<S4, PROP4> c11e54, InterfaceC1631630sYr<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? extends R> interfaceC1631630sYr) {
        return (R) C1171740gb6.LJFF(c11e5, c11e52, c11e53, c11e54, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, VM4 extends JediViewModel<S4>, S4 extends C004I, VM5 extends JediViewModel<S5>, S5 extends C004I, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, VM5 vm5, InterfaceC1685420txc<? super S1, ? super S2, ? super S3, ? super S4, ? super S5, ? extends R> interfaceC1685420txc) {
        return (R) C1171740gb6.LIZ(vm1, vm2, vm3, vm4, vm5, interfaceC1685420txc);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, M4 extends C11E5<S4, PROP4>, PROP4 extends C004I, S4 extends C004I, M5 extends C11E5<S5, PROP5>, PROP5 extends C004I, S5 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, C11E5<S4, PROP4> c11e54, C11E5<S5, PROP5> c11e55, InterfaceC1685420txc<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? super PROP5, ? extends R> interfaceC1685420txc) {
        return (R) C1171740gb6.LJ(c11e5, c11e52, c11e53, c11e54, c11e55, interfaceC1685420txc);
    }

    @Override // X.C11E9
    public <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }

    public <S extends C004I, A, B, C, D, E> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1765020w20<C11EE<A, B, C, D, E>> c1765020w20, InterfaceC1685430txd<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C11EA.LIZJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1765020w20, interfaceC1685430txd);
    }
}
