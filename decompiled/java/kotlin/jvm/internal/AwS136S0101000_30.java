package kotlin.jvm.internal;

import X.C09AY;
import X.C0RTA;
import X.C0RTB;
import X.C13IQ;
import X.C14IN;
import X.C20243114Ir;
import X.C20304914ch;
import X.C20305614co;
import X.C259800zU;
import X.C291001Au;
import X.C418440Gaw;
import X.C814420VxA;
import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.compose.ui.focus.FocusTargetNode;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import com.ss.android.ugc.aweme.tako.botpage.components.sug.TakoSugAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes31.dex */
public class AwS136S0101000_30 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Boolean] */
    public static final Object invoke$0(AwS136S0101000_30 awS136S0101000_30, Object obj) {
        boolean zBooleanValue;
        ((C259800zU) awS136S0101000_30.l0).element = Boolean.valueOf(((FocusTargetNode) obj).LJJLIIJ(awS136S0101000_30.i1));
        Boolean bool = (Boolean) ((C259800zU) awS136S0101000_30.l0).element;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$1(AwS136S0101000_30 awS136S0101000_30, Object obj) {
        ((ViewGroup.MarginLayoutParams) obj).topMargin = awS136S0101000_30.i1 - ((C20243114Ir) awS136S0101000_30.l0).LLJJ.getMeasuredHeight();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS136S0101000_30 awS136S0101000_30, Object obj) {
        C0RTB c0rtb = (C0RTB) obj;
        c0rtb.LLILLL = (C13IQ) awS136S0101000_30.l0;
        c0rtb.LLJI = awS136S0101000_30.i1;
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS136S0101000_30 awS136S0101000_30, Object obj) {
        C0RTA c0rta = (C0RTA) obj;
        c0rta.LLILLL = (C13IQ) awS136S0101000_30.l0;
        c0rta.LLJI = awS136S0101000_30.i1;
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS136S0101000_30 awS136S0101000_30, Object obj) {
        C14IN c14in = (C14IN) obj;
        c14in.LIZ = 1;
        c14in.LIZIZ = Integer.valueOf(((TakoSugAssem) awS136S0101000_30.l0).op(R.attr.a01));
        c14in.LJ = Float.valueOf(((TakoSugAssem) awS136S0101000_30.l0).sp());
        c14in.LJIIIIZZ = new Rect(awS136S0101000_30.i1, 0, 0, 0);
        c14in.LJIIIZ = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        c14in.LJI = -2;
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS136S0101000_30 awS136S0101000_30, Object obj) {
        return C20304914ch.LIZ((C20304914ch) obj, null, null, null, null, null, new C20305614co((PushItem) awS136S0101000_30.l0, awS136S0101000_30.i1, null), new C291001Au(Unit.LIZ), null, 159);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S0101000_30(int i, C259800zU c259800zU, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c259800zU;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S0101000_30(int i, C20243114Ir c20243114Ir, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c20243114Ir;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS136S0101000_30(C13IQ c13iq, C13IQ<? extends ReusedUISlotAssem<?>> c13iq2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c13iq;
        this.i1 = c13iq2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S0101000_30(PushItem pushItem, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = pushItem;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S0101000_30(TakoSugAssem takoSugAssem, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = takoSugAssem;
        this.i1 = i;
    }
}
