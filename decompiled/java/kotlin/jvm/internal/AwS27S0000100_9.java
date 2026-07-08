package kotlin.jvm.internal;

import X.C09AY;
import X.C0OI7;
import X.C0OII;
import X.C0OKY;
import X.C0OPQ;
import X.C2097608Jq;
import X.C823050WQl;
import X.C869590Y9l;
import X.InterfaceC584630MwP;
import Y.ARunnableS109S0100000_9;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class AwS27S0000100_9 extends C09AY implements Function1 {
    public final int $t;
    public long j0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS27S0000100_9(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AwS27S0000100_9 awS27S0000100_9, Object obj) {
        return C0OKY.LIZ((C0OKY) obj, null, null, null, null, null, null, awS27S0000100_9.j0, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, null, null, null, false, null, null, 2147483583);
    }

    public static final Object invoke$1(AwS27S0000100_9 awS27S0000100_9, Object obj) {
        ((C0OI7) obj).LIZIZ(C0OII.LJ, Long.valueOf(awS27S0000100_9.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS27S0000100_9 awS27S0000100_9, Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("enter_from", "add_yours_detail_page");
        jSONObject.put("duration", awS27S0000100_9.j0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS27S0000100_9 awS27S0000100_9, Object obj) {
        C0OPQ c0opq = C0OPQ.LIZ;
        String strValueOf = String.valueOf(awS27S0000100_9.j0);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("enter_from", "bulletin_board_detail_page"), new Pair("action_type", "click"), new Pair("click_type", "cancel"));
        c0opq.getClass();
        C0OPQ.LJIJI(strValueOf, mapLJIIIIZZ);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS27S0000100_9 awS27S0000100_9, Object obj) {
        int i;
        C869590Y9l c869590Y9l = (C869590Y9l) obj;
        if (c869590Y9l.getIndex() == awS27S0000100_9.j0) {
            i = 0;
        } else if (c869590Y9l.getIndex() > awS27S0000100_9.j0) {
            i = -1;
        } else {
            i = 1;
        }
        return Integer.valueOf(i);
    }

    public static final Object invoke$5(AwS27S0000100_9 awS27S0000100_9, Object obj) {
        C823050WQl.LJ().schedule(new ARunnableS109S0100000_9((InterfaceC584630MwP) obj, 216), awS27S0000100_9.j0, TimeUnit.MILLISECONDS);
        return Unit.LIZ;
    }
}
