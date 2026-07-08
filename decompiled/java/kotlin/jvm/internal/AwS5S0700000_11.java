package kotlin.jvm.internal;

import X.AbstractC1623806Xk;
import X.C03H5;
import X.C09AY;
import X.C11H9;
import X.C1770850wBP;
import X.C736800SvG;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AwS5S0700000_11 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS5S0700000_11 awS5S0700000_11) {
        return ((AssemViewModel) awS5S0700000_11.l0).vmDispatcher.LJJJJI((LifecycleOwner) awS5S0700000_11.l1, (InterfaceC2217241BqE) awS5S0700000_11.l2, (C1770850wBP) awS5S0700000_11.l3, new C736800SvG(), AFwS198S0000000_11.get$arr$(31), (Function1) awS5S0700000_11.l4, (Function0) awS5S0700000_11.l5, (Function1) awS5S0700000_11.l6);
    }

    public static final Object invoke$1(AwS5S0700000_11 awS5S0700000_11) {
        ((InterfaceC1685430txd) awS5S0700000_11.l0).invoke((C03H5) awS5S0700000_11.l1, awS5S0700000_11.l2, awS5S0700000_11.l3, awS5S0700000_11.l4, awS5S0700000_11.l5, awS5S0700000_11.l6);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS5S0700000_11(InterfaceC1685430txd interfaceC1685430txd, InterfaceC1685430txd<C03H5, Object, Object, Object, Object, Object, Unit> interfaceC1685430txd2, C03H5 c03h5, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(0);
        this.$t = obj5;
        this.l0 = interfaceC1685430txd;
        this.l1 = interfaceC1685430txd2;
        this.l2 = c03h5;
        this.l3 = obj;
        this.l4 = obj2;
        this.l5 = obj3;
        this.l6 = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS5S0700000_11(AssemViewModel assemViewModel, AssemViewModel<S> assemViewModel2, LifecycleOwner lifecycleOwner, InterfaceC2217241BqE<S, ? extends AbstractC1623806Xk<? extends T>> interfaceC2217241BqE, C1770850wBP<C11H9<AbstractC1623806Xk<T>>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Function1<? super T, Unit> function12) {
        super(0);
        this.$t = function12;
        this.l0 = assemViewModel;
        this.l1 = assemViewModel2;
        this.l2 = lifecycleOwner;
        this.l3 = interfaceC2217241BqE;
        this.l4 = c1770850wBP;
        this.l5 = function1;
        this.l6 = function0;
    }
}
