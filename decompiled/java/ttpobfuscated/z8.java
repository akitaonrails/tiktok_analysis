package ttpobfuscated;

import X.C040I;
import X.C1500770p9n;
import X.C2097608Jq;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485605ri;
import X.InterfaceC1501110pAL;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501240pAY;
import java.util.Map;
import kotlin.Unit;
import ttp.orbu.sdk.network.request.APIPutLogsDetailsBody;

/* JADX INFO: loaded from: classes24.dex */
public interface z8 {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
    }

    @InterfaceC1501240pAY("{api_version}/apps/{app_id}/logs")
    Object a(@InterfaceC1485605ri Map<String, String> map, @InterfaceC1501110pAL("api_version") String str, @InterfaceC1501110pAL("app_id") String str2, @InterfaceC1501120pAM("logId") String str3, @C040I APIPutLogsDetailsBody aPIPutLogsDetailsBody, InterfaceC1364105Vn<? super C1500770p9n<Unit>> interfaceC1364105Vn);

    public static final class b {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object a(z8 z8Var, Map map, String str, String str2, String str3, APIPutLogsDetailsBody aPIPutLogsDetailsBody, InterfaceC1364105Vn interfaceC1364105Vn, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    map = C2097608Jq.LJ();
                }
                if ((i & 2) != 0) {
                    str = "v1";
                }
                if ((i & 8) != 0) {
                    str3 = "logId1";
                }
                return z8Var.a(map, str, str2, str3, aPIPutLogsDetailsBody, interfaceC1364105Vn);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: put");
        }
    }
}
