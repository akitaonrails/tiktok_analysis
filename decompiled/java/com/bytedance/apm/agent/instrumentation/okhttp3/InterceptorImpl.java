package com.bytedance.apm.agent.instrumentation.okhttp3;

import X.AbstractC842510X3h;
import X.AbstractC842560X3m;
import X.C0X0P;
import X.C0X0W;
import X.C0XLX;
import X.C0XLY;
import X.C1496670p3B;
import X.C1496690p3D;
import X.InterfaceC1496620p36;
import X.InterfaceC836900WsK;
import X.InterfaceC842570X3n;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.transaction.TxState;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import okhttp3.Request;

/* JADX INFO: loaded from: classes14.dex */
public class InterceptorImpl implements InterfaceC836900WsK {

    public class ResponseBodyWrapper extends AbstractC842510X3h {
        public InterfaceC1496620p36 bufferedSource;
        public final C0XLY response;
        public final AbstractC842510X3h responseBody;
        public long totalBytesRead;
        public final TxState transactionState;

        @Override // X.AbstractC842510X3h, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.responseBody.close();
            end();
        }

        @Override // X.AbstractC842510X3h
        public long contentLength() {
            return this.responseBody.contentLength();
        }

        @Override // X.AbstractC842510X3h
        public C0X0P contentType() {
            return this.responseBody.contentType();
        }

        public void end() {
            if (this.transactionState.isComplete()) {
                return;
            }
            this.transactionState.setBytesReceived(this.totalBytesRead);
            MonitorRecorder.reportMonitorData(this.transactionState, this.response);
        }

        @Override // X.AbstractC842510X3h
        public InterfaceC1496620p36 source() {
            if (this.bufferedSource == null) {
                this.bufferedSource = new C1496670p3B(source(this.responseBody.source()));
            }
            return this.bufferedSource;
        }

        private InterfaceC842570X3n source(InterfaceC842570X3n interfaceC842570X3n) {
            return new AbstractC842560X3m(interfaceC842570X3n) { // from class: com.bytedance.apm.agent.instrumentation.okhttp3.InterceptorImpl.ResponseBodyWrapper.1
                @Override // X.AbstractC842560X3m, X.InterfaceC842570X3n, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    super.close();
                    ResponseBodyWrapper.this.end();
                }

                @Override // X.AbstractC842560X3m, X.InterfaceC842570X3n
                public long read(C1496690p3D c1496690p3D, long j) {
                    long j2 = super.read(c1496690p3D, j);
                    if (j2 >= 0) {
                        ResponseBodyWrapper.this.totalBytesRead += j2;
                    }
                    return j2;
                }
            };
        }

        public ResponseBodyWrapper(C0XLY c0xly, TxState txState) {
            this.response = c0xly;
            this.responseBody = c0xly.LLIZ;
            this.transactionState = txState;
        }
    }

    @Override // X.InterfaceC836900WsK
    public C0XLY intercept(C0X0W c0x0w) throws IOException {
        Request request = c0x0w.request();
        String strHeader = request.header("User-Agent");
        if (strHeader != null && strHeader.contains("tt")) {
            return c0x0w.LIZ(request);
        }
        TxState txState = new TxState();
        MonitorRecorder.recordRequest(request, txState);
        try {
            C0XLY c0xlyLIZ = c0x0w.LIZ(request);
            MonitorRecorder.recordResponse(c0xlyLIZ, txState);
            if (txState.getReceivedBytes() < 0 && !TextUtils.isEmpty(c0xlyLIZ.LIZ("Transfer-Encoding", null))) {
                txState.addAssistData("Transfer-Encoding", c0xlyLIZ.LIZ("Transfer-Encoding", null));
                C0XLX c0xlx = new C0XLX(c0xlyLIZ);
                c0xlx.LJI = new ResponseBodyWrapper(c0xlyLIZ, txState);
                return c0xlx.LIZ();
            }
            MonitorRecorder.reportMonitorData(txState, c0xlyLIZ);
            return c0xlyLIZ;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            MonitorRecorder.reportExceptionMonitor(txState, e);
            throw e;
        }
    }
}
