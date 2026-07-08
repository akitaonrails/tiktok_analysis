package kotlin.jvm.internal;

import X.C09AY;
import X.C0X12;
import X.C1290210jgB;
import X.C1506970pJn;
import X.C1515820pY4;
import X.C1516040pYQ;
import X.C1531820pxs;
import X.C1531860pxw;
import X.C1532310pyf;
import X.C1532920pze;
import X.C1533790q13;
import X.C1542120qEU;
import X.C1547370qMx;
import X.C1547960qNu;
import X.C2107108Nh;
import X.C2382909Vj;
import X.C259800zU;
import X.C644110POf;
import X.C766270U4b;
import X.C786410Ut5;
import X.EnumC1547970qNv;
import X.InterfaceC1201180hMa;
import X.InterfaceC1506870pJd;
import X.InterfaceC1515800pY2;
import X.InterfaceC1515810pY3;
import X.InterfaceC634840OvC;
import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.ies.ugc.aweme.network.chunk.INetworkChunkPerformanceService;
import com.bytedance.ies.ugc.aweme.network.chunk.INetworkChunkRaxService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes24.dex */
public class AwS106S1200000_23 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS106S1200000_23 awS106S1200000_23, Object obj) {
        Map map = (Map) obj;
        map.put("page_name", "interceptor");
        map.put("host", ((Request) awS106S1200000_23.l1).getHost());
        map.put("path", awS106S1200000_23.s0);
        map.put("class_type", ((TypedInput) awS106S1200000_23.l2).getClass().getName());
        map.put("content_type", ((TypedInput) awS106S1200000_23.l2).mimeType());
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS106S1200000_23 awS106S1200000_23, Object obj) {
        Activity activityLIZLLL;
        C1506970pJn c1506970pJn = (C1506970pJn) awS106S1200000_23.l1;
        String str = awS106S1200000_23.s0;
        InterfaceC634840OvC interfaceC634840OvC = c1506970pJn.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != null) {
            C766270U4b.LJIIIZ(C786410Ut5.L3(activityLIZLLL), str);
        }
        C2382909Vj.LIZ((CompletionBlock) awS106S1200000_23.l2, 0, null, null, 6);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS106S1200000_23 awS106S1200000_23, Object obj) {
        C1531820pxs c1531820pxs = (C1531820pxs) obj;
        C1532920pze c1532920pze = C1532920pze.LIZJ;
        c1532920pze.LIZJ(new AwS107S1000000_23(awS106S1200000_23.s0, 28));
        if (!c1531820pxs.LIZLLL()) {
            return Boolean.FALSE;
        }
        C1531860pxw c1531860pxw = c1531820pxs.LIZJ;
        C1531860pxw c1531860pxw2 = (C1531860pxw) awS106S1200000_23.l1;
        if (c1531860pxw2 == null ? c1531860pxw == null : c1531860pxw2.LIZIZ(c1531860pxw, true)) {
            if (((Boolean) ((Function1) awS106S1200000_23.l2).invoke(c1531820pxs)).booleanValue()) {
                c1532920pze.LIZJ(new AwS107S1000000_23(awS106S1200000_23.s0, 29));
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, X.0jgB] */
    public static final Object invoke$3(AwS106S1200000_23 awS106S1200000_23, Object obj) {
        EnumC1547970qNv enumC1547970qNv;
        C1532310pyf c1532310pyf = (C1532310pyf) obj;
        if (c1532310pyf.isSuccess()) {
            C259800zU c259800zU = (C259800zU) awS106S1200000_23.l1;
            if (c1532310pyf.LIZ.LJJIII.LIZLLL() == null) {
                UriProtector.parse(awS106S1200000_23.s0);
            }
            ?? c1290210jgB = new C1290210jgB();
            C1547960qNu c1547960qNu = (C1547960qNu) awS106S1200000_23.l2;
            c1290210jgB.LIZ = c1532310pyf.LJFF();
            if (Intrinsics.LJFF(c1532310pyf.LJIIJJI, "builtin")) {
                enumC1547970qNv = EnumC1547970qNv.ASSET;
            } else {
                enumC1547970qNv = EnumC1547970qNv.DISK;
            }
            c1290210jgB.LIZIZ = enumC1547970qNv;
            String str = c1532310pyf.LJIIJJI;
            c1547960qNu.getClass();
            C1547960qNu.LIZIZ(c1290210jgB, str);
            c259800zU.element = c1290210jgB;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, X.0jgB] */
    public static final Object invoke$4(AwS106S1200000_23 awS106S1200000_23, Object obj) {
        EnumC1547970qNv enumC1547970qNv;
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        if (c1533790q13.LIZIZ) {
            C259800zU c259800zU = (C259800zU) awS106S1200000_23.l1;
            UriProtector.parse(awS106S1200000_23.s0);
            ?? c1290210jgB = new C1290210jgB();
            C1547960qNu c1547960qNu = (C1547960qNu) awS106S1200000_23.l2;
            c1290210jgB.LIZ = c1533790q13.LIZLLL();
            if (Intrinsics.LJFF(c1533790q13.LJ, "builtin")) {
                enumC1547970qNv = EnumC1547970qNv.ASSET;
            } else {
                enumC1547970qNv = EnumC1547970qNv.DISK;
            }
            c1290210jgB.LIZIZ = enumC1547970qNv;
            String str = c1533790q13.LJ;
            c1547960qNu.getClass();
            C1547960qNu.LIZIZ(c1290210jgB, str);
            c259800zU.element = c1290210jgB;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS106S1200000_23 awS106S1200000_23, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("step", "load_Failed");
        laneParams.plusAssign("timestamp", Long.valueOf(System.currentTimeMillis()));
        laneParams.plusAssign("current_url", awS106S1200000_23.s0);
        laneParams.plusAssign("duration", Long.valueOf(SystemClock.elapsedRealtime() - ((C1547370qMx) awS106S1200000_23.l1).LLILZIL));
        C1542120qEU c1542120qEU = (C1542120qEU) awS106S1200000_23.l2;
        if (c1542120qEU != null) {
            Integer num = c1542120qEU.LIZ;
            if (num != null) {
                laneParams.plusAssign("err_code", Integer.valueOf(num.intValue()));
            }
            String str = c1542120qEU.LIZIZ;
            if (str != null) {
                laneParams.plusAssign("err_msg", str);
            }
        }
        String str2 = ((C1547370qMx) awS106S1200000_23.l1).LL;
        if (str2 == null) {
            str2 = "";
        }
        laneParams.plusAssign("pid", str2);
        laneParams.plusAssign("pre_create", Integer.valueOf(((C1547370qMx) awS106S1200000_23.l1).LLILLJJLI ? 1 : 0));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS106S1200000_23 awS106S1200000_23, Object obj) {
        boolean z;
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new ByteArrayInputStream((byte[]) obj), awS106S1200000_23.s0);
            C1516040pYQ c1516040pYQ = (C1516040pYQ) awS106S1200000_23.l1;
            C1515820pY4 c1515820pY4 = (C1515820pY4) awS106S1200000_23.l2;
            Throwable th = null;
            try {
                Object obj2 = c1516040pYQ.LIZIZ.read(c1516040pYQ.LIZ.LJIIL(inputStreamReader));
                if (obj2 instanceof InterfaceC1201180hMa) {
                    ((InterfaceC1201180hMa) obj2).setRequestInfo(c1515820pY4.getRequestInfo());
                }
                if (obj2 instanceof C0X12) {
                    ((C0X12) obj2).setRequestId(c1515820pY4.LLILLL);
                }
                if (obj2 instanceof InterfaceC1515800pY2) {
                    ((InterfaceC1515800pY2) obj2).LIZIZ(c1515820pY4.LIZIZ());
                }
                if (obj2 instanceof InterfaceC1515810pY3) {
                    c1515820pY4.getClass();
                    ((InterfaceC1515810pY3) obj2).LIZ();
                }
                if (obj2 instanceof n) {
                    INetworkChunkPerformanceService iNetworkChunkPerformanceService = (INetworkChunkPerformanceService) PluggableExtentionKt.pluggableSpi$default(INetworkChunkPerformanceService.class, false, false, false, 14, null);
                    if (iNetworkChunkPerformanceService != null && iNetworkChunkPerformanceService.isOpen()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        try {
                            List<C644110POf> listLIZIZ = c1515820pY4.LIZIZ().LIZIZ();
                            C644110POf c644110POf = listLIZIZ.get(listLIZIZ.size() - 1);
                            ((n) obj2).LJJIII(Long.valueOf(c1515820pY4.getRequestInfo().LJI), "tsn_send");
                            ((n) obj2).LJJIII(Long.valueOf(c644110POf.LIZJ), "tsn_read_start");
                            ((n) obj2).LJJIII(Long.valueOf(c644110POf.LJ), "tsn_read_each_start");
                            ((n) obj2).LJJIII(Integer.valueOf(c644110POf.LIZIZ), "tsn_read_each_dur");
                            ((n) obj2).LJJIII(Long.valueOf(c644110POf.LJI), "tsn_read_each_end");
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
                INetworkChunkRaxService iNetworkChunkRaxService = (INetworkChunkRaxService) PluggableExtentionKt.pluggableSpi$default(INetworkChunkRaxService.class, false, false, false, 14, null);
                if (iNetworkChunkRaxService != null) {
                    iNetworkChunkRaxService.isOpen();
                }
                C2107108Nh.LIZ(inputStreamReader, null);
                return obj2;
            } finally {
                try {
                    try {
                    } catch (Throwable th2) {
                        while (true) {
                        }
                    }
                } catch (Throwable th3) {
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS106S1200000_23(C259800zU c259800zU, C259800zU<C1290210jgB> c259800zU2, String str, C1547960qNu c1547960qNu) {
        super(1);
        this.$t = c1547960qNu;
        this.l1 = c259800zU;
        this.s0 = c259800zU2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS106S1200000_23(C1506970pJn c1506970pJn, C1506970pJn c1506970pJn2, String str, CompletionBlock<InterfaceC1506870pJd> completionBlock) {
        super(1);
        this.$t = completionBlock;
        this.l1 = c1506970pJn;
        this.s0 = c1506970pJn2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS106S1200000_23(C1531860pxw c1531860pxw, AwS56S0500000_23 awS56S0500000_23, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1531860pxw;
        this.l2 = awS56S0500000_23;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS106S1200000_23(Request request, String str, TypedInput typedInput, int i) {
        super(1);
        this.$t = i;
        this.l1 = request;
        this.s0 = str;
        this.l2 = typedInput;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS106S1200000_23(String str, String str2, C1516040pYQ<Object> c1516040pYQ, C1515820pY4<byte[]> c1515820pY4) {
        super(1);
        this.$t = c1515820pY4;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = c1516040pYQ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS106S1200000_23(String str, C1547370qMx c1547370qMx, C1542120qEU c1542120qEU, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1547370qMx;
        this.l2 = c1542120qEU;
    }
}
