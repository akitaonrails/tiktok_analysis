package kotlin.jvm.internal;

import X.AbstractC1446660nkW;
import X.AbstractC556190Lrd;
import X.C09AY;
import X.C0Y8T;
import X.C11XV;
import X.C13LP;
import X.C1421670n6D;
import X.C1DWA;
import X.C21311718ah;
import X.C2188811AlT;
import X.C2260521Ddq;
import X.C2280651EOp;
import X.C2280661EOq;
import X.C259800zU;
import X.C449420Hjo;
import X.C556300Lro;
import X.EnumC2255581DQe;
import X.InterfaceC2260541Dds;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.InstanceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.im.common.model.GroupLayoutPopupInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public class AwS161S0400000_35 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS161S0400000_35 awS161S0400000_35) {
        String str;
        GroupLayoutPopupInfo groupLayoutPopupInfo = (GroupLayoutPopupInfo) ((C259800zU) awS161S0400000_35.l0).element;
        if (groupLayoutPopupInfo != null && (str = groupLayoutPopupInfo.scheme) != null && str.length() > 0) {
            C1DWA c1dwa = (C1DWA) awS161S0400000_35.l1;
            C0Y8T c0y8t = (C0Y8T) awS161S0400000_35.l2;
            EnumC2255581DQe enumC2255581DQe = (EnumC2255581DQe) awS161S0400000_35.l3;
            SmartRouter.buildRoute(c1dwa.getContext(), str).open();
            C21311718ah.LIZJ("click_group_leave_status_banner", c0y8t.getConversationId(), enumC2255581DQe.getValue());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS161S0400000_35 awS161S0400000_35) {
        AbstractC1446660nkW abstractC1446660nkWLJI = ((C2280661EOq) awS161S0400000_35.l0).LJI();
        if (abstractC1446660nkWLJI != null) {
            abstractC1446660nkWLJI.LIZLLL(awS161S0400000_35.l1, (C556300Lro) awS161S0400000_35.l2, (AbstractC556190Lrd) awS161S0400000_35.l3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS161S0400000_35 awS161S0400000_35) {
        AbstractC1446660nkW abstractC1446660nkWLJI = ((C2280661EOq) awS161S0400000_35.l0).LJI();
        if (abstractC1446660nkWLJI != null) {
            abstractC1446660nkWLJI.LIZIZ((C556300Lro) awS161S0400000_35.l2, awS161S0400000_35.l1, awS161S0400000_35.l3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS161S0400000_35 awS161S0400000_35) {
        AbstractC1446660nkW abstractC1446660nkW = ((C2280651EOp) awS161S0400000_35.l0).LJ;
        if (abstractC1446660nkW != null) {
            abstractC1446660nkW.LIZLLL(awS161S0400000_35.l1, (C556300Lro) awS161S0400000_35.l2, (AbstractC556190Lrd) awS161S0400000_35.l3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS161S0400000_35 awS161S0400000_35) {
        AbstractC1446660nkW abstractC1446660nkW = ((C2280651EOp) awS161S0400000_35.l0).LJ;
        if (abstractC1446660nkW != null) {
            abstractC1446660nkW.LIZIZ((C556300Lro) awS161S0400000_35.l2, awS161S0400000_35.l1, awS161S0400000_35.l3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS161S0400000_35 awS161S0400000_35) {
        InstanceInfo instanceInfo;
        String instanceKey;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String voucherTypeID = ((Voucher) awS161S0400000_35.l0).getVoucherTypeID();
        String str = "";
        if (voucherTypeID == null) {
            voucherTypeID = "";
        }
        sbLIZ.append(voucherTypeID);
        List<InstanceInfo> instanceInfoList = ((Voucher) awS161S0400000_35.l0).getInstanceInfoList();
        if (instanceInfoList != null && (instanceInfo = (InstanceInfo) C13LP.LJJJLL(instanceInfoList)) != null && (instanceKey = instanceInfo.getInstanceKey()) != null) {
            str = instanceKey;
        }
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Voucher voucher = (Voucher) awS161S0400000_35.l0;
        if (strLIZIZ.length() == 0) {
            strLIZIZ = String.valueOf(voucher.hashCode());
        }
        C1421670n6D.LIZIZ((C449420Hjo) awS161S0400000_35.l1, new AwS87S1000000_2(strLIZIZ, 49), new AwS244S0300000_35((InterfaceC2260541Dds) awS161S0400000_35.l2, (Voucher) awS161S0400000_35.l0, (C11XV) awS161S0400000_35.l3, 12));
        C1421670n6D.LIZIZ(((C449420Hjo) awS161S0400000_35.l1).getStatusButtonView(), new AwS87S1000000_2(strLIZIZ, 50), new AwS244S0300000_35((InterfaceC2260541Dds) awS161S0400000_35.l2, (Voucher) awS161S0400000_35.l0, (C11XV) awS161S0400000_35.l3, 13));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS161S0400000_35(C259800zU c259800zU, C259800zU<GroupLayoutPopupInfo> c259800zU2, C1DWA c1dwa, C0Y8T c0y8t, EnumC2255581DQe enumC2255581DQe) {
        super(0);
        this.$t = enumC2255581DQe;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c1dwa;
        this.l3 = c0y8t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS161S0400000_35(C2280651EOp c2280651EOp, Object obj, C556300Lro c556300Lro, AbstractC556190Lrd abstractC556190Lrd, int i) {
        super(0);
        this.$t = i;
        this.l0 = c2280651EOp;
        this.l1 = obj;
        this.l2 = c556300Lro;
        this.l3 = abstractC556190Lrd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS161S0400000_35(C2280651EOp c2280651EOp, Object obj, C556300Lro c556300Lro, Object obj2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c2280651EOp;
        this.l1 = obj;
        this.l2 = c556300Lro;
        this.l3 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS161S0400000_35(C2280661EOq c2280661EOq, Object obj, C556300Lro c556300Lro, AbstractC556190Lrd abstractC556190Lrd, int i) {
        super(0);
        this.$t = i;
        this.l0 = c2280661EOq;
        this.l1 = obj;
        this.l2 = c556300Lro;
        this.l3 = abstractC556190Lrd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS161S0400000_35(C2280661EOq c2280661EOq, Object obj, C556300Lro c556300Lro, Object obj2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c2280661EOq;
        this.l1 = obj;
        this.l2 = c556300Lro;
        this.l3 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS161S0400000_35(Voucher voucher, C449420Hjo c449420Hjo, C2260521Ddq c2260521Ddq, C11XV c11xv, int i) {
        super(0);
        this.$t = i;
        this.l0 = voucher;
        this.l1 = c449420Hjo;
        this.l2 = c2260521Ddq;
        this.l3 = c11xv;
    }
}
