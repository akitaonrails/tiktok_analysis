package ttpobfuscated;

import X.AbstractC23140094w;
import X.AbstractC842530X3j;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C13LE;
import X.C13LP;
import X.C1500770p9n;
import X.C155000ia;
import X.C1C7U;
import X.C2097608Jq;
import X.C786410Ut5;
import X.InterfaceC1364105Vn;
import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ttp.orbu.sdk.configuration.model.GeneralConfig;
import ttp.orbu.sdk.configuration.model.ServerAPIType;
import ttp.orbu.sdk.configuration.model.ServerConfig;
import ttp.orbu.sdk.logging.LogEntry;
import ttp.orbu.sdk.logging.LogParams;
import ttp.orbu.sdk.network.request.APILogEntry;
import ttp.orbu.sdk.network.request.APILogEntryBatch;
import ttp.orbu.sdk.network.request.APIPutLogsDetailsBody;
import ttp.orbu.sdk.network.request.APIPutLogsDetailsBodyKt;

/* JADX INFO: loaded from: classes24.dex */
public final class jc implements i9 {
    public final Context a;
    public final n1 b;
    public final w9 c;
    public final z8 d;
    public final Integer e;
    public final String f;
    public final cg g;
    public final String h = C13LE.LIZ(oc.class).LJI();

    public final ServerConfig a() {
        ServerConfig next;
        Iterator<ServerConfig> it2 = ((GeneralConfig) this.b.get()).getServerConfigs().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.name == ServerAPIType.LOGGING) {
                break;
            }
        }
        return next;
    }

    @C09DV(c = "ttp.orbu.sdk.app.data.repository.logging.RetrofitLoggingRepository", f = "RetrofitLoggingRepository.kt", l = {60}, m = "put")
    public final class a extends AbstractC23140094w {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C1C7U.LIZ("jc@11c0.a$1");
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            Object objA = jc.this.a((LogParams) null, this);
            C1C7U.LIZIZ("jc@11c0.a$1");
            return objA;
        }

        public a(InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.data.repository.logging.RetrofitLoggingRepository$put$2$ttpResult$1", f = "RetrofitLoggingRepository.kt", l = {61}, m = "invokeSuspend")
    public final class b extends C09AX implements Function1<InterfaceC1364105Vn<? super C1500770p9n<Unit>>, Object> {
        public int a;
        public final /* synthetic */ LogParams c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ APIPutLogsDetailsBody f;

        public final Object a(InterfaceC1364105Vn<? super C1500770p9n<Unit>> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return jc.this.new b(this.c, this.d, this.e, this.f, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function1
        public Object invoke(InterfaceC1364105Vn<? super C1500770p9n<Unit>> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("jc@11c0.a$2");
            Object objLJFF = C099R.LJFF();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                z8 z8Var = jc.this.d;
                LogParams logParams = this.c;
                String str = logParams.logId;
                Map<String, String> mapLJ = logParams.additionalHeaders;
                if (mapLJ == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                String str2 = this.d;
                String str3 = this.e;
                APIPutLogsDetailsBody aPIPutLogsDetailsBody = this.f;
                this.a = 1;
                obj = z8Var.a(mapLJ, str2, str3, str, aPIPutLogsDetailsBody, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("jc@11c0.a$2");
                    return objLJFF;
                }
            }
            C1C7U.LIZIZ("jc@11c0.a$2");
            return obj;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LogParams logParams, String str, String str2, APIPutLogsDetailsBody aPIPutLogsDetailsBody, InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
            super(1, interfaceC1364105Vn);
            this.c = logParams;
            this.d = str;
            this.e = str2;
            this.f = aPIPutLogsDetailsBody;
        }
    }

    public final String a(ServerConfig serverConfig) {
        String str;
        String str2 = this.f;
        if (str2 == null) {
            if (serverConfig == null || (str = serverConfig.apiVersionPathParameter) == null) {
                return "v1";
            }
            return str;
        }
        return str2;
    }

    public final int b(ServerConfig serverConfig) {
        Integer num = this.e;
        if (num != null || (serverConfig != null && (num = serverConfig.maxPayloadSizeInBytes) != null)) {
            return num.intValue();
        }
        return 65536;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067 A[Catch: all -> 0x009e, TryCatch #1 {all -> 0x009e, blocks: (B:19:0x005e, B:20:0x0061, B:22:0x0067, B:23:0x006d, B:24:0x009d), top: B:41:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d A[Catch: all -> 0x009e, TryCatch #1 {all -> 0x009e, blocks: (B:19:0x005e, B:20:0x0061, B:22:0x0067, B:23:0x006d, B:24:0x009d), top: B:41:0x005e }] */
    @Override // ttpobfuscated.i9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(ttp.orbu.sdk.logging.LogParams r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.jc.a(ttp.orbu.sdk.logging.LogParams, X.05Vn):java.lang.Object");
    }

    public final APIPutLogsDetailsBody a(LogParams logParams, ServerConfig serverConfig) {
        ArrayList arrayList = new ArrayList();
        APIPutLogsDetailsBody aPIPutLogsDetailsBody = new APIPutLogsDetailsBody("1.0", Collections.singletonList(new APILogEntryBatch(o3.a(this.g.a()), arrayList, logParams.source, logParams.subject, logParams.kind)));
        int size = logParams.logEntries.size();
        for (int i = 0; i < size; i++) {
            LogEntry logEntry = (LogEntry) ListProtector.get(logParams.logEntries, i);
            APILogEntry aPILogEntry = new APILogEntry(logEntry.data, logEntry.id, o3.c(logEntry.time, null, null, 3, null));
            if (!a(aPIPutLogsDetailsBody, aPILogEntry, serverConfig)) {
                break;
            }
            arrayList.add(aPILogEntry);
        }
        return aPIPutLogsDetailsBody;
    }

    public final boolean a(APIPutLogsDetailsBody aPIPutLogsDetailsBody, APILogEntry aPILogEntry, ServerConfig serverConfig) {
        List<APILogEntry> list;
        ArrayList arrayList;
        APILogEntryBatch aPILogEntryBatch = (APILogEntryBatch) C13LP.LJJJLZIJ(0, aPIPutLogsDetailsBody.logEntryBatches);
        if (aPILogEntryBatch != null && (list = aPILogEntryBatch.entries) != null && (arrayList = new ArrayList(list)) != null && (!arrayList.isEmpty())) {
            arrayList.add(aPILogEntry);
            if (AbstractC842530X3j.LIZJ(null, C786410Ut5.J3(APIPutLogsDetailsBodyKt.toJSONObject(aPIPutLogsDetailsBody.copy(aPIPutLogsDetailsBody.specversion, Collections.singletonList(aPILogEntryBatch.copy(aPILogEntryBatch.defaultlogentrytime, arrayList, aPILogEntryBatch.source, aPILogEntryBatch.subject, aPILogEntryBatch.type)))))).LIZIZ > b(serverConfig)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public jc(Context context, n1 n1Var, w9 w9Var, z8 z8Var, Integer num, String str, cg cgVar) {
        this.a = context;
        this.b = n1Var;
        this.c = w9Var;
        this.d = z8Var;
        this.e = num;
        this.f = str;
        this.g = cgVar;
    }
}
