package kotlin.jvm.internal;

import X.AbstractC20356314kz;
import X.C09AY;
import X.C20361314ln;
import X.C20377014oK;
import X.C20377814oS;
import X.C20379114of;
import X.C20441214yg;
import X.C2188811AlT;
import X.InterfaceC20356214ky;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes32.dex */
public class AwS49S0200100_31 extends C09AY implements Function0 {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS49S0200100_31 awS49S0200100_31) {
        AbstractC20356314kz abstractC20356314kz = (AbstractC20356314kz) awS49S0200100_31.l0;
        CopyOnWriteArraySet<InterfaceC20356214ky> copyOnWriteArraySet = abstractC20356314kz.LLILLJJLI;
        C20361314ln c20361314ln = (C20361314ln) awS49S0200100_31.l1;
        long j = awS49S0200100_31.j2;
        for (InterfaceC20356214ky interfaceC20356214ky : copyOnWriteArraySet) {
            String str = abstractC20356314kz.LJJJIL().LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invokeUIConfigListener, uiConfig=");
            sbLIZ.append(c20361314ln);
            sbLIZ.append(", stateId=");
            sbLIZ.append(j);
            C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            interfaceC20356214ky.LIZ(c20361314ln, j);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS49S0200100_31 awS49S0200100_31) {
        ((C20377014oK) awS49S0200100_31.l0).LIZJ((C20361314ln) awS49S0200100_31.l1, awS49S0200100_31.j2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS49S0200100_31 awS49S0200100_31) {
        C20379114of c20379114of = ((C20377814oS) awS49S0200100_31.l0).LJ;
        if (c20379114of != null && PlaybookUtilKt.LJJIJIIJIL(c20379114of, awS49S0200100_31.j2, (C20361314ln) awS49S0200100_31.l1)) {
            ((C20377814oS) awS49S0200100_31.l0).LIZIZ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS49S0200100_31(AbstractC20356314kz abstractC20356314kz, C20361314ln c20361314ln, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC20356314kz;
        this.l1 = c20361314ln;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS49S0200100_31(C20377014oK c20377014oK, C20361314ln c20361314ln, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c20377014oK;
        this.l1 = c20361314ln;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS49S0200100_31(C20377814oS c20377814oS, long j, C20361314ln c20361314ln, int i) {
        super(0);
        this.$t = i;
        this.l0 = c20377814oS;
        this.j2 = j;
        this.l1 = c20361314ln;
    }
}
