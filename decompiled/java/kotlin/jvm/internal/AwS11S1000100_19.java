package kotlin.jvm.internal;

import X.C09AY;
import X.C1250680ieQ;
import X.C20684815ws;
import X.C2344009Gk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public class AwS11S1000100_19 extends C09AY implements Function0 {
    public final int $t;
    public long j1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS11S1000100_19 awS11S1000100_19) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1250680ieQ.LIZ.getClass();
        c2344009Gk.LJIIIIZZ("profile_attributes", C1250680ieQ.LJIIJJI);
        c2344009Gk.LJIIIIZZ("report_scene", "profile_component_cost_time");
        c2344009Gk.LJIIIIZZ("component_tag", awS11S1000100_19.s0);
        c2344009Gk.LIZLLL(awS11S1000100_19.j1, "generate_component_tree_cost_time");
        C20684815ws.LJIILLIIL("profile_performance_data_statistics", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS11S1000100_19 awS11S1000100_19) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1250680ieQ.LIZ.getClass();
        c2344009Gk.LJIIIIZZ("profile_attributes", C1250680ieQ.LJIIJJI);
        c2344009Gk.LJIIIIZZ("report_scene", "container_generate_layout");
        c2344009Gk.LJIIIIZZ("component_tag", awS11S1000100_19.s0);
        c2344009Gk.LIZLLL(awS11S1000100_19.j1, "container_generate_layout_cost_time");
        C20684815ws.LJIILLIIL("profile_performance_data_statistics", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS11S1000100_19(String str, long j, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.j1 = j;
    }
}
