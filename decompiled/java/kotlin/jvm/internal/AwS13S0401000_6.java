package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0IA3;
import X.C461930I9n;
import X.EnumC429240GsM;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public class AwS13S0401000_6 extends C09AY implements Function1 {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final Object invoke$0(AwS13S0401000_6 awS13S0401000_6, Object obj) {
        int iIntValue;
        C461930I9n c461930I9n = (C461930I9n) obj;
        Pair pair = new Pair(Integer.valueOf(awS13S0401000_6.i4 + 1), Integer.valueOf(((List) awS13S0401000_6.l0).size()));
        Integer num = (Integer) ((Map) awS13S0401000_6.l1).get(Integer.valueOf(awS13S0401000_6.i4));
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        return C461930I9n.LIZ(c461930I9n, (C0IA3) awS13S0401000_6.l2, (List) awS13S0401000_6.l0, (EnumC429240GsM) awS13S0401000_6.l3, null, pair, awS13S0401000_6.i4, (Map) awS13S0401000_6.l1, iIntValue, 0, null, 776);
    }

    public static final Object invoke$1(AwS13S0401000_6 awS13S0401000_6, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        ((C013C) awS13S0401000_6.l0).element = true;
        TextView textView = (TextView) ((View) awS13S0401000_6.l1).findViewById(R.id.o4p);
        if (textView != null) {
            textView.setText(String.valueOf(iIntValue));
        }
        ((PopupWindow) awS13S0401000_6.l2).dismiss();
        ((Function2) awS13S0401000_6.l3).invoke(Integer.valueOf(awS13S0401000_6.i4), Integer.valueOf(iIntValue));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS13S0401000_6(int i, int i2, List<C0IA3> list, Map<Integer, Integer> map, C0IA3 c0ia3, EnumC429240GsM enumC429240GsM) {
        super(1);
        this.$t = enumC429240GsM;
        this.i4 = i;
        this.l0 = i2;
        this.l1 = list;
        this.l2 = map;
        this.l3 = c0ia3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS13S0401000_6(C013C c013c, C013C c013c2, View view, PopupWindow popupWindow, Function2<? super Integer, ? super Integer, Unit> function2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = c013c2;
        this.l2 = view;
        this.l3 = popupWindow;
        this.i4 = function2;
    }
}
