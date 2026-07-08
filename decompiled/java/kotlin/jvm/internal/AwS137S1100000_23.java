package kotlin.jvm.internal;

import X.AnonymousClass0957;
import X.C099G;
import X.C09AY;
import X.C0CQT;
import X.C0WZX;
import X.C1168400gVi;
import X.C1292290jjX;
import X.C1491180ouK;
import X.C1516980pZw;
import X.C1534000q1O;
import X.C1534110q1Z;
import X.C1547370qMx;
import X.C2097608Jq;
import X.C21305518Zh;
import X.C21322818cU;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C259800zU;
import X.C786410Ut5;
import X.C847400XMc;
import X.InterfaceC1516910pZp;
import X.InterfaceC1547330qMt;
import Y.ARunnableS11S2100000_23;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes24.dex */
public class AwS137S1100000_23 extends C09AY implements Function1 {
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
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS137S1100000_23 awS137S1100000_23, Object obj) {
        C1292290jjX c1292290jjX = (C1292290jjX) awS137S1100000_23.l1;
        HandlerHook.viewPost(c1292290jjX, new ARunnableS11S2100000_23(c1292290jjX, (String) obj, awS137S1100000_23.s0, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS137S1100000_23 awS137S1100000_23, Object obj) {
        HashMap map;
        Map mapLJ;
        ((C21305518Zh) awS137S1100000_23.l1).LLLLLJIL().setSurface(new Surface((SurfaceTexture) obj));
        ((C21305518Zh) awS137S1100000_23.l1).LLLLLJIL().LJIJI(awS137S1100000_23.s0);
        C21305518Zh c21305518Zh = (C21305518Zh) awS137S1100000_23.l1;
        if (!c21305518Zh.LLLLILI().LIZ.LJ) {
            map = new HashMap();
        } else {
            map = new HashMap();
            try {
                mapLJ = C847400XMc.LIZJ(C0CQT.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                mapLJ = C2097608Jq.LJ();
            }
            map.putAll(mapLJ);
            try {
                String strLLIZ = C2204961BRm.LLIZ(C786410Ut5.A2(), C0CQT.LIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOuhdpbF1SbwuVFVHysWqh62AjlbG11T+2ONf9Cv6xF3Kt9iiJePOlIswFXgw7EjtN21ihbzCr7k6g==", null));
                if (strLLIZ != null) {
                    map.put("Cookie", strLLIZ);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            c21305518Zh.LLLLLJIL().LJJIII((String) entry.getKey(), (String) entry.getValue());
        }
        ((C21305518Zh) awS137S1100000_23.l1).LLLLLJIL().play();
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS137S1100000_23 awS137S1100000_23, Object obj) {
        C21322818cU c21322818cU = (C21322818cU) obj;
        if (!c21322818cU.LIZIZ) {
            C1168400gVi.LIZLLL(new AwS137S1100000_23(c21322818cU, awS137S1100000_23.s0, 9));
            ((Function1) awS137S1100000_23.l1).invoke(null);
        } else {
            String str = c21322818cU.LJ;
            if (str != null && str.length() != 0) {
                C1168400gVi.LIZJ(new AwS20S2000000_23(awS137S1100000_23.s0, str, 1));
                ((Function1) awS137S1100000_23.l1).invoke(str);
            } else {
                C1168400gVi.LIZLLL(new AwS53S1000000_2(awS137S1100000_23.s0, 33));
                ((Function1) awS137S1100000_23.l1).invoke(null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS137S1100000_23 awS137S1100000_23, Object obj) {
        if (obj == null) {
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (((AnonymousClass0957) awS137S1100000_23.l1).LIZLLL() == null) {
                C1516980pZw c1516980pZw = C1516980pZw.LIZ;
                ConcurrentHashMap<String, AnonymousClass0957<InterfaceC1516910pZp<?>>> concurrentHashMap = C1516980pZw.LJ;
                String str = awS137S1100000_23.s0;
                AnonymousClass0957 anonymousClass0957 = (AnonymousClass0957) awS137S1100000_23.l1;
                c1516980pZw.getClass();
                C1516980pZw.LJ(concurrentHashMap, str, anonymousClass0957);
            }
        } else {
            C1516980pZw c1516980pZw2 = C1516980pZw.LIZ;
            ConcurrentHashMap<String, AnonymousClass0957<InterfaceC1516910pZp<?>>> concurrentHashMap2 = C1516980pZw.LJ;
            String str2 = awS137S1100000_23.s0;
            AnonymousClass0957 anonymousClass09572 = (AnonymousClass0957) awS137S1100000_23.l1;
            c1516980pZw2.getClass();
            C1516980pZw.LJ(concurrentHashMap2, str2, anonymousClass09572);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS137S1100000_23 awS137S1100000_23, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Handled action handler: ");
        sbLIZ.append(awS137S1100000_23.s0);
        sbLIZ.append(", params: ");
        sbLIZ.append(((InterfaceC1547330qMt) awS137S1100000_23.l1).getParams());
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS137S1100000_23 awS137S1100000_23, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Handled native bridge action: ");
        sbLIZ.append(awS137S1100000_23.s0);
        sbLIZ.append(", params: ");
        sbLIZ.append(((InterfaceC1547330qMt) awS137S1100000_23.l1).getParams());
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS137S1100000_23 awS137S1100000_23, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("actionType: ");
        sbLIZ.append(awS137S1100000_23.s0);
        sbLIZ.append(", params: ");
        sbLIZ.append(((InterfaceC1547330qMt) awS137S1100000_23.l1).getParams());
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS137S1100000_23 awS137S1100000_23, Object obj) {
        Function2<String, String, Unit> function2 = ((C1491180ouK) awS137S1100000_23.l1).LIZIZ;
        if (function2 != null) {
            function2.invoke(awS137S1100000_23.s0, obj);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS137S1100000_23 awS137S1100000_23, Object obj) {
        Function2<String, String, Unit> function2 = ((C1491180ouK) awS137S1100000_23.l1).LIZIZ;
        if (function2 != null) {
            function2.invoke(awS137S1100000_23.s0, obj);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS137S1100000_23 awS137S1100000_23, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("step", "load_Start");
        laneParams.plusAssign("timestamp", Long.valueOf(System.currentTimeMillis()));
        laneParams.plusAssign("current_url", awS137S1100000_23.s0);
        String str = ((C1547370qMx) awS137S1100000_23.l1).LL;
        if (str == null) {
            str = "";
        }
        laneParams.plusAssign("pid", str);
        laneParams.plusAssign("pre_create", Integer.valueOf(((C1547370qMx) awS137S1100000_23.l1).LLILLJJLI ? 1 : 0));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.Boolean] */
    public static final Object invoke$8(AwS137S1100000_23 awS137S1100000_23, Object obj) {
        C1534110q1Z c1534110q1Z = (C1534110q1Z) obj;
        if (Intrinsics.LJFF(c1534110q1Z.LIZIZ, awS137S1100000_23.s0)) {
            ((C259800zU) awS137S1100000_23.l1).element = Boolean.valueOf(c1534110q1Z.LIZLLL());
            return Boolean.TRUE;
        }
        WeakReference<C1534000q1O> weakReference = c1534110q1Z.LJII;
        if (weakReference != null) {
            boolean zBooleanValue = false;
            if (weakReference.get() != null) {
                C259800zU c259800zU = (C259800zU) awS137S1100000_23.l1;
                Boolean bool = (Boolean) c259800zU.element;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                }
                c259800zU.element = Boolean.valueOf(c1534110q1Z.LIZLLL() | zBooleanValue);
            }
        }
        return Boolean.FALSE;
    }

    public static final Object invoke$9(AwS137S1100000_23 awS137S1100000_23, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchResourceToLocalFile failed: url=");
        sbLIZ.append(awS137S1100000_23.s0);
        sbLIZ.append(", error=");
        sbLIZ.append(((C21322818cU) awS137S1100000_23.l1).LJIIIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S1100000_23(C1292290jjX c1292290jjX, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1292290jjX;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S1100000_23(C1491180ouK c1491180ouK, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1491180ouK;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S1100000_23(C21305518Zh c21305518Zh, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c21305518Zh;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S1100000_23(C21322818cU c21322818cU, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c21322818cU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS137S1100000_23(String str, String str2, C259800zU<Boolean> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S1100000_23(String str, C099G c099g, int i) {
        super(1);
        this.$t = i;
        this.l1 = c099g;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S1100000_23(String str, InterfaceC1547330qMt interfaceC1547330qMt, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = interfaceC1547330qMt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S1100000_23(String str, C1547370qMx c1547370qMx, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1547370qMx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S1100000_23(String str, AwS116S1100000_2 awS116S1100000_2, int i) {
        super(1);
        this.$t = i;
        this.l1 = awS116S1100000_2;
        this.s0 = str;
    }
}
