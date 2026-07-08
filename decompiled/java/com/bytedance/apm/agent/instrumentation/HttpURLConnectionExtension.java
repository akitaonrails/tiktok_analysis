package com.bytedance.apm.agent.instrumentation;

import com.bytedance.apm.agent.instrumentation.io.CInputStream;
import com.bytedance.apm.agent.instrumentation.io.CountingOutputStream;
import com.bytedance.apm.agent.instrumentation.io.StreamCompleteEvent;
import com.bytedance.apm.agent.instrumentation.io.StreamCompleteListener;
import com.bytedance.apm.agent.instrumentation.okhttp3.MonitorRecorder;
import com.bytedance.apm.agent.instrumentation.transaction.TxState;
import com.bytedance.apm.agent.logging.AgentLog;
import com.bytedance.apm.agent.logging.AgentLogManager;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class HttpURLConnectionExtension extends HttpURLConnection {
    public static final AgentLog log = AgentLogManager.getAgentLog();
    public HttpURLConnection impl;
    public TxState transactionState;

    private TxState getTransactionState() {
        if (this.transactionState == null) {
            TxState txState = new TxState();
            this.transactionState = txState;
            TransactionStateUtil.inspectAndInstrument(txState, this.impl);
        }
        return this.transactionState;
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        TxState txState = this.transactionState;
        if (txState != null && !txState.isComplete()) {
            addTransactionAndErrorData(this.transactionState);
        }
        this.impl.disconnect();
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.impl.getAllowUserInteraction();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.impl.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.impl.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.impl.getDoInput();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.impl.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.impl.getInstanceFollowRedirects();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.impl.getPermission();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.impl.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.impl.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.impl.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.impl.getURL();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.impl.getUseCaches();
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.impl.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.impl.usingProxy();
    }

    private void checkResponse() {
        if (getTransactionState().isComplete()) {
            return;
        }
        TransactionStateUtil.inspectAndInstrumentResponse(getTransactionState(), this.impl);
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
        getTransactionState();
        try {
            this.impl.connect();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            error(e);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public Object getContent() throws IOException {
        getTransactionState();
        try {
            Object content = this.impl.getContent();
            int contentLength = this.impl.getContentLength();
            if (contentLength >= 0) {
                TxState transactionState = getTransactionState();
                if (!transactionState.isComplete()) {
                    transactionState.setBytesReceived(contentLength);
                    addTransactionAndErrorData(transactionState);
                }
            }
            return content;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            error(e);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        getTransactionState();
        String contentEncoding = this.impl.getContentEncoding();
        checkResponse();
        return contentEncoding;
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        getTransactionState();
        int contentLength = this.impl.getContentLength();
        checkResponse();
        return contentLength;
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        getTransactionState();
        String contentType = this.impl.getContentType();
        checkResponse();
        return contentType;
    }

    @Override // java.net.URLConnection
    public long getDate() {
        getTransactionState();
        long date = this.impl.getDate();
        checkResponse();
        return date;
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        getTransactionState();
        try {
            return new CInputStream(this.impl.getErrorStream(), true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            log.error(e.toString());
            return this.impl.getErrorStream();
        }
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        getTransactionState();
        long expiration = this.impl.getExpiration();
        checkResponse();
        return expiration;
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        getTransactionState();
        Map<String, List<String>> headerFields = this.impl.getHeaderFields();
        checkResponse();
        return headerFields;
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        getTransactionState();
        long ifModifiedSince = this.impl.getIfModifiedSince();
        checkResponse();
        return ifModifiedSince;
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() throws IOException {
        final TxState transactionState = getTransactionState();
        try {
            CInputStream cInputStream = new CInputStream(this.impl.getInputStream());
            TransactionStateUtil.inspectAndInstrumentResponse(transactionState, this.impl);
            cInputStream.addStreamCompleteListener(new StreamCompleteListener() { // from class: com.bytedance.apm.agent.instrumentation.HttpURLConnectionExtension.1
                @Override // com.bytedance.apm.agent.instrumentation.io.StreamCompleteListener
                public void streamComplete(StreamCompleteEvent streamCompleteEvent) {
                    if (!transactionState.isComplete()) {
                        long contentLength = HttpURLConnectionExtension.this.impl.getContentLength();
                        long bytes = streamCompleteEvent.getBytes();
                        if (contentLength < 0) {
                            contentLength = bytes;
                        }
                        transactionState.setBytesReceived(contentLength);
                        HttpURLConnectionExtension.this.addTransactionAndErrorData(transactionState);
                    }
                }

                @Override // com.bytedance.apm.agent.instrumentation.io.StreamCompleteListener
                public void streamError(StreamCompleteEvent streamCompleteEvent) {
                    if (!transactionState.isComplete()) {
                        transactionState.setBytesReceived(streamCompleteEvent.getBytes());
                    }
                    HttpURLConnectionExtension.this.error(streamCompleteEvent.getException());
                }
            });
            return cInputStream;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            error(e);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        getTransactionState();
        long lastModified = this.impl.getLastModified();
        checkResponse();
        return lastModified;
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() throws IOException {
        final TxState transactionState = getTransactionState();
        try {
            CountingOutputStream countingOutputStream = new CountingOutputStream(this.impl.getOutputStream());
            countingOutputStream.addStreamCompleteListener(new StreamCompleteListener() { // from class: com.bytedance.apm.agent.instrumentation.HttpURLConnectionExtension.2
                @Override // com.bytedance.apm.agent.instrumentation.io.StreamCompleteListener
                public void streamComplete(StreamCompleteEvent streamCompleteEvent) {
                    if (!transactionState.isComplete()) {
                        String requestProperty = HttpURLConnectionExtension.this.impl.getRequestProperty("content-length");
                        long bytes = streamCompleteEvent.getBytes();
                        if (requestProperty != null) {
                            try {
                                bytes = CastLongProtector.parseLong(requestProperty);
                            } catch (NumberFormatException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        transactionState.setBytesSent(bytes);
                        HttpURLConnectionExtension.this.addTransactionAndErrorData(transactionState);
                    }
                }

                @Override // com.bytedance.apm.agent.instrumentation.io.StreamCompleteListener
                public void streamError(StreamCompleteEvent streamCompleteEvent) {
                    if (!transactionState.isComplete()) {
                        transactionState.setBytesSent(streamCompleteEvent.getBytes());
                    }
                    HttpURLConnectionExtension.this.error(streamCompleteEvent.getException());
                }
            });
            return countingOutputStream;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            error(e);
            throw e;
        }
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() throws IOException {
        getTransactionState();
        try {
            int responseCode = this.impl.getResponseCode();
            checkResponse();
            return responseCode;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            error(e);
            throw e;
        }
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() throws IOException {
        getTransactionState();
        try {
            String responseMessage = this.impl.getResponseMessage();
            checkResponse();
            return responseMessage;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            error(e);
            throw e;
        }
    }

    public HttpURLConnectionExtension(HttpURLConnection httpURLConnection) {
        super(httpURLConnection.getURL());
        this.impl = httpURLConnection;
    }

    public void addTransactionAndErrorData(TxState txState) {
        MonitorRecorder.reportMonitorData(txState, "httpurlconnection");
    }

    public void error(Exception exc) {
        TxState transactionState = getTransactionState();
        TransactionStateUtil.setErrorCodeFromException(transactionState, exc);
        if (!transactionState.isComplete()) {
            TransactionStateUtil.inspectAndInstrumentResponse(transactionState, this.impl);
            MonitorRecorder.reportMonitorData(transactionState, "httpurlconnection");
        }
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) throws IOException {
        getTransactionState();
        try {
            Object content = this.impl.getContent(clsArr);
            checkResponse();
            return content;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            error(e);
            throw e;
        }
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i) {
        getTransactionState();
        String headerField = this.impl.getHeaderField(i);
        checkResponse();
        return headerField;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i) {
        getTransactionState();
        String headerFieldKey = this.impl.getHeaderFieldKey(i);
        checkResponse();
        return headerFieldKey;
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.impl.getRequestProperty(str);
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z) {
        this.impl.setAllowUserInteraction(z);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i) {
        this.impl.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i) {
        this.impl.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z) {
        this.impl.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z) {
        this.impl.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z) {
        this.impl.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i) {
        this.impl.setFixedLengthStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j) {
        this.impl.setIfModifiedSince(j);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z) {
        this.impl.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i) {
        this.impl.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) throws ProtocolException {
        getTransactionState();
        try {
            this.impl.setRequestMethod(str);
        } catch (ProtocolException e) {
            TryCatchGuardChecker.doCheck(e);
            error(e);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z) {
        this.impl.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        getTransactionState();
        String headerField = this.impl.getHeaderField(str);
        checkResponse();
        return headerField;
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.impl.addRequestProperty(str, str2);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j) {
        getTransactionState();
        long headerFieldDate = this.impl.getHeaderFieldDate(str, j);
        checkResponse();
        return headerFieldDate;
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i) {
        getTransactionState();
        int headerFieldInt = this.impl.getHeaderFieldInt(str, i);
        checkResponse();
        return headerFieldInt;
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.impl.setRequestProperty(str, str2);
    }
}
