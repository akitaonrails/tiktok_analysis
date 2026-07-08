package kotlin.jvm.internal;

import X.AbstractC1252750ihl;
import X.C004I;
import X.C09AY;
import X.C11E5;
import X.C786410Ut5;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes30.dex */
public class AwS46S0310000_29 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public boolean z3 = false;
    public Object l0 = null;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS46S0310000_29 awS46S0310000_29, Object obj) {
        AbstractC1252750ihl abstractC1252750ihl = (AbstractC1252750ihl) obj;
        if (awS46S0310000_29.z3 && ((Thread) awS46S0310000_29.l0) == C786410Ut5.u3()) {
            "you need schedule upstream to another thread, you can call subscribeOn(IO)".toString();
            throw new IllegalStateException("you need schedule upstream to another thread, you can call subscribeOn(IO)");
        }
        ((JediViewModel) awS46S0310000_29.l1).setState(new AwS395S0200000_29((Function2) awS46S0310000_29.l2, abstractC1252750ihl, 6));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS46S0310000_29 awS46S0310000_29, Object obj) {
        AbstractC1252750ihl abstractC1252750ihl = (AbstractC1252750ihl) obj;
        if (awS46S0310000_29.z3 && ((Thread) awS46S0310000_29.l0) == C786410Ut5.u3()) {
            "you need schedule upstream to another thread, you can call subscribeOn(IO)".toString();
            throw new IllegalStateException("you need schedule upstream to another thread, you can call subscribeOn(IO)");
        }
        C11E5 c11e5 = (C11E5) awS46S0310000_29.l1;
        c11e5.LIZLLL().dR2(new AwS395S0200000_29(c11e5, (C11E5<C004I, C004I>) new AwS395S0200000_29((Function2) awS46S0310000_29.l2, abstractC1252750ihl, 81), (Function1<C004I, C004I>) 83));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS46S0310000_29(JediViewModel jediViewModel, Function2 function2, int i) {
        super(1);
        this.$t = i;
        this.l1 = jediViewModel;
        this.l2 = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS46S0310000_29(ListMiddleware listMiddleware, Function2 function2, int i) {
        super(1);
        this.$t = i;
        this.l1 = listMiddleware;
        this.l2 = function2;
    }
}
