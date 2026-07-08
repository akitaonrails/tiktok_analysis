package kotlin.jvm.internal;

import X.C09AY;
import X.C1683130ttv;
import X.C20045513bx;
import X.C20052513d5;
import X.C20059813eG;
import X.C20059913eH;
import X.InterfaceC1691390u7F;
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes31.dex */
public class AwS5S0501000_30 extends C09AY implements Function1 {
    public final int $t;
    public int i5;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS5S0501000_30 awS5S0501000_30, Object obj) {
        InterfaceC1691390u7F interfaceC1691390u7F = (InterfaceC1691390u7F) obj;
        ((C20045513bx) awS5S0501000_30.l0).getClass();
        if (((FocusTargetNode) awS5S0501000_30.l1) != C20052513d5.LJI((FocusTargetNode) awS5S0501000_30.l2).getFocusOwner().LIZJ()) {
            return Boolean.TRUE;
        }
        Boolean boolValueOf = Boolean.valueOf(C20059813eG.LJFF((FocusTargetNode) awS5S0501000_30.l2, (FocusTargetNode) awS5S0501000_30.l3, awS5S0501000_30.i5, (Function1) awS5S0501000_30.l4));
        if (boolValueOf.booleanValue() || !interfaceC1691390u7F.LIZ()) {
            return boolValueOf;
        }
        return null;
    }

    public static final Object invoke$1(AwS5S0501000_30 awS5S0501000_30, Object obj) {
        InterfaceC1691390u7F interfaceC1691390u7F = (InterfaceC1691390u7F) obj;
        ((C20045513bx) awS5S0501000_30.l0).getClass();
        if (((FocusTargetNode) awS5S0501000_30.l1) != C20052513d5.LJI((FocusTargetNode) awS5S0501000_30.l2).getFocusOwner().LIZJ()) {
            return Boolean.TRUE;
        }
        Boolean boolValueOf = Boolean.valueOf(C20059913eH.LJIIIZ(awS5S0501000_30.i5, (FocusTargetNode) awS5S0501000_30.l2, (C1683130ttv) awS5S0501000_30.l3, (Function1) awS5S0501000_30.l4));
        if (boolValueOf.booleanValue() || !interfaceC1691390u7F.LIZ()) {
            return boolValueOf;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S0501000_30(C20045513bx c20045513bx, FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, C1683130ttv c1683130ttv, int i, Function1 function1, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c20045513bx;
        this.l1 = focusTargetNode;
        this.l2 = focusTargetNode2;
        this.l3 = c1683130ttv;
        this.i5 = i;
        this.l4 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S0501000_30(C20045513bx c20045513bx, FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, FocusTargetNode focusTargetNode3, int i, Function1 function1, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c20045513bx;
        this.l1 = focusTargetNode;
        this.l2 = focusTargetNode2;
        this.l3 = focusTargetNode3;
        this.i5 = i;
        this.l4 = function1;
    }
}
