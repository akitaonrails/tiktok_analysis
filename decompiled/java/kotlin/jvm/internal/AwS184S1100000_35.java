package kotlin.jvm.internal;

import X.AbstractC2276531E8t;
import X.AbstractC888820Yts;
import X.C09AY;
import X.C1720106oR;
import X.C1DUJ;
import X.C1DYZ;
import X.C1ELM;
import X.C1ELN;
import X.C1ELO;
import X.C20684815ws;
import X.C207083161p;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2276441E8k;
import X.C2344009Gk;
import X.C807250Vlb;
import com.tiktok.ttm.ttmparam.container.TTMContainer;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public class AwS184S1100000_35 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS184S1100000_35 awS184S1100000_35) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LIZJ(awS184S1100000_35.s0, (Throwable) awS184S1100000_35.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS184S1100000_35 awS184S1100000_35) {
        String str = awS184S1100000_35.s0;
        C2276441E8k.LIZIZ.LIZ(new C807250Vlb(C207083161p.LIZIZ.LIZ(), str), "UBTraceLogger", "", (Exception) awS184S1100000_35.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS184S1100000_35 awS184S1100000_35) {
        C1DUJ c1duj = TTMContainer.Companion;
        long nativeAddress$machine_core_release = ((C1DYZ) awS184S1100000_35.l1).getNativeAddress$machine_core_release();
        String str = awS184S1100000_35.s0;
        c1duj.getClass();
        return TTMContainer.ttmNativeGetString(nativeAddress$machine_core_release, str, Integer.MAX_VALUE);
    }

    public static final Object invoke$3(AwS184S1100000_35 awS184S1100000_35) {
        C1ELM.LIZJ(awS184S1100000_35.s0, "close");
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS184S1100000_35 awS184S1100000_35) {
        C1ELM c1elm = (C1ELM) awS184S1100000_35.l1;
        String str = awS184S1100000_35.s0;
        c1elm.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        AbstractC888820Yts.LIZ(c2344009Gk, str);
        c2344009Gk.LJIIIIZZ("copy_type", "inner_push");
        c2344009Gk.LIZJ(1, "system_status");
        c2344009Gk.LIZJ(1, "outer_status");
        c2344009Gk.LIZJ(0, "inner_status");
        C20684815ws.LJIILLIIL("ttsocial_message_request_push_guide_show", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS184S1100000_35 awS184S1100000_35) {
        C1ELN.LIZJ(awS184S1100000_35.s0, "close");
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS184S1100000_35 awS184S1100000_35) {
        C1ELN c1eln = (C1ELN) awS184S1100000_35.l1;
        String str = awS184S1100000_35.s0;
        c1eln.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        AbstractC888820Yts.LIZ(c2344009Gk, str);
        c2344009Gk.LJIIIIZZ("copy_type", "notification");
        c2344009Gk.LIZJ(1, "system_status");
        c2344009Gk.LIZJ(0, "outer_status");
        c2344009Gk.LIZJ(0, "inner_status");
        C20684815ws.LJIILLIIL("ttsocial_message_request_push_guide_show", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS184S1100000_35 awS184S1100000_35) {
        C1ELO.LIZJ(awS184S1100000_35.s0, "close");
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS184S1100000_35 awS184S1100000_35) {
        C1ELO c1elo = (C1ELO) awS184S1100000_35.l1;
        String str = awS184S1100000_35.s0;
        c1elo.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        AbstractC888820Yts.LIZ(c2344009Gk, str);
        c2344009Gk.LJIIIIZZ("copy_type", "push");
        c2344009Gk.LIZJ(1, "system_status");
        c2344009Gk.LIZJ(0, "outer_status");
        c2344009Gk.LIZJ(1, "inner_status");
        C20684815ws.LJIILLIIL("ttsocial_message_request_push_guide_show", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0WPq] */
    public static final Object invoke$9(AwS184S1100000_35 awS184S1100000_35) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkHitStrategyRealtime ---> ");
        sbLIZ.append(awS184S1100000_35.s0);
        sbLIZ.append(", ruleId: ");
        sbLIZ.append(((AbstractC2276531E8t) awS184S1100000_35.l1).LIZIZ().getRuleId());
        sbLIZ.append(" ===> begin");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS184S1100000_35(C1DYZ c1dyz, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1dyz;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS184S1100000_35(C1ELM c1elm, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1elm;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS184S1100000_35(C1ELN c1eln, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1eln;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS184S1100000_35(C1ELO c1elo, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1elo;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS184S1100000_35(String str, String str2, AbstractC2276531E8t<RULE> abstractC2276531E8t) {
        super(0);
        this.$t = abstractC2276531E8t;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS184S1100000_35(String str, Exception exc, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = exc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS184S1100000_35(String str, Throwable th, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = th;
    }
}
