package com.ss.android.ugc.aweme.base.api;

import X.AbstractC2126608Uu;
import X.C0XIR;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes31.dex */
public class BaseResponse extends AbstractC2126608Uu {
    public int error_code;
    public ServerTimeExtra extra;
    public Map<String, String> extraMap;
    public Map<String, Object> mLocalExtra;
    public String message;
    public String prompts;
    public int status_code;
    public String status_msg;

    /* JADX INFO: loaded from: classes19.dex */
    public static class ServerTimeExtra {

        /* JADX INFO: renamed from: dc, reason: collision with root package name */
        public String f335dc;
        public String logid;
        public long now;
        public long server_stream_time;

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("{now=");
            sbLIZ.append(this.now);
            sbLIZ.append(", logid='");
            sbLIZ.append(this.logid);
            sbLIZ.append('\'');
            sbLIZ.append(", server_stream_time ='");
            sbLIZ.append(this.server_stream_time);
            sbLIZ.append('\'');
            sbLIZ.append(", dc ='");
            sbLIZ.append(this.f335dc);
            sbLIZ.append('\'');
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    private void checkStatusCode() {
        if (this.status_code == 0) {
            return;
        }
        C0XIR c0xir = new C0XIR(this.status_code);
        c0xir.setErrorMsg(this.status_msg);
        c0xir.setPrompt(this.prompts);
        c0xir.setResponse(this);
        throw c0xir;
    }

    public Map<String, Object> getLocalExtra() {
        if (this.mLocalExtra == null) {
            synchronized (this) {
                try {
                    if (this.mLocalExtra == null) {
                        this.mLocalExtra = new ConcurrentHashMap(4);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.mLocalExtra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC2126608Uu
    public <T> T checkValid() {
        checkStatusCode();
        super.checkValid();
        return this;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseResponse{status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(", message='");
        sbLIZ.append(this.message);
        sbLIZ.append('\'');
        sbLIZ.append(", status_msg='");
        sbLIZ.append(this.status_msg);
        sbLIZ.append('\'');
        sbLIZ.append(", prompts='");
        sbLIZ.append(this.prompts);
        sbLIZ.append('\'');
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
