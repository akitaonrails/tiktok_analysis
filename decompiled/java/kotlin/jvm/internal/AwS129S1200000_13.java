package kotlin.jvm.internal;

import X.C09AY;
import X.C0VJY;
import X.C0WG5;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0XL0;
import X.C20144713rx;
import X.C2097908Jt;
import X.C213900s5;
import X.C2204961BRm;
import X.C795640VJa;
import X.C799020VWa;
import X.C800820VbE;
import X.C805130ViB;
import X.C814390Vx7;
import X.C820210WFn;
import X.C820250WFr;
import X.C820360WGc;
import X.C820370WGd;
import X.C825920Wac;
import X.InterfaceC800830VbF;
import Y.ARunnableS18S1200000_13;
import android.content.Context;
import android.os.Bundle;
import com.appsflyer.AppsFlyerLib;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.pumbaa.hybrid.external.gateway.impl.HybridExternalGatewayPumbaa6Impl;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class AwS129S1200000_13 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS129S1200000_13 awS129S1200000_13) throws Throwable {
        C2204961BRm.LLJZ(AppsFlyerLib.getInstance(), (Context) awS129S1200000_13.l1, awS129S1200000_13.s0, (Map) awS129S1200000_13.l2, new C0WZX("dzBzEgAjS8/YVFkiQFyQdp1HqHmhUw2mNpb2yZtIDa7H5MsJaIgLZsWOxKufaA==", null));
        return C814390Vx7.LIZ(Unit.LIZ);
    }

    public static final Object invoke$1(AwS129S1200000_13 awS129S1200000_13) {
        return C795640VJa.LIZLLL(awS129S1200000_13.s0, (Map) awS129S1200000_13.l1, ((HybridExternalGatewayPumbaa6Impl) awS129S1200000_13.l2).LIZIZ, new JSONObject(), C0VJY.SPEC_STATUS_RULE_PARSE);
    }

    public static final Object invoke$2(AwS129S1200000_13 awS129S1200000_13) throws Throwable {
        FirebaseAnalytics firebaseAnalytics = ((C0WG5) awS129S1200000_13.l1).LIZ;
        String str = awS129S1200000_13.s0;
        Bundle bundle = (Bundle) awS129S1200000_13.l2;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyQdp1HqHmhUw2mMY/0359FB66bZtQZRElSwVrkXl8Q+gfSDKB5vNaXndutmOfs", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {str, bundle};
        C0WZW c0wzw = new C0WZW(false, "(Ljava/lang/String;Landroid/os/Bundle;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11034, "com/google/firebase/analytics/FirebaseAnalytics", "logEvent", firebaseAnalytics, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11034, "com/google/firebase/analytics/FirebaseAnalytics", "logEvent", null, objArr, firebaseAnalytics, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj = objArr2[0];
                if (obj != null) {
                    firebaseAnalytics = (FirebaseAnalytics) obj;
                }
                Object obj2 = objArr2[1];
                if (obj2 != null) {
                    str = (String) obj2;
                }
                Object obj3 = objArr2[2];
                if (obj3 != null) {
                    bundle = (Bundle) obj3;
                }
            }
            C820210WFn c820210WFn = firebaseAnalytics.LIZ;
            c820210WFn.getClass();
            c820210WFn.LIZIZ(new C820250WFr(c820210WFn, null, str, bundle, false));
            c0wst.LIZ(11034, "com/google/firebase/analytics/FirebaseAnalytics", "logEvent", null, objArr, firebaseAnalytics, c0wzw, true);
        }
        return C814390Vx7.LIZ(Unit.LIZ);
    }

    public static final Object invoke$3(AwS129S1200000_13 awS129S1200000_13) {
        C820360WGc c820360WGc = new C820360WGc();
        c820360WGc.LIZ = "Firebase";
        c820360WGc.LIZIZ = "setUserId";
        c820360WGc.LIZJ = C2097908Jt.LIZJ(new Pair(FollowStatusChangeMethod.PARAM_UID, awS129S1200000_13.s0));
        c820360WGc.LIZ(C825920Wac.LIZ((Cert) awS129S1200000_13.l1));
        return C0XL0.LIZ(new C820370WGd(c820360WGc), new AwS162S1100000_13((C0WG5) awS129S1200000_13.l2, awS129S1200000_13.s0, 7));
    }

    public static final Object invoke$4(AwS129S1200000_13 awS129S1200000_13) {
        C799020VWa.LIZLLL(new C213900s5(awS129S1200000_13.s0, (Function0) awS129S1200000_13.l1, (Function0) awS129S1200000_13.l2));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS129S1200000_13 awS129S1200000_13) {
        C805130ViB.LIZLLL.execute(new ARunnableS18S1200000_13((Map) awS129S1200000_13.l1, (InterfaceC800830VbF) awS129S1200000_13.l2, awS129S1200000_13.s0, 11));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S1200000_13(C800820VbE c800820VbE, Map map, int i) {
        super(0);
        this.$t = i;
        this.l1 = map;
        this.l2 = c800820VbE;
        this.s0 = "js_injection";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S1200000_13(C0WG5 c0wg5, String str, Bundle bundle, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0wg5;
        this.s0 = str;
        this.l2 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS129S1200000_13(Context context, Context context2, String str, Map<String, ? extends Object> map) {
        super(0);
        this.$t = map;
        this.l1 = context;
        this.s0 = context2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S1200000_13(String str, C20144713rx c20144713rx, C0WG5 c0wg5, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c20144713rx;
        this.l2 = c0wg5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS129S1200000_13(String str, String str2, Map<String, String> map, HybridExternalGatewayPumbaa6Impl hybridExternalGatewayPumbaa6Impl) {
        super(0);
        this.$t = hybridExternalGatewayPumbaa6Impl;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS129S1200000_13(String str, String str2, Function0<? extends Map<String, ? extends Object>> function0, Function0<? extends Map<String, ? extends Object>> function02) {
        super(0);
        this.$t = function02;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = function0;
    }
}
