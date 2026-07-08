package kotlin.jvm.internal;

import X.C03O0;
import X.C09AY;
import X.C1417405gi;
import X.C957403oi;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS4S1000100_1 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
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
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS4S1000100_1 awS4S1000100_1, Object obj) {
        C03O0 c03o0 = C03O0.LIZ;
        String str = awS4S1000100_1.s0;
        Long lValueOf = Long.valueOf(awS4S1000100_1.j1);
        c03o0.getClass();
        ((HashMap) obj).putAll(C03O0.LJIJI(lValueOf, str));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S1000100_1 awS4S1000100_1, Object obj) {
        C03O0 c03o0 = C03O0.LIZ;
        String str = awS4S1000100_1.s0;
        Long lValueOf = Long.valueOf(awS4S1000100_1.j1);
        c03o0.getClass();
        ((HashMap) obj).putAll(C03O0.LJIJI(lValueOf, str));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS4S1000100_1 awS4S1000100_1, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LIZLLL("page_name", awS4S1000100_1.s0);
        c957403oi.LIZLLL("duration", Long.valueOf(awS4S1000100_1.j1));
        C1417405gi.LIZ.getClass();
        c957403oi.LIZLLL("is_warm_webview", Integer.valueOf(C1417405gi.LIZJ ? 1 : 0));
        c957403oi.LIZLLL("do_warm_webview", Integer.valueOf(!Intrinsics.LJFF(awS4S1000100_1.s0, "order_submit") ? 1 : 0));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS4S1000100_1 awS4S1000100_1, Object obj) {
        C03O0 c03o0 = C03O0.LIZ;
        String str = awS4S1000100_1.s0;
        Long lValueOf = Long.valueOf(awS4S1000100_1.j1);
        c03o0.getClass();
        ((HashMap) obj).putAll(C03O0.LJIJI(lValueOf, str));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S1000100_1(String str, long j, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.j1 = j;
    }
}
