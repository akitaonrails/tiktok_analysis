package com.ss.android.ugc.awemepushlib.interaction;

import X.C08JS;
import X.C09JN;
import X.C11S5;
import X.C1366305Wj;
import X.C2187451AjH;
import com.google.gson.n;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.awemepushapi.IPushOutReachApi;
import com.ss.android.ugc.awemepushlib.api.M2SignalUploadApi;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class PushOutReachService implements IPushOutReachApi {
    @Override // com.ss.android.ugc.awemepushapi.IPushOutReachApi
    public final void LIZ(String str, Map<String, Object> map) {
        int i = C2187451AjH.LIZ;
        map.put("timing", str);
        C1366305Wj c1366305Wj = M2SignalUploadApi.LIZ;
        n nVar = (n) C08JS.LIZ(C08JS.LIZLLL(map), n.class);
        c1366305Wj.getClass();
        C1366305Wj.LIZIZ.doUploadSignals(nVar).LJL(C11S5.LIZ()).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.05Gd
            @Override // X.C09JN
            public final void accept(Object obj) {
                boolean z;
                C1C7U.LIZ("PushOutReachService@a770.uploadM2Signals$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                int i2 = C2187451AjH.LIZ;
                if (baseResponse != null && baseResponse.status_code == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C1720106oR.LJI("out_reach", "uploadM2Signals()");
                } else {
                    C1720106oR.LJI("out_reach", "uploadM2Signals() - fail!");
                }
                C1C7U.LIZIZ("PushOutReachService@a770.uploadM2Signals$1");
            }
        }, new C09JN() { // from class: X.05Ge
            @Override // X.C09JN
            public final void accept(Object obj) {
                String message;
                C1C7U.LIZ("PushOutReachService@a770.uploadM2Signals$2");
                Throwable th = (Throwable) obj;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("uploadM2Signals() - error: ");
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                sbLIZ.append(message);
                C1720106oR.LIZ("out_reach", C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("PushOutReachService@a770.uploadM2Signals$2");
            }
        });
    }
}
