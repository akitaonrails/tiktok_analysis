package com.bytedance.apm.agent.instrumentation.okhttp3;

import X.AbstractC842510X3h;
import X.AbstractC842530X3j;
import X.C0X0X;
import X.C0X7A;
import X.C0XLY;
import X.C2188811AlT;
import X.C792400V6o;
import com.bytedance.apm.agent.instrumentation.transaction.TransactionData;
import com.bytedance.apm.agent.instrumentation.transaction.TxState;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import okhttp3.Request;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class MonitorRecorder {
    public static void reportExceptionMonitor(TxState txState, Exception exc) {
    }

    public static void recordRequest(Request request, TxState txState) {
        if (request != null && txState != null) {
            txState.addAssistData("NetworkLib", "OkHttp3");
            txState.setUrl(request.url().LJIIIIZZ);
            txState.setMethod(request.method());
            txState.setStartTime(System.currentTimeMillis());
            txState.setCarrier("");
            txState.setWanType("");
            AbstractC842530X3j abstractC842530X3jBody = request.body();
            if (abstractC842530X3jBody != null) {
                if (abstractC842530X3jBody instanceof C0X0X) {
                    txState.setBytesSent(abstractC842530X3jBody.LIZ());
                } else {
                    if (!(abstractC842530X3jBody instanceof C0X7A)) {
                        return;
                    }
                    try {
                        txState.setBytesSent(abstractC842530X3jBody.LIZ());
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
    }

    public static void recordResponse(C0XLY c0xly, TxState txState) {
        if (c0xly != null && txState != null) {
            txState.setStatusCode(c0xly.LLILLL);
            AbstractC842510X3h abstractC842510X3h = c0xly.LLIZ;
            if (abstractC842510X3h != null) {
                txState.setBytesReceived(abstractC842510X3h.contentLength());
            }
        }
    }

    public static void reportMonitorData(TxState txState, String str) {
        long startTime;
        if (txState == null) {
            return;
        }
        TransactionData transactionDataEnd = txState.end();
        if (C792400V6o.LJIIIIZZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("auto plugin, reportMonitorData: ");
            sbLIZ.append(transactionDataEnd.toString());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("sent_bytes", transactionDataEnd.getBytesSent());
            jSONObject2.put("received_bytes", transactionDataEnd.getBytesReceived());
            jSONObject.put("response", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("request_log", jSONObject);
            jSONObject3.put("net_consume_type", str);
            long totalTime = transactionDataEnd.getTotalTime();
            if (txState.getStartTime() == 0) {
                startTime = transactionDataEnd.getRequestStart();
            } else {
                startTime = txState.getStartTime();
            }
            MonitorTool.monitorSLA(totalTime, startTime, transactionDataEnd.getUrl(), "", "", transactionDataEnd.getStatusCode(), jSONObject3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void reportMonitorData(TxState txState, C0XLY c0xly) {
        if (txState != null && c0xly != null) {
            reportMonitorData(txState, "okhttp");
        }
    }
}
