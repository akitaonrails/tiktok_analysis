package com.ss.android.ugc.effectmanager.knadapt;

import X.C01GW;
import X.C095E;
import X.C095G;
import X.C099R;
import X.C09A1;
import X.C09AX;
import X.C09DV;
import X.C0PEM;
import X.C155000ia;
import X.C1C7U;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1633730scF;
import X.InterfaceC497601wk;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS190S0000000_4;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class KNMonitorService implements InterfaceC1633730scF {
    public final IMonitorService iMonitorService;
    public final AtomicLong kLastReportTime = new AtomicLong(0);
    public final long kMinIntervalMs = 200;
    public final C095E<Event> reportChannel = C095G.LIZ(0, null, 6);
    public final InterfaceC497601wk scope = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public final C01GW useNewRateLimit$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2145));

    private final boolean getUseNewRateLimit() {
        return ((Boolean) this.useNewRateLimit$delegate.getValue()).booleanValue();
    }

    private final void startReportingLoop() {
        C23250099c.LIZLLL(this.scope, null, null, new C2326001(null), 3);
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.effectmanager.knadapt.KNMonitorService$monitorStatusRateNew$1, reason: invalid class name */
    @C09DV(c = "com.ss.android.ugc.effectmanager.knadapt.KNMonitorService$monitorStatusRateNew$1", f = "KNMonitorService.kt", l = {83}, m = "invokeSuspend")
    public final class AnonymousClass1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public final /* synthetic */ Map<String, Object> $logExtraMap;
        public final /* synthetic */ String $serviceName;
        public final /* synthetic */ int $status;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, int i, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AnonymousClass1> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.$serviceName = str;
            this.$status = i;
            this.$logExtraMap = map;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return KNMonitorService.this.new AnonymousClass1(this.$serviceName, this.$status, this.$logExtraMap, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("KNMonitorService@61e5.monitorStatusRateNew$1");
            Object objLJFF = C099R.LJFF();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C095E<Event> c095e = KNMonitorService.this.reportChannel;
                Event event = new Event(this.$serviceName, this.$status, this.$logExtraMap);
                this.label = 1;
                if (c095e.LJIJI(event, this) == objLJFF) {
                    C1C7U.LIZIZ("KNMonitorService@61e5.monitorStatusRateNew$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("KNMonitorService@61e5.monitorStatusRateNew$1");
            return unit;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.effectmanager.knadapt.KNMonitorService$startReportingLoop$1, reason: invalid class name and case insensitive filesystem */
    @C09DV(c = "com.ss.android.ugc.effectmanager.knadapt.KNMonitorService$startReportingLoop$1", f = "KNMonitorService.kt", l = {38, 42}, m = "invokeSuspend")
    public final class C2326001 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;

        public C2326001(InterfaceC1364105Vn<? super C2326001> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return KNMonitorService.this.new C2326001(interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0033 A[LOOP:0: B:8:0x002d->B:10:0x0033, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0097 -> B:7:0x001e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00a4 -> B:7:0x001e). Please report as a decompilation issue!!! */
        @Override // njp.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws org.json.JSONException {
            /*
                r11 = this;
                java.lang.String r10 = "KNMonitorService@61e5.startReportingLoop$1"
                X.C1C7U.LIZ(r10)
                java.lang.Object r8 = X.C099R.LJFF()
                int r0 = r11.label
                r7 = 2
                r6 = 1
                if (r0 == 0) goto L57
                if (r0 == r6) goto L77
                if (r0 != r7) goto Laa
                java.lang.Object r9 = r11.L$1
                com.ss.android.ugc.effectmanager.knadapt.KNMonitorService$Event r9 = (com.ss.android.ugc.effectmanager.knadapt.KNMonitorService.Event) r9
                java.lang.Object r5 = r11.L$0
                X.0WWy r5 = (X.InterfaceC824740WWy) r5
                X.C155000ia.LIZIZ(r12)
            L1e:
                org.json.JSONObject r3 = new org.json.JSONObject
                r3.<init>()
                java.util.Map<java.lang.String, java.lang.Object> r0 = r9.logExtraMap
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r2 = r0.iterator()
            L2d:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L47
                java.lang.Object r0 = r2.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r0 = r0.getValue()
                r3.put(r1, r0)
                goto L2d
            L47:
                com.ss.android.ugc.effectmanager.knadapt.KNMonitorService r0 = com.ss.android.ugc.effectmanager.knadapt.KNMonitorService.this
                com.ss.android.ugc.effectmanager.common.listener.IMonitorService r2 = r0.iMonitorService
                java.lang.String r1 = r9.serviceName
                int r0 = r9.status
                r2.monitorStatusRate(r1, r0, r3)
                long r1 = java.lang.System.currentTimeMillis()
                goto L64
            L57:
                X.C155000ia.LIZIZ(r12)
                com.ss.android.ugc.effectmanager.knadapt.KNMonitorService r0 = com.ss.android.ugc.effectmanager.knadapt.KNMonitorService.this
                X.095E<com.ss.android.ugc.effectmanager.knadapt.KNMonitorService$Event> r0 = r0.reportChannel
                X.0WWy r5 = r0.iterator()
                r1 = 0
            L64:
                r11.L$0 = r5
                r0 = 0
                r11.L$1 = r0
                r11.J$0 = r1
                r11.label = r6
                java.lang.Object r12 = r5.LIZ(r11)
                if (r12 != r8) goto L80
                X.C1C7U.LIZIZ(r10)
                return r8
            L77:
                long r1 = r11.J$0
                java.lang.Object r5 = r11.L$0
                X.0WWy r5 = (X.InterfaceC824740WWy) r5
                X.C155000ia.LIZIZ(r12)
            L80:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r0 = r12.booleanValue()
                if (r0 == 0) goto Lb2
                java.lang.Object r9 = r5.next()
                com.ss.android.ugc.effectmanager.knadapt.KNMonitorService$Event r9 = (com.ss.android.ugc.effectmanager.knadapt.KNMonitorService.Event) r9
                long r3 = java.lang.System.currentTimeMillis()
                long r3 = r3 - r1
                r1 = 200(0xc8, double:9.9E-322)
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 >= 0) goto L1e
                long r1 = r1 - r3
                r11.L$0 = r5
                r11.L$1 = r9
                r11.label = r7
                java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r1, r11)
                if (r0 != r8) goto L1e
                X.C1C7U.LIZIZ(r10)
                return r8
            Laa:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            Lb2:
                kotlin.Unit r0 = kotlin.Unit.LIZ
                X.C1C7U.LIZIZ(r10)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.knadapt.KNMonitorService.C2326001.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public KNMonitorService(IMonitorService iMonitorService) {
        this.iMonitorService = iMonitorService;
        if (getUseNewRateLimit()) {
            startReportingLoop();
        }
    }

    private final boolean shouldReport(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.kLastReportTime.get();
        if (jCurrentTimeMillis - j < this.kMinIntervalMs) {
            return false;
        }
        return this.kLastReportTime.compareAndSet(j, jCurrentTimeMillis);
    }

    public static final class Event {
        public final Map<String, Object> logExtraMap;
        public final String serviceName;
        public final int status;

        public Event(String str, int i, Map<String, ? extends Object> map) {
            this.serviceName = str;
            this.status = i;
            this.logExtraMap = map;
        }
    }

    private final void monitorStatusRateNew(String str, int i, Map<String, ? extends Object> map) {
        C23250099c.LIZLLL(this.scope, null, null, new AnonymousClass1(str, i, map, null), 3);
    }

    private final void monitorStatusRateOld(String str, int i, Map<String, ? extends Object> map) throws JSONException {
        if (!shouldReport(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        this.iMonitorService.monitorStatusRate(str, i, jSONObject);
    }

    @Override // X.InterfaceC1633730scF
    public void monitorStatusRate(String str, int i, Map<String, ? extends Object> map) throws JSONException {
        if (getUseNewRateLimit()) {
            monitorStatusRateNew(str, i, map);
        } else {
            monitorStatusRateOld(str, i, map);
        }
    }
}
