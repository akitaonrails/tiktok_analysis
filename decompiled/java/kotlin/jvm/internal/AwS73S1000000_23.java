package kotlin.jvm.internal;

import X.AbstractC1532350pyj;
import X.C09AY;
import X.C1326620kcu;
import X.C1491290ouV;
import X.C1507980pLQ;
import X.C1523770pkt;
import X.C1529600puI;
import X.C1532310pyf;
import X.C1532710pzJ;
import X.C1535980q4a;
import X.C1536070q4j;
import X.C1550580qS8;
import X.C1550720qSM;
import X.C2188811AlT;
import X.InterfaceC1532190pyT;
import com.lynx.tasm.TemplateBundle;
import com.ss.android.ugc.aweme.legoImp.HybridInfoColdBootTask;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class AwS73S1000000_23 extends C09AY implements Function1 {
    public final int $t;
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
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS73S1000000_23(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS73S1000000_23 awS73S1000000_23, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resolveSource yielded null, fallback to original src=");
        sbLIZ.append(awS73S1000000_23.s0);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS73S1000000_23 awS73S1000000_23, Object obj) {
        ((C1550720qSM) obj).LIZLLL = awS73S1000000_23.s0;
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS73S1000000_23 awS73S1000000_23, Object obj) {
        AtomicInteger atomicIntegerPutIfAbsent;
        C1523770pkt c1523770pkt = C1523770pkt.LIZ;
        String str = awS73S1000000_23.s0;
        c1523770pkt.getClass();
        ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = C1523770pkt.LIZIZ;
        AtomicInteger atomicInteger = concurrentHashMap.get(str);
        if (atomicInteger == null && (atomicIntegerPutIfAbsent = concurrentHashMap.putIfAbsent(str, (atomicInteger = new AtomicInteger(0)))) != null) {
            atomicInteger = atomicIntegerPutIfAbsent;
        }
        AtomicInteger atomicInteger2 = atomicInteger;
        while (true) {
            int i = atomicInteger2.get();
            if (i <= 0) {
                new AtomicInteger(0);
                break;
            }
            int i2 = i - 1;
            if (atomicInteger2.compareAndSet(i, i2)) {
                new AtomicInteger(i2);
                break;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS73S1000000_23 awS73S1000000_23, Object obj) {
        C1529600puI.LIZ.getClass();
        ((ConcurrentHashMap) C1529600puI.LIZJ.getValue()).remove(awS73S1000000_23.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS73S1000000_23 awS73S1000000_23, Object obj) throws JSONException {
        ((JSONObject) obj).put("path", awS73S1000000_23.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS73S1000000_23 awS73S1000000_23, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(C1326620kcu.LIZ(((C1507980pLQ) obj).LIZ.LJIIIZ), awS73S1000000_23.s0));
    }

    public static final Object invoke$2(AwS73S1000000_23 awS73S1000000_23, Object obj) {
        C1550720qSM c1550720qSM = (C1550720qSM) obj;
        c1550720qSM.LIZIZ = false;
        c1550720qSM.LIZLLL = awS73S1000000_23.s0;
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS73S1000000_23 awS73S1000000_23, Object obj) {
        ((C1550720qSM) obj).LIZLLL = awS73S1000000_23.s0;
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS73S1000000_23 awS73S1000000_23, Object obj) {
        C1550580qS8 c1550580qS8 = (C1550580qS8) obj;
        String str = c1550580qS8.LIZ;
        String str2 = c1550580qS8.LIZLLL;
        if (str2 == null) {
            str2 = awS73S1000000_23.s0;
        }
        return new Pair(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$5(AwS73S1000000_23 awS73S1000000_23, Object obj) {
        AbstractC1532350pyj abstractC1532350pyjLJIIL;
        TemplateBundle templateBundle;
        C1532310pyf c1532310pyf = (C1532310pyf) obj;
        if (c1532310pyf.isSuccess()) {
            C1535980q4a c1535980q4a = C1535980q4a.LIZ;
            String str = awS73S1000000_23.s0;
            C1532710pzJ c1532710pzJ = c1532310pyf.LIZ;
            InterfaceC1532190pyT interfaceC1532190pyT = c1532310pyf.LJII;
            c1535980q4a.getClass();
            C1536070q4j c1536070q4jLIZ = C1535980q4a.LIZ(str, c1532710pzJ, interfaceC1532190pyT, null);
            if ((c1536070q4jLIZ == null || !c1536070q4jLIZ.isSuccess()) && (abstractC1532350pyjLJIIL = c1532310pyf.LJIIL(TemplateBundle.class)) != null && (templateBundle = (TemplateBundle) abstractC1532350pyjLJIIL.LIZ) != null) {
                C1535980q4a.LIZLLL(awS73S1000000_23.s0, c1532310pyf.LIZ, c1532310pyf.LJII, templateBundle);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS73S1000000_23 awS73S1000000_23, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed to handle action: ");
        sbLIZ.append(awS73S1000000_23.s0);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS73S1000000_23 awS73S1000000_23, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Handle pending action, pendingActionRef: ");
        sbLIZ.append(awS73S1000000_23.s0);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS73S1000000_23 awS73S1000000_23, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Registered action handler for type: ");
        sbLIZ.append(awS73S1000000_23.s0);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS73S1000000_23 awS73S1000000_23, Object obj) {
        return Boolean.valueOf(((C1491290ouV) ((Map.Entry) obj).getValue()).LJ.contains(awS73S1000000_23.s0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS73S1000000_23(String str, Exception exc, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS73S1000000_23(String str, HybridInfoColdBootTask hybridInfoColdBootTask, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }
}
