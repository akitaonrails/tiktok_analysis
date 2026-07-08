package com.bytedance.hybrid.spark.raven.model;

import X.C08S6;
import X.C1161310gKH;
import X.C2188811AlT;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes19.dex */
public class BaseResponse extends C08S6 {
    public int error_code;
    public ServerTimeExtra extra;
    public Map<String, String> extraMap;
    public Map<String, Object> mLocalExtra;
    public String message;
    public String prompts;
    public int status_code;
    public String status_msg;

    public static class ServerTimeExtra {

        /* JADX INFO: renamed from: dc, reason: collision with root package name */
        public String f329dc;
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
            sbLIZ.append(this.f329dc);
            sbLIZ.append('\'');
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0gKI, java.lang.Throwable] */
    private void checkStatusCode() {
        if (this.status_code == 0) {
            return;
        }
        final int i = this.status_code;
        ?? r1 = new C1161310gKH(i) { // from class: X.0gKI
            public static Gson LLIZLLLIL;
            public Object LLILLJJLI;
            public String LLILLL;
            public String LLILZ;
            public String LLILZIL;
            public int LLILZLL;
            public String LLIZ;

            public String convertResponseToString() {
                Object obj = this.LLILLJJLI;
                if (obj instanceof String) {
                    return (String) obj;
                }
                if (LLIZLLLIL == null) {
                    LLIZLLLIL = new Gson();
                }
                String json = GsonProtectorUtils.toJson(LLIZLLLIL, this.LLILLJJLI);
                this.LLILLJJLI = json;
                return json;
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                if (getPath() == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ApiServerException,error code is ");
                    sbLIZ.append(getErrorCode());
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ApiServerException,error code is ");
                sbLIZ2.append(getErrorCode());
                sbLIZ2.append(";request path :");
                sbLIZ2.append(getPath());
                return C2188811AlT.LIZIZ(sbLIZ2);
            }

            public String getResponse() {
                return convertResponseToString();
            }

            public int getBlockCode() {
                return this.LLILZLL;
            }

            public String getErrorMsg() {
                return this.LLILLL;
            }

            public String getPath() {
                return this.LLIZ;
            }

            public String getPrompt() {
                return this.LLILZ;
            }

            public Object getRawResponse() {
                return this.LLILLJJLI;
            }

            public String getUrl() {
                return this.LLILZIL;
            }

            public void setBlockCode(int i2) {
                this.LLILZLL = i2;
            }

            public C1161320gKI setErrorMsg(String str) {
                this.LLILLL = str;
                return this;
            }

            public void setPath(String str) {
                this.LLIZ = str;
            }

            public C1161320gKI setPrompt(String str) {
                this.LLILZ = str;
                return this;
            }

            public C1161320gKI setResponse(Object obj) {
                this.LLILLJJLI = obj;
                return this;
            }

            public C1161320gKI setUrl(String str) {
                this.LLILZIL = str;
                return this;
            }

            public C1161320gKI setResponse(String str) {
                this.LLILLJJLI = str;
                return this;
            }
        };
        r1.setErrorMsg(this.status_msg);
        r1.setPrompt(this.prompts);
        r1.setResponse(this);
        throw r1;
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
    @Override // X.C08S6
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
