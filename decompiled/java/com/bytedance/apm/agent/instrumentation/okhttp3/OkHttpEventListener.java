package com.bytedance.apm.agent.instrumentation.okhttp3;

import X.AbstractC1494940p0O;
import X.C0WZX;
import X.C0X1V;
import X.C0XLY;
import X.C1495740p1g;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C786970Utz;
import X.C792400V6o;
import X.EnumC847200XLi;
import X.InterfaceC1495030p0X;
import X.InterfaceC1495580p1Q;
import com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.Request;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class OkHttpEventListener extends AbstractC1494940p0O {
    public static String sIgnoreMonitorLabel;
    public long connectStartTime;
    public long dnsStartTime;
    public boolean needToDeal = true;
    public OkHttpRecord okHttpRecord = new OkHttpRecord();
    public AbstractC1494940p0O originListener;
    public long requestBodyEndTime;
    public JSONObject requestHeader;
    public long requestHeadersEndTime;
    public long requestHeadersStartTime;
    public long responseBodyStartTime;
    public JSONObject responseHeader;
    public long responseHeadersStartTime;
    public long secureConnectStartTime;
    public String url;

    private void record() {
        OkHttpRecord okHttpRecord;
        if (this.needToDeal && (okHttpRecord = this.okHttpRecord) != null) {
            okHttpRecord.timeRequest.duration = System.currentTimeMillis() - this.okHttpRecord.timeRequest.start_time;
            try {
                JSONObject jSONObject = new JSONObject(this.okHttpRecord.toString());
                jSONObject.put("timing_totalSendBytes", this.okHttpRecord.recordResponse.sent_bytes);
                jSONObject.put("timing_totalReceivedBytes", this.okHttpRecord.recordResponse.received_bytes);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("request_log", jSONObject);
                jSONObject2.put("net_consume_type", "okhttp");
                JSONObject jSONObject3 = this.requestHeader;
                jSONObject2.put("requestHeader", jSONObject3 != null ? C786410Ut5.J3(jSONObject3) : "");
                JSONObject jSONObject4 = this.responseHeader;
                jSONObject2.put("responseHeader", jSONObject4 != null ? C786410Ut5.J3(jSONObject4) : "");
                OkHttpRecord okHttpRecord2 = this.okHttpRecord;
                OkHttpRecord.TimeRequest timeRequest = okHttpRecord2.timeRequest;
                MonitorTool.monitorSLA(timeRequest.duration, timeRequest.start_time, this.url, okHttpRecord2.socketInfo.remote, "", okHttpRecord2.recordResponse.code, jSONObject2);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public OkHttpEventListener(AbstractC1494940p0O abstractC1494940p0O) {
        this.originListener = abstractC1494940p0O;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void dealSpecialHeader(X.C0XLY r13) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpEventListener.dealSpecialHeader(X.0XLY):void");
    }

    private JSONObject getHeaders(C0X1V c0x1v) {
        JSONObject jSONObject = new JSONObject();
        if (c0x1v != null) {
            try {
                for (String str : c0x1v.LJFF()) {
                    try {
                        jSONObject.put(str, c0x1v.LIZLLL(str));
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return jSONObject;
    }

    public static void setIgnoreMonitorLabel(String str) {
        sIgnoreMonitorLabel = str;
    }

    @Override // X.AbstractC1494940p0O
    public void callEnd(InterfaceC1495580p1Q interfaceC1495580p1Q) {
        super.callEnd(interfaceC1495580p1Q);
        AbstractC1494940p0O abstractC1494940p0O = this.originListener;
        if (abstractC1494940p0O != null) {
            abstractC1494940p0O.callEnd(interfaceC1495580p1Q);
        }
        record();
    }

    @Override // X.AbstractC1494940p0O
    public void callStart(InterfaceC1495580p1Q interfaceC1495580p1Q) {
        super.callStart(interfaceC1495580p1Q);
        AbstractC1494940p0O abstractC1494940p0O = this.originListener;
        if (abstractC1494940p0O != null) {
            abstractC1494940p0O.callStart(interfaceC1495580p1Q);
        }
        if (this.needToDeal) {
            this.okHttpRecord.timeRequest.start_time = System.currentTimeMillis();
        }
    }

    @Override // X.AbstractC1494940p0O
    public void requestBodyStart(InterfaceC1495580p1Q interfaceC1495580p1Q) {
        super.requestBodyStart(interfaceC1495580p1Q);
        AbstractC1494940p0O abstractC1494940p0O = this.originListener;
        if (abstractC1494940p0O != null) {
            abstractC1494940p0O.requestBodyStart(interfaceC1495580p1Q);
        }
    }

    @Override // X.AbstractC1494940p0O
    public void requestHeadersStart(InterfaceC1495580p1Q interfaceC1495580p1Q) {
        super.requestHeadersStart(interfaceC1495580p1Q);
        if (this.needToDeal) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.requestHeadersStartTime = jCurrentTimeMillis;
            this.okHttpRecord.timeRequest.request_sent_time = jCurrentTimeMillis;
        }
        AbstractC1494940p0O abstractC1494940p0O = this.originListener;
        if (abstractC1494940p0O != null) {
            abstractC1494940p0O.requestHeadersStart(interfaceC1495580p1Q);
        }
    }

    @Override // X.AbstractC1494940p0O
    public void responseBodyStart(InterfaceC1495580p1Q interfaceC1495580p1Q) {
        super.responseBodyStart(interfaceC1495580p1Q);
        if (this.needToDeal) {
            this.responseBodyStartTime = System.currentTimeMillis();
        }
        AbstractC1494940p0O abstractC1494940p0O = this.originListener;
        if (abstractC1494940p0O != null) {
            abstractC1494940p0O.responseBodyStart(interfaceC1495580p1Q);
        }
    }

    @Override // X.AbstractC1494940p0O
    public void responseHeadersStart(InterfaceC1495580p1Q interfaceC1495580p1Q) {
        long jCurrentTimeMillis;
        long j;
        super.responseHeadersStart(interfaceC1495580p1Q);
        if (this.needToDeal) {
            this.responseHeadersStartTime = System.currentTimeMillis();
            if (this.requestBodyEndTime != 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
                j = this.requestBodyEndTime;
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
                j = this.requestHeadersEndTime;
            }
            OkHttpRecord okHttpRecord = this.okHttpRecord;
            okHttpRecord.timeDetailedDuration.ttfb = (int) (jCurrentTimeMillis - j);
            okHttpRecord.timeRequest.response_recv_time = System.currentTimeMillis();
        }
        AbstractC1494940p0O abstractC1494940p0O = this.originListener;
        if (abstractC1494940p0O != null) {
            abstractC1494940p0O.responseHeadersStart(interfaceC1495580p1Q);
        }
    }

    @Override // X.AbstractC1494940p0O
    public void secureConnectStart(InterfaceC1495580p1Q interfaceC1495580p1Q) {
        super.secureConnectStart(interfaceC1495580p1Q);
        if (this.needToDeal) {
            this.okHttpRecord.timeDetailedDuration.tcp = (int) (System.currentTimeMillis() - this.connectStartTime);
            this.secureConnectStartTime = System.currentTimeMillis();
        }
        AbstractC1494940p0O abstractC1494940p0O = this.originListener;
        if (abstractC1494940p0O != null) {
            abstractC1494940p0O.secureConnectStart(interfaceC1495580p1Q);
        }
    }

    @Override // X.AbstractC1494940p0O
    public void callFailed(InterfaceC1495580p1Q interfaceC1495580p1Q, IOException iOException) {
        super.callFailed(interfaceC1495580p1Q, iOException);
        AbstractC1494940p0O abstractC1494940p0O = this.originListener;
        if (abstractC1494940p0O != null) {
            abstractC1494940p0O.callFailed(interfaceC1495580p1Q, iOException);
        }
        record();
    }

    @Override // X.AbstractC1494940p0O
    public void connectionAcquired(InterfaceC1495580p1Q interfaceC1495580p1Q, InterfaceC1495030p0X interfaceC1495030p0X) {
        super.connectionAcquired(interfaceC1495580p1Q, interfaceC1495030p0X);
        AbstractC1494940p0O abstractC1494940p0O = this.originListener;
        if (abstractC1494940p0O != null) {
            abstractC1494940p0O.connectionAcquired(interfaceC1495580p1Q, interfaceC1495030p0X);
        }
        if (this.needToDeal) {
            if (this.dnsStartTime == 0) {
                this.okHttpRecord.socketInfo.socketReused = true;
            } else {
                this.okHttpRecord.socketInfo.socketReused = false;
            }
        }
    }

    @Override // X.AbstractC1494940p0O
    public void connectionReleased(InterfaceC1495580p1Q interfaceC1495580p1Q, InterfaceC1495030p0X interfaceC1495030p0X) {
        super.connectionReleased(interfaceC1495580p1Q, interfaceC1495030p0X);
        AbstractC1494940p0O abstractC1494940p0O = this.originListener;
        if (abstractC1494940p0O != null) {
            abstractC1494940p0O.connectionReleased(interfaceC1495580p1Q, interfaceC1495030p0X);
        }
    }

    @Override // X.AbstractC1494940p0O
    public void dnsStart(InterfaceC1495580p1Q interfaceC1495580p1Q, String str) {
        super.dnsStart(interfaceC1495580p1Q, str);
        if (this.needToDeal) {
            this.dnsStartTime = System.currentTimeMillis();
        }
        AbstractC1494940p0O abstractC1494940p0O = this.originListener;
        if (abstractC1494940p0O != null) {
            abstractC1494940p0O.dnsStart(interfaceC1495580p1Q, str);
        }
    }

    @Override // X.AbstractC1494940p0O
    public void requestBodyEnd(InterfaceC1495580p1Q interfaceC1495580p1Q, long j) {
        super.requestBodyEnd(interfaceC1495580p1Q, j);
        if (this.needToDeal) {
            this.requestBodyEndTime = System.currentTimeMillis();
            this.okHttpRecord.timeDetailedDuration.send = (int) (System.currentTimeMillis() - this.requestHeadersStartTime);
        }
        AbstractC1494940p0O abstractC1494940p0O = this.originListener;
        if (abstractC1494940p0O != null) {
            abstractC1494940p0O.requestBodyEnd(interfaceC1495580p1Q, j);
        }
        if (this.needToDeal) {
            this.okHttpRecord.recordResponse.sent_bytes += j;
        }
    }

    @Override // X.AbstractC1494940p0O
    public void requestHeadersEnd(InterfaceC1495580p1Q interfaceC1495580p1Q, Request request) {
        super.requestHeadersEnd(interfaceC1495580p1Q, request);
        if (this.needToDeal) {
            this.requestHeadersEndTime = System.currentTimeMillis();
            this.okHttpRecord.timeDetailedDuration.send = (int) (System.currentTimeMillis() - this.requestHeadersStartTime);
        }
        AbstractC1494940p0O abstractC1494940p0O = this.originListener;
        if (abstractC1494940p0O != null) {
            abstractC1494940p0O.requestHeadersEnd(interfaceC1495580p1Q, request);
        }
        String strHeader = request.header("User-Agent");
        String str = sIgnoreMonitorLabel;
        if (str != null && strHeader != null && strHeader.contains(str)) {
            this.needToDeal = false;
        }
        if (this.needToDeal) {
            this.okHttpRecord.recordResponse.sent_bytes += request.headers().LIZ();
            this.url = request.url().LJIIIIZZ;
            this.requestHeader = getHeaders(request.headers());
        }
    }

    @Override // X.AbstractC1494940p0O
    public void responseBodyEnd(InterfaceC1495580p1Q interfaceC1495580p1Q, long j) {
        super.responseBodyEnd(interfaceC1495580p1Q, j);
        AbstractC1494940p0O abstractC1494940p0O = this.originListener;
        if (abstractC1494940p0O != null) {
            abstractC1494940p0O.responseBodyEnd(interfaceC1495580p1Q, j);
        }
        if (this.needToDeal) {
            OkHttpRecord okHttpRecord = this.okHttpRecord;
            okHttpRecord.recordResponse.received_bytes += j;
            okHttpRecord.timeDetailedDuration.body_recv = (int) (System.currentTimeMillis() - this.responseBodyStartTime);
        }
    }

    @Override // X.AbstractC1494940p0O
    public void responseHeadersEnd(InterfaceC1495580p1Q interfaceC1495580p1Q, C0XLY c0xly) {
        super.responseHeadersEnd(interfaceC1495580p1Q, c0xly);
        AbstractC1494940p0O abstractC1494940p0O = this.originListener;
        if (abstractC1494940p0O != null) {
            abstractC1494940p0O.responseHeadersEnd(interfaceC1495580p1Q, c0xly);
        }
        if (this.needToDeal) {
            this.okHttpRecord.timeDetailedDuration.header_recv = (int) (System.currentTimeMillis() - this.responseHeadersStartTime);
            OkHttpRecord.RecordResponse recordResponse = this.okHttpRecord.recordResponse;
            recordResponse.code = c0xly.LLILLL;
            recordResponse.received_bytes += c0xly.LLILZLL.LIZ();
            this.okHttpRecord.recordResponse.network_accessed = C786970Utz.LIZ(C792400V6o.LIZ);
            this.okHttpRecord.headerRequest.x_tt_trace_id = c0xly.LIZ("x-tt-trace-id", "");
            this.okHttpRecord.headerRequest.x_tt_trace_host = c0xly.LIZ("x-tt-trace-host", "");
            this.okHttpRecord.headerRequest.x_tt_trace_tag = c0xly.LIZ("x-tt-trace-tag", "");
            this.okHttpRecord.headerRequest.x_tt_content_encoding = c0xly.LIZ("x-tt-content-encoding", "");
            try {
                dealSpecialHeader(c0xly);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            this.responseHeader = getHeaders(c0xly.LLILZLL);
        }
    }

    @Override // X.AbstractC1494940p0O
    public void secureConnectEnd(InterfaceC1495580p1Q interfaceC1495580p1Q, C1495740p1g c1495740p1g) {
        super.secureConnectEnd(interfaceC1495580p1Q, c1495740p1g);
        if (this.needToDeal) {
            this.okHttpRecord.timeDetailedDuration.ssl = (int) (System.currentTimeMillis() - this.secureConnectStartTime);
        }
        AbstractC1494940p0O abstractC1494940p0O = this.originListener;
        if (abstractC1494940p0O != null) {
            abstractC1494940p0O.secureConnectEnd(interfaceC1495580p1Q, c1495740p1g);
        }
    }

    @Override // X.AbstractC1494940p0O
    public void connectStart(InterfaceC1495580p1Q interfaceC1495580p1Q, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(interfaceC1495580p1Q, inetSocketAddress, proxy);
        if (this.needToDeal) {
            this.connectStartTime = System.currentTimeMillis();
        }
        AbstractC1494940p0O abstractC1494940p0O = this.originListener;
        if (abstractC1494940p0O != null) {
            abstractC1494940p0O.connectStart(interfaceC1495580p1Q, inetSocketAddress, proxy);
        }
    }

    @Override // X.AbstractC1494940p0O
    public void dnsEnd(InterfaceC1495580p1Q interfaceC1495580p1Q, String str, List<InetAddress> list) {
        super.dnsEnd(interfaceC1495580p1Q, str, list);
        AbstractC1494940p0O abstractC1494940p0O = this.originListener;
        if (abstractC1494940p0O != null) {
            abstractC1494940p0O.dnsEnd(interfaceC1495580p1Q, str, list);
        }
        if (this.needToDeal) {
            this.okHttpRecord.timeDetailedDuration.dns = (int) (System.currentTimeMillis() - this.dnsStartTime);
            if (list != null && list.size() > 0) {
                for (InetAddress inetAddress : list) {
                    OkHttpRecord.DnsInfo dnsInfo = new OkHttpRecord.DnsInfo();
                    dnsInfo.address = C2204961BRm.d0(inetAddress, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv++tWr+hvkQRsqKnWacPO7uXh/Xd50rhu14BUym1F7ww5tQePYQWPsSBo+SIFc+YYVEQ==", null));
                    this.okHttpRecord.addressList.add(dnsInfo);
                }
            }
        }
    }

    @Override // X.AbstractC1494940p0O
    public void connectEnd(InterfaceC1495580p1Q interfaceC1495580p1Q, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC847200XLi enumC847200XLi) {
        boolean z;
        super.connectEnd(interfaceC1495580p1Q, inetSocketAddress, proxy, enumC847200XLi);
        AbstractC1494940p0O abstractC1494940p0O = this.originListener;
        if (abstractC1494940p0O != null) {
            abstractC1494940p0O.connectEnd(interfaceC1495580p1Q, inetSocketAddress, proxy, enumC847200XLi);
        }
        if (this.needToDeal) {
            OkHttpRecord.RecordResponse recordResponse = this.okHttpRecord.recordResponse;
            if (proxy.address() != null) {
                z = true;
            } else {
                z = false;
            }
            recordResponse.via_Proxy = z;
            if (inetSocketAddress != null && inetSocketAddress.getAddress() != null) {
                this.okHttpRecord.socketInfo.remote = C2204961BRm.d0(inetSocketAddress.getAddress(), new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv++tWr+hvkQRsqKnWacPO7uXh/Xd50rhu14BUym1F7ww5tQePYQWPsSBo+SIFc+YYVEQ==", null)) + ":" + inetSocketAddress.getPort();
                this.okHttpRecord.socketInfo.host = C2204961BRm.d0(inetSocketAddress.getAddress(), new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv++tWr+hvkQRsqKnWacPO7uXh/Xd50rhu14BUym1F7ww5tQePYQWPsSBo+SIFc+YYVEQ==", null));
                this.okHttpRecord.socketInfo.port = inetSocketAddress.getPort() + "";
            }
        }
    }

    @Override // X.AbstractC1494940p0O
    public void connectFailed(InterfaceC1495580p1Q interfaceC1495580p1Q, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC847200XLi enumC847200XLi, IOException iOException) {
        super.connectFailed(interfaceC1495580p1Q, inetSocketAddress, proxy, enumC847200XLi, iOException);
        AbstractC1494940p0O abstractC1494940p0O = this.originListener;
        if (abstractC1494940p0O != null) {
            abstractC1494940p0O.connectFailed(interfaceC1495580p1Q, inetSocketAddress, proxy, enumC847200XLi, iOException);
        }
    }
}
