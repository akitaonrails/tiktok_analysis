package kotlin.jvm.internal;

import X.C09AY;
import X.C0BM7;
import X.C0CVL;
import X.C118300cf;
import X.C1904220zeW;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C632670Orh;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.notice.api.bean.EntranceCount;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeCount;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public class AwS144S0101000_4 extends C09AY implements Function0 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS144S0101000_4 awS144S0101000_4) {
        ((Function0) awS144S0101000_4.l0).invoke();
        C632670Orh.LIZ(awS144S0101000_4.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS144S0101000_4 awS144S0101000_4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updatePosition position = ");
        sbLIZ.append(awS144S0101000_4.i1);
        sbLIZ.append(", currentIdx = ");
        sbLIZ.append(((C118300cf) awS144S0101000_4.l0).element);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS144S0101000_4 awS144S0101000_4) {
        int i;
        boolean zLJI = MethodIDManager.LJI(196647);
        boolean zLJI2 = MethodIDManager.LJI(196647);
        List<NoticeCount> items = ((NoticeList) awS144S0101000_4.l0).getItems();
        if (items == null) {
            if (zLJI2) {
                MethodIDManager.LJ();
            }
        } else {
            C1904220zeW c1904220zeW = C1904220zeW.LL;
            List<EntranceCount> entranceCount = ((NoticeList) awS144S0101000_4.l0).getEntranceCount();
            c1904220zeW.getClass();
            C1904220zeW.LJJJJZI(items, entranceCount);
            C0CVL c0cvl = C0CVL.LIZ;
            int i2 = awS144S0101000_4.i1;
            int iLJJJJLI = C1904220zeW.LJJJJLI();
            int iLJJJJL = C1904220zeW.LJJJJL();
            c0cvl.getClass();
            C0CVL.LIZIZ(i2, iLJJJJLI, iLJJJJL);
            Integer numValueOf = Integer.valueOf(C1904220zeW.LJJJJLI());
            int iLJJJJL2 = C1904220zeW.LJJJJL();
            if (numValueOf != null && C0BM7.LIZIZ()) {
                C0CVL.LIZLLL = numValueOf.intValue();
                C0CVL.LJFF = C0CVL.LIZ();
                C0CVL.LJ = iLJJJJL2;
                int iIntValue = numValueOf.intValue();
                int i3 = C0CVL.LIZIZ;
                int i4 = C0CVL.LIZJ;
                C2344009Gk c2344009Gk = new C2344009Gk();
                if (iIntValue == i3) {
                    i = 1;
                } else {
                    i = 0;
                }
                c2344009Gk.LIZJ(i, "is_equal");
                c2344009Gk.LIZJ(iIntValue, "new_count");
                c2344009Gk.LIZJ(i3, "last_count");
                c2344009Gk.LIZJ(iLJJJJL2, "new_conv_count");
                c2344009Gk.LIZJ(i4, "last_conv_count");
                C20684815ws.LJIILLIIL("update_unread_count_from_push", c2344009Gk.LIZ);
                C0CVL.LIZJ(C0CVL.LJFF);
            }
            if (zLJI2) {
                MethodIDManager.LJ();
            }
        }
        Unit unit = Unit.LIZ;
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return unit;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S0101000_4(int i, C118300cf c118300cf, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c118300cf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S0101000_4(int i, Function0 function0, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = function0;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S0101000_4(NoticeList noticeList, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = noticeList;
        this.i1 = i;
    }
}
