package com.bytedance.apm.agent.instrumentation.transaction;

import X.C08FF;
import X.C2188811AlT;
import com.bytedance.apm.agent.logging.AgentLog;
import com.bytedance.apm.agent.logging.AgentLogManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class TxState {
    public static final AgentLog AGENT_LOG = AgentLogManager.getAgentLog();
    public long mBytesReceived;
    public long mBytesSent;
    public long mEndTime;
    public int mErrorCode;
    public String mHttpMethod;
    public String mRawUrl;
    public long mStartTime;
    public int mStatusCode;
    public TransactionData mTransactionData;
    public String mUrl;
    public String mCarrier = "unknown";
    public String mWanType = "unknown";
    public State mState = State.IS_READY;
    public JSONObject mExtraData = new JSONObject();

    private TransactionData toTransactionData() {
        if (!isComplete()) {
            AGENT_LOG.warning("toTransactionData is called on incomplete TransactionState");
        }
        String str = this.mUrl;
        if (str == null) {
            AGENT_LOG.error("Attempts to convert TransactionData TransactionState instance without URL into TransactionData TransactionData");
            return null;
        }
        if (this.mTransactionData == null) {
            TransactionData transactionData = new TransactionData(str, this.mCarrier, this.mEndTime - this.mStartTime, this.mStatusCode, this.mErrorCode, this.mBytesSent, this.mBytesReceived, this.mWanType, this.mHttpMethod, this.mExtraData);
            this.mTransactionData = transactionData;
            transactionData.setErrorCode(this.mErrorCode);
            this.mTransactionData.setRequestEnd(this.mEndTime);
        }
        return this.mTransactionData;
    }

    public boolean isComplete() {
        return this.mState.ordinal() >= State.IS_COMPLETE.ordinal();
    }

    public boolean isSent() {
        return this.mState.ordinal() >= State.IS_SENT.ordinal();
    }

    public TransactionData end() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.mStartTime);
        sbLIZ.append("");
        addAssistData("startTime", C2188811AlT.LIZIZ(sbLIZ));
        if (isComplete()) {
            return toTransactionData();
        }
        this.mState = State.IS_COMPLETE;
        this.mEndTime = System.currentTimeMillis();
        return toTransactionData();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" StartTime ");
        sbLIZ.append(this.mStartTime);
        sbLIZ.append(" BytesReceived ");
        sbLIZ.append(this.mBytesReceived);
        sbLIZ.append(" BytesSent ");
        sbLIZ.append(this.mBytesSent);
        sbLIZ.append(" Url ");
        sbLIZ.append(this.mUrl);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public long getReceivedBytes() {
        return this.mBytesReceived;
    }

    public long getStartTime() {
        return this.mStartTime;
    }

    public int getStatusCode() {
        return this.mStatusCode;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public enum State {
        IS_READY,
        IS_SENT,
        IS_COMPLETE;

        public static State valueOf(String str) {
            return (State) C08FF.LIZ(State.class, str);
        }
    }

    public void setBytesReceived(long j) {
        if (isComplete()) {
            AgentLog agentLog = AGENT_LOG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setBytesReceived is called on TransactionState in ");
            sbLIZ.append(this.mState);
            sbLIZ.append(" state");
            agentLog.warning(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.mBytesReceived = j;
    }

    public void setBytesSent(long j) {
        if (isComplete()) {
            AgentLog agentLog = AGENT_LOG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setBytesSent(...) called on TransactionState in ");
            sbLIZ.append(this.mState.toString());
            sbLIZ.append(" state");
            agentLog.warning(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.mBytesSent = j;
        this.mState = State.IS_SENT;
    }

    public void setCarrier(String str) {
        if (!isSent()) {
            this.mCarrier = str;
            return;
        }
        AgentLog agentLog = AGENT_LOG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setCarrier is called on TransactionState in ");
        sbLIZ.append(this.mState);
        sbLIZ.append(" state");
        agentLog.warning(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void setErrorCode(int i) {
        if (isComplete()) {
            TransactionData transactionData = this.mTransactionData;
            if (transactionData != null) {
                transactionData.setErrorCode(i);
            }
            AgentLog agentLog = AGENT_LOG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setErrorCode(...) called on TransactionState in ");
            sbLIZ.append(this.mState.toString());
            sbLIZ.append(" state");
            agentLog.warning(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.mErrorCode = i;
    }

    public void setMethod(String str) {
        if (!isSent()) {
            this.mHttpMethod = str;
            return;
        }
        AgentLog agentLog = AGENT_LOG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setHttpMethod(...) called on TransactionState in ");
        sbLIZ.append(this.mState.toString());
        sbLIZ.append(" state");
        agentLog.warning(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void setStartTime(long j) {
        this.mStartTime = j;
    }

    public void setStatusCode(int i) {
        if (isComplete()) {
            if (this.mStatusCode == 0 && i != 0) {
                this.mStatusCode = i;
            }
            AgentLog agentLog = AGENT_LOG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setStatusCode(...) called on TransactionState in ");
            sbLIZ.append(this.mState.toString());
            sbLIZ.append(" state");
            agentLog.warning(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.mStatusCode = i;
    }

    public void setUrl(String str) {
        if (this.mRawUrl == null) {
            this.mRawUrl = str;
        }
        if (str != null) {
            try {
                URL url = new URL(str);
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(url.getProtocol());
                stringBuffer.append("://");
                stringBuffer.append(url.getHost());
                if (url.getPort() != -1) {
                    stringBuffer.append(":");
                    stringBuffer.append(url.getPort());
                }
                stringBuffer.append(url.getPath());
                String string = stringBuffer.toString();
                if (string != null) {
                    if (isSent()) {
                        AgentLog agentLog = AGENT_LOG;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("setUrl is called on TransactionState in ");
                        sbLIZ.append(this.mState);
                        sbLIZ.append(" state");
                        agentLog.warning(C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    this.mUrl = string;
                }
            } catch (MalformedURLException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public void setWanType(String str) {
        if (!isSent()) {
            this.mWanType = str;
            return;
        }
        AgentLog agentLog = AGENT_LOG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setWanType(...) called on TransactionState in ");
        sbLIZ.append(this.mState.toString());
        sbLIZ.append(" state");
        agentLog.warning(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void addAssistData(String str, String str2) {
        if (isComplete()) {
            AgentLog agentLog = AGENT_LOG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addAssistData(...) called on TransactionState in ");
            sbLIZ.append(this.mState.toString());
            sbLIZ.append(" state");
            agentLog.warning(C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            this.mExtraData.put(str, str2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            AGENT_LOG.error("Caught error while addAssistData: ", e);
        }
    }
}
