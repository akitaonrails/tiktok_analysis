package com.bytedance.vmsdk.net;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class Request {
    public InputStream body;
    public Map<String, String> headers;
    public String method;
    public String url;

    public String getBodyString() {
        int i;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
        do {
            try {
                i = this.body.read(bArr, 0, SpeechEngineDefines.TTS_WORK_MODE_BOTH);
                if (i > 0) {
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                return "";
            }
        } while (i > 0);
        return byteArrayOutputStream.toString();
    }

    public InputStream getBody() {
        return this.body;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public String getMethod() {
        return this.method;
    }

    public String getUrl() {
        return this.url;
    }

    public Request(String str, JSONObject jSONObject, byte[] bArr) {
        String string;
        ByteArrayInputStream byteArrayInputStream;
        try {
            this.url = str;
            if (jSONObject.has("method")) {
                string = JSONObjectProtectorUtils.getString(jSONObject, "method");
            } else {
                string = "GET";
            }
            this.method = string;
            if (bArr != null && bArr.length != 0) {
                this.body = new ByteArrayInputStream(bArr);
            } else {
                if (jSONObject.has("body")) {
                    byteArrayInputStream = new ByteArrayInputStream(JSONObjectProtectorUtils.getString(jSONObject, "body").getBytes());
                } else {
                    byteArrayInputStream = null;
                }
                this.body = byteArrayInputStream;
            }
            JSONObject jSONObject2 = (JSONObject) jSONObject.opt("headers");
            this.headers = new HashMap();
            if (jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    this.headers.put(next, JSONObjectProtectorUtils.getString(jSONObject2, next));
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
