package com.ss.android.ugc.aweme.im.feature.animation;

import X.AbstractC1623806Xk;
import X.AbstractC1751306tT;
import X.AbstractC738140SxQ;
import X.AbstractC813200VvC;
import X.C013C;
import X.C01GW;
import X.C03H5;
import X.C06XH;
import X.C095E;
import X.C095G;
import X.C09AE;
import X.C0PEM;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1393605cs;
import X.C1393805cu;
import X.C13E8;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1608506Rn;
import X.C1622006Ws;
import X.C1622406Ww;
import X.C1622506Wx;
import X.C1751406tU;
import X.C1751606tW;
import X.C1751706tX;
import X.C1751906tZ;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C1954807lC;
import X.C19EG;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C457780HxI;
import X.C687700QyG;
import X.C723580SZw;
import X.C724240Sb0;
import X.C736680Sv4;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1364105Vn;
import X.InterfaceC1554640qYg;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.AComparatorS21S0000000_2;
import Y.AComparatorS501S0100000_2;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.IAnimationConflictChecker;
import com.ss.android.ugc.aweme.im.chatroom.api.IAnimationGreetingCardChecker;
import com.ss.android.ugc.aweme.im.chatroom.api.animation.IAnimationQueueManager;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.vibefeed.VibeFeedRuntimeFeature;
import com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AnimationQueueManagerAssem extends AbstractC738140SxQ implements InterfaceC724530SbT, IAnimationQueueManager, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final C1751906tZ Companion = new Object() { // from class: X.06tZ
    };
    public C09AE animationTaskJob;
    public final Comparator<C1622406Ww> comparator;
    public Function0<Unit> currentAnimEndListener;
    public volatile C1622406Ww currentExecutableBlock;
    public AbstractC813200VvC fragmentLifecycleCallback;
    public boolean longPressPopupShowing;
    public final PriorityQueue<C1622406Ww> queue;
    public boolean quickChatAndExpandToFullScreen;
    public FragmentManager registeredFragmentManager;
    public final C095E<Unit> signalChannel;
    public final C1559260qg8 chatHierarchyData$delegate = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW sessionUuid$delegate = C452501pT.LIZIZ(new AwS546S0100000_2(this, 355));
    public final C01GW isQuickChat$delegate = C452501pT.LIZIZ(new AwS546S0100000_2(this, 354));

    @Override // X.InterfaceC1146704e9
    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1988261386) {
            return null;
        }
        return this;
    }

    private final boolean anyPopupOrSheetShowing() {
        boolean z;
        IAnimationGreetingCardChecker iAnimationGreetingCardChecker;
        IAnimationConflictChecker iAnimationConflictChecker = (IAnimationConflictChecker) PluggableExtentionKt.pluggableSpiForReal(IAnimationConflictChecker.class);
        boolean z2 = iAnimationConflictChecker != null && iAnimationConflictChecker.LIZ(getSessionUuid());
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null || c19egLIZ.isFinishing()) {
            return z2;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        boolean z3 = (interfaceC665370Q7zLJIIL == null || (iAnimationGreetingCardChecker = (IAnimationGreetingCardChecker) PluggableExtentionKt.pluggableSpiForReal(IAnimationGreetingCardChecker.class)) == null || !iAnimationGreetingCardChecker.LIZ(interfaceC665370Q7zLJIIL)) ? false : true;
        VibeFeedRuntimeFeature vibeFeedRuntimeFeatureLIZ = VibeFeedRuntimeFeature.LIZ.LIZ();
        boolean z4 = vibeFeedRuntimeFeatureLIZ != null && vibeFeedRuntimeFeatureLIZ.LJFF();
        boolean z5 = isQuickChat() && !this.quickChatAndExpandToFullScreen;
        FragmentManager supportFragmentManager = c19egLIZ.getSupportFragmentManager();
        if (supportFragmentManager != null) {
            C13E8 c13e8 = new C13E8();
            c13e8.addAll(supportFragmentManager.LJJLIIIJL());
            while (!c13e8.isEmpty()) {
                Fragment fragment = (Fragment) c13e8.removeFirst();
                if ((fragment instanceof DialogFragment) && fragment.isVisible()) {
                    String tag = null;
                    if ((fragment instanceof TuxSheet) && fragment != null) {
                        tag = fragment.getTag();
                    }
                    if (!Intrinsics.LJFF(tag, "quick_chat_sheet")) {
                        z = true;
                        break;
                    }
                }
                if (fragment.isAdded()) {
                    c13e8.addAll(fragment.getChildFragmentManager().LJJLIIIJL());
                }
            }
            z = false;
        } else {
            z = false;
        }
        IMShareService.LIZ.getClass();
        IMShareService iMShareServiceLIZ = C1608506Rn.LIZ();
        boolean z6 = iMShareServiceLIZ != null && iMShareServiceLIZ.LJIIIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bottomPopupOrNoticeShowing=");
        sbLIZ.append(z2);
        sbLIZ.append(", hasSheet=");
        sbLIZ.append(z);
        sbLIZ.append(", isGreetingCardShowing=");
        sbLIZ.append(z3);
        sbLIZ.append(", isSharedFeedTutorialShowing=");
        sbLIZ.append(z4);
        sbLIZ.append(", isNineSplitScreenInQuickChat=");
        sbLIZ.append(z5);
        sbLIZ.append(", shareDialogShowing=");
        sbLIZ.append(z6);
        sbLIZ.append(", longPressPopupShowing=");
        sbLIZ.append(this.longPressPopupShowing);
        C2188811AlT.LIZIZ(sbLIZ);
        return z2 || z || z3 || z4 || z5 || z6 || this.longPressPopupShowing;
    }

    private final void cleanup() {
        C09AE c09ae = this.animationTaskJob;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.signalChannel.LJIIJJI(null);
        this.queue.clear();
    }

    private final String getSessionUuid() {
        return (String) this.sessionUuid$delegate.getValue();
    }

    private final void interruptCurrent() {
        C09AE c09ae = this.animationTaskJob;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
    }

    private final boolean isQuickChat() {
        return ((Boolean) this.isQuickChat$delegate.getValue()).booleanValue();
    }

    public final C457780HxI getChatHierarchyData() {
        return (C457780HxI) this.chatHierarchyData$delegate.getValue();
    }

    public AnimationQueueManagerAssem() {
        AComparatorS501S0100000_2 aComparatorS501S0100000_2 = new AComparatorS501S0100000_2(new AComparatorS21S0000000_2(5), 1);
        this.comparator = aComparatorS501S0100000_2;
        this.queue = new PriorityQueue<>(10, aComparatorS501S0100000_2);
        this.signalChannel = C095G.LIZ(-1, null, 6);
    }

    private final void registerFragmentDismissListener() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        AbstractC813200VvC abstractC813200VvC = new AbstractC813200VvC() { // from class: X.06tS
            @Override // X.AbstractC813200VvC
            public final void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
                if (fragment instanceof DialogFragment) {
                    this.LL.onPopupOrSheetDismissed(false);
                }
            }
        };
        this.fragmentLifecycleCallback = abstractC813200VvC;
        FragmentManager supportFragmentManager = c19egLIZ.getSupportFragmentManager();
        this.registeredFragmentManager = supportFragmentManager;
        supportFragmentManager.LJZL(abstractC813200VvC, true);
    }

    private final void startConsumerLoop() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnimationQueueManagerAssem start loop, sessionUuid=");
        sbLIZ.append(getSessionUuid());
        C2188811AlT.LIZIZ(sbLIZ);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C1393605cs(this, null), 2);
    }

    @Override // X.AbstractC738140SxQ
    public void onCreate() {
        super.onCreate();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnimationQueueManagerAssem onCreate, sessionUuid=");
        sbLIZ.append(getSessionUuid());
        C2188811AlT.LIZIZ(sbLIZ);
        startConsumerLoop();
        registerFragmentDismissListener();
    }

    @Override // X.AbstractC738140SxQ
    public void onDestroy() {
        FragmentManager supportFragmentManager;
        C19EG c19egLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnimationQueueManagerAssem onDestroy, sessionUuid=");
        sbLIZ.append(getSessionUuid());
        C2188811AlT.LIZIZ(sbLIZ);
        super.onDestroy();
        cleanup();
        AbstractC813200VvC abstractC813200VvC = this.fragmentLifecycleCallback;
        if (abstractC813200VvC != null) {
            if (((Boolean) C1751406tU.LIZ.getValue()).booleanValue()) {
                FragmentManager supportFragmentManager2 = this.registeredFragmentManager;
                if (supportFragmentManager2 != null || ((c19egLIZ = C724240Sb0.LIZ(this)) != null && (supportFragmentManager2 = c19egLIZ.getSupportFragmentManager()) != null)) {
                    supportFragmentManager2.LLIILZL(abstractC813200VvC);
                }
            } else {
                C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
                if (c19egLIZ2 != null && (supportFragmentManager = c19egLIZ2.getSupportFragmentManager()) != null) {
                    supportFragmentManager.LLIILZL(abstractC813200VvC);
                }
            }
        }
        this.registeredFragmentManager = null;
        this.fragmentLifecycleCallback = null;
    }

    @Override // X.AbstractC738140SxQ
    public void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.InterfaceC725030ScH
    public LifecycleOwner getOwnLifecycleOwner() {
        getActualLifecycleOwner();
        return this;
    }

    private final boolean handleConflict(C1622406Ww c1622406Ww) {
        C1622406Ww c1622406Ww2 = this.currentExecutableBlock;
        C1622406Ww c1622406WwPeek = this.queue.peek();
        if (c1622406Ww2 != null) {
            if (c1622406WwPeek == null || c1622406Ww2.LIZLLL.getLevel() >= c1622406WwPeek.LIZLLL.getLevel()) {
                c1622406WwPeek = c1622406Ww2;
            }
        } else if (c1622406WwPeek == null) {
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleConflict: comparing new=");
        sbLIZ.append(c1622406Ww.LIZLLL);
        sbLIZ.append(" with existing=");
        sbLIZ.append(c1622406WwPeek.LIZLLL);
        C2188811AlT.LIZIZ(sbLIZ);
        AbstractC1751306tT abstractC1751306tT = c1622406Ww.LJI;
        if (!Intrinsics.LJFF(abstractC1751306tT, new AbstractC1751306tT() { // from class: X.06tV
        })) {
            C1751706tX c1751706tX = new AbstractC1751306tT() { // from class: X.06tX
            };
            if (!Intrinsics.LJFF(abstractC1751306tT, c1751706tX) && !Intrinsics.LJFF(abstractC1751306tT, new AbstractC1751306tT() { // from class: X.06tY
            })) {
                if (Intrinsics.LJFF(abstractC1751306tT, C1751606tW.LIZ)) {
                    return true;
                }
                throw new C1954807lC();
            }
            if (c1622406Ww.LIZLLL.getLevel() > c1622406WwPeek.LIZLLL.getLevel()) {
                if (c1622406Ww2 == null) {
                    return true;
                }
                interruptCurrent();
                return true;
            }
            if (!Intrinsics.LJFF(c1622406Ww.LJI, c1751706tX)) {
                return true;
            }
        }
        return false;
    }

    private final boolean hasDuplicateType(C06XH c06xh) {
        C06XH c06xh2;
        C1622406Ww c1622406Ww = this.currentExecutableBlock;
        if (c1622406Ww != null) {
            c06xh2 = c1622406Ww.LIZLLL;
        } else {
            c06xh2 = null;
        }
        if (c06xh2 == c06xh) {
            return true;
        }
        PriorityQueue<C1622406Ww> priorityQueue = this.queue;
        if (!(priorityQueue instanceof Collection) || !priorityQueue.isEmpty()) {
            Iterator<C1622406Ww> it2 = priorityQueue.iterator();
            while (it2.hasNext()) {
                if (it2.next().LIZLLL == c06xh) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.animation.IAnimationQueueManager
    public void onPopupOrSheetDismissed(boolean z) {
        if (z) {
            this.quickChatAndExpandToFullScreen = true;
        }
        if (!this.queue.isEmpty()) {
            this.signalChannel.LJIIIIZZ(Unit.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0069 -> B:34:0x0072). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processQueue(X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1393705ct
            if (r0 == 0) goto L20
            r3 = r6
            X.05ct r3 = (X.C1393705ct) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r1 = r3.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2a
            goto L26
        L20:
            X.05ct r3 = new X.05ct
            r3.<init>(r5, r6)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r1)     // Catch: java.util.concurrent.CancellationException -> L6e
            goto L72
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
        L35:
            java.util.PriorityQueue<X.06Ww> r0 = r5.queue
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L77
            kotlin.coroutines.CoroutineContext r0 = r3.getContext()
            boolean r0 = X.C23118094a.LJIIIIZZ(r0)
            if (r0 == 0) goto L77
            boolean r0 = r5.anyPopupOrSheetShowing()
            if (r0 == 0) goto L52
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L52:
            java.util.PriorityQueue<X.06Ww> r0 = r5.queue
            java.lang.Object r1 = r0.poll()
            X.06Ww r1 = (X.C1622406Ww) r1
            if (r1 == 0) goto L77
            r5.currentExecutableBlock = r1
            X.06Ww r0 = r5.currentExecutableBlock
            java.util.Objects.toString(r0)
            r3.LLILLL = r2     // Catch: java.util.concurrent.CancellationException -> L6c
            java.lang.Object r0 = r5.runAnimation(r1, r3)     // Catch: java.util.concurrent.CancellationException -> L6c
            if (r0 != r4) goto L72
            goto L76
        L6c:
            r0 = move-exception
            goto L6f
        L6e:
            r0 = move-exception
        L6f:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L72:
            r0 = 0
            r5.currentExecutableBlock = r0
            goto L35
        L76:
            return r4
        L77:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.feature.animation.AnimationQueueManagerAssem.processQueue(X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.animation.IAnimationQueueManager
    public void setLongPressPopupShowing(boolean z) {
        this.longPressPopupShowing = z;
    }

    public final Object runAnimation(C1622406Ww c1622406Ww, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return C2296808zG.LJ(new C1393805cu(System.identityHashCode(c1622406Ww), c1622406Ww, this, null, new C013C()), interfaceC1364105Vn);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return (R) C736680Sv4.LJIJJ(vm1, function1);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o> void withStateSafe(VM1 vm1, Function1<? super S1, Unit> function1) {
        C736680Sv4.LJIJJLI(vm1, function1);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o, VM2 extends AssemViewModel<S2>, S2 extends InterfaceC0148002o, R> R withState(VM1 vm1, VM2 vm2, Function2<? super S1, ? super S2, ? extends R> function2) {
        return (R) C736680Sv4.LJIJI(vm1, vm2, function2);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o, VM2 extends AssemViewModel<S2>, S2 extends InterfaceC0148002o, VM3 extends AssemViewModel<S3>, S3 extends InterfaceC0148002o, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC1631620sYq<? super S1, ? super S2, ? super S3, ? extends R> interfaceC1631620sYq) {
        return (R) C736680Sv4.LJIJ(vm1, vm2, vm3, interfaceC1631620sYq);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    public <S extends InterfaceC0148002o, T> C0ZP4 asyncSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1623806Xk<? extends T>> interfaceC2217241BqE, C1770850wBP<C11H9<AbstractC1623806Xk<T>>> c1770850wBP, Function2<? super C03H5, ? super Throwable, Unit> function2, Function1<? super C03H5, Unit> function1, Function2<? super C03H5, ? super T, Unit> function22) {
        return C736680Sv4.LIZ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function2, function1, function22);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    public <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, Function1<? super Throwable, Unit> function1, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LJIILIIL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.animation.IAnimationQueueManager
    public void enqueue(Function1<? super Function1<? super Boolean, Unit>, Unit> function1, Function0<Unit> function0, C06XH c06xh, Function1<? super Boolean, Unit> function12, boolean z, boolean z2, long j, AbstractC1751306tT abstractC1751306tT) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ.LLIILII(), null, new C1622506Wx(this, function1, function0, c06xh, function12, z, z2, j, abstractC1751306tT, null), 2);
    }

    public final void enqueueInternal(Function1<? super Function1<? super Boolean, Unit>, Unit> function1, Function0<Unit> function0, C06XH c06xh, Function1<? super Boolean, Unit> function12, boolean z, boolean z2, long j, AbstractC1751306tT abstractC1751306tT) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enqueue: type=");
        sbLIZ.append(c06xh);
        sbLIZ.append(", level=");
        sbLIZ.append(c06xh.getLevel());
        sbLIZ.append(", ignoreDuplicateTypes=");
        sbLIZ.append(z);
        sbLIZ.append(", disableAutoCompletion=");
        sbLIZ.append(z2);
        sbLIZ.append(", completionTimeoutMs=");
        sbLIZ.append(j);
        sbLIZ.append(", conflictOption=");
        sbLIZ.append(abstractC1751306tT);
        C2188811AlT.LIZIZ(sbLIZ);
        if (z && hasDuplicateType(c06xh)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("enqueue: ignoreDuplicateTypes=true, duplicate type=");
            sbLIZ2.append(c06xh);
            sbLIZ2.append(" found, skip");
            C2188811AlT.LIZIZ(sbLIZ2);
            if (function12 != null) {
                function12.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        C1622406Ww c1622406Ww = new C1622406Ww(new C1622006Ws(function1), new C1622006Ws(function0), c06xh, z2, j, abstractC1751306tT, new C1622006Ws(function12), z);
        if (!handleConflict(c1622406Ww)) {
            if (function12 != null) {
                function12.invoke(Boolean.FALSE);
            }
        } else {
            this.queue.add(c1622406Ww);
            this.signalChannel.LJIIIIZZ(Unit.LIZ);
        }
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
