package kotlin.jvm.internal;

import X.C09AY;
import X.C1841890y1z;
import X.C1854470yMH;
import X.C1854760yMk;
import X.C1862330yYx;
import X.C2097608Jq;
import X.InterfaceC434580H2i;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.BottomInputAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;

/* JADX INFO: loaded from: classes28.dex */
public class AwS201S1100000_27 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS201S1100000_27(TakoAnswerBaseAssem takoAnswerBaseAssem, int i) {
        super(2);
        this.$t = i;
        this.l1 = takoAnswerBaseAssem;
        this.s0 = "reply";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS201S1100000_27(CompletionBlock completionBlock, String str, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.l1 = completionBlock;
    }

    public static final Object invoke$0(AwS201S1100000_27 awS201S1100000_27, Object obj, Object obj2) {
        ((TakoAnswerBaseAssem) awS201S1100000_27.l1).xr(((Number) obj).intValue(), (InterfaceC434580H2i) obj2, awS201S1100000_27.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS201S1100000_27 awS201S1100000_27, Object obj, Object obj2) {
        ((TakoAnswerBaseAssem) awS201S1100000_27.l1).yr(((Number) obj).intValue(), (InterfaceC434580H2i) obj2, awS201S1100000_27.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS201S1100000_27 awS201S1100000_27, Object obj, Object obj2) {
        ((TakoAnswerBaseAssem) awS201S1100000_27.l1).xr(((Number) obj).intValue(), (InterfaceC434580H2i) obj2, awS201S1100000_27.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS201S1100000_27 awS201S1100000_27, Object obj, Object obj2) {
        ((TakoAnswerBaseAssem) awS201S1100000_27.l1).yr(((Number) obj).intValue(), (InterfaceC434580H2i) obj2, awS201S1100000_27.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS201S1100000_27 awS201S1100000_27, Object obj, Object obj2) throws JSONException {
        C1854470yMH c1854470yMH = (C1854470yMH) obj;
        C1854760yMk c1854760yMk = ((BottomInputAssem) awS201S1100000_27.l1).LLJJJ;
        if (c1854760yMk != null) {
            c1854760yMk.LIZ(awS201S1100000_27.s0);
        }
        C1862330yYx.LIZ.mobTikbotQuickInteractionClick(C2097608Jq.LJIIJ(new Pair("source", "10"), new Pair("rank", String.valueOf(c1854470yMH.LLILLJJLI)), new Pair("interaction_name", c1854470yMH.LL), new Pair("log_id", c1854470yMH.LLILLL)), ((BottomInputAssem) awS201S1100000_27.l1).getCommonParams(), null);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS201S1100000_27 awS201S1100000_27, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        C1841890y1z.LIZJ(awS201S1100000_27.s0, (CompletionBlock) awS201S1100000_27.l1, (String) obj, zBooleanValue);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS201S1100000_27(BottomInputAssem bottomInputAssem, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = bottomInputAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS201S1100000_27(TakoAnswerBaseAssem takoAnswerBaseAssem, TakoAnswerBaseAssem<T> takoAnswerBaseAssem2, String str) {
        super(2);
        this.$t = str;
        this.l1 = takoAnswerBaseAssem;
        this.s0 = takoAnswerBaseAssem2;
    }
}
