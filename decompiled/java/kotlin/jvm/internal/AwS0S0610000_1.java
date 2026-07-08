package kotlin.jvm.internal;

import X.C013C;
import X.C03RR;
import X.C03RS;
import X.C03RT;
import X.C03RW;
import X.C03RX;
import X.C09AY;
import X.C1954807lC;
import X.C23250099c;
import X.C897703f5;
import X.C907803gi;
import X.C909603h0;
import X.C912503hT;
import X.EnumC840403Qc;
import X.InterfaceC911103hF;
import android.content.Context;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS0S0610000_1 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public boolean z6;

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

    public static final Object invoke$0(AwS0S0610000_1 awS0S0610000_1, Object obj) {
        InterfaceC911103hF interfaceC911103hF = ((C897703f5) awS0S0610000_1.l0).LJIILJJIL;
        if (interfaceC911103hF != null) {
            interfaceC911103hF.LIZIZ();
        }
        if (((C912503hT) awS0S0610000_1.l1) != null && ((C013C) awS0S0610000_1.l2).element) {
            C907803gi.LIZ.getClass();
            C23250099c.LIZLLL(C907803gi.LJ(), null, null, new C909603h0((C912503hT) awS0S0610000_1.l1, (Context) awS0S0610000_1.l5, (Function0) awS0S0610000_1.l3, (Function1) awS0S0610000_1.l4, awS0S0610000_1.z6, null), 3);
        } else {
            ((Function0) awS0S0610000_1.l3).invoke();
            Function1 function1 = (Function1) awS0S0610000_1.l4;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(awS0S0610000_1.z6));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0610000_1 awS0S0610000_1, Object obj) {
        int i;
        String str;
        String str2;
        String str3;
        HashMap map = (HashMap) obj;
        EnumC840403Qc enumC840403Qc = ((C03RS) awS0S0610000_1.l0).LIZJ;
        if (enumC840403Qc == null) {
            i = -1;
        } else {
            i = C03RR.LIZ[enumC840403Qc.ordinal()];
        }
        String str4 = "1";
        if (i != 1) {
            if (i != 2) {
                str = "";
                str2 = "";
            } else {
                str = "/api/v1/shop/bill_info/get";
                str2 = "3";
            }
        } else {
            str = "/api/v1/shop/bill_info/preload";
            str2 = "1";
        }
        map.put("path", str);
        map.put("is_valid", Integer.valueOf(((C03RS) awS0S0610000_1.l0).LIZ() ? 1 : 0));
        int i2 = C03RR.LIZIZ[((C03RT) awS0S0610000_1.l1).ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                str4 = "2";
            } else {
                throw new C1954807lC();
            }
        }
        map.put("preload_state", str4);
        map.put("use_cache", Integer.valueOf(awS0S0610000_1.z6 ? 1 : 0));
        map.put("data_source", str2);
        Integer num = (Integer) awS0S0610000_1.l2;
        if (num != null) {
            map.put("sku_num", Integer.valueOf(num.intValue()));
        }
        Boolean bool = (Boolean) awS0S0610000_1.l3;
        if (bool != null) {
            map.put("is_success", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        map.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        C03RX c03rx = (C03RX) awS0S0610000_1.l4;
        if (c03rx != null) {
            if (!awS0S0610000_1.z6) {
                map.put("page_name", c03rx.LIZ);
            }
            String str5 = c03rx.LIZIZ;
            if (str5 != null) {
                map.put("source", str5);
            }
        }
        C03RW c03rw = (C03RW) awS0S0610000_1.l5;
        if (c03rw != null && (str3 = c03rw.LIZJ) != null) {
            map.put("source", str3);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0610000_1(C03RS c03rs, C03RT c03rt, boolean z, Integer num, Boolean bool, C03RX c03rx, C03RW c03rw, int i) {
        super(1);
        this.$t = i;
        this.l0 = c03rs;
        this.l1 = c03rt;
        this.z6 = z;
        this.l2 = num;
        this.l3 = bool;
        this.l4 = c03rx;
        this.l5 = c03rw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S0610000_1(C897703f5 c897703f5, C897703f5 c897703f52, C912503hT c912503hT, C013C c013c, Function0<Unit> function0, Function1<? super Boolean, Unit> function1, boolean z, Context context) {
        super(1);
        this.$t = context;
        this.l0 = c897703f5;
        this.l1 = c897703f52;
        this.l2 = c912503hT;
        this.l3 = c013c;
        this.l4 = function0;
        this.z6 = function1;
        this.l5 = z;
    }
}
