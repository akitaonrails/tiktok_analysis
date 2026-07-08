package kotlin.jvm.internal;

import X.C034S;
import X.C09AY;
import X.C1120604Zw;
import X.C1AQS;
import X.C925303jX;
import X.C957403oi;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.dependency.apm.ApmDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS0S6300000_1 extends C09AY implements Function1 {
    public final int $t;
    public Object l6;
    public Object l7;
    public Object l8;
    public String s0;
    public String s1;
    public String s2;
    public String s3;
    public String s4;
    public String s5;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S6300000_1 awS0S6300000_1, Object obj) {
        String str;
        IECommerceHostService iECommerceHostService;
        String name;
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        c957403oi.LIZLLL("page_name", "payment_method");
        if (C925303jX.LIZ()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c957403oi.LIZLLL("is_upgrade", str);
        String str2 = awS0S6300000_1.s0;
        if (str2 != null) {
            c957403oi.LIZLLL("pay_request_id", str2);
        }
        Long l = (Long) awS0S6300000_1.l6;
        if (l != null) {
            c957403oi.LIZLLL("pay_order_time", Long.valueOf(l.longValue()));
        }
        String str3 = awS0S6300000_1.s1;
        if (str3 != null) {
            c957403oi.LIZLLL("payment_method_id", str3);
        }
        String str4 = awS0S6300000_1.s2;
        if (str4 != null) {
            c957403oi.LIZLLL("payment_method_name", str4);
        }
        Boolean bool = (Boolean) awS0S6300000_1.l7;
        if (bool != null) {
            c957403oi.LIZLLL("is_create_order", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        String str5 = awS0S6300000_1.s3;
        if (str5 != null) {
            c957403oi.LIZLLL("source_page_type", str5);
        }
        CommuteType commuteType = (CommuteType) awS0S6300000_1.l8;
        if (commuteType != null) {
            c957403oi.LIZLLL("pay_commute_type", commuteType);
        }
        String str6 = awS0S6300000_1.s4;
        if (str6 != null) {
            c957403oi.LIZLLL("err_msg", str6);
        }
        String str7 = awS0S6300000_1.s5;
        if (str7 != null) {
            c957403oi.LIZLLL("code", str7);
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            IApmDependencyService iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin = ApmDependencyService.createIApmDependencyServicebyMonsterPlugin(false);
            if (iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = IApmDependencyService.class.getName();
            if (iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin != null) {
                name = iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            iECommerceHostService = iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApmDependencyService.class);
        }
        c957403oi.LIZLLL("traceparent", ((IApmDependencyService) iECommerceHostService).newTrackingTraceparent());
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S6300000_1 awS0S6300000_1, Object obj) {
        String str;
        IECommerceHostService iECommerceHostService;
        String name;
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        c957403oi.LIZLLL("page_name", "payment_method");
        if (C925303jX.LIZ()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c957403oi.LIZLLL("is_upgrade", str);
        String str2 = awS0S6300000_1.s0;
        if (str2 != null) {
            c957403oi.LIZLLL("pay_request_id", str2);
        }
        Long l = (Long) awS0S6300000_1.l6;
        if (l != null) {
            c957403oi.LIZLLL("pay_order_time", Long.valueOf(l.longValue()));
        }
        String str3 = awS0S6300000_1.s1;
        if (str3 != null) {
            c957403oi.LIZLLL("payment_method_id", str3);
        }
        String str4 = awS0S6300000_1.s2;
        if (str4 != null) {
            c957403oi.LIZLLL("payment_method_name", str4);
        }
        Boolean bool = (Boolean) awS0S6300000_1.l7;
        if (bool != null) {
            c957403oi.LIZLLL("is_create_order", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        String str5 = awS0S6300000_1.s3;
        if (str5 != null) {
            c957403oi.LIZLLL("source_page_type", str5);
        }
        CommuteType commuteType = (CommuteType) awS0S6300000_1.l8;
        if (commuteType != null) {
            c957403oi.LIZLLL("pay_commute_type", commuteType);
        }
        String str6 = awS0S6300000_1.s4;
        if (str6 != null) {
            c957403oi.LIZLLL("err_msg", str6);
        }
        String str7 = awS0S6300000_1.s5;
        if (str7 != null) {
            c957403oi.LIZLLL("code", str7);
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            IApmDependencyService iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin = ApmDependencyService.createIApmDependencyServicebyMonsterPlugin(false);
            if (iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = IApmDependencyService.class.getName();
            if (iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin != null) {
                name = iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            iECommerceHostService = iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApmDependencyService.class);
        }
        c957403oi.LIZLLL("traceparent", ((IApmDependencyService) iECommerceHostService).newTrackingTraceparent());
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS0S6300000_1 awS0S6300000_1, Object obj) {
        String str;
        IECommerceHostService iECommerceHostService;
        String name;
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        c957403oi.LIZLLL("page_name", "payment_method");
        if (C925303jX.LIZ()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c957403oi.LIZLLL("is_upgrade", str);
        String str2 = awS0S6300000_1.s0;
        if (str2 != null) {
            c957403oi.LIZLLL("pay_request_id", str2);
        }
        Long l = (Long) awS0S6300000_1.l6;
        if (l != null) {
            c957403oi.LIZLLL("create_order_time", Long.valueOf(l.longValue()));
        }
        String str3 = awS0S6300000_1.s1;
        if (str3 != null) {
            c957403oi.LIZLLL("payment_method_id", str3);
        }
        String str4 = awS0S6300000_1.s2;
        if (str4 != null) {
            c957403oi.LIZLLL("payment_method_name", str4);
        }
        Boolean bool = (Boolean) awS0S6300000_1.l7;
        if (bool != null) {
            c957403oi.LIZLLL("is_create_order", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        String str5 = awS0S6300000_1.s3;
        if (str5 != null) {
            c957403oi.LIZLLL("source_page_type", str5);
        }
        CommuteType commuteType = (CommuteType) awS0S6300000_1.l8;
        if (commuteType != null) {
            c957403oi.LIZLLL("pay_commute_type", commuteType);
        }
        String str6 = awS0S6300000_1.s4;
        if (str6 != null) {
            c957403oi.LIZLLL("err_msg", str6);
        }
        String str7 = awS0S6300000_1.s5;
        if (str7 != null) {
            c957403oi.LIZLLL("code", str7);
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            IApmDependencyService iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin = ApmDependencyService.createIApmDependencyServicebyMonsterPlugin(false);
            if (iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = IApmDependencyService.class.getName();
            if (iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin != null) {
                name = iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            iECommerceHostService = iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApmDependencyService.class);
        }
        c957403oi.LIZLLL("traceparent", ((IApmDependencyService) iECommerceHostService).newTrackingTraceparent());
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS0S6300000_1 awS0S6300000_1, Object obj) {
        String str;
        IECommerceHostService iECommerceHostService;
        String name;
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        c957403oi.LIZLLL("page_name", "payment_method");
        if (C925303jX.LIZ()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c957403oi.LIZLLL("is_upgrade", str);
        String str2 = awS0S6300000_1.s0;
        if (str2 != null) {
            c957403oi.LIZLLL("pay_request_id", str2);
        }
        Long l = (Long) awS0S6300000_1.l6;
        if (l != null) {
            c957403oi.LIZLLL("create_order_time", Long.valueOf(l.longValue()));
        }
        String str3 = awS0S6300000_1.s1;
        if (str3 != null) {
            c957403oi.LIZLLL("payment_method_id", str3);
        }
        String str4 = awS0S6300000_1.s2;
        if (str4 != null) {
            c957403oi.LIZLLL("payment_method_name", str4);
        }
        Boolean bool = (Boolean) awS0S6300000_1.l7;
        if (bool != null) {
            c957403oi.LIZLLL("is_create_order", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        String str5 = awS0S6300000_1.s3;
        if (str5 != null) {
            c957403oi.LIZLLL("source_page_type", str5);
        }
        CommuteType commuteType = (CommuteType) awS0S6300000_1.l8;
        if (commuteType != null) {
            c957403oi.LIZLLL("pay_commute_type", commuteType);
        }
        String str6 = awS0S6300000_1.s4;
        if (str6 != null) {
            c957403oi.LIZLLL("err_msg", str6);
        }
        String str7 = awS0S6300000_1.s5;
        if (str7 != null) {
            c957403oi.LIZLLL("code", str7);
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            IApmDependencyService iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin = ApmDependencyService.createIApmDependencyServicebyMonsterPlugin(false);
            if (iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = IApmDependencyService.class.getName();
            if (iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin != null) {
                name = iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            iECommerceHostService = iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApmDependencyService.class);
        }
        c957403oi.LIZLLL("traceparent", ((IApmDependencyService) iECommerceHostService).newTrackingTraceparent());
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S6300000_1(String str, Long l, String str2, String str3, Boolean bool, String str4, CommuteType commuteType, String str5, String str6, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l6 = l;
        this.s1 = str2;
        this.s2 = str3;
        this.l7 = bool;
        this.s3 = str4;
        this.l8 = commuteType;
        this.s4 = str5;
        this.s5 = str6;
    }
}
