package com.ss.android.ugc.aweme.shortvideo.countdown;

import X.AbstractC1252750ihl;
import X.AbstractC2255721DQs;
import X.C004I;
import X.C01GW;
import X.C048700Fp;
import X.C05YF;
import X.C09R3;
import X.C0BN7;
import X.C0LCS;
import X.C1170060gYO;
import X.C1171740gb6;
import X.C11AM;
import X.C11AW;
import X.C11DL;
import X.C11E5;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EE;
import X.C11EF;
import X.C11NJ;
import X.C1389880mGw;
import X.C13LE;
import X.C1447800nmM;
import X.C1448290nn9;
import X.C1624200sMs;
import X.C1631190sY9;
import X.C1631200sYA;
import X.C1634100scq;
import X.C1644460stY;
import X.C1653020t7M;
import X.C1653040t7O;
import X.C1661810tLX;
import X.C1663770tOh;
import X.C1664770tQJ;
import X.C1765020w20;
import X.C19A3;
import X.C1DRG;
import X.C214799194j;
import X.C2217381BqS;
import X.C452501pT;
import X.C523910Kgf;
import X.C545820Lau;
import X.C569760MWg;
import X.EnumC1159880gHy;
import X.EnumC1448830no1;
import X.InterfaceC1166920gTK;
import X.InterfaceC1441305kZ;
import X.InterfaceC1628590sTx;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1648570t0B;
import X.InterfaceC1648590t0D;
import X.InterfaceC1649820t2C;
import X.InterfaceC1650230t2r;
import X.InterfaceC1652470t6T;
import X.InterfaceC1653050t7P;
import X.InterfaceC1653060t7Q;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1731706qJ;
import X.InterfaceC1737690vJv;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import X.InterfaceC420801kM;
import X.InterfaceC578600Mmg;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import Y.AObjectS246S0100000_25;
import Y.ARunnableS125S0100000_25;
import Y.AUListenerS273S0100000_25;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.countdown.b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS14S0101100_25;
import kotlin.jvm.internal.AwS265S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import lnn.q;

