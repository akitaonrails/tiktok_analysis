package com.bytedance.apm.agent.instrumentation;

import com.bytedance.apm.agent.instrumentation.transaction.TxState;
import com.bytedance.apm.agent.logging.AgentLog;
import com.bytedance.apm.agent.logging.AgentLogManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: loaded from: classes14.dex */
public class TransactionStateUtil {
    public static final AgentLog log = AgentLogManager.getAgentLog();

    public static void inspectAndInstrument(TxState txState, HttpURLConnection httpURLConnection) {
        txState.setUrl(httpURLConnection.getURL().toString());
        txState.setStartTime(System.currentTimeMillis());
        txState.setCarrier("");
    }

    public static void inspectAndInstrumentResponse(TxState txState, HttpURLConnection httpURLConnection) {
        int responseCode;
        int contentLength = httpURLConnection.getContentLength();
        if (contentLength >= 0) {
            txState.setBytesReceived(contentLength);
        }
        try {
            responseCode = httpURLConnection.getResponseCode();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            responseCode = 0;
        } catch (NullPointerException e2) {
            TryCatchGuardChecker.doCheck(e2);
            responseCode = 0;
        }
        txState.setStatusCode(responseCode);
    }

    public static void setErrorCodeFromException(TxState txState, Exception exc) {
        if (exc instanceof UnknownHostException) {
            txState.setErrorCode(-10);
            return;
        }
        if (!(exc instanceof SocketTimeoutException) && !(exc instanceof ConnectTimeoutException)) {
            if (exc instanceof ConnectException) {
                txState.setErrorCode(-12);
                return;
            }
            if (exc instanceof MalformedURLException) {
                txState.setErrorCode(-13);
                return;
            } else if (exc instanceof SSLException) {
                txState.setErrorCode(-14);
                return;
            } else {
                txState.setErrorCode(-1);
                return;
            }
        }
        txState.setErrorCode(-11);
    }
}
