package kotlin.jvm.internal;

import X.C09AY;
import X.C2327809Ae;
import X.C897703f5;
import X.C907803gi;
import X.C957403oi;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS18S1100100_1 extends C09AY implements Function1 {
    public final int $t;
    public long j2;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS18S1100100_1 awS18S1100100_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("quit_type", awS18S1100100_1.s0);
        laneParams.plusAssign("stay_time", Long.valueOf(awS18S1100100_1.j2));
        laneParams.putAll((HashMap) awS18S1100100_1.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS18S1100100_1 awS18S1100100_1, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        Map<String, Object> map = ((C897703f5) awS18S1100100_1.l1).LJII;
        c957403oi.getClass();
        ((HashMap) c957403oi.LIZ).putAll(map);
        C907803gi c907803gi = C907803gi.LIZ;
        String str = awS18S1100100_1.s0;
        c907803gi.getClass();
        c957403oi.LIZJ("page_name", C907803gi.LJJJJZ(str));
        c957403oi.LIZJ("duration", Long.valueOf(SystemClock.elapsedRealtime() - awS18S1100100_1.j2));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS18S1100100_1 awS18S1100100_1, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        Map<String, Object> map = ((C897703f5) awS18S1100100_1.l1).LJII;
        c957403oi.getClass();
        ((HashMap) c957403oi.LIZ).putAll(map);
        C907803gi c907803gi = C907803gi.LIZ;
        String str = awS18S1100100_1.s0;
        c907803gi.getClass();
        c957403oi.LIZJ("page_name", C907803gi.LJJJJZ(str));
        c957403oi.LIZJ("duration", Long.valueOf(SystemClock.elapsedRealtime() - awS18S1100100_1.j2));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS18S1100100_1 awS18S1100100_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.putAll((HashMap) awS18S1100100_1.l1);
        laneParams.plusAssign("quit_type", awS18S1100100_1.s0);
        laneParams.plusAssign("stay_time", Long.valueOf(awS18S1100100_1.j2));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS18S1100100_1 awS18S1100100_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("quit_type", awS18S1100100_1.s0);
        laneParams.plusAssign("stay_time", Long.valueOf(SystemClock.elapsedRealtime() - awS18S1100100_1.j2));
        laneParams.plusAssign("previous_page", "order_submit");
        laneParams.plusAssign("page_name", "free_return_via_drop_off");
        laneParams.putAll((HashMap) awS18S1100100_1.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS18S1100100_1 awS18S1100100_1, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LIZLLL("position", awS18S1100100_1.s0);
        c957403oi.LIZLLL("duration", Long.valueOf(awS18S1100100_1.j2));
        Map<String, ? extends Object> map = (Map) awS18S1100100_1.l1;
        if (map != null) {
            c957403oi.LJ(map);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS18S1100100_1 awS18S1100100_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("quit_type", awS18S1100100_1.s0);
        laneParams.plusAssign("stay_time", Long.valueOf(SystemClock.elapsedRealtime() - awS18S1100100_1.j2));
        laneParams.plusAssign("page_name", "order_submit");
        laneParams.putAll((HashMap) awS18S1100100_1.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS18S1100100_1 awS18S1100100_1, Object obj) {
        Float fLJIIIIZZ;
        String priceVal;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("actionsheet_name", awS18S1100100_1.s0);
        Price price = ((LogisticDTO) awS18S1100100_1.l1).shippingFee;
        String currency = null;
        if (price != null && (priceVal = price.getPriceVal()) != null) {
            fLJIIIIZZ = C2327809Ae.LJIIIIZZ(priceVal);
        } else {
            fLJIIIIZZ = null;
        }
        laneParams.plusAssign("shipping_price", fLJIIIIZZ);
        Price price2 = ((LogisticDTO) awS18S1100100_1.l1).shippingFee;
        if (price2 != null) {
            currency = price2.getCurrency();
        }
        laneParams.plusAssign("shipping_currency", currency);
        laneParams.plusAssign("stay_time", Long.valueOf(awS18S1100100_1.j2));
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS18S1100100_1(long r3, java.lang.String r5, java.util.HashMap r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            switch(r7) {
                case 0: goto L11;
                case 1: goto L5;
                case 2: goto L5;
                case 3: goto L5;
                case 4: goto L11;
                case 5: goto L5;
                case 6: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r6
            r1.s0 = r5
            r1.j2 = r3
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.s0 = r5
            r1.j2 = r3
            r1.l1 = r6
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS18S1100100_1.<init>(long, java.lang.String, java.util.HashMap, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS18S1100100_1(long j, LogisticDTO logisticDTO, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = logisticDTO;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS18S1100100_1(long j, String str, Map map, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.j2 = j;
        this.l1 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS18S1100100_1(C897703f5 c897703f5, String str, long j, int i) {
        super(1);
        this.$t = i;
        this.l1 = c897703f5;
        this.s0 = str;
        this.j2 = j;
    }
}
