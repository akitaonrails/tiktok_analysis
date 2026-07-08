package kotlin.jvm.internal;

import X.C09AY;
import X.C14LC;
import X.C418440Gaw;
import X.C706880Ro6;
import X.C814420VxA;
import X.C823050WQl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AwS21S0002000_11 extends C09AY implements Function0 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f971i0;
    public int i1;

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

    public static final Object invoke$0(AwS21S0002000_11 awS21S0002000_11) {
        if (C706880Ro6.LIZ()) {
            final int i = awS21S0002000_11.f971i0;
            final int i2 = awS21S0002000_11.i1;
            try {
                C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0SCB
                    public final void LIZ() {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("card_type", Integer.valueOf(i));
                        linkedHashMap.put("feed_count", Integer.valueOf(i2));
                        C207196165y.LIZ.getClass();
                        linkedHashMap.put("not_display_request_item_count", Integer.valueOf(C207196165y.LIZ()));
                        C1768000w6o.LIZ.getClass();
                        C1768000w6o.LIZIZ("rd_tiktokec_special_shaped_card_client_register_biz_card", linkedHashMap);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("FeedEcCardLogger@28fe.trackClientRegisterBizCard$1$invoke$$inlined$runOnWorkerThread$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("FeedEcCardLogger@28fe.trackClientRegisterBizCard$1$invoke$$inlined$runOnWorkerThread$1");
                    }
                });
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS21S0002000_11 awS21S0002000_11) {
        return Integer.valueOf(((awS21S0002000_11.f971i0 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(59))) - C14LC.LJIILL) + awS21S0002000_11.i1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S0002000_11(int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.f971i0 = i;
        this.i1 = i2;
    }
}
