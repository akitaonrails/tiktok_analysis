package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C1290210jgB;
import X.C1491290ouV;
import X.C1491300ouW;
import X.C1532310pyf;
import X.C1533790q13;
import X.C1547950qNt;
import X.EnumC1547970qNv;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes24.dex */
public class AwS60S1300000_23 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS60S1300000_23 awS60S1300000_23, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        String str = (String) entry.getKey();
        C1491290ouV c1491290ouV = (C1491290ouV) entry.getValue();
        if (!Intrinsics.LJFF(str, awS60S1300000_23.s0) && c1491290ouV.LJ.contains(awS60S1300000_23.s0) && ((C1491300ouW) awS60S1300000_23.l1).LJIJJLI(str, (Map) awS60S1300000_23.l2)) {
            ((C013C) awS60S1300000_23.l3).element = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS60S1300000_23 awS60S1300000_23, Object obj) {
        EnumC1547970qNv enumC1547970qNv;
        C1532310pyf c1532310pyf = (C1532310pyf) obj;
        String strLJFF = c1532310pyf.LJFF();
        if (c1532310pyf.isSuccess() && strLJFF != null) {
            Function1 function1 = (Function1) awS60S1300000_23.l1;
            if (c1532310pyf.LIZ.LJJIII.LIZLLL() == null) {
                UriProtector.parse(awS60S1300000_23.s0);
            }
            C1290210jgB c1290210jgB = new C1290210jgB();
            C1547950qNt c1547950qNt = (C1547950qNt) awS60S1300000_23.l3;
            c1290210jgB.LIZ = strLJFF;
            if (Intrinsics.LJFF(c1532310pyf.LJIIJJI, "assets")) {
                enumC1547970qNv = EnumC1547970qNv.ASSET;
            } else {
                enumC1547970qNv = EnumC1547970qNv.DISK;
            }
            c1290210jgB.LIZIZ = enumC1547970qNv;
            String str = c1532310pyf.LJIIJJI;
            c1547950qNt.getClass();
            C1547950qNt.LIZIZ(c1290210jgB, str);
            function1.invoke(c1290210jgB);
        } else {
            ((Function2) awS60S1300000_23.l2).invoke(new Throwable(c1532310pyf.LIZJ.LIZJ()), Boolean.FALSE);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS60S1300000_23 awS60S1300000_23, Object obj) {
        EnumC1547970qNv enumC1547970qNv;
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        String strLIZLLL = c1533790q13.LIZLLL();
        if (c1533790q13.LIZIZ && strLIZLLL != null) {
            Function1 function1 = (Function1) awS60S1300000_23.l1;
            UriProtector.parse(awS60S1300000_23.s0);
            C1290210jgB c1290210jgB = new C1290210jgB();
            C1547950qNt c1547950qNt = (C1547950qNt) awS60S1300000_23.l3;
            c1290210jgB.LIZ = strLIZLLL;
            if (Intrinsics.LJFF(c1533790q13.LJ, "builtin")) {
                enumC1547970qNv = EnumC1547970qNv.ASSET;
            } else {
                enumC1547970qNv = EnumC1547970qNv.DISK;
            }
            c1290210jgB.LIZIZ = enumC1547970qNv;
            String str = c1533790q13.LJ;
            c1547950qNt.getClass();
            C1547950qNt.LIZIZ(c1290210jgB, str);
            function1.invoke(c1290210jgB);
        } else {
            ((Function2) awS60S1300000_23.l2).invoke(new Throwable(c1533790q13.LIZLLL.toString()), Boolean.FALSE);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS60S1300000_23(String str, String str2, C1491300ouW c1491300ouW, Map<String, Boolean> map, C013C c013c) {
        super(1);
        this.$t = c013c;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = c1491300ouW;
        this.l3 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS60S1300000_23(Function1 function1, Function1<? super C1290210jgB, Unit> function12, String str, Function2<? super Throwable, ? super Boolean, Unit> function2, C1547950qNt c1547950qNt) {
        super(1);
        this.$t = c1547950qNt;
        this.l1 = function1;
        this.s0 = function12;
        this.l2 = str;
        this.l3 = function2;
    }
}
