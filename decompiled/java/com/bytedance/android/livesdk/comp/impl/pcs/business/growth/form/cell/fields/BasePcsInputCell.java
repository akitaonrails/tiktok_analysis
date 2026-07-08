package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields;

import X.AbstractC1727320v3C;
import X.AbstractC21673619ry;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C13LZ;
import X.C1533950q1J;
import X.C1726980v2e;
import X.C1726990v2f;
import X.C1727000v2g;
import X.C1727010v2h;
import X.C1727020v2i;
import X.C1727030v2j;
import X.C1727040v2k;
import X.C1727050v2l;
import X.C1727060v2m;
import X.C1727070v2n;
import X.C1727080v2o;
import X.C1727090v2p;
import X.C1727100v2q;
import X.C1727110v2r;
import X.C1727120v2s;
import X.C1727130v2t;
import X.C1727140v2u;
import X.C1727150v2v;
import X.C1727160v2w;
import X.C1727170v2x;
import X.C1727180v2y;
import X.C1727200v30;
import X.C1727210v31;
import X.C1727220v32;
import X.C1727230v33;
import X.C1727240v34;
import X.C1727250v35;
import X.C1727260v36;
import X.C1727270v37;
import X.C1727280v38;
import X.C1727290v39;
import X.C1727300v3A;
import X.C1727310v3B;
import X.C1727340v3E;
import X.C1727350v3F;
import X.C1727360v3G;
import X.C1727990v4H;
import X.C1749190vcT;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C426750GoL;
import X.C439101nJ;
import X.C452080Ho6;
import X.C452501pT;
import X.C531650Kt9;
import X.C736680Sv4;
import X.C737910Sx3;
import X.EnumC1734750vFB;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.vm.PcsFormVm;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public abstract class BasePcsInputCell<T extends AbstractC1727320v3C> extends PowerCell<T> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final AssemVMLazy LL;
    public C1749190vcT LLILLJJLI;
    public C1727990v4H LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BasePcsInputCell.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/form/vm/PcsFormVm;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public abstract void U5();

    public abstract void V5();

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

    public void I5() {
        final EditText editTextL5 = L5(this.itemView);
        if (editTextL5 == null) {
            return;
        }
        editTextL5.requestFocus();
        HandlerHook.viewPost(editTextL5, new Runnable() { // from class: X.0v2d
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                InputMethodManager inputMethodManager;
                C1C7U.LIZ("BasePcsInputCell@8bba.activateField$1");
                try {
                    Object objH2 = C786410Ut5.H2(editTextL5.getContext(), "input_method");
                    if ((objH2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objH2) != null) {
                        inputMethodManager.showSoftInput(editTextL5, 1);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("BasePcsInputCell@8bba.activateField$1");
            }
        });
    }

    public final void N5() {
        RecyclerView recyclerView;
        List<AbstractC1727320v3C> listYQ2;
        ViewParent parent = this.itemView.getParent();
        if (!(parent instanceof RecyclerView) || (recyclerView = (RecyclerView) parent) == null || (bindingAdapterPosition = getBindingAdapterPosition()) == -1 || (listYQ2 = P5().yQ2()) == null) {
            return;
        }
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        int iMin = Math.min(adapter != null ? adapter.getItemCount() : 0, listYQ2.size());
        while (true) {
            int bindingAdapterPosition = bindingAdapterPosition + 1;
            if (bindingAdapterPosition >= iMin) {
                C1727140v2u.LIZ(this.itemView);
                return;
            }
            Object obj = ListProtector.get(listYQ2, bindingAdapterPosition);
            if ((obj instanceof C1727360v3G) || (obj instanceof C1727340v3E) || (obj instanceof C1727350v3F)) {
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(bindingAdapterPosition);
                if (viewHolderFindViewHolderForAdapterPosition instanceof BasePcsInputCell) {
                    ((BasePcsInputCell) viewHolderFindViewHolderForAdapterPosition).I5();
                    return;
                }
            }
        }
    }

    public final PcsFormVm P5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        return (PcsFormVm) assemVMLazy.getValue();
    }

    public BasePcsInputCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsFormVm.class);
        C1727010v2h c1727010v2h = new C1727010v2h(c19719912DlLIZ);
        C1727310v3B c1727310v3B = new C1727310v3B();
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new C1727270v37(c19719912DlLIZ), c1727010v2h, new C1727240v34(), new C1727100v2q(this), new C1727020v2i(this), new C1727220v32(this), c1727310v3B, new C1726990v2f(this), null, new C1727030v2j(this));
        } else if (obj instanceof InterfaceC451590HnJ) {
            C1727080v2o c1727080v2o = new C1727080v2o(this);
            C1727210v31 c1727210v31 = new C1727210v31(this);
            C1727280v38 c1727280v38 = new C1727280v38(c19719912DlLIZ);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1727200v30((InterfaceC451590HnJ) obj, c1727080v2o));
            C1727120v2s c1727120v2s = new C1727120v2s(c01gwLIZIZ);
            C1727150v2v c1727150v2v = new C1727150v2v(c01gwLIZIZ);
            C1727160v2w c1727160v2w = new C1727160v2w(c01gwLIZIZ);
            C1727170v2x c1727170v2x = new C1727170v2x(c01gwLIZIZ);
            C1727180v2y c1727180v2y = new C1727180v2y(c01gwLIZIZ);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(c1727280v38, c1727010v2h, new C452080Ho6(), c1727120v2s, c1727150v2v, c1727210v31, c1727310v3B, c1727160v2w, c1727170v2x, c1727180v2y);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new C1727290v39(c19719912DlLIZ), c1727010v2h, new C1727250v35(), new C1727110v2r(this), new C1727070v2n(this), new C1727230v33(this), c1727310v3B, new C1726980v2e(this), null, new C1727040v2k(this));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new C1727300v3A(c19719912DlLIZ), c1727010v2h, new C1727260v36(), new C1727090v2p(this), new C1727050v2l(this), new C1727060v2m(this), c1727310v3B, null, null, new C1727000v2g(this));
        }
        this.LL = assemVMLazy;
    }

    public final int R5() {
        int bindingAdapterPosition;
        List<AbstractC1727320v3C> listYQ2 = P5().yQ2();
        if (listYQ2 == null || (bindingAdapterPosition = getBindingAdapterPosition()) < 0 || bindingAdapterPosition >= listYQ2.size()) {
            return 6;
        }
        Iterable iterableLJIILJJIL = C13LZ.LJIILJJIL(bindingAdapterPosition + 1, listYQ2.size());
        if ((iterableLJIILJJIL instanceof Collection) && ((Collection) iterableLJIILJJIL).isEmpty()) {
            return 6;
        }
        C531650Kt9 it2 = iterableLJIILJJIL.iterator();
        while (it2.LLILLL) {
            Object obj = ListProtector.get(listYQ2, it2.nextInt());
            if ((obj instanceof C1727360v3G) || (obj instanceof C1727340v3E) || (obj instanceof C1727350v3F)) {
                return 5;
            }
        }
        return 6;
    }

    public final void W5() {
        C1727990v4H c1727990v4H;
        String str;
        if (!P5().getState().LLILZ || (c1727990v4H = this.LLILLL) == null || (str = c1727990v4H.LIZ) == null) {
            return;
        }
        String str2 = (String) ((LinkedHashMap) P5().LLILZIL).get(str);
        C1749190vcT c1749190vcT = this.LLILLJJLI;
        if (c1749190vcT != null) {
            c1749190vcT.LIZJ(str2);
            c1749190vcT.LJFF(C1533950q1J.LJ(str2));
        }
        if (str2 == null || str2.length() == 0 || !P5().getState().LLILZ) {
            V5();
        } else {
            U5();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public void onDestroy() {
        super.onDestroy();
        this.LLILLL = null;
        this.LLILLJJLI = null;
    }

    public static EditText L5(View view) {
        if (view instanceof EditText) {
            EditText editText = (EditText) view;
            if (editText.isFocusable() && editText.isFocusableInTouchMode()) {
                return editText;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                EditText editTextL5 = L5(viewGroup.getChildAt(i));
                if (editTextL5 != null) {
                    return editTextL5;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: S5, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(T t) {
        super.onBindItemView(t);
        this.LLILLL = t.LIZ();
    }

    public final void T5(String str) {
        int iLJJIZ;
        PcsFormVm pcsFormVmP5 = P5();
        C1727990v4H c1727990v4H = this.LLILLL;
        if (c1727990v4H != null && (c1727990v4H.LIZLLL != EnumC1734750vFB.PHONE || (iLJJIZ = a0.LJJIZ(str, '/', 0, false, 6)) == -1 || (iLJJIZ != 0 && iLJJIZ != str.length() - 1))) {
            Object obj = ((LinkedHashMap) pcsFormVmP5.LLILZ).get(c1727990v4H.LIZ);
            pcsFormVmP5.LLILZ.put(c1727990v4H.LIZ, str);
            if (obj != null && !Intrinsics.LJFF(obj, str)) {
                pcsFormVmP5.LLIZ.add(c1727990v4H.LIZ);
            }
            pcsFormVmP5.CQ2(c1727990v4H);
        }
        W5();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public View onCreateItemView(ViewGroup viewGroup) {
        C1749190vcT c1749190vcT = new C1749190vcT(viewGroup.getContext(), null, 6);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1749190vcT);
        c1749190vcT.setLayoutParams(layoutParams);
        C426750GoL.LJIIL(c1749190vcT, 0, 0, 0, 0, 16);
        View childAt = c1749190vcT.getChildAt(0);
        if (childAt != null) {
            childAt.setPaddingRelative(C439101nJ.LIZ(16), 0, C439101nJ.LIZ(16), 0);
        }
        this.LLILLJJLI = c1749190vcT;
        C736680Sv4.LJIIIIZZ(this, P5(), new C2217381BqS() { // from class: X.0v2z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1734460vEi) obj).LLILZ);
            }
        }, null, new C1727130v2t(this), 6);
        return c1749190vcT;
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
