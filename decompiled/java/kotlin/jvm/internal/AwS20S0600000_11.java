package kotlin.jvm.internal;

import X.AbstractC1623806Xk;
import X.AbstractC738140SxQ;
import X.AnonymousClass0956;
import X.C013C;
import X.C03H5;
import X.C09AE;
import X.C09AY;
import X.C0RUB;
import X.C0RUC;
import X.C11H9;
import X.C1770850wBP;
import X.C2188811AlT;
import X.C736800SvG;
import X.C786410Ut5;
import X.InterfaceC1685420txc;
import X.InterfaceC2217241BqE;
import android.os.Looper;
import android.os.MessageQueue;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AwS20S0600000_11 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS20S0600000_11 awS20S0600000_11) {
        return ((AssemViewModel) awS20S0600000_11.l0).vmDispatcher.LJJJJI(null, (InterfaceC2217241BqE) awS20S0600000_11.l1, (C1770850wBP) awS20S0600000_11.l2, new C736800SvG(), AFwS198S0000000_11.get$arr$(29), (Function1) awS20S0600000_11.l3, (Function0) awS20S0600000_11.l4, (Function1) awS20S0600000_11.l5);
    }

    public static final Object invoke$1(AwS20S0600000_11 awS20S0600000_11) {
        ((InterfaceC1685420txc) awS20S0600000_11.l0).invoke((C03H5) awS20S0600000_11.l1, awS20S0600000_11.l2, awS20S0600000_11.l3, awS20S0600000_11.l4, awS20S0600000_11.l5);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS20S0600000_11 awS20S0600000_11) {
        C013C c013c = (C013C) awS20S0600000_11.l0;
        if (!c013c.element) {
            c013c.element = true;
            C09AE c09ae = (C09AE) awS20S0600000_11.l1;
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("real assem: tag ");
            sbLIZ.append(((C0RUB) awS20S0600000_11.l2).LIZLLL);
            sbLIZ.append(", priority ");
            sbLIZ.append(((C0RUB) awS20S0600000_11.l2).LIZJ);
            sbLIZ.append(", lazyMode ");
            sbLIZ.append(((C0RUB) awS20S0600000_11.l2).LIZ);
            C0RUC.LJII(C2188811AlT.LIZIZ(sbLIZ));
            C0RUB c0rub = (C0RUB) awS20S0600000_11.l2;
            if (c0rub.LJFF) {
                MessageQueue messageQueueMyQueue = Looper.myQueue();
                final C0RUB c0rub2 = (C0RUB) awS20S0600000_11.l2;
                final WeakReference weakReference = (WeakReference) awS20S0600000_11.l3;
                final AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) awS20S0600000_11.l4;
                final Function0 function0 = (Function0) awS20S0600000_11.l5;
                C786410Ut5.f3(new MessageQueue.IdleHandler() { // from class: X.0RUA
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        C0RUC.LJIIIZ(c0rub2.LIZLLL, weakReference, abstractC738140SxQ, function0);
                        return false;
                    }
                }, messageQueueMyQueue);
            } else {
                C0RUC.LJIIIZ(c0rub.LIZLLL, (WeakReference) awS20S0600000_11.l3, (AbstractC738140SxQ) awS20S0600000_11.l4, (Function0) awS20S0600000_11.l5);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S0600000_11(C013C c013c, AnonymousClass0956 anonymousClass0956, C0RUB c0rub, WeakReference weakReference, AbstractC738140SxQ abstractC738140SxQ, Function0 function0, int i) {
        super(0);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = anonymousClass0956;
        this.l2 = c0rub;
        this.l3 = weakReference;
        this.l4 = abstractC738140SxQ;
        this.l5 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS20S0600000_11(InterfaceC1685420txc interfaceC1685420txc, InterfaceC1685420txc<C03H5, Object, Object, Object, Object, Unit> interfaceC1685420txc2, C03H5 c03h5, Object obj, Object obj2, Object obj3, Object obj4) {
        super(0);
        this.$t = obj4;
        this.l0 = interfaceC1685420txc;
        this.l1 = interfaceC1685420txc2;
        this.l2 = c03h5;
        this.l3 = obj;
        this.l4 = obj2;
        this.l5 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS20S0600000_11(AssemViewModel assemViewModel, AssemViewModel<S> assemViewModel2, InterfaceC2217241BqE<S, ? extends AbstractC1623806Xk<? extends T>> interfaceC2217241BqE, C1770850wBP<C11H9<AbstractC1623806Xk<T>>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Function1<? super T, Unit> function12) {
        super(0);
        this.$t = function12;
        this.l0 = assemViewModel;
        this.l1 = assemViewModel2;
        this.l2 = interfaceC2217241BqE;
        this.l3 = c1770850wBP;
        this.l4 = function1;
        this.l5 = function0;
    }
}
