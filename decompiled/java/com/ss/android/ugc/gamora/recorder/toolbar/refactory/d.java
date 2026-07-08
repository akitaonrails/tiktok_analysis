package com.ss.android.ugc.gamora.recorder.toolbar.refactory;

import X.AbstractC1651330t4d;
import X.AbstractC1652010t5j;
import X.AbstractC21664519qV;
import X.C01GW;
import X.C05YC;
import X.C05YF;
import X.C09IR;
import X.C09R3;
import X.C0CHQ;
import X.C0ETY;
import X.C13LE;
import X.C1408850mlX;
import X.C1459900o5s;
import X.C1622090sJT;
import X.C1645380sv2;
import X.C1648160szW;
import X.C1650980t44;
import X.C1651030t49;
import X.C1651120t4I;
import X.C1651580t52;
import X.C1651820t5Q;
import X.C1654400t9a;
import X.C1662100tM0;
import X.C1664770tQJ;
import X.C19A3;
import X.C19EG;
import X.C1DRG;
import X.C201955140j;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2252331DDr;
import X.C23250099c;
import X.C343070Dcf;
import X.C375780EoK;
import X.C375830EoP;
import X.C385670FAf;
import X.C443120HZe;
import X.C452501pT;
import X.C533930Kwp;
import X.C538770LBb;
import X.C560530Lyd;
import X.EnumC1651770t5L;
import X.EnumC1651790t5N;
import X.EnumC1651870t5V;
import X.InterfaceC1621970sJH;
import X.InterfaceC1644770su3;
import X.InterfaceC1647420syK;
import X.InterfaceC1648020szI;
import X.InterfaceC1648510t05;
import X.InterfaceC1649530t1j;
import X.InterfaceC1650230t2r;
import X.InterfaceC1650930t3z;
import X.InterfaceC1651080t4E;
import X.InterfaceC1651320t4c;
import X.InterfaceC1651480t4s;
import X.InterfaceC1651490t4t;
import X.InterfaceC1651550t4z;
import X.InterfaceC1651760t5K;
import X.InterfaceC1651800t5O;
import X.InterfaceC1652190t61;
import X.InterfaceC1657650tEp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC346201Wa;
import X.InterfaceC379610EuV;
import Y.AObjectS246S0100000_25;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.LiveEvent;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.ss.android.ugc.gamora.recorder.greenscreen.e0;
import iyl.i3;
import iyl.s0;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: loaded from: classes26.dex */
public final class d extends AbstractC1651330t4d implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIII;
    public static final int LLLIIIIL;
    public final C19A3 LLILLJJLI;
    public final C1DRG LLILLL;
    public final int LLILZ;
    public final InterfaceC1651490t4t LLILZIL;
    public final Function0<Unit> LLILZLL;
    public final InterfaceC1651800t5O LLIZ = new InterfaceC1651800t5O() { // from class: X.0t5Z
        @Override // X.InterfaceC1651800t5O
        public final C1650980t44 LIZIZ() {
            throw new RuntimeException("ToolbarManager.getVoiceChangeModel is not accessible in new arch");
        }

        @Override // X.InterfaceC1651800t5O
        public final C1650980t44 LIZLLL() {
            throw new RuntimeException("ToolbarManager.getMicrophoneModel is not accessible in new arch");
        }

        @Override // X.InterfaceC1651800t5O
        public final C1650980t44 LJI() {
            throw new RuntimeException("ToolbarManager.getSpeedModel is not accessible in new arch");
        }

        @Override // X.InterfaceC1651800t5O
        public final List<C1650980t44> getItems() {
            throw new RuntimeException("ToolbarManager.getItems is not accessible in new arch");
        }

        @Override // X.InterfaceC1651800t5O
        public final void notifyDataSetChanged() {
            throw new RuntimeException("ToolbarManager.notifyDataSetChanged is not accessible in new arch");
        }

        @Override // X.InterfaceC1651800t5O
        public final void Cl(List list) {
            throw new RuntimeException("ToolbarManager.removeItems is not accessible in new arch");
        }

        @Override // X.InterfaceC1651800t5O
        public final C1650980t44 LIZJ(int i) {
            throw new RuntimeException("ToolbarManager.getModelById is not accessible in new arch");
        }

        @Override // X.InterfaceC1651800t5O
        public final void LJ(InterfaceC1652150t5x interfaceC1652150t5x) {
            throw new RuntimeException("ToolbarManager.addCallback is not accessible in new arch");
        }

        @Override // X.InterfaceC1651800t5O
        public final void LLLZ(List list) {
            throw new RuntimeException("ToolbarManager.addItems is not accessible in new arch");
        }

        @Override // X.InterfaceC1651800t5O
        public final void LIZ(C1650980t44 c1650980t44, boolean z) {
            throw new RuntimeException("ToolbarManager.updateItem is not accessible in new arch");
        }

        @Override // X.InterfaceC1651800t5O
        public final void LJFF(C1650980t44 c1650980t44, boolean z) {
            throw new RuntimeException("ToolbarManager.removeItem is not accessible in new arch");
        }

        @Override // X.InterfaceC1651800t5O
        public final void LJII(C1650980t44 c1650980t44, boolean z) {
            throw new RuntimeException("ToolbarManager.addItem is not accessible in new arch");
        }

        @Override // X.InterfaceC1651800t5O
        public final void LJIIIIZZ(List<? extends C1650980t44> list, boolean z) {
            throw new RuntimeException("ToolbarManager.setItems is not accessible in new arch");
        }
    };
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), a.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1621970sJH.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), ln3.a.class, null);
    public final InterfaceC1731706qJ LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1644770su3.class, null);
    public final InterfaceC1731706qJ LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1649530t1j.class, null);
    public final InterfaceC1731706qJ LLJJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
    public final InterfaceC1731706qJ LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1652190t61.class, null);
    public final InterfaceC1731706qJ LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648510t05.class, null);
    public final InterfaceC1731706qJ LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648020szI.class, null);
    public final InterfaceC1731706qJ LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), List.class, "toolbar_view_pool");
    public final InterfaceC1731706qJ LLJJJ = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), C1645380sv2.class, "lazyBeautyFilter");
    public final InterfaceC1731706qJ LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), e0.class, null);
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 672));
    public EnumC1651870t5V LLJJJJLIIL = EnumC1651870t5V.RECORD_VIDEO;
    public final InterfaceC1651080t4E LLJJL = this;
    public final C560530Lyd<Unit> LLJJLIIIJLLLLLLLZ = new C560530Lyd<>();
    public final C05YC<C375830EoP<InterfaceC1651320t4c<?>>> LLJL;
    public final InterfaceC346201Wa<C375830EoP<InterfaceC1651320t4c<?>>> LLJLIL;
    public final C560530Lyd<C1662100tM0> LLJLILLLLZIIL;
    public final C560530Lyd<Pair<EnumC1651790t5N, Boolean>> LLJLL;
    public final C560530Lyd<C443120HZe<Boolean, Boolean, Boolean>> LLJLLIL;
    public final C560530Lyd<Pair<Boolean, Boolean>> LLJLLL;
    public final C560530Lyd<Boolean> LLJZ;
    public final C560530Lyd<Unit> LLJZIJLIL;
    public final C01GW LLL;
    public final C538770LBb<Boolean> LLLF;
    public final C1651580t52 LLLFF;
    public final C01GW LLLFFI;
    public boolean LLLFZ;
    public final Function0<Unit> LLLI;
    public final Function0<Boolean> LLLII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(d.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(d.class, "recordModeApiComponent", "getRecordModeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/RecordModeApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(d.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(d.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(d.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(d.class, "beautyApi", "getBeautyApi()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(d.class, "filterApi", "getFilterApi()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(d.class, "speedApiComponent", "getSpeedApiComponent()Lcom/ss/android/ugc/gamora/recorder/speed/SpeedApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(d.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(d.class, "recordPermissionApi", "getRecordPermissionApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(d.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS12 = new C2217381BqS(d.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS13 = new C2217381BqS(d.class, "toolbarViewPool", "getToolbarViewPool()Ljava/util/List;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS14 = new C2217381BqS(d.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS15 = new C2217381BqS(d.class, "lazyBeautyFilter", "getLazyBeautyFilter()Lcom/ss/android/ugc/aweme/property/BeautyFilterConfig;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS16 = new C2217381BqS(d.class, "recordGreenScreenUIComponent", "getRecordGreenScreenUIComponent()Lcom/ss/android/ugc/gamora/recorder/greenscreen/RecordGreenScreenUIComponent;", 0);
        c09r3.getClass();
        LLLIIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11, c2217381BqS12, c2217381BqS13, c2217381BqS14, c2217381BqS15, c2217381BqS16};
        LLLIIIIL = 8;
    }

    private final InterfaceC1648020szI Op() {
        return (InterfaceC1648020szI) this.LLJJIJIIJIL.getValue(this, LLLIIII[11]);
    }

    private final s0 T2() {
        return (s0) this.LLLFFI.getValue();
    }

    private final e0 W2() {
        return (e0) this.LLJJJJ.getValue(this, LLLIIII[15]);
    }

    private final C1651820t5Q Z1() {
        return (C1651820t5Q) this.LLJJJJJIL.getValue();
    }

    private final InterfaceC1621970sJH c3() {
        return (InterfaceC1621970sJH) this.LLJ.getValue(this, LLLIIII[1]);
    }

    private final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLJIJIL.getValue(this, LLLIIII[3]);
    }

    private final InterfaceC1648510t05 getGestureApiComponent() {
        return (InterfaceC1648510t05) this.LLJJIJI.getValue(this, LLLIIII[10]);
    }

    public final C560530Lyd<Boolean> B3() {
        return (C560530Lyd) this.LLL.getValue();
    }

    @Override // X.InterfaceC1651080t4E
    public void Bw1() {
        this.LLJJLIIIJLLLLLLLZ.LJIIJ(Unit.LIZ);
    }

    public final InterfaceC1644770su3 G2() {
        return (InterfaceC1644770su3) this.LLJILLL.getValue(this, LLLIIII[6]);
    }

    public final C1645380sv2 H2() {
        return (C1645380sv2) this.LLJJJIL.getValue(this, LLLIIII[14]);
    }

    public final void X1() {
        if (C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO") || !C1651120t4I.LIZ()) {
            return;
        }
        C1651030t49.LIZIZ(KY1(), EnumC1651770t5L.VOICE_CHANGE, false);
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLJJJ.getValue(this, LLLIIII[13]);
    }

    public final a getPlanCUIApiComponent() {
        return (a) this.LLIZLLLIL.getValue(this, LLLIIII[0]);
    }

    public final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLJJI.getValue(this, LLLIIII[8]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJILJIL.getValue(this, LLLIIII[4]);
    }

    public final q getStickerApiComponent() {
        return (q) this.LLJI.getValue(this, LLLIIII[2]);
    }

    public final InterfaceC1652190t61 i3() {
        return (InterfaceC1652190t61) this.LLJJIII.getValue(this, LLLIIII[9]);
    }

    public final InterfaceC1649530t1j m3() {
        return (InterfaceC1649530t1j) this.LLJJ.getValue(this, LLLIIII[7]);
    }

    public final List<View> v3() {
        return (List) this.LLJJIJIL.getValue(this, LLLIIII[12]);
    }

    public final ln3.a w2() {
        return (ln3.a) this.LLJILJILJ.getValue(this, LLLIIII[5]);
    }

    @Override // X.InterfaceC1651080t4E
    public void wP() {
        throw new RuntimeException("ToolbarManager.notifyDataSetChanged is not accessible in new arch");
    }

    private final void registerObservers() {
        LiveEvent<AbstractC1652010t5j> liveEventXR0;
        C385670FAf<C375830EoP<Boolean>> c385670FAfBx1;
        C385670FAf<Boolean> c385670FAfQH1;
        getDiContainer();
        if (C343070Dcf.LIZIZ()) {
            if (getPlanCUIApiComponent().US().LIZJ().floatValue() < 1.0f) {
                View view = q3().LJI().mView;
                if (view != null) {
                    view.setLayerType(2, null);
                }
                getPlanCUIApiComponent().Z40().LIZ(this, new AObjectS246S0100000_25(this, 627));
            }
            getPlanCUIApiComponent().US().LIZ(this, new AObjectS246S0100000_25(this, 628));
        }
        q3().yv(this.LLLI, this.LLLII);
        e0 e0VarW2 = W2();
        if (e0VarW2 != null && (c385670FAfQH1 = e0VarW2.QH1()) != null) {
            c385670FAfQH1.LIZ(this, new AObjectS246S0100000_25(this, 629));
        }
        getPlanCUIApiComponent().sK0().LIZ(this, new AObjectS246S0100000_25(this, 630));
        getPlanCUIApiComponent().RS().LIZ(this, new AObjectS246S0100000_25(this, 631));
        getPlanCUIApiComponent().Cg1().LIZ(this, new AObjectS246S0100000_25(this, 632));
        if (C1622090sJT.LIZ(H2())) {
            whenReady(this, ln3.a.class, new AwS604S0100000_25(this, 406));
        } else {
            ln3.a aVarW2 = w2();
            if (aVarW2 != null && (liveEventXR0 = aVarW2.XR0()) != null) {
                liveEventXR0.LIZ(this, new AObjectS246S0100000_25(this, 633));
            }
        }
        getPlanCUIApiComponent().YQ0().LIZ(this, new AObjectS246S0100000_25(this, 634));
        Op().getBottomTabIndexChangeEvent().LIZ(this, new AObjectS246S0100000_25(this, 622));
        InterfaceC1652190t61 interfaceC1652190t61I3 = i3();
        if (interfaceC1652190t61I3 != null && (c385670FAfBx1 = interfaceC1652190t61I3.bx1()) != null) {
            c385670FAfBx1.LIZ(this, new AObjectS246S0100000_25(this, 623));
        }
        C1DRG diContainer = getDiContainer();
        if (C343070Dcf.LIZ()) {
            ((C0ETY) diContainer.LJII(C0ETY.class, null)).Sd(InterfaceC1650930t3z.class, new AwS604S0100000_25(this, 405));
        } else {
            C05YF c05yf = (C05YF) diContainer.LJIIL(null, InterfaceC1650930t3z.class);
            if (c05yf != null) {
                ((InterfaceC1650930t3z) c05yf).x60().LIZ(this, new AObjectS246S0100000_25(this, 624));
            }
        }
        c3().Rm().LIZ(this, new AObjectS246S0100000_25(this, 625));
        c3().CP1().LIZ(this, new AObjectS246S0100000_25(this, 626));
        InterfaceC1648510t05 gestureApiComponent = getGestureApiComponent();
        if (gestureApiComponent != null) {
            gestureApiComponent.AL1(new AbstractC21664519qV() { // from class: X.0t5b
                @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
                public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                    if (motionEvent != null && motionEvent.getAction() == 0) {
                        this.LL.q3().j5();
                    }
                    return false;
                }
            }, 19, 50);
        }
    }

    public final boolean E3() {
        return d4.LJJII(getShortVideoContext()) || getShortVideoContext().shootMode == 24 || d4.LJJIII(getShortVideoContext()) || d4.LJIIIZ(getShortVideoContext());
    }

    @Override // X.InterfaceC1651080t4E
    public void Ee2() {
        Scene sceneLJI = q3().LJI();
        if (this.LLILLJJLI.isShowing(sceneLJI)) {
            this.LLJZ.LJIIJ(Boolean.FALSE);
            JH(false);
            this.LLILLJJLI.hide(sceneLJI);
        }
    }

    public final void H3() {
        q3().Av();
    }

    @Override // X.InterfaceC1651080t4E
    public boolean Nq() {
        return q3().Nq();
    }

    public final void W1() {
        if (!getShortVideoContext().isDuetMode && !getShortVideoContext().LJJLL() && !d4.LJJIJ(getShortVideoContext())) {
            C1651030t49.LIZIZ(KY1(), EnumC1651770t5L.MICROPHONE, false);
        }
        if (getShortVideoContext().isDuetMode && getShortVideoContext().LJJLL()) {
            C1651030t49.LIZIZ(KY1(), EnumC1651770t5L.MICROPHONE, true);
        }
        if (C1651120t4I.LIZ() && !C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO") && getShortVideoContext().creativeModel.initialModel.recordPageOptionalConfig == null) {
            C1651030t49.LIZIZ(KY1(), EnumC1651770t5L.MICROPHONE, true);
        }
    }

    @Override // X.InterfaceC1651080t4E
    public boolean c51() {
        return C375780EoK.LIZ(T2().mView);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        getRecordAdapterApi().Sy2(this);
        Function0<Unit> function0 = this.LLILZLL;
        if (function0 != null) {
            function0.invoke();
        }
        KY1().LJFF();
        C1459900o5s c1459900o5s = C1459900o5s.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordToolbarLogicComponent before add scene ");
        sbLIZ.append(this.LLILLJJLI.mState);
        sbLIZ.append(' ');
        sbLIZ.append(q3().LJI().mState);
        C201955140j.LIZJ(c1459900o5s, C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI.add(this.LLILZ, q3().LJI(), "ToolbarScene");
        registerObservers();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("RecordToolbarLogicComponent after add scene ");
        sbLIZ2.append(this.LLILLJJLI.mState);
        sbLIZ2.append(' ');
        sbLIZ2.append(q3().LJI().mState);
        C201955140j.LIZJ(c1459900o5s, C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        this.LLJZ.LJIIJ(Boolean.FALSE);
        JH(false);
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        if (C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO") && C1651120t4I.LIZ()) {
            InterfaceC1651490t4t interfaceC1651490t4tKY1 = KY1();
            EnumC1651770t5L enumC1651770t5L = EnumC1651770t5L.MICROPHONE;
            i3 i3Var = (i3) interfaceC1651490t4tKY1.LIZJ(enumC1651770t5L);
            if (i3Var == null || !i3Var.LLIZ) {
                return;
            }
            if (d4.LJJIJ(getShortVideoContext())) {
                getCameraApiComponent().w61(new C1648160szW((getShortVideoContext().cameraComponentModel.mDurings.size() > 0 || getShortVideoContext().cameraComponentModel.isMuted) ? 2 : 1));
            } else {
                C1651030t49.LIZIZ(KY1(), enumC1651770t5L, false);
            }
            if (d4.LJJIJIIJI(getShortVideoContext())) {
                C1651030t49.LIZIZ(KY1(), EnumC1651770t5L.VOICE_CHANGE, this.LLJJJJLIIL == EnumC1651870t5V.RECORD_VIDEO);
            }
        }
    }

    public final InterfaceC1651760t5K q3() {
        return T2();
    }

    @Override // X.InterfaceC1651080t4E
    public void vv() {
        q3().vv();
    }

    @Override // X.InterfaceC1651080t4E
    public InterfaceC1651490t4t KY1() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1651080t4E
    public LiveEvent<Unit> LLLLLZL() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC1651080t4E
    public boolean Oe0() {
        return this.LLLFZ;
    }

    @Override // X.InterfaceC1651080t4E
    public InterfaceC1651800t5O XI0() {
        return this.LLIZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public InterfaceC1651080t4E o2() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC1651080t4E
    public InterfaceC346201Wa<C375830EoP<InterfaceC1651320t4c<?>>> oc0() {
        return this.LLJLIL;
    }

    @Override // X.InterfaceC1651080t4E
    public void A2(int i) {
        q3().A2(i);
    }

    @Override // X.InterfaceC1651080t4E
    public void Et(boolean z) {
        if (z) {
            Keva repo = KevaImpl.getRepo("repo_tool_bar", 0);
            boolean zLJJJLIIL = C0CHQ.LIZ().LJJIIZI().LJJJLIIL(false);
            if (!repo.getBoolean("key_ai_caption_guide_had_show", false) && !zLJJJLIIL) {
                Z1().LIZIZ();
                repo.storeBoolean("key_ai_caption_guide_had_show", true);
                return;
            }
            return;
        }
        Z1().LIZ();
    }

    @Override // X.InterfaceC1651080t4E
    public void Fs2(boolean z) {
        if (z) {
            EnumC1651870t5V enumC1651870t5V = EnumC1651870t5V.RECORD_PHOTO;
            this.LLJJJJLIIL = enumC1651870t5V;
            q3().Bv(enumC1651870t5V);
            KY1().LIZ(new AwS604S0100000_25(this, 407));
            return;
        }
        EnumC1651870t5V enumC1651870t5V2 = EnumC1651870t5V.RECORD_VIDEO;
        this.LLJJJJLIIL = enumC1651870t5V2;
        q3().Bv(enumC1651870t5V2);
        KY1().LIZ(new AwS604S0100000_25(this, 408));
    }

    @Override // X.AbstractC1651330t4d, X.InterfaceC1651080t4E
    public void JH(boolean z) {
        C560530Lyd<C443120HZe<Boolean, Boolean, Boolean>> c560530Lyd = this.LLJLLIL;
        Boolean boolValueOf = Boolean.valueOf(z);
        Boolean bool = Boolean.FALSE;
        c560530Lyd.LJIIJ(new C443120HZe<>(boolValueOf, bool, bool));
    }

    @Override // X.AbstractC1651330t4d, X.InterfaceC1651080t4E
    public void LT1(boolean z) {
        this.LLJZ.LJIIJ(Boolean.valueOf(z));
    }

    @Override // X.AbstractC1651330t4d, X.InterfaceC1651080t4E
    public void Nh(C1662100tM0 c1662100tM0) {
        this.LLJLILLLLZIIL.LJIIJ(c1662100tM0);
    }

    @Override // X.AbstractC1651330t4d, X.InterfaceC1651080t4E
    public void Pj2(InterfaceC1651320t4c<?> interfaceC1651320t4c) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1408850mlX(this, interfaceC1651320t4c, null), 3);
    }

    @Override // X.InterfaceC1651080t4E
    public C1654400t9a Zu0(EnumC1651770t5L enumC1651770t5L) {
        return q3().Cv(enumC1651770t5L);
    }

    @Override // X.InterfaceC1651080t4E
    public void bW1(boolean z) {
        this.LLLF.LJII(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1651080t4E
    public View ch0(EnumC1651770t5L enumC1651770t5L) {
        return q3().wv(enumC1651770t5L);
    }

    @Override // X.InterfaceC1651080t4E
    public void o30(InterfaceC1657650tEp interfaceC1657650tEp) {
        T2().LLJZIJLIL = interfaceC1657650tEp;
    }

    @Override // X.InterfaceC1651080t4E
    public C1650980t44 ss(int i) {
        return null;
    }

    @Override // X.AbstractC1651330t4d, X.InterfaceC1651080t4E
    public void Kt1(InterfaceC1651320t4c<i3> interfaceC1651320t4c, InterfaceC1651480t4s<i3, InterfaceC1651550t4z> interfaceC1651480t4s) {
        this.LLLFF.LIZ.put(interfaceC1651320t4c, interfaceC1651480t4s);
    }

    @Override // X.AbstractC1651330t4d, X.InterfaceC1651080t4E
    public void jm2(EnumC1651770t5L enumC1651770t5L, boolean z) {
        EnumC1651790t5N enumC1651790t5N;
        String key = enumC1651770t5L.getKey();
        if (Intrinsics.LJFF(key, EnumC1651770t5L.SPEED.getKey())) {
            enumC1651790t5N = EnumC1651790t5N.SPEED;
        } else if (Intrinsics.LJFF(key, EnumC1651770t5L.FLASH.getKey())) {
            enumC1651790t5N = EnumC1651790t5N.FLASH;
        } else if (Intrinsics.LJFF(key, EnumC1651770t5L.AI_ALIVE.getKey())) {
            enumC1651790t5N = EnumC1651790t5N.AI_ALIVE;
        } else if (Intrinsics.LJFF(key, EnumC1651770t5L.AI_THEATER.getKey())) {
            enumC1651790t5N = EnumC1651790t5N.AI_THEATER;
        } else if (Intrinsics.LJFF(key, EnumC1651770t5L.BEAUTY.getKey())) {
            enumC1651790t5N = EnumC1651790t5N.BEAUTY;
        } else if (Intrinsics.LJFF(key, EnumC1651770t5L.FILTER.getKey())) {
            enumC1651790t5N = EnumC1651790t5N.FILTER;
        } else if (Intrinsics.LJFF(key, EnumC1651770t5L.VOICE_CHANGE.getKey())) {
            enumC1651790t5N = EnumC1651790t5N.VOICE_CHANGE;
        } else if (Intrinsics.LJFF(key, EnumC1651770t5L.MICROPHONE.getKey())) {
            enumC1651790t5N = EnumC1651790t5N.MICROPHONE;
        } else if (Intrinsics.LJFF(key, EnumC1651770t5L.AI_CAPTION.getKey())) {
            enumC1651790t5N = EnumC1651790t5N.AI_CAPTION;
        } else if (Intrinsics.LJFF(key, EnumC1651770t5L.DUET_LAYOUT.getKey())) {
            enumC1651790t5N = EnumC1651790t5N.DUET_LAYOUT_SWITCH;
        } else if (Intrinsics.LJFF(key, EnumC1651770t5L.HDR.getKey())) {
            enumC1651790t5N = EnumC1651790t5N.HDR;
        } else if (Intrinsics.LJFF(key, EnumC1651770t5L.CHANGE_RATIO.getKey())) {
            enumC1651790t5N = EnumC1651790t5N.CHANGE_RATIO;
        } else if (Intrinsics.LJFF(key, EnumC1651770t5L.LAYOUT.getKey())) {
            enumC1651790t5N = EnumC1651790t5N.LAYOUT;
        } else if (Intrinsics.LJFF(key, EnumC1651770t5L.PORTRAIT.getKey())) {
            enumC1651790t5N = EnumC1651790t5N.PORTRAIT;
        } else if (Intrinsics.LJFF(key, EnumC1651770t5L.GREEN_SCREEN.getKey())) {
            enumC1651790t5N = EnumC1651790t5N.GREEN_SCREEN;
        } else if (Intrinsics.LJFF(key, EnumC1651770t5L.COUNT_DOWN.getKey())) {
            enumC1651790t5N = EnumC1651790t5N.COUNT_DOWN;
        } else {
            enumC1651790t5N = EnumC1651790t5N.EMPTY;
        }
        this.LLJLL.LJIIJ(new Pair<>(enumC1651790t5N, Boolean.valueOf(z)));
    }

    @Override // X.AbstractC1651330t4d, X.InterfaceC1651080t4E
    public void pS0(boolean z, boolean z2) {
        this.LLJLLL.LJIIJ(new Pair<>(Boolean.valueOf(z), Boolean.valueOf(z2)));
        JH(false);
    }

    public d(C19A3 c19a3, C1DRG c1drg, int i, InterfaceC1651490t4t interfaceC1651490t4t, Function0<Unit> function0) {
        this.LLILLJJLI = c19a3;
        this.LLILLL = c1drg;
        this.LLILZ = i;
        this.LLILZIL = interfaceC1651490t4t;
        this.LLILZLL = function0;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LLJL = c2252331DDrLIZIZ;
        this.LLJLIL = c2252331DDrLIZIZ;
        this.LLJLILLLLZIIL = new C560530Lyd<>();
        this.LLJLL = new C560530Lyd<>();
        this.LLJLLIL = new C560530Lyd<>();
        this.LLJLLL = new C560530Lyd<>();
        this.LLJZ = new C560530Lyd<>();
        this.LLJZIJLIL = new C560530Lyd<>();
        this.LLL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(327));
        this.LLLF = new C538770LBb<>(Boolean.TRUE);
        this.LLLFF = new C1651580t52();
        this.LLLFFI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 674));
        this.LLLFZ = true;
        this.LLLI = new AwS569S0100000_25(this, 675);
        this.LLLII = new AwS569S0100000_25(this, 673);
    }
}
