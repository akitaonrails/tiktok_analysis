package kotlin.jvm.internal;

import X.C09AY;
import X.C0VGA;
import X.C0WL6;
import X.C0WLA;
import X.C0XHP;
import X.C0XUD;
import X.C0XWA;
import X.C0XWJ;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C793770VBv;
import X.C807000VlC;
import X.C807110VlN;
import X.C807180VlU;
import X.C807280Vle;
import X.C816050Vzn;
import X.C869610Y9n;
import X.EnumC807060VlI;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.account.oneclicklogin.OneClickLoginService;
import com.ss.android.ugc.aweme.trace.TraceLogConfig;
import com.ss.android.ugc.aweme.trace.TraceLogWrapApiImpl;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class AwS127S1100000_13 extends C09AY implements Function1 {
    public final int $t;
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

    public static final Object invoke$0(AwS127S1100000_13 awS127S1100000_13, Object obj) {
        ((Number) obj).intValue();
        OneClickLoginService oneClickLoginService = (OneClickLoginService) awS127S1100000_13.l1;
        String str = awS127S1100000_13.s0;
        oneClickLoginService.getClass();
        OneClickLoginService.LJIJJLI(str, null, true);
        C0XWA c0xwa = C0XWA.LIZ;
        String str2 = awS127S1100000_13.s0;
        synchronized (c0xwa) {
            Set<String> set = C0XWA.LIZJ;
            set.remove(str2);
            ((Keva) C0XWA.LIZIZ.getValue()).storeStringSet("refresh_key", set);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS127S1100000_13 awS127S1100000_13, Object obj) {
        ((TraceLogWrapApiImpl) awS127S1100000_13.l1).LIZIZ.LIZ(((Number) obj).longValue(), awS127S1100000_13.s0, true);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS127S1100000_13 awS127S1100000_13, Object obj) {
        ((C0WL6) obj).LIZ((C0WLA) awS127S1100000_13.l1, awS127S1100000_13.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS127S1100000_13 awS127S1100000_13, Object obj) {
        List list = (List) awS127S1100000_13.l1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('%');
        sbLIZ.append(C869610Y9n.LJI((String) obj));
        sbLIZ.append('%');
        list.add(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(awS127S1100000_13.s0);
        sbLIZ2.append(" like ? ESCAPE '\\'");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static final Object invoke$4(AwS127S1100000_13 awS127S1100000_13, Object obj) {
        boolean z;
        String str;
        long jLongValue = ((Number) obj).longValue();
        TraceLogConfig traceLogConfigLIZ = C0VGA.LIZ();
        C807000VlC c807000VlC = C807000VlC.LIZ;
        List<String> list = traceLogConfigLIZ.logEventBlacklist;
        String str2 = awS127S1100000_13.s0;
        c807000VlC.getClass();
        if (!C807000VlC.LIZJ(str2, list)) {
            C807110VlN c807110VlN = (C807110VlN) awS127S1100000_13.l1;
            String strLJ = c807110VlN.LIZ;
            if (strLJ.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            JSONObject jSONObject = null;
            if ((!z || ((str = c807110VlN.LIZIZ) != null && (strLJ = C807280Vle.LIZIZ.LJ(str)) != null)) && strLJ.length() != 0) {
                JSONObject jSONObject2 = ((C807110VlN) awS127S1100000_13.l1).LIZJ;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                if (Intrinsics.LJFF(traceLogConfigLIZ.appLogToApmEvent, Boolean.TRUE)) {
                    C793770VBv.LJII(awS127S1100000_13.s0, null, null, jSONObject2);
                }
                boolean zLIZLLL = C0VGA.LIZLLL();
                C807280Vle c807280Vle = C807280Vle.LIZIZ;
                EnumC807060VlI enumC807060VlI = EnumC807060VlI.APPLOG;
                C807180VlU c807180VlU = new C807180VlU(strLJ);
                String str3 = awS127S1100000_13.s0;
                c807180VlU.LIZIZ = Long.valueOf(jLongValue);
                c807180VlU.LJI = str3;
                c807180VlU.LJII = true;
                if (zLIZLLL) {
                    jSONObject = jSONObject2;
                }
                c807180VlU.LIZJ = jSONObject;
                c807180VlU.LIZLLL = C0VGA.LJ();
                c807280Vle.LIZJ(enumC807060VlI, c807180VlU);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS127S1100000_13 awS127S1100000_13, Object obj) {
        C0XUD c0xud = C0XUD.LIZ;
        List listEmptyList = Collections.emptyList();
        C0XHP c0xhp = C0XHP.FAILURE;
        c0xud.getClass();
        C0XUD.LJFF(listEmptyList, c0xhp);
        C0XWJ c0xwj = C0XWJ.LIZ;
        String str = awS127S1100000_13.s0;
        c0xwj.getClass();
        C0XWJ.LIZLLL(str, false);
        String message = ((Throwable) obj).getMessage();
        if (message == null) {
            message = "";
        }
        C0XWJ.LJ(message);
        Function1 function1 = (Function1) awS127S1100000_13.l1;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS127S1100000_13 awS127S1100000_13, Object obj) {
        C0XUD c0xud = C0XUD.LIZ;
        List listEmptyList = Collections.emptyList();
        C0XHP c0xhp = C0XHP.FAILURE;
        c0xud.getClass();
        C0XUD.LJFF(listEmptyList, c0xhp);
        C0XWJ c0xwj = C0XWJ.LIZ;
        String str = awS127S1100000_13.s0;
        c0xwj.getClass();
        C0XWJ.LIZLLL(str, false);
        String message = ((Throwable) obj).getMessage();
        if (message == null) {
            message = "";
        }
        C0XWJ.LJ(message);
        Function1 function1 = (Function1) awS127S1100000_13.l1;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS127S1100000_13 awS127S1100000_13, Object obj) {
        C816050Vzn c816050Vzn = (C816050Vzn) awS127S1100000_13.l1;
        String str = awS127S1100000_13.s0;
        String type = c816050Vzn.LIZ.getType();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", "show");
        c2344009Gk.LJFF("popup_type", (String) obj);
        c2344009Gk.LJFF("enter_from", str);
        c2344009Gk.LJFF("panel_type", type);
        C20684815ws.LJIILLIIL("allow_home_screen_icon_popup", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S1100000_13(C816050Vzn c816050Vzn, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c816050Vzn;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S1100000_13(C0WLA c0wla, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c0wla;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S1100000_13(TraceLogWrapApiImpl traceLogWrapApiImpl, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = traceLogWrapApiImpl;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S1100000_13(String str, C807110VlN c807110VlN, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c807110VlN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S1100000_13(String str, OneClickLoginService oneClickLoginService, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = oneClickLoginService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS127S1100000_13(String str, String str2, Function1<? super Boolean, Unit> function1) {
        super(1);
        this.$t = function1;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS127S1100000_13(List list, List<String> list2, String str) {
        super(1);
        this.$t = str;
        this.l1 = list;
        this.s0 = list2;
    }
}
