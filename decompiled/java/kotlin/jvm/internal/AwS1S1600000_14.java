package kotlin.jvm.internal;

import X.C09AY;
import X.C0Y8T;
import X.C0YSQ;
import X.C1397620mTQ;
import X.C20642515q3;
import X.C463010IDr;
import X.C877320YbK;
import X.C878950Ydx;
import X.C885310YoD;
import X.InterfaceC876950Yaj;
import android.app.Activity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public class AwS1S1600000_14 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
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

    public static final Object invoke$0(AwS1S1600000_14 awS1S1600000_14, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJ(2131830231, new AwS1S1600000_14((Function0) awS1S1600000_14.l1, awS1S1600000_14.s0, (List) awS1S1600000_14.l2, (C878950Ydx) awS1S1600000_14.l3, (List) awS1S1600000_14.l4, (Function0) awS1S1600000_14.l5, (Activity) awS1S1600000_14.l6, 1));
        c1397620mTQ.LIZJ(1, C20642515q3.LJI(2131830230), null);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S1600000_14 awS1S1600000_14, Object obj) {
        Function0 function0 = (Function0) awS1S1600000_14.l1;
        if (function0 != null) {
            function0.invoke();
        }
        C885310YoD.LJIL(C885310YoD.LIZ, awS1S1600000_14.s0, ((List) awS1S1600000_14.l2).size(), ((C878950Ydx) awS1S1600000_14.l3).LLILLL.getMobValue());
        C877320YbK.LJIIIIZZ(C877320YbK.LIZ, awS1S1600000_14.s0, (C878950Ydx) awS1S1600000_14.l3, (List) awS1S1600000_14.l4, "delete_confirm");
        InterfaceC876950Yaj interfaceC876950YajLIZIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ);
        List list = (List) awS1S1600000_14.l2;
        interfaceC876950YajLIZIZ.LJJII(new C463010IDr((Function0) awS1S1600000_14.l5, list, (Activity) awS1S1600000_14.l6, 1), list, false);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS1S1600000_14(Function0 function0, Function0<Unit> function02, String str, List<C0Y8T> list, C878950Ydx c878950Ydx, List<String> list2, Function0<Unit> function03, Activity activity) {
        super(1);
        this.$t = activity;
        this.l1 = function0;
        this.s0 = function02;
        this.l2 = str;
        this.l3 = list;
        this.l4 = c878950Ydx;
        this.l5 = list2;
        this.l6 = function03;
    }
}
