package kotlin.jvm.internal;

import X.C09AY;
import X.C11EE;
import X.C11H2;
import X.InterfaceC2217241BqE;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public class AwS62S0500000_29 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS62S0500000_29 awS62S0500000_29, Object obj) {
        return new C11H2(((InterfaceC2217241BqE) awS62S0500000_29.l0).get(obj), ((InterfaceC2217241BqE) awS62S0500000_29.l1).get(obj), ((InterfaceC2217241BqE) awS62S0500000_29.l2).get(obj), ((InterfaceC2217241BqE) awS62S0500000_29.l3).get(obj), ((InterfaceC2217241BqE) awS62S0500000_29.l4).get(obj));
    }

    public static final Object invoke$1(AwS62S0500000_29 awS62S0500000_29, Object obj) {
        return new C11H2(((InterfaceC2217241BqE) awS62S0500000_29.l0).get(obj), ((InterfaceC2217241BqE) awS62S0500000_29.l1).get(obj), ((InterfaceC2217241BqE) awS62S0500000_29.l2).get(obj), ((InterfaceC2217241BqE) awS62S0500000_29.l3).get(obj), ((InterfaceC2217241BqE) awS62S0500000_29.l4).get(obj));
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS62S0500000_29 awS62S0500000_29, Object obj) {
        return new C11EE(((InterfaceC2217241BqE) awS62S0500000_29.l0).get(obj), ((InterfaceC2217241BqE) awS62S0500000_29.l1).get(obj), ((InterfaceC2217241BqE) awS62S0500000_29.l2).get(obj), ((InterfaceC2217241BqE) awS62S0500000_29.l3).get(obj), ((InterfaceC2217241BqE) awS62S0500000_29.l4).get(obj));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS62S0500000_29(InterfaceC2217241BqE interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE5, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE6) {
        super(1);
        this.$t = interfaceC2217241BqE6;
        this.l0 = interfaceC2217241BqE;
        this.l1 = interfaceC2217241BqE2;
        this.l2 = interfaceC2217241BqE3;
        this.l3 = interfaceC2217241BqE4;
        this.l4 = interfaceC2217241BqE5;
    }
}
