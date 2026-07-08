package com.bytedance.vmsdk.net;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class Response {
    public final String TAG = "Response";
    public final byte[] body;
    public ReadableMap headers;
    public final String mimeType;
    public final int status;
    public final String url;

    public static native long nativeCreateResponse(Response response);

    public byte[] getBodyBytes() {
        return this.body;
    }

    public ReadableMap getHeaders() {
        return this.headers;
    }

    public int getStatusCode() {
        return this.status;
    }

    public String getUrl() {
        return this.url;
    }

    public byte[] getBodyBytesInternal(InputStream inputStream) {
        int i;
        byte[] bArr = new byte[1024];
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            do {
                i = inputStream.read(bArr, 0, 1024);
                if (i > 0) {
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            } while (i > 0);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public Response(String str, int i, Map map, InputStream inputStream, String str2) {
        if (str != null) {
            if (i >= 200) {
                this.url = str;
                this.status = i;
                this.mimeType = str2;
                this.headers = JavaOnlyMap.from(map);
                if (inputStream == null) {
                    this.body = null;
                    return;
                } else {
                    this.body = getBodyBytesInternal(inputStream);
                    return;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid status code: ");
            sbLIZ.append(i);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new IllegalArgumentException("url == null");
    }
}
