package com.ss.android.ugc.aweme.tracker;

import X.C054G;
import X.C09CT;
import X.C1103850epb;
import X.C1182980gtE;
import X.C1189060h32;
import X.C1196170hEV;
import X.C1201170hMZ;
import X.C2327809Ae;
import X.C644190POn;
import X.InterfaceC1201180hMa;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class LocationNetTracker {
    public static final /* synthetic */ int LIZ = 0;

    public static Double LIZ(Number number, Number number2) {
        if (number != null && number2 != null) {
            return Double.valueOf(number.doubleValue() - number2.doubleValue());
        }
        return null;
    }

    public static void LIZIZ(LocationNetRequestInfo locationNetRequestInfo, Function1 function1) {
        String string;
        Double dLIZ;
        Double dLJII;
        RequestLog requestLog;
        RequestLog.Timing timing;
        LocationNetRequestInfo locationNetRequestInfoLIZ = locationNetRequestInfo;
        C1182980gtE c1182980gtE = new C1182980gtE();
        function1.invoke(c1182980gtE);
        Long l = c1182980gtE.LIZ;
        Long l2 = c1182980gtE.LIZIZ;
        String str = c1182980gtE.LIZLLL;
        String str2 = c1182980gtE.LJ;
        InterfaceC1201180hMa interfaceC1201180hMa = c1182980gtE.LIZJ;
        Pair<String, String> pair = c1182980gtE.LJFF;
        Pair<String, String> pair2 = c1182980gtE.LJI;
        Pair<String, String> pair3 = c1182980gtE.LJII;
        Pair<String, String> pair4 = c1182980gtE.LJIIIIZZ;
        Integer num = c1182980gtE.LJIIIZ;
        Integer num2 = c1182980gtE.LJIIJ;
        Integer num3 = c1182980gtE.LJIIJJI;
        Integer num4 = c1182980gtE.LJIIL;
        String str3 = c1182980gtE.LJIILIIL;
        Map<String, ? extends Object> map = c1182980gtE.LJIILJJIL;
        C1201170hMZ c1201170hMZ = new C1201170hMZ(l, l2, str, str2, interfaceC1201180hMa, pair, pair2, pair3, pair4, num, num2, num3, num4, str3, map);
        boolean z = true;
        if (str3 == null || str3.length() <= 0) {
            str3 = "location_net_track";
        }
        if (!C1196170hEV.LIZIZ(str3, str2, null)) {
            return;
        }
        if (l == null || l2 == null || (interfaceC1201180hMa != null ? !(locationNetRequestInfoLIZ != null || (interfaceC1201180hMa != null && interfaceC1201180hMa.getRequestInfo() != null && (requestLog = interfaceC1201180hMa.getRequestLog()) != null && (timing = requestLog.timing) != null && timing.detailedDuration != null)) : locationNetRequestInfoLIZ == null)) {
            z = false;
        }
        if (!z) {
            C054G c054g = C1103850epb.LIZ;
            JSONObject jSONObject = new JSONObject();
            if (str2 != null) {
                C1189060h32.LJIL(jSONObject, "key", str2);
            }
            if (str != null) {
                C1189060h32.LJIL(jSONObject, "path", str);
            }
            if (pair != null) {
                C1189060h32.LJIL(jSONObject, "key1", pair.getFirst());
                C1189060h32.LJIL(jSONObject, "value1", pair.getSecond());
                C1189060h32.LJIL(jSONObject, pair.getFirst(), pair.getSecond());
            }
            if (pair2 != null) {
                C1189060h32.LJIL(jSONObject, "key2", pair2.getFirst());
                C1189060h32.LJIL(jSONObject, "value2", pair2.getSecond());
                C1189060h32.LJIL(jSONObject, pair2.getFirst(), pair2.getSecond());
            }
            if (pair3 != null) {
                C1189060h32.LJIL(jSONObject, "key3", pair3.getFirst());
                C1189060h32.LJIL(jSONObject, "value3", pair3.getSecond());
                C1189060h32.LJIL(jSONObject, pair3.getFirst(), pair3.getSecond());
            }
            if (pair4 != null) {
                C1189060h32.LJIL(jSONObject, "key4", pair4.getFirst());
                C1189060h32.LJIL(jSONObject, "value4", pair4.getSecond());
                C1189060h32.LJIL(jSONObject, pair4.getFirst(), pair4.getSecond());
            }
            if (num != null) {
                C1189060h32.LJIL(jSONObject, "value_int1", Integer.valueOf(num.intValue()));
            }
            if (num2 != null) {
                C1189060h32.LJIL(jSONObject, "value_int2", Integer.valueOf(num2.intValue()));
            }
            if (num3 != null) {
                C1189060h32.LJIL(jSONObject, "value_int3", Integer.valueOf(num3.intValue()));
            }
            if (num4 != null) {
                C1189060h32.LJIL(jSONObject, "value_int4", Integer.valueOf(num4.intValue()));
            }
            if (map != null) {
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    C1189060h32.LJIL(jSONObject, entry.getKey(), entry.getValue());
                }
            }
            Long l3 = c1201170hMZ.LIZ;
            if (l3 != null) {
                long jLongValue = l3.longValue();
                Long l4 = c1201170hMZ.LIZIZ;
                if (l4 != null) {
                    C1189060h32.LJIL(jSONObject, "end_to_end_latency", String.valueOf(l4.longValue() - jLongValue));
                }
            }
            C1103850epb.LIZ(str3, jSONObject);
            return;
        }
        if (l != null) {
            long jLongValue2 = l.longValue();
            if (l2 != null) {
                long jLongValue3 = l2.longValue();
                if (locationNetRequestInfoLIZ == null && (locationNetRequestInfoLIZ = C644190POn.LIZ(interfaceC1201180hMa)) == null) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                Long l5 = locationNetRequestInfoLIZ.totalTime;
                C1189060h32.LJIL(jSONObject2, "timing_total", String.valueOf(l5));
                long j = jLongValue3 - jLongValue2;
                C1189060h32.LJIL(jSONObject2, "end_to_end_latency", String.valueOf(j));
                Double dLIZ2 = LIZ(Long.valueOf(j), l5);
                if (dLIZ2 != null) {
                    string = dLIZ2.toString();
                } else {
                    string = null;
                }
                C1189060h32.LJIL(jSONObject2, "client_cost", string);
                Long l6 = locationNetRequestInfoLIZ.appLevelRequestStart;
                if (l6 != null) {
                    dLIZ = LIZ(l6, Long.valueOf(jLongValue2));
                } else {
                    dLIZ = null;
                }
                C1189060h32.LJIL(jSONObject2, "net_before_request", String.valueOf(dLIZ));
                C1189060h32.LJIL(jSONObject2, "net_before_intercept", String.valueOf(LIZ(locationNetRequestInfoLIZ.beforeAllInterceptors, locationNetRequestInfoLIZ.appLevelRequestStart)));
                C1189060h32.LJIL(jSONObject2, "net_intercept", String.valueOf(LIZ(locationNetRequestInfoLIZ.requestStart, locationNetRequestInfoLIZ.beforeAllInterceptors)));
                C1189060h32.LJIL(jSONObject2, "net_first_byte", String.valueOf(LIZ(locationNetRequestInfoLIZ.responseBack, locationNetRequestInfoLIZ.requestStart)));
                C1189060h32.LJIL(jSONObject2, "net_after_response", String.valueOf(LIZ(locationNetRequestInfoLIZ.requestEnd, locationNetRequestInfoLIZ.responseBack)));
                C1189060h32.LJIL(jSONObject2, "net_send_time", locationNetRequestInfoLIZ.sendTime);
                C1189060h32.LJIL(jSONObject2, "net_receive_time", locationNetRequestInfoLIZ.receiveTime);
                C1189060h32.LJIL(jSONObject2, "net_send_bytes", locationNetRequestInfoLIZ.sentByteCount);
                C1189060h32.LJIL(jSONObject2, "net_rev_bytes", locationNetRequestInfoLIZ.receivedByteCount);
                C1189060h32.LJIL(jSONObject2, "inner", locationNetRequestInfoLIZ.inner);
                String str4 = locationNetRequestInfoLIZ.inner;
                if (str4 != null) {
                    dLJII = C2327809Ae.LJII(str4);
                } else {
                    dLJII = null;
                }
                C1189060h32.LJIL(jSONObject2, "timing_net", LIZ(l5, dLJII));
                C1189060h32.LJIL(jSONObject2, "dns", locationNetRequestInfoLIZ.dns);
                C1189060h32.LJIL(jSONObject2, "rtt", locationNetRequestInfoLIZ.rtt);
                C1189060h32.LJIL(jSONObject2, "send", locationNetRequestInfoLIZ.send);
                C1189060h32.LJIL(jSONObject2, "ssl", locationNetRequestInfoLIZ.ssl);
                C1189060h32.LJIL(jSONObject2, "tcp", locationNetRequestInfoLIZ.tcp);
                C1189060h32.LJIL(jSONObject2, "ttfb", locationNetRequestInfoLIZ.ttfb);
                if (pair != null) {
                    C1189060h32.LJIL(jSONObject2, "key1", pair.getFirst());
                    C1189060h32.LJIL(jSONObject2, "value1", pair.getSecond());
                    C1189060h32.LJIL(jSONObject2, pair.getFirst(), pair.getSecond());
                }
                if (pair2 != null) {
                    C1189060h32.LJIL(jSONObject2, "key2", pair2.getFirst());
                    C1189060h32.LJIL(jSONObject2, "value2", pair2.getSecond());
                    C1189060h32.LJIL(jSONObject2, pair2.getFirst(), pair2.getSecond());
                }
                if (pair3 != null) {
                    C1189060h32.LJIL(jSONObject2, "key3", pair3.getFirst());
                    C1189060h32.LJIL(jSONObject2, "value3", pair3.getSecond());
                    C1189060h32.LJIL(jSONObject2, pair3.getFirst(), pair3.getSecond());
                }
                if (pair4 != null) {
                    C1189060h32.LJIL(jSONObject2, "key4", pair4.getFirst());
                    C1189060h32.LJIL(jSONObject2, "value4", pair4.getSecond());
                    C1189060h32.LJIL(jSONObject2, pair4.getFirst(), pair4.getSecond());
                }
                if (num != null) {
                    C1189060h32.LJIL(jSONObject2, "value_int1", Integer.valueOf(num.intValue()));
                }
                if (num2 != null) {
                    C1189060h32.LJIL(jSONObject2, "value_int2", Integer.valueOf(num2.intValue()));
                }
                if (num3 != null) {
                    C1189060h32.LJIL(jSONObject2, "value_int3", Integer.valueOf(num3.intValue()));
                }
                if (num4 != null) {
                    C1189060h32.LJIL(jSONObject2, "value_int4", Integer.valueOf(num4.intValue()));
                }
                if (str2 != null) {
                    C1189060h32.LJIL(jSONObject2, "key", str2);
                }
                if (str != null) {
                    C1189060h32.LJIL(jSONObject2, "path", str);
                }
                if (map != null) {
                    for (Map.Entry<String, ? extends Object> entry2 : map.entrySet()) {
                        C1189060h32.LJIL(jSONObject2, entry2.getKey(), entry2.getValue());
                    }
                }
                C1103850epb.LIZ(str3, jSONObject2);
            }
        }
    }

    public static final class LocationNetRequestInfo {
        public static final /* synthetic */ int LIZ = 0;

        @C09CT("app_level_request_start")
        public final Long appLevelRequestStart;

        @C09CT("before_all_interceptors")
        public final Long beforeAllInterceptors;

        @C09CT("dns")
        public final String dns;

        @C09CT("inner")
        public final String inner;

        @C09CT("receive_time")
        public final Long receiveTime;

        @C09CT("received_byte_count")
        public final Long receivedByteCount;

        @C09CT("request_end")
        public final Long requestEnd;

        @C09CT("request_start")
        public final Long requestStart;

        @C09CT("response_back")
        public final Long responseBack;

        @C09CT("rtt")
        public final String rtt;

        @C09CT("send")
        public final String send;

        @C09CT("send_time")
        public final Long sendTime;

        @C09CT("sent_byte_count")
        public final Long sentByteCount;

        @C09CT("ssl")
        public final String ssl;

        @C09CT("tcp")
        public final String tcp;

        @C09CT("timing_total")
        public final Long totalTime;

        @C09CT("ttfb")
        public final String ttfb;

        public LocationNetRequestInfo() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocationNetRequestInfo)) {
                return false;
            }
            LocationNetRequestInfo locationNetRequestInfo = (LocationNetRequestInfo) obj;
            return Intrinsics.LJFF(this.totalTime, locationNetRequestInfo.totalTime) && Intrinsics.LJFF(this.appLevelRequestStart, locationNetRequestInfo.appLevelRequestStart) && Intrinsics.LJFF(this.beforeAllInterceptors, locationNetRequestInfo.beforeAllInterceptors) && Intrinsics.LJFF(this.requestStart, locationNetRequestInfo.requestStart) && Intrinsics.LJFF(this.responseBack, locationNetRequestInfo.responseBack) && Intrinsics.LJFF(this.requestEnd, locationNetRequestInfo.requestEnd) && Intrinsics.LJFF(this.sendTime, locationNetRequestInfo.sendTime) && Intrinsics.LJFF(this.receiveTime, locationNetRequestInfo.receiveTime) && Intrinsics.LJFF(this.sentByteCount, locationNetRequestInfo.sentByteCount) && Intrinsics.LJFF(this.receivedByteCount, locationNetRequestInfo.receivedByteCount) && Intrinsics.LJFF(this.inner, locationNetRequestInfo.inner) && Intrinsics.LJFF(this.dns, locationNetRequestInfo.dns) && Intrinsics.LJFF(this.rtt, locationNetRequestInfo.rtt) && Intrinsics.LJFF(this.send, locationNetRequestInfo.send) && Intrinsics.LJFF(this.ssl, locationNetRequestInfo.ssl) && Intrinsics.LJFF(this.tcp, locationNetRequestInfo.tcp) && Intrinsics.LJFF(this.ttfb, locationNetRequestInfo.ttfb);
        }

        public final String toString() {
            return "LocationNetRequestInfo(totalTime=" + this.totalTime + ", appLevelRequestStart=" + this.appLevelRequestStart + ", beforeAllInterceptors=" + this.beforeAllInterceptors + ", requestStart=" + this.requestStart + ", responseBack=" + this.responseBack + ", requestEnd=" + this.requestEnd + ", sendTime=" + this.sendTime + ", receiveTime=" + this.receiveTime + ", sentByteCount=" + this.sentByteCount + ", receivedByteCount=" + this.receivedByteCount + ", inner=" + this.inner + ", dns=" + this.dns + ", rtt=" + this.rtt + ", send=" + this.send + ", ssl=" + this.ssl + ", tcp=" + this.tcp + ", ttfb=" + this.ttfb + ')';
        }

        public LocationNetRequestInfo(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.totalTime = l;
            this.appLevelRequestStart = l2;
            this.beforeAllInterceptors = l3;
            this.requestStart = l4;
            this.responseBack = l5;
            this.requestEnd = l6;
            this.sendTime = l7;
            this.receiveTime = l8;
            this.sentByteCount = l9;
            this.receivedByteCount = l10;
            this.inner = str;
            this.dns = str2;
            this.rtt = str3;
            this.send = str4;
            this.ssl = str5;
            this.tcp = str6;
            this.ttfb = str7;
        }
    }
}
