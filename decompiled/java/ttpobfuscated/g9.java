package ttpobfuscated;

import X.C040I;
import X.C1500770p9n;
import X.C2097608Jq;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485605ri;
import X.InterfaceC1501110pAL;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501370pAl;
import java.util.Map;
import kotlin.Unit;
import ttp.orbu.sdk.network.request.APIPutLogsDetailsBody;

/* JADX INFO: loaded from: classes24.dex */
public interface g9 {
    @InterfaceC1501240pAY("{api_version_path_parameter}/apps/{app_id}/logs")
    Object a(@InterfaceC1501110pAL("api_version_path_parameter") String str, @InterfaceC1501110pAL("app_id") String str2, @C040I APIPutLogsDetailsBody aPIPutLogsDetailsBody, @InterfaceC1501120pAM("logId") String str3, @InterfaceC1485605ri Map<String, String> map, @InterfaceC1501370pAl("client_version") String str4, @InterfaceC1501370pAl("app_version") String str5, @InterfaceC1501370pAl("x_os") String str6, InterfaceC1364105Vn<? super C1500770p9n<Unit>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("20220930/logs")
    Object a(@C040I APIPutLogsDetailsBody aPIPutLogsDetailsBody, @InterfaceC1501120pAM("logId") String str, @InterfaceC1485605ri Map<String, String> map, InterfaceC1364105Vn<? super C1500770p9n<Unit>> interfaceC1364105Vn);

    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object a(g9 g9Var, APIPutLogsDetailsBody aPIPutLogsDetailsBody, String str, Map map, InterfaceC1364105Vn interfaceC1364105Vn, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    map = C2097608Jq.LJ();
                }
                return g9Var.a(aPIPutLogsDetailsBody, str, map, interfaceC1364105Vn);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pushLogsOld");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object a(g9 g9Var, String str, String str2, APIPutLogsDetailsBody aPIPutLogsDetailsBody, String str3, Map map, String str4, String str5, String str6, InterfaceC1364105Vn interfaceC1364105Vn, int i, Object obj) {
            if (obj == null) {
                if ((i & 16) != 0) {
                    map = C2097608Jq.LJ();
                }
                if ((i & 32) != 0) {
                    str4 = "0.17.0";
                }
                if ((i & 64) != 0) {
                    str5 = null;
                }
                if ((i & 128) != 0) {
                    str6 = "android";
                }
                return g9Var.a(str, str2, aPIPutLogsDetailsBody, str3, map, str4, str5, str6, interfaceC1364105Vn);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pushLogs");
        }
    }
}
