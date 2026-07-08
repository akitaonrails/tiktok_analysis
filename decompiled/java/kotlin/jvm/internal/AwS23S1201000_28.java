package kotlin.jvm.internal;

import X.C09AY;
import X.C106Y;
import X.C1397620mTQ;
import X.C19203410Au;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class AwS23S1201000_28 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS23S1201000_28 awS23S1201000_28, Object obj) {
        C106Y c106y = (C106Y) awS23S1201000_28.l1;
        String str = awS23S1201000_28.s0;
        c106y.getClass();
        C106Y.LJJIJIL(1, str);
        ((C106Y) awS23S1201000_28.l1).LJJIJIIJI(awS23S1201000_28.i3, (View) awS23S1201000_28.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS23S1201000_28 awS23S1201000_28, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF = true;
        c1397620mTQ.LJFF(awS23S1201000_28.i3, new AwS111S1200000_28(awS23S1201000_28.s0, (String) awS23S1201000_28.l1, (Function0<Unit>) awS23S1201000_28.l2, (C19203410Au) 17));
        c1397620mTQ.LJII(2131830643, new AwS607S0100000_28((C19203410Au) awS23S1201000_28.l2, 404));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS23S1201000_28(int i, int i2, String str, Function0<Unit> function0, C19203410Au c19203410Au) {
        super(1);
        this.$t = c19203410Au;
        this.i3 = i;
        this.s0 = i2;
        this.l1 = str;
        this.l2 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S1201000_28(C106Y c106y, String str, View view, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = c106y;
        this.s0 = str;
        this.l2 = view;
        this.i3 = i;
    }
}
