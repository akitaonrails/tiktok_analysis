package com.ss.android.ugc.aweme.story.feed.guidecard.component.panel;

import X.C01B7;
import X.C01D1;
import X.C03H5;
import X.C0OF1;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C1637806bA;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C616230OEz;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724750Sbp;
import X.C725080ScM;
import X.C736680Sv4;
import X.InterfaceC0148002o;
import X.InterfaceC1554640qYg;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.story.feed.guidecard.component.panel.StoryGuideCardFilterPanelComponentA2;
import com.ss.android.ugc.aweme.story.feed.guidecard.filter.GuideCardFilterVM;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class StoryGuideCardFilterPanelComponentA2 extends BasePanelComponent implements InterfaceC724530SbT, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final AssemVMLazy LL;
    public final C630740Ooa LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoryGuideCardFilterPanelComponentA2.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/story/feed/guidecard/filter/GuideCardFilterVM;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public StoryGuideCardFilterPanelComponentA2() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GuideCardFilterVM.class);
        this.LL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new C01B7(c19719912DlLIZ), new C0OF1(), null, true);
        this.LLILLJJLI = C628500Oky.LIZ(new C616230OEz(this));
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

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        str.getClass();
        return null;
    }

    public final GuideCardFilterVM bo() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        return (GuideCardFilterVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C725080ScM.LIZ().execute(new Runnable() { // from class: X.01B2
            public final void LIZ() {
                StoryGuideCardFilterPanelComponentA2 storyGuideCardFilterPanelComponentA2 = this.LL;
                try {
                    C736680Sv4.LJIIIIZZ(storyGuideCardFilterPanelComponentA2, storyGuideCardFilterPanelComponentA2.bo(), new C2217371BqR() { // from class: X.0Rxu
                        @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((C712920Rxq) obj).LL;
                        }

                        @Override // X.C2217371BqR, X.AbstractC2217331BqN
                        public final void set(Object obj, Object obj2) {
                            ((C712920Rxq) obj).LL = (Pair) obj2;
                        }
                    }, C736820SvI.LIZLLL(), new C01B1(storyGuideCardFilterPanelComponentA2), 4);
                    C736680Sv4.LJIIIIZZ(storyGuideCardFilterPanelComponentA2, storyGuideCardFilterPanelComponentA2.bo(), new C2217371BqR() { // from class: X.0Rxw
                        @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((C712920Rxq) obj).LLILLJJLI;
                        }

                        @Override // X.C2217371BqR, X.AbstractC2217331BqN
                        public final void set(Object obj, Object obj2) {
                            ((C712920Rxq) obj).LLILLJJLI = (String) obj2;
                        }
                    }, C736820SvI.LIZLLL(), new C291501Az(), 4);
                    C189200o6.m2constructorimpl(C736680Sv4.LJIIIIZZ(storyGuideCardFilterPanelComponentA2, storyGuideCardFilterPanelComponentA2.bo(), new C2217371BqR() { // from class: X.0Rxv
                        @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((C712920Rxq) obj).LLILLL;
                        }

                        @Override // X.C2217371BqR, X.AbstractC2217331BqN
                        public final void set(Object obj, Object obj2) {
                            ((C712920Rxq) obj).LLILLL = (Pair) obj2;
                        }
                    }, C736820SvI.LIZLLL(), new C01B0(storyGuideCardFilterPanelComponentA2), 4));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("StoryGuideCardFilterPanelComponentA2@d7ef.onCreate$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("StoryGuideCardFilterPanelComponentA2@d7ef.onCreate$1");
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cc, code lost:
    
        r13 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0125 A[SYNTHETIC] */
    /* JADX INFO: renamed from: do, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m324do(boolean r24) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.guidecard.component.panel.StoryGuideCardFilterPanelComponentA2.m324do(boolean):void");
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
