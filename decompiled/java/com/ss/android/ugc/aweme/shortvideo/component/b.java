package com.ss.android.ugc.aweme.shortvideo.component;

import X.C01GW;
import X.C05YF;
import X.C09R3;
import X.C0CHQ;
import X.C0FTJ;
import X.C11AM;
import X.C13LE;
import X.C1443960ngA;
import X.C1447800nmM;
import X.C1637850sit;
import X.C1646160swI;
import X.C1648670t0L;
import X.C1649050t0x;
import X.C1649060t0y;
import X.C1649100t12;
import X.C1649510t1h;
import X.C1649540t1k;
import X.C1650090t2d;
import X.C1653330t7r;
import X.C1664770tQJ;
import X.C19A3;
import X.C19EG;
import X.C1DRG;
import X.C201955140j;
import X.C201967140v;
import X.C2217381BqS;
import X.C267070AdN;
import X.C385670FAf;
import X.C443120HZe;
import X.C452501pT;
import X.C523910Kgf;
import X.C560530Lyd;
import X.EnumC1466150oFx;
import X.EnumC1647570syZ;
import X.InterfaceC1638550sk1;
import X.InterfaceC1647420syK;
import X.InterfaceC1647890sz5;
import X.InterfaceC1647930sz9;
import X.InterfaceC1648020szI;
import X.InterfaceC1649070t0z;
import X.InterfaceC1649080t10;
import X.InterfaceC1655400tBC;
import X.InterfaceC1731706qJ;
import X.InterfaceC1888407aU;
import X.InterfaceC2217461Bqa;
import Y.ALAdapterS20S0100000_25;
import Y.AObjectS246S0100000_25;
import Y.AUListenerS273S0100000_25;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class b extends C1649100t12<a> implements a {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLL;
    public static final int LLLLII;
    public final C19A3 LLJJIJIIJIL;
    public final Integer LLJJIJIL;
    public final h0<Pair<Integer, Boolean>> LLJJJ;
    public final C560530Lyd<C443120HZe<Integer, Integer, Intent>> LLJJJIL;
    public final C560530Lyd<Boolean> LLJJJJ;
    public final C560530Lyd<Unit> LLJJJJJIL;
    public final C560530Lyd<Boolean> LLJJJJLIIL;
    public final h0<Boolean> LLJJL;
    public final C560530Lyd<Unit> LLJJLIIIJLLLLLLLZ;
    public final C560530Lyd<Unit> LLJL;
    public final h0<C1649510t1h> LLJLIL;
    public final h0<Boolean> LLJLILLLLZIIL;
    public final h0<Pair<Long, AVMusic>> LLJLL;
    public final C560530Lyd<Effect> LLJLLIL;
    public final h0<Boolean> LLJLLL;
    public final h0<Boolean> LLJZ;
    public final h0<C1648670t0L> LLJZIJLIL;
    public Function1<? super Function0<Unit>, Unit> LLL;
    public Function1<? super EnumC1466150oFx, ? extends List<? extends C0FTJ<? extends StickerModel>>> LLLF;
    public final h0<Float> LLLFF;
    public final h0<Float> LLLFFI;
    public final C560530Lyd<Unit> LLLFZ;
    public final C560530Lyd<Boolean> LLLI;
    public final h0<e> LLLII;
    public final C19EG LLLIIII;
    public final InterfaceC1731706qJ LLLIIIIL;
    public final InterfaceC1731706qJ LLLIIIL;
    public final InterfaceC1731706qJ LLLIIL;
    public final InterfaceC1731706qJ LLLIILIL;
    public long LLLIL;
    public final C01GW LLLILZ;
    public final InterfaceC1731706qJ LLLILZJ;
    public final InterfaceC1731706qJ LLLILZLLLI;
    public final C1649050t0x LLLIZZ;
    public final C1649060t0y LLLJ;
    public Boolean LLLJIL;
    public boolean LLLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(b.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(b.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(b.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(b.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(b.class, "screenAdaptRegistry", "getScreenAdaptRegistry()Lcom/ss/android/ugc/aweme/saa/CreationScreenAdaptRegistry;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(b.class, "rootViewOwnerRegistry", "getRootViewOwnerRegistry()Lcom/ss/android/ugc/aweme/saa/RootViewOwnerRegistry;", 0);
        c09r3.getClass();
        LLLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
        LLLLII = 8;
    }

    public a c3() {
        return this;
    }

    private final InterfaceC1648020szI Op() {
        return (InterfaceC1648020szI) this.LLLIILIL.getValue(this, LLLL[3]);
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLLIIIIL.getValue(this, LLLL[0]);
    }

    private final InterfaceC1638550sk1 gq() {
        return (InterfaceC1638550sk1) this.LLLIIIL.getValue(this, LLLL[1]);
    }

    private final C1650090t2d n5() {
        return (C1650090t2d) this.LLLILZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public boolean HF1() {
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this.LLJJIJIIJIL);
        if (navigationSceneLIZ != null) {
            return C523910Kgf.LIZIZ(navigationSceneLIZ, C11AM.class);
        }
        return false;
    }

    public final InterfaceC1649080t10 K4() {
        return (InterfaceC1649080t10) this.LLLILZLLLI.getValue(this, LLLL[5]);
    }

    public final InterfaceC1649070t0z P4() {
        return (InterfaceC1649070t0z) this.LLLILZJ.getValue(this, LLLL[4]);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public void Q42() {
        this.LLJL.LJIIJ(Unit.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public void RV1() {
        long jLongValue;
        C01GW c01gw = C267070AdN.LIZ;
        if (((Number) c01gw.getValue()).longValue() <= -1) {
            C1646160swI c1646160swI = EnumC1647570syZ.Companion;
            String defaultShootTabTag = C0CHQ.LIZ().LJJJJJ().getDefaultShootTabTag(getShortVideoContext());
            c1646160swI.getClass();
            if (C1646160swI.LIZIZ(defaultShootTabTag)) {
                return;
            } else {
                jLongValue = 300;
            }
        } else if (((Number) c01gw.getValue()).longValue() == 0) {
            return;
        } else {
            jLongValue = ((Number) c01gw.getValue()).longValue();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(jLongValue);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS273S0100000_25(this, 5));
        valueAnimatorOfFloat.addListener(new ALAdapterS20S0100000_25(this, 0));
        valueAnimatorOfFloat.start();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public void Z22() {
        this.LLJJLIIIJLLLLLLLZ.LJIIJ(Unit.LIZ);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLLIIL.getValue(this, LLLL[2]);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public void oL1() {
        this.LLJJJJJIL.LJIIJ(Unit.LIZ);
    }

    private final void v5() {
        if (C1443960ngA.LJIIIZ(getShortVideoContext())) {
            this.LLIZ.LJII(Boolean.FALSE);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public boolean ZB0() {
        if (!getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            return false;
        }
        InterfaceC1647930sz9 interfaceC1647930sz9 = (InterfaceC1647930sz9) getDiContainer().LJIIL(null, InterfaceC1648020szI.class);
        return TextUtils.equals(interfaceC1647930sz9 != null ? interfaceC1647930sz9.getCurrentBottomTag() : null, this.LLLIIII.getString(2131845855));
    }

    @Override // X.C1649100t12, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C201955140j.LJIILJJIL(C201967140v.LIZIZ, "PlanCUIComponent onCreate");
        getRecordAdapterApi().xJ0(this);
        this.LLJJJIL.LIZ(this, new AObjectS246S0100000_25(this, 148));
        C1637850sit.LIZ(this, new AwS569S0100000_25(this, 251));
        v5();
    }

    @Override // X.C1649100t12, X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        getRecordAdapterApi().xJ0(null);
        InterfaceC1649070t0z interfaceC1649070t0zP4 = P4();
        if (interfaceC1649070t0zP4 != null) {
            interfaceC1649070t0zP4.LLJJ(this.LLLIZZ);
        }
        InterfaceC1649080t10 interfaceC1649080t10K4 = K4();
        if (interfaceC1649080t10K4 != null) {
            interfaceC1649080t10K4.LJLLLLLL(this.LLLJ);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        C201955140j.LJIILJJIL(C201967140v.LIZIZ, "PlanCUIComponent onResume");
        if (this.LLLIL != -1) {
            n5().LIZ(-1, System.currentTimeMillis() - this.LLLIL, "click_back_in_edit", false);
            this.LLLIL = -1L;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public /* bridge */ /* synthetic */ C385670FAf A71() {
        return this.LLJZIJLIL;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public /* bridge */ /* synthetic */ C385670FAf Ap1() {
        return this.LLJJJ;
    }

    public h0<Float> B3() {
        return this.LLLFFI;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public /* bridge */ /* synthetic */ C385670FAf Cg1() {
        return this.LLLFF;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public /* bridge */ /* synthetic */ C385670FAf E21() {
        return this.LLJLLL;
    }

    public C560530Lyd<Unit> E3() {
        return this.LLLFZ;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public /* bridge */ /* synthetic */ LiveEvent Ek() {
        return this.LLLI;
    }

    public h0<Boolean> F4() {
        return this.LLJLLL;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public /* bridge */ /* synthetic */ LiveEvent FU0() {
        return this.LLJJJJ;
    }

    public C560530Lyd<Unit> H3() {
        return this.LLJJJJJIL;
    }

    public C560530Lyd<Boolean> H4() {
        return this.LLJJJJ;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public boolean LJ2() {
        return this.LLLJL;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public /* bridge */ /* synthetic */ LiveEvent LLZIL() {
        return this.LLJJJIL;
    }

    public C560530Lyd<Unit> O3() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public C560530Lyd<Boolean> O4() {
        return this.LLLI;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public /* bridge */ /* synthetic */ LiveEvent O50() {
        return this.LLJLLIL;
    }

    public C560530Lyd<Effect> Q3() {
        return this.LLJLLIL;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public /* bridge */ /* synthetic */ LiveEvent QU1() {
        return this.LLJL;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public /* bridge */ /* synthetic */ C385670FAf Qf1() {
        return this.LLJJL;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public /* bridge */ /* synthetic */ C385670FAf Qw1() {
        return this.LLJLIL;
    }

    public C560530Lyd<Boolean> T4() {
        return this.LLJJJJLIIL;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public /* bridge */ /* synthetic */ C385670FAf US() {
        return this.LLLFFI;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public /* bridge */ /* synthetic */ C385670FAf V10() {
        return this.LLJLILLLLZIIL;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public /* bridge */ /* synthetic */ LiveEvent WU() {
        return this.LLJJJJLIIL;
    }

    @Override // X.C1649100t12
    public /* bridge */ /* synthetic */ InterfaceC1647890sz5 X1() {
        c3();
        return this;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public Function1<Function0<Unit>, Unit> X80() {
        return this.LLL;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public /* bridge */ /* synthetic */ C385670FAf YQ0() {
        return this.LLLII;
    }

    public h0<Boolean> Z4() {
        return this.LLJJL;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public /* bridge */ /* synthetic */ LiveEvent Z40() {
        return this.LLLFZ;
    }

    public h0<C1649510t1h> d5() {
        return this.LLJLIL;
    }

    public h0<Boolean> e4() {
        return this.LLJLILLLLZIIL;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public /* bridge */ /* synthetic */ C385670FAf ey() {
        return this.LLJLL;
    }

    @Override // X.C1649100t12, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        c3();
        return this;
    }

    public final C19A3 getParentScene() {
        return this.LLJJIJIIJIL;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public /* bridge */ /* synthetic */ C385670FAf gw0() {
        return this.LLJZ;
    }

    public h0<Pair<Integer, Boolean>> i3() {
        return this.LLJJJ;
    }

    public C560530Lyd<Unit> k5() {
        return this.LLJL;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public Function1<EnumC1466150oFx, List<C0FTJ<StickerModel>>> kO() {
        return this.LLLF;
    }

    public h0<Float> m3() {
        return this.LLLFF;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public /* bridge */ /* synthetic */ LiveEvent nS() {
        return this.LLJJJJJIL;
    }

    public h0<Boolean> o4() {
        return this.LLJZ;
    }

    public h0<e> q3() {
        return this.LLLII;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public /* bridge */ /* synthetic */ LiveEvent sF1() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public h0<C1648670t0L> t5() {
        return this.LLJZIJLIL;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public Boolean t92() {
        return this.LLLJIL;
    }

    public h0<Pair<Long, AVMusic>> v3() {
        return this.LLJLL;
    }

    public C560530Lyd<C443120HZe<Integer, Integer, Intent>> z4() {
        return this.LLJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public void CB(C1649510t1h c1649510t1h) {
        this.LLJLIL.LJII(c1649510t1h);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public void GN1(boolean z) {
        this.LLJJJJLIIL.LJIIJ(Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public void Jy2(Effect effect) {
        this.LLJLLIL.LJIIJ(effect);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public void L02(boolean z) {
        this.LLJJL.LJII(Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public void Ok1(C1648670t0L c1648670t0L) {
        this.LLJZIJLIL.LJII(c1648670t0L);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public void VT0(Function1<? super EnumC1466150oFx, ? extends List<? extends C0FTJ<? extends StickerModel>>> function1) {
        this.LLLF = function1;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public void aS1(boolean z) {
        this.LLJLLL.LJII(Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public void bP1(boolean z) {
        this.LLLJL = z;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public void be1(Function1<? super Function0<Unit>, Unit> function1) {
        this.LLL = function1;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public void eP2(boolean z) {
        m10(z);
        this.LLJJJJ.LJIIJ(Boolean.valueOf(z));
    }

    @Override // X.C1649100t12, X.InterfaceC1647890sz5
    public void m10(boolean z) {
        String str;
        boolean z2;
        C1653330t7r currentBottomTabItemBeforeOnTabChanged;
        InterfaceC1648020szI interfaceC1648020szIOp = Op();
        if (interfaceC1648020szIOp != null && (currentBottomTabItemBeforeOnTabChanged = interfaceC1648020szIOp.getCurrentBottomTabItemBeforeOnTabChanged()) != null) {
            str = currentBottomTabItemBeforeOnTabChanged.LIZIZ;
        } else {
            str = null;
        }
        boolean zLJFF = Intrinsics.LJFF(str, EnumC1647570syZ.LIVE.getTag());
        boolean z3 = getShortVideoContext().creativeModel.aigcOfflineModel.isOfflineAIGCEffectGenerating;
        if (z && !zLJFF && !z3) {
            z2 = true;
        } else {
            z2 = false;
        }
        super.m10(z2);
        InterfaceC1638550sk1 interfaceC1638550sk1Gq = gq();
        if (interfaceC1638550sk1Gq != null) {
            interfaceC1638550sk1Gq.pe1(z2);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public void mC(e eVar) {
        this.LLLII.LJII(eVar);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public void uj(boolean z) {
        this.LLLI.LJIIJ(Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public void yr2(boolean z) {
        this.LLJLILLLLZIIL.LJII(Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public void gH0(long j, AVMusic aVMusic) {
        this.LLJLL.LJII(new Pair<>(Long.valueOf(j), aVMusic));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public void uL(int i, boolean z) {
        this.LLLJIL = Boolean.valueOf(z);
        this.LLJJJ.LJII(new Pair<>(Integer.valueOf(i), Boolean.valueOf(z)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v42, types: [X.0t0x] */
    /* JADX WARN: Type inference failed for: r0v43, types: [X.0t0y] */
    public b(C19A3 c19a3, final C1DRG c1drg, Integer num) {
        C1649540t1k c1649540t1k;
        if (num != null) {
            c1649540t1k = (C1649540t1k) c19a3.findViewById(num.intValue());
        } else {
            c1649540t1k = null;
        }
        super(c1drg, c1649540t1k);
        this.LLJJIJIIJIL = c19a3;
        this.LLJJIJIL = num;
        this.LLJJJ = new h0<>(new Pair(-1, Boolean.FALSE));
        this.LLJJJIL = new C560530Lyd<>();
        this.LLJJJJ = new C560530Lyd<>();
        this.LLJJJJJIL = new C560530Lyd<>();
        this.LLJJJJLIIL = new C560530Lyd<>();
        this.LLJJL = new h0<>(null);
        this.LLJJLIIIJLLLLLLLZ = new C560530Lyd<>();
        this.LLJL = new C560530Lyd<>();
        this.LLJLIL = new h0<>(null);
        this.LLJLILLLLZIIL = new h0<>(null);
        this.LLJLL = new h0<>(null);
        this.LLJLLIL = new C560530Lyd<>();
        this.LLJLLL = new h0<>(null);
        this.LLJZ = new h0<>(null);
        this.LLJZIJLIL = new h0<>(null);
        this.LLLFF = new h0<>(Float.valueOf(1.0f));
        this.LLLFFI = new h0<>(Float.valueOf(1.0f));
        this.LLLFZ = new C560530Lyd<>();
        this.LLLI = new C560530Lyd<>();
        this.LLLII = new h0<>(e.VIDEO);
        this.LLLIIII = (C19EG) getDiContainer().LJII(C19EG.class, null);
        this.LLLIIIIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
        this.LLLIIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1638550sk1.class, null);
        this.LLLIIL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
        this.LLLIILIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648020szI.class, null);
        this.LLLIL = -1L;
        this.LLLILZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(134));
        this.LLLILZJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1649070t0z.class, null);
        this.LLLILZLLLI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1649080t10.class, null);
        this.LLLIZZ = new InterfaceC1888407aU() { // from class: X.0t0x
            @Override // X.InterfaceC1888407aU
            public final InterfaceC1939907in LIZ() {
                return new C1939807im();
            }

            @Override // X.InterfaceC1888407aU
            public final void LIZLLL() {
                InterfaceC1649090t11 interfaceC1649090t11;
                C1653330t7r currentBottomTabItemBeforeOnTabChanged;
                InterfaceC1648020szI interfaceC1648020szI = (InterfaceC1648020szI) this.LIZ.getDiContainer().LJIIL(null, InterfaceC1648020szI.class);
                if ((Intrinsics.LJFF((interfaceC1648020szI == null || (currentBottomTabItemBeforeOnTabChanged = interfaceC1648020szI.getCurrentBottomTabItemBeforeOnTabChanged()) == null) ? null : currentBottomTabItemBeforeOnTabChanged.LIZIZ, "record_mode_live") && ((Number) C267080AdO.LIZ.getValue()).intValue() == 1) || (interfaceC1649090t11 = (InterfaceC1649090t11) c1drg.LJIIL(null, InterfaceC1649090t11.class)) == null) {
                    return;
                }
                interfaceC1649090t11.LIZ(null, this.LIZ.getCameraApiComponent().getPreviewView(), (View) this.LIZ.getCameraApiComponent().St2(), true);
            }

            @Override // X.InterfaceC1888407aU
            public final void LIZIZ(boolean z) {
                this.LIZ.gX1(z);
            }

            @Override // X.InterfaceC1888407aU
            public final void LIZJ(boolean z) {
                this.LIZ.H90(z);
            }
        };
        this.LLLJ = new InterfaceC1655400tBC() { // from class: X.0t0y
            @Override // X.InterfaceC1655400tBC
            public final void onHide() {
                this.LIZ.uj(false);
            }

            @Override // X.InterfaceC1655400tBC
            public final void onShow() {
                this.LIZ.uj(true);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.component.a
    public void onActivityResult(int i, int i2, Intent intent) {
        this.LLJJJIL.LJIIJ(new C443120HZe<>(Integer.valueOf(i), Integer.valueOf(i2), intent));
    }
}
