package kotlin.jvm.internal;

import X.AbstractC1522730pjD;
import X.C013C;
import X.C09AY;
import X.C1487910op3;
import X.C1507770pL5;
import X.C1523320pkA;
import X.C1523700pkm;
import X.C1523770pkt;
import X.C1523780pku;
import X.C1526710ppd;
import X.C1527670prB;
import X.C1527890prX;
import X.C1532710pzJ;
import X.C1533490q0Z;
import X.C1533500q0a;
import X.C1533790q13;
import X.C1534750q2b;
import X.C1535250q3P;
import X.C2097608Jq;
import X.C2188811AlT;
import X.InterfaceC1541990qEH;
import X.InterfaceC1553650qX5;
import Y.ACallableS71S1100000_23;
import android.util.Log;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.sparkpreload.ECSparkPreloadConfigItem;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes24.dex */
public class AwS172S1100000_23 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
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
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS172S1100000_23 awS172S1100000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("waitGeckoUpdate=");
        sbLIZ.append(((C1532710pzJ) awS172S1100000_23.l1).LJIJJLI);
        sbLIZ.append(", channel=");
        sbLIZ.append(awS172S1100000_23.s0);
        return new C1534750q2b("GeckoUpdateProvider", "onUpdateSuccess", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    public static final Object invoke$1(AwS172S1100000_23 awS172S1100000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sea_pdp_action_manager, action not found, name=");
        sbLIZ.append(awS172S1100000_23.s0);
        sbLIZ.append(", lifecycle.currentState=");
        sbLIZ.append(((C1487910op3) awS172S1100000_23.l1).LIZJ.getCurrentState());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$10(AwS172S1100000_23 awS172S1100000_23) {
        try {
            return (Boolean) ((C1527670prB) awS172S1100000_23.l1).LJLIL().runInTransaction(new ACallableS71S1100000_23((C1527670prB) awS172S1100000_23.l1, awS172S1100000_23.s0, 0));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ((C1527670prB) awS172S1100000_23.l1).getClass();
            C1527890prX.LIZIZ(Intrinsics.LJIIJJI(Log.getStackTraceString(e), "[DBServiceImplV4] "));
            C1526710ppd.LIZJ().ensureNotReachHere(e, Intrinsics.LJIIJJI(awS172S1100000_23.s0, "error when delete "));
            return Boolean.FALSE;
        }
    }

    public static final Object invoke$11(AwS172S1100000_23 awS172S1100000_23) {
        return new C1535250q3P("ResourceGroup", "executeFetchTaskAsync", "request reused in executeFetchTaskAsync", C2097608Jq.LJIIIIZZ(new Pair("url", awS172S1100000_23.s0), new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(((C1533790q13) awS172S1100000_23.l1).LIZIZ)), new Pair(Scene.SCENE_SERVICE, ((C1533790q13) awS172S1100000_23.l1).LIZ.LJJJ.toString()), new Pair("image", String.valueOf(((C1533790q13) awS172S1100000_23.l1).LJFF()))), null, true, null, 80);
    }

    public static final Object invoke$2(AwS172S1100000_23 awS172S1100000_23) {
        return new C1535250q3P("ForestFacade", "fetchResourceAsync", "request reused in fetchResourceAsync", C2097608Jq.LJIIIIZZ(new Pair("url", awS172S1100000_23.s0), new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(((C1533790q13) awS172S1100000_23.l1).LIZIZ)), new Pair(Scene.SCENE_SERVICE, ((C1533790q13) awS172S1100000_23.l1).LIZ.LJJJ.toString()), new Pair("image", String.valueOf(((C1533790q13) awS172S1100000_23.l1).LJFF()))), null, true, null, 80);
    }

    public static final Object invoke$3(AwS172S1100000_23 awS172S1100000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resource: ");
        sbLIZ.append(((C1533490q0Z) awS172S1100000_23.l1).LJJJJIZL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        HashMap<String, Object> mapLIZIZ = C1533500q0a.LIZIZ(((C1533490q0Z) awS172S1100000_23.l1).LJJJJLI);
        mapLIZIZ.put("gecko_access_key", awS172S1100000_23.s0);
        return new C1535250q3P("GeckoFetcher", "fetch", strLIZIZ, mapLIZIZ, null, false, null, 112);
    }

    public static final Object invoke$4(AwS172S1100000_23 awS172S1100000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadCallback#onLoadStart bind view and key, key: ");
        sbLIZ.append(awS172S1100000_23.s0);
        sbLIZ.append(", view: ");
        sbLIZ.append((InterfaceC1541990qEH) awS172S1100000_23.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS172S1100000_23 awS172S1100000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on data ready#key: ");
        sbLIZ.append(awS172S1100000_23.s0);
        sbLIZ.append(",data:");
        C1523320pkA c1523320pkA = C1523320pkA.LL;
        C1507770pL5 c1507770pL5 = (C1507770pL5) awS172S1100000_23.l1;
        c1523320pkA.getClass();
        sbLIZ.append(C1523320pkA.LIZIZ(c1507770pL5));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(AwS172S1100000_23 awS172S1100000_23) {
        Map params = ((InterfaceC1553650qX5) awS172S1100000_23.l1).getParams();
        if (params == null) {
            params = C2097608Jq.LJ();
        }
        return C2097608Jq.LJIILIIL(params, new Pair("origin_event_name", awS172S1100000_23.s0));
    }

    public static final Object invoke$7(AwS172S1100000_23 awS172S1100000_23) {
        return new C1535250q3P("HTTPResponseProvider", "handleValidateResponse", "cache is valid", C2097608Jq.LJIIIIZZ(new Pair("url", awS172S1100000_23.s0), new Pair("headers", String.valueOf(((AbstractC1522730pjD) awS172S1100000_23.l1).LIZIZ))), null, false, null, 112);
    }

    public static final Object invoke$8(AwS172S1100000_23 awS172S1100000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageRetreatAwake from: ");
        sbLIZ.append(awS172S1100000_23.s0);
        sbLIZ.append(" execute tasks, size: ");
        sbLIZ.append(((LinkedList) awS172S1100000_23.l1).size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$9(AwS172S1100000_23 awS172S1100000_23) {
        CopyOnWriteArrayList<ECSparkPreloadConfigItem> copyOnWriteArrayList = C1523700pkm.LIZLLL.get(awS172S1100000_23.s0);
        if (copyOnWriteArrayList != null) {
            C013C c013c = (C013C) awS172S1100000_23.l1;
            String str = awS172S1100000_23.s0;
            for (ECSparkPreloadConfigItem eCSparkPreloadConfigItem : copyOnWriteArrayList) {
                c013c.element = true;
                C1523770pkt.LIZ.LIZ(eCSparkPreloadConfigItem, new C1523780pku("", str));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS172S1100000_23(C1527670prB c1527670prB, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1527670prB;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS172S1100000_23(C1532710pzJ c1532710pzJ, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1532710pzJ;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS172S1100000_23(C1533490q0Z c1533490q0Z, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1533490q0Z;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS172S1100000_23(InterfaceC1541990qEH interfaceC1541990qEH, String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = interfaceC1541990qEH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS172S1100000_23(InterfaceC1553650qX5 interfaceC1553650qX5, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = interfaceC1553650qX5;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS172S1100000_23(String str, C013C c013c, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS172S1100000_23(String str, C1487910op3 c1487910op3, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1487910op3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS172S1100000_23(String str, C1507770pL5 c1507770pL5, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1507770pL5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS172S1100000_23(String str, AbstractC1522730pjD abstractC1522730pjD, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = abstractC1522730pjD;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS172S1100000_23(String str, C1533790q13 c1533790q13, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1533790q13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS172S1100000_23(String str, String str2, LinkedList<Runnable> linkedList) {
        super(0);
        this.$t = linkedList;
        this.s0 = str;
        this.l1 = str2;
    }
}
