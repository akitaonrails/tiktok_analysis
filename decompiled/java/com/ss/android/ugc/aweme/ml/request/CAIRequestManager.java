package com.ss.android.ugc.aweme.ml.request;

import X.AbstractC842530X3j;
import X.C0R1F;
import X.C0X0P;
import X.C0X52;
import X.C0XMB;
import X.C11JF;
import X.C1494590ozp;
import X.C1499850p8J;
import X.C1510610pPf;
import X.C2097608Jq;
import X.C261470AMn;
import X.C786410Ut5;
import X.C842540X3k;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pspapi.IClientAiRequest;
import com.ss.android.ugc.aweme.pspapi.IPSPDataService;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class CAIRequestManager {
    public static final CAIRequestManager LIZ = new CAIRequestManager();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static C11JF LIZJ;

    public static void LIZ(Function1 function1) {
        final IPSPDataService iPSPDataService = (IPSPDataService) PluggableExtentionKt.pluggableSpi$default(IPSPDataService.class, false, false, false, 14, null);
        if (iPSPDataService == null) {
            return;
        }
        Map<String, Object> mapLJ = iPSPDataService.LJ();
        mapLJ.put("feature_req", C2097608Jq.LJI(new Pair("last_update_time", C0R1F.LIZIZ("feature_last_time"))));
        C842540X3k c842540X3kLIZJ = AbstractC842530X3j.LIZJ(C0X0P.LIZJ("application/json"), C786410Ut5.J3(new JSONObject(mapLJ)));
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(iPSPDataService.LIZIZ());
        c1499850p8JCreateBuilder.LIZJ(iPSPDataService.LIZJ());
        c1499850p8JCreateBuilder.LIZ(new InterfaceC1904907d9() { // from class: com.ss.android.ugc.aweme.ml.request.CAIRequestManager$clientAIRequestAllData$request$1
            @Override // X.InterfaceC1904907d9
            public final C0X52 intercept(InterfaceC841770X0l interfaceC841770X0l) {
                C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
                Request request = c1494590ozp.LIZJ;
                C0XMB c0xmbNewBuilder = request.newBuilder();
                c0xmbNewBuilder.LIZJ = iPSPDataService.LIZ();
                c0xmbNewBuilder.LIZIZ(request.getBody(), request.getMethod());
                return c1494590ozp.LIZ(c0xmbNewBuilder.LIZ());
            }
        });
        c1499850p8JCreateBuilder.LJIIIZ = ((Number) C261470AMn.LIZ.getValue()).intValue();
        iPSPDataService.LIZLLL(c842540X3kLIZJ, (IClientAiRequest) c1499850p8JCreateBuilder.build().retrofit.LIZ(IClientAiRequest.class), new C1510610pPf(function1));
    }
}
