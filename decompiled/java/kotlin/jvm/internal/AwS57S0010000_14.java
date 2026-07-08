package kotlin.jvm.internal;

import X.C09AY;
import X.C0PEM;
import X.C12859051l;
import X.C1719206oI;
import X.C1ED8;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import X.C876470YZx;
import X.C885830Yp3;
import X.C885840Yp4;
import X.C890900YxE;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.notice.NoticeFeature;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public class AwS57S0010000_14 extends C09AY implements Function0 {
    public final int $t;
    public boolean z0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [T, java.lang.String] */
    public static final Object invoke$0(AwS57S0010000_14 awS57S0010000_14) {
        C885830Yp3.LLJJI = String.valueOf(awS57S0010000_14.z0);
        synchronized (C885830Yp3.LL) {
            if (!C885830Yp3.LLILLL) {
                C259800zU c259800zU = new C259800zU();
                c259800zU.element = "";
                C1ED8.LIZ.getClass();
                if (C1ED8.LIZIZ()) {
                    if (C885830Yp3.LIZIZ("click_inbox_tab_first_time", "first_item_show", "first_dm_item_attach", "conversation_data_reach_exit")) {
                        if (C885830Yp3.LIZIZ("snapshot_data_reach_out_exit")) {
                            Map<String, Long> map = C885830Yp3.LLILLJJLI;
                            Long l = (Long) ((LinkedHashMap) map).get("conversation_data_reach_exit");
                            long jLongValue = 0;
                            if (l != null) {
                                long jLongValue2 = l.longValue();
                                Long l2 = (Long) ((LinkedHashMap) map).get("snapshot_data_reach_out_exit");
                                if (l2 != null) {
                                    jLongValue = l2.longValue();
                                }
                                jLongValue = jLongValue2 - jLongValue;
                            }
                            c259800zU.element = String.valueOf(jLongValue);
                        }
                        C885830Yp3.LLILLL = true;
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C885840Yp4(c259800zU, null), 3);
                    }
                } else if (C885830Yp3.LIZIZ("click_inbox_tab_first_time", "first_item_show", "first_dm_item_attach")) {
                    C885830Yp3.LLILLL = true;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C885840Yp4(c259800zU, null), 3);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS57S0010000_14 awS57S0010000_14) {
        C12859051l.LIZ().storeBoolean("inbox_entrance_stick_to_top", !awS57S0010000_14.z0);
        C876470YZx.LIZ().LJIILIIL(C1719206oI.LIZ);
        return Boolean.TRUE;
    }

    public static final Object invoke$2(AwS57S0010000_14 awS57S0010000_14) {
        return Boolean.valueOf(C890900YxE.LIZ(awS57S0010000_14.z0));
    }

    public static final Object invoke$3(AwS57S0010000_14 awS57S0010000_14) {
        boolean z = awS57S0010000_14.z0;
        NoticeFeature noticeFeatureLIZ = NoticeFeature.LIZ.LIZ();
        boolean z2 = true;
        if (noticeFeatureLIZ == null || !noticeFeatureLIZ.LIZLLL() || z) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S0010000_14(boolean z, int i) {
        super(0);
        this.$t = i;
        this.z0 = z;
    }
}
