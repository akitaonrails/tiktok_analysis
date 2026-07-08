package kotlin.jvm.internal;

import X.AbstractC1110800f0o;
import X.AbstractC1136060ffY;
import X.C09AY;
import X.C1109770ez9;
import X.C1111050f1D;
import X.C1147950fyj;
import X.C11JF;
import X.C1909107dp;
import X.InterfaceC1147980fym;
import X.InterfaceC420801kM;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes18.dex */
public class AwS172S0400000_17 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS172S0400000_17 awS172S0400000_17, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        if (((AtomicBoolean) awS172S0400000_17.l0).compareAndSet(false, true)) {
            if (!((InterfaceC420801kM) awS172S0400000_17.l1).isDisposed()) {
                ((InterfaceC420801kM) awS172S0400000_17.l1).dispose();
            }
            ((C1147950fyj) awS172S0400000_17.l2).getClass();
            ((CompletionBlock) awS172S0400000_17.l3).onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1147980fym.class, null), "");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS172S0400000_17 awS172S0400000_17, Object obj, Object obj2) {
        ((C1111050f1D) awS172S0400000_17.l0).T5((String) obj, ((AbstractC1110800f0o) awS172S0400000_17.l1).LJIIIIZZ.getFirst(), (C1109770ez9) awS172S0400000_17.l2, (AbstractC1110800f0o) awS172S0400000_17.l1, (List) awS172S0400000_17.l3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS172S0400000_17(C1111050f1D c1111050f1D, C1111050f1D<AbstractC1110800f0o<? extends AbstractC1136060ffY>> c1111050f1D2, AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o, C1109770ez9 c1109770ez9, List<Object> list) {
        super(2);
        this.$t = list;
        this.l0 = c1111050f1D;
        this.l1 = c1111050f1D2;
        this.l2 = abstractC1110800f0o;
        this.l3 = c1109770ez9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS172S0400000_17(AtomicBoolean atomicBoolean, C11JF c11jf, C1147950fyj c1147950fyj, CompletionBlock completionBlock, int i) {
        super(2);
        this.$t = i;
        this.l0 = atomicBoolean;
        this.l1 = c11jf;
        this.l2 = c1147950fyj;
        this.l3 = completionBlock;
    }
}
