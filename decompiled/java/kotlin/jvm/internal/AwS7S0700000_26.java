package kotlin.jvm.internal;

import X.C09AY;
import X.C0NLF;
import X.C1759440vt0;
import X.C1759470vt3;
import X.C1759590vtF;
import X.EnumC1759580vtE;
import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public class AwS7S0700000_26 extends C09AY implements Function0 {
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

    public static final Object invoke$0(AwS7S0700000_26 awS7S0700000_26) {
        ((C1759440vt0) awS7S0700000_26.l0).LJIIJJI(EnumC1759580vtE.BOTTOM, (C1759590vtF) awS7S0700000_26.l1, (Context) awS7S0700000_26.l2, (ViewGroup) awS7S0700000_26.l3, (PdpViewModel) awS7S0700000_26.l4, (Function0) awS7S0700000_26.l5, (C0NLF) awS7S0700000_26.l6);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS7S0700000_26 awS7S0700000_26) {
        ((C1759470vt3) awS7S0700000_26.l0).LIZJ(EnumC1759580vtE.BOTTOM, (C1759590vtF) awS7S0700000_26.l1, (Context) awS7S0700000_26.l2, (ViewGroup) awS7S0700000_26.l3, (SeaPdpViewModel) awS7S0700000_26.l4, (Function0) awS7S0700000_26.l5, (Function0) awS7S0700000_26.l6);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS7S0700000_26(C1759440vt0 c1759440vt0, C1759440vt0 c1759440vt02, C1759590vtF c1759590vtF, Context context, ViewGroup viewGroup, PdpViewModel pdpViewModel, Function0<Unit> function0, C0NLF c0nlf) {
        super(0);
        this.$t = c0nlf;
        this.l0 = c1759440vt0;
        this.l1 = c1759440vt02;
        this.l2 = c1759590vtF;
        this.l3 = context;
        this.l4 = viewGroup;
        this.l5 = pdpViewModel;
        this.l6 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS7S0700000_26(C1759470vt3 c1759470vt3, C1759470vt3 c1759470vt32, C1759590vtF c1759590vtF, Context context, ViewGroup viewGroup, SeaPdpViewModel seaPdpViewModel, Function0<Unit> function0, Function0<Unit> function02) {
        super(0);
        this.$t = function02;
        this.l0 = c1759470vt3;
        this.l1 = c1759470vt32;
        this.l2 = c1759590vtF;
        this.l3 = context;
        this.l4 = viewGroup;
        this.l5 = seaPdpViewModel;
        this.l6 = function0;
    }
}