/* JADX INFO: loaded from: classes26.dex */
public final class b extends AbstractC2255721DQs<InterfaceC578600Mmg> implements InterfaceC578600Mmg, InterfaceC1166920gTK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public static final int LLJJJJLIIL;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public boolean LLJILLL;
    public boolean LLJJ;
    public int LLJJI;
    public C11AM LLJJIII;
    public C1389880mGw LLJJIJI;
    public final InterfaceC1650230t2r LLILLL = (InterfaceC1650230t2r) getDiContainer().LJII(InterfaceC1650230t2r.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), C1631190sY9.class, "lazyControlProgressConfig");
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1649820t2C.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), q.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1653050t7P.class, null);
    public final InterfaceC1652470t6T LLJ = (InterfaceC1652470t6T) getDiContainer().LJIIL(null, InterfaceC1652470t6T.class);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), a.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1628590sTx.class, null);
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648590t0D.class, null);
    public final MutableLiveData<EnumC1159880gHy> LLJJIJIIJIL = new MutableLiveData<>();
    public final InterfaceC1441305kZ<C048700Fp> LLJJIJIL = new AObjectS246S0100000_25(this, 149);
    public final Set<InterfaceC1653060t7Q> LLJJJ = new LinkedHashSet();
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 255));
    public final C1653020t7M LLJJJJ = new C11AW() { // from class: X.0t7M
        @Override // X.C11AW
        public final void LIZ() {
            this.LIZ.c3();
        }

        @Override // X.C11AW
        public final void LIZLLL() {
            this.LIZ.m3();
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [T, kotlin.Pair] */
        @Override // X.C11AW
        public final C19456911Ah LJFF() {
            InterfaceC1628590sTx interfaceC1628590sTxO2 = this.LIZ.o2();
            InterfaceC20500415Jq interfaceC20500415JqN0 = interfaceC1628590sTxO2 != null ? interfaceC1628590sTxO2.N0() : null;
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LIZ.getShortVideoContext().creativeModel.musicBuzModel);
            if (interfaceC20500415JqN0 == null || aVMusicExtractAVMusic == null) {
                return null;
            }
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = new Pair(0, 0);
            return new C19456911Ah(c259800zU, interfaceC20500415JqN0, aVMusicExtractAVMusic);
        }

        @Override // X.C11AW
        public final void close() {
            this.LIZ.m8(false);
        }

        @Override // X.C11AW
        public final void LIZIZ(boolean z) {
            this.LIZ.LLILLL.Zl0(new C1663770tOh(!z, false, false));
        }

        @Override // X.C11AW
        public final void LIZJ(int i) {
            String str;
            b bVar = this.LIZ;
            if (bVar.LLJJI != i) {
                C1403450mcp c1403450mcp = C1403450mcp.LIZ;
                ShortVideoContext shortVideoContext = bVar.getShortVideoContext();
                c1403450mcp.getClass();
                if (i != 0) {
                    C0LAB c0lab = new C0LAB();
                    c0lab.LJ("enter_from", "video_shoot_page");
                    c0lab.LJ("shoot_way", shortVideoContext.shootWay);
                    c0lab.LJ("creation_id", shortVideoContext.getCreationId());
                    c0lab.LJ("content_type", "video");
                    if (i == 3) {
                        str = "3s";
                    } else {
                        str = "10s";
                    }
                    c0lab.LJ("to_status", str);
                    c0lab.LJ("shoot_tab_name", shortVideoContext.LJIJJLI());
                    C20684815ws.LJIILLIIL("select_countdown_type", c0lab.LIZ);
                }
            }
            this.LIZ.LLJJI = i;
        }

        @Override // X.C11AW
        public final void LJ(long j, long j2) {
            b bVar = this.LIZ;
            bVar.i3(bVar.LLJJI, j, j2);
        }
    };

    public InterfaceC578600Mmg Z1() {
        return this;
    }

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
        C2217381BqS c2217381BqS = new C2217381BqS(b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(b.class, "lazyControlProgressConfig", "getLazyControlProgressConfig()Lcom/ss/android/ugc/aweme/property/LazyLoadControlProgressComponentConfig;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(b.class, "controlProgressApiComponent", "getControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/ControlProgressApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(b.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(b.class, "addYoursStickerApi", "getAddYoursStickerApi()Lcom/ss/android/ugc/aweme/addyours/RecordAddYoursStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(b.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(b.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(b.class, "chooseMusicApiComponent", "getChooseMusicApiComponent()Lcom/ss/android/ugc/gamora/recorder/choosemusic/ChooseMusicApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(b.class, "conflictsManagementComponent", "getConflictsManagementComponent()Lcom/ss/android/ugc/aweme/shortvideo/conflicts/RecordConflictsManagementApi;", 0);
        c09r3.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9};
        LLJJJJLIIL = 8;
    }

    private final InterfaceC1649820t2C Eq() {
        return (InterfaceC1649820t2C) this.LLILZLL.getValue(this, LLJJJJJIL[2]);
    }

    private final C1631190sY9 G2() {
        return (C1631190sY9) this.LLILZIL.getValue(this, LLJJJJJIL[1]);
    }

    private final C214799194j H2() {
        return (C214799194j) this.LLJJJIL.getValue();
    }

    private final InterfaceC1653050t7P X1() {
        return (InterfaceC1653050t7P) this.LLIZLLLIL.getValue(this, LLJJJJJIL[4]);
    }

    private final a getPlanCUIApiComponent() {
        return (a) this.LLJIJIL.getValue(this, LLJJJJJIL[6]);
    }

    private final q getStickerApiComponent() {
        return (q) this.LLIZ.getValue(this, LLJJJJJIL[3]);
    }

    private final InterfaceC1648590t0D w2() {
        return (InterfaceC1648590t0D) this.LLJILJILJ.getValue(this, LLJJJJJIL[8]);
    }

    public final void H3() {
        InterfaceC1652470t6T interfaceC1652470t6T = this.LLJ;
        if (interfaceC1652470t6T != null) {
            interfaceC1652470t6T.zh0(1, false);
        }
        InterfaceC1652470t6T interfaceC1652470t6T2 = this.LLJ;
        if (interfaceC1652470t6T2 != null) {
            interfaceC1652470t6T2.oo0(getStickerApiComponent().C0().LLILIL(), false);
        }
    }

    public final void c3() {
        NavigationScene navigationSceneLIZ;
        if (C545820Lau.LIZIZ(this.LL) == null) {
            return;
        }
        getRecordControlApi().bz(false);
        this.LLILLL.Zl0(new C1663770tOh(true, false, false));
        InterfaceC1653050t7P interfaceC1653050t7PX1 = X1();
        if (interfaceC1653050t7PX1 != null) {
            interfaceC1653050t7PX1.rY1(true);
        }
        if (C0BN7.LIZ()) {
            H2().LLLLJI();
        } else {
            C11AM c11am = this.LLJJIII;
            if (c11am != null && (navigationSceneLIZ = C1447800nmM.LIZ(this.LL)) != null) {
                navigationSceneLIZ.remove(c11am);
            }
        }
        this.LLJJ = false;
        W1();
    }

    public final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLILZ.getValue(this, LLJJJJJIL[0]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJI.getValue(this, LLJJJJJIL[5]);
    }

    public final void m3() {
        if (C545820Lau.LIZIZ(this.LL) == null) {
            return;
        }
        if (!C1631200sYA.LIZ(G2())) {
            Eq().W9(false);
        } else if (getDiContainer().LIZJ(InterfaceC1649820t2C.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1649820t2C.class, new AwS265S0000000_25(4));
        }
        getRecordControlApi().bz(true);
        InterfaceC1653050t7P interfaceC1653050t7PX1 = X1();
        if (interfaceC1653050t7PX1 != null) {
            interfaceC1653050t7PX1.rY1(false);
        }
        getStickerApiComponent().sT0();
        C1389880mGw c1389880mGw = this.LLJJIJI;
        if (c1389880mGw != null) {
            c1389880mGw.LIZIZ();
        }
        this.LLJJIJI = null;
        this.LLJJ = true;
        C11NJ c11nj = C1653040t7O.LIZ;
        System.currentTimeMillis();
        q3();
    }

    public final InterfaceC1628590sTx o2() {
        return (InterfaceC1628590sTx) this.LLJILJIL.getValue(this, LLJJJJJIL[7]);
    }

    private final void E3() {
        if (C1624200sMs.LJIILIIL(getStickerApiComponent().C0().LLILIL())) {
            this.LLILLL.St2().LJLL();
        }
    }

    private final void W1() {
        LiveEvent<C048700Fp> liveEventUr0;
        InterfaceC1648590t0D interfaceC1648590t0DW2 = w2();
        if (interfaceC1648590t0DW2 == null || (liveEventUr0 = interfaceC1648590t0DW2.ur0()) == null) {
            return;
        }
        liveEventUr0.LIZIZ(this.LLJJIJIL);
    }

    private final boolean W2() {
        return getShortVideoContext().shootMode == 16;
    }

    private final void q3() {
        LiveEvent<C048700Fp> liveEventUr0;
        InterfaceC1648590t0D interfaceC1648590t0DW2 = w2();
        if (interfaceC1648590t0DW2 == null || (liveEventUr0 = interfaceC1648590t0DW2.ur0()) == null) {
            return;
        }
        liveEventUr0.LIZ(this, this.LLJJIJIL);
    }

    @Override // X.InterfaceC578600Mmg
    public Boolean onBackPressed() {
        if (!W2()) {
            return null;
        }
        if (this.LLJJ) {
            C11AM c11am = this.LLJJIII;
            if (c11am != null) {
                c11am.LLLLIIIILLL();
            }
            return Boolean.TRUE;
        }
        if (!this.LLJILLL) {
            return null;
        }
        this.LLJILLL = false;
        return Boolean.FALSE;
    }

    public MutableLiveData<EnumC1159880gHy> T2() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public final C19A3 getParentScene() {
        return this.LL;
    }

    @Override // X.C11DL
    public /* bridge */ /* synthetic */ InterfaceC874803bO getReceiver() {
        getReceiver();
        return this;
    }

    @Override // X.InterfaceC578600Mmg
    public /* bridge */ /* synthetic */ LiveData p4() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC578600Mmg
    public void Hj2(InterfaceC1653060t7Q interfaceC1653060t7Q) {
        this.LLJJJ.add(interfaceC1653060t7Q);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I> S1 getState(VM1 vm1) {
        return (S1) C1170060gYO.LIZ(this, vm1);
    }

    @Override // X.InterfaceC578600Mmg
    public void m8(boolean z) {
        C11AM c11am;
        final NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this.LL);
        if (navigationSceneLIZ == null) {
            return;
        }
        if (z) {
            this.LLJJIJIIJIL.setValue(EnumC1159880gHy.PRE_SHOW);
            InterfaceC1652470t6T interfaceC1652470t6T = this.LLJ;
            if (interfaceC1652470t6T != null) {
                interfaceC1652470t6T.zh0(1, true);
            }
            InterfaceC1652470t6T interfaceC1652470t6T2 = this.LLJ;
            if (interfaceC1652470t6T2 != null) {
                interfaceC1652470t6T2.rZ0(null, false);
            }
            E3();
            if (C0BN7.LIZ()) {
                H2().LLLLL(this.LL);
            } else if (!C523910Kgf.LIZIZ(navigationSceneLIZ, C11AM.class)) {
                C11AM c11am2 = new C11AM(this.LLJJJJ);
                this.LLJJIII = c11am2;
                C569760MWg c569760MWg = new C569760MWg();
                c569760MWg.LIZ = true;
                C1661810tLX c1661810tLX = new C1661810tLX() { // from class: X.0tEt
                    @Override // X.C1661810tLX, X.C195L
                    public final Animator LJIILIIL(C214795194f c214795194f, C214795194f c214795194f2) {
                        if (c214795194f == null) {
                            return new AnimatorSet();
                        }
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, c214795194f.LIZIZ.getMeasuredHeight());
                        valueAnimatorOfFloat.addUpdateListener(new AUListenerS273S0100000_25(c214795194f, 6));
                        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                        valueAnimatorOfFloat.setDuration(250L);
                        return valueAnimatorOfFloat;
                    }
                };
                c1661810tLX.LIZIZ = new ARunnableS125S0100000_25(this, 17);
                c569760MWg.LIZJ = c1661810tLX;
                navigationSceneLIZ.LLLLLLLLLL(c11am2, c569760MWg.LIZ());
                navigationSceneLIZ.LLLIILIL(this, new InterfaceC1737690vJv() { // from class: X.0t7N
                    @Override // X.InterfaceC1737690vJv
                    public final boolean onBackPressed() {
                        this.LL.H3();
                        navigationSceneLIZ.LLLLLLLZIL(this);
                        return false;
                    }
                });
            }
        } else {
            this.LLJJIJIIJIL.setValue(EnumC1159880gHy.PRE_HIDE);
            if (C0BN7.LIZ()) {
                H2().LLLLJI();
            } else if (C523910Kgf.LIZIZ(navigationSceneLIZ, C11AM.class) && (c11am = this.LLJJIII) != null) {
                navigationSceneLIZ.remove(c11am);
            }
        }
        this.LLJILLL = z;
    }

    @Override // X.InterfaceC578600Mmg
    public void uO0(InterfaceC1653060t7Q interfaceC1653060t7Q) {
        this.LLJJJ.remove(interfaceC1653060t7Q);
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [X.0t7M] */
    public b(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
    }

    private final void B3(int i, long j) {
        getRecordControlApi().bz(false);
        if (!this.LLJJJ.isEmpty()) {
            Iterator<T> it2 = this.LLJJJ.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1653060t7Q) it2.next()).LIZLLL(i, j);
            }
            return;
        }
        if (C1631200sYA.LIZ(G2())) {
            if (getDiContainer().LIZJ(InterfaceC1649820t2C.class)) {
                whenReadyOrThrowInternal(getDiContainer(), InterfaceC1649820t2C.class, new AwS265S0000000_25(5));
            }
        } else {
            Eq().W9(true);
        }
        AwS14S0101100_25 awS14S0101100_25 = new AwS14S0101100_25(this, i, j, 0);
        if (getPlanCUIApiComponent().LJ2() && getPlanCUIApiComponent().X80() != null) {
            Function1<Function0<Unit>, Unit> function1X80 = getPlanCUIApiComponent().X80();
            if (function1X80 != null) {
                function1X80.invoke(awS14S0101100_25);
                return;
            }
            return;
        }
        awS14S0101100_25.invoke();
    }

    @Override // X.C11E9
    public <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, Function1<? super PROP1, ? extends R> function1) {
        return (R) C1171740gb6.LJIIIIZZ(c11e5, function1);
    }

    private final void v3(int i, long j, long j2) {
        getRecordControlApi().bz(false);
        if (!this.LLJJJ.isEmpty()) {
            Iterator<T> it2 = this.LLJJJ.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1653060t7Q) it2.next()).LIZJ(i, j, j2);
            }
            return;
        }
        getRecordControlApi().l60(new C1448290nn9(EnumC1448830no1.COUNT_DOWN, i, j2, 8));
        InterfaceC1649820t2C interfaceC1649820t2C = (InterfaceC1649820t2C) getDiContainer().LJIIL(null, InterfaceC1649820t2C.class);
        if (interfaceC1649820t2C != null) {
            interfaceC1649820t2C.W9(true);
            interfaceC1649820t2C.dd(true);
            interfaceC1649820t2C.T5();
        }
        getRecordControlApi().z80(j);
    }

    public final void i3(int i, long j, long j2) {
        if (C545820Lau.LIZIZ(this.LL) == null || !this.LLJJ) {
            return;
        }
        if (W2() && j2 <= 0) {
            B3(i, j2);
        } else {
            v3(i, j, j2);
        }
        this.LLJJ = false;
        W1();
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
