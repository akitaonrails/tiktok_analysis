package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network;

import X.C09CT;
import X.C0X52;
import X.C13LP;
import X.C13LQ;
import X.C1494590ozp;
import X.C1494690ozz;
import X.C196200pE;
import X.C2188811AlT;
import X.C337490DKx;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import android.os.SystemClock;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network.experiment.UcpNetworkRequestFailedExperimentConfig;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class NetworkMetricsInterceptor implements InterfaceC1904907d9 {
    public static final Set<String> LL = C13LQ.LJLIIL(new String[]{"authorization", "shopify-buyer-ip"});

    /* JADX INFO: loaded from: classes.dex */
    public static final class JsonRpcParamsDto {

        @C09CT("name")
        public final String name;

        public JsonRpcParamsDto() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof JsonRpcParamsDto) && Intrinsics.LJFF(this.name, ((JsonRpcParamsDto) obj).name);
        }

        public final int hashCode() {
            String str = this.name;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("JsonRpcParamsDto(name=");
            sbLIZ.append(this.name);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public JsonRpcParamsDto(String str) {
            this.name = str;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class JsonRpcRequestDto {

        @C09CT("params")
        public final JsonRpcParamsDto params;

        public JsonRpcRequestDto() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof JsonRpcRequestDto) && Intrinsics.LJFF(this.params, ((JsonRpcRequestDto) obj).params);
        }

        public final int hashCode() {
            JsonRpcParamsDto jsonRpcParamsDto = this.params;
            if (jsonRpcParamsDto == null) {
                return 0;
            }
            return jsonRpcParamsDto.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("JsonRpcRequestDto(params=");
            sbLIZ.append(this.params);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public JsonRpcRequestDto(JsonRpcParamsDto jsonRpcParamsDto) {
            this.params = jsonRpcParamsDto;
        }
    }

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) throws Exception {
        C0X52<?> c0x52LIZ;
        long jElapsedRealtime;
        boolean z;
        Integer numValueOf;
        String str;
        Request request = ((C1494590ozp) interfaceC841770X0l).LIZJ;
        String host = request.getHost();
        String str2 = "";
        if (host == null) {
            host = "";
        }
        String path = request.getPath();
        if (path != null) {
            str2 = path;
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        try {
            c0x52LIZ = ((C1494590ozp) interfaceC841770X0l).LIZ(request);
            jElapsedRealtime = SystemClock.elapsedRealtime() - jElapsedRealtime2;
            if (c0x52LIZ.LIZJ()) {
                z = true;
            } else {
                z = false;
            }
            numValueOf = Integer.valueOf(c0x52LIZ.LIZ.LIZIZ);
            if (!z) {
                str = c0x52LIZ.LIZ.LJI;
            } else {
                str = null;
            }
        } catch (C1494690ozz e) {
            e = e;
        } catch (Exception e2) {
            e = e2;
        }
        try {
            C337490DKx.LIZ(host, str2, z, jElapsedRealtime, numValueOf, str, "response");
            if (!z) {
                LIZJ(this, request, c0x52LIZ, null, 4);
                return c0x52LIZ;
            }
            return c0x52LIZ;
        } catch (C1494690ozz e3) {
            e = e3;
            TryCatchGuardChecker.doCheck(e);
            C337490DKx.LIZ(host, str2, false, SystemClock.elapsedRealtime() - jElapsedRealtime2, Integer.valueOf(e.getStatusCode()), e.getMessage(), "cronet_exception");
            LIZJ(this, request, null, e, 2);
            throw e;
        } catch (Exception e4) {
            e = e4;
            TryCatchGuardChecker.doCheck(e);
            C337490DKx.LIZ(host, str2, false, SystemClock.elapsedRealtime() - jElapsedRealtime2, null, e.getMessage(), "exception");
            LIZJ(this, request, null, e, 2);
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(com.bytedance.retrofit2.client.Request r9, kotlin.jvm.internal.AwS548S0100000_4 r10) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network.NetworkMetricsInterceptor.LIZ(com.bytedance.retrofit2.client.Request, kotlin.jvm.internal.AwS548S0100000_4):java.lang.String");
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class RequestInfo {

        @C09CT("body")
        public final String body;

        @C09CT("header")
        public final Map<String, String> header;

        @C09CT("query")
        public final Map<String, String> query;

        public RequestInfo() {
            this(null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestInfo)) {
                return false;
            }
            RequestInfo requestInfo = (RequestInfo) obj;
            return Intrinsics.LJFF(this.header, requestInfo.header) && Intrinsics.LJFF(this.query, requestInfo.query) && Intrinsics.LJFF(this.body, requestInfo.body);
        }

        public final int hashCode() {
            Map<String, String> map = this.header;
            int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
            Map<String, String> map2 = this.query;
            int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
            String str = this.body;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RequestInfo(header=");
            sbLIZ.append(this.header);
            sbLIZ.append(", query=");
            sbLIZ.append(this.query);
            sbLIZ.append(", body=");
            sbLIZ.append(this.body);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public RequestInfo(Map<String, String> map, Map<String, String> map2, String str) {
            this.header = map;
            this.query = map2;
            this.body = str;
        }
    }

    public static String LIZIZ(Integer num, String str, String str2, String str3, String str4) {
        ArrayList arrayList = new ArrayList(5);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("host: ");
        sbLIZ.append(str);
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("path: ");
        sbLIZ2.append(str2);
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ2));
        if (str3 != null && str3.length() > 0) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("tool_name: ");
            sbLIZ3.append(str3);
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ3));
        }
        C196200pE.LIZ.getClass();
        if (((UcpNetworkRequestFailedExperimentConfig) C196200pE.LIZJ.getValue()).enableFullSubtitle == 1) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("error_type: ");
            sbLIZ4.append(str4);
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ4));
            if (num != null) {
                int iIntValue = num.intValue();
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("code: ");
                sbLIZ5.append(iIntValue);
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ5));
            }
        }
        return C13LP.LJJLIIIJ(arrayList, " ", null, null, 0, null, null, 62);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0147 A[Catch: Exception -> 0x01c2, TryCatch #0 {Exception -> 0x01c2, blocks: (B:9:0x0010, B:13:0x001a, B:16:0x0021, B:18:0x0048, B:20:0x0050, B:22:0x005a, B:24:0x005e, B:25:0x0060, B:27:0x0070, B:29:0x0076, B:31:0x007c, B:33:0x0082, B:35:0x0088, B:37:0x008e, B:39:0x0094, B:41:0x009a, B:45:0x00b5, B:47:0x00bb, B:49:0x00c2, B:51:0x00c8, B:53:0x00cf, B:55:0x00e1, B:56:0x00e5, B:58:0x00eb, B:60:0x00fd, B:62:0x0101, B:74:0x0130, B:75:0x013d, B:77:0x0147, B:79:0x014d, B:81:0x0154, B:83:0x015a, B:84:0x015f, B:86:0x0165, B:88:0x0172, B:89:0x0177, B:92:0x0197, B:95:0x01a2, B:98:0x01ad, B:64:0x0106, B:66:0x010a, B:69:0x0123), top: B:103:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0154 A[Catch: Exception -> 0x01c2, TryCatch #0 {Exception -> 0x01c2, blocks: (B:9:0x0010, B:13:0x001a, B:16:0x0021, B:18:0x0048, B:20:0x0050, B:22:0x005a, B:24:0x005e, B:25:0x0060, B:27:0x0070, B:29:0x0076, B:31:0x007c, B:33:0x0082, B:35:0x0088, B:37:0x008e, B:39:0x0094, B:41:0x009a, B:45:0x00b5, B:47:0x00bb, B:49:0x00c2, B:51:0x00c8, B:53:0x00cf, B:55:0x00e1, B:56:0x00e5, B:58:0x00eb, B:60:0x00fd, B:62:0x0101, B:74:0x0130, B:75:0x013d, B:77:0x0147, B:79:0x014d, B:81:0x0154, B:83:0x015a, B:84:0x015f, B:86:0x0165, B:88:0x0172, B:89:0x0177, B:92:0x0197, B:95:0x01a2, B:98:0x01ad, B:64:0x0106, B:66:0x010a, B:69:0x0123), top: B:103:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0165 A[Catch: Exception -> 0x01c2, TryCatch #0 {Exception -> 0x01c2, blocks: (B:9:0x0010, B:13:0x001a, B:16:0x0021, B:18:0x0048, B:20:0x0050, B:22:0x005a, B:24:0x005e, B:25:0x0060, B:27:0x0070, B:29:0x0076, B:31:0x007c, B:33:0x0082, B:35:0x0088, B:37:0x008e, B:39:0x0094, B:41:0x009a, B:45:0x00b5, B:47:0x00bb, B:49:0x00c2, B:51:0x00c8, B:53:0x00cf, B:55:0x00e1, B:56:0x00e5, B:58:0x00eb, B:60:0x00fd, B:62:0x0101, B:74:0x0130, B:75:0x013d, B:77:0x0147, B:79:0x014d, B:81:0x0154, B:83:0x015a, B:84:0x015f, B:86:0x0165, B:88:0x0172, B:89:0x0177, B:92:0x0197, B:95:0x01a2, B:98:0x01ad, B:64:0x0106, B:66:0x010a, B:69:0x0123), top: B:103:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network.NetworkMetricsInterceptor r13, com.bytedance.retrofit2.client.Request r14, X.C0X52 r15, java.lang.Throwable r16, int r17) {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network.NetworkMetricsInterceptor.LIZJ(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network.NetworkMetricsInterceptor, com.bytedance.retrofit2.client.Request, X.0X52, java.lang.Throwable, int):void");
    }
}
