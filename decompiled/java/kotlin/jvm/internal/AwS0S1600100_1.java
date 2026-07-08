package kotlin.jvm.internal;

import X.C03O0;
import X.C03O1;
import X.C03YA;
import X.C09AY;
import X.C7879035x;
import X.C834300Wo8;
import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.GooglePayProcess;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public class AwS0S1600100_1 extends C09AY implements Function1 {
    public final int $t;
    public long j7;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S1600100_1 awS0S1600100_1, Object obj) {
        String str;
        PaymentMethodsData paymentMethodsData;
        C834300Wo8 c834300Wo8 = (C834300Wo8) obj;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = (OrderSubmitAssemViewModel) awS0S1600100_1.l1;
        PaymentInfo paymentInfo = (PaymentInfo) awS0S1600100_1.l2;
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - awS0S1600100_1.j7);
        String strValueOf = String.valueOf(c834300Wo8.LIZ.getValue());
        Summary summary = (Summary) awS0S1600100_1.l3;
        BillInfoData billInfoData = ((OrderSubmitAssemViewModel) awS0S1600100_1.l1).LLJJI;
        if (billInfoData != null && (paymentMethodsData = billInfoData.paymentMethods) != null) {
            str = paymentMethodsData.consultationId;
        } else {
            str = null;
        }
        OrderSubmitAssemViewModel.BS2(orderSubmitAssemViewModel, "sdk_done", paymentInfo, lValueOf, strValueOf, summary, str, null, null, null, null, null, null, 16320);
        C03O0.LIZ.getClass();
        long jLJIIIZ = C03O0.LJIIIZ("google_pay");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C03O0.LIZIZ);
        linkedHashMap.put("page_name", "google_pay");
        linkedHashMap.put("stay_time", Long.valueOf(jLJIIIZ));
        linkedHashMap.put("previous_page", "order_submit");
        linkedHashMap.put("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
        C03O0.LLF("tiktokec_stay_page", linkedHashMap);
        OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = (OrderSubmitAssemViewModel) awS0S1600100_1.l1;
        orderSubmitAssemViewModel2.getClass();
        if (c834300Wo8.LIZ == C03YA.Success) {
            JSONArray jSONArray = c834300Wo8.LIZJ;
            if (jSONArray != null) {
                GooglePayProcess googlePayProcess = GooglePayProcess.LIZ;
                PaymentInfo paymentInfo2 = (PaymentInfo) awS0S1600100_1.l2;
                googlePayProcess.getClass();
                PaymentInfo paymentInfoLJII = GooglePayProcess.LJII(paymentInfo2, jSONArray);
                if (paymentInfoLJII != null) {
                    OrderSubmitAssemViewModel orderSubmitAssemViewModel3 = (OrderSubmitAssemViewModel) awS0S1600100_1.l1;
                    Context context = (Context) awS0S1600100_1.l4;
                    Boolean bool = (Boolean) awS0S1600100_1.l5;
                    String str2 = awS0S1600100_1.s0;
                    Integer num = (Integer) awS0S1600100_1.l6;
                    long j = awS0S1600100_1.j7;
                    orderSubmitAssemViewModel3.kT2(paymentInfoLJII, false, false, "google pay process", false, false, false);
                    if (orderSubmitAssemViewModel3.r.LIZJ) {
                        OrderSubmitAssemViewModel.KS2(orderSubmitAssemViewModel3, context, bool);
                    } else {
                        orderSubmitAssemViewModel3.aR2(context, str2, bool, num, Long.valueOf(j));
                    }
                }
            }
        } else {
            GooglePayProcess.LIZ.getClass();
            if (GooglePayProcess.LJFF.contains(c834300Wo8.LIZ)) {
                orderSubmitAssemViewModel2.rT2(C7879035x.LIZ().getResources().getString(2131832528));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S1600100_1 awS0S1600100_1, Object obj) {
        long jElapsedRealtime;
        C834300Wo8 c834300Wo8 = (C834300Wo8) obj;
        C03YA c03ya = c834300Wo8.LIZ;
        C03YA c03ya2 = C03YA.Success;
        if (c03ya != c03ya2) {
            ((MiniOspViewModel) awS0S1600100_1.l1).ZQ2("order_submit", (PaymentInfo) awS0S1600100_1.l2, Long.valueOf(System.currentTimeMillis() - awS0S1600100_1.j7), String.valueOf(c834300Wo8.LIZ.getValue()), (Summary) awS0S1600100_1.l3);
        }
        C03O1 c03o1 = ((MiniOspViewModel) awS0S1600100_1.l1).LLILZLL;
        Long l = (Long) ((LinkedHashMap) c03o1.LJIJJ).get("google_pay");
        if (l != null) {
            long jLongValue = l.longValue();
            c03o1.LJIJJ.remove("google_pay");
            jElapsedRealtime = SystemClock.elapsedRealtime() - jLongValue;
        } else {
            jElapsedRealtime = 0;
        }
        C03O1 c03o12 = ((MiniOspViewModel) awS0S1600100_1.l1).LLILZLL;
        c03o12.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(c03o12.LIZ);
        linkedHashMap.put("page_name", "google_pay");
        linkedHashMap.put("stay_time", Long.valueOf(jElapsedRealtime));
        linkedHashMap.put("previous_page", "mini_order_submit");
        linkedHashMap.put("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
        C03O1.LJJIJIIJIL("tiktokec_stay_page", linkedHashMap);
        MiniOspViewModel miniOspViewModel = (MiniOspViewModel) awS0S1600100_1.l1;
        miniOspViewModel.getClass();
        if (c834300Wo8.LIZ == c03ya2) {
            JSONArray jSONArray = c834300Wo8.LIZJ;
            if (jSONArray != null) {
                GooglePayProcess googlePayProcess = GooglePayProcess.LIZ;
                PaymentInfo paymentInfo = (PaymentInfo) awS0S1600100_1.l2;
                googlePayProcess.getClass();
                PaymentInfo paymentInfoLJII = GooglePayProcess.LJII(paymentInfo, jSONArray);
                if (paymentInfoLJII != null) {
                    MiniOspViewModel miniOspViewModel2 = (MiniOspViewModel) awS0S1600100_1.l1;
                    Context context = (Context) awS0S1600100_1.l4;
                    String str = awS0S1600100_1.s0;
                    Boolean bool = (Boolean) awS0S1600100_1.l5;
                    Integer num = (Integer) awS0S1600100_1.l6;
                    long j = awS0S1600100_1.j7;
                    MiniOspViewModel.kR2(miniOspViewModel2, paymentInfoLJII, false, "google pay process", 6);
                    miniOspViewModel2.FQ2(context, str, bool, num, Long.valueOf(j));
                }
            }
        } else {
            GooglePayProcess.LIZ.getClass();
            if (GooglePayProcess.LJFF.contains(c834300Wo8.LIZ)) {
                miniOspViewModel.setState(new AwS52S1000000_1(C7879035x.LIZ().getResources().getString(2131832528), 28));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S1600100_1(MiniOspViewModel miniOspViewModel, PaymentInfo paymentInfo, long j, Summary summary, Context context, String str, Boolean bool, Integer num, int i) {
        super(1);
        this.$t = i;
        this.l1 = miniOspViewModel;
        this.l2 = paymentInfo;
        this.j7 = j;
        this.l3 = summary;
        this.l4 = context;
        this.s0 = str;
        this.l5 = bool;
        this.l6 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S1600100_1(OrderSubmitAssemViewModel orderSubmitAssemViewModel, PaymentInfo paymentInfo, long j, Summary summary, Context context, Boolean bool, String str, Integer num, int i) {
        super(1);
        this.$t = i;
        this.l1 = orderSubmitAssemViewModel;
        this.l2 = paymentInfo;
        this.j7 = j;
        this.l3 = summary;
        this.l4 = context;
        this.l5 = bool;
        this.s0 = str;
        this.l6 = num;
    }
}
