package com.ss.android.ugc.aweme.ecommerce.base.osp.module.core;

import X.AbstractC756202xM;
import X.C01GW;
import X.C03H5;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19EG;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C724240Sb0;
import X.C736680Sv4;
import X.C814420VxA;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC665370Q7z;
import X.InterfaceC719640SKs;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ECPowerCell<ITEM extends InterfaceC1891350zJl> extends PowerCell<ITEM> implements InterfaceC719640SKs, InterfaceC724530SbT {
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(35));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS545S0100000_1((ECPowerCell) this, 245));
    public long LLILZLL;
    public long LLIZ;
    public long LLIZLLLIL;

    public void I5() {
    }

    @Override // X.InterfaceC719640SKs
    public final Context Mk2() {
        return null;
    }

    @Override // X.InterfaceC719640SKs
    public final boolean PO1() {
        return false;
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

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return null;
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC719640SKs
    public final LifecycleOwner E82() {
        return getParent();
    }

    @Override // X.InterfaceC719640SKs
    public final C19EG getActivity() {
        C19EG c19egLIZ;
        LifecycleOwner parent = getParent();
        if (parent == null || (c19egLIZ = C724240Sb0.LIZ(parent)) == null) {
            return null;
        }
        return c19egLIZ;
    }

    public final Fragment getFragment() {
        Fragment fragmentLJI;
        LifecycleOwner parent = getParent();
        if (parent == null || (fragmentLJI = C724240Sb0.LJI(parent)) == null) {
            return null;
        }
        return fragmentLJI;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public void onCreate() {
        super.onCreate();
        this.LLIZ = System.currentTimeMillis();
        I5();
    }

    @Override // X.InterfaceC719640SKs
    public final View LJJIJL() {
        return this.itemView;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onBindItemView(ITEM item) {
        Integer numValueOf;
        Integer num;
        super.onBindItemView(item);
        if (item instanceof AbstractC756202xM) {
            AbstractC756202xM abstractC756202xM = (AbstractC756202xM) item;
            Integer numValueOf2 = Integer.valueOf(abstractC756202xM.LLILZ);
            Integer num2 = null;
            if (numValueOf2 != null) {
                if (numValueOf2.intValue() == 1) {
                    numValueOf = Integer.valueOf(R.drawable.b6i);
                } else if (numValueOf2.intValue() == 2) {
                    numValueOf = Integer.valueOf(R.drawable.b6h);
                } else if (numValueOf2.intValue() == 3) {
                    numValueOf = Integer.valueOf(R.drawable.b6f);
                } else if (numValueOf2.intValue() != 4) {
                    return;
                } else {
                    numValueOf = Integer.valueOf(R.drawable.b6g);
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    Object tag = this.itemView.getTag(R.id.gfe);
                    if (tag instanceof Integer) {
                        num = (Integer) tag;
                    } else {
                        num = null;
                    }
                    int i = abstractC756202xM.LLILZIL;
                    Object tag2 = this.itemView.getTag(R.id.gff);
                    if (tag2 instanceof Integer) {
                        num2 = (Integer) tag2;
                    }
                    if (num == null || iIntValue != num.intValue()) {
                        this.itemView.setBackgroundResource(iIntValue);
                        this.itemView.setTag(R.id.gfe, Integer.valueOf(iIntValue));
                    }
                    if (num2 == null || i != num2.intValue()) {
                        if (i != 1) {
                            if (i != 2) {
                                C426750GoL.LJIIIZ(this.itemView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, false, 16);
                            } else {
                                C426750GoL.LJIIIZ(this.itemView, 0, 0, 0, 0, false, 16);
                            }
                        } else {
                            C426750GoL.LJIIIZ(this.itemView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, false, 16);
                        }
                        this.itemView.setTag(R.id.gff, Integer.valueOf(i));
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public View onCreateItemView(ViewGroup viewGroup, int i) {
        this.LLILZLL = System.currentTimeMillis();
        return super.onCreateItemView(viewGroup, i);
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
