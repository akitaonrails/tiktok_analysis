package com.ss.android.ugc.aweme.offlinemode.ui;

import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C0RGG;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C14EU;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C19319410i8;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C297260Bky;
import X.C452501pT;
import X.C581630MrZ;
import X.C586380MzE;
import X.C610460Nwy;
import X.C622680Oba;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC624780Oey;
import X.InterfaceC0148002o;
import X.InterfaceC1616070s9l;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.hardware.display.DisplayManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.api.IMLDataCenterService;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterService;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS46S0100100_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class OfflineModeContentComponent extends BasePanelComponent implements InterfaceC724530SbT, DisplayManager.DisplayListener {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final C19319410i8 LLJ;
    public final C01GW LL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1373));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1370));
    public final AssemVMLazy LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public final C01GW LLILZLL;
    public final C630740Ooa LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OfflineModeContentComponent.class, "managerVM", "getManagerVM()Lcom/ss/android/ugc/aweme/offlinemode/viewmodel/OfflineModeManagerVM;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJ = new C19319410i8("OfflineModeContentComponent");
    }

    public OfflineModeContentComponent() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OfflineModeManagerVM.class);
        this.LLILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1372), AFwS240S0000000_9.get$arr$(572), null, true);
        this.LLILZLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(288));
        this.LLIZ = C628500Oky.LIZ(new AwS553S0100000_9(this, 1371));
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        try {
            if (!this.LLILZIL) {
                DisplayManager displayManager = (DisplayManager) this.LLILZLL.getValue();
                if (displayManager != null) {
                    displayManager.registerDisplayListener(this, null);
                }
                this.LLILZIL = true;
            }
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C01GW<C0RGG> c01gw = C0RGG.LJ;
        if (C586380MzE.LIZ().LIZLLL) {
            this.LLILZ = true;
            LLJ.LJ("video pause because of screenRecording");
            DetailFragmentPanel detailFragmentPanelM298do = m298do();
            if (detailFragmentPanelM298do != null) {
                detailFragmentPanelM298do.f = true;
                detailFragmentPanelM298do.LLLLLLLLLL();
            }
            DetailFragmentPanel detailFragmentPanelM298do2 = m298do();
            if (detailFragmentPanelM298do2 != null) {
                detailFragmentPanelM298do2.nk(true);
            }
            bo().EQ2(EnumC624780Oey.SCREEN_RECORDING_TOAST);
        }
        C736680Sv4.LJIIIIZZ(this, bo(), new C2217381BqS() { // from class: X.0OCD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C616100OEm) obj).LLILLJJLI);
            }
        }, null, new AwS623S0100000_9(this, 120), 6);
        if ((C297260Bky.LIZ() & 16) == 16 && C297260Bky.LIZJ() && C297260Bky.LIZIZ()) {
            C610460Nwy.LIZ.getClass();
            if (C610460Nwy.LJ()) {
                C736680Sv4.LJIIIIZZ(this, bo(), new C2217381BqS() { // from class: X.0OEP
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C616100OEm) obj).LLJJI;
                    }
                }, null, new AwS623S0100000_9(this, 121), 6);
            }
        }
        C622680Oba.LIZJ(this);
        C610460Nwy.LIZ.getClass();
        C610460Nwy.LJ = true;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
    }

    public final OfflineModeManagerVM bo() {
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
        return (OfflineModeManagerVM) assemVMLazy.getValue();
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final DetailFragmentPanel m298do() {
        return (DetailFragmentPanel) this.LLIZ.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
        DisplayManager displayManager = (DisplayManager) this.LLILZLL.getValue();
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this);
        }
        C610460Nwy.LIZ.getClass();
        C610460Nwy.LJ = false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new InterfaceC1616070s9l() { // from class: X.0NtJ
                public String LL;

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
                    String aid;
                    Aweme awemeLJIIIIZZ;
                    IViewPagerComponentAbility iViewPagerComponentAbility2 = (IViewPagerComponentAbility) this.LLILLJJLI.LL.getValue();
                    if (iViewPagerComponentAbility2 != null && (awemeLJIIIIZZ = iViewPagerComponentAbility2.LJIIIIZZ()) != null) {
                        aid = awemeLJIIIIZZ.getAid();
                        if (aid != null) {
                            MLDataCenterService.Companion.getClass();
                            IMLDataCenterService iMLDataCenterService = C1349505Px.LIZ;
                            C610460Nwy.LIZ.getClass();
                            iMLDataCenterService.setContentScoreIndex(aid, i - C610460Nwy.LIZIZ);
                        }
                    } else {
                        aid = null;
                    }
                    OfflineModeManagerVM offlineModeManagerVMBo = this.LLILLJJLI.bo();
                    OfflineModeManagerVM.LLILZLL.LIZ("toggleUpdateWatchState aid", aid);
                    if (aid != null) {
                        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(offlineModeManagerVMBo), C0PEM.LIZJ, null, new C1349405Pw(offlineModeManagerVMBo, aid, null), 2);
                    }
                    String str = this.LL;
                    if (str == null || !Intrinsics.LJFF(str, aid)) {
                        this.LL = aid;
                        OfflineModeManagerVM offlineModeManagerVMBo2 = this.LLILLJJLI.bo();
                        offlineModeManagerVMBo2.setState(new AwS46S0100100_9(offlineModeManagerVMBo2, this.LLILLJJLI.bo().getState().LLJILLL.LIZ.longValue() + 1, 9));
                    }
                }
            });
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        LLJ.LJIIIZ("video pause because of screenRecording");
        this.LLILZ = true;
        DetailFragmentPanel detailFragmentPanelM298do = m298do();
        if (detailFragmentPanelM298do != null) {
            detailFragmentPanelM298do.f = true;
            detailFragmentPanelM298do.LLLLLLLLLL();
        }
        DetailFragmentPanel detailFragmentPanelM298do2 = m298do();
        if (detailFragmentPanelM298do2 != null) {
            detailFragmentPanelM298do2.nk(true);
        }
        bo().EQ2(EnumC624780Oey.SCREEN_RECORDING_TOAST);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        this.LLILZ = false;
        DetailFragmentPanel detailFragmentPanelM298do = m298do();
        if (detailFragmentPanelM298do != null) {
            detailFragmentPanelM298do.f = false;
            detailFragmentPanelM298do.tryResumePlay();
        }
    }

    @C14EU
    public final void onVideoPlayerEvent(C581630MrZ c581630MrZ) {
        DetailFragmentPanel detailFragmentPanelM298do;
        if (C1697810uHb.LJIIJJI(3, 10, 5).contains(Integer.valueOf(c581630MrZ.LIZ)) && this.LLILZ && (detailFragmentPanelM298do = m298do()) != null) {
            detailFragmentPanelM298do.nk(true);
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
