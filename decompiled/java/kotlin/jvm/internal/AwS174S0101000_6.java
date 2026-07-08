package kotlin.jvm.internal;

import X.C09AY;
import X.C1675730thz;
import X.C1684530twB;
import X.C341440Da2;
import X.C424040Gjy;
import X.C439660HLw;
import X.C444390Hbh;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC439650HLv;
import Y.ARunnableS0S0203000_6;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.account.risk.notification.RiskNotificationActivity;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselInnerIndicatorAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o0.k;

/* JADX INFO: loaded from: classes7.dex */
public class AwS174S0101000_6 extends C09AY implements Function2 {
    public final int $t;
    public int i1;
    public Object l0;

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
            case 6:
                return invoke$6(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS174S0101000_6(int i, Function0 function0, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = function0;
        this.i1 = i;
    }

    public static final Object invoke$0(AwS174S0101000_6 awS174S0101000_6, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((RiskNotificationActivity) awS174S0101000_6.l0).LLLLZI((InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS174S0101000_6.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS174S0101000_6 awS174S0101000_6, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C444390Hbh.LIZ((Function0) awS174S0101000_6.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS174S0101000_6.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS174S0101000_6 awS174S0101000_6, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C444390Hbh.LIZJ((InterfaceC439650HLv) awS174S0101000_6.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS174S0101000_6.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS174S0101000_6 awS174S0101000_6, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1684530twB.LIZ((C439660HLw) awS174S0101000_6.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS174S0101000_6.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS174S0101000_6 awS174S0101000_6, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1675730thz.LJFF((Function0) awS174S0101000_6.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS174S0101000_6.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS174S0101000_6 awS174S0101000_6, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        k.LIZ((InterfaceC1685750ty9) awS174S0101000_6.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS174S0101000_6.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS174S0101000_6 awS174S0101000_6, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        PdpCarouselInnerIndicatorAssem pdpCarouselInnerIndicatorAssem = (PdpCarouselInnerIndicatorAssem) awS174S0101000_6.l0;
        int i = awS174S0101000_6.i1;
        C424040Gjy c424040Gjy = pdpCarouselInnerIndicatorAssem.LLJL;
        if (c424040Gjy != null) {
            HandlerHook.viewPost(c424040Gjy, new ARunnableS0S0203000_6(c424040Gjy, pdpCarouselInnerIndicatorAssem, i, iIntValue, iIntValue2, 1));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS174S0101000_6(InterfaceC439650HLv interfaceC439650HLv, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = interfaceC439650HLv;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS174S0101000_6(C439660HLw c439660HLw, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c439660HLw;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS174S0101000_6(InterfaceC1685750ty9 interfaceC1685750ty9, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = interfaceC1685750ty9;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS174S0101000_6(RiskNotificationActivity riskNotificationActivity, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = riskNotificationActivity;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS174S0101000_6(PdpCarouselInnerIndicatorAssem pdpCarouselInnerIndicatorAssem, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = pdpCarouselInnerIndicatorAssem;
        this.i1 = i;
    }
}
