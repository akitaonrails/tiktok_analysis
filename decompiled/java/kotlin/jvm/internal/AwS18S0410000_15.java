package kotlin.jvm.internal;

import X.C09AY;
import X.C1161920gLG;
import X.C19EG;
import X.C588290N5n;
import X.C918650a0t;
import X.C954460awe;
import X.C974060bSG;
import X.C974100bSK;
import X.EnumC919170a1j;
import X.InterfaceC974170bSR;
import Y.AfS34S0210000_15;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.bytedance.android.livesdkapi.host.IHostShare;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AwS18S0410000_15 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

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

    public static final Object invoke$0(AwS18S0410000_15 awS18S0410000_15) {
        C974060bSG c974060bSG = (C974060bSG) awS18S0410000_15.l0;
        InterfaceC974170bSR interfaceC974170bSR = c974060bSG.LIZ;
        if (interfaceC974170bSR != null) {
            interfaceC974170bSR.LIZIZ(new C974100bSK(c974060bSG, (List) awS18S0410000_15.l1, (EnumC919170a1j) awS18S0410000_15.l2, (MultiMatchPrepareResponse) awS18S0410000_15.l3, awS18S0410000_15.z4));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS18S0410000_15 awS18S0410000_15) {
        ((C588290N5n) ((C918650a0t) awS18S0410000_15.l0).LJIIJJI.getValue()).LIZJ.add(Long.valueOf(System.currentTimeMillis()));
        ((IHostShare) C1161920gLG.LIZJ(IHostShare.class)).shareSingleMessageToMultiUser((C19EG) awS18S0410000_15.l1, (List) awS18S0410000_15.l2, ((C918650a0t) awS18S0410000_15.l0).LJII("multi_guest_invite_private_message", awS18S0410000_15.z4), new AfS34S0210000_15((C918650a0t) awS18S0410000_15.l0, (List) awS18S0410000_15.l2, awS18S0410000_15.z4, 5));
        Function0 function0 = (Function0) awS18S0410000_15.l3;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS18S0410000_15(C918650a0t c918650a0t, C19EG c19eg, List list, Function0 function0, int i) {
        super(0);
        this.$t = i;
        this.l0 = c918650a0t;
        this.l1 = c19eg;
        this.l2 = list;
        this.z4 = true;
        this.l3 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS18S0410000_15(C974060bSG c974060bSG, C974060bSG c974060bSG2, List<C954460awe> list, EnumC919170a1j enumC919170a1j, MultiMatchPrepareResponse multiMatchPrepareResponse, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = c974060bSG;
        this.l1 = c974060bSG2;
        this.l2 = list;
        this.l3 = enumC919170a1j;
        this.z4 = multiMatchPrepareResponse;
    }
}
