package ttpobfuscated;

import X.AbstractC842530X3j;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C13LP;
import X.C1500770p9n;
import X.C155000ia;
import X.C1697810uHb;
import X.C1C7U;
import X.C2097608Jq;
import X.C786410Ut5;
import X.C842540X3k;
import X.InterfaceC1364105Vn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ttp.orbu.sdk.app.domain.usecase.TTPResult;
import ttp.orbu.sdk.configuration.model.ServerAPIType;
import ttp.orbu.sdk.logging.LogEntry;
import ttp.orbu.sdk.logging.LogParams;
import ttp.orbu.sdk.network.request.APILogEntry;
import ttp.orbu.sdk.network.request.APILogEntryBatch;
import ttp.orbu.sdk.network.request.APIPutLogsDetailsBody;
import ttp.orbu.sdk.network.request.APIPutLogsDetailsBodyKt;
import ttpobfuscated.g9;

/* JADX INFO: loaded from: classes24.dex */
public class kc implements j9 {
    public final w9 a;
    public final g9 b;
    public final yd c;
    public final String d;

    public Integer a() {
        return this.c.a(ServerAPIType.LOGGING).maxPayloadSizeInBytes;
    }

    @C09DV(c = "ttp.orbu.sdk.logging.RetrofitLoggingRepository$putLogs$2", f = "RetrofitLoggingRepository.kt", l = {41, 53}, m = "invokeSuspend")
    public final class a extends C09AX implements Function1<InterfaceC1364105Vn<? super C1500770p9n<Unit>>, Object> {
        public int a;
        public final /* synthetic */ APIPutLogsDetailsBody c;
        public final /* synthetic */ LogParams d;

        public final Object a(InterfaceC1364105Vn<? super C1500770p9n<Unit>> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return kc.this.new a(this.c, this.d, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function1
        public Object invoke(InterfaceC1364105Vn<? super C1500770p9n<Unit>> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            Object objA = obj;
            C1C7U.LIZ("kc@11a1.a$1");
            Object objLJFF = C099R.LJFF();
            int i = this.a;
            if (i != 0) {
                if (i == 1 || i == 2) {
                    C155000ia.LIZIZ(objA);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objA);
                kc kcVar = kc.this;
                g9 g9Var = kcVar.b;
                String str = kcVar.c.a(ServerAPIType.LOGGING).apiVersionPathParameter;
                if (str == null) {
                    str = "v1";
                }
                String str2 = kc.this.d;
                APIPutLogsDetailsBody aPIPutLogsDetailsBody = this.c;
                LogParams logParams = this.d;
                String str3 = logParams.logId;
                Map<String, String> mapLJ = logParams.additionalHeaders;
                if (mapLJ == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                v3.s.getClass();
                String strA = x3.a(v3.u.h());
                this.a = 1;
                objA = g9.a.a(g9Var, str, str2, aPIPutLogsDetailsBody, str3, mapLJ, null, strA, null, this, 160, null);
                if (objA == objLJFF) {
                    C1C7U.LIZIZ("kc@11a1.a$1");
                    return objLJFF;
                }
            }
            C1C7U.LIZIZ("kc@11a1.a$1");
            return objA;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(APIPutLogsDetailsBody aPIPutLogsDetailsBody, LogParams logParams, InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(1, interfaceC1364105Vn);
            this.c = aPIPutLogsDetailsBody;
            this.d = logParams;
        }
    }

    public final APIPutLogsDetailsBody a(LogParams logParams) {
        ArrayList arrayList = new ArrayList();
        APIPutLogsDetailsBody aPIPutLogsDetailsBody = new APIPutLogsDetailsBody("1.0", Collections.singletonList(new APILogEntryBatch(o3.a(), arrayList, logParams.source, logParams.subject, logParams.kind)));
        int i = 0;
        for (LogEntry logEntry : logParams.logEntries) {
            int i2 = i + 1;
            if (i >= 0) {
                LogEntry logEntry2 = logEntry;
                APILogEntry aPILogEntry = new APILogEntry(logEntry2.data, logEntry2.id, o3.c(logEntry2.time, null, null, 3, null));
                if (a(aPIPutLogsDetailsBody, aPILogEntry)) {
                    arrayList.add(aPILogEntry);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return aPIPutLogsDetailsBody;
    }

    public final boolean a(APIPutLogsDetailsBody aPIPutLogsDetailsBody, APILogEntry aPILogEntry) {
        List<APILogEntry> list;
        ArrayList arrayList;
        APILogEntryBatch aPILogEntryBatch = (APILogEntryBatch) C13LP.LJJJLZIJ(0, aPIPutLogsDetailsBody.logEntryBatches);
        if (aPILogEntryBatch != null && (list = aPILogEntryBatch.entries) != null && (arrayList = new ArrayList(list)) != null && (!arrayList.isEmpty())) {
            arrayList.add(aPILogEntry);
            C842540X3k c842540X3kLIZJ = AbstractC842530X3j.LIZJ(null, C786410Ut5.J3(APIPutLogsDetailsBodyKt.toJSONObject(aPIPutLogsDetailsBody.copy(aPIPutLogsDetailsBody.specversion, Collections.singletonList(aPILogEntryBatch.copy(aPILogEntryBatch.defaultlogentrytime, arrayList, aPILogEntryBatch.source, aPILogEntryBatch.subject, aPILogEntryBatch.type))))));
            if (a() != null) {
                if (c842540X3kLIZJ.LIZIZ > r0.intValue()) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // ttpobfuscated.j9
    public Object a(LogParams logParams, InterfaceC1364105Vn<? super TTPResult<Unit>> interfaceC1364105Vn) {
        return a(this, logParams, interfaceC1364105Vn);
    }

    public static /* synthetic */ Object a(kc kcVar, LogParams logParams, InterfaceC1364105Vn<? super TTPResult<Unit>> interfaceC1364105Vn) {
        return kcVar.a.a(kcVar.new a(kcVar.a(logParams), logParams, null), interfaceC1364105Vn);
    }

    public kc(w9 w9Var, g9 g9Var, yd ydVar, String str) {
        this.a = w9Var;
        this.b = g9Var;
        this.c = ydVar;
        this.d = str;
    }
}
