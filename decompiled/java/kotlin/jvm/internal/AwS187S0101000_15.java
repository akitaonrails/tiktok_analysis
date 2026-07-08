package kotlin.jvm.internal;

import X.C09AY;
import X.C20441214yg;
import X.C2188811AlT;
import X.C473410IhP;
import X.C501470JlZ;
import X.C501520Jle;
import X.C925410aBn;
import X.C925990aCj;
import X.InterfaceC1631620sYq;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;

/* JADX INFO: loaded from: classes16.dex */
public class AwS187S0101000_15 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS187S0101000_15(C925990aCj c925990aCj, int i, int i2) {
        super(3);
        this.$t = i2;
        this.l0 = c925990aCj;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS187S0101000_15(DataChannel dataChannel, int i, int i2) {
        super(3);
        this.$t = i2;
        this.l0 = dataChannel;
        this.i1 = i;
    }

    public static final Object invoke$0(AwS187S0101000_15 awS187S0101000_15, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        Throwable th = (Throwable) obj3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doJoinDirect onFail code=");
        sbLIZ.append(iIntValue);
        sbLIZ.append(" msg=");
        sbLIZ.append((String) obj2);
        C20441214yg.LIZIZ("MultiGuestSuspendJoinedHelper", C2188811AlT.LIZIZ(sbLIZ));
        if ((th instanceof C501470JlZ) && ((C501520Jle) th).getErrorCode() == 31101) {
            C473410IhP.LIZIZ(new Runnable() { // from class: X.00kV
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MultiGuestSuspendJoinedHelper@aee3.doJoinDirect$joinTask$1$2$1");
                    try {
                        C766270U4b.LIZLLL(2131842763);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MultiGuestSuspendJoinedHelper@aee3.doJoinDirect$joinTask$1$2$1");
                }
            });
        }
        C925410aBn.LIZ((DataChannel) awS187S0101000_15.l0, iIntValue, true, awS187S0101000_15.i1, AFwS203S0000000_15.get$arr$(336));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS187S0101000_15 awS187S0101000_15, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        Throwable th = (Throwable) obj3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("joinDirectly failed code=");
        sbLIZ.append(iIntValue);
        sbLIZ.append(" msg=");
        sbLIZ.append((String) obj2);
        C20441214yg.LJ("MGEnterActionExecutorV2", C2188811AlT.LIZIZ(sbLIZ));
        if ((th instanceof C501470JlZ) && ((C501520Jle) th).getErrorCode() == 31101) {
            C473410IhP.LIZIZ(new Runnable() { // from class: X.00kW
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MultiGuestEnterActionExecutor@2487.joinDirectly$2$1");
                    try {
                        C766270U4b.LIZLLL(2131842763);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MultiGuestEnterActionExecutor@2487.joinDirectly$2$1");
                }
            });
        }
        C925410aBn.LIZ(((C925990aCj) awS187S0101000_15.l0).LIZ, iIntValue, true, awS187S0101000_15.i1, AFwS203S0000000_15.get$arr$(336));
        return Unit.LIZ;
    }
}
