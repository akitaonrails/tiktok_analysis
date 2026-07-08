package kotlin.jvm.internal;

import X.AbstractC888820Yts;
import X.C09AY;
import X.C1DUJ;
import X.C1DYZ;
import X.C1ELK;
import X.C1ELL;
import X.C20684815ws;
import X.C2344009Gk;
import com.tiktok.ttm.ttmparam.container.TTMContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public class AwS27S1110000_35 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS27S1110000_35 awS27S1110000_35) {
        C1DUJ c1duj = TTMContainer.Companion;
        long nativeAddress$machine_core_release = ((C1DYZ) awS27S1110000_35.l1).getNativeAddress$machine_core_release();
        String str = awS27S1110000_35.s0;
        boolean z = awS27S1110000_35.z2;
        c1duj.getClass();
        return Boolean.valueOf(TTMContainer.ttmNativePutBoolean(nativeAddress$machine_core_release, str, Integer.MAX_VALUE, z));
    }

    public static final Object invoke$1(AwS27S1110000_35 awS27S1110000_35) {
        C1ELK.LIZJ(awS27S1110000_35.s0, "close", awS27S1110000_35.z2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS27S1110000_35 awS27S1110000_35) {
        C1ELK c1elk = (C1ELK) awS27S1110000_35.l1;
        String str = awS27S1110000_35.s0;
        boolean z = awS27S1110000_35.z2;
        c1elk.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        AbstractC888820Yts.LIZ(c2344009Gk, str);
        c2344009Gk.LJIIIIZZ("copy_type", "notification");
        c2344009Gk.LIZJ(0, "system_status");
        c2344009Gk.LIZJ(z ? 1 : 0, "outer_status");
        c2344009Gk.LIZJ(0, "inner_status");
        C20684815ws.LJIILLIIL("ttsocial_message_request_push_guide_show", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS27S1110000_35 awS27S1110000_35) {
        C1ELL.LIZJ(awS27S1110000_35.s0, "close", awS27S1110000_35.z2);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS27S1110000_35 awS27S1110000_35) {
        C1ELL c1ell = (C1ELL) awS27S1110000_35.l1;
        String str = awS27S1110000_35.s0;
        boolean z = awS27S1110000_35.z2;
        c1ell.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        AbstractC888820Yts.LIZ(c2344009Gk, str);
        c2344009Gk.LJIIIIZZ("copy_type", "push");
        c2344009Gk.LIZJ(0, "system_status");
        c2344009Gk.LIZJ(z ? 1 : 0, "outer_status");
        c2344009Gk.LIZJ(1, "inner_status");
        C20684815ws.LJIILLIIL("ttsocial_message_request_push_guide_show", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS27S1110000_35(C1DYZ c1dyz, String str, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1dyz;
        this.s0 = str;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS27S1110000_35(C1ELK c1elk, String str, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1elk;
        this.s0 = str;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS27S1110000_35(C1ELL c1ell, String str, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1ell;
        this.s0 = str;
        this.z2 = z;
    }
}
