package kotlin.jvm.internal;

import X.C098200Yq;
import X.C09AY;
import X.C0C64;
import X.C0C9G;
import X.C0DQV;
import X.C0S78;
import X.C0WG4;
import X.C0WG5;
import X.C0WS0;
import X.C0WS1;
import X.C0WS2;
import X.C0WS6;
import X.C0WS7;
import X.C0WSB;
import X.C0WSF;
import X.C0WSL;
import X.C0WSP;
import X.C0WSU;
import X.C0WSW;
import X.C0WSX;
import X.C0WZJ;
import X.C0WZO;
import X.C0X52;
import X.C0XL0;
import X.C0XQN;
import X.C0XVM;
import X.C1150504el;
import X.C13LP;
import X.C15438062q;
import X.C15O7;
import X.C189200o6;
import X.C20144713rx;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2404209bU;
import X.C308480C7i;
import X.C691030R8r;
import X.C820360WGc;
import X.C820370WGd;
import X.C823280WRi;
import X.C823300WRk;
import X.C823410WRv;
import X.C823420WRw;
import X.C823430WRx;
import X.C825320WZe;
import X.C825920Wac;
import X.C840660WyO;
import X.C840850Wyh;
import X.C840860Wyi;
import X.C841020Wyy;
import X.C844470XAv;
import X.C854740Xg0;
import X.EnumC820330WFz;
import X.EnumC841300WzQ;
import X.InterfaceC841560Wzq;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.base2.interfaces.IPumbaaModuleInitService;
import com.bytedance.pumbaa.base2.interfaces.IShouldCacheHandler;
import com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch;
import com.bytedance.pumbaa.base2.performance.PumbaaPerformanceTrackManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa2.NewPumbaaTask;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa2.PumbaaSystemApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public class AwS257S0300000_13 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS257S0300000_13 awS257S0300000_13) {
        String name;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get response error:");
        sbLIZ.append(((Exception) awS257S0300000_13.l0).getMessage());
        sbLIZ.append(", url:");
        sbLIZ.append(((C840660WyO) awS257S0300000_13.l1).LJIILL());
        sbLIZ.append(", body:");
        Object obj = awS257S0300000_13.l2;
        if (obj != null) {
            name = obj.getClass().getName();
        } else {
            name = null;
        }
        sbLIZ.append(name);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS257S0300000_13 awS257S0300000_13) {
        String name;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get response error:");
        sbLIZ.append(((Throwable) awS257S0300000_13.l0).getMessage());
        sbLIZ.append(", url:");
        sbLIZ.append(((C840660WyO) awS257S0300000_13.l1).LJIILL());
        sbLIZ.append(", body:");
        T t = ((C0X52) awS257S0300000_13.l2).LIZIZ;
        if (t != 0) {
            name = t.getClass().getName();
        } else {
            name = null;
        }
        sbLIZ.append(name);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS257S0300000_13 awS257S0300000_13) {
        Object c098200Yq;
        boolean z;
        NewPumbaaTask newPumbaaTask = (NewPumbaaTask) awS257S0300000_13.l0;
        C0WS6 c0ws6 = (C0WS6) awS257S0300000_13.l1;
        newPumbaaTask.getClass();
        C0WSB c0wsb = null;
        try {
            PumbaaPerformanceTrackManager.PumbaaPerformanceTrackConfig pumbaaPerformanceTrackConfigLIZ = C0WSL.LIZ();
            String str = (String) C308480C7i.LIZLLL(String.class, "pns_pumbaa_perf_expr_tag", null);
            C844470XAv.LIZ.getClass();
            if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                z = true;
            } else {
                z = false;
            }
            PumbaaPerformanceTrackManager.LJFF(pumbaaPerformanceTrackConfigLIZ, str, Boolean.valueOf(z), new C691030R8r(), new C0C9G());
            C0WSB c0wsbLIZLLL = PumbaaPerformanceTrackManager.LIZLLL(true);
            if (c0wsbLIZLLL != null) {
                c0wsbLIZLLL.LJIIJ(c0ws6);
            }
            c0ws6.LIZ();
            if (c0wsbLIZLLL != null) {
                c0wsbLIZLLL.LJIIIIZZ("init_perf_outside", c0ws6);
            }
            c0wsb = c0wsbLIZLLL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        ((NewPumbaaTask) awS257S0300000_13.l0).getClass();
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "pns_remove_cep_engine_init", true, false)) {
            C823420WRw c823420WRw = C823420WRw.LIZ;
            AFwS247S0000000_13 aFwS247S0000000_13 = AFwS247S0000000_13.get$arr$(73);
            c823420WRw.getClass();
            C0WS0 c0ws0 = C0WS0.LIZ;
            C823430WRx c823430WRx = new C823430WRx("init_cep", aFwS247S0000000_13);
            c0ws0.getClass();
            C0WS0.LJ.add(c823430WRx);
        }
        C823420WRw c823420WRw2 = C823420WRw.LIZ;
        AFwS247S0000000_13 aFwS247S0000000_132 = AFwS247S0000000_13.get$arr$(74);
        c823420WRw2.getClass();
        C0WS0 c0ws02 = C0WS0.LIZ;
        C823430WRx c823430WRx2 = new C823430WRx("init_ttm", aFwS247S0000000_132);
        c0ws02.getClass();
        List<C0WS2> list = C0WS0.LJ;
        list.add(c823430WRx2);
        IPerformanceExprSwitch iPerformanceExprSwitchLIZ = C825320WZe.LIZ();
        if (iPerformanceExprSwitchLIZ != null && !iPerformanceExprSwitchLIZ.LIZ()) {
            if (c0wsb != null) {
                c0wsb.LJIILJJIL();
            }
        } else {
            C823430WRx c823430WRx3 = new C823430WRx("register_global_signals", new AwS592S0100000_13((NewPumbaaTask) awS257S0300000_13.l0, 43));
            c0ws02.getClass();
            list.add(c823430WRx3);
            C823430WRx c823430WRx4 = new C823430WRx("init_open_audit", new AwS592S0100000_13((Context) awS257S0300000_13.l2, 44));
            c0ws02.getClass();
            list.add(c823430WRx4);
            C823420WRw.LIZ("init_offline_env", new AwS592S0100000_13((NewPumbaaTask) awS257S0300000_13.l0, 45));
            if (C825320WZe.LJ()) {
                C823420WRw.LIZ("init_cross_stack_opt", AFwS247S0000000_13.get$arr$(24));
            }
            C823420WRw.LIZ("init_open_audit_api_calling", AFwS247S0000000_13.get$arr$(25));
            C823420WRw.LIZ("init_third_party_network", AFwS247S0000000_13.get$arr$(26));
            C823410WRv c823410WRv = new IShouldCacheHandler() { // from class: X.0WRv
                @Override // com.bytedance.pumbaa.base2.interfaces.IShouldCacheHandler
                public final boolean shouldCache() {
                    return !ComplianceServiceProvider.LJIILJJIL().LJII(null);
                }
            };
            AtomicBoolean atomicBoolean = C823420WRw.LIZIZ;
            if (!atomicBoolean.get()) {
                C823280WRi.LJ = AFwS200S0000000_13.get$arr$(201);
                C823280WRi.LIZLLL = c823410WRv;
            }
            Context context = (Context) awS257S0300000_13.l2;
            C844470XAv.LIZ.getClass();
            String.valueOf(C844470XAv.LJIIJ);
            boolean zLJFF = Intrinsics.LJFF(C844470XAv.LJIILL, "local_test");
            String strLJFF = C844470XAv.LJFF();
            long jLIZLLL = C844470XAv.LIZLLL();
            NewPumbaaTask newPumbaaTask2 = (NewPumbaaTask) awS257S0300000_13.l0;
            if (newPumbaaTask2.LL == null) {
                try {
                    newPumbaaTask2.LL = C2404209bU.LIZ();
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
            C823300WRk c823300WRk = new C823300WRk(jLIZLLL, zLJFF, strLJFF);
            if (!atomicBoolean.get() && !C0WS0.LIZIZ.get()) {
                C0WS0 c0ws03 = C0WS0.LIZ;
                try {
                    c0ws03.getClass();
                    C0WS0.LIZ(zLJFF);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C0WSP.LIZIZ(C0WS0.LIZLLL, new AwS257S0300000_13(c0ws03, c823300WRk, context, 5));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PumbaaModuleEnv init cost: ");
                    sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    c098200Yq = Integer.valueOf(Log.d("PumbaaPerf", C2188811AlT.LIZIZ(sbLIZ)));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    c098200Yq = new C098200Yq(th3);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C823280WRi.LJIIIIZZ("pumbaa init error", thM5exceptionOrNullimpl);
                }
            }
            C0S78.LIZJ(new AwS557S0100000_13((Context) awS257S0300000_13.l2, 123), true);
            try {
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                if (c0wsb != null) {
                    c0wsb.LJIILJJIL();
                }
            }
            if (c0wsb == null) {
                PumbaaSystemApi.LIZ();
            } else {
                C0WS7 c0ws7LJFF = c0wsb.LJFF("init_system_api_pro");
                PumbaaSystemApi.LIZ();
                C0WSF c0wsf = c0wsb.LJI;
                C0WSF c0wsf2 = C0WSF.EXCEEDED;
                if (c0wsf == c0wsf2) {
                    c0ws7LJFF.LJFF = c0wsf2;
                }
                c0ws7LJFF.stop();
                c0wsb.LJIILJJIL();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS257S0300000_13 awS257S0300000_13) {
        C820360WGc c820360WGc = new C820360WGc();
        c820360WGc.LIZ = "Firebase";
        c820360WGc.LIZIZ = "setConsent";
        Map map = (Map) awS257S0300000_13.l0;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new Pair(((EnumC820330WFz) entry.getKey()).name(), ((C0WG4) entry.getValue()).name()));
        }
        c820360WGc.LIZJ = C0DQV.LIZLLL(C2097608Jq.LJIILLIIL(arrayList), "consentSettings");
        c820360WGc.LIZ(C825920Wac.LIZ((Cert) awS257S0300000_13.l1));
        return C0XL0.LIZ(new C820370WGd(c820360WGc), new AwS414S0200000_13((C0WG5) awS257S0300000_13.l2, (C0WG5) awS257S0300000_13.l0, (Map<EnumC820330WFz, ? extends C0WG4>) 3));
    }

    public static final Object invoke$4(AwS257S0300000_13 awS257S0300000_13) {
        C840860Wyi c840860Wyi = new C840860Wyi(EnumC841300WzQ.AFTER_CALL, (C841020Wyy) awS257S0300000_13.l0, ((C840850Wyh) awS257S0300000_13.l1).LIZLLL.invoke());
        for (InterfaceC841560Wzq interfaceC841560Wzq : (List) awS257S0300000_13.l2) {
            if (!c840860Wyi.LJIIIIZZ) {
                interfaceC841560Wzq.LIZ(c840860Wyi);
            }
        }
        if (!c840860Wyi.LJIIIIZZ && !c840860Wyi.LJII) {
            ((C840850Wyh) awS257S0300000_13.l1).LJ.invoke(c840860Wyi.LIZJ, (C841020Wyy) awS257S0300000_13.l0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS257S0300000_13 awS257S0300000_13) {
        C0WSB c0wsb;
        C0WS0 c0ws0 = (C0WS0) awS257S0300000_13.l0;
        C823300WRk c823300WRk = (C823300WRk) awS257S0300000_13.l1;
        Context context = (Context) awS257S0300000_13.l2;
        synchronized (c0ws0) {
            try {
                C0WS0.LIZJ = c823300WRk;
                CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
                C0WSW.LIZIZ = c823300WRk.LIZ;
                C823430WRx c823430WRx = new C823430WRx("init_env", new AwS592S0100000_13(c823300WRk, 79));
                List<C0WS2> list = C0WS0.LJ;
                list.add(c823430WRx);
                list.add(new C823430WRx("init_lifecycle_monitor", new AwS592S0100000_13(context, 80)));
                list.add(new C823430WRx("init_internal_signals", new AwS592S0100000_13(c823300WRk, 81)));
                Set<IPumbaaModuleInitService> services = ServiceManager.get().getServices(IPumbaaModuleInitService.class);
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(services, 10));
                for (IPumbaaModuleInitService iPumbaaModuleInitService : services) {
                    String strName = iPumbaaModuleInitService.name();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("init_");
                    sbLIZ.append(strName);
                    C0WS0.LJ.add(new C823430WRx(C2188811AlT.LIZIZ(sbLIZ), new AwS53S1300000_13(c0ws0, strName, iPumbaaModuleInitService, context, c823300WRk, 0)));
                    arrayList.add(Unit.LIZ);
                }
                C0WS1.LIZ(C13LP.LJLIL(C0WS0.LJFF, C0WS0.LJ), C0WS0.LIZLLL);
                if (!C0WS0.LJI && (c0wsb = C0WS0.LIZLLL) != null) {
                    c0wsb.LJIILJJIL();
                }
                C0WS0.LIZIZ.set(true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS257S0300000_13 awS257S0300000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C0WZO) awS257S0300000_13.l0).name());
        sbLIZ.append(" monitor return result:");
        sbLIZ.append((C0WSU) awS257S0300000_13.l1);
        sbLIZ.append("  context:");
        sbLIZ.append((C0WZJ) awS257S0300000_13.l2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$7(AwS257S0300000_13 awS257S0300000_13) {
        if (!C1150504el.LIZ().LJIIIIZZ("cold_boot_after_sync_user_to_signup_destroy")) {
            C1150504el.LIZ().LIZLLL("cold_boot_after_sync_user_to_signup_destroy", false);
        }
        if (!((List) awS257S0300000_13.l0).isEmpty()) {
            ((C0XQN) ListProtector.remove((List) awS257S0300000_13.l0, 0)).run();
        } else if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            Function1 function1 = (Function1) awS257S0300000_13.l1;
            Bundle bundle = (Bundle) awS257S0300000_13.l2;
            function1.invoke(C0XVM.LIZIZ(bundle, null, false, false).LIZLLL(new C854740Xg0(bundle, 3)));
        } else {
            "Need to run on UI Thread".toString();
            throw new IllegalArgumentException("Need to run on UI Thread");
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS257S0300000_13(C0WS0 c0ws0, C823300WRk c823300WRk, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0ws0;
        this.l1 = c823300WRk;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS257S0300000_13(C0WZO c0wzo, C0WSU c0wsu, C0WZJ c0wzj, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0wzo;
        this.l1 = c0wsu;
        this.l2 = c0wzj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS257S0300000_13(C841020Wyy c841020Wyy, C841020Wyy c841020Wyy2, C840850Wyh c840850Wyh, List<? extends InterfaceC841560Wzq> list) {
        super(0);
        this.$t = list;
        this.l0 = c841020Wyy;
        this.l1 = c841020Wyy2;
        this.l2 = c840850Wyh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS257S0300000_13(NewPumbaaTask newPumbaaTask, C0WS6 c0ws6, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = newPumbaaTask;
        this.l1 = c0ws6;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS257S0300000_13(Exception exc, C840660WyO c840660WyO, Object obj, int i) {
        super(0);
        this.$t = i;
        this.l0 = exc;
        this.l1 = c840660WyO;
        this.l2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS257S0300000_13(Throwable th, Throwable th2, C840660WyO c840660WyO, C0X52<?> c0x52) {
        super(0);
        this.$t = c0x52;
        this.l0 = th;
        this.l1 = th2;
        this.l2 = c840660WyO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS257S0300000_13(List list, List<C0XQN> list2, Function1<? super C15O7<Bundle>, Unit> function1, Bundle bundle) {
        super(0);
        this.$t = bundle;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS257S0300000_13(Map map, C20144713rx c20144713rx, C0WG5 c0wg5, int i) {
        super(0);
        this.$t = i;
        this.l0 = map;
        this.l1 = c20144713rx;
        this.l2 = c0wg5;
    }
}
