package kotlin.jvm.internal;

import X.C09AY;
import X.C0IA3;
import X.C450530Hlb;
import X.C461930I9n;
import X.EnumC429240GsM;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class AwS39S0301000_6 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS39S0301000_6 awS39S0301000_6, Object obj) {
        C0IA3 c0ia3 = (C0IA3) awS39S0301000_6.l0;
        List list = (List) awS39S0301000_6.l1;
        return C461930I9n.LIZ((C461930I9n) obj, c0ia3, list, (EnumC429240GsM) awS39S0301000_6.l2, null, new Pair(Integer.valueOf(Math.min(awS39S0301000_6.i3, list.size())), Integer.valueOf(((List) awS39S0301000_6.l1).size())), 0, null, 0, 0, null, LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public static final Object invoke$1(AwS39S0301000_6 awS39S0301000_6, Object obj) {
        int iIntValue;
        C461930I9n c461930I9n = (C461930I9n) obj;
        if (((EnumC429240GsM) awS39S0301000_6.l0) == EnumC429240GsM.PUBLISHING) {
            Integer num = (Integer) ((Map) awS39S0301000_6.l1).get(Integer.valueOf(awS39S0301000_6.i3));
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
        } else {
            iIntValue = 100;
        }
        return C461930I9n.LIZ(c461930I9n, null, (List) awS39S0301000_6.l2, (EnumC429240GsM) awS39S0301000_6.l0, null, new Pair(Integer.valueOf(awS39S0301000_6.i3 + 1), Integer.valueOf(((List) awS39S0301000_6.l2).size())), awS39S0301000_6.i3, (Map) awS39S0301000_6.l1, iIntValue, 0, null, 777);
    }

    public static final Object invoke$2(AwS39S0301000_6 awS39S0301000_6, Object obj) {
        int iIntValue;
        C461930I9n c461930I9n = (C461930I9n) obj;
        if (((EnumC429240GsM) awS39S0301000_6.l0) == EnumC429240GsM.PUBLISHING) {
            Integer num = (Integer) ((Map) awS39S0301000_6.l1).get(Integer.valueOf(awS39S0301000_6.i3));
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
        } else {
            iIntValue = 100;
        }
        return C461930I9n.LIZ(c461930I9n, null, (List) awS39S0301000_6.l2, (EnumC429240GsM) awS39S0301000_6.l0, null, new Pair(Integer.valueOf(awS39S0301000_6.i3 + 1), Integer.valueOf(((List) awS39S0301000_6.l2).size())), awS39S0301000_6.i3, (Map) awS39S0301000_6.l1, iIntValue, 0, null, 777);
    }

    public static final Object invoke$3(AwS39S0301000_6 awS39S0301000_6, Object obj) {
        return C461930I9n.LIZ((C461930I9n) obj, (C0IA3) awS39S0301000_6.l0, (List) awS39S0301000_6.l1, EnumC429240GsM.PUBLISHING, null, null, 0, (Map) awS39S0301000_6.l2, awS39S0301000_6.i3, 0, null, 824);
    }

    public static final Object invoke$4(AwS39S0301000_6 awS39S0301000_6, Object obj) {
        C450530Hlb c450530Hlb = (C450530Hlb) awS39S0301000_6.l0;
        if (c450530Hlb.LJFF == awS39S0301000_6.i3) {
            c450530Hlb.LJIIJJI((RecyclerView) awS39S0301000_6.l2, (View) awS39S0301000_6.l1);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS39S0301000_6(EnumC429240GsM enumC429240GsM, EnumC429240GsM enumC429240GsM2, Map<Integer, Integer> map, int i, List<C0IA3> list) {
        super(1);
        this.$t = list;
        this.l0 = enumC429240GsM;
        this.l1 = enumC429240GsM2;
        this.i3 = map;
        this.l2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS39S0301000_6(C450530Hlb c450530Hlb, int i, View view, RecyclerView recyclerView, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c450530Hlb;
        this.i3 = i;
        this.l1 = view;
        this.l2 = recyclerView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS39S0301000_6(C0IA3 c0ia3, C0IA3 c0ia32, List<C0IA3> list, EnumC429240GsM enumC429240GsM, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0ia3;
        this.l1 = c0ia32;
        this.l2 = list;
        this.i3 = enumC429240GsM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS39S0301000_6(C0IA3 c0ia3, C0IA3 c0ia32, List<C0IA3> list, Map<Integer, Integer> map, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0ia3;
        this.l1 = c0ia32;
        this.l2 = list;
        this.i3 = map;
    }
}
