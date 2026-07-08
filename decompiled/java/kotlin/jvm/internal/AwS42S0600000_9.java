package kotlin.jvm.internal;

import X.C05P0;
import X.C05P1;
import X.C09AY;
import X.C0MAE;
import X.C1325710kbR;
import X.C19719212De;
import X.C5185020h;
import X.C589690NAx;
import X.C589710NAz;
import X.C631220OpM;
import X.C632090Oql;
import X.C632560OrW;
import X.C632570OrX;
import X.InterfaceC1891350zJl;
import X.InterfaceC636240OxS;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public class AwS42S0600000_9 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

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

    public static final Object invoke$0(AwS42S0600000_9 awS42S0600000_9, Object obj, Object obj2) {
        C0MAE c0mae = (C0MAE) obj;
        List listItemState = ((InterfaceC636240OxS) awS42S0600000_9.l0).getListItemState();
        c0mae.LIZJ(listItemState.size(), new AwS588S0100000_9(listItemState, (List<InterfaceC1891350zJl>) 277), AFwS240S0000000_9.get$arr$(907), new C19719212De(627031420, new C632570OrX(listItemState, (C05P1) awS42S0600000_9.l1, (Function1) awS42S0600000_9.l2, (Fragment) awS42S0600000_9.l3), true));
        c0mae.LIZIZ(null, null, new C19719212De(-52570843, new AwS314S0300000_9((InterfaceC636240OxS) obj2, (InterfaceC636240OxS<C632560OrW>) awS42S0600000_9.l4, (Function0<Unit>) awS42S0600000_9.l5, (C05P0<Boolean>) 1), true));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS42S0600000_9 awS42S0600000_9, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (((C589710NAz) awS42S0600000_9.l0).LIZ) {
            ((Function2) awS42S0600000_9.l1).invoke(Boolean.FALSE, null);
        } else if (zBooleanValue) {
            ((Function0) awS42S0600000_9.l2).invoke();
            Executor executor = C589690NAx.LIZ;
            C589690NAx.LIZ((C1325710kbR) awS42S0600000_9.l3, (Context) awS42S0600000_9.l4, (Function0) awS42S0600000_9.l5, (C589710NAz) awS42S0600000_9.l0, new C5185020h((Function2) awS42S0600000_9.l1, (Function2<? super Boolean, ? super Throwable, Unit>) 15));
        } else {
            ((Function2) awS42S0600000_9.l1).invoke(Boolean.FALSE, obj2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS42S0600000_9(InterfaceC636240OxS interfaceC636240OxS, InterfaceC636240OxS<C632560OrW> interfaceC636240OxS2, C05P1<C631220OpM> c05p1, Function1<? super C632090Oql, Unit> function1, Fragment fragment, Function0<Unit> function0, C05P0<Boolean> c05p0) {
        super(2);
        this.$t = c05p0;
        this.l0 = interfaceC636240OxS;
        this.l1 = interfaceC636240OxS2;
        this.l2 = c05p1;
        this.l3 = function1;
        this.l4 = fragment;
        this.l5 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS42S0600000_9(Context context, C1325710kbR c1325710kbR, C589710NAz c589710NAz, Function0 function0, Function0 function02, Function2 function2, int i) {
        super(2);
        this.$t = i;
        this.l0 = c589710NAz;
        this.l1 = function2;
        this.l2 = function0;
        this.l3 = c1325710kbR;
        this.l4 = context;
        this.l5 = function02;
    }
}
