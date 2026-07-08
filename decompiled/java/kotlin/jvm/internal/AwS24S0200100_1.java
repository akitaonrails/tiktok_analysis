package kotlin.jvm.internal;

import X.AbstractC343940De4;
import X.C03HZ;
import X.C03J9;
import X.C03WD;
import X.C09AY;
import X.C2341109Fh;
import X.C821603Iw;
import X.C821703Ix;
import X.InterfaceC1631620sYq;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS24S0200100_1 extends C09AY implements Function1 {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AwS24S0200100_1 awS24S0200100_1, Object obj) {
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis() - awS24S0200100_1.j2;
        Boolean bool = Boolean.TRUE;
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        PaymentMethod paymentMethod = (PaymentMethod) awS24S0200100_1.l0;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        } else {
            str = null;
        }
        C03WD.LJIIJ(bool, lValueOf, str, "js");
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("requestVenmoElementsAndRiskInfo get callback");
        ((InterfaceC1631620sYq) awS24S0200100_1.l1).invoke(bool, null, obj);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS24S0200100_1 awS24S0200100_1, Object obj) {
        String str;
        int size;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("quit_type", "next");
        if (((C03J9) ((AbstractC343940De4) awS24S0200100_1.l0)).LIZIZ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams.plusAssign("is_edit_logistics", str);
        laneParams.plusAssign("stay_time", Long.valueOf(awS24S0200100_1.j2 - C03HZ.LIZIZ));
        List<C821603Iw> list = ((C821703Ix) awS24S0200100_1.l1).LIZJ;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        laneParams.plusAssign("group_cnt", Integer.valueOf(size));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS24S0200100_1 awS24S0200100_1, Object obj) {
        String str;
        int size;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("quit_type", "next");
        if (((C03J9) ((AbstractC343940De4) awS24S0200100_1.l0)).LIZIZ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams.plusAssign("is_edit_logistics", str);
        laneParams.plusAssign("stay_time", Long.valueOf(awS24S0200100_1.j2 - C03HZ.LIZIZ));
        List<C821603Iw> list = ((C821703Ix) awS24S0200100_1.l1).LIZJ;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        laneParams.plusAssign("group_cnt", Integer.valueOf(size));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AwS24S0200100_1) (LINE:67108867) kotlin.jvm.internal.AwS24S0200100_1.j2 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS24S0200100_1) (LINE:67108869) kotlin.jvm.internal.AwS24S0200100_1.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.internal.AwS24S0200100_1] */
    public AwS24S0200100_1(long j, long j2, PaymentMethod paymentMethod, InterfaceC1631620sYq<? super Boolean, ? super List<PaymentElement>, ? super String, Unit> interfaceC1631620sYq) {
        long j3;
        Object obj;
        c09ay.$t = interfaceC1631620sYq;
        c09ay.j2 = j3;
        c09ay.l0 = obj;
        c09ay.l1 = paymentMethod;
        ?? c09ay = new C09AY(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS24S0200100_1(AbstractC343940De4 abstractC343940De4, long j, C821703Ix c821703Ix, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC343940De4;
        this.j2 = j;
        this.l1 = c821703Ix;
    }
}
