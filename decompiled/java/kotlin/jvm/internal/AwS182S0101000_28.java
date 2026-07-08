package kotlin.jvm.internal;

import X.AnonymousClass1097;
import X.C09AY;
import X.C109U;
import X.C109W;
import X.C191977108p;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes29.dex */
public class AwS182S0101000_28 extends C09AY implements Function2 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS182S0101000_28(C191977108p c191977108p, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c191977108p;
        this.i1 = i;
    }

    public static final Object invoke$0(AwS182S0101000_28 awS182S0101000_28, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        ((C109W) awS182S0101000_28.l0).LJIJJLI(awS182S0101000_28.i1, (View) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS182S0101000_28 awS182S0101000_28, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        ((C109U) awS182S0101000_28.l0).LJIJ(awS182S0101000_28.i1, (View) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS182S0101000_28 awS182S0101000_28, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        ((AnonymousClass1097) awS182S0101000_28.l0).LJJIIJ(awS182S0101000_28.i1, (View) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS182S0101000_28 awS182S0101000_28, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        ((C191977108p) awS182S0101000_28.l0).LJJIJIIJI(awS182S0101000_28.i1, (View) obj);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS182S0101000_28(AnonymousClass1097 anonymousClass1097, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = anonymousClass1097;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS182S0101000_28(C109U c109u, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c109u;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS182S0101000_28(C109W c109w, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c109w;
        this.i1 = i;
    }
}
