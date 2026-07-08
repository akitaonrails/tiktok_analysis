package kotlin.jvm.internal;

import X.C098200Yq;
import X.C09AY;
import X.C0WS0;
import X.C0WSC;
import X.C0WSW;
import X.C0WSX;
import X.C0XWH;
import X.C0XZJ;
import X.C189200o6;
import X.C2097608Jq;
import X.C786410Ut5;
import X.C823280WRi;
import X.C823300WRk;
import X.C823450WRz;
import X.C852170Xbr;
import X.InterfaceC839100Wvs;
import X.InterfaceC852200Xbu;
import android.content.Context;
import com.bytedance.pumbaa.base2.interfaces.IPumbaaModuleInitService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public class AwS53S1300000_13 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS53S1300000_13 awS53S1300000_13, Object obj) {
        Object c098200Yq;
        final C0WSC c0wsc = (C0WSC) obj;
        CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
        C0WSW.LIZ("PumbaaModuleEnv", new AwS98S1000000_13(awS53S1300000_13.s0, 15), 3, null);
        IPumbaaModuleInitService iPumbaaModuleInitService = (IPumbaaModuleInitService) awS53S1300000_13.l1;
        Context context = (Context) awS53S1300000_13.l2;
        C823300WRk c823300WRk = (C823300WRk) awS53S1300000_13.l3;
        try {
            Context contextN3 = C786410Ut5.N3(context);
            C823280WRi c823280WRi = C823280WRi.LIZ;
            iPumbaaModuleInitService.LIZ(contextN3, new C823450WRz(c823300WRk, new InterfaceC839100Wvs() { // from class: X.0WRy
                @Override // X.InterfaceC839100Wvs
                public final void LIZ(String str, String str2) {
                    C0WSB c0wsb = C0WS0.LIZLLL;
                    if (c0wsb != null) {
                        if (c0wsb.LJIIJ == null) {
                            c0wsb.LJIIJ = new ConcurrentHashMap();
                        }
                        Map<String, String> map = c0wsb.LJIIJ;
                        if (map != null) {
                            ((ConcurrentHashMap) map).put(str, str2);
                        }
                    }
                }

                @Override // X.InterfaceC839100Wvs
                public final void LIZIZ(long j, String str) {
                    C0WSC c0wsc2 = c0wsc;
                    if (c0wsc2 != null) {
                        long j2 = j * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                        c0wsc2.LIZIZ(j2, j2, str);
                    }
                }
            }));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String str = awS53S1300000_13.s0;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C823280WRi.LJ(thM5exceptionOrNullimpl, "initService error: " + str + " : " + thM5exceptionOrNullimpl.getMessage(), C2097608Jq.LJIIJ(new Pair("pumbaa_exception_type", "module_init_error"), new Pair("module_name", str)));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS53S1300000_13 awS53S1300000_13, Object obj) {
        int iLIZ;
        Throwable th = (Throwable) obj;
        if (th instanceof C0XZJ) {
            iLIZ = ((C0XZJ) th).getErrorCode();
        } else {
            iLIZ = C0XWH.LIZ(th);
        }
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        String str = awS53S1300000_13.s0;
        InterfaceC852200Xbu interfaceC852200Xbu = (InterfaceC852200Xbu) awS53S1300000_13.l1;
        Map map = (Map) awS53S1300000_13.l2;
        c852170Xbr.getClass();
        C852170Xbr.LJIIIIZZ(false, iLIZ, str, interfaceC852200Xbu, map);
        ((Function1) awS53S1300000_13.l3).invoke(Integer.valueOf(iLIZ));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS53S1300000_13(InterfaceC852200Xbu interfaceC852200Xbu, String str, Map map, Function1 function1, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = interfaceC852200Xbu;
        this.l2 = map;
        this.l3 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS53S1300000_13(C0WS0 c0ws0, String str, IPumbaaModuleInitService iPumbaaModuleInitService, Context context, C823300WRk c823300WRk, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = iPumbaaModuleInitService;
        this.l2 = context;
        this.l3 = c823300WRk;
    }
}
