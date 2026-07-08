package kotlin.jvm.internal;

import X.C01GW;
import X.C09AY;
import X.C1894700zPA;
import X.C20484080s;
import X.C2178808gE;
import X.C2188811AlT;
import X.C2191701Aq8;
import X.EnumC2178908gF;
import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.api.model.TouchPoint;
import com.bytedance.touchpoint.data.monitor.TouchPointActionRecordUtils;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public class AwS143S0101000_3 extends C09AY implements Function0 {
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

    public static final Object invoke$0(AwS143S0101000_3 awS143S0101000_3) {
        Long l;
        Integer num;
        ArrayList arrayList;
        long jLongValue;
        if (TouchPointActionRecordUtils.LIZ.contains(Integer.valueOf(awS143S0101000_3.i1))) {
            C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
            TouchPoint touchPointLIZJ = C2178808gE.LIZ().LIZJ(awS143S0101000_3.i1, null);
            int iIntValue = 0;
            if (touchPointLIZJ != null && Intrinsics.LJFF(touchPointLIZJ.enableRecord, Boolean.TRUE) && (l = touchPointLIZJ.endTime) != null && l.longValue() > 0 && (num = touchPointLIZJ.launchPlanId) != null && num.intValue() > 0) {
                C01GW c01gw2 = TouchPointActionRecordUtils.LIZIZ;
                String string = ((Keva) c01gw2.getValue()).getString("touch_point_action_list_key", "");
                if (string != null && string.length() != 0) {
                    arrayList = new ArrayList(C20484080s.LIZLLL(TouchPointActionRecordUtils.TouchPointActionRecord[].class, string));
                } else {
                    arrayList = new ArrayList();
                }
                int i = awS143S0101000_3.i1;
                Integer num2 = touchPointLIZJ.launchPlanId;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                }
                int type = ((EnumC2178908gF) awS143S0101000_3.l0).getType();
                long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                Long l2 = touchPointLIZJ.endTime;
                if (l2 != null) {
                    jLongValue = l2.longValue();
                } else {
                    jLongValue = 0;
                }
                arrayList.add(new TouchPointActionRecordUtils.TouchPointActionRecord(i, iIntValue, type, jCurrentTimeMillis, jLongValue));
                ((Keva) c01gw2.getValue()).storeString("touch_point_action_list_key", C20484080s.LIZJ(arrayList));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS143S0101000_3 awS143S0101000_3) {
        ((Function1) awS143S0101000_3.l0).invoke(Integer.valueOf(awS143S0101000_3.i1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS143S0101000_3 awS143S0101000_3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((C2191701Aq8) awS143S0101000_3.l0);
        sbLIZ.append(" run allowed for the ");
        sbLIZ.append(awS143S0101000_3.i1);
        sbLIZ.append(" times...");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S0101000_3(EnumC2178908gF enumC2178908gF, int i) {
        super(0);
        this.$t = i;
        this.i1 = 1;
        this.l0 = enumC2178908gF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S0101000_3(int i, Function1 function1, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = function1;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S0101000_3(C2191701Aq8 c2191701Aq8, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c2191701Aq8;
        this.i1 = i;
    }
}
