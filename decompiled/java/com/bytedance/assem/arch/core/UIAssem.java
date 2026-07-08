package com.bytedance.assem.arch.core;

import X.AbstractC1155604fa;
import X.AbstractC1623806Xk;
import X.AbstractC738140SxQ;
import X.C03H5;
import X.C03H8;
import X.C0I2W;
import X.C0RTF;
import X.C0RTG;
import X.C0RTK;
import X.C0RUT;
import X.C0RUV;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C723850SaN;
import X.C725080ScM;
import X.C726000Sdq;
import X.C726010Sdr;
import X.C736680Sv4;
import X.EnumC738160SxS;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC723960SaY;
import X.InterfaceC724700Sbk;
import X.InterfaceC725030ScH;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes12.dex */
public abstract class UIAssem extends AbstractC738140SxQ implements InterfaceC725030ScH<UIAssem>, InterfaceC725050ScJ<UIAssem>, C03H5, InterfaceC736810SvH, C03H8, C0RTK {
    public final /* synthetic */ C0RTF LL = new C0RTF();
    public final CopyOnWriteArrayList<InterfaceC723960SaY> LLILLJJLI = new CopyOnWriteArrayList<>();
    public View LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;

    @Override // X.C0RTK
    public void Zf(Map<AbstractC1155604fa<?>, ? extends C0RTG<?>> map) {
        this.LL.Zf(map);
    }

    @Override // X.InterfaceC736810SvH
    public LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public InterfaceC725050ScJ<UIAssem> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    public UIAssem ho() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    /* JADX INFO: renamed from: lo, reason: merged with bridge method [inline-methods] */
    public UIAssem getReceiverForHostVM() {
        return null;
    }

    public void vo(View view) {
    }

    public abstract void xo();

    private final void mo() {
        if (this.LLILZIL) {
            return;
        }
        this.LLILZIL = true;
        track$assem_release(EnumC738160SxS.ON_CREATE_VIEW, new C726000Sdq(this));
    }

    @Override // X.C03H8
    public View LJJIJL() {
        View view = this.LLILLL;
        if (view != null) {
            return view;
        }
        return null;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public void mo127do() {
        C723850SaN.LIZLLL(this, new AwS585S0100000_6(this, 32));
    }

    @Override // X.C0RTK
    public Map<AbstractC1155604fa<?>, C0RTG<?>> ff() {
        return this.LL.LL;
    }

    public final boolean so() {
        return this.LLILLL != null;
    }

    @Override // X.AbstractC738140SxQ
    public final void handleOnParentViewCreated$assem_release() {
        onParentViewCreated();
        mo();
    }

    @Override // X.AbstractC738140SxQ
    /* JADX INFO: renamed from: ko, reason: merged with bridge method [inline-methods] */
    public C0RUT<? extends UIAssem> getConfig() {
        return (C0RUT) super.getConfig();
    }

    @Override // X.AbstractC738140SxQ
    public void onCreate() {
        super.onCreate();
        if (getSupervisor().LLJJIII != null) {
            mo();
        }
        this.LLILZ = true;
    }

    @Override // X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        this.LLILZ = false;
    }

    @Override // X.InterfaceC725050ScJ
    public /* bridge */ /* synthetic */ C03H5 getActualReceiver() {
        ho();
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public LifecycleOwner getOwnLifecycleOwner() {
        getActualLifecycleOwner();
        return this;
    }

    @Override // X.AbstractC738140SxQ
    public boolean isAssemViewCreated$assem_release() {
        return this.LLILZLL;
    }

    public final boolean isViewValid() {
        return this.LLILZ;
    }

    public final boolean uo() {
        return this.LLILZIL;
    }

    public void Ao(View view) {
        this.LLILLL = view;
    }

    public final void Bo(boolean z) {
        this.LLILZIL = z;
    }

    public final void bo(InterfaceC723960SaY interfaceC723960SaY) {
        this.LLILLJJLI.addIfAbsent(interfaceC723960SaY);
    }

    @Override // X.AbstractC738140SxQ
    public void didUpdateConfig(C0RUV<? extends AbstractC738140SxQ> c0ruv) {
        C723850SaN.LIZLLL(this, new C0I2W(this, c0ruv));
    }

    public void onViewCreated(View view) {
        mo127do();
    }

    public final void oo(View view) {
        InterfaceC724700Sbk interfaceC724700Sbk = C725080ScM.LIZJ;
        if (interfaceC724700Sbk != null) {
            interfaceC724700Sbk.LIZ();
        }
        track$assem_release(EnumC738160SxS.ON_VIEW_CREATED, new C726010Sdr(this, view));
        InterfaceC724700Sbk interfaceC724700Sbk2 = C725080ScM.LIZJ;
        if (interfaceC724700Sbk2 != null) {
            interfaceC724700Sbk2.end(getClass().getSimpleName(), "assem_onviewcreated_");
        }
    }

    @Override // X.AbstractC738140SxQ
    public void setAssemViewCreated$assem_release(boolean z) {
        this.LLILZLL = z;
    }

    @Override // X.AbstractC738140SxQ
    public void setConfig(C0RUV<? extends AbstractC738140SxQ> c0ruv) {
        super.setConfig(c0ruv);
    }

    public final void wo(View view) {
        Iterator<InterfaceC723960SaY> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(view);
        }
    }

    public final void zo(InterfaceC723960SaY interfaceC723960SaY) {
        this.LLILLJJLI.remove(interfaceC723960SaY);
    }

    public void fo(C0RTK c0rtk, C0RTK c0rtk2) {
        this.LL.getClass();
        if (!c0rtk2.ff().isEmpty()) {
            c0rtk.Zf(c0rtk2.ff());
        }
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return (R) C736680Sv4.LJIJJ(vm1, function1);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o> void withStateSafe(VM1 vm1, Function1<? super S1, Unit> function1) {
        C736680Sv4.LJIJJLI(vm1, function1);
    }

    public void yo(AbstractC1155604fa<?> abstractC1155604fa, C0RTG<?> c0rtg) {
        this.LL.LL.put(abstractC1155604fa, c0rtg);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o, VM2 extends AssemViewModel<S2>, S2 extends InterfaceC0148002o, R> R withState(VM1 vm1, VM2 vm2, Function2<? super S1, ? super S2, ? extends R> function2) {
        return (R) C736680Sv4.LJIJI(vm1, vm2, function2);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super UIAssem, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o, VM2 extends AssemViewModel<S2>, S2 extends InterfaceC0148002o, VM3 extends AssemViewModel<S3>, S3 extends InterfaceC0148002o, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC1631620sYq<? super S1, ? super S2, ? super S3, ? extends R> interfaceC1631620sYq) {
        return (R) C736680Sv4.LJIJ(vm1, vm2, vm3, interfaceC1631620sYq);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super UIAssem, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super UIAssem, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    public <S extends InterfaceC0148002o, T> C0ZP4 asyncSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1623806Xk<? extends T>> interfaceC2217241BqE, C1770850wBP<C11H9<AbstractC1623806Xk<T>>> c1770850wBP, Function2<? super UIAssem, ? super Throwable, Unit> function2, Function1<? super UIAssem, Unit> function1, Function2<? super UIAssem, ? super T, Unit> function22) {
        return C736680Sv4.LIZ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function2, function1, function22);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super UIAssem, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    public <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, Function1<? super Throwable, Unit> function1, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, InterfaceC1631620sYq<? super UIAssem, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LJIILIIL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super UIAssem, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super UIAssem, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super UIAssem, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
