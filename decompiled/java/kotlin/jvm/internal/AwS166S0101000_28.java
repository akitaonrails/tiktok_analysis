package kotlin.jvm.internal;

import X.AbstractC1868780yjM;
import X.AbstractC1899090zWF;
import X.C09AY;
import X.C1619720sFe;
import X.C1868770yjL;
import X.C1896810zSZ;
import X.C1898700zVc;
import X.C1898870zVt;
import X.C1898980zW4;
import X.C1899450zWp;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1897260zTI;
import com.bytedance.incentive.taskevent.watchvideo.AdWatchVideoTaskTrigger;
import com.bytedance.touchpoint.api.interfaces.INetworkApi;
import com.bytedance.touchpoint.api.model.ReferralFeedBanner;
import com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes29.dex */
public class AwS166S0101000_28 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public Object l0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS166S0101000_28 awS166S0101000_28) {
        Object next;
        List<AdWatchVideoTaskTrigger> list = C1898980zW4.LIZIZ;
        C1896810zSZ c1896810zSZ = (C1896810zSZ) awS166S0101000_28.l0;
        Iterator it2 = ((ArrayList) list).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((AbstractC1899090zWF) next).LL.taskEventKey, c1896810zSZ.LJ)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AdWatchVideoTaskTrigger adWatchVideoTaskTrigger = (AdWatchVideoTaskTrigger) next;
        if (adWatchVideoTaskTrigger != null) {
            C1896810zSZ c1896810zSZ2 = (C1896810zSZ) awS166S0101000_28.l0;
            int i = awS166S0101000_28.i1;
            String str = adWatchVideoTaskTrigger.LL.taskEventKey;
            if (str == null) {
                str = "";
            }
            c1896810zSZ2.LJFF = str;
            if (C1898870zVt.LIZ(c1896810zSZ2, adWatchVideoTaskTrigger.LLILZ)) {
                adWatchVideoTaskTrigger.LJIIZILJ(i);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS166S0101000_28 awS166S0101000_28) {
        super/*X.127h*/.setButtonVariant(awS166S0101000_28.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS166S0101000_28 awS166S0101000_28) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[S1] skip schedule by freq decision reason=");
        sbLIZ.append(((C1868770yjL) ((AbstractC1868780yjM) awS166S0101000_28.l0)).LIZ);
        sbLIZ.append(" unwatched=");
        sbLIZ.append(awS166S0101000_28.i1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS166S0101000_28 awS166S0101000_28) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[S2] skip schedule by freq decision reason=");
        sbLIZ.append(((C1868770yjL) ((AbstractC1868780yjM) awS166S0101000_28.l0)).LIZ);
        sbLIZ.append(" unwatched=");
        sbLIZ.append(awS166S0101000_28.i1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS166S0101000_28 awS166S0101000_28) {
        C1898700zVc c1898700zVc = ((BaseTimerPendantManager) awS166S0101000_28.l0).LLIZ;
        if (c1898700zVc != null) {
            c1898700zVc.setShapeBubbleMaxWidth(awS166S0101000_28.i1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS166S0101000_28 awS166S0101000_28) {
        C1899450zWp.LIZIZ(((C1898700zVc) awS166S0101000_28.l0).getBreathLottieView(), awS166S0101000_28.i1);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS166S0101000_28 awS166S0101000_28) {
        C786410Ut5.LLLLLIL(((C1898700zVc) awS166S0101000_28.l0).getLottieView(), 8);
        C786410Ut5.LLLLLIL(((C1898700zVc) awS166S0101000_28.l0).getBreathLottieView(), 0);
        C1898700zVc c1898700zVc = (C1898700zVc) awS166S0101000_28.l0;
        c1898700zVc.LJIJJLI(c1898700zVc.getBreathLottieView(), new AwS166S0101000_28((C1898700zVc) awS166S0101000_28.l0, awS166S0101000_28.i1, 5));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS166S0101000_28 awS166S0101000_28) {
        INetworkApi iNetworkApiLIZJ;
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null && (iNetworkApiLIZJ = interfaceC1897260zTILIZIZ.LIZJ()) != null) {
            String str = ((ReferralFeedBanner) awS166S0101000_28.l0).notificationId;
            if (str == null) {
                str = "";
            }
            iNetworkApiLIZJ.requestOnNotificationAction(str, awS166S0101000_28.i1, "feed_banner", "", 0, 0, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS166S0101000_28 awS166S0101000_28) {
        INetworkApi iNetworkApiLIZJ;
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null && (iNetworkApiLIZJ = interfaceC1897260zTILIZIZ.LIZJ()) != null) {
            String str = ((ReferralFeedBanner) awS166S0101000_28.l0).notificationId;
            if (str == null) {
                str = "";
            }
            iNetworkApiLIZJ.requestOnNotificationAction(str, awS166S0101000_28.i1, "feed_banner", "", 0, 0, null);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS166S0101000_28(int i, ReferralFeedBanner referralFeedBanner, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = referralFeedBanner;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS166S0101000_28(AbstractC1868780yjM abstractC1868780yjM, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = abstractC1868780yjM;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS166S0101000_28(C1896810zSZ c1896810zSZ, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1896810zSZ;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS166S0101000_28(C1898700zVc c1898700zVc, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1898700zVc;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS166S0101000_28(BaseTimerPendantManager baseTimerPendantManager, BaseTimerPendantManager<Object> baseTimerPendantManager2, int i) {
        super(0);
        this.$t = i;
        this.l0 = baseTimerPendantManager;
        this.i1 = baseTimerPendantManager2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS166S0101000_28(RelationButton relationButton, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = relationButton;
        this.i1 = i;
    }
}
